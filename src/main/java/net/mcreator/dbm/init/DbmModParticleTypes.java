
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.dbm.DbmMod;

public class DbmModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DbmMod.MODID);
	public static final RegistryObject<SimpleParticleType> PARTICLE_PUNCH_1 = REGISTRY.register("particle_punch_1", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PARTICLE_PUNCH_2 = REGISTRY.register("particle_punch_2", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PARTICLE_PUNCH_3 = REGISTRY.register("particle_punch_3", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PARTICLE_BLOCK = REGISTRY.register("particle_block", () -> new SimpleParticleType(true));
}
