package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.dbm.network.DbmModVariables;

public class ReturnNamekDragonBallUsableProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return (entity.level().dimension()) == Level.OVERWORLD && DbmModVariables.MapVariables.get(world).DragonBallsUsable == true
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:namek")) && DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == true;
	}
}
