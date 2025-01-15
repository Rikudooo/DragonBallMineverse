
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

import net.mcreator.dbm.procedures.VegetaWeakenedConditionProcedure;
import net.mcreator.dbm.procedures.VegetaOozaruConditionProcedure;
import net.mcreator.dbm.entity.StoryVegetaEntity;
import net.mcreator.dbm.client.model.ModelVegetaSaiyanSaga;
import net.mcreator.dbm.client.model.ModelOozaruVegeta;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StoryVegetaRenderer extends MobRenderer<StoryVegetaEntity, ModelVegetaSaiyanSaga<StoryVegetaEntity>> {
	public StoryVegetaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVegetaSaiyanSaga(context.bakeLayer(ModelVegetaSaiyanSaga.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<StoryVegetaEntity, ModelVegetaSaiyanSaga<StoryVegetaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/vegetaoozarutexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryVegetaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (VegetaOozaruConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelOozaruVegeta(Minecraft.getInstance().getEntityModels().bakeLayer(ModelOozaruVegeta.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<StoryVegetaEntity, ModelVegetaSaiyanSaga<StoryVegetaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/weakenedvegeta.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoryVegetaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (VegetaWeakenedConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelVegetaSaiyanSaga(Minecraft.getInstance().getEntityModels().bakeLayer(ModelVegetaSaiyanSaga.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StoryVegetaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/vegetasaiyansagatexture.png");
	}
}
