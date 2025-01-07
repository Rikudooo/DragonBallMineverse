package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class ShowThreeStarProcedure {
	public static String execute(LevelAccessor world) {
		return DbmModVariables.MapVariables.get(world).DBCoords3;
	}
}
