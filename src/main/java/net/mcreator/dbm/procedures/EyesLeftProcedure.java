package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class EyesLeftProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType > 1) {
			{
				double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType - 1;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EyesType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType == 1) {
			{
				double _setval = 5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EyesType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
