
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryYakonEntity;
import net.mcreator.dbm.client.model.ModelYakon;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryYakonRenderer extends MobRenderer<StoryYakonEntity, ModelYakon<StoryYakonEntity>> {
	public StoryYakonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelYakon(context.bakeLayer(ModelYakon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryYakonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryYakonEntity entity) {
		return new ResourceLocation("dbm:textures/entities/yakon.png");
	}
}
