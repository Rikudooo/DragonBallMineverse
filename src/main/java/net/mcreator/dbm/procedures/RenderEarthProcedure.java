package net.mcreator.dbm.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderEarthProcedure {
	private static BufferBuilder bufferBuilder = null;
	private static VertexBuffer vertexBuffer = null;
	private static VertexFormat.Mode mode = null;
	private static VertexFormat format = null;
	private static PoseStack poseStack = null;
	private static Matrix4f projectionMatrix = null;
	private static boolean worldCoordinate = true;
	private static Vec3 offset = Vec3.ZERO;
	private static int currentStage = 0;
	private static int targetStage = 0; // NONE: 0, SKY: 1, WORLD: 2

	private static void add(double x, double y, double z, int color) {
		add(x, y, z, 0.0F, 0.0F, color);
	}

	private static void add(double x, double y, double z, float u, float v, int color) {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (format == DefaultVertexFormat.POSITION_COLOR) {
			bufferBuilder.vertex(x, y, z).color(color).endVertex();
		} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
			bufferBuilder.vertex(x, y, z).uv(u, v).color(color).endVertex();
		}
	}

	private static boolean begin(VertexFormat.Mode mode, VertexFormat format, boolean update) {
		if (RenderEarthProcedure.bufferBuilder == null || !RenderEarthProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (RenderEarthProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					RenderEarthProcedure.mode = mode;
					RenderEarthProcedure.format = format;
					RenderEarthProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderEarthProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					RenderEarthProcedure.mode = mode;
					RenderEarthProcedure.format = format;
					RenderEarthProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderEarthProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
					return true;
				}
			}
		}
		return false;
	}

	private static void clear() {
		if (vertexBuffer != null) {
			vertexBuffer.close();
			vertexBuffer = null;
		}
	}

	private static void end() {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (vertexBuffer != null)
			vertexBuffer.close();
		vertexBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		vertexBuffer.bind();
		vertexBuffer.upload(bufferBuilder.end());
		VertexBuffer.unbind();
	}

	private static void offset(double x, double y, double z) {
		offset = new Vec3(x, y, z);
	}

	private static void release() {
		targetStage = 0;
	}

	private static VertexBuffer shape() {
		return vertexBuffer;
	}

	private static void system(boolean worldCoordinate) {
		RenderEarthProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			RenderEarthProcedure.targetStage = targetStage;
			return true;
		}
		return false;
	}

	private static void renderShape(VertexBuffer vertexBuffer, double x, double y, double z, float yaw, float pitch, float roll, float xScale, float yScale, float zScale, int color) {
		if (currentStage == 0 || currentStage != targetStage)
			return;
		if (poseStack == null || projectionMatrix == null)
			return;
		if (vertexBuffer == null)
			return;
		float i, j, k;
		if (worldCoordinate) {
			Vec3 pos = Minecraft.getInstance().gameRenderer.getMainCamera().getPosition();
			i = (float) (x - pos.x());
			j = (float) (y - pos.y());
			k = (float) (z - pos.z());
		} else {
			i = (float) x;
			j = (float) y;
			k = (float) z;
		}
		poseStack.pushPose();
		poseStack.translate(i, j, k);
		poseStack.mulPose(com.mojang.math.Axis.YN.rotationDegrees(yaw));
		poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(pitch));
		poseStack.mulPose(com.mojang.math.Axis.ZN.rotationDegrees(roll));
		poseStack.scale(xScale, yScale, zScale);
		poseStack.translate(offset.x(), offset.y(), offset.z());
		RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
		vertexBuffer.bind();
		vertexBuffer.drawWithShader(poseStack.last().pose(), projectionMatrix, vertexBuffer.getFormat().hasUV(0) ? GameRenderer.getPositionTexColorShader() : GameRenderer.getPositionColorShader());
		VertexBuffer.unbind();
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void renderLevel(RenderLevelStageEvent event) {
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
			currentStage = 1;
			RenderSystem.depthMask(false);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
			currentStage = 0;
		} else if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
			currentStage = 2;
			RenderSystem.depthMask(true);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
			currentStage = 0;
		}
	}

	private static void renderShapes(RenderLevelStageEvent event) {
		Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;
		Entity entity = minecraft.gameRenderer.getMainCamera().getEntity();
		if (level != null && entity != null) {
			poseStack = event.getPoseStack();
			projectionMatrix = event.getProjectionMatrix();
			Vec3 pos = entity.getPosition(event.getPartialTick());
			RenderSystem.enableBlend();
			RenderSystem.defaultBlendFunc();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			execute(event, entity);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:space"))) {
			if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, true)) {
				add((-0.5), 0.5, 0.5, 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, 0, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, (float) 0.25, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, (float) 0.25, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), (float) 0.25, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), (float) 0.25, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), (-0.5), (float) 0.5, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) 0.5, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) 0.5, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), (-0.5), (float) 0.5, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, (float) 0.75, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, 0.5, (float) 0.75, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, (float) 0.75, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, (float) 0.75, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), 1, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, 0, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), 0, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) 0.25, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, 0.5, (float) 0.25, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), (float) 0.25, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, (float) 0.25, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, (float) 0.5, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), (-0.5), (float) 0.5, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				end();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/earth" + ".png")));
				renderShape(shape(), 100, 160, 100, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 100, 160, 100, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/earth_2" + ".png")));
				renderShape(shape(), 100, 160, 100, 0, 0, 0, 152, 152, 152, 200 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 100, 160, 100, 0, 0, 0, 152, 152, 152, 200 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/earth_3" + ".png")));
				renderShape(shape(), 100, 160, 100, 0, 0, 0, 160, 160, 160, 80 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/namek" + ".png")));
				renderShape(shape(), 2000, 160, 2000, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 2000, 160, 2000, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/namek_2" + ".png")));
				renderShape(shape(), 2000, 160, 2000, 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/yardrat" + ".png")));
				renderShape(shape(), 4500, 160, (-4500), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 4500, 160, (-4500), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/yardrat_2" + ".png")));
				renderShape(shape(), 4500, 160, (-4500), 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/ankoku" + ".png")));
				renderShape(shape(), 3500, 160, (-1000), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 3500, 160, (-1000), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/ankoku_2" + ".png")));
				renderShape(shape(), 3500, 160, (-1000), 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/arcose" + ".png")));
				renderShape(shape(), 2500, 160, (-2500), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 2500, 160, (-2500), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/arcose_2" + ".png")));
				renderShape(shape(), 2500, 160, (-2500), 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/frieza79" + ".png")));
				renderShape(shape(), 3000, 160, 3000, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), 3000, 160, 3000, 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/frieza79_2" + ".png")));
				renderShape(shape(), 3000, 160, 3000, 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/potaufeu" + ".png")));
				renderShape(shape(), (-1000), 160, (-1000), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				RenderSystem.disableCull();
				renderShape(shape(), (-1000), 160, (-1000), 0, 0, 0, 150, 150, 150, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
			if (target(2)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation(("dbm" + ":textures/" + "planets/potaufeu_2" + ".png")));
				renderShape(shape(), (-1000), 160, (-1000), 0, 0, 0, 160, 160, 160, 60 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
		}
	}
}
