package net.mcreator.dbm.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class DbmconfigsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> ATTRIBUTE_LIMIT;
	static {
		BUILDER.push("Attributes");
		ATTRIBUTE_LIMIT = BUILDER.comment("").define("Attribute Limit", (double) 100000);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
