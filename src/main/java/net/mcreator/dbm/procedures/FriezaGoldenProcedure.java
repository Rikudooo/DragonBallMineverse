package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryGoldenFriezaEntity;

public class FriezaGoldenProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryGoldenFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryGoldenFriezaEntity.DATA_Form) : "").equals("Golden");
	}
}
