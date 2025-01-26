
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryDaburaEntity;
import net.mcreator.dbm.client.model.ModelDabura;

public class StoryDaburaRenderer extends MobRenderer<StoryDaburaEntity, ModelDabura<StoryDaburaEntity>> {
	public StoryDaburaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDabura(context.bakeLayer(ModelDabura.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryDaburaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/daburatexture.png");
	}
}
