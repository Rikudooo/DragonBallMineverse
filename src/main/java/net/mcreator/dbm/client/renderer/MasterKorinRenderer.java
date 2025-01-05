
package net.mcreator.dbm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dbm.entity.MasterKorinEntity;
import net.mcreator.dbm.client.model.Modelmasterkorin;

public class MasterKorinRenderer extends MobRenderer<MasterKorinEntity, Modelmasterkorin<MasterKorinEntity>> {
	public MasterKorinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmasterkorin(context.bakeLayer(Modelmasterkorin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MasterKorinEntity entity) {
		return new ResourceLocation("dbm:textures/entities/korin.png");
	}
}
