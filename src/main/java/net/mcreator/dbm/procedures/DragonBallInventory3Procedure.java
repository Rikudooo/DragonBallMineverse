package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;

public class DragonBallInventory3Procedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == DbmModItems.DRAGON_BALL_3.get()) {
			DbmModVariables.MapVariables.get(world).DBx3 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy3 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz3 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (itemstack.getItem() == DbmModItems.NAMEK_DRAGON_BALL_3.get()) {
			DbmModVariables.MapVariables.get(world).NDBx3 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy3 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz3 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
