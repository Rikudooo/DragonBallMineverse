package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;

public class StoryFriezaSoldierOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
			_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Texture, Mth.nextInt(RandomSource.create(), 1, 5));
	}
}
