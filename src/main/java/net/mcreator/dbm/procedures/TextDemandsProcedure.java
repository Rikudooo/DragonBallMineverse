package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class TextDemandsProcedure {
	public static String execute(LevelAccessor world) {
		return "Demands: " + new java.text.DecimalFormat("##").format(DbmModVariables.MapVariables.get(world).ShenronDemands);
	}
}
