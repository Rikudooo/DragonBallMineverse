package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.entity.DendeEntity;

public class InLookoutProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.getEntitiesOfClass(DendeEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty();
	}
}
