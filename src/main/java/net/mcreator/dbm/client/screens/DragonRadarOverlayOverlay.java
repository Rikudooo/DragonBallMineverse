
package net.mcreator.dbm.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.procedures.TextDBDistanceProcedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall7Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall6Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall5Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall4Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall3Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall2Procedure;
import net.mcreator.dbm.procedures.ReturnSelectedDragonBall1Procedure;
import net.mcreator.dbm.procedures.ReturnDragonRadarInHandProcedure;
import net.mcreator.dbm.procedures.ReturnDragonBallUsableProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DragonRadarOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ReturnDragonRadarInHandProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dragonradar.png"), 0, 0, 0, 0, w, h, w, h);
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 22, h - 68, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 39, h - 85, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 66, h - 85, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 84, h - 68, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 39, h - 33, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 53, h - 50, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/db.png"), 67, h - 33, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall1Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 22, h - 68, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall2Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 39, h - 85, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall3Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 66, h - 85, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall4Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 84, h - 68, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall5Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 39, h - 33, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall6Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 53, h - 50, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnSelectedDragonBall7Procedure.execute(world, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/dbselected.png"), 67, h - 33, 0, 0, 6, 6, 6, 6);
			}
			if (ReturnDragonBallUsableProcedure.execute(world))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextDBDistanceProcedure.execute(entity), 39, h - 104, -256, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
