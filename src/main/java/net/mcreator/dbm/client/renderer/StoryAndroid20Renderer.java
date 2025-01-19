
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryAndroid20Entity;
import net.mcreator.dbm.client.model.ModelAndroid20;

public class StoryAndroid20Renderer extends MobRenderer<StoryAndroid20Entity, ModelAndroid20<StoryAndroid20Entity>> {
	public StoryAndroid20Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelAndroid20(context.bakeLayer(ModelAndroid20.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryAndroid20Entity entity) {
		return new ResourceLocation("dbm:textures/entities/a20texture.png");
	}
}
