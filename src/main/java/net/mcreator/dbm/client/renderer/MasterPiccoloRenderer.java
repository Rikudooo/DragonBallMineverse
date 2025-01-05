
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.MasterPiccoloEntity;
import net.mcreator.dbm.client.model.ModelPiccoloCape;

public class MasterPiccoloRenderer extends MobRenderer<MasterPiccoloEntity, ModelPiccoloCape<MasterPiccoloEntity>> {
	public MasterPiccoloRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPiccoloCape(context.bakeLayer(ModelPiccoloCape.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MasterPiccoloEntity entity) {
		return new ResourceLocation("dbm:textures/entities/piccoloweights.png");
	}
}
