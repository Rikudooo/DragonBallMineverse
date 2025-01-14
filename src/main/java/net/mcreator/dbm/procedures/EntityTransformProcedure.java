package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.StoryPiccoloEntity;

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
	}
}
