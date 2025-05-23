package net.mcreator.dbm.procedures;

import org.joml.Matrix4f;

import org.checkerframework.checker.units.qual.m;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import java.util.ArrayList;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class GalickGunChargingRenderProcedure {
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
		if (GalickGunChargingRenderProcedure.bufferBuilder == null || !GalickGunChargingRenderProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (GalickGunChargingRenderProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					GalickGunChargingRenderProcedure.mode = mode;
					GalickGunChargingRenderProcedure.format = format;
					GalickGunChargingRenderProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					GalickGunChargingRenderProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					GalickGunChargingRenderProcedure.mode = mode;
					GalickGunChargingRenderProcedure.format = format;
					GalickGunChargingRenderProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					GalickGunChargingRenderProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
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
		GalickGunChargingRenderProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			GalickGunChargingRenderProcedure.targetStage = targetStage;
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
			execute(event, level);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double width = 0;
		double length = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double l = 0;
		double m = 0;
		double speed = 0;
		double x = 0;
		double z = 0;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ChargingKiAttack == true) {
				if (((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Galick Gun")) {
					x = Math.sin(Math.toRadians(entityiterator.getYRot())) * (-1);
					z = Math.cos(Math.toRadians(entityiterator.getYRot())) * 1.2;
					if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR, false)) {
						for (int index0 = 0; index0 < 90; index0++) {
							for (int index1 = 0; index1 < 45; index1++) {
								k = 255 - (j / 180) * 95;
								l = 255 - ((j + 4) / 180) * 95;
								add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5),
										255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
								add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
										255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
								add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
										255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
								add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5),
										255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
								j = j + 4;
							}
							j = 0;
							i = i + 4;
						}
						i = 0;
						end();
					}
					if (target(2)) {
						RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
						renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() * 0.55), (entityiterator.getZ()), 0, 0, 0,
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)), 255 << 24 | 236 << 16 | 194 << 8 | 255);
						RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
						renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() * 0.55), (entityiterator.getZ()), 0, 0, 0,
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)), 255 << 24 | 246 << 16 | 25 << 8 | 255);
						release();
					}
				}
			}
			if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).LaunchKiAttack == true) {
				if (((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Galick Gun")) {
					x = Math.sin(Math.toRadians(entityiterator.getYRot())) * (-1);
					z = Math.cos(Math.toRadians(entityiterator.getYRot())) * 1.2;
					if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR, false)) {
						for (int index2 = 0; index2 < 90; index2++) {
							for (int index3 = 0; index3 < 45; index3++) {
								k = 255 - (j / 180) * 95;
								l = 255 - ((j + 4) / 180) * 95;
								add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5),
										255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
								add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
										255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
								add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
										255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
								add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5),
										255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
								j = j + 4;
							}
							j = 0;
							i = i + 4;
						}
						i = 0;
						end();
					}
					if (target(2)) {
						RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
						renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() * 0.55), (entityiterator.getZ()), 0, 0, 0,
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)), 255 << 24 | 236 << 16 | 194 << 8 | 255);
						RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
						renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() * 0.55), (entityiterator.getZ()), 0, 0, 0,
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)),
								(float) (4.2 * ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 200)), 255 << 24 | 246 << 16 | 25 << 8 | 255);
						release();
					}
				}
			}
		}
	}
}
