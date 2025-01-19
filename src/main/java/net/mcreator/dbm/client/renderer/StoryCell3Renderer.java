
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryCell3Entity;
import net.mcreator.dbm.client.model.ModelPerfectCell;

public class StoryCell3Renderer extends MobRenderer<StoryCell3Entity, ModelPerfectCell<StoryCell3Entity>> {
	public StoryCell3Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelPerfectCell(context.bakeLayer(ModelPerfectCell.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryCell3Entity entity) {
		return new ResourceLocation("dbm:textures/entities/perfectcell.png");
	}
}
