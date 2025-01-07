package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.PopoEntity;
import net.mcreator.dbm.entity.NorthKaioEntity;
import net.mcreator.dbm.entity.MasterPiccoloEntity;
import net.mcreator.dbm.entity.MasterKorinEntity;
import net.mcreator.dbm.entity.KingEnmaEntity;
import net.mcreator.dbm.entity.KameSenninEntity;
import net.mcreator.dbm.entity.DendeEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SafeZoneNoMOBSProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Monster) {
			if (!world.getEntitiesOfClass(DendeEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).isEmpty() || !world.getEntitiesOfClass(KingEnmaEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(PopoEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(MasterPiccoloEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(NorthKaioEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(MasterKorinEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(KameSenninEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
		}
	}
}
