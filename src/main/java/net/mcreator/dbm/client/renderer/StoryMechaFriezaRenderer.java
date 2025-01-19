
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.StoryMechaFriezaEntity;
import net.mcreator.dbm.client.model.ModelMechaFrieza;

public class StoryMechaFriezaRenderer extends MobRenderer<StoryMechaFriezaEntity, ModelMechaFrieza<StoryMechaFriezaEntity>> {
	public StoryMechaFriezaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMechaFrieza(context.bakeLayer(ModelMechaFrieza.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoryMechaFriezaEntity entity) {
		return new ResourceLocation("dbm:textures/entities/mechafriezatexture.png");
	}
}
