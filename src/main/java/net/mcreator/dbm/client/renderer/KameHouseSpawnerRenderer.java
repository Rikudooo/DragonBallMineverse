
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.dbm.entity.KameHouseSpawnerEntity;

public class KameHouseSpawnerRenderer extends HumanoidMobRenderer<KameHouseSpawnerEntity, HumanoidModel<KameHouseSpawnerEntity>> {
	public KameHouseSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(KameHouseSpawnerEntity entity) {
		return new ResourceLocation("dbm:textures/entities/notexture.png");
	}

	@Override
	protected boolean isBodyVisible(KameHouseSpawnerEntity entity) {
		return false;
	}
}
