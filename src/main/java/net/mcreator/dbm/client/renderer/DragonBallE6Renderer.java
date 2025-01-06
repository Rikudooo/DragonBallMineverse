
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.client.model.ModelDragonBall;

public class DragonBallE6Renderer extends MobRenderer<DragonBallE6Entity, ModelDragonBall<DragonBallE6Entity>> {
	public DragonBallE6Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelDragonBall(context.bakeLayer(ModelDragonBall.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonBallE6Entity entity) {
		return new ResourceLocation("dbm:textures/entities/dragonballtexture.png");
	}
}
