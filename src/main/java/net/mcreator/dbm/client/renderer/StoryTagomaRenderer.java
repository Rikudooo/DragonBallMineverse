
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryTagomaEntity;
import net.mcreator.dbm.client.model.ModelTagoma_;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryTagomaRenderer extends MobRenderer<StoryTagomaEntity, ModelTagoma_<StoryTagomaEntity>> {
	public StoryTagomaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTagoma_(context.bakeLayer(ModelTagoma_.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryTagomaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryTagomaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/tagoma.png");
	}
}
