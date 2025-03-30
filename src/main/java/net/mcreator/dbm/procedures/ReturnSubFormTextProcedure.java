package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnSubFormTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7c" + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SubForm + ": " + "x"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SubFormBoost) + "\u00A7f | \u00A7b"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiDrain) + "Ki/s";
	}
}
