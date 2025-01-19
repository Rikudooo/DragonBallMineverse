package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class NamekChunkLoaderOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world) {
		if (DbmModVariables.MapVariables.get(world).NamekDragonBallTimer > 0) {
			DbmModVariables.MapVariables.get(world).NamekDragonBallTimer = DbmModVariables.MapVariables.get(world).NamekDragonBallTimer - 1;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NamekDragonBallTimer <= 0 && DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == false) {
			DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
