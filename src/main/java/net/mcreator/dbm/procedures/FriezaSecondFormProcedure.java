package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryFriezaEntity;

public class FriezaSecondFormProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Second");
	}
}
