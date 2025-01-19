package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModEntities;

public class SpacePlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world) {
		if (DbmModVariables.MapVariables.get(world).EarthSpawned == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.EARTH_E.get().spawn(_level, new BlockPos(100, 160, 100), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).EarthSpawned = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NamekSpawned == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_E.get().spawn(_level, new BlockPos(2000, 160, 2000), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NamekSpawned = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
