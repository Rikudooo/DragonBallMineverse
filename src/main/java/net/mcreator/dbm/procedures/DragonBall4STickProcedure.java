package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.ShenronEntity;
import net.mcreator.dbm.entity.PorungaEntity;
import net.mcreator.dbm.entity.NamekDragonBallE7Entity;
import net.mcreator.dbm.entity.NamekDragonBallE6Entity;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.entity.NamekDragonBallE4Entity;
import net.mcreator.dbm.entity.NamekDragonBallE3Entity;
import net.mcreator.dbm.entity.NamekDragonBallE2Entity;
import net.mcreator.dbm.entity.NamekDragonBallE1Entity;
import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.entity.DragonBallE5Entity;
import net.mcreator.dbm.entity.DragonBallE4Entity;
import net.mcreator.dbm.entity.DragonBallE3Entity;
import net.mcreator.dbm.entity.DragonBallE2Entity;
import net.mcreator.dbm.entity.DragonBallE1Entity;

import java.util.Comparator;

public class DragonBall4STickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zM = 0;
		double yM = 0;
		double xM = 0;
		double range = 0;
		if (entity instanceof DragonBallE4Entity) {
			if (DbmModVariables.MapVariables.get(world).ShenronCalled == true) {
				if (DbmModVariables.MapVariables.get(world).ShenronSpawnTimer < 80) {
					DbmModVariables.MapVariables.get(world).ShenronSpawnTimer = DbmModVariables.MapVariables.get(world).ShenronSpawnTimer + 1;
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (DbmModVariables.MapVariables.get(world).ShenronSpawnTimer >= 80) {
					if (!(!world.getEntitiesOfClass(ShenronEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty())) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
							if (!world.getEntitiesOfClass(DragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
									&& !world.getEntitiesOfClass(DragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
									&& !world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
									&& !world.getEntitiesOfClass(DragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
									&& !world.getEntitiesOfClass(DragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
									&& !world.getEntitiesOfClass(DragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
								if (DbmModVariables.MapVariables.get(world).ShenronSpawned == false) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = DbmModEntities.SHENRON.get().spawn(_level, BlockPos.containing(x, y + 0.5, z), MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
									DbmModVariables.MapVariables.get(world).ShenronSpawned = true;
									DbmModVariables.MapVariables.get(world).syncData(world);
								}
								((Entity) world.getEntitiesOfClass(DragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								entity.getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
								((Entity) world.getEntitiesOfClass(DragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								entity.getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
								((Entity) world.getEntitiesOfClass(DragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								((Entity) world.getEntitiesOfClass(DragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								((Entity) world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								entity.getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								((Entity) world.getEntitiesOfClass(DragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								((Entity) world.getEntitiesOfClass(DragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
								((Entity) world.getEntitiesOfClass(DragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							}
						}
					}
				}
			}
		}
		if (entity instanceof NamekDragonBallE4Entity) {
			if (DbmModVariables.MapVariables.get(world).PorungaCalled == true) {
				if (DbmModVariables.MapVariables.get(world).PorungaSpawnTimer < 80) {
					DbmModVariables.MapVariables.get(world).PorungaSpawnTimer = DbmModVariables.MapVariables.get(world).PorungaSpawnTimer + 1;
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (DbmModVariables.MapVariables.get(world).PorungaSpawnTimer >= 80) {
					if (!(!world.getEntitiesOfClass(PorungaEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty())) {
						if (!world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
							if (DbmModVariables.MapVariables.get(world).PorungaSpawned == false) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = DbmModEntities.PORUNGA.get().spawn(_level, BlockPos.containing(x, y + 0.5, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								DbmModVariables.MapVariables.get(world).PorungaSpawned = true;
								DbmModVariables.MapVariables.get(world).syncData(world);
							}
							((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							entity.getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballTimer", 70);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							entity.getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("dragonballTeleported", false);
							((Entity) world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							((Entity) world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							((Entity) world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							entity.getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							((Entity) world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							((Entity) world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
							((Entity) world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("dragonballScatter", (Mth.nextInt(RandomSource.create(), 2000, 10000)));
						}
					}
				}
			}
		}
		DragonBallTickProcedure.execute(world, x, z, entity);
	}
}
