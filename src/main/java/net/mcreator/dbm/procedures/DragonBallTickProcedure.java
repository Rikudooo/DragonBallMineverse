package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.dbm.network.DbmModVariables;
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

public class DragonBallTickProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DragonBallE1Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx1 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx1 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy1 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy1 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz1 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz1 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE2Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx2 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx2 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy2 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy2 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz2 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz3 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE3Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx3 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx3 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy3 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy3 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz3 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz3 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE4Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx4 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx4 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy4 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy4 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz4 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz4 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE5Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx5 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx5 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy5 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy5 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz5 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz5 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE6Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx6 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx6 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy6 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy6 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz6 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz6 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE7Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBx7 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).DBx7 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBy7 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).DBy7 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).DBz7 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).DBz7 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (entity instanceof NamekDragonBallE1Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx1 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx1 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy1 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy1 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz1 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz1 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE2Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx2 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx2 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy2 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy2 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz2 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz2 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE3Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx3 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx3 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy3 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy3 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz3 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz3 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE4Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx4 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx4 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy4 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy4 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz4 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz4 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE5Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx5 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx5 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy5 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy5 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz5 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz6 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE6Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx6 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx6 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy6 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy6 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz6 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz6 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NamekDragonBallE7Entity) {
			if (!(DbmModVariables.MapVariables.get(world).NDBx7 == entity.getX())) {
				DbmModVariables.MapVariables.get(world).NDBx7 = entity.getX();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBy7 == entity.getY())) {
				DbmModVariables.MapVariables.get(world).NDBy7 = entity.getY();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(DbmModVariables.MapVariables.get(world).NDBz7 == entity.getZ())) {
				DbmModVariables.MapVariables.get(world).NDBz7 = entity.getZ();
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == false && entity.getPersistentData().getDouble("dragonballScatter") > 0) {
			if (entity instanceof DragonBallE1Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, 0));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE2Entity) {
				entity.setDeltaMovement(new Vec3(0, 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE3Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE4Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, 1));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE5Entity) {
				entity.setDeltaMovement(new Vec3(1, 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE6Entity) {
				entity.setDeltaMovement(new Vec3(0, 0, 1));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof DragonBallE7Entity) {
				entity.setDeltaMovement(new Vec3(1, 0, 0));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			}
			entity.getPersistentData().putDouble("dragonballTimer", (entity.getPersistentData().getDouble("dragonballTimer") - 1));
			if (entity.getPersistentData().getBoolean("dragonballTeleported") == false && entity.getPersistentData().getDouble("dragonballTimer") <= 0) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + entity.getPersistentData().getDouble("dragonballScatter")), 320, (z + entity.getPersistentData().getDouble("dragonballScatter")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + entity.getPersistentData().getDouble("dragonballScatter")), 320, (z + entity.getPersistentData().getDouble("dragonballScatter")), _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof DragonBallE1Entity) {
					DbmModVariables.MapVariables.get(world).DBx1 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy1 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz1 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE2Entity) {
					DbmModVariables.MapVariables.get(world).DBx2 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy2 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz2 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE3Entity) {
					DbmModVariables.MapVariables.get(world).DBx3 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy3 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz3 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE4Entity) {
					DbmModVariables.MapVariables.get(world).DBx4 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy4 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz4 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE5Entity) {
					DbmModVariables.MapVariables.get(world).DBx5 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy5 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz5 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE6Entity) {
					DbmModVariables.MapVariables.get(world).DBx6 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy6 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz6 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof DragonBallE7Entity) {
					DbmModVariables.MapVariables.get(world).DBx7 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBy7 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).DBz7 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				}
				entity.getPersistentData().putBoolean("dragonballTeleported", true);
				entity.getPersistentData().putDouble("dragonballScatter", 0);
				entity.getPersistentData().putDouble("dragonballTimer", 0);
			}
		}
		if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == false && entity.getPersistentData().getDouble("dragonballScatter") > 0) {
			if (entity instanceof NamekDragonBallE1Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, 0));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE2Entity) {
				entity.setDeltaMovement(new Vec3(0, 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE3Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE4Entity) {
				entity.setDeltaMovement(new Vec3((-1), 0, 1));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE5Entity) {
				entity.setDeltaMovement(new Vec3(1, 0, (-1)));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE6Entity) {
				entity.setDeltaMovement(new Vec3(0, 0, 1));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity instanceof NamekDragonBallE7Entity) {
				entity.setDeltaMovement(new Vec3(1, 0, 0));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 300, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 300, z, _ent.getYRot(), _ent.getXRot());
				}
			}
			entity.getPersistentData().putDouble("dragonballTimer", (entity.getPersistentData().getDouble("dragonballTimer") - 1));
			if (entity.getPersistentData().getBoolean("dragonballTeleported") == false && entity.getPersistentData().getDouble("dragonballTimer") <= 0) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + entity.getPersistentData().getDouble("dragonballScatter")), 320, (z + entity.getPersistentData().getDouble("dragonballScatter")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + entity.getPersistentData().getDouble("dragonballScatter")), 320, (z + entity.getPersistentData().getDouble("dragonballScatter")), _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof NamekDragonBallE1Entity) {
					DbmModVariables.MapVariables.get(world).NDBx1 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy1 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz1 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE2Entity) {
					DbmModVariables.MapVariables.get(world).NDBx2 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy2 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz2 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE3Entity) {
					DbmModVariables.MapVariables.get(world).NDBx3 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy3 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz3 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE4Entity) {
					DbmModVariables.MapVariables.get(world).NDBx4 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy4 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz4 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE5Entity) {
					DbmModVariables.MapVariables.get(world).NDBx5 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy5 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz5 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE6Entity) {
					DbmModVariables.MapVariables.get(world).NDBx6 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy6 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz6 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				} else if (entity instanceof NamekDragonBallE7Entity) {
					DbmModVariables.MapVariables.get(world).NDBx7 = x + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBy7 = 320;
					DbmModVariables.MapVariables.get(world).syncData(world);
					DbmModVariables.MapVariables.get(world).NDBz7 = z + entity.getPersistentData().getDouble("dragonballScatter");
					DbmModVariables.MapVariables.get(world).syncData(world);
				}
				entity.getPersistentData().putBoolean("dragonballTeleported", true);
				entity.getPersistentData().putDouble("dragonballScatter", 0);
				entity.getPersistentData().putDouble("dragonballTimer", 0);
			}
		}
	}
}
