
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryShisamiEntity;
import net.mcreator.dbm.client.model.ModelShisami;

import com.mojang.blaze3d.vertex.PoseStack;

public class StoryShisamiRenderer extends MobRenderer<StoryShisamiEntity, ModelShisami<StoryShisamiEntity>> {
	public StoryShisamiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShisami(context.bakeLayer(ModelShisami.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(StoryShisamiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryShisamiEntity entity) {
		return new ResourceLocation("dbm:textures/entities/shisami.png");
	}
}
