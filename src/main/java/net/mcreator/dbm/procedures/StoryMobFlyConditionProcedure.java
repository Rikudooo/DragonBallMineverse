package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.dbm.network.DbmModVariables;

public class StoryMobFlyConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer)
				&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Flying == true;
	}
}
