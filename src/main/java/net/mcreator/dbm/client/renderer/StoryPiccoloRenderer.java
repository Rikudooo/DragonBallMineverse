
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryPiccoloEntity;
import net.mcreator.dbm.client.model.ModelPiccolo;

public class StoryPiccoloRenderer extends MobRenderer<StoryPiccoloEntity, ModelPiccolo<StoryPiccoloEntity>> {
	public StoryPiccoloRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPiccolo(context.bakeLayer(ModelPiccolo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryPiccoloEntity entity) {
		return new ResourceLocation("dbm:textures/entities/piccoloweights.png");
	}
}
