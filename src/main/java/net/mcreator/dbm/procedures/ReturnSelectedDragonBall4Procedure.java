package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnSelectedDragonBall4Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("dragonballSelected") == 4
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("dragonballSelected") == 4) && DbmModVariables.MapVariables.get(world).DragonBallsUsable == true;
	}
}
