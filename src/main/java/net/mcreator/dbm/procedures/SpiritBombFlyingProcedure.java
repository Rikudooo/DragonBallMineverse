package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class SpiritBombFlyingProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity.isNoGravity() == false) {
			immediatesourceentity.setNoGravity(true);
		}
		if (immediatesourceentity.getPersistentData().getBoolean("SizeSet") == false) {
			immediatesourceentity.getPersistentData().putDouble("KiAttackSize", (19.7 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
			immediatesourceentity.getPersistentData().putDouble("KiAttackSize2", (20 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
			immediatesourceentity.getPersistentData().putBoolean("SizeSet", true);
		}
	}
}
