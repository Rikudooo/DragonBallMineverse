
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryAndroid17Entity;
import net.mcreator.dbm.client.model.ModelAndroid17;

public class StoryAndroid17Renderer extends MobRenderer<StoryAndroid17Entity, ModelAndroid17<StoryAndroid17Entity>> {
	public StoryAndroid17Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelAndroid17(context.bakeLayer(ModelAndroid17.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryAndroid17Entity entity) {
		return new ResourceLocation("dbm:textures/entities/android17.png");
	}
}
