package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DefenseProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, x, y, z, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double damage = 0;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (!(sourceentity instanceof Player || sourceentity instanceof ServerPlayer)) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower > 0.01) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == false) {
						damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
						if (event instanceof LivingHurtEvent event2) {
							event2.setAmount((float) damage);
						}
					} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).Stamina >= (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
										- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
												/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
							damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9 * 0.2;
							if (event instanceof LivingHurtEvent event2) {
								event2.setAmount((float) damage);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_BLOCK.get()), x, y, z, 1, 0, 0, 0, 0);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).Stamina < (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
										- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
												/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
							damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
							if (event instanceof LivingHurtEvent event2) {
								event2.setAmount((float) damage);
							}
						}
					}
				}
			} else if (sourceentity instanceof Player || sourceentity instanceof ServerPlayer) {
				if (!((sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5))) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower > 0.01) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == false) {
							damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
							if (event instanceof LivingHurtEvent event2) {
								event2.setAmount((float) damage);
							}
						} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
							if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Stamina >= (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
											- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
													/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
								damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9 * 0.2;
								if (event instanceof LivingHurtEvent event2) {
									event2.setAmount((float) damage);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_BLOCK.get()), x, y, z, 1, 0, 0, 0, 0);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Stamina < (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
											- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
													/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
								damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
								if (event instanceof LivingHurtEvent event2) {
									event2.setAmount((float) damage);
								}
							}
						}
					}
				} else if ((sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)
						|| (sourceentity.getStringUUID()).equals((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5)) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Off")) {
						damage = 0;
						if (event instanceof LivingHurtEvent event2) {
							event2.setAmount((float) damage);
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("On")) {
						if (amount < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
							if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower > 0.01) {
								if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == false) {
									damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
									if (event instanceof LivingHurtEvent event2) {
										event2.setAmount((float) damage);
									}
								} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
									if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Stamina >= (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
													- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
															/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
										damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9 * 0.2;
										if (event instanceof LivingHurtEvent event2) {
											event2.setAmount((float) damage);
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_BLOCK.get()), x, y, z, 1, 0, 0, 0, 0);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
									} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Stamina < (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
													- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
															/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
										damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
										if (event instanceof LivingHurtEvent event2) {
											event2.setAmount((float) damage);
										}
									}
								}
							}
						} else if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
							damage = 0;
							if (event instanceof LivingHurtEvent event2) {
								event2.setAmount((float) damage);
							}
							{
								double _setval = 3000;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.KOTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = true;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.KOed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals("Kill")) {
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower > 0.01) {
							if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == false) {
								damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
								if (event instanceof LivingHurtEvent event2) {
									event2.setAmount((float) damage);
								}
							} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
								if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Stamina >= (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
												- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
														/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
									damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9 * 0.2;
									if (event instanceof LivingHurtEvent event2) {
										event2.setAmount((float) damage);
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_BLOCK.get()), x, y, z, 1, 0, 0, 0, 0);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:block")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
								} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Stamina < (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
												- ((amount / (1 - (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower))
														/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.6) {
									damage = amount * (amount / (amount + (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Resilience)) * 0.9;
									if (event instanceof LivingHurtEvent event2) {
										event2.setAmount((float) damage);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
