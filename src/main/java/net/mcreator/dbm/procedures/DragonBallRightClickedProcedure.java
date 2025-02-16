package net.mcreator.dbm.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModItems;
import net.mcreator.dbm.entity.NamekDragonBallE7Entity;
import net.mcreator.dbm.entity.NamekDragonBallE6Entity;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.entity.NamekDragonBallE4Entity;
import net.mcreator.dbm.entity.NamekDragonBallE3Entity;
import net.mcreator.dbm.entity.NamekDragonBallE2Entity;
import net.mcreator.dbm.entity.NamekDragonBallE1Entity;
import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.entity.DragonBallE5Entity;
import net.mcreator.dbm.entity.DragonBallE4Entity;
import net.mcreator.dbm.entity.DragonBallE3Entity;
import net.mcreator.dbm.entity.DragonBallE2Entity;
import net.mcreator.dbm.entity.DragonBallE1Entity;

public class DragonBallRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (DbmModVariables.MapVariables.get(world).ShenronCalled == false) {
			if (entity instanceof DragonBallE1Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_1.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE2Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_2.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE3Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_3.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE4Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_4.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE5Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_5.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE6Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_6.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof DragonBallE7Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.DRAGON_BALL_7.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (DbmModVariables.MapVariables.get(world).PorungaCalled == false) {
			if (entity instanceof NamekDragonBallE1Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_1.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE2Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_2.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE3Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_3.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE4Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_4.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE5Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_5.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE6Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_6.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof NamekDragonBallE7Entity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DbmModItems.NAMEK_DRAGON_BALL_7.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
