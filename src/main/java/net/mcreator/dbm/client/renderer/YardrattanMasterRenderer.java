
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.YardrattanMasterEntity;
import net.mcreator.dbm.client.model.ModelYardrat2;

public class YardrattanMasterRenderer extends MobRenderer<YardrattanMasterEntity, ModelYardrat2<YardrattanMasterEntity>> {
	public YardrattanMasterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelYardrat2(context.bakeLayer(ModelYardrat2.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(YardrattanMasterEntity entity) {
		return new ResourceLocation("dbm:textures/entities/yardrat3.png");
	}
}
