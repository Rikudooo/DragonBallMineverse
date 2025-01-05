package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class DespawnKiBlastProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}
