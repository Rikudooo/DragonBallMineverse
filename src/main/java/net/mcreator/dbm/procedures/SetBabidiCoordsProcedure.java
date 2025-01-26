package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dbm.network.DbmModVariables;

public class SetBabidiCoordsProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		DbmModVariables.MapVariables.get(world).BabidiShipCoords = "Babidi's Ship: " + "x: " + new java.text.DecimalFormat("##").format(x) + " - " + "z: " + new java.text.DecimalFormat("##").format(z);
		DbmModVariables.MapVariables.get(world).syncData(world);
	}
}
