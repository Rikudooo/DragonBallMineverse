
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryRecoomeEntity;
import net.mcreator.dbm.client.model.ModelRecoome;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryRecoomeRenderer extends MobRenderer<StoryRecoomeEntity, ModelRecoome<StoryRecoomeEntity>> {
	public StoryRecoomeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRecoome(context.bakeLayer(ModelRecoome.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryRecoomeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryRecoomeEntity entity) {
		return new ResourceLocation("dbm:textures/entities/recoometexture.png");
	}
}
