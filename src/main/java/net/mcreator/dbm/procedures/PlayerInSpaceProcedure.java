package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.util.ITeleporter;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.entity.NamekEEntity;
import net.mcreator.dbm.entity.EarthEEntity;

import javax.annotation.Nullable;

import java.util.function.Function;

@Mod.EventBusSubscriber
public class PlayerInSpaceProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:space"))) {
			if (!entity.isNoGravity()) {
				entity.setNoGravity(true);
			}
			if (!world.getEntitiesOfClass(EarthEEntity.class, AABB.ofSize(new Vec3(x, y, z), 95, 95, 95), e -> true).isEmpty()) {
				if (world instanceof ServerLevel _currentLevel) {
					Entity _entity = entity;
					ServerLevel _nextLevel = _currentLevel.getServer().getLevel(Level.OVERWORLD);
					if (_entity.canChangeDimensions() && _nextLevel != null && !_nextLevel.dimension().equals(_currentLevel.dimension())) {
						ITeleporter _iTeleporter = new ITeleporter() {
							@Override
							public Entity placeEntity(Entity currentEntity, ServerLevel currentLevel, ServerLevel nextLevel, float rotation, Function<Boolean, Entity> function) {
								if (currentEntity instanceof ServerPlayer serverPlayer) {
									serverPlayer.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
									serverPlayer.teleportTo(nextLevel, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
									this.execute(nextLevel, serverPlayer);
									serverPlayer.connection.send(new ClientboundPlayerAbilitiesPacket(serverPlayer.getAbilities()));
									for (MobEffectInstance mobEffectInstance : serverPlayer.getActiveEffects())
										serverPlayer.connection.send(new ClientboundUpdateMobEffectPacket(serverPlayer.getId(), mobEffectInstance));
									serverPlayer.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
									return serverPlayer;
								} else {
									Entity nextEntity = currentEntity.getType().create(nextLevel);
									if (nextEntity == null) {
										return currentEntity;
									} else {
										nextEntity.restoreFrom(currentEntity);
										nextEntity.moveTo(currentEntity.getX(), currentEntity.getY(), currentEntity.getZ(), currentEntity.getYRot(), currentEntity.getXRot());
										this.execute(nextLevel, nextEntity);
										nextLevel.addDuringTeleport(nextEntity);
										return nextEntity;
									}
								}
							}

							@Override
							public boolean isVanilla() {
								return false;
							}

							public void execute(LevelAccessor world, Entity entityinstance) {
								{
									Entity _ent = entityinstance;
									_ent.teleportTo(x, 400, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, 400, z, _ent.getYRot(), _ent.getXRot());
								}
							}
						};
						if (_entity instanceof ServerPlayer _serverPlayer) {
							_iTeleporter.placeEntity(_serverPlayer, _currentLevel, _nextLevel, 0.0F, null);
						} else {
							_entity.changeDimension(_nextLevel, _iTeleporter);
						}
					}
				}
			}
			if (!world.getEntitiesOfClass(NamekEEntity.class, AABB.ofSize(new Vec3(x, y, z), 95, 95, 95), e -> true).isEmpty()) {
				if (world instanceof ServerLevel _currentLevel) {
					Entity _entity = entity;
					ServerLevel _nextLevel = _currentLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:namek")));
					if (_entity.canChangeDimensions() && _nextLevel != null && !_nextLevel.dimension().equals(_currentLevel.dimension())) {
						ITeleporter _iTeleporter = new ITeleporter() {
							@Override
							public Entity placeEntity(Entity currentEntity, ServerLevel currentLevel, ServerLevel nextLevel, float rotation, Function<Boolean, Entity> function) {
								if (currentEntity instanceof ServerPlayer serverPlayer) {
									serverPlayer.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
									serverPlayer.teleportTo(nextLevel, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
									this.execute(nextLevel, serverPlayer);
									serverPlayer.connection.send(new ClientboundPlayerAbilitiesPacket(serverPlayer.getAbilities()));
									for (MobEffectInstance mobEffectInstance : serverPlayer.getActiveEffects())
										serverPlayer.connection.send(new ClientboundUpdateMobEffectPacket(serverPlayer.getId(), mobEffectInstance));
									serverPlayer.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
									return serverPlayer;
								} else {
									Entity nextEntity = currentEntity.getType().create(nextLevel);
									if (nextEntity == null) {
										return currentEntity;
									} else {
										nextEntity.restoreFrom(currentEntity);
										nextEntity.moveTo(currentEntity.getX(), currentEntity.getY(), currentEntity.getZ(), currentEntity.getYRot(), currentEntity.getXRot());
										this.execute(nextLevel, nextEntity);
										nextLevel.addDuringTeleport(nextEntity);
										return nextEntity;
									}
								}
							}

							@Override
							public boolean isVanilla() {
								return false;
							}

							public void execute(LevelAccessor world, Entity entityinstance) {
								{
									Entity _ent = entityinstance;
									_ent.teleportTo(x, 400, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, 400, z, _ent.getYRot(), _ent.getXRot());
								}
							}
						};
						if (_entity instanceof ServerPlayer _serverPlayer) {
							_iTeleporter.placeEntity(_serverPlayer, _currentLevel, _nextLevel, 0.0F, null);
						} else {
							_entity.changeDimension(_nextLevel, _iTeleporter);
						}
					}
				}
			}
			if (new Vec3(x, y, z).distanceTo(new Vec3(4500, 160, (-4500))) <= 120) {
				if (world instanceof ServerLevel _currentLevel) {
					Entity _entity = entity;
					ServerLevel _nextLevel = _currentLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:yardrat")));
					if (_entity.canChangeDimensions() && _nextLevel != null && !_nextLevel.dimension().equals(_currentLevel.dimension())) {
						ITeleporter _iTeleporter = new ITeleporter() {
							@Override
							public Entity placeEntity(Entity currentEntity, ServerLevel currentLevel, ServerLevel nextLevel, float rotation, Function<Boolean, Entity> function) {
								if (currentEntity instanceof ServerPlayer serverPlayer) {
									serverPlayer.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
									serverPlayer.teleportTo(nextLevel, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
									this.execute(nextLevel, serverPlayer);
									serverPlayer.connection.send(new ClientboundPlayerAbilitiesPacket(serverPlayer.getAbilities()));
									for (MobEffectInstance mobEffectInstance : serverPlayer.getActiveEffects())
										serverPlayer.connection.send(new ClientboundUpdateMobEffectPacket(serverPlayer.getId(), mobEffectInstance));
									serverPlayer.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
									return serverPlayer;
								} else {
									Entity nextEntity = currentEntity.getType().create(nextLevel);
									if (nextEntity == null) {
										return currentEntity;
									} else {
										nextEntity.restoreFrom(currentEntity);
										nextEntity.moveTo(currentEntity.getX(), currentEntity.getY(), currentEntity.getZ(), currentEntity.getYRot(), currentEntity.getXRot());
										this.execute(nextLevel, nextEntity);
										nextLevel.addDuringTeleport(nextEntity);
										return nextEntity;
									}
								}
							}

							@Override
							public boolean isVanilla() {
								return false;
							}

							public void execute(LevelAccessor world, Entity entityinstance) {
								{
									Entity _ent = entityinstance;
									_ent.teleportTo(x, 400, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, 400, z, _ent.getYRot(), _ent.getXRot());
								}
							}
						};
						if (_entity instanceof ServerPlayer _serverPlayer) {
							_iTeleporter.placeEntity(_serverPlayer, _currentLevel, _nextLevel, 0.0F, null);
						} else {
							_entity.changeDimension(_nextLevel, _iTeleporter);
						}
					}
				}
			}
		} else {
			entity.setNoGravity(false);
		}
	}
}
