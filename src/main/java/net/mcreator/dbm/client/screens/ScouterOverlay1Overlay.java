
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

import net.mcreator.dbm.procedures.TextScouterPLProcedure;
import net.mcreator.dbm.procedures.TextScouterDistanceProcedure;
import net.mcreator.dbm.procedures.ScouterWeakestProcedure;
import net.mcreator.dbm.procedures.ScouterStrongestProcedure;
import net.mcreator.dbm.procedures.ScouterOnProcedure;
import net.mcreator.dbm.procedures.ScouterNearestProcedure;
import net.mcreator.dbm.procedures.ScouterLockedProcedure;
import net.mcreator.dbm.procedures.GreenScouterWornProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ScouterOverlay1Overlay {
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
		if (GreenScouterWornProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/grnscouteroverlay.png"), 0, 0, 0, 0, w, h, w, h);
			if (ScouterStrongestProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/scouterstrongest.png"), 59, h / 2 + 3, 0, 0, 38, 31, 38, 31);
			}
			if (ScouterOnProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/scouterunlocked.png"), 70, h / 2 + -40, 0, 0, 33, 33, 33, 33);
			}
			if (ScouterWeakestProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/scouterweakest.png"), 59, h / 2 + 2, 0, 0, 38, 31, 38, 31);
			}
			if (ScouterLockedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/scouterlocked.png"), 70, h / 2 + -40, 0, 0, 33, 33, 33, 33);
			}
			if (ScouterNearestProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dbm:textures/screens/scouternearest.png"), 59, h / 2 + 2, 0, 0, 38, 31, 38, 31);
			}
			if (ScouterOnProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextScouterPLProcedure.execute(entity), 107, h / 2 + -4, -5888, false);
			if (ScouterOnProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextScouterDistanceProcedure.execute(entity), 106, h / 2 + 14, -5376, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
