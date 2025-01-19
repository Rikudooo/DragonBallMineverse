package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;

public class DragonBall1ItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == DbmModItems.DRAGON_BALL_1.get()) {
			DbmModVariables.MapVariables.get(world).DBx1 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBy1 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).DBz1 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
		if (itemstack.getItem() == DbmModItems.NAMEK_DRAGON_BALL_1.get()) {
			DbmModVariables.MapVariables.get(world).NDBx1 = entity.getX();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBy1 = entity.getY();
			DbmModVariables.MapVariables.get(world).syncData(world);
			DbmModVariables.MapVariables.get(world).NDBz1 = entity.getZ();
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
