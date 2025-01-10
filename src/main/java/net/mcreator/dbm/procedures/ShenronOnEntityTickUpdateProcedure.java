package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class ShenronOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (DbmModVariables.MapVariables.get(world).ShenronDemands <= 0) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
