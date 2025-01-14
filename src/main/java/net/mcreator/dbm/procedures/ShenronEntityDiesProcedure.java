package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class ShenronEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		DbmModVariables.MapVariables.get(world).ShenronCalled = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DragonBallsUsable = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DragonBallTimer = 240000;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).ShenronSpawned = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).ShenronSpawnTimer = 0;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).ShenronDemands = 3;
		DbmModVariables.MapVariables.get(world).syncData(world);
	}
}
