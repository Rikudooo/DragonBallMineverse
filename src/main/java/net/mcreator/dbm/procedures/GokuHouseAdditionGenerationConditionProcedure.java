package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class GokuHouseAdditionGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		double rndX = 0;
		double loop = 0;
		double y_ = 0;
		double rndZ = 0;
		if (DbmModVariables.MapVariables.get(world).GokuHouseSpawn == false) {
			DbmModVariables.MapVariables.get(world).GokuHouseSpawn = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
			GokuHouseAdditionGenerationConditionProcedure.execute(world, x, z);
			return true;
		}
		return false;
	}
}
