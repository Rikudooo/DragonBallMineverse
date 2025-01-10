package net.mcreator.dbm.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;
import net.mcreator.dbm.entity.ShenronEntity;

import java.util.Comparator;
import java.util.ArrayList;

public class GiveSenzuBeansProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (DbmModVariables.MapVariables.get(world).ShenronDemands > 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DbmModItems.SENZU_BEAN.get()).copy();
				_setstack.setCount(30);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (DbmModVariables.MapVariables.get(world).ShenronDemands == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DbmModItems.SENZU_BEAN.get()).copy();
				_setstack.setCount(30);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			DbmModVariables.MapVariables.get(world).ShenronDemands = 0;
			DbmModVariables.MapVariables.get(world).syncData(world);
			if (!((Entity) world.getEntitiesOfClass(ShenronEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
				((Entity) world.getEntitiesOfClass(ShenronEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			ShenronEntityDiesProcedure.execute(world);
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		} else if (DbmModVariables.MapVariables.get(world).ShenronDemands > 1) {
			DbmModVariables.MapVariables.get(world).ShenronDemands = DbmModVariables.MapVariables.get(world).ShenronDemands - 1;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
