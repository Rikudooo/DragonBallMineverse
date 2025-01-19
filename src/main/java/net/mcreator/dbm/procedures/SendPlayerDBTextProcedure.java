package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dbm.network.DbmModVariables;

public class SendPlayerDBTextProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Dragon Balls are usable!"), false);
			} else if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Dragon Balls can't be used for the next: " + new java.text.DecimalFormat("##").format(DbmModVariables.MapVariables.get(world).DragonBallTimer) + " tick(s)")), false);
			}
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:namek"))) {
			if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Dragon Balls are usable!"), false);
			} else if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Dragon Balls can't be used for the next: " + new java.text.DecimalFormat("##").format(DbmModVariables.MapVariables.get(world).NamekDragonBallTimer) + " tick(s)")), false);
			}
		}
	}
}
