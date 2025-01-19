package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryCell4Entity;

public class SPCellSemiProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryCell4Entity _datEntS ? _datEntS.getEntityData().get(StoryCell4Entity.DATA_Form) : "").equals("Semi-Perfect");
	}
}
