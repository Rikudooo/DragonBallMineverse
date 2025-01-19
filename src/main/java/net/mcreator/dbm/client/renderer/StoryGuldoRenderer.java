
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryGuldoEntity;
import net.mcreator.dbm.client.model.ModelGuldo;

public class StoryGuldoRenderer extends MobRenderer<StoryGuldoEntity, ModelGuldo<StoryGuldoEntity>> {
	public StoryGuldoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGuldo(context.bakeLayer(ModelGuldo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryGuldoEntity entity) {
		return new ResourceLocation("dbm:textures/entities/guldotexture.png");
	}
}
