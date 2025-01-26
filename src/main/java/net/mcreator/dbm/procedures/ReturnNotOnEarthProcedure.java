package net.mcreator.dbm.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

public class ReturnNotOnEarthProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity.level().dimension()) == Level.OVERWORLD);
	}
}
