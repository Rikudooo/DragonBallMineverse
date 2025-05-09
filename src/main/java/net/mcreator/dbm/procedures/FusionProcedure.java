package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkDirection;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.DbmMod;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class FusionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity == entity)) {
			if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fusion == true
					&& (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fusion == true) {
				if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused).equals("None")
						&& ((sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused).equals("None")) {
					if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasePower == true
							&& (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).ReleasePower == false) {
						if (Math.abs((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age
								- (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Age) <= 3) {
							if (0.35 <= (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
									/ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
											+ (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel)
									&& (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
											/ ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel
													+ (sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PowerLevel) <= 0.65) {
								{
									boolean _setval = true;
									entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Fusing = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = true;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Fusing = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									boolean _setval = false;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Fusion = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									boolean _setval = false;
									entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Fusion = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = false;
									entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ReleasePower = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									Entity _ent = entity;
									_ent.teleportTo((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								{
									Entity _ent = entity;
									_ent.setYRot(sourceentity.getYRot());
									_ent.setXRot(sourceentity.getXRot());
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
								{
									String _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin3ID;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedSkin3 = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									String _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Skin4ID;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedSkin4 = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									String _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyleID;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedHairStyleID = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									String _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesTypeID;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedEyesTypeID = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									String _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesColorID;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedEyesColorID = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								{
									double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).HairStyle;
									sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FusedHairstyle = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								DbmMod.queueServerWork(20, () -> {
									if (world.isClientSide()) {
										if (entity instanceof AbstractClientPlayer player) {
											var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
											if (animation != null) {
												animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "fusiondanceleft"))));
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
														DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("fusiondanceleft"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
												}
											}
										}
									}
									if (world.isClientSide()) {
										if (sourceentity instanceof AbstractClientPlayer player) {
											var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("dbm", "player_animation"));
											if (animation != null) {
												animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("dbm", "fusiondanceright"))));
											}
										}
									}
									if (!world.isClientSide()) {
										if (sourceentity instanceof Player && world instanceof ServerLevel srvLvl_) {
											List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
											synchronized (connections) {
												Iterator<Connection> iterator = connections.iterator();
												while (iterator.hasNext()) {
													Connection connection = iterator.next();
													if (!connection.isConnecting() && connection.isConnected())
														DbmMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.DbmModAnimationMessage(Component.literal("fusiondanceright"), sourceentity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
												}
											}
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:fusion")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:fusion")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
								});
								DbmMod.queueServerWork(90, () -> {
									{
										boolean _setval = false;
										entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Fusing = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									{
										boolean _setval = false;
										sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Fusing = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									if (entity instanceof ServerPlayer _player)
										_player.setGameMode(GameType.SPECTATOR);
									{
										String _setval = sourceentity.getStringUUID();
										entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Fused = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									{
										String _setval = entity.getStringUUID();
										sourceentity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Fused = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
								});
								DbmMod.queueServerWork(120, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("spectate " + sourceentity.getDisplayName().getString() + " " + entity.getDisplayName().getString()));
								});
							}
						}
					}
				}
			}
		}
	}
}
