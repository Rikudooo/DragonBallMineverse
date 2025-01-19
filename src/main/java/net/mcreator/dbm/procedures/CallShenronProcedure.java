package net.mcreator.dbm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.network.DbmModVariables;
import net.mcreator.dbm.entity.NamekDragonBallE7Entity;
import net.mcreator.dbm.entity.NamekDragonBallE6Entity;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.entity.NamekDragonBallE4Entity;
import net.mcreator.dbm.entity.NamekDragonBallE3Entity;
import net.mcreator.dbm.entity.NamekDragonBallE2Entity;
import net.mcreator.dbm.entity.NamekDragonBallE1Entity;
import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.entity.DragonBallE5Entity;
import net.mcreator.dbm.entity.DragonBallE4Entity;
import net.mcreator.dbm.entity.DragonBallE3Entity;
import net.mcreator.dbm.entity.DragonBallE2Entity;
import net.mcreator.dbm.entity.DragonBallE1Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CallShenronProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, String text) {
		execute(null, world, x, y, z, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, String text) {
		if (text == null)
			return;
		if (((text).toLowerCase().contains("shenron") || (text).toLowerCase().contains("shenron,") || (text).toLowerCase().contains("shenron!"))
				&& ((text).toLowerCase().contains("call") || (text).toLowerCase().contains("spawn") || (text).toLowerCase().contains("appear") || (text).toLowerCase().contains("come") || (text).toLowerCase().contains("bring"))) {
			if (DbmModVariables.MapVariables.get(world).DragonBallsUsable == true) {
				if (DbmModVariables.MapVariables.get(world).ShenronCalled == false) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (!world.getEntitiesOfClass(DragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
								&& !world.getEntitiesOfClass(DragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:shenroncalled")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:shenroncalled")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							DbmModVariables.MapVariables.get(world).ShenronSpawnTimer = 0;
							DbmModVariables.MapVariables.get(world).syncData(world);
							DbmModVariables.MapVariables.get(world).ShenronCalled = true;
							DbmModVariables.MapVariables.get(world).syncData(world);
						}
					}
				}
			}
		}
		if ((text).toLowerCase().contains("porunga")
				&& ((text).toLowerCase().contains("call") || (text).toLowerCase().contains("spawn") || (text).toLowerCase().contains("appear") || (text).toLowerCase().contains("come") || (text).toLowerCase().contains("bring"))) {
			if (DbmModVariables.MapVariables.get(world).NamekDragonBallsUsable == true) {
				if (DbmModVariables.MapVariables.get(world).PorungaCalled == false) {
					if (!world.getEntitiesOfClass(NamekDragonBallE1Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE2Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE3Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE4Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE5Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE6Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
							&& !world.getEntitiesOfClass(NamekDragonBallE7Entity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:shenroncalled")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dbm:shenroncalled")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						DbmModVariables.MapVariables.get(world).PorungaSpawnTimer = 0;
						DbmModVariables.MapVariables.get(world).syncData(world);
						DbmModVariables.MapVariables.get(world).PorungaCalled = true;
						DbmModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}
