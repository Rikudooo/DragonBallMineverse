
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.DendeEntity;
import net.mcreator.dbm.client.model.ModelDende;

import com.mojang.blaze3d.vertex.PoseStack;

public class DendeRenderer extends MobRenderer<DendeEntity, ModelDende<DendeEntity>> {
	public DendeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDende(context.bakeLayer(ModelDende.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(DendeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(DendeEntity entity) {
		return new ResourceLocation("dbm:textures/entities/dende.png");
	}
}
