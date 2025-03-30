package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SSJGProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("SSJG")) {
			{
				String _setval = "dbm:textures/entities/eyes_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType) + "_ssjg.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EyesColorID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/ssjghair.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HairID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/aura_ssjg.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/ssjghairbig.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HairStyleID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Base";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 12.5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0.9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Ritual SSJG")) {
			{
				String _setval = "dbm:textures/entities/eyes_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType) + "_ssjg.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EyesColorID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/ssjghair.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HairID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/aura_ssjg.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AuraTexture = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "dbm:textures/entities/ssjghairbig.png";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HairStyleID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Base";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 12.75;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0.9;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
