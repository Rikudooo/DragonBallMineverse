package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.dbm.entity.NamekianEntity;

public class NamekianOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof NamekianEntity _datEntSetI)
			_datEntSetI.getEntityData().set(NamekianEntity.DATA_Texture, Mth.nextInt(RandomSource.create(), 1, 3));
	}
}
