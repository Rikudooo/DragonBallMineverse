package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryVegetaEntity;
import net.mcreator.dbm.entity.StoryFriezaEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetEntityHitBoxProcedure {
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
		if (world == null)
			return;
		net.minecraftforge.event.entity.EntityEvent.Size _sizeEvt = (net.minecraftforge.event.entity.EntityEvent.Size) event;
		if (entity instanceof StoryVegetaEntity) {
			if ((entity instanceof StoryVegetaEntity _datEntS ? _datEntS.getEntityData().get(StoryVegetaEntity.DATA_Form) : "").equals("Oozaru")) {
				_sizeEvt.setNewSize(new EntityDimensions((float) (0.6 * 4), (float) (1.8 * 4), false));
				_sizeEvt.setNewEyeHeight((float) ((1.8 * 4) / 1.125));
			} else if (!((entity instanceof StoryVegetaEntity _datEntS ? _datEntS.getEntityData().get(StoryVegetaEntity.DATA_Form) : "").equals("Oozaru"))) {
				_sizeEvt.setNewSize(new EntityDimensions((float) (0.6 * 1), (float) (1.8 * 1), false));
				_sizeEvt.setNewEyeHeight((float) ((1.8 * 1) / 1.125));
			}
		}
		if (entity instanceof StoryFriezaEntity) {
			if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Second")) {
				_sizeEvt.setNewSize(new EntityDimensions((float) (0.6 * 2), (float) (1.8 * 2), false));
				_sizeEvt.setNewEyeHeight((float) ((1.8 * 2) / 1.125));
			} else if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Full Power")) {
				_sizeEvt.setNewSize(new EntityDimensions((float) (0.6 * 1.5), (float) (1.8 * 1.5), false));
				_sizeEvt.setNewEyeHeight((float) ((1.8 * 1.5) / 1.125));
			} else if (!((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Second")
					|| (entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Full Power"))) {
				_sizeEvt.setNewSize(new EntityDimensions((float) (0.6 * 1), (float) (1.8 * 1), false));
				_sizeEvt.setNewEyeHeight((float) ((1.8 * 1) / 1.125));
			}
		}
	}
}
