package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryVegetaEntity;

public class VegetaWeakenedConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryVegetaEntity _datEntS ? _datEntS.getEntityData().get(StoryVegetaEntity.DATA_Form) : "").equals("Weakened");
	}
}
