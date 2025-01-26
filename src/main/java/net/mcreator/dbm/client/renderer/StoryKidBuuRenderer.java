
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryKidBuuEntity;
import net.mcreator.dbm.client.model.ModelKid_Buu;

public class StoryKidBuuRenderer extends MobRenderer<StoryKidBuuEntity, ModelKid_Buu<StoryKidBuuEntity>> {
	public StoryKidBuuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKid_Buu(context.bakeLayer(ModelKid_Buu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryKidBuuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kidbuutexture.png");
	}
}
