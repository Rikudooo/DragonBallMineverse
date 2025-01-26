
package net.mcreator.dbm.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.procedures.FusedBuutenksProcedure;
import net.mcreator.dbm.procedures.FusedBuuhanProcedure;
import net.mcreator.dbm.procedures.FusedBuuccoloProcedure;
import net.mcreator.dbm.procedures.FusedBuuBaseProcedure;
import net.mcreator.dbm.entity.StoryFusedBuuEntity;
import net.mcreator.dbm.client.model.Modelbuutenks;
import net.mcreator.dbm.client.model.Modelbuuhan;
import net.mcreator.dbm.client.model.ModelSuperBuu;
import net.mcreator.dbm.client.model.ModelBuucolo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StoryFusedBuuRenderer extends HumanoidMobRenderer<StoryFusedBuuEntity, HumanoidModel<StoryFusedBuuEntity>> {
	public StoryFusedBuuRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<StoryFusedBuuEntity, HumanoidModel<StoryFusedBuuEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/superbuu.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFusedBuuEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (FusedBuuBaseProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelSuperBuu(Minecraft.getInstance().getEntityModels().bakeLayer(ModelSuperBuu.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFusedBuuEntity, HumanoidModel<StoryFusedBuuEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/buutenkstexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFusedBuuEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (FusedBuutenksProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbuutenks(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbuutenks.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFusedBuuEntity, HumanoidModel<StoryFusedBuuEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/buucolo.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFusedBuuEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (FusedBuuccoloProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelBuucolo(Minecraft.getInstance().getEntityModels().bakeLayer(ModelBuucolo.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryFusedBuuEntity, HumanoidModel<StoryFusedBuuEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/buuhantexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryFusedBuuEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (FusedBuuhanProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbuuhan(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbuuhan.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StoryFusedBuuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/notexture.png");
	}
}
