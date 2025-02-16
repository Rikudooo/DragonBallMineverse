
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.dbm.potion.TaiyokenEffectMobEffect;
import net.mcreator.dbm.DbmMod;

public class DbmModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DbmMod.MODID);
	public static final RegistryObject<MobEffect> TAIYOKEN_EFFECT = REGISTRY.register("taiyoken_effect", () -> new TaiyokenEffectMobEffect());
}
