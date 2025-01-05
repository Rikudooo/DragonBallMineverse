package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class KamehamehaItemRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Kamehameha";
			entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KiSlot1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Spirit Bomb";
			entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KiSlot2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Ki Wave";
			entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KiSlot3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
