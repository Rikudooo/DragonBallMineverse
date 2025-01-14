
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryRaditzEntity;
import net.mcreator.dbm.client.model.ModelRaditz;

public class StoryRaditzRenderer extends MobRenderer<StoryRaditzEntity, ModelRaditz<StoryRaditzEntity>> {
	public StoryRaditzRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRaditz(context.bakeLayer(ModelRaditz.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryRaditzEntity entity) {
		return new ResourceLocation("dbm:textures/entities/raditz.png");
	}
}
