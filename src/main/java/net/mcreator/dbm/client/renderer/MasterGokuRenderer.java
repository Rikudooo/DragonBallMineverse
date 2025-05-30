
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.MasterGokuEntity;
import net.mcreator.dbm.client.model.ModelGoku;

public class MasterGokuRenderer extends MobRenderer<MasterGokuEntity, ModelGoku<MasterGokuEntity>> {
	public MasterGokuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGoku(context.bakeLayer(ModelGoku.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MasterGokuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/goku.png");
	}
}
