
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryCellJrEntity;
import net.mcreator.dbm.client.model.ModelCellJunior;

public class StoryCellJrRenderer extends MobRenderer<StoryCellJrEntity, ModelCellJunior<StoryCellJrEntity>> {
	public StoryCellJrRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCellJunior(context.bakeLayer(ModelCellJunior.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryCellJrEntity entity) {
		return new ResourceLocation("dbm:textures/entities/celljunior.png");
	}
}
