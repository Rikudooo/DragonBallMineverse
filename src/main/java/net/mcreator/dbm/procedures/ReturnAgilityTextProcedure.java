package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnAgilityTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Agility: Increase Speed / STM / DEF: " + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility);
	}
}
