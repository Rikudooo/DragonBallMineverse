
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryMajinBuuEntity;
import net.mcreator.dbm.client.model.ModelMajinBuu;

public class StoryMajinBuuRenderer extends MobRenderer<StoryMajinBuuEntity, ModelMajinBuu<StoryMajinBuuEntity>> {
	public StoryMajinBuuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMajinBuu(context.bakeLayer(ModelMajinBuu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryMajinBuuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/fatbuutexture.png");
	}
}
