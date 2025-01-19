package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class NamekDBInStoneProcedure {
	public static boolean execute(LevelAccessor world) {
		return DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == false;
	}
}
