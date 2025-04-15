
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dbm.client.particle.TeleportationParticleParticle;
import net.mcreator.dbm.client.particle.ParticlePunch3Particle;
import net.mcreator.dbm.client.particle.ParticlePunch2Particle;
import net.mcreator.dbm.client.particle.ParticlePunch1Particle;
import net.mcreator.dbm.client.particle.ParticleHeavyParticle;
import net.mcreator.dbm.client.particle.ParticleBlockParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DbmModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DbmModParticleTypes.PARTICLE_PUNCH_1.get(), ParticlePunch1Particle::provider);
		event.registerSpriteSet(DbmModParticleTypes.PARTICLE_PUNCH_2.get(), ParticlePunch2Particle::provider);
		event.registerSpriteSet(DbmModParticleTypes.PARTICLE_PUNCH_3.get(), ParticlePunch3Particle::provider);
		event.registerSpriteSet(DbmModParticleTypes.PARTICLE_BLOCK.get(), ParticleBlockParticle::provider);
		event.registerSpriteSet(DbmModParticleTypes.TELEPORTATION_PARTICLE.get(), TeleportationParticleParticle::provider);
		event.registerSpriteSet(DbmModParticleTypes.PARTICLE_HEAVY.get(), ParticleHeavyParticle::provider);
	}
}
