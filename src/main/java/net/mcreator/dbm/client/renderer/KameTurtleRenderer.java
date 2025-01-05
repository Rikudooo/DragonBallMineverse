
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.KameTurtleEntity;
import net.mcreator.dbm.client.model.Modelkameturtle;

public class KameTurtleRenderer extends MobRenderer<KameTurtleEntity, Modelkameturtle<KameTurtleEntity>> {
	public KameTurtleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkameturtle(context.bakeLayer(Modelkameturtle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KameTurtleEntity entity) {
		return new ResourceLocation("dbm:textures/entities/kameturtle.png.png");
	}
}
