package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class FusingItemRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Fusion = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
