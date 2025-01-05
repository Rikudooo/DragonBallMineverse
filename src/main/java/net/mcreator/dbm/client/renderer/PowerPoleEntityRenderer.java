
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.PowerPoleEntityEntity;
import net.mcreator.dbm.client.model.ModelPowerPole;

public class PowerPoleEntityRenderer extends MobRenderer<PowerPoleEntityEntity, ModelPowerPole<PowerPoleEntityEntity>> {
	public PowerPoleEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPowerPole(context.bakeLayer(ModelPowerPole.LAYER_LOCATION)), 0.081f);
	}

	@Override
	public ResourceLocation getTextureLocation(PowerPoleEntityEntity entity) {
		return new ResourceLocation("dbm:textures/entities/powerpole.png");
	}
}
