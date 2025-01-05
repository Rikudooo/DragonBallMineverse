
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.KingEnmaEntity;
import net.mcreator.dbm.client.model.ModelKingEnma;

import com.mojang.blaze3d.vertex.PoseStack;

public class KingEnmaRenderer extends MobRenderer<KingEnmaEntity, ModelKingEnma<KingEnmaEntity>> {
	public KingEnmaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKingEnma(context.bakeLayer(ModelKingEnma.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(KingEnmaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingEnmaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kingenma.png");
	}
}
