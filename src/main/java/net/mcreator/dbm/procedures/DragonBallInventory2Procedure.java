package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class DragonBallInventory2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DbmModVariables.MapVariables.get(world).DBx2 = entity.getX();
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DBy2 = entity.getY();
		DbmModVariables.MapVariables.get(world).syncData(world);
		DbmModVariables.MapVariables.get(world).DBz2 = entity.getZ();
		DbmModVariables.MapVariables.get(world).syncData(world);
	}
}
