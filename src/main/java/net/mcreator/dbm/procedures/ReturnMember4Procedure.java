package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dbm.network.DbmModVariables;

import com.mojang.util.UUIDTypeAdapter;

public class ReturnMember4Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return !(new Object() {
			Entity getEntity(String uuid) {
				Entity _uuidentity = null;
				if (world instanceof ServerLevel _server) {
					try {
						_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
					} catch (IllegalArgumentException e) {
					}
				}
				return _uuidentity;
			}
		}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)) == null);
	}
}
