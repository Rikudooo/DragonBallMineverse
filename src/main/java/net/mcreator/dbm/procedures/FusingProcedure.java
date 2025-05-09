package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

import com.mojang.util.UUIDTypeAdapter;

@Mod.EventBusSubscriber
public class FusingProcedure {
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
		boolean xxyyzz = false;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		double yaw = 0;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fusing == true) {
			if (xxyyzz == false) {
				xx = x;
				yy = y;
				zz = z;
				yaw = entity.getYRot();
				xxyyzz = true;
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(xx, yy, zz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(xx, yy, zz, _ent.getYRot(), _ent.getXRot());
			}
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			{
				Entity _ent = entity;
				_ent.setYRot((float) yaw);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		if (!((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused).equals("None")) {
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
				if (!(entity instanceof ServerPlayer _servplayer ? _servplayer.getCamera() == new Object() {
					Entity getEntity(String uuid) {
						Entity _uuidentity = null;
						if (world instanceof ServerLevel _server) {
							try {
								_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
							} catch (IllegalArgumentException e) {
							}
						}
						return _uuidentity;
					}
				}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)) : false)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("spectate " + (new Object() {
									Entity getEntity(String uuid) {
										Entity _uuidentity = null;
										if (world instanceof ServerLevel _server) {
											try {
												_uuidentity = _server.getEntity(UUIDTypeAdapter.fromString(uuid));
											} catch (IllegalArgumentException e) {
											}
										}
										return _uuidentity;
									}
								}.getEntity(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused)).getDisplayName().getString()) + " " + entity.getDisplayName().getString()));
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerFused = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).PlayerFused == true) {
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Fused).equals("None")) {
				{
					boolean _setval = false;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerFused = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
