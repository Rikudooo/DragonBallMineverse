package net.mcreator.dbm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;

public class SetKameHouseCoordsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DbmModVariables.MapVariables.get(world).KameHouseCoords = "Kame House: " + "x: " + new java.text.DecimalFormat("##").format(x) + " - " + "z: " + new java.text.DecimalFormat("##").format(z);
		DbmModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("dbm:kame_house")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
					BlockPos.containing(x, y, z));
	}
}
