
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryNappaEntity;
import net.mcreator.dbm.client.model.ModelNappa;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryNappaRenderer extends MobRenderer<StoryNappaEntity, ModelNappa<StoryNappaEntity>> {
	public StoryNappaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNappa(context.bakeLayer(ModelNappa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryNappaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryNappaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/nappa.png");
	}
}
