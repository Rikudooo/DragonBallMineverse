package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.dbm.network.DbmModVariables;

public class DragonRadarItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == true) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 0) {
					{
						String _setval = "";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 1) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx1), Math.round(DbmModVariables.MapVariables.get(world).DBy1), Math.round(DbmModVariables.MapVariables.get(world).DBz1))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 2) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx2), Math.round(DbmModVariables.MapVariables.get(world).DBy2), Math.round(DbmModVariables.MapVariables.get(world).DBz2))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 3) {
					{
						String _setval = new java.text.DecimalFormat("##").format(new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx3), y, Math.round(DbmModVariables.MapVariables.get(world).DBz3)))) + " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 4) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx4), Math.round(DbmModVariables.MapVariables.get(world).DBy4), Math.round(DbmModVariables.MapVariables.get(world).DBz4))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 5) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx5), Math.round(DbmModVariables.MapVariables.get(world).DBy5), Math.round(DbmModVariables.MapVariables.get(world).DBz5))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 6) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx6), Math.round(DbmModVariables.MapVariables.get(world).DBy6), Math.round(DbmModVariables.MapVariables.get(world).DBz6))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 7) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx7), Math.round(DbmModVariables.MapVariables.get(world).DBy7), Math.round(DbmModVariables.MapVariables.get(world).DBz7))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					String _setval = "";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:namek"))) {
			if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == true) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 0) {
					{
						String _setval = "";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 1) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx1), Math.round(DbmModVariables.MapVariables.get(world).NDBy1), Math.round(DbmModVariables.MapVariables.get(world).NDBz1))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 2) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx2), Math.round(DbmModVariables.MapVariables.get(world).NDBy2), Math.round(DbmModVariables.MapVariables.get(world).NDBz2))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 3) {
					{
						String _setval = new java.text.DecimalFormat("##").format(new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx3), y, Math.round(DbmModVariables.MapVariables.get(world).NDBz3)))) + " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 4) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx4), Math.round(DbmModVariables.MapVariables.get(world).NDBy4), Math.round(DbmModVariables.MapVariables.get(world).NDBz4))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 5) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx5), Math.round(DbmModVariables.MapVariables.get(world).NDBy5), Math.round(DbmModVariables.MapVariables.get(world).NDBz5))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 6) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx6), Math.round(DbmModVariables.MapVariables.get(world).NDBy6), Math.round(DbmModVariables.MapVariables.get(world).NDBz6))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedDB == 7) {
					{
						String _setval = new java.text.DecimalFormat("##").format(
								new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).NDBx7), Math.round(DbmModVariables.MapVariables.get(world).NDBy7), Math.round(DbmModVariables.MapVariables.get(world).NDBz7))))
								+ " m";
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DBDistance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					String _setval = "";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
