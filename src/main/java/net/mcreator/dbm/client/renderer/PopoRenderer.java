
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.PopoEntity;
import net.mcreator.dbm.client.model.ModelPopo;

public class PopoRenderer extends MobRenderer<PopoEntity, ModelPopo<PopoEntity>> {
	public PopoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPopo(context.bakeLayer(ModelPopo.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(PopoEntity entity) {
		return new ResourceLocation("dbm:textures/entities/popo.png");
	}
}
