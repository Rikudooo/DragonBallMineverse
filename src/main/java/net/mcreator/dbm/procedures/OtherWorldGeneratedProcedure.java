package net.mcreator.dbm.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;

public class OtherWorldGeneratedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dbm:other_world"))) {
			if (DbmModVariables.MapVariables.get(world).OtherWorldGenerated == false) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "enma_station"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(0, 225, 0), new BlockPos(0, 225, 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "snake_way1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(209, 225, -2), new BlockPos(209, 225, -2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "snake_way2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(709, 225, 75), new BlockPos(709, 225, 75), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "snake_way3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(1209, 225, 152), new BlockPos(1209, 225, 152), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "snake_way4"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(1709, 225, 154), new BlockPos(1709, 225, 154), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dbm", "north_kaio_planet"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(1920, 270, 190), new BlockPos(1920, 270, 190), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				DbmModVariables.MapVariables.get(world).OtherWorldGenerated = true;
				DbmModVariables.MapVariables.get(world).syncData(world);
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(4, 237, 104);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(4, 237, 104, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
