package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnGroupLeaderProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1);
	}
}
