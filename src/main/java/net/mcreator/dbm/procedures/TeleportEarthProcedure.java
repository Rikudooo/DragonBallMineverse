package net.mcreator.dbm.procedures;

import net.minecraftforge.common.util.ITeleporter;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;

import java.util.function.Function;
import java.util.List;
import java.util.Comparator;

public class TeleportEarthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String CurrentPlanet = "";
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).StoryGUI == 72) {
					if (world instanceof ServerLevel _currentLevel) {
						Entity _entity = entityiterator;
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
			}
		}
	}
}
