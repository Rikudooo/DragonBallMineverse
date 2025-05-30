package net.mcreator.dbm.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class LightningAuraProcedure {
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
		if (LightningAuraProcedure.bufferBuilder == null || !LightningAuraProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (LightningAuraProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					LightningAuraProcedure.mode = mode;
					LightningAuraProcedure.format = format;
					LightningAuraProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					LightningAuraProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					LightningAuraProcedure.mode = mode;
					LightningAuraProcedure.format = format;
					LightningAuraProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					LightningAuraProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
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
		LightningAuraProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			LightningAuraProcedure.targetStage = targetStage;
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
			execute(event, level, pos.x(), pos.y(), pos.z(), entity);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 2")
							|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 3")
							|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Unleashed Power")
							|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Mystic")
							|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Beast")) {
						if (begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR, false)) {
							add(0, 0.5, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(0.1, 0.3, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(0.1, 0.3, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.05), 0.1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.05), 0.1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(0, 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							end();
						}
						if (target(2)) {
							RenderSystem.defaultBlendFunc();
							if (Math.random() < 0.5) {
								if (Math.random() < 0.5) {
									renderShape(shape(), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), -1, 1)), (entityiterator.getY() + entityiterator.getBbHeight() / 2 + Mth.nextDouble(RandomSource.create(), -1, 1)),
											(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), -1, 1)), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(), Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(),
											(float) Mth.nextDouble(RandomSource.create(), 0, 360), 1, 1, 1, 240 << 24 | 0 << 16 | 186 << 8 | 255);
								}
								if (Math.random() < 0.4) {
									renderShape(shape(), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), -1, 1)), (entityiterator.getY() + entityiterator.getBbHeight() / 2 + Mth.nextDouble(RandomSource.create(), -1, 1)),
											(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), -1, 1)), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(), Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(),
											(float) Mth.nextDouble(RandomSource.create(), 0, 360), 1, -1, 1, 240 << 24 | 0 << 16 | 186 << 8 | 255);
								}
								if (Math.random() < 0.4) {
									renderShape(shape(), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), -1, 1)), (entityiterator.getY() + entityiterator.getBbHeight() / 2 + Mth.nextDouble(RandomSource.create(), -1, 1)),
											(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), -1, 1)), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(), Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(),
											(float) Mth.nextDouble(RandomSource.create(), 0, 360), -1, 1, 1, 240 << 24 | 0 << 16 | 186 << 8 | 255);
								}
								if (Math.random() < 0.5) {
									renderShape(shape(), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), -1, 1)), (entityiterator.getY() + entityiterator.getBbHeight() / 2 + Mth.nextDouble(RandomSource.create(), -1, 1)),
											(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), -1, 1)), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(), Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(),
											(float) Mth.nextDouble(RandomSource.create(), 0, 360), -1, 1, -1, 240 << 24 | 0 << 16 | 186 << 8 | 255);
								}
							}
							release();
						}
					}
				}
			}
		}
	}
}
