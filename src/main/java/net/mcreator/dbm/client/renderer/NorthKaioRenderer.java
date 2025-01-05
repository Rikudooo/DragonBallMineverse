
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.NorthKaioEntity;
import net.mcreator.dbm.client.model.ModelNorthKaio;

public class NorthKaioRenderer extends MobRenderer<NorthKaioEntity, ModelNorthKaio<NorthKaioEntity>> {
	public NorthKaioRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNorthKaio(context.bakeLayer(ModelNorthKaio.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NorthKaioEntity entity) {
		return new ResourceLocation("dbm:textures/entities/northkaio.png");
	}
}
