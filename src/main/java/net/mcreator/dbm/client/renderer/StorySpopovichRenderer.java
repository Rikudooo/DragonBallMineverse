
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StorySpopovichEntity;
import net.mcreator.dbm.client.model.ModelSpopovich;

import com.mojang.blaze3d.vertex.PoseStack;

public class StorySpopovichRenderer extends MobRenderer<StorySpopovichEntity, ModelSpopovich<StorySpopovichEntity>> {
	public StorySpopovichRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpopovich(context.bakeLayer(ModelSpopovich.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StorySpopovichEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(StorySpopovichEntity entity) {
		return new ResourceLocation("dbm:textures/entities/spopovich.png");
	}
}
