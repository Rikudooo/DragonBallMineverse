
package net.mcreator.dbm.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.dbm.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.dbm.procedures.BabidiAdditionGenerationConditionProcedure;

public class BabidiShipFeature extends StructureFeature {
	public BabidiShipFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BabidiAdditionGenerationConditionProcedure.execute(world, x, z))
			return false;
		return super.place(context);
	}
}
