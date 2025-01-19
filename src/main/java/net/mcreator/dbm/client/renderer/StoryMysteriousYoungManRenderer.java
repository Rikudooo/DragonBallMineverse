
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

import net.mcreator.dbm.procedures.MYMSSJProcedure;
import net.mcreator.dbm.procedures.MYMBaseProcedure;
import net.mcreator.dbm.entity.StoryMysteriousYoungManEntity;
import net.mcreator.dbm.client.model.Modeltrunkssupersaiyan;
import net.mcreator.dbm.client.model.ModelTrunksDBZ;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StoryMysteriousYoungManRenderer extends HumanoidMobRenderer<StoryMysteriousYoungManEntity, HumanoidModel<StoryMysteriousYoungManEntity>> {
	public StoryMysteriousYoungManRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<StoryMysteriousYoungManEntity, HumanoidModel<StoryMysteriousYoungManEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/trunksdbztexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryMysteriousYoungManEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MYMBaseProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelTrunksDBZ(Minecraft.getInstance().getEntityModels().bakeLayer(ModelTrunksDBZ.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryMysteriousYoungManEntity, HumanoidModel<StoryMysteriousYoungManEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/trunksssjdbztexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryMysteriousYoungManEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MYMSSJProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeltrunkssupersaiyan(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltrunkssupersaiyan.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StoryMysteriousYoungManEntity entity) {
		return new ResourceLocation("dbm:textures/entities/notexture.png");
	}
}
