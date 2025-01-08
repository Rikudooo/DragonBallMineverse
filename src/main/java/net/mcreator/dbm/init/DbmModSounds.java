
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dbm.DbmMod;

public class DbmModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DbmMod.MODID);
	public static final RegistryObject<SoundEvent> PUNCH1 = REGISTRY.register("punch1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "punch1")));
	public static final RegistryObject<SoundEvent> PUNCH2 = REGISTRY.register("punch2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "punch2")));
	public static final RegistryObject<SoundEvent> PUNCH3 = REGISTRY.register("punch3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "punch3")));
	public static final RegistryObject<SoundEvent> DETRANSFORM = REGISTRY.register("detransform", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "detransform")));
	public static final RegistryObject<SoundEvent> AURA = REGISTRY.register("aura", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "aura")));
	public static final RegistryObject<SoundEvent> TRANSFORM = REGISTRY.register("transform", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "transform")));
	public static final RegistryObject<SoundEvent> KIBLAST = REGISTRY.register("kiblast", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "kiblast")));
	public static final RegistryObject<SoundEvent> JUMP = REGISTRY.register("jump", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "jump")));
	public static final RegistryObject<SoundEvent> BLOCK = REGISTRY.register("block", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "block")));
	public static final RegistryObject<SoundEvent> KAMEHAMEHA_CHARGE = REGISTRY.register("kamehameha_charge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "kamehameha_charge")));
	public static final RegistryObject<SoundEvent> BEAMFIRE_1 = REGISTRY.register("beamfire_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "beamfire_1")));
	public static final RegistryObject<SoundEvent> KIWAVE_CHARGE = REGISTRY.register("kiwave_charge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "kiwave_charge")));
	public static final RegistryObject<SoundEvent> SHENRONCALLED = REGISTRY.register("shenroncalled", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "shenroncalled")));
	public static final RegistryObject<SoundEvent> TELEPORTATION = REGISTRY.register("teleportation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dbm", "teleportation")));
}
