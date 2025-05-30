package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class FormGUIOpenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Kaioken")) {
			{
				double _setval = 4;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 15000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Zenkai Boost")) {
			{
				double _setval = 30;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3500;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Babidi's Magic")) {
			{
				double _setval = 1;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Super Saiyan")) {
			{
				double _setval = 4;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 25000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Super Saiyan 2")) {
			{
				double _setval = 6;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 50000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("SSJG")) {
			{
				double _setval = 7;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 250000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Super Saiyan Blue")) {
			{
				double _setval = 8;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 300000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Mystic")) {
			{
				double _setval = 7;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 100000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Super Saiyan Rage")) {
			{
				double _setval = 8;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 250000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Beast")) {
			{
				double _setval = 9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 450000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Suppression")) {
			{
				double _setval = 4;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Cooler")) {
			{
				double _setval = 5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 30000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Golden")) {
			{
				double _setval = 7;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 250000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Golden Cooler")) {
			{
				double _setval = 8;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 300000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Black")) {
			{
				double _setval = 9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 450000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Great Namekian")) {
			{
				double _setval = 1;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 15000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Full Power")) {
			{
				double _setval = 2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 25000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Super Namekian")) {
			{
				double _setval = 3;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 250000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Power Awaken")) {
			{
				double _setval = 4;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 575000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Orange Namekian")) {
			{
				double _setval = 4;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Unleashed Power")) {
			{
				double _setval = 1;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 15000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormPath).equals("Selflessness State")) {
			{
				double _setval = 2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxRacialLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 50000;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialTPCost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
