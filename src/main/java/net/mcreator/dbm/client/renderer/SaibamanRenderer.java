
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.SaibamanEntity;
import net.mcreator.dbm.client.model.Modelsaibaman;

import com.mojang.blaze3d.vertex.PoseStack;

public class SaibamanRenderer extends MobRenderer<SaibamanEntity, Modelsaibaman<SaibamanEntity>> {
	public SaibamanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaibaman(context.bakeLayer(Modelsaibaman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SaibamanEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaibamanEntity entity) {
		return new ResourceLocation("dbm:textures/entities/saibaman.png");
	}
}
