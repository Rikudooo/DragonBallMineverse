
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryTienshinhanEntity;
import net.mcreator.dbm.client.model.Modeltien;

public class StoryTienshinhanRenderer extends MobRenderer<StoryTienshinhanEntity, Modeltien<StoryTienshinhanEntity>> {
	public StoryTienshinhanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltien(context.bakeLayer(Modeltien.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryTienshinhanEntity entity) {
		return new ResourceLocation("dbm:textures/entities/tienshinhan.png");
	}
}
