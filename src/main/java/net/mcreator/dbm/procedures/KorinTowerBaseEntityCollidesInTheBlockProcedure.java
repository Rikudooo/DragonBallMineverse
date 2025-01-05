package net.mcreator.dbm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

public class KorinTowerBaseEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ClimbingTower = 0;
		if ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).SpacePressed == true) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.1, (entity.getDeltaMovement().z())));
			ClimbingTower = ClimbingTower + 1;
		}
		if (ClimbingTower >= 1000) {
			ClimbingTower = 0;
			{
				double _setval = (entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).TrainingPoints + 5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrainingPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
