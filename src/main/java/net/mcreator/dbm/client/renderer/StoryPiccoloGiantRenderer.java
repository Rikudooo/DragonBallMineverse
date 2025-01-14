
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryPiccoloGiantEntity;
import net.mcreator.dbm.client.model.ModelPiccolo;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryPiccoloGiantRenderer extends MobRenderer<StoryPiccoloGiantEntity, ModelPiccolo<StoryPiccoloGiantEntity>> {
	public StoryPiccoloGiantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPiccolo(context.bakeLayer(ModelPiccolo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryPiccoloGiantEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryPiccoloGiantEntity entity) {
		return new ResourceLocation("dbm:textures/entities/piccoloweights.png");
	}
}
