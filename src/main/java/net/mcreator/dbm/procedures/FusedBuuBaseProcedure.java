package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryFusedBuuEntity;

public class FusedBuuBaseProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryFusedBuuEntity _datEntS ? _datEntS.getEntityData().get(StoryFusedBuuEntity.DATA_Form) : "").equals("Base");
	}
}
