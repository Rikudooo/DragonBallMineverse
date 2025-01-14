
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dbm.entity.StoryTienshinhanEntity;
import net.mcreator.dbm.entity.StoryRaditzEntity;
import net.mcreator.dbm.entity.StoryPiccoloGiantEntity;
import net.mcreator.dbm.entity.StoryPiccoloEntity;
import net.mcreator.dbm.entity.SpiritBombEntity;
import net.mcreator.dbm.entity.ShenronEntity;
import net.mcreator.dbm.entity.SabertoothEntity;
import net.mcreator.dbm.entity.PunchingBagEntity;
import net.mcreator.dbm.entity.PowerPoleEntityEntity;
import net.mcreator.dbm.entity.PopoEntity;
import net.mcreator.dbm.entity.NorthKaioEntity;
import net.mcreator.dbm.entity.MasterPiccoloEntity;
import net.mcreator.dbm.entity.MasterKorinEntity;
import net.mcreator.dbm.entity.KingEnmaEntity;
import net.mcreator.dbm.entity.KiBlastEntity;
import net.mcreator.dbm.entity.KameTurtleEntity;
import net.mcreator.dbm.entity.KameSenninEntity;
import net.mcreator.dbm.entity.KameHouseSpawnerEntity;
import net.mcreator.dbm.entity.GregoryEntity;
import net.mcreator.dbm.entity.GiantKiBlastEntity;
import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.entity.DragonBallE5Entity;
import net.mcreator.dbm.entity.DragonBallE4Entity;
import net.mcreator.dbm.entity.DragonBallE3Entity;
import net.mcreator.dbm.entity.DragonBallE2Entity;
import net.mcreator.dbm.entity.DragonBallE1Entity;
import net.mcreator.dbm.entity.Dinosaur1Entity;
import net.mcreator.dbm.entity.DendeEntity;
import net.mcreator.dbm.entity.BubblesEntity;
import net.mcreator.dbm.entity.BearThiefEntity;
import net.mcreator.dbm.entity.AdminPunchingBagEntity;
import net.mcreator.dbm.DbmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbmModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DbmMod.MODID);
	public static final RegistryObject<EntityType<KiBlastEntity>> KI_BLAST = register("ki_blast",
			EntityType.Builder.<KiBlastEntity>of(KiBlastEntity::new, MobCategory.MISC).setCustomClientFactory(KiBlastEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KingEnmaEntity>> KING_ENMA = register("king_enma",
			EntityType.Builder.<KingEnmaEntity>of(KingEnmaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingEnmaEntity::new).fireImmune().sized(2.75f, 2.25f));
	public static final RegistryObject<EntityType<PowerPoleEntityEntity>> POWER_POLE_ENTITY = register("power_pole_entity", EntityType.Builder.<PowerPoleEntityEntity>of(PowerPoleEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(5000).setUpdateInterval(3).setCustomClientFactory(PowerPoleEntityEntity::new).fireImmune().sized(0.08f, 200.7f));
	public static final RegistryObject<EntityType<NorthKaioEntity>> NORTH_KAIO = register("north_kaio",
			EntityType.Builder.<NorthKaioEntity>of(NorthKaioEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NorthKaioEntity::new).fireImmune().sized(1f, 1.5f));
	public static final RegistryObject<EntityType<BubblesEntity>> BUBBLES = register("bubbles",
			EntityType.Builder.<BubblesEntity>of(BubblesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BubblesEntity::new).fireImmune().sized(1f, 1.5f));
	public static final RegistryObject<EntityType<GregoryEntity>> GREGORY = register("gregory",
			EntityType.Builder.<GregoryEntity>of(GregoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GregoryEntity::new).fireImmune().sized(0.4f, 0.9f));
	public static final RegistryObject<EntityType<SpiritBombEntity>> SPIRIT_BOMB = register("spirit_bomb",
			EntityType.Builder.<SpiritBombEntity>of(SpiritBombEntity::new, MobCategory.MISC).setCustomClientFactory(SpiritBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(10f, 10f));
	public static final RegistryObject<EntityType<PunchingBagEntity>> PUNCHING_BAG = register("punching_bag", EntityType.Builder.<PunchingBagEntity>of(PunchingBagEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(PunchingBagEntity::new).fireImmune().sized(1.1f, 1.9f));
	public static final RegistryObject<EntityType<AdminPunchingBagEntity>> ADMIN_PUNCHING_BAG = register("admin_punching_bag", EntityType.Builder.<AdminPunchingBagEntity>of(AdminPunchingBagEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(AdminPunchingBagEntity::new).fireImmune().sized(1.1f, 1.9f));
	public static final RegistryObject<EntityType<ShenronEntity>> SHENRON = register("shenron",
			EntityType.Builder.<ShenronEntity>of(ShenronEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShenronEntity::new).fireImmune().sized(0.6f, 10f));
	public static final RegistryObject<EntityType<MasterKorinEntity>> MASTER_KORIN = register("master_korin", EntityType.Builder.<MasterKorinEntity>of(MasterKorinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MasterKorinEntity::new).fireImmune().sized(0.5f, 1.2f));
	public static final RegistryObject<EntityType<MasterPiccoloEntity>> MASTER_PICCOLO = register("master_piccolo", EntityType.Builder.<MasterPiccoloEntity>of(MasterPiccoloEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MasterPiccoloEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DendeEntity>> DENDE = register("dende",
			EntityType.Builder.<DendeEntity>of(DendeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DendeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PopoEntity>> POPO = register("popo",
			EntityType.Builder.<PopoEntity>of(PopoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PopoEntity::new).fireImmune().sized(1f, 1.7f));
	public static final RegistryObject<EntityType<SabertoothEntity>> SABERTOOTH = register("sabertooth",
			EntityType.Builder.<SabertoothEntity>of(SabertoothEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SabertoothEntity::new)

					.sized(1.6f, 1.3f));
	public static final RegistryObject<EntityType<BearThiefEntity>> BEAR_THIEF = register("bear_thief",
			EntityType.Builder.<BearThiefEntity>of(BearThiefEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BearThiefEntity::new)

					.sized(1.2f, 2f));
	public static final RegistryObject<EntityType<Dinosaur1Entity>> DINOSAUR_1 = register("dinosaur_1",
			EntityType.Builder.<Dinosaur1Entity>of(Dinosaur1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Dinosaur1Entity::new)

					.sized(1.6f, 1.5f));
	public static final RegistryObject<EntityType<KameSenninEntity>> KAME_SENNIN = register("kame_sennin", EntityType.Builder.<KameSenninEntity>of(KameSenninEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(KameSenninEntity::new).fireImmune().sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<KameTurtleEntity>> KAME_TURTLE = register("kame_turtle", EntityType.Builder.<KameTurtleEntity>of(KameTurtleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(KameTurtleEntity::new).fireImmune().sized(0.9f, 0.6f));
	public static final RegistryObject<EntityType<DragonBallE1Entity>> DRAGON_BALL_E_1 = register("dragon_ball_e_1", EntityType.Builder.<DragonBallE1Entity>of(DragonBallE1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE1Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE2Entity>> DRAGON_BALL_E_2 = register("dragon_ball_e_2", EntityType.Builder.<DragonBallE2Entity>of(DragonBallE2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE2Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE3Entity>> DRAGON_BALL_E_3 = register("dragon_ball_e_3", EntityType.Builder.<DragonBallE3Entity>of(DragonBallE3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE3Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE4Entity>> DRAGON_BALL_E_4 = register("dragon_ball_e_4", EntityType.Builder.<DragonBallE4Entity>of(DragonBallE4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE4Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE5Entity>> DRAGON_BALL_E_5 = register("dragon_ball_e_5", EntityType.Builder.<DragonBallE5Entity>of(DragonBallE5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE5Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE6Entity>> DRAGON_BALL_E_6 = register("dragon_ball_e_6", EntityType.Builder.<DragonBallE6Entity>of(DragonBallE6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE6Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<DragonBallE7Entity>> DRAGON_BALL_E_7 = register("dragon_ball_e_7", EntityType.Builder.<DragonBallE7Entity>of(DragonBallE7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonBallE7Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<GiantKiBlastEntity>> GIANT_KI_BLAST = register("giant_ki_blast",
			EntityType.Builder.<GiantKiBlastEntity>of(GiantKiBlastEntity::new, MobCategory.MISC).setCustomClientFactory(GiantKiBlastEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(2f, 2f));
	public static final RegistryObject<EntityType<StoryTienshinhanEntity>> STORY_TIENSHINHAN = register("story_tienshinhan", EntityType.Builder.<StoryTienshinhanEntity>of(StoryTienshinhanEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryTienshinhanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryPiccoloEntity>> STORY_PICCOLO = register("story_piccolo", EntityType.Builder.<StoryPiccoloEntity>of(StoryPiccoloEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryPiccoloEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryPiccoloGiantEntity>> STORY_PICCOLO_GIANT = register("story_piccolo_giant", EntityType.Builder.<StoryPiccoloGiantEntity>of(StoryPiccoloGiantEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryPiccoloGiantEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KameHouseSpawnerEntity>> KAME_HOUSE_SPAWNER = register("kame_house_spawner", EntityType.Builder.<KameHouseSpawnerEntity>of(KameHouseSpawnerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(KameHouseSpawnerEntity::new).fireImmune().sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<StoryRaditzEntity>> STORY_RADITZ = register("story_raditz", EntityType.Builder.<StoryRaditzEntity>of(StoryRaditzEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryRaditzEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KingEnmaEntity.init();
			PowerPoleEntityEntity.init();
			NorthKaioEntity.init();
			BubblesEntity.init();
			GregoryEntity.init();
			PunchingBagEntity.init();
			AdminPunchingBagEntity.init();
			ShenronEntity.init();
			MasterKorinEntity.init();
			MasterPiccoloEntity.init();
			DendeEntity.init();
			PopoEntity.init();
			SabertoothEntity.init();
			BearThiefEntity.init();
			Dinosaur1Entity.init();
			KameSenninEntity.init();
			KameTurtleEntity.init();
			DragonBallE1Entity.init();
			DragonBallE2Entity.init();
			DragonBallE3Entity.init();
			DragonBallE4Entity.init();
			DragonBallE5Entity.init();
			DragonBallE6Entity.init();
			DragonBallE7Entity.init();
			StoryTienshinhanEntity.init();
			StoryPiccoloEntity.init();
			StoryPiccoloGiantEntity.init();
			KameHouseSpawnerEntity.init();
			StoryRaditzEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KING_ENMA.get(), KingEnmaEntity.createAttributes().build());
		event.put(POWER_POLE_ENTITY.get(), PowerPoleEntityEntity.createAttributes().build());
		event.put(NORTH_KAIO.get(), NorthKaioEntity.createAttributes().build());
		event.put(BUBBLES.get(), BubblesEntity.createAttributes().build());
		event.put(GREGORY.get(), GregoryEntity.createAttributes().build());
		event.put(PUNCHING_BAG.get(), PunchingBagEntity.createAttributes().build());
		event.put(ADMIN_PUNCHING_BAG.get(), AdminPunchingBagEntity.createAttributes().build());
		event.put(SHENRON.get(), ShenronEntity.createAttributes().build());
		event.put(MASTER_KORIN.get(), MasterKorinEntity.createAttributes().build());
		event.put(MASTER_PICCOLO.get(), MasterPiccoloEntity.createAttributes().build());
		event.put(DENDE.get(), DendeEntity.createAttributes().build());
		event.put(POPO.get(), PopoEntity.createAttributes().build());
		event.put(SABERTOOTH.get(), SabertoothEntity.createAttributes().build());
		event.put(BEAR_THIEF.get(), BearThiefEntity.createAttributes().build());
		event.put(DINOSAUR_1.get(), Dinosaur1Entity.createAttributes().build());
		event.put(KAME_SENNIN.get(), KameSenninEntity.createAttributes().build());
		event.put(KAME_TURTLE.get(), KameTurtleEntity.createAttributes().build());
		event.put(DRAGON_BALL_E_1.get(), DragonBallE1Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_2.get(), DragonBallE2Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_3.get(), DragonBallE3Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_4.get(), DragonBallE4Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_5.get(), DragonBallE5Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_6.get(), DragonBallE6Entity.createAttributes().build());
		event.put(DRAGON_BALL_E_7.get(), DragonBallE7Entity.createAttributes().build());
		event.put(STORY_TIENSHINHAN.get(), StoryTienshinhanEntity.createAttributes().build());
		event.put(STORY_PICCOLO.get(), StoryPiccoloEntity.createAttributes().build());
		event.put(STORY_PICCOLO_GIANT.get(), StoryPiccoloGiantEntity.createAttributes().build());
		event.put(KAME_HOUSE_SPAWNER.get(), KameHouseSpawnerEntity.createAttributes().build());
		event.put(STORY_RADITZ.get(), StoryRaditzEntity.createAttributes().build());
	}
}
