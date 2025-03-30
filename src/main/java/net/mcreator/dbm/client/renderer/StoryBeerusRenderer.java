
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryBeerusEntity;
import net.mcreator.dbm.client.model.Modelbeerus;

public class StoryBeerusRenderer extends MobRenderer<StoryBeerusEntity, Modelbeerus<StoryBeerusEntity>> {
	public StoryBeerusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeerus(context.bakeLayer(Modelbeerus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryBeerusEntity entity) {
		return new ResourceLocation("dbm:textures/entities/beerus.png");
	}
}
