package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.StoryZarbonEntity;
import net.mcreator.dbm.entity.StoryVegetaEntity;
import net.mcreator.dbm.entity.StoryPiccoloEntity;
import net.mcreator.dbm.entity.StoryMysteriousYoungManEntity;
import net.mcreator.dbm.entity.StoryGoldenFriezaEntity;
import net.mcreator.dbm.entity.StoryFusedBuuEntity;
import net.mcreator.dbm.entity.StoryFriezaEntity;
import net.mcreator.dbm.entity.StoryCell4Entity;
import net.mcreator.dbm.entity.StoryCell2Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityTransformProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		execute(null, world, x, y, z, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		double damage = 0;
		double nYaw = 0;
		double nPitch = 0;
		double nVx = 0;
		double nVy = 0;
		double nVz = 0;
		if (entity instanceof StoryPiccoloEntity) {
			if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
				damage = 0;
				if (event instanceof LivingHurtEvent event2) {
					event2.setAmount((float) damage);
				}
				nYaw = entity.getYRot();
				nPitch = entity.getDeltaMovement().x();
				nVx = entity.getXRot();
				nVy = entity.getDeltaMovement().y();
				nVz = entity.getDeltaMovement().z();
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DbmModEntities.STORY_PICCOLO_GIANT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot((float) nYaw);
						entityToSpawn.setYBodyRot((float) nYaw);
						entityToSpawn.setYHeadRot((float) nYaw);
						entityToSpawn.setXRot((float) nPitch);
						entityToSpawn.setDeltaMovement(nVx, nVy, nVz);
					}
				}
			}
		}
		if (entity instanceof StoryVegetaEntity) {
			if ((entity instanceof StoryVegetaEntity _datEntS ? _datEntS.getEntityData().get(StoryVegetaEntity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryVegetaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryVegetaEntity.DATA_Form, "Oozaru");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity13.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryVegetaEntity _datEntS ? _datEntS.getEntityData().get(StoryVegetaEntity.DATA_Form) : "").equals("Oozaru")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryVegetaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryVegetaEntity.DATA_Form, "Weakened");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity19.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryZarbonEntity) {
			if ((entity instanceof StoryZarbonEntity _datEntS ? _datEntS.getEntityData().get(StoryZarbonEntity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity25.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					if (entity instanceof StoryZarbonEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryZarbonEntity.DATA_Form, "Transformed");
				}
			}
		}
		if (entity instanceof StoryFriezaEntity) {
			if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFriezaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFriezaEntity.DATA_Form, "Second");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity32.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Second")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFriezaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFriezaEntity.DATA_Form, "Third");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity38.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Third")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFriezaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFriezaEntity.DATA_Form, "Final");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity44.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryFriezaEntity.DATA_Form) : "").equals("Final")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFriezaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFriezaEntity.DATA_Form, "Full Power");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity50.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryMysteriousYoungManEntity) {
			if ((entity instanceof StoryMysteriousYoungManEntity _datEntS ? _datEntS.getEntityData().get(StoryMysteriousYoungManEntity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryMysteriousYoungManEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryMysteriousYoungManEntity.DATA_Form, "Super Saiyan");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity57 && _livingEntity57.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity57.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryCell2Entity) {
			if ((entity instanceof StoryCell2Entity _datEntS ? _datEntS.getEntityData().get(StoryCell2Entity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryCell2Entity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryCell2Entity.DATA_Form, "Semi-Perfect");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity64.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryCell4Entity) {
			if ((entity instanceof StoryCell4Entity _datEntS ? _datEntS.getEntityData().get(StoryCell4Entity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryCell4Entity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryCell4Entity.DATA_Form, "Semi-Perfect");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity71 && _livingEntity71.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity71.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryCell4Entity _datEntS ? _datEntS.getEntityData().get(StoryCell4Entity.DATA_Form) : "").equals("Semi-Perfect")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryCell4Entity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryCell4Entity.DATA_Form, "Super Perfect");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity77.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryFusedBuuEntity) {
			if ((entity instanceof StoryFusedBuuEntity _datEntS ? _datEntS.getEntityData().get(StoryFusedBuuEntity.DATA_Form) : "").equals("Base")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFusedBuuEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFusedBuuEntity.DATA_Form, "Gotenks");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity84 && _livingEntity84.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity84.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryFusedBuuEntity _datEntS ? _datEntS.getEntityData().get(StoryFusedBuuEntity.DATA_Form) : "").equals("Gotenks")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFusedBuuEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFusedBuuEntity.DATA_Form, "Piccolo");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity90 && _livingEntity90.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity90.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			} else if ((entity instanceof StoryFusedBuuEntity _datEntS ? _datEntS.getEntityData().get(StoryFusedBuuEntity.DATA_Form) : "").equals("Piccolo")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryFusedBuuEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryFusedBuuEntity.DATA_Form, "Gohan");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity96 && _livingEntity96.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity96.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
		if (entity instanceof StoryGoldenFriezaEntity) {
			if ((entity instanceof StoryGoldenFriezaEntity _datEntS ? _datEntS.getEntityData().get(StoryGoldenFriezaEntity.DATA_Form) : "").equals("Final")) {
				if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					damage = 0;
					if (event instanceof LivingHurtEvent event2) {
						event2.setAmount((float) damage);
					}
					if (entity instanceof StoryGoldenFriezaEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryGoldenFriezaEntity.DATA_Form, "Golden");
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) (entity instanceof LivingEntity _livingEntity103 && _livingEntity103.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity103.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0));
					entity.refreshDimensions();
				}
			}
		}
	}
}
