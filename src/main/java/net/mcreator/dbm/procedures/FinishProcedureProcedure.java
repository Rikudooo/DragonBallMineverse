package net.mcreator.dbm.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.StatisticGUIMenu;
import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModEntities;

import io.netty.buffer.Unpooled;

public class FinishProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dbx1 = 0;
		double dbx2 = 0;
		double dbx3 = 0;
		double dbx4 = 0;
		double dbx5 = 0;
		double dbx7 = 0;
		double dbz1 = 0;
		double dbz2 = 0;
		double dbz3 = 0;
		double dbz4 = 0;
		double dbz5 = 0;
		double dbz6 = 0;
		double dbz7 = 0;
		double dbx6 = 0;
		{
			boolean _setval = true;
			entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CreationUnfinished = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("StatisticGUI");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new StatisticGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Saiyan")) {
			if (DbmModVariables.MapVariables.get(world).LegendarySpawned == false) {
				if (Math.random() < 0.1) {
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Legendary = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					DbmModVariables.MapVariables.get(world).LegendarySpawned = true;
					DbmModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned1 == false) {
			dbx1 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz1 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_1.get().spawn(_level, BlockPos.containing(dbx1, 320, dbz1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx1 = dbx1;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy1 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz1 = dbz1;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned1 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned2 == false) {
			dbx2 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz2 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_2.get().spawn(_level, BlockPos.containing(dbx2, 320, dbz2), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx2 = dbx2;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy2 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz2 = dbz2;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned2 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned3 == false) {
			dbx3 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz3 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_3.get().spawn(_level, BlockPos.containing(dbx3, 320, dbz3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx3 = dbx3;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy3 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz3 = dbz3;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned3 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned4 == false) {
			dbx4 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz4 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_4.get().spawn(_level, BlockPos.containing(dbx4, 320, dbz4), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx4 = dbx4;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy4 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz4 = dbz4;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned4 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned5 == false) {
			dbx5 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz5 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_5.get().spawn(_level, BlockPos.containing(dbx5, 320, dbz5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx5 = dbx5;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy5 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz5 = dbz5;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned5 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned6 == false) {
			dbx6 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz6 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_6.get().spawn(_level, BlockPos.containing(dbx6, 320, dbz6), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx6 = dbx6;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy6 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz6 = dbz6;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned6 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (DbmModVariables.MapVariables.get(world).DBSpawned7 == false) {
			dbx7 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			dbz7 = Mth.nextInt(RandomSource.create(), -10000, 10000);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DbmModEntities.DRAGON_BALL_E_7.get().spawn(_level, BlockPos.containing(dbx7, 320, dbz7), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			DbmModVariables.MapVariables.get(world).DBx7 = dbx7;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy7 = 320;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz7 = dbz7;
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBSpawned7 = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Arcosian")) {
			{
				double _setval = 1;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RacialFormLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
