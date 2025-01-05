package net.mcreator.dbm.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.init.DbmModItems;
import net.mcreator.dbm.init.DbmModAttributes;

public class PowerPoleEntityRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!sourceentity.isShiftKeyDown()) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DbmModItems.POWER_POLE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (sourceentity.isShiftKeyDown()) {
			((LivingEntity) entity).getAttribute(DbmModAttributes.POWERPOLESCALE.get()).setBaseValue((((LivingEntity) entity).getAttribute(DbmModAttributes.POWERPOLESCALE.get()).getBaseValue() + 1));
			entity.refreshDimensions();
		}
	}
}
