package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;

public class DragonBallInventory2Procedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == DbmModItems.DRAGON_BALL_2.get()) {
			DbmModVariables.MapVariables.get(world).DBx2 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy2 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz2 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (itemstack.getItem() == DbmModItems.DRAGON_BALL_2.get()) {
			DbmModVariables.MapVariables.get(world).NDBx2 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy2 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz2 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
