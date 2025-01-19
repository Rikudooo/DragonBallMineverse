package net.mcreator.dbm.procedures;

import net.minecraftforge.common.util.ITeleporter;

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

import java.util.function.Function;

public class EnterSpaceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String CurrentPlanet = "";
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			CurrentPlanet = "Earth";
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:namek"))) {
			CurrentPlanet = "Namek";
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:yardrat"))) {
			CurrentPlanet = "Yardrat";
		}
		if ((CurrentPlanet).equals("Earth")) {
			if (world instanceof ServerLevel _currentLevel) {
				Entity _entity = entity;
				ServerLevel _nextLevel = _currentLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:space")));
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
								_ent.teleportTo(200, 300, 200);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(200, 300, 200, _ent.getYRot(), _ent.getXRot());
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
		if ((CurrentPlanet).equals("Namek")) {
			if (world instanceof ServerLevel _currentLevel) {
				Entity _entity = entity;
				ServerLevel _nextLevel = _currentLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:space")));
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
								_ent.teleportTo(2100, 300, 2100);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(2100, 300, 2100, _ent.getYRot(), _ent.getXRot());
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
		if ((CurrentPlanet).equals("Yardrat")) {
			if (world instanceof ServerLevel _currentLevel) {
				Entity _entity = entity;
				ServerLevel _nextLevel = _currentLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:space")));
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
								_ent.teleportTo(4600, 300, (-4600));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(4600, 300, (-4600), _ent.getYRot(), _ent.getXRot());
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
	}
}
