package net.mcreator.dbm.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModBlocks;

public class KameHouseAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (DbmModVariables.MapVariables.get(world).KameHouseSpawned == false) {
			DbmModVariables.MapVariables.get(world).KameHouseSpawned = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == DbmModBlocks.KAME_HOUSE_SPAWN.get()) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "kame_house"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			SetKameHouseCoordsProcedure.execute(world, x, z);
			return true;
		}
		return false;
	}
}
