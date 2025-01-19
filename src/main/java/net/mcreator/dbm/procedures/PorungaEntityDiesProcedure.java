package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class PorungaEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		DbmModVariables.MapVariables.get(world).PorungaCalled = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).PorungaDemands = 80000;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).PorungaSpawned = false;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).PorungaSpawnTimer = 0;
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).PorungaDemands = 3;
		DbmModVariables.MapVariables.get(world).syncData(world);
	}
}
