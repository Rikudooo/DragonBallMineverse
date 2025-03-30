package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CoolerNUpProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Cooler")) {
			{
				String _setval = "dbm:textures/entities/aura_arcosian.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_1_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin1ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_2_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin2ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_3_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin3ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_4_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin4ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 7.5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 6;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden")) {
			{
				String _setval = "dbm:textures/entities/aura_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_1_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin1ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_2_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin2ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin3ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_4_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin4ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 14.5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 25;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.05;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Perfect Golden")) {
			{
				String _setval = "dbm:textures/entities/aura_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_1_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin1ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_2_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin2ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin3ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_4_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin4ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 14.75;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 7;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.05;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Golden Cooler")) {
			{
				String _setval = "dbm:textures/entities/aura_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_1_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin1ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_2_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin2) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin2ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_golden.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin3ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_4_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin4ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 16;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Black")) {
			{
				String _setval = "dbm:textures/entities/aura_black.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_1_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin1ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_final_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin1)
						+ ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin2ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_black.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin3ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/arcosian_4_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4) + ".png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Skin4ID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 20;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 8;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.05;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
