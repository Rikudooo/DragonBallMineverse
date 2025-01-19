package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.YardrattanEntity;

public class YardratDisplay1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof YardrattanEntity _datEntI ? _datEntI.getEntityData().get(YardrattanEntity.DATA_Texture) : 0) == 1;
	}
}
