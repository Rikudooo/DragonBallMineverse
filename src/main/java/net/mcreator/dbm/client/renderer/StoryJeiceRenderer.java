
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryJeiceEntity;
import net.mcreator.dbm.client.model.ModelJeice;

public class StoryJeiceRenderer extends MobRenderer<StoryJeiceEntity, ModelJeice<StoryJeiceEntity>> {
	public StoryJeiceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJeice(context.bakeLayer(ModelJeice.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryJeiceEntity entity) {
		return new ResourceLocation("dbm:textures/entities/jeicetexture.png");
	}
}
