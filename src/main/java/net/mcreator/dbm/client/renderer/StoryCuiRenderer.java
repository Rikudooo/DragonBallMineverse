
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryCuiEntity;
import net.mcreator.dbm.client.model.Modelcui;

public class StoryCuiRenderer extends MobRenderer<StoryCuiEntity, Modelcui<StoryCuiEntity>> {
	public StoryCuiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcui(context.bakeLayer(Modelcui.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryCuiEntity entity) {
		return new ResourceLocation("dbm:textures/entities/cuitexture.png");
	}
}
