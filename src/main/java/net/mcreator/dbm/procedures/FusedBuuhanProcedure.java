package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryFusedBuuEntity;

public class FusedBuuhanProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryFusedBuuEntity _datEntS ? _datEntS.getEntityData().get(StoryFusedBuuEntity.DATA_Form) : "").equals("Gohan");
	}
}
