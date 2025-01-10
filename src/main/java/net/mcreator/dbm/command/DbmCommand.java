
package net.mcreator.dbm.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.dbm.procedures.ChangeAgeCommandProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class DbmCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("dbm")

				.then(Commands.argument("reason", StringArgumentType.word()).then(Commands.argument("id", StringArgumentType.word())
						.then(Commands.argument("agechange", StringArgumentType.word()).then(Commands.argument("playername", EntityArgument.player()).then(Commands.argument("age", DoubleArgumentType.doubleArg(10, 30)).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							ChangeAgeCommandProcedure.execute(arguments);
							return 0;
						})))))));
	}
}
