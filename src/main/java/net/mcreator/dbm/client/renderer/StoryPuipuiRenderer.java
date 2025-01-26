
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryPuipuiEntity;
import net.mcreator.dbm.client.model.Modelpui;

public class StoryPuipuiRenderer extends MobRenderer<StoryPuipuiEntity, Modelpui<StoryPuipuiEntity>> {
	public StoryPuipuiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpui(context.bakeLayer(Modelpui.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryPuipuiEntity entity) {
		return new ResourceLocation("dbm:textures/entities/pui.png");
	}
}
