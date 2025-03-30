package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwitchDimensionProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:hyperbolic_time_chamber"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo(54, 263, 5);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(54, 263, 5, _ent.getYRot(), _ent.getXRot());
			}
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:other_world"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo(4, 237, 104);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(4, 237, 104, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
