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

public class HyperbolicTimeChamberPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world) {
		if (DbmModVariables.MapVariables.get(world).HTCSpawned == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "timechamber"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(0, 260, 0), new BlockPos(0, 260, 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			DbmModVariables.MapVariables.get(world).HTCSpawned = true;
			DbmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
