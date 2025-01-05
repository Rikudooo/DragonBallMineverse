
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.SabertoothEntity;
import net.mcreator.dbm.client.model.Modelsabertooth;

public class SabertoothRenderer extends MobRenderer<SabertoothEntity, Modelsabertooth<SabertoothEntity>> {
	public SabertoothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsabertooth(context.bakeLayer(Modelsabertooth.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SabertoothEntity entity) {
		return new ResourceLocation("dbm:textures/entities/sabertooth.png");
	}
}
