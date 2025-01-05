
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.BubblesEntity;
import net.mcreator.dbm.client.model.ModelGorillaBubble;

public class BubblesRenderer extends MobRenderer<BubblesEntity, ModelGorillaBubble<BubblesEntity>> {
	public BubblesRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGorillaBubble(context.bakeLayer(ModelGorillaBubble.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BubblesEntity entity) {
		return new ResourceLocation("dbm:textures/entities/gorillabubbles.png");
	}
}
