
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.WhisEntity;
import net.mcreator.dbm.client.model.ModelWhis;

import com.mojang.blaze3d.vertex.PoseStack;

public class WhisRenderer extends MobRenderer<WhisEntity, ModelWhis<WhisEntity>> {
	public WhisRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWhis(context.bakeLayer(ModelWhis.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(WhisEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhisEntity entity) {
		return new ResourceLocation("dbm:textures/entities/whistexture.png");
	}
}
