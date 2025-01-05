
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.GregoryEntity;
import net.mcreator.dbm.client.model.ModelGregory;

public class GregoryRenderer extends MobRenderer<GregoryEntity, ModelGregory<GregoryEntity>> {
	public GregoryRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGregory(context.bakeLayer(ModelGregory.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GregoryEntity entity) {
		return new ResourceLocation("dbm:textures/entities/gregory.png");
	}
}
