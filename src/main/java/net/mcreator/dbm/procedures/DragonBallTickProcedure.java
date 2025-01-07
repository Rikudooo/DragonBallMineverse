package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.dbm.network.DbmModVariables;
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
			if (!(DbmModVariables.MapVariables.get(world).DBCoords1)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords1 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE2Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords2)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords2 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE3Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords3)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords3 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE4Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords4)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords4 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE5Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords5)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords5 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE6Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords6)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords6 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof DragonBallE7Entity) {
			if (!(DbmModVariables.MapVariables.get(world).DBCoords7)
					.equals(new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/" + new java.text.DecimalFormat("##").format(entity.getZ()))) {
				DbmModVariables.MapVariables.get(world).DBCoords7 = new java.text.DecimalFormat("##").format(entity.getX()) + "/" + new java.text.DecimalFormat("##").format(entity.getY()) + "/"
						+ new java.text.DecimalFormat("##").format(entity.getZ());
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
			entity.getPersistentData().putDouble("dragonballScatter", (entity.getPersistentData().getDouble("dragonballScatter") - 1));
		}
	}
}
