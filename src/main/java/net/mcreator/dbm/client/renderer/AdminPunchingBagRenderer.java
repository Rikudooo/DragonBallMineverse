
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.AdminPunchingBagEntity;
import net.mcreator.dbm.client.model.ModelPunchingBag;

public class AdminPunchingBagRenderer extends MobRenderer<AdminPunchingBagEntity, ModelPunchingBag<AdminPunchingBagEntity>> {
	public AdminPunchingBagRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPunchingBag(context.bakeLayer(ModelPunchingBag.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AdminPunchingBagEntity entity) {
		return new ResourceLocation("dbm:textures/entities/blue_wool.png");
	}
}
