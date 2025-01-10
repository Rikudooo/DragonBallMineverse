package net.mcreator.dbm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.dbm.network.DbmModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ChangeAgeCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if ((StringArgumentType.getString(arguments, "reason")).equals("shenron")) {
			if ((StringArgumentType.getString(arguments, "id")).equals("001001200501")) {
				if ((StringArgumentType.getString(arguments, "agechange")).equals("changing_age")) {
					{
						double _setval = DoubleArgumentType.getDouble(arguments, "age");
						(new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "playername");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Age = _setval;
							capability.syncPlayerVariables((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "playername");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()));
						});
					}
				}
			}
		}
	}
}
