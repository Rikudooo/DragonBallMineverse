package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import com.mojang.util.UUIDTypeAdapter;

@Mod.EventBusSubscriber
public class HasGroupProcedure {
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
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Group == true) {
			if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1).equals(entity.getStringUUID())) {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)) == null)) {
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Member2))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Member2;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Member2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Member3))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Member3;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Member3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Member4))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Member4;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Member4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Member2))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Member5;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Member5 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).StoryModeProgress).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).StoryModeProgress))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).StoryModeProgress;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StoryModeProgress = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).StoryGUI != (new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).StoryGUI) {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).StoryGUI;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StoryGUI = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SaibamanDefeated != (new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).SaibamanDefeated) {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).SaibamanDefeated;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SaibamanDefeated = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriezaSoldierDefeated != (new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).FriezaSoldierDefeated) {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).FriezaSoldierDefeated;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.FriezaSoldierDefeated = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
					if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FriendlyFire).equals((new Object() {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).FriendlyFire))) {
						{
							String _setval = (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).FriendlyFire;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FriendlyFire = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)) == null)) {
				if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName1).equals(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getDisplayName().getString())) && !(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)) == null)) {
					{
						String _setval = new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1)).getDisplayName().getString();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MemberName1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)) == null)) {
				if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName2).equals(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)).getDisplayName().getString())) && !(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)) == null)) {
					{
						String _setval = new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2)).getDisplayName().getString();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MemberName2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)) == null)) {
				if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName3).equals(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)).getDisplayName().getString())) && !(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)) == null)) {
					{
						String _setval = new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3)).getDisplayName().getString();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MemberName3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)) == null)) {
				if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName4).equals(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)).getDisplayName().getString())) && !(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)) == null)) {
					{
						String _setval = new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4)).getDisplayName().getString();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MemberName4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5)) == null)) {
				if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).MemberName5).equals(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5)).getDisplayName().getString())) && !(new Object() {
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
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5)) == null)) {
					{
						String _setval = new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5)).getDisplayName().getString();
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MemberName5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1).equals("None")) {
				LeaveGroupProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
