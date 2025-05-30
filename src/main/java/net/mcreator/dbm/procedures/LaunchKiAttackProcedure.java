package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModMobEffects;
import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.entity.SpiritBombEntity;
import net.mcreator.dbm.entity.GiantKiBlastEntity;
import net.mcreator.dbm.DbmMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class LaunchKiAttackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getY(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double y, Entity entity) {
		execute(null, world, y, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		boolean stop = false;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).LaunchKiAttack == true) {
			if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration > 160) {
				CancelKiAttackProcedure.execute(world, entity);
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Kamehameha")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize < 64) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize + 1.2;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackSize = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				KiWaveLoopProcedure.execute(world, entity);
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "kamehameha"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("kamehameha"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 1;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Spirit Bomb")) {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (stop == false) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new SpiritBombEntity(DbmModEntities.SPIRIT_BOMB.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, (float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDamage, 0, (byte) 10);
						_entityToSpawn.setPos((entity.getX()),
								(entity.getY() + entity.getBbHeight() + 1 + 15 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					stop = true;
				}
				{
					double _setval = 161;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CancelKiAttackProcedure.execute(world, entity);
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.LaunchKiAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Empty";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedKiAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackCharge = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackCost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDamage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackSize = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "stop"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("stop"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OldYawAndPitch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Ki Wave")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize < 64) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize + 4;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackSize = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				KiWaveLoopProcedure.execute(world, entity);
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "kiwave"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("kiwave"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 3;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Giant Ki Blast")) {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (stop == false) {
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
							}.getArrow(projectileLevel, entity, (float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDamage, 0, (byte) 5);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					stop = true;
				}
				{
					double _setval = 161;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CancelKiAttackProcedure.execute(world, entity);
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.LaunchKiAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Empty";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedKiAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackCharge = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackCost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDamage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackSize = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "stop"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("stop"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OldYawAndPitch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Makankosappo")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize < 64) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize + 4;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackSize = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				KiWaveLoopProcedure.execute(world, entity);
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "kiwave"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("kiwave"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 2;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll < 360) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll + 3;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Tribeam")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize < 64) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize + 4;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackSize = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				KiWaveLoopProcedure.execute(world, entity);
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "tribeamcharge"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("tribeamcharge"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 4;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll < 360) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll + 3;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Frokankusappo")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:beamfire_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize < 64) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackSize + 4;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackSize = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				KiWaveLoopProcedure.execute(world, entity);
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "kiwave"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("kiwave"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 2;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll < 360) {
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackRoll + 3;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiAttackRoll = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SelectedKiAttack).equals("Solar Flare")) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYawAndPitch == false) {
					{
						double _setval = entity.getYRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYAW = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = entity.getXRot();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.OldYawAndPitch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), y, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:solarchargelaunch")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), y, (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:solarchargelaunch")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				x = Math.sin(Math.toRadians(entity.getYRot())) * (-1.5);
				z = Math.cos(Math.toRadians(entity.getYRot())) * 1.5;
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldYAW);
					_ent.setXRot((float) (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).OldPitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "solarflare"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("solarflare"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), y, (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(DbmModMobEffects.TAIYOKEN_EFFECT.get(), 300, 0, false, false));
						}
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackDuration + 50;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.KiAttackDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
