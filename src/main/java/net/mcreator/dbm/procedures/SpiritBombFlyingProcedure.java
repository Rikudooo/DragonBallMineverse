package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class SpiritBombFlyingProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		immediatesourceentity.getPersistentData().putDouble("timeAlive", (immediatesourceentity.getPersistentData().getDouble("timeAlive") + 1));
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
			immediatesourceentity.getPersistentData().putDouble("xv", (immediatesourceentity.getDeltaMovement().x()));
			immediatesourceentity.getPersistentData().putDouble("yv", (immediatesourceentity.getDeltaMovement().y()));
			immediatesourceentity.getPersistentData().putDouble("zv", (immediatesourceentity.getDeltaMovement().z()));
			if (immediatesourceentity.getPersistentData().getBoolean("SizeSet") == false) {
				immediatesourceentity.getPersistentData().putDouble("KiAttackSize", (19.7 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
				immediatesourceentity.getPersistentData().putDouble("KiAttackSize2", (20 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
				immediatesourceentity.getPersistentData().putBoolean("SizeSet", true);
			}
		}
		immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getPersistentData().getDouble("xv")), (immediatesourceentity.getPersistentData().getDouble("yv")), (immediatesourceentity.getPersistentData().getDouble("zv"))));
		if (immediatesourceentity.getPersistentData().getDouble("timeAlive") >= 600) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
