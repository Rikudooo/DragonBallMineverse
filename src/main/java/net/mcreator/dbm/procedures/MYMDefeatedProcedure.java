package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.DbmMod;

import java.util.List;
import java.util.Comparator;

public class MYMDefeatedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).StoryModeProgress).contains("mysteriousyoungman")) {
					{
						String _setval = (entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).StoryModeProgress + " " + "mysteriousyoungman";
						entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeProgress = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
					DbmMod.queueServerWork(10, () -> {
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("<" + "???" + "> " + "Woah! So you are as strong as they said!")), false);
						DbmMod.queueServerWork(10, () -> {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("<" + "???" + "> " + "Anyway, i have something to tell you.")), false);
							DbmMod.queueServerWork(10, () -> {
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("<" + "Future Trunks" + "> " + "My name is Trunks. I am the son of Vegeta and Bulma from the future.")), false);
								DbmMod.queueServerWork(5, () -> {
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("<" + "Future Trunks" + "> " + "In three years, on islands in the south, 2 evil beings will appear to terrorize the world, they are much stronger than me.")),
												false);
									DbmMod.queueServerWork(5, () -> {
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal(("<" + "Future Trunks" + "> " + "Everyone died trying to fight them. I'm the only warrior 20 years from now, and i still can't beat them.")), false);
									});
								});
							});
						});
					});
				}
			}
		}
	}
}
