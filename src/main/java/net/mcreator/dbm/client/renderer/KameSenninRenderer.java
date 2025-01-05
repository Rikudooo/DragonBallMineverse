
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.KameSenninEntity;
import net.mcreator.dbm.client.model.ModelKameSennin;

public class KameSenninRenderer extends MobRenderer<KameSenninEntity, ModelKameSennin<KameSenninEntity>> {
	public KameSenninRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKameSennin(context.bakeLayer(ModelKameSennin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KameSenninEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kamesennintexture.png");
	}
}
