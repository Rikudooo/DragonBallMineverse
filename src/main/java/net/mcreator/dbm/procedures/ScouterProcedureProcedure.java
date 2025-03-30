package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

import com.mojang.util.UUIDTypeAdapter;

@Mod.EventBusSubscriber
public class ScouterProcedureProcedure {
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
		boolean TargetSet = false;
		Entity NearestEntity = null;
		Entity StrongestEntity = null;
		double HighestPL = 0;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Headwear).contains("scouter_")) {
			if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterMode > 0) {
				if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterMode == 1) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterLocked == false) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5000 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (TargetSet == false) {
									if (!(entity == entityiterator)) {
										if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
											NearestEntity = entityiterator;
											TargetSet = true;
											{
												String _setval = NearestEntity.getStringUUID();
												entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ScouterEntity = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											NearestEntity = null;
										}
									}
								}
							}
						}
					}
					if (!(NearestEntity == null)) {
						if (!(new Object() {
							Entity getEntity(String uuid) {
								Entity _uuidentity = null;
								if (world instanceof ServerLevel _server) {
									try {
										_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
									} catch (IllegalArgumentException e) {
									}
								}
								return _uuidentity;
							}
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) == null) && !(new Object() {
							Entity getEntity(String uuid) {
								Entity _uuidentity = null;
								if (world instanceof ServerLevel _server) {
									try {
										_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
									} catch (IllegalArgumentException e) {
									}
								}
								return _uuidentity;
							}
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) == null)) {
							{
								double _setval = new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) != null ? entity.distanceTo(new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity))) : -1;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ScouterDistance = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = (new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).PowerLevel;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ScouterPL = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				} else if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterMode == 3) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterLocked == false) {
						HighestPL = 0;
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1000 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (TargetSet == false) {
									if (!(entity == entityiterator)) {
										if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
											HighestPL = (entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel;
											if ((entityiterator.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel > HighestPL) {
												StrongestEntity = entityiterator;
												TargetSet = true;
												{
													String _setval = StrongestEntity.getStringUUID();
													entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.ScouterEntity = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											}
										} else {
											StrongestEntity = null;
										}
									}
								}
							}
						}
					}
					if (!(StrongestEntity == null)) {
						if (!(new Object() {
							Entity getEntity(String uuid) {
								Entity _uuidentity = null;
								if (world instanceof ServerLevel _server) {
									try {
										_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
									} catch (IllegalArgumentException e) {
									}
								}
								return _uuidentity;
							}
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) == null) && !(new Object() {
							Entity getEntity(String uuid) {
								Entity _uuidentity = null;
								if (world instanceof ServerLevel _server) {
									try {
										_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
									} catch (IllegalArgumentException e) {
									}
								}
								return _uuidentity;
							}
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) == null)) {
							{
								double _setval = new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)) != null ? entity.distanceTo(new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity))) : -1;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ScouterDistance = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = (new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ScouterEntity)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).PowerLevel;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ScouterPL = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			}
		}
	}
}
