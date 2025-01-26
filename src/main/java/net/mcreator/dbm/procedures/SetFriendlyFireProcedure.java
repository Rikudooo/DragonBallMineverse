package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class SetFriendlyFireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Off")) {
			{
				String _setval = "On";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FriendlyFire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("On")) {
			{
				String _setval = "Kill";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FriendlyFire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Kill")) {
			{
				String _setval = "Off";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FriendlyFire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Off")
				|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("On")
				|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Kill"))) {
			{
				String _setval = "Off";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FriendlyFire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
