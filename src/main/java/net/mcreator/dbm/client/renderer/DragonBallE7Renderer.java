
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.client.model.ModelDragonBall;

public class DragonBallE7Renderer extends MobRenderer<DragonBallE7Entity, ModelDragonBall<DragonBallE7Entity>> {
	public DragonBallE7Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelDragonBall(context.bakeLayer(ModelDragonBall.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonBallE7Entity entity) {
		return new ResourceLocation("dbm:textures/entities/dragonballtexture.png");
	}
}
