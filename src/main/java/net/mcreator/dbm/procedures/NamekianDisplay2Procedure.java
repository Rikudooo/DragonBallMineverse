package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.NamekianEntity;

public class NamekianDisplay2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof NamekianEntity _datEntI ? _datEntI.getEntityData().get(NamekianEntity.DATA_Texture) : 0) == 2;
	}
}
