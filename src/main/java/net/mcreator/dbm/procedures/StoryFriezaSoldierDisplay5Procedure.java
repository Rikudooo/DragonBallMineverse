package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;

public class StoryFriezaSoldierDisplay5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Texture) : 0) == 5;
	}
}
