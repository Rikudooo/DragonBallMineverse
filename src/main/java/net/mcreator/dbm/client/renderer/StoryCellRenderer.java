
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryCellEntity;
import net.mcreator.dbm.client.model.ModelimperfectCell;

public class StoryCellRenderer extends MobRenderer<StoryCellEntity, ModelimperfectCell<StoryCellEntity>> {
	public StoryCellRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelimperfectCell(context.bakeLayer(ModelimperfectCell.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryCellEntity entity) {
		return new ResourceLocation("dbm:textures/entities/imperfect_cell.png");
	}
}
