
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.Dinosaur1Entity;
import net.mcreator.dbm.client.model.ModelRaptor;

import com.mojang.blaze3d.vertex.PoseStack;

public class Dinosaur1Renderer extends MobRenderer<Dinosaur1Entity, ModelRaptor<Dinosaur1Entity>> {
	public Dinosaur1Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelRaptor(context.bakeLayer(ModelRaptor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(Dinosaur1Entity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Dinosaur1Entity entity) {
		return new ResourceLocation("dbm:textures/entities/raptor.png");
	}
}
