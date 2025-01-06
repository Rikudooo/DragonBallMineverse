package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

public class MakankosappoItemRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		LearnMakankosappoProcedure.execute(entity);
	}
}
