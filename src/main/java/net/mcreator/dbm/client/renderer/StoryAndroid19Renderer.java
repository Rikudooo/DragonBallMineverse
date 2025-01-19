
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryAndroid19Entity;
import net.mcreator.dbm.client.model.ModelAndroid19;

public class StoryAndroid19Renderer extends MobRenderer<StoryAndroid19Entity, ModelAndroid19<StoryAndroid19Entity>> {
	public StoryAndroid19Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelAndroid19(context.bakeLayer(ModelAndroid19.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryAndroid19Entity entity) {
		return new ResourceLocation("dbm:textures/entities/a19texture.png");
	}
}
