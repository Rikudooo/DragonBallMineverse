package net.mcreator.dbm.procedures;

import net.minecraftforge.common.world.ForgeChunkManager;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.entity.DragonBallE3Entity;

public class ChunkLoadedDragonBallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			if (!(world instanceof ServerLevel _level4 && _level4.isLoaded(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())))) {
				if (world instanceof ServerLevel _world)
					ForgeChunkManager.forceChunk(_world, "dbm",
							new BlockPos((int) world.getChunk(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ()))).getPos().x, 0,
									(int) world.getChunk(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ()))).getPos().z),
							world.getChunk(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ()))).getPos().x, world.getChunk(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ()))).getPos().z,
							true, true);
			}
		}
	}
}
