package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.network.DbmModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SuperSaiyanProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).FormLike).equals("Super Saiyan")) {
			if (!(((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Legendary Super Saiyan")
					|| ((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("C-Legendary Super Saiyan"))) {
				{
					String _setval = "dbm:textures/entities/eyes_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType)
							+ "_ssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EyesColorID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/ssjhair.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/aura_ssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AuraTexture = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/ssjhairbig.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairStyleID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Legendary Super Saiyan")) {
				{
					String _setval = "dbm:textures/entities/eyes_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType)
							+ "_lssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EyesColorID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/lssjhair.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/aura_lssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AuraTexture = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/lssjhairbig.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairStyleID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("C-Legendary Super Saiyan")) {
				{
					String _setval = "dbm:textures/entities/eyes_" + new java.text.DecimalFormat("##").format((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).EyesType)
							+ "_ssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EyesColorID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/lssjhair.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/aura_lssj.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AuraTexture = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "dbm:textures/entities/lssjhairbig.png";
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HairStyleID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan")) {
			{
				String _setval = "Super Saiyan";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.015;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan Grade 2")) {
			{
				String _setval = "Super Saiyan";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5.15;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3.2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.05;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Super Saiyan Grade 3")) {
			{
				String _setval = "Super Saiyan";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5.3;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormBoost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 6;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.15;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("C-Legendary Super Saiyan")) {
			{
				String _setval = "Super Saiyan";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1.45;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getDisplayName().getString()).equals("CaiGuyCrafter")) {
				{
					double _setval = 13;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FormBoost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (!(entity.getDisplayName().getString()).equals("CaiGuyCrafter")) {
				{
					double _setval = 8.2;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FormBoost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbmModVariables.PlayerVariables())).Form).equals("Legendary Super Saiyan")) {
			{
				String _setval = "Super Saiyan";
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FormLike = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 6;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiDrain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Scale = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getDisplayName().getString()).equals("CaiGuyCrafter")) {
				{
					double _setval = 13.5;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FormBoost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (!(entity.getDisplayName().getString()).equals("CaiGuyCrafter")) {
				{
					double _setval = 8.5;
					entity.getCapability(DbmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FormBoost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
