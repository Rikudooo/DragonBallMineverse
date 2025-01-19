
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryKingColdEntity;
import net.mcreator.dbm.client.model.ModelKingCold;

public class StoryKingColdRenderer extends MobRenderer<StoryKingColdEntity, ModelKingCold<StoryKingColdEntity>> {
	public StoryKingColdRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKingCold(context.bakeLayer(ModelKingCold.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryKingColdEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kingcold.png");
	}
}
