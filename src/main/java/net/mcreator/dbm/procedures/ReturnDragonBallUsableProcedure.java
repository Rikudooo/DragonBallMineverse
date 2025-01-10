package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnDragonBallUsableProcedure {
	public static boolean execute(LevelAccessor world) {
		return DbmModVariables.MapVariables.get(world).DragonBallsUsable == true;
	}
}
