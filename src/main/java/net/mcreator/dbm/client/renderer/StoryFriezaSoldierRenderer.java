
package net.mcreator.dbm.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.procedures.StoryFriezaSoldierDisplay5Procedure;
import net.mcreator.dbm.procedures.StoryFriezaSoldierDisplay4Procedure;
import net.mcreator.dbm.procedures.StoryFriezaSoldierDisplay3Procedure;
import net.mcreator.dbm.procedures.StoryFriezaSoldierDisplay2Procedure;
import net.mcreator.dbm.procedures.StoryFriezaSoldierDisplay1Procedure;
import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;
import net.mcreator.dbm.client.model.Modelfriezasoldier;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StoryFriezaSoldierRenderer extends MobRenderer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>> {
	public StoryFriezaSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfriezasoldier(context.bakeLayer(Modelfriezasoldier.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/friezasoldier1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFriezaSoldierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoryFriezaSoldierDisplay1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelfriezasoldier(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfriezasoldier.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/friezasoldier2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFriezaSoldierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoryFriezaSoldierDisplay2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelfriezasoldier(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfriezasoldier.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/friezasoldier3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFriezaSoldierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoryFriezaSoldierDisplay3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelfriezasoldier(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfriezasoldier.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/friezasoldier4.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFriezaSoldierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoryFriezaSoldierDisplay4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelfriezasoldier(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfriezasoldier.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFriezaSoldierEntity, Modelfriezasoldier<StoryFriezaSoldierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/friezasoldier5.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFriezaSoldierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoryFriezaSoldierDisplay5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelfriezasoldier(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfriezasoldier.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StoryFriezaSoldierEntity entity) {
		return new ResourceLocation("dbm:textures/entities/notexture.png");
	}
}
