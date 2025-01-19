package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class KiBlastWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.getPersistentData().putDouble("timeAlive", (immediatesourceentity.getPersistentData().getDouble("timeAlive") + 1));
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
			immediatesourceentity.getPersistentData().putDouble("xv", (immediatesourceentity.getDeltaMovement().x()));
			immediatesourceentity.getPersistentData().putDouble("yv", (immediatesourceentity.getDeltaMovement().y()));
			immediatesourceentity.getPersistentData().putDouble("zv", (immediatesourceentity.getDeltaMovement().z()));
		}
		immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getPersistentData().getDouble("xv")), (immediatesourceentity.getPersistentData().getDouble("yv")), (immediatesourceentity.getPersistentData().getDouble("zv"))));
		if (immediatesourceentity.getPersistentData().getDouble("timeAlive") >= 600) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
