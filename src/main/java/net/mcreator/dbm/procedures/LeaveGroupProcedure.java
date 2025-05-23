package net.mcreator.dbm.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.GroupGUIMenu;
import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.DbmMod;

import io.netty.buffer.Unpooled;

public class LeaveGroupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Group == true) {
			{
				boolean _setval = false;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Group = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			DbmMod.queueServerWork(1, () -> {
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Member1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Member2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Member3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Member4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Member5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MemberName1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MemberName2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MemberName3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MemberName4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MemberName5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GroupGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GroupGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
