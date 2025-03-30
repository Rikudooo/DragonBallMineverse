
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryBeerus2Entity;
import net.mcreator.dbm.client.model.Modelbeerus;

public class StoryBeerus2Renderer extends MobRenderer<StoryBeerus2Entity, Modelbeerus<StoryBeerus2Entity>> {
	public StoryBeerus2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeerus(context.bakeLayer(Modelbeerus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryBeerus2Entity entity) {
		return new ResourceLocation("dbm:textures/entities/beerus.png");
	}
}
