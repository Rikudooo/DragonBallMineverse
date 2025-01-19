
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.PorungaEntity;
import net.mcreator.dbm.client.model.ModelPorunga;

import com.mojang.blaze3d.vertex.PoseStack;

public class PorungaRenderer extends MobRenderer<PorungaEntity, ModelPorunga<PorungaEntity>> {
	public PorungaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPorunga(context.bakeLayer(ModelPorunga.LAYER_LOCATION)), 0.8f);
	}

	@Override
	protected void scale(PorungaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(PorungaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/porunga.png");
	}
}
