
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryKibitoEntity;
import net.mcreator.dbm.client.model.ModelKibito;

public class StoryKibitoRenderer extends MobRenderer<StoryKibitoEntity, ModelKibito<StoryKibitoEntity>> {
	public StoryKibitoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKibito(context.bakeLayer(ModelKibito.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryKibitoEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kibitotexture.png");
	}
}
