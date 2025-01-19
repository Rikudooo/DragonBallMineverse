
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryDodoriaEntity;
import net.mcreator.dbm.client.model.ModelDodoria;

public class StoryDodoriaRenderer extends MobRenderer<StoryDodoriaEntity, ModelDodoria<StoryDodoriaEntity>> {
	public StoryDodoriaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDodoria(context.bakeLayer(ModelDodoria.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryDodoriaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/dodoriatexture.png");
	}
}
