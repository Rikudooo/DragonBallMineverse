
package net.mcreator.dbm.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.procedures.ReturnPoleProcedure;
import net.mcreator.dbm.procedures.PoleExistProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ShowOverlay {
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
		if (true) {
			if (PoleExistProcedure.execute(world, x, y, z))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ReturnPoleProcedure.execute(world, x, y, z), w / 2 + -213, h / 2 + -120, -3407872, false);
		}
	}
}
