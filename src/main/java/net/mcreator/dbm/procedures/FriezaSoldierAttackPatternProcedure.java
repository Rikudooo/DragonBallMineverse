package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.init.DbmModParticleTypes;
import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;
import net.mcreator.dbm.entity.GiantKiBlastEntity;

public class FriezaSoldierAttackPatternProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) > 100) {
			if (entity instanceof StoryFriezaSoldierEntity _datEntSetL)
				_datEntSetL.getEntityData().set(StoryFriezaSoldierEntity.DATA_KiCharging, false);
			if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Ki, 100);
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) < 0) {
			if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Ki, 0);
		}
		if ((entity instanceof StoryFriezaSoldierEntity _datEntL6 && _datEntL6.getEntityData().get(StoryFriezaSoldierEntity.DATA_KiCharging)) == true) {
			if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Ki, (int) ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) + 0.5));
		}
		if (entity.getPersistentData().getDouble("attackInterval") < 90) {
			entity.getPersistentData().putDouble("attackInterval", (entity.getPersistentData().getDouble("attackInterval") + 1));
		} else if (entity.getPersistentData().getDouble("attackInterval") >= 90) {
			if (!(null == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))) {
				if (entity.getPersistentData().getBoolean("UsingKiAttack") == false) {
					if ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) >= 10) {
						if (Math.random() < 0.3) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.TELEPORTATION_PARTICLE.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 5, 0, 0, 0, 0);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:teleportation")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:teleportation")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
										((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
											((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), _ent.getYRot(), _ent.getXRot());
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:teleportation")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:teleportation")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.TELEPORTATION_PARTICLE.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 5, 0, 0, 0, 0);
							entity.getPersistentData().putBoolean("UsingKiAttack", false);
							entity.getPersistentData().putDouble("attackInterval", 0);
							if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Ki, (int) ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) - 10));
						} else {
							if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 10) {
								if ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) >= 40) {
									entity.getPersistentData().putDouble("attackInterval", 0);
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
													AbstractArrow entityToSpawn = new GiantKiBlastEntity(DbmModEntities.GIANT_KI_BLAST.get(), level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setPierceLevel(piercing);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity,
													(float) ((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE)
															? _livingEntity42.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue()
															: 0) * 3),
													1, (byte) 1);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
									entity.getPersistentData().putBoolean("UsingKiAttack", false);
									if (entity instanceof StoryFriezaSoldierEntity _datEntSetI)
										_datEntSetI.getEntityData().set(StoryFriezaSoldierEntity.DATA_Ki, (int) ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) - 40));
								}
							}
						}
					} else if ((entity instanceof StoryFriezaSoldierEntity _datEntI ? _datEntI.getEntityData().get(StoryFriezaSoldierEntity.DATA_Ki) : 0) < 10) {
						if (entity instanceof StoryFriezaSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(StoryFriezaSoldierEntity.DATA_KiCharging, true);
					}
				}
			}
		}
	}
}
