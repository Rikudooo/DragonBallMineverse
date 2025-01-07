
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.ShenronEntity;
import net.mcreator.dbm.client.model.ModelShenron119;

import com.mojang.blaze3d.vertex.PoseStack;

public class ShenronRenderer extends MobRenderer<ShenronEntity, ModelShenron119<ShenronEntity>> {
	public ShenronRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShenron119(context.bakeLayer(ModelShenron119.LAYER_LOCATION)), 0.8f);
	}

	@Override
	protected void scale(ShenronEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShenronEntity entity) {
		return new ResourceLocation("dbm:textures/entities/shenrontexture.png");
	}
}
