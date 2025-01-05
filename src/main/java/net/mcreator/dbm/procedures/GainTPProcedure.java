package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GainTPProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getDirectEntity(), event.getAmount());
		}
	}

	public static void execute(Entity immediatesourceentity, double amount) {
		execute(null, immediatesourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity immediatesourceentity, double amount) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof Player || immediatesourceentity instanceof ServerPlayer) {
			if (Math.random() < 0.4) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						{
							double _setval = (immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TrainingPoints + 2 + Math.pow(Math.sqrt(amount), 1.1);
							immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrainingPoints = _setval;
								capability.syncPlayerVariables(immediatesourceentity);
							});
						}
					} else {
						{
							double _setval = (immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TrainingPoints + 5 + Math.pow(Math.sqrt(amount), 1.1);
							immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrainingPoints = _setval;
								capability.syncPlayerVariables(immediatesourceentity);
							});
						}
					}
				} else {
					if (Math.random() < 0.5) {
						{
							double _setval = (immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TrainingPoints + 10 + Math.pow(Math.sqrt(amount), 1.1);
							immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrainingPoints = _setval;
								capability.syncPlayerVariables(immediatesourceentity);
							});
						}
					} else {
						{
							double _setval = (immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TrainingPoints + 20 + Math.pow(Math.sqrt(amount), 1.1);
							immediatesourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrainingPoints = _setval;
								capability.syncPlayerVariables(immediatesourceentity);
							});
						}
					}
				}
			}
		}
	}
}
