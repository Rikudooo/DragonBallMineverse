package net.mcreator.dbm.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.client.model.Modeltail_saiyan_true;
import net.mcreator.dbm.client.model.Modelssj4_eyeliner;
import net.mcreator.dbm.client.model.Modelspacepod;
import net.mcreator.dbm.client.model.Modeloozarumouth;
import net.mcreator.dbm.client.model.Modelnamekian_antenna;
import net.mcreator.dbm.client.model.Modelhorn_arcosian_third_2;
import net.mcreator.dbm.client.model.Modelhorn_arcosian_third;
import net.mcreator.dbm.client.model.Modelhorn_arcosian_second;
import net.mcreator.dbm.client.model.Modelhorn_arcosian_first;
import net.mcreator.dbm.client.model.Modelhair_zbroly_ssj2;
import net.mcreator.dbm.client.model.Modelhair_zbroly_ssj;
import net.mcreator.dbm.client.model.Modelhair_zbroly_base;
import net.mcreator.dbm.client.model.Modelhair_zamasu_ssj2;
import net.mcreator.dbm.client.model.Modelhair_zamasu_ssj;
import net.mcreator.dbm.client.model.Modelhair_zamasu_base;
import net.mcreator.dbm.client.model.Modelhair_zamasu_2;
import net.mcreator.dbm.client.model.Modelhair_vegetto;
import net.mcreator.dbm.client.model.Modelhair_vegeta;
import net.mcreator.dbm.client.model.Modelhair_trunks_ssj2;
import net.mcreator.dbm.client.model.Modelhair_trunks_ssj;
import net.mcreator.dbm.client.model.Modelhair_trunks_base;
import net.mcreator.dbm.client.model.Modelhair_t_ssj2;
import net.mcreator.dbm.client.model.Modelhair_t_ssj;
import net.mcreator.dbm.client.model.Modelhair_t_base;
import net.mcreator.dbm.client.model.Modelhair_ssj4;
import net.mcreator.dbm.client.model.Modelhair_ssj3;
import net.mcreator.dbm.client.model.Modelhair_sbroly_ssj2;
import net.mcreator.dbm.client.model.Modelhair_sbroly_ssj;
import net.mcreator.dbm.client.model.Modelhair_sbroly_base;
import net.mcreator.dbm.client.model.Modelhair_raditz;
import net.mcreator.dbm.client.model.Modelhair_goku_ssj3;
import net.mcreator.dbm.client.model.Modelhair_goku_ssj2;
import net.mcreator.dbm.client.model.Modelhair_goku_ssj;
import net.mcreator.dbm.client.model.Modelhair_goku_base;
import net.mcreator.dbm.client.model.Modelhair_gohan;
import net.mcreator.dbm.client.model.Modelhair_gogeta;
import net.mcreator.dbm.client.model.Modelhair_16_ssj2;
import net.mcreator.dbm.client.model.Modelhair_16_ssj;
import net.mcreator.dbm.client.model.Modelhair_16_base;
import net.mcreator.dbm.client.model.Modelflyingnimbus;
import net.mcreator.dbm.client.model.Modeleyebrows_6;
import net.mcreator.dbm.client.model.Modeleyebrows_4;
import net.mcreator.dbm.client.model.Modeleyebrows_3;
import net.mcreator.dbm.client.model.Modeleyebrows_2;
import net.mcreator.dbm.client.model.Modeleyebrows_1;
import net.mcreator.dbm.client.model.Modelarcosian_tail_1;
import net.mcreator.dbm.client.model.Modelarcosian_ear;
import net.mcreator.dbm.client.model.Modelarcosian_cooler_3;
import net.mcreator.dbm.client.model.Modelarcosian_cooler_2;
import net.mcreator.dbm.client.model.Modelarcosian_cooler;
import net.mcreator.dbm.client.model.Modelandroid_palm;
import net.mcreator.dbm.client.model.ModelScouterScreen;
import net.mcreator.dbm.client.model.ModelScouter;
import net.mcreator.dbm.client.model.ModelHalo;
import net.mcreator.dbm.client.model.ModelAura;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RenderPlayerCustomizationProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		poseStack.pushPose();
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).CreationUnfinished == true) {
			poseStack.scale(
					(float) ((0.8 + ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Width - 0.8)
							* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale),
					(float) ((0.6 + ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Height - 0.6)
							* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale),
					(float) ((0.8 + ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Width - 0.8)
							* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale));
		} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).CreationUnfinished == false) {
			poseStack.scale(
					(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Width
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale),
					(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Height
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale),
					(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Width
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Scale));
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2ID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2ID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesTypeID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesTypeID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesColorID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesColorID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
			if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MouthID)) != null) {
				_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MouthID));
			}
			new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(),
					_evt.getPackedLight());
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Oozaru")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/oozaru.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/oozaru.png");
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/oozarumouth.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/oozarumouth.png");
				}
				Modeloozarumouth newModel = new Modeloozarumouth(context.bakeLayer(Modeloozarumouth.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Oozaru")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/goldenoozaru.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/goldenoozaru.png");
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/goldenoozarumouth.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/goldenoozarumouth.png");
				}
				Modeloozarumouth newModel = new Modeloozarumouth(context.bakeLayer(Modeloozarumouth.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).BodyType).equals("Humanoid")) {
			if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Saiyan")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Half-Saiyan"))) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_goku_base newModel = new Modelhair_goku_base(context.bakeLayer(Modelhair_goku_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_t_base newModel = new Modelhair_t_base(context.bakeLayer(Modelhair_t_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_vegeta newModel = new Modelhair_vegeta(context.bakeLayer(Modelhair_vegeta.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_gohan newModel = new Modelhair_gohan(context.bakeLayer(Modelhair_gohan.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_trunks_base newModel = new Modelhair_trunks_base(context.bakeLayer(Modelhair_trunks_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 6) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_16_base newModel = new Modelhair_16_base(context.bakeLayer(Modelhair_16_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 7) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_raditz newModel = new Modelhair_raditz(context.bakeLayer(Modelhair_raditz.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 8) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_zamasu_base newModel = new Modelhair_zamasu_base(context.bakeLayer(Modelhair_zamasu_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 9) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_zamasu_2 newModel = new Modelhair_zamasu_2(context.bakeLayer(Modelhair_zamasu_2.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 10) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_gogeta newModel = new Modelhair_gogeta(context.bakeLayer(Modelhair_gogeta.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 11) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_vegetto newModel = new Modelhair_vegetto(context.bakeLayer(Modelhair_vegetto.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 12) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_sbroly_base newModel = new Modelhair_sbroly_base(context.bakeLayer(Modelhair_sbroly_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 13) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_zbroly_base newModel = new Modelhair_zbroly_base(context.bakeLayer(Modelhair_zbroly_base.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				}
			} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Saiyan")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Half-Saiyan")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 1) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_goku_base newModel = new Modelhair_goku_base(context.bakeLayer(Modelhair_goku_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_goku_ssj newModel = new Modelhair_goku_ssj(context.bakeLayer(Modelhair_goku_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 2")) {
							if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
								ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
								if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
									_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
								}
								Modelhair_goku_ssj2 newModel = new Modelhair_goku_ssj2(context.bakeLayer(Modelhair_goku_ssj2.LAYER_LOCATION));
								newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
								newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
								newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
								newModel.RightArm.copyFrom(_pr.getModel().rightArm);
								newModel.Body.copyFrom(_pr.getModel().body);
								newModel.Head.copyFrom(_pr.getModel().head);
								poseStack.pushPose();
								poseStack.scale(0.9375F, 0.9375F, 0.9375F);
								new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
										_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
								poseStack.popPose();
							}
						} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 3")) {
							if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
								ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
								if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
									_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
								}
								Modelhair_goku_ssj3 newModel = new Modelhair_goku_ssj3(context.bakeLayer(Modelhair_goku_ssj3.LAYER_LOCATION));
								newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
								newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
								newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
								newModel.RightArm.copyFrom(_pr.getModel().rightArm);
								newModel.Body.copyFrom(_pr.getModel().body);
								newModel.Head.copyFrom(_pr.getModel().head);
								poseStack.pushPose();
								poseStack.scale(0.9375F, 0.9375F, 0.9375F);
								new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
										_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
								poseStack.popPose();
							}
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 2) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_t_base newModel = new Modelhair_t_base(context.bakeLayer(Modelhair_t_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_t_ssj newModel = new Modelhair_t_ssj(context.bakeLayer(Modelhair_t_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_t_ssj2 newModel = new Modelhair_t_ssj2(context.bakeLayer(Modelhair_t_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_vegeta newModel = new Modelhair_vegeta(context.bakeLayer(Modelhair_vegeta.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_gohan newModel = new Modelhair_gohan(context.bakeLayer(Modelhair_gohan.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 5) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_trunks_base newModel = new Modelhair_trunks_base(context.bakeLayer(Modelhair_trunks_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_trunks_ssj newModel = new Modelhair_trunks_ssj(context.bakeLayer(Modelhair_trunks_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_trunks_ssj2 newModel = new Modelhair_trunks_ssj2(context.bakeLayer(Modelhair_trunks_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 6) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_16_base newModel = new Modelhair_16_base(context.bakeLayer(Modelhair_16_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_16_ssj newModel = new Modelhair_16_ssj(context.bakeLayer(Modelhair_16_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_16_ssj2 newModel = new Modelhair_16_ssj2(context.bakeLayer(Modelhair_16_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 7) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_raditz newModel = new Modelhair_raditz(context.bakeLayer(Modelhair_raditz.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 8) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zamasu_base newModel = new Modelhair_zamasu_base(context.bakeLayer(Modelhair_zamasu_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zamasu_ssj newModel = new Modelhair_zamasu_ssj(context.bakeLayer(Modelhair_zamasu_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zamasu_ssj2 newModel = new Modelhair_zamasu_ssj2(context.bakeLayer(Modelhair_zamasu_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 9) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_zamasu_2 newModel = new Modelhair_zamasu_2(context.bakeLayer(Modelhair_zamasu_2.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 10) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_gogeta newModel = new Modelhair_gogeta(context.bakeLayer(Modelhair_gogeta.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 11) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_vegetto newModel = new Modelhair_vegetto(context.bakeLayer(Modelhair_vegetto.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 12) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_sbroly_base newModel = new Modelhair_sbroly_base(context.bakeLayer(Modelhair_sbroly_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_sbroly_ssj newModel = new Modelhair_sbroly_ssj(context.bakeLayer(Modelhair_sbroly_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_sbroly_ssj2 newModel = new Modelhair_sbroly_ssj2(context.bakeLayer(Modelhair_sbroly_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle == 13) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Base")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zbroly_base newModel = new Modelhair_zbroly_base(context.bakeLayer(Modelhair_zbroly_base.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zbroly_ssj newModel = new Modelhair_zbroly_ssj(context.bakeLayer(Modelhair_zbroly_ssj.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan 2")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_zbroly_ssj2 newModel = new Modelhair_zbroly_ssj2(context.bakeLayer(Modelhair_zbroly_ssj2.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				}
				if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 3")) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle != 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
								_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
							}
							Modelhair_ssj3 newModel = new Modelhair_ssj3(context.bakeLayer(Modelhair_ssj3.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 4")) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("dbm:textures/entities/hair_sfpsj4_big.png") != null) {
							_texture = new ResourceLocation("dbm:textures/entities/hair_sfpsj4_big.png");
						}
						Modelssj4_eyeliner newModel = new Modelssj4_eyeliner(context.bakeLayer(Modelssj4_eyeliner.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modelhair_ssj4 newModel = new Modelhair_ssj4(context.bakeLayer(Modelhair_ssj4.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				}
			}
			if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan 3")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_1 newModel = new Modeleyebrows_1(context.bakeLayer(Modeleyebrows_1.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_2 newModel = new Modeleyebrows_2(context.bakeLayer(Modeleyebrows_2.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_3 newModel = new Modeleyebrows_3(context.bakeLayer(Modeleyebrows_3.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_4 newModel = new Modeleyebrows_4(context.bakeLayer(Modeleyebrows_4.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_4 newModel = new Modeleyebrows_4(context.bakeLayer(Modeleyebrows_4.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyeBrows == 6) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID)) != null) {
							_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID));
						}
						Modeleyebrows_6 newModel = new Modeleyebrows_6(context.bakeLayer(Modeleyebrows_6.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Android")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/kiabsorber.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/kiabsorber.png");
					}
					Modelandroid_palm newModel = new Modelandroid_palm(context.bakeLayer(Modelandroid_palm.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).BodyType).equals("Namekian")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
					_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
				}
				Modelnamekian_antenna newModel = new Modelnamekian_antenna(context.bakeLayer(Modelnamekian_antenna.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).BodyType).equals("Arcosian")) {
			if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Perfect Golden")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Cooler")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden"))) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
					}
					Modelarcosian_ear newModel = new Modelarcosian_ear(context.bakeLayer(Modelarcosian_ear.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Perfect Golden")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Cooler")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_ear newModel = new Modelarcosian_ear(context.bakeLayer(Modelarcosian_ear.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Base")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/hair1big.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/hair1big.png");
					}
					Modelhorn_arcosian_first newModel = new Modelhorn_arcosian_first(context.bakeLayer(Modelhorn_arcosian_first.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Second")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/hair1big.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/hair1big.png");
					}
					Modelhorn_arcosian_second newModel = new Modelhorn_arcosian_second(context.bakeLayer(Modelhorn_arcosian_second.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Third")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
					}
					Modelhorn_arcosian_third newModel = new Modelhorn_arcosian_third(context.bakeLayer(Modelhorn_arcosian_third.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID));
					}
					Modelhorn_arcosian_third_2 newModel = new Modelhorn_arcosian_third_2(context.bakeLayer(Modelhorn_arcosian_third_2.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Cooler")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
					}
					Modelarcosian_cooler newModel = new Modelarcosian_cooler(context.bakeLayer(Modelarcosian_cooler.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
					}
					Modelarcosian_cooler_3 newModel = new Modelarcosian_cooler_3(context.bakeLayer(Modelarcosian_cooler_3.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1ID));
					}
					Modelarcosian_cooler_2 newModel = new Modelarcosian_cooler_2(context.bakeLayer(Modelarcosian_cooler_2.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Cooler")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_cooler newModel = new Modelarcosian_cooler(context.bakeLayer(Modelarcosian_cooler.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_cooler_3 newModel = new Modelarcosian_cooler_3(context.bakeLayer(Modelarcosian_cooler_3.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID));
					}
					Modelarcosian_cooler_2 newModel = new Modelarcosian_cooler_2(context.bakeLayer(Modelarcosian_cooler_2.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Final Form")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Cooler")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Perfect Golden")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Cooler")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID)) != null) {
						_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID));
					}
					Modelarcosian_tail_1 newModel = new Modelarcosian_tail_1(context.bakeLayer(Modelarcosian_tail_1.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Tail == true) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TailColorID)) != null) {
					_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TailColorID));
				}
				Modeltail_saiyan_true newModel = new Modeltail_saiyan_true(context.bakeLayer(Modeltail_saiyan_true.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Dead == true) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/halo.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/halo.png");
				}
				ModelHalo newModel = new ModelHalo(context.bakeLayer(ModelHalo.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).RiddingNimbus == true) {
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Alignment).equals("Good")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/flyingnimbustexture.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/flyingnimbustexture.png");
					}
					Modelflyingnimbus newModel = new Modelflyingnimbus(context.bakeLayer(Modelflyingnimbus.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Alignment).equals("Neutral")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Alignment).equals("Evil")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/darkflyingnimbustexture.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/darkflyingnimbustexture.png");
					}
					Modelflyingnimbus newModel = new Modelflyingnimbus(context.bakeLayer(Modelflyingnimbus.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SubForm).equals("Babidi's Magic")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/babidimagic.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/babidimagic.png");
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Headwear).equals("None")) {
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Headwear).contains("scouter")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("dbm:textures/entities/scouter.png") != null) {
						_texture = new ResourceLocation("dbm:textures/entities/scouter.png");
					}
					ModelScouter newModel = new ModelScouter(context.bakeLayer(ModelScouter.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("dbm:textures/entities/scouter_" + new java.text.DecimalFormat("##").format(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Headwear).replace("scouter_", ""))) + "_"
							+ new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterMode) + ".png")) != null) {
						_texture = new ResourceLocation(("dbm:textures/entities/scouter_" + new java.text.DecimalFormat("##").format(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Headwear).replace("scouter_", ""))) + "_"
								+ new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterMode) + ".png"));
					}
					ModelScouterScreen newModel = new ModelScouterScreen(context.bakeLayer(ModelScouterScreen.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePod == true) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("dbm:textures/entities/spacepod.png") != null) {
					_texture = new ResourceLocation("dbm:textures/entities/spacepod.png");
				}
				Modelspacepod newModel = new Modelspacepod(context.bakeLayer(Modelspacepod.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				if (_evt instanceof RenderLivingEvent.Pre _pre) {
					_pre.setCanceled(true);
				}
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Aura == true) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).AuraTextureD)) != null) {
					_texture = new ResourceLocation(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).AuraTextureD));
				}
				ModelAura newModel = new ModelAura(context.bakeLayer(ModelAura.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		poseStack.popPose();
	}
}
