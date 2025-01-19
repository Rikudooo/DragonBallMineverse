
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbmModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> KIKOHA_EXPLODE = GameRules.register("kikohaExplode", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}
