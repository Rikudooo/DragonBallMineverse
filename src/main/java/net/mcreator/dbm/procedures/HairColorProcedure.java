package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class HairColorProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairColor);
	}
}
