package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class DragonRadarItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == true) {
			if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 0) {
				{
					String _setval = "";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 1) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx1), Math.round(DbmModVariables.MapVariables.get(world).DBy1), Math.round(DbmModVariables.MapVariables.get(world).DBz1)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 2) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx2), Math.round(DbmModVariables.MapVariables.get(world).DBy2), Math.round(DbmModVariables.MapVariables.get(world).DBz2)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 3) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx3), Math.round(DbmModVariables.MapVariables.get(world).DBy3), Math.round(DbmModVariables.MapVariables.get(world).DBz3)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 4) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx4), Math.round(DbmModVariables.MapVariables.get(world).DBy4), Math.round(DbmModVariables.MapVariables.get(world).DBz4)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 5) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx5), Math.round(DbmModVariables.MapVariables.get(world).DBy5), Math.round(DbmModVariables.MapVariables.get(world).DBz5)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 6) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx6), Math.round(DbmModVariables.MapVariables.get(world).DBy6), Math.round(DbmModVariables.MapVariables.get(world).DBz6)))) + " m";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DBDistance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 7) {
				{
					String _setval = new java.text.DecimalFormat("##").format(
							new Vec3(x, y, z).distanceTo(new Vec3(Math.round(DbmModVariables.MapVariables.get(world).DBx7), Math.round(DbmModVariables.MapVariables.get(world).DBy7), Math.round(DbmModVariables.MapVariables.get(world).DBz7)))) + " m";
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
