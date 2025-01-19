package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryZarbonEntity;

public class ZarbonBaseProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryZarbonEntity _datEntS ? _datEntS.getEntityData().get(StoryZarbonEntity.DATA_Form) : "").equals("Base");
	}
}
