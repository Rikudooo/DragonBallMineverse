package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class DragonBallInventory4Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DbmModVariables.MapVariables.get(world).DBx4 = entity.getX();
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DBy4 = entity.getY();
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DBz4 = entity.getZ();
		DbmModVariables.MapVariables.get(world).syncData(world);
	}
}
