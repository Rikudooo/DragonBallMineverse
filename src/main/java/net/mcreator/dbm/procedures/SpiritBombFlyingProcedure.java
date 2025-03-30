package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.init.DbmModGameRules;

public class SpiritBombFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		immediatesourceentity.getPersistentData().putDouble("timeAlive", (immediatesourceentity.getPersistentData().getDouble("timeAlive") + 1));
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
			immediatesourceentity.getPersistentData().putDouble("xv", (immediatesourceentity.getDeltaMovement().x()));
			immediatesourceentity.getPersistentData().putDouble("yv", (immediatesourceentity.getDeltaMovement().y()));
			immediatesourceentity.getPersistentData().putDouble("zv", (immediatesourceentity.getDeltaMovement().z()));
			if (immediatesourceentity.getPersistentData().getBoolean("SizeSet") == false) {
				immediatesourceentity.getPersistentData().putDouble("KiAttackSize", (19.7 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
				immediatesourceentity.getPersistentData().putDouble("KiAttackSize2", (20 * ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).KiAttackCharge / 1200)));
				immediatesourceentity.getPersistentData().putBoolean("SizeSet", true);
			}
		}
		immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getPersistentData().getDouble("xv")), (immediatesourceentity.getPersistentData().getDouble("yv")), (immediatesourceentity.getPersistentData().getDouble("zv"))));
		if (immediatesourceentity.getPersistentData().getDouble("timeAlive") >= 600) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		if (world.getLevelData().getGameRules().getBoolean(DbmModGameRules.KIKOHA_EXPLODE) == true) {
			int horizontalRadiusSphere = (int) 15 - 1;
			int verticalRadiusSphere = (int) 15 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("dbm:collateraldamage")))) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							} else if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, x + xi, y + i, z + zi, 2, Level.ExplosionInteraction.BLOCK);
							}
						}
					}
				}
			}
		}
	}
}
