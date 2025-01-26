
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StorySuperBuuEntity;
import net.mcreator.dbm.client.model.ModelSuperBuu;

public class StorySuperBuuRenderer extends MobRenderer<StorySuperBuuEntity, ModelSuperBuu<StorySuperBuuEntity>> {
	public StorySuperBuuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSuperBuu(context.bakeLayer(ModelSuperBuu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StorySuperBuuEntity entity) {
		return new ResourceLocation("dbm:textures/entities/superbuu.png");
	}
}
