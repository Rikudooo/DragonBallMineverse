package net.mcreator.dbm.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.dbm.world.inventory.ShenronGUIMenu;
import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.entity.ShenronEntity;

import java.util.HashMap;
import java.util.Comparator;
import java.util.ArrayList;

import io.netty.buffer.Unpooled;

public class ChangeAgeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (DbmModVariables.MapVariables.get(world).ShenronDemands > 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("dbmadmin stats age " + (guistate.containsKey("text:playername") ? ((EditBox) guistate.get("text:playername")).getValue() : "") + " set " + new java.text.DecimalFormat("##").format(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:enterage") ? ((EditBox) guistate.get("text:enterage")).getValue() : ""))));
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("ShenronGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new ShenronGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		if (DbmModVariables.MapVariables.get(world).ShenronDemands == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("dbmadmin stats age " + (guistate.containsKey("text:playername") ? ((EditBox) guistate.get("text:playername")).getValue() : "") + " set " + new java.text.DecimalFormat("##").format(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:enterage") ? ((EditBox) guistate.get("text:enterage")).getValue() : ""))));
			DbmModVariables.MapVariables.get(world).ShenronDemands = 0;
			DbmModVariables.MapVariables.get(world).syncData(world);
			if (!((Entity) world.getEntitiesOfClass(ShenronEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
				((Entity) world.getEntitiesOfClass(ShenronEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			ShenronEntityDiesProcedure.execute(world);
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		} else if (DbmModVariables.MapVariables.get(world).ShenronDemands > 1) {
			DbmModVariables.MapVariables.get(world).ShenronDemands = DbmModVariables.MapVariables.get(world).ShenronDemands - 1;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
