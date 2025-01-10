package net.mcreator.dbm.procedures;

import net.minecraft.world.item.ItemStack;

public class DragonRadarRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 0) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 1);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 1) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 2);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 2) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 3);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 3) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 4);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 4) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 5);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 5) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 6);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 6) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 7);
		} else if (itemstack.getOrCreateTag().getDouble("dragonballSelected") == 7) {
			itemstack.getOrCreateTag().putDouble("dragonballSelected", 0);
		}
	}
}
