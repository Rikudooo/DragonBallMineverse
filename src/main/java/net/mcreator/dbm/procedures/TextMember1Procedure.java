package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class TextMember1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Leader - " + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName1;
	}
}
