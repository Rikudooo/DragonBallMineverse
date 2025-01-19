package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.dbm.entity.YardrattanEntity;

public class YardratOnInitialSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YardrattanEntity _datEntSetI)
			_datEntSetI.getEntityData().set(YardrattanEntity.DATA_Texture, Mth.nextInt(RandomSource.create(), 1, 2));
	}
}
