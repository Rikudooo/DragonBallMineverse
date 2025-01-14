package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.dbm.network.DbmModVariables;

public class SendPlayerDBTextProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Dragon Balls are usable!"), false);
		} else if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Dragon Balls can't be used for the next: " + new java.text.DecimalFormat("##").format(DbmModVariables.MapVariables.get(world).DragonBallTimer) + " tick(s)")), false);
		}
	}
}
