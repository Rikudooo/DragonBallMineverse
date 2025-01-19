package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryCell2Entity;

public class CellSemiProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryCell2Entity _datEntS ? _datEntS.getEntityData().get(StoryCell2Entity.DATA_Form) : "").equals("Semi-Perfect");
	}
}
