package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import com.mojang.util.UUIDTypeAdapter;

@Mod.EventBusSubscriber
public class FusionStatsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused).equals("None")) {
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
			}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)) == null)) {
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).HairStyleID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedHairStyleID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Skin3ID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedSkin3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).Skin4ID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedSkin4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).EyesTypeID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedEyesTypeID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).EyesColorID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedEyesColorID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).MouthID;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedMouth = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/fusionclothes.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusionClothes = _setval;
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
					}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbmModVariables.PlayerVariables())).HairStyle;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FusedHairstyle = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Android")) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Warrior")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 15 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 15)
											/ 1.5)
									* 0.85;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Martial Artist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 15 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 15)
											/ 1.5)
									* 1.05;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Spiritualist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 15 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 15 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 15)
											/ 1.5)
									* 1.2;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Race).equals("Arcosian")) {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Warrior")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 35 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 35)
											/ 1.5)
									* 0.85;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Martial Artist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 35 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 35)
											/ 1.5)
									* 1.05;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Spiritualist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 35 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 35 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 35)
											/ 1.5)
									* 1.2;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Warrior")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 25 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 25)
											/ 1.5)
									* 0.85;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Martial Artist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 25 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 25)
											/ 1.5)
									* 1.05;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Spiritualist")) {
						{
							double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 25 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25
									+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 25 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 25)
											/ 1.5)
									* 1.2;
							entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxKi = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
				if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).BodyType).equals("Namekian")) {
					{
						double _setval = ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
										+ (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 20;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).BodyType).equals("Namekian")) {
					{
						double _setval = ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
										+ (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 24;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Warrior")) {
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
												+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7)
										/ 1.5)
								* 35;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxStamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 1.2 + (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 1.2 + (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 1.2;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MeleeDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
										+ (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 0.9;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Martial Artist")) {
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
												+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7)
										/ 1.5)
								* 30;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxStamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 1.2 + (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 1.2 + (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 1.05;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MeleeDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
										+ (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 1.05;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FightingClass).equals("Spiritualist")) {
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.7
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7
												+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1
														- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7 + ((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 - (new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 1 * 0.7)
														* (((new Object() {
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
														}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
												* 0.7)
										/ 1.5)
								* 25;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxStamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
								* 1.2 + (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										* 1.2 + (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 0.9;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MeleeDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
								* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
										- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
										* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ (new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
								+ ((new Object() {
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
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
										* (((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
								+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
										* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25
										+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
												* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
												- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
														* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.25)
												* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
										+ (new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
										+ ((new Object() {
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
										}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
												* (((new Object() {
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
												}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
														.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
										/ 1.5)
								* 1.2;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KiDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 5 * 0.7
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15
									- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
									* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
							+ (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Agility * 5 * 0.7
							+ ((new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 - (new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
									* (((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 5 * 0.7
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20)
									+ (new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Agility * 5 * 0.7
									+ ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 - (new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
											* (((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									/ 1.5;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Speed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.05
							+ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 0.6
							+ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.35 + (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Body * 0.05
							+ (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Agility * 0.6
							+ (new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.35
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.05
									+ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 0.6
									+ (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.35 + (new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Body * 0.05
									+ (new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Agility * 0.6
									+ (new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.35)
									/ 1.5)
							* 6) / 5;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Defense = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Defense
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Defense
									* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
									* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower
									- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Defense
											* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
											* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower * 0.3)
									* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20);
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Resilience = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
									- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
									* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
							* 1.5
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 0.15
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 1.3
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 0.8
							+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 0.7)
							* 1.5 + (((new Object() {
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
							}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
											* (((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 1.5 + ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.15
									+ ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 1.3
									+ ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.8
									+ ((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.7)
									* 1.5
							+ ((((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength
											- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
											* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
									* 1.5
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.15
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 1.3
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.8
									+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55
											+ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit
													- (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
													* (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 0.7)
									* 1.5 + (((new Object() {
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
									}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Strength - (new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Strength * 0.3)
													* (((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
											* 1.5 + ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Agility * 15 * 0.7)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 0.15
											+ ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Focus * 0.25)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 1.3
											+ ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Body * 0.5 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Body * 0.5)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 0.8
											+ ((new Object() {
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
											}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55 + ((new Object() {
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
													}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
															.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit - (new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Spirit * 0.55)
															* (((new Object() {
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
															}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused))
																	.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age - 10) / 20))
													* 0.7)
											* 1.5)
									/ 1.5)
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TotalFormBoost
							* (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasedPower;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PowerLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
						}
						return false;
					}
				}.checkGamemode(entity)) {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).Form;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Form = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(new Object() {
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
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
						}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DbmModVariables.PlayerVariables())).Ki;
						entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Ki = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Fused = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Fusion = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
