package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class NameTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Name: " + entity.getDisplayName().getString();
	}
}
