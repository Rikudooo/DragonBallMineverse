package net.mcreator.dbm.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.init.DbmModItems;

public class ReturnDragonRadarInHandProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("dragonballSelected") == 0
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("dragonballSelected") == 0)
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DbmModItems.DRAGON_RADAR.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DbmModItems.DRAGON_RADAR.get());
	}
}
