
package net.mcreator.dbm.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.procedures.NamekDBInStoneProcedure;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.client.model.ModelDragonBall;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NamekDragonBallE5Renderer extends MobRenderer<NamekDragonBallE5Entity, ModelDragonBall<NamekDragonBallE5Entity>> {
	public NamekDragonBallE5Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelDragonBall(context.bakeLayer(ModelDragonBall.LAYER_LOCATION)), 0.2f);
		this.addLayer(new RenderLayer<NamekDragonBallE5Entity, ModelDragonBall<NamekDragonBallE5Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dbm:textures/entities/stone.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, NamekDragonBallE5Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (NamekDBInStoneProcedure.execute(world)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelDragonBall(Minecraft.getInstance().getEntityModels().bakeLayer(ModelDragonBall.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(NamekDragonBallE5Entity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(NamekDragonBallE5Entity entity) {
		return new ResourceLocation("dbm:textures/entities/dragonballtexture.png");
	}
}
