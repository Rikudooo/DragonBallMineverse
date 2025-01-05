package net.mcreator.dbm.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.dbm.configuration.DbmconfigsConfiguration;
import net.mcreator.dbm.DbmMod;

@Mod.EventBusSubscriber(modid = DbmMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbmModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DbmconfigsConfiguration.SPEC, "dragonballmineverse.toml");
		});
	}
}
