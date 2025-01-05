package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class InfrontProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		x = Math.sin(Math.toRadians(entity.getYRot())) * 1.5;
		z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
	}
}
