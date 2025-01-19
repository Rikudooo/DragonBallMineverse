
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryBurterEntity;
import net.mcreator.dbm.client.model.ModelBurter;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryBurterRenderer extends MobRenderer<StoryBurterEntity, ModelBurter<StoryBurterEntity>> {
	public StoryBurterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBurter(context.bakeLayer(ModelBurter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryBurterEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryBurterEntity entity) {
		return new ResourceLocation("dbm:textures/entities/burtertexture.png");
	}
}
