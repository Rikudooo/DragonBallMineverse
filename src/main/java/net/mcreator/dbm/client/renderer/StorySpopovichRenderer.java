
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StorySpopovichEntity;
import net.mcreator.dbm.client.model.ModelSpopovich;

public class StorySpopovichRenderer extends MobRenderer<StorySpopovichEntity, ModelSpopovich<StorySpopovichEntity>> {
	public StorySpopovichRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpopovich(context.bakeLayer(ModelSpopovich.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StorySpopovichEntity entity) {
		return new ResourceLocation("dbm:textures/entities/spopovich.png");
	}
}
