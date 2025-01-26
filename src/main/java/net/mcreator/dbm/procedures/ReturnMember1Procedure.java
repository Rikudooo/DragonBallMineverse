package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnMember1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity == null);
	}
}
