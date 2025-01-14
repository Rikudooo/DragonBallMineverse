
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.dbm.client.renderer.StoryTienshinhanRenderer;
import net.mcreator.dbm.client.renderer.StoryRaditzRenderer;
import net.mcreator.dbm.client.renderer.StoryPiccoloRenderer;
import net.mcreator.dbm.client.renderer.StoryPiccoloGiantRenderer;
import net.mcreator.dbm.client.renderer.ShenronRenderer;
import net.mcreator.dbm.client.renderer.SabertoothRenderer;
import net.mcreator.dbm.client.renderer.PunchingBagRenderer;
import net.mcreator.dbm.client.renderer.PowerPoleEntityRenderer;
import net.mcreator.dbm.client.renderer.PopoRenderer;
import net.mcreator.dbm.client.renderer.NorthKaioRenderer;
import net.mcreator.dbm.client.renderer.MasterPiccoloRenderer;
import net.mcreator.dbm.client.renderer.MasterKorinRenderer;
import net.mcreator.dbm.client.renderer.KingEnmaRenderer;
import net.mcreator.dbm.client.renderer.KameTurtleRenderer;
import net.mcreator.dbm.client.renderer.KameSenninRenderer;
import net.mcreator.dbm.client.renderer.KameHouseSpawnerRenderer;
import net.mcreator.dbm.client.renderer.GregoryRenderer;
import net.mcreator.dbm.client.renderer.DragonBallE7Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE6Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE5Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE4Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE3Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE2Renderer;
import net.mcreator.dbm.client.renderer.DragonBallE1Renderer;
import net.mcreator.dbm.client.renderer.Dinosaur1Renderer;
import net.mcreator.dbm.client.renderer.DendeRenderer;
import net.mcreator.dbm.client.renderer.BubblesRenderer;
import net.mcreator.dbm.client.renderer.BearThiefRenderer;
import net.mcreator.dbm.client.renderer.AdminPunchingBagRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DbmModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DbmModEntities.KI_BLAST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DbmModEntities.KING_ENMA.get(), KingEnmaRenderer::new);
		event.registerEntityRenderer(DbmModEntities.POWER_POLE_ENTITY.get(), PowerPoleEntityRenderer::new);
		event.registerEntityRenderer(DbmModEntities.NORTH_KAIO.get(), NorthKaioRenderer::new);
		event.registerEntityRenderer(DbmModEntities.BUBBLES.get(), BubblesRenderer::new);
		event.registerEntityRenderer(DbmModEntities.GREGORY.get(), GregoryRenderer::new);
		event.registerEntityRenderer(DbmModEntities.SPIRIT_BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DbmModEntities.PUNCHING_BAG.get(), PunchingBagRenderer::new);
		event.registerEntityRenderer(DbmModEntities.ADMIN_PUNCHING_BAG.get(), AdminPunchingBagRenderer::new);
		event.registerEntityRenderer(DbmModEntities.SHENRON.get(), ShenronRenderer::new);
		event.registerEntityRenderer(DbmModEntities.MASTER_KORIN.get(), MasterKorinRenderer::new);
		event.registerEntityRenderer(DbmModEntities.MASTER_PICCOLO.get(), MasterPiccoloRenderer::new);
		event.registerEntityRenderer(DbmModEntities.DENDE.get(), DendeRenderer::new);
		event.registerEntityRenderer(DbmModEntities.POPO.get(), PopoRenderer::new);
		event.registerEntityRenderer(DbmModEntities.SABERTOOTH.get(), SabertoothRenderer::new);
		event.registerEntityRenderer(DbmModEntities.BEAR_THIEF.get(), BearThiefRenderer::new);
		event.registerEntityRenderer(DbmModEntities.DINOSAUR_1.get(), Dinosaur1Renderer::new);
		event.registerEntityRenderer(DbmModEntities.KAME_SENNIN.get(), KameSenninRenderer::new);
		event.registerEntityRenderer(DbmModEntities.KAME_TURTLE.get(), KameTurtleRenderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_1.get(), DragonBallE1Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_2.get(), DragonBallE2Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_3.get(), DragonBallE3Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_4.get(), DragonBallE4Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_5.get(), DragonBallE5Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_6.get(), DragonBallE6Renderer::new);
		event.registerEntityRenderer(DbmModEntities.DRAGON_BALL_E_7.get(), DragonBallE7Renderer::new);
		event.registerEntityRenderer(DbmModEntities.GIANT_KI_BLAST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DbmModEntities.STORY_TIENSHINHAN.get(), StoryTienshinhanRenderer::new);
		event.registerEntityRenderer(DbmModEntities.STORY_PICCOLO.get(), StoryPiccoloRenderer::new);
		event.registerEntityRenderer(DbmModEntities.STORY_PICCOLO_GIANT.get(), StoryPiccoloGiantRenderer::new);
		event.registerEntityRenderer(DbmModEntities.KAME_HOUSE_SPAWNER.get(), KameHouseSpawnerRenderer::new);
		event.registerEntityRenderer(DbmModEntities.STORY_RADITZ.get(), StoryRaditzRenderer::new);
	}
}
