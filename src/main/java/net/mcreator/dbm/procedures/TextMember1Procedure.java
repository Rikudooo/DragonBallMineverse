package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dbm.network.DbmModVariables;

import com.mojang.util.UUIDTypeAdapter;

public class TextMember1Procedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		return "Leader - " + (new Object() {
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
		}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getDisplayName().getString());
	}
}
