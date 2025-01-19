package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryZarbonEntity;
import net.mcreator.dbm.entity.StoryRecoomeEntity;
import net.mcreator.dbm.entity.StoryNappaEntity;
import net.mcreator.dbm.entity.StoryMysteriousYoungManEntity;
import net.mcreator.dbm.entity.StoryMechaFriezaEntity;
import net.mcreator.dbm.entity.StoryKingColdEntity;
import net.mcreator.dbm.entity.StoryJeiceEntity;
import net.mcreator.dbm.entity.StoryGuldoEntity;
import net.mcreator.dbm.entity.StoryGinyuEntity;
import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;
import net.mcreator.dbm.entity.StoryFriezaEntity;
import net.mcreator.dbm.entity.StoryDodoriaEntity;
import net.mcreator.dbm.entity.StoryCellJrEntity;
import net.mcreator.dbm.entity.StoryCellEntity;
import net.mcreator.dbm.entity.StoryCell4Entity;
import net.mcreator.dbm.entity.StoryCell3Entity;
import net.mcreator.dbm.entity.StoryCell2Entity;
import net.mcreator.dbm.entity.StoryBurterEntity;
import net.mcreator.dbm.entity.StoryAndroid20Entity;
import net.mcreator.dbm.entity.StoryAndroid19Entity;
import net.mcreator.dbm.entity.StoryAndroid18Entity;
import net.mcreator.dbm.entity.StoryAndroid17Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetStoryEntitiesHealthProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof StoryNappaEntity) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue(1800);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity2.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryFriezaSoldierEntity) {
			if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity5.getAttribute(Attributes.MAX_HEALTH).setBaseValue(1800);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity6.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryDodoriaEntity) {
			if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity9.getAttribute(Attributes.MAX_HEALTH).setBaseValue(2500);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity10.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryZarbonEntity) {
			if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity13.getAttribute(Attributes.MAX_HEALTH).setBaseValue(3400);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity14.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryGinyuEntity) {
			if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity17.getAttribute(Attributes.MAX_HEALTH).setBaseValue(11500);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity18.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryBurterEntity) {
			if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity21.getAttribute(Attributes.MAX_HEALTH).setBaseValue(9500);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity22.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryJeiceEntity) {
			if (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity25.getAttribute(Attributes.MAX_HEALTH).setBaseValue(9500);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity26.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryRecoomeEntity) {
			if (entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity29.getAttribute(Attributes.MAX_HEALTH).setBaseValue(10000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity30.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryGuldoEntity) {
			if (entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity33.getAttribute(Attributes.MAX_HEALTH).setBaseValue(8000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity34.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryFriezaEntity) {
			if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity37.getAttribute(Attributes.MAX_HEALTH).setBaseValue(15000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity38.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryMechaFriezaEntity) {
			if (entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity42.getAttribute(Attributes.MAX_HEALTH).setBaseValue(40000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity43.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryKingColdEntity) {
			if (entity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity46.getAttribute(Attributes.MAX_HEALTH).setBaseValue(35000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity47 && _livingEntity47.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity47.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryMysteriousYoungManEntity) {
			if (entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity50.getAttribute(Attributes.MAX_HEALTH).setBaseValue(41000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity51 && _livingEntity51.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity51.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryAndroid19Entity) {
			if (entity instanceof LivingEntity _livingEntity54 && _livingEntity54.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity54.getAttribute(Attributes.MAX_HEALTH).setBaseValue(45000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity55.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryAndroid20Entity) {
			if (entity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity58.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity59 && _livingEntity59.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity59.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryAndroid18Entity) {
			if (entity instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity62.getAttribute(Attributes.MAX_HEALTH).setBaseValue(55000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity63 && _livingEntity63.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity63.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryAndroid17Entity) {
			if (entity instanceof LivingEntity _livingEntity66 && _livingEntity66.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity66.getAttribute(Attributes.MAX_HEALTH).setBaseValue(55000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity67 && _livingEntity67.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity67.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryCellEntity) {
			if (entity instanceof LivingEntity _livingEntity70 && _livingEntity70.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity70.getAttribute(Attributes.MAX_HEALTH).setBaseValue(57000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity71 && _livingEntity71.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity71.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryCellJrEntity) {
			if (entity instanceof LivingEntity _livingEntity74 && _livingEntity74.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity74.getAttribute(Attributes.MAX_HEALTH).setBaseValue(35000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity75 && _livingEntity75.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity75.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryCell2Entity) {
			if (entity instanceof LivingEntity _livingEntity78 && _livingEntity78.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity78.getAttribute(Attributes.MAX_HEALTH).setBaseValue(60000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity79 && _livingEntity79.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity79.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryCell3Entity) {
			if (entity instanceof LivingEntity _livingEntity82 && _livingEntity82.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity82.getAttribute(Attributes.MAX_HEALTH).setBaseValue(70000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity83 && _livingEntity83.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity83.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
		if (entity instanceof StoryCell4Entity) {
			if (entity instanceof LivingEntity _livingEntity86 && _livingEntity86.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity86.getAttribute(Attributes.MAX_HEALTH).setBaseValue(70000);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity87 && _livingEntity87.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity87.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
		}
	}
}
