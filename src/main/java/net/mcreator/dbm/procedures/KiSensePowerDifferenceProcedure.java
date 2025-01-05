package net.mcreator.dbm.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
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
public class KiSensePowerDifferenceProcedure {
	private static boolean texture = false;
	private static BufferBuilder bufferBuilder = null;
	private static VertexBuffer vertexBuffer = null;
	private static PoseStack poseStack = null;
	private static Matrix4f projectionMatrix = null;
	private static boolean worldCoordinate = true;
	private static Vec3 offset = Vec3.ZERO;
	private static float partialTick = 0.0F;
	private static int ticks = 0;
	private static int currentStage = 0;
	private static int targetStage = 0; // NONE: 0, SKY: 1, WORLD: 2

	private static void add(double x, double y, double z, float u, float v, int color) {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (texture) {
			bufferBuilder.vertex(x, y, z).uv(u, v).color(color).endVertex();
		} else {
			bufferBuilder.vertex(x, y, z).color(color).endVertex();
		}
	}

	private static boolean begin(VertexFormat.Mode mode, boolean texture, boolean update) {
		if (bufferBuilder == null || !bufferBuilder.building()) {
			if (update)
				clear();
			if (vertexBuffer == null) {
				KiSensePowerDifferenceProcedure.texture = texture;
				bufferBuilder = Tesselator.getInstance().getBuilder();
				if (texture) {
					bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
				} else {
					bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
				}
				return true;
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
		KiSensePowerDifferenceProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			KiSensePowerDifferenceProcedure.targetStage = targetStage;
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
		if (!worldCoordinate) {
			i = (float) x;
			j = (float) y;
			k = (float) z;
		} else {
			Vec3 pos = Minecraft.getInstance().gameRenderer.getMainCamera().getPosition();
			i = (float) (x - pos.x());
			j = (float) (y - pos.y());
			k = (float) (z - pos.z());
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
		Matrix4f matrix4f = poseStack.last().pose();
		vertexBuffer.drawWithShader(matrix4f, projectionMatrix, vertexBuffer.getFormat().hasUV(0) ? GameRenderer.getPositionTexColorShader() : GameRenderer.getPositionColorShader());
		VertexBuffer.unbind();
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void renderLevel(RenderLevelStageEvent event) {
		poseStack = event.getPoseStack();
		projectionMatrix = event.getProjectionMatrix();
		partialTick = event.getPartialTick();
		ticks = event.getRenderTick();
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
			currentStage = 1;
			RenderSystem.depthMask(false);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
		} else if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
			currentStage = 2;
			RenderSystem.depthMask(true);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
		}
		currentStage = 0;
	}

	private static void renderShapes(Event event) {
		Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;
		Entity entity = minecraft.gameRenderer.getMainCamera().getEntity();
		if (level != null && entity != null) {
			Vec3 pos = entity.getPosition(partialTick);
			RenderSystem.enableBlend();
			RenderSystem.defaultBlendFunc();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			execute(event, level, pos.x(), pos.y(), pos.z(), entity, partialTick);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double partialTick) {
		execute(null, world, x, y, z, entity, partialTick);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double partialTick) {
		if (entity == null)
			return;
		Entity TargetedEntity = null;
		if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseTarget).equals("Off")
				&& (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseLevel >= 4) {
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseTarget).equals("Entities")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == false) {
							TargetedEntity = entityiterator;
						} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == true) {
							TargetedEntity = Minecraft.getInstance().hitResult instanceof EntityHitResult _entityHitResult ? _entityHitResult.getEntity() : (Entity) null;
						}
						if (!(TargetedEntity == entity) && !(TargetedEntity instanceof Player || TargetedEntity instanceof ServerPlayer) && TargetedEntity instanceof LivingEntity) {
							if (begin(VertexFormat.Mode.QUADS, false, true)) {
								add((-0.3), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.3), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								end();
							}
							if (target(2)) {
								RenderSystem.depthMask(false);
								RenderSystem.disableDepthTest();
								renderShape((shape()), (TargetedEntity.getX()), (TargetedEntity.getY() + TargetedEntity.getBbHeight() + 0.3), (TargetedEntity.getZ()), entity.getViewYRot((float) partialTick), entity.getViewXRot((float) partialTick),
										0, 1,
										(float) ((TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
												/ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
														+ (TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel)),
										1, 255 << 24 | 255 << 16 | 43 << 8 | 0);
								release();
							}
						}
					}
				}
			} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseTarget).equals("Players")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == false) {
							TargetedEntity = entityiterator;
						} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == true) {
							TargetedEntity = Minecraft.getInstance().hitResult instanceof EntityHitResult _entityHitResult ? _entityHitResult.getEntity() : (Entity) null;
						}
						if (!(TargetedEntity == entity) && (TargetedEntity instanceof Player || TargetedEntity instanceof ServerPlayer)) {
							if (begin(VertexFormat.Mode.QUADS, false, true)) {
								add((-0.3), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.3), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								end();
							}
							if (target(2)) {
								RenderSystem.depthMask(false);
								RenderSystem.disableDepthTest();
								renderShape((shape()), (TargetedEntity.getX()), (TargetedEntity.getY() + TargetedEntity.getBbHeight() + 0.3), (TargetedEntity.getZ()), entity.getViewYRot((float) partialTick), entity.getViewXRot((float) partialTick),
										0, 1,
										(float) ((TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
												/ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
														+ (TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel)),
										1, 255 << 24 | 255 << 16 | 43 << 8 | 0);
								release();
							}
						}
					}
				}
			} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseTarget).equals("All")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == false) {
							TargetedEntity = entityiterator;
						} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiSenseSingle == true) {
							TargetedEntity = Minecraft.getInstance().hitResult instanceof EntityHitResult _entityHitResult ? _entityHitResult.getEntity() : (Entity) null;
						}
						if (!(TargetedEntity == entity) && TargetedEntity instanceof LivingEntity) {
							if (begin(VertexFormat.Mode.QUADS, false, true)) {
								add((-0.3), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.3), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0.75, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								add((-0.25), 0, 0, 0.0F, 0.0F, 255 << 24 | 255 << 16 | 255 << 8 | 255);
								end();
							}
							if (target(2)) {
								RenderSystem.depthMask(false);
								RenderSystem.disableDepthTest();
								renderShape((shape()), (TargetedEntity.getX()), (TargetedEntity.getY() + TargetedEntity.getBbHeight() + 0.3), (TargetedEntity.getZ()), entity.getViewYRot((float) partialTick), entity.getViewXRot((float) partialTick),
										0, 1,
										(float) ((TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
												/ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
														+ (TargetedEntity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel)),
										1, 255 << 24 | 255 << 16 | 43 << 8 | 0);
								release();
							}
						}
					}
				}
			}
		}
	}
}
