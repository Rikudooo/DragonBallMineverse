package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.init.DbmModParticleTypes;
import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.StoryTienshinhanEntity;
import net.mcreator.dbm.entity.GiantKiBlastEntity;

import java.util.List;
import java.util.Comparator;

public class TienshinhanAttackPatternProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("attackInterval") < 90) {
			entity.getPersistentData().putDouble("attackInterval", (entity.getPersistentData().getDouble("attackInterval") + 1));
		} else if (entity.getPersistentData().getDouble("attackInterval") >= 90) {
			if (!(null == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))) {
				if (Math.random() < 0.4) {
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
					entity.getPersistentData().putString("SelectedKiAttack", "None");
					entity.getPersistentData().putBoolean("UsingKiAttack", false);
				} else {
					if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 10
							&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) < 20) {
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
										(float) ((entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity29.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0)
												* 3),
										1, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						entity.getPersistentData().putString("SelectedKiAttack", "None");
						entity.getPersistentData().putBoolean("UsingKiAttack", false);
					} else if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) >= 20) {
						entity.getPersistentData().putDouble("KiAttackDuration", 0);
						if (entity instanceof StoryTienshinhanEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_OldYAW, (int) entity.getYRot());
						if (entity instanceof StoryTienshinhanEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_OldPITCH, (int) entity.getXRot());
						if (entity instanceof StoryTienshinhanEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StoryTienshinhanEntity.DATA_SelectedKiAttack, "Tribeam");
						entity.getPersistentData().putBoolean("UsingKiAttack", true);
					}
				}
			}
			if (entity.getPersistentData().getBoolean("UsingKiAttack") == false) {
				entity.getPersistentData().putDouble("attackInterval", 0);
			} else if (entity.getPersistentData().getBoolean("UsingKiAttack") == true) {
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_OldYAW) : 0));
					_ent.setXRot((float) (entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_OldPITCH) : 0));
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (entity instanceof StoryTienshinhanEntity _datEntSetI)
					_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_KiAttackSize, (int) ((entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackSize) : 0) + 3));
				for (int index0 = 0; index0 < 50; index0++) {
					{
						final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * (entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackHits) : 0)),
								(entity.getY() + entity.getLookAngle().y * (entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackHits) : 0)),
								(entity.getZ() + entity.getLookAngle().z * (entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackHits) : 0)));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("dbm:kikoha")))),
										(float) ((entity instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity62.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0)
												* 2.5));
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
							}
						}
					}
					if (entity instanceof StoryTienshinhanEntity _datEntSetI)
						_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_KiAttackHits, (int) ((entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackHits) : 0) + 2));
				}
				if (entity instanceof StoryTienshinhanEntity _datEntSetI)
					_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_KiAttackHits, 0);
				if ((entity instanceof StoryTienshinhanEntity _datEntI ? _datEntI.getEntityData().get(StoryTienshinhanEntity.DATA_KiAttackSize) : 0) <= 50) {
					entity.getPersistentData().putDouble("KiAttackDuration", (entity.getPersistentData().getDouble("KiAttackDuration") + 1));
				}
				if (entity.getPersistentData().getDouble("KiAttackDuration") >= 65) {
					if (entity instanceof StoryTienshinhanEntity _datEntSetS)
						_datEntSetS.getEntityData().set(StoryTienshinhanEntity.DATA_SelectedKiAttack, "None");
					if (entity instanceof StoryTienshinhanEntity _datEntSetI)
						_datEntSetI.getEntityData().set(StoryTienshinhanEntity.DATA_KiAttackSize, 0);
					entity.getPersistentData().putBoolean("UsingKiAttack", false);
					entity.getPersistentData().putDouble("KiAttackDuration", 0);
				}
			}
		}
	}
}
