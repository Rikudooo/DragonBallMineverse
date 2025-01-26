
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.BabidiEntity;
import net.mcreator.dbm.client.model.ModelBabidi;

public class BabidiRenderer extends MobRenderer<BabidiEntity, ModelBabidi<BabidiEntity>> {
	public BabidiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBabidi(context.bakeLayer(ModelBabidi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabidiEntity entity) {
		return new ResourceLocation("dbm:textures/entities/babiditexture.png");
	}
}
