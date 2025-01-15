package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class DendeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world) {
		if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == false) {
			if (DbmModVariables.MapVariables.get(world).DragonBallTimer > 0) {
				DbmModVariables.MapVariables.get(world).DragonBallTimer = DbmModVariables.MapVariables.get(world).DragonBallTimer - 1;
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (DbmModVariables.MapVariables.get(world).DragonBallTimer <= 0) {
				DbmModVariables.MapVariables.get(world).DragonBallsUsable = true;
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
