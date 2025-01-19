package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;

public class DragonBallInventory4Procedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == DbmModItems.DRAGON_BALL_4.get()) {
			DbmModVariables.MapVariables.get(world).DBx4 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy4 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz4 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (itemstack.getItem() == DbmModItems.NAMEK_DRAGON_BALL_4.get()) {
			DbmModVariables.MapVariables.get(world).NDBx4 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy4 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz4 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
