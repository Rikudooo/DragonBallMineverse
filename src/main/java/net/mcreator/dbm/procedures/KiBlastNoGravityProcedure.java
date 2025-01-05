package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class KiBlastNoGravityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
		}
	}
}
