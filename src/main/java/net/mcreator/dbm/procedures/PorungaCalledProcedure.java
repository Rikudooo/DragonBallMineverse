package net.mcreator.dbm.procedures;

import org.joml.Matrix4f;

import org.checkerframework.checker.units.qual.m;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.entity.PorungaEntity;
import net.mcreator.dbm.entity.NamekDragonBallE7Entity;
import net.mcreator.dbm.entity.NamekDragonBallE6Entity;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.entity.NamekDragonBallE4Entity;
import net.mcreator.dbm.entity.NamekDragonBallE3Entity;
import net.mcreator.dbm.entity.NamekDragonBallE2Entity;
import net.mcreator.dbm.entity.NamekDragonBallE1Entity;

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
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class PorungaCalledProcedure {
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
		if (PorungaCalledProcedure.bufferBuilder == null || !PorungaCalledProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (PorungaCalledProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					PorungaCalledProcedure.mode = mode;
					PorungaCalledProcedure.format = format;
					PorungaCalledProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					PorungaCalledProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					PorungaCalledProcedure.mode = mode;
					PorungaCalledProcedure.format = format;
					PorungaCalledProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					PorungaCalledProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
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
		PorungaCalledProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			PorungaCalledProcedure.targetStage = targetStage;
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
			execute(event, level, pos.x(), pos.y(), pos.z());
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		double xM = 0;
		double yM = 0;
		double zM = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double l = 0;
		double width = 0;
		double length = 0;
		double m = 0;
		double speed = 0;
		double range = 0;
		double yN = 0;
		double zN = 0;
		double NRange = 0;
		if (DbmModVariables.MapVariables.get(world).PorungaCalled || !world.getEntitiesOfClass(PorungaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
			range = 500;
			if (!world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()) {
				xM = (((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()) / 7;
				yM = (((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()) / 7;
				zM = (((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + ((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()) / 7;
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
					renderShape(shape(), xM, yM, zM, 0, 0, 0, 5, 5, 5, 255 << 24 | 255 << 16 | 255 << 8 | 237);
					release();
				}
			} else if (!(!world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty()
					&& !world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).isEmpty())
					&& !world.getEntitiesOfClass(PorungaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
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
			}
		}
		if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(300 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getPersistentData().getDouble("dragonballScatter") > 0 && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("dbm:namekdragonball")))) {
						if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR, false)) {
							for (int index4 = 0; index4 < 90; index4++) {
								for (int index5 = 0; index5 < 45; index5++) {
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
							renderShape(shape(), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 0, 0, 0, 2, 2, 2, 255 << 24 | 255 << 16 | 255 << 8 | 237);
							release();
						}
					}
				}
			}
		}
	}
}
