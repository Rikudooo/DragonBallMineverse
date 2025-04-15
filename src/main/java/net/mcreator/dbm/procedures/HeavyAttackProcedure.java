package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.Connection;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModParticleTypes;
import net.mcreator.dbm.DbmMod;

import javax.annotation.Nullable;

import java.util.function.Supplier;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class HeavyAttackProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		DbmMod.PACKET_HANDLER.sendToServer(new HeavyAttackMessage());
		execute(event.getLevel(), event.getEntity());
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class HeavyAttackMessage {
		public HeavyAttackMessage() {
		}

		public HeavyAttackMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(HeavyAttackMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(HeavyAttackMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level().hasChunkAt(context.getSender().blockPosition()))
					return;
				execute(context.getSender().level(), context.getSender());
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			DbmMod.addNetworkMessage(HeavyAttackMessage.class, HeavyAttackMessage::buffer, HeavyAttackMessage::new, HeavyAttackMessage::handler);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Distance = 0;
		double yaw = 0;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HeavyAttackinCD == false) {
			if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).AlternativeFunction == false) {
				Distance = 2;
				if (!entity.isShiftKeyDown() && (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePressed == false
						|| entity.isShiftKeyDown() && (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePressed == true) {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "heavy3"))));
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
										DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("heavy3"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
								}
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_HEAVY.get()), (entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance),
								(entity.getZ() + entity.getLookAngle().z * Distance), 1, 0, 0, 0, 1);
					for (int index0 = 0; index0 < 1; index0++) {
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("dbm:safezone")))) {
										if (world instanceof Level _level) {
											if (_level.isClientSide()) {
												_level.playLocalSound((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:heavyattack")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)),
												(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5));
										if (world.isClientSide()) {
											if (entityiterator instanceof AbstractClientPlayer player) {
												var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
												if (animation != null) {
													animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "knockedback"))));
												}
											}
										}
										if (!world.isClientSide()) {
											if (entityiterator instanceof Player && world instanceof ServerLevel srvLvl_) {
												List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
												synchronized (connections) {
													Iterator<Connection> iterator = connections.iterator();
													while (iterator.hasNext()) {
														Connection connection = iterator.next();
														if (!connection.isConnecting() && connection.isConnected())
															DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("knockedback"), entityiterator.getId(), true), connection,
																	NetworkDirection.PLAY_TO_CLIENT);
													}
												}
											}
										}
										yaw = entity.getYRot();
										entityiterator.setDeltaMovement(new Vec3((2 * Math.cos((yaw + 90) * (Math.PI / 180))), 0, (2 * Math.sin((yaw + 90) * (Math.PI / 180)))));
										if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
											{
												double _setval = (entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5 * 0.5;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Stamina = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												double _setval = 0;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaTimer = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = true;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaPause = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = false;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Blocking = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
									}
								}
							}
						}
					}
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
								- (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5)
										/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.1;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaPause = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackinCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.isShiftKeyDown() && (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePressed == false) {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "heavy1"))));
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
										DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("heavy1"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
								}
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_HEAVY.get()), (entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance),
								(entity.getZ() + entity.getLookAngle().z * Distance), 1, 0, 0, 0, 1);
					for (int index1 = 0; index1 < 1; index1++) {
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("dbm:safezone")))) {
										if (world instanceof Level _level) {
											if (_level.isClientSide()) {
												_level.playLocalSound((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:heavyattack")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)),
												(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5));
										if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Flying == true) {
											{
												boolean _setval = false;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Flying = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
										if (world.isClientSide()) {
											if (entityiterator instanceof AbstractClientPlayer player) {
												var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
												if (animation != null) {
													animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "groundslammed"))));
												}
											}
										}
										if (!world.isClientSide()) {
											if (entityiterator instanceof Player && world instanceof ServerLevel srvLvl_) {
												List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
												synchronized (connections) {
													Iterator<Connection> iterator = connections.iterator();
													while (iterator.hasNext()) {
														Connection connection = iterator.next();
														if (!connection.isConnecting() && connection.isConnected())
															DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("groundslammed"), entityiterator.getId(), true), connection,
																	NetworkDirection.PLAY_TO_CLIENT);
													}
												}
											}
										}
										entityiterator.setDeltaMovement(new Vec3(0, (-2), 0));
										if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
											{
												double _setval = (entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5 * 0.5;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Stamina = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												double _setval = 0;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaTimer = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = true;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaPause = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = false;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Blocking = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
									}
								}
							}
						}
					}
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
								- (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5)
										/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.1;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaPause = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackinCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (!entity.isShiftKeyDown() && (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePressed == true) {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "heavy2"))));
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
										DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("heavy2"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
								}
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (DbmModParticleTypes.PARTICLE_HEAVY.get()), (entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance),
								(entity.getZ() + entity.getLookAngle().z * Distance), 1, 0, 0, 0, 1);
					for (int index2 = 0; index2 < 1; index2++) {
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("dbm:safezone")))) {
										if (world instanceof Level _level) {
											if (_level.isClientSide()) {
												_level.playLocalSound((entity.getX() + entity.getLookAngle().x * Distance), (entity.getY() + entity.getLookAngle().y * Distance), (entity.getZ() + entity.getLookAngle().z * Distance),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:heavyattack")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)),
												(float) ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5));
										if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Flying == true) {
											{
												boolean _setval = false;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Flying = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
										entityiterator.setDeltaMovement(new Vec3(0, 2, 0));
										if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Blocking == true) {
											{
												double _setval = (entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5 * 0.5;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Stamina = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												double _setval = 0;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaTimer = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = true;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.StaminaPause = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												boolean _setval = false;
												entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Blocking = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
										if (world.isClientSide()) {
											if (entityiterator instanceof AbstractClientPlayer player) {
												var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
												if (animation != null) {
													animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "uppercutted"))));
												}
											}
										}
										if (!world.isClientSide()) {
											if (entityiterator instanceof Player && world instanceof ServerLevel srvLvl_) {
												List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
												synchronized (connections) {
													Iterator<Connection> iterator = connections.iterator();
													while (iterator.hasNext()) {
														Connection connection = iterator.next();
														if (!connection.isConnecting() && connection.isConnected())
															DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("uppercutted"), entityiterator.getId(), true), connection,
																	NetworkDirection.PLAY_TO_CLIENT);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					{
						double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Stamina
								- (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MeleeDamage * 1.5)
										/ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost) * 1.1;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StaminaPause = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeavyAttackinCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
