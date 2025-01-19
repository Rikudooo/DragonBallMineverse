
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryGinyuEntity;
import net.mcreator.dbm.client.model.ModelGinyu;

public class StoryGinyuRenderer extends MobRenderer<StoryGinyuEntity, ModelGinyu<StoryGinyuEntity>> {
	public StoryGinyuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGinyu(context.bakeLayer(ModelGinyu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryGinyuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/ginyutexture.png");
	}
}
