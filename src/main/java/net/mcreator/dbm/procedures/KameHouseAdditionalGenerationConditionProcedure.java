package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class KameHouseAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (DbmModVariables.MapVariables.get(world).KameHouseSpawned == false) {
			DbmModVariables.MapVariables.get(world).KameHouseSpawned = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
			SetKameHouseCoordsProcedure.execute(world, x, y, z);
			return true;
		}
		return false;
	}
}
