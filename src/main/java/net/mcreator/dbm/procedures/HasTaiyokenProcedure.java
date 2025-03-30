package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.init.DbmModMobEffects;

public class HasTaiyokenProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(DbmModMobEffects.TAIYOKEN_EFFECT.get());
	}
}
