package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class AlignmentTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Alignment: " + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Alignment;
	}
}
