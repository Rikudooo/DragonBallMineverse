package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.init.DbmModAttributes;

public class PowerPoleEntityOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		entity.getPersistentData().putDouble("Size", ((LivingEntity) entity).getAttribute(DbmModAttributes.POWERPOLESCALE.get()).getBaseValue());
	}
}
