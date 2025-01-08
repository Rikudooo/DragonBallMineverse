
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dbm.world.features.KameHouseFeature;
import net.mcreator.dbm.DbmMod;

@Mod.EventBusSubscriber
public class DbmModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DbmMod.MODID);
	public static final RegistryObject<Feature<?>> KAME_HOUSE = REGISTRY.register("kame_house", KameHouseFeature::new);
}
