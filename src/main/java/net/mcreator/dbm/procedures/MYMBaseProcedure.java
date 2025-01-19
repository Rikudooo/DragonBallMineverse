package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryMysteriousYoungManEntity;

public class MYMBaseProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryMysteriousYoungManEntity _datEntS ? _datEntS.getEntityData().get(StoryMysteriousYoungManEntity.DATA_Form) : "").equals("Base");
	}
}
