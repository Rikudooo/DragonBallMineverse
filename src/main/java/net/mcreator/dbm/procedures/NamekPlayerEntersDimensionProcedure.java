package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModEntities;

public class NamekPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double dbx6 = 0;
		double dbx7 = 0;
		double dbx4 = 0;
		double dbz6 = 0;
		double dbx5 = 0;
		double dbz7 = 0;
		double dbx2 = 0;
		double dbz4 = 0;
		double dbx3 = 0;
		double dbz5 = 0;
		double dbz2 = 0;
		double dbx1 = 0;
		double dbz3 = 0;
		double dbz1 = 0;
		if (DbmModVariables.MapVariables.get(world).NDBSpawned1 == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/forceload add -17 0 -32 15");
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_CHUNK_LOADER.get().spawn(_level, new BlockPos(-18, 320, 3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			dbx1 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz1 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_1.get().spawn(_level, BlockPos.containing(dbx1, 320, dbz1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx1 = dbx1;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy1 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz1 = dbz1;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned1 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned2 == false) {
			dbx2 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz2 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_2.get().spawn(_level, BlockPos.containing(dbx2, 320, dbz2), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx2 = dbx2;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy2 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz2 = dbz2;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned2 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned3 == false) {
			dbx3 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz3 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_3.get().spawn(_level, BlockPos.containing(dbx3, 320, dbz3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx3 = dbx3;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy3 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz3 = dbz3;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned3 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned4 == false) {
			dbx4 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz4 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_4.get().spawn(_level, BlockPos.containing(dbx4, 320, dbz4), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx4 = dbx4;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy4 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz4 = dbz4;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned4 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned5 == false) {
			dbx5 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz5 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_5.get().spawn(_level, BlockPos.containing(dbx5, 320, dbz5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx5 = dbx5;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy5 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz5 = dbz5;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned5 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned6 == false) {
			dbx6 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz6 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_6.get().spawn(_level, BlockPos.containing(dbx6, 320, dbz6), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx6 = dbx6;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy6 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz6 = dbz6;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned6 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).NDBSpawned7 == false) {
			dbx7 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz7 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.NAMEK_DRAGON_BALL_E_7.get().spawn(_level, BlockPos.containing(dbx7, 320, dbz7), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).NDBx7 = dbx7;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy7 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz7 = dbz7;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBSpawned7 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
