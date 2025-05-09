package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class FusionLaunchWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
		}
		immediatesourceentity.getPersistentData().putDouble("Timer", (immediatesourceentity.getPersistentData().getDouble("Timer") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Timer") > 100) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
