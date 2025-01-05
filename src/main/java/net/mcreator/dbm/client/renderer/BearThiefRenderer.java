
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.BearThiefEntity;
import net.mcreator.dbm.client.model.Modelbearthief;

import com.mojang.blaze3d.vertex.PoseStack;

public class BearThiefRenderer extends MobRenderer<BearThiefEntity, Modelbearthief<BearThiefEntity>> {
	public BearThiefRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbearthief(context.bakeLayer(Modelbearthief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BearThiefEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(BearThiefEntity entity) {
		return new ResourceLocation("dbm:textures/entities/bearthief.png");
	}
}
