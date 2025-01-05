package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.PowerPoleEntityEntity;

import javax.annotation.Nullable;

import com.ibm.icu.number.Scale;

@Mod.EventBusSubscriber
public class PowerPoleHitBoxProcedure {
	@SubscribeEvent
	public static void onEventTriggered(net.minecraftforge.event.entity.EntityEvent.Size event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Scale = 0;
		if (world == null)
			return;
		net.minecraftforge.event.entity.EntityEvent.Size _sizeEvt = (net.minecraftforge.event.entity.EntityEvent.Size) event;
		if (entity instanceof PowerPoleEntityEntity) {
			_sizeEvt.setNewSize(new EntityDimensions((float) 0.08, (float) (1 + entity.getPersistentData().getDouble("Size")), false));
			_sizeEvt.setNewEyeHeight((float) ((1 + entity.getPersistentData().getDouble("Size")) - 0.2));
		}
	}
}
