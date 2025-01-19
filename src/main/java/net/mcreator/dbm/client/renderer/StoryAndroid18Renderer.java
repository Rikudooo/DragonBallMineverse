
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryAndroid18Entity;
import net.mcreator.dbm.client.model.ModelAndroid18;

public class StoryAndroid18Renderer extends MobRenderer<StoryAndroid18Entity, ModelAndroid18<StoryAndroid18Entity>> {
	public StoryAndroid18Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelAndroid18(context.bakeLayer(ModelAndroid18.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryAndroid18Entity entity) {
		return new ResourceLocation("dbm:textures/entities/android18.png");
	}
}
