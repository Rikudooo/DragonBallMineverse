package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.dbm.network.DbmModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class AcceptMemberProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Group == false) {
			if (!((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "Player");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) == entity)) {
				if ((((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "Player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).CurrentInvite).equals(entity.getStringUUID())) {
					if ((((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "Player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member1).equals((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "Player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getStringUUID())) {
						if ((((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "Player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2).equals("None") || (((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "Player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3).equals("None") || (((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "Player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4).equals("None") || (((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "Player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5).equals("None")) {
							if ((((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "Player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member2).equals("None")) {
								{
									String _setval = "None";
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.CurrentInvite = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
								{
									String _setval = entity.getStringUUID();
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Member2 = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
							} else if ((((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "Player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member3).equals("None")) {
								{
									String _setval = "None";
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.CurrentInvite = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
								{
									String _setval = entity.getStringUUID();
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Member3 = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
							} else if ((((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "Player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member4).equals("None")) {
								{
									String _setval = "None";
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.CurrentInvite = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
								{
									String _setval = entity.getStringUUID();
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Member4 = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
							} else if ((((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "Player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Member5).equals("None")) {
								{
									String _setval = "None";
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.CurrentInvite = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
								{
									String _setval = entity.getStringUUID();
									(new Object() {
										public Entity getEntity() {
											try {
												return EntityArgument.getEntity(arguments, "Player");
											} catch (CommandSyntaxException e) {
												e.printStackTrace();
												return null;
											}
										}
									}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Member5 = _setval;
										capability.syncPlayerVariables((new Object() {
											public Entity getEntity() {
												try {
													return EntityArgument.getEntity(arguments, "Player");
												} catch (CommandSyntaxException e) {
													e.printStackTrace();
													return null;
												}
											}
										}.getEntity()));
									});
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Group = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "Player");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()).getStringUUID();
								entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Member1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7aYou joined " + (new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "Player");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()).getDisplayName().getString() + "'s group!")), false);
							if ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "Player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()) instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7a" + entity.getDisplayName().getString() + " has joined your group!")), false);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cThis group is full!"), false);
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cYou wasn't invited"), false);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cYou can't accept an invite from yourself"), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cYou are already in a group"), false);
		}
	}
}
