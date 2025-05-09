
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

import net.mcreator.dbm.entity.YardrattanMasterEntity;
import net.mcreator.dbm.entity.YardrattanEntity;
import net.mcreator.dbm.entity.WhisEntity;
import net.mcreator.dbm.entity.SupernovaEntity;
import net.mcreator.dbm.entity.StoryZarbonEntity;
import net.mcreator.dbm.entity.StoryYakonEntity;
import net.mcreator.dbm.entity.StoryVegetaEntity;
import net.mcreator.dbm.entity.StoryTienshinhanEntity;
import net.mcreator.dbm.entity.StoryTagomaEntity;
import net.mcreator.dbm.entity.StorySuperBuuEntity;
import net.mcreator.dbm.entity.StorySpopovichEntity;
import net.mcreator.dbm.entity.StoryShisamiEntity;
import net.mcreator.dbm.entity.StoryRecoomeEntity;
import net.mcreator.dbm.entity.StoryRaditzEntity;
import net.mcreator.dbm.entity.StoryPuipuiEntity;
import net.mcreator.dbm.entity.StoryPiccoloGiantEntity;
import net.mcreator.dbm.entity.StoryPiccoloEntity;
import net.mcreator.dbm.entity.StoryNappaEntity;
import net.mcreator.dbm.entity.StoryMysteriousYoungManEntity;
import net.mcreator.dbm.entity.StoryMechaFriezaEntity;
import net.mcreator.dbm.entity.StoryMajinBuuEntity;
import net.mcreator.dbm.entity.StoryKingColdEntity;
import net.mcreator.dbm.entity.StoryKidBuuEntity;
import net.mcreator.dbm.entity.StoryKibitoEntity;
import net.mcreator.dbm.entity.StoryJeiceEntity;
import net.mcreator.dbm.entity.StoryGuldoEntity;
import net.mcreator.dbm.entity.StoryGoldenFriezaEntity;
import net.mcreator.dbm.entity.StoryGinyuEntity;
import net.mcreator.dbm.entity.StoryFusedBuuEntity;
import net.mcreator.dbm.entity.StoryFriezaSoldierEntity;
import net.mcreator.dbm.entity.StoryFriezaEntity;
import net.mcreator.dbm.entity.StoryDodoriaEntity;
import net.mcreator.dbm.entity.StoryDaburaEntity;
import net.mcreator.dbm.entity.StoryCuiEntity;
import net.mcreator.dbm.entity.StoryCellJrEntity;
import net.mcreator.dbm.entity.StoryCellEntity;
import net.mcreator.dbm.entity.StoryCell4Entity;
import net.mcreator.dbm.entity.StoryCell3Entity;
import net.mcreator.dbm.entity.StoryCell2Entity;
import net.mcreator.dbm.entity.StoryBurterEntity;
import net.mcreator.dbm.entity.StoryBeerusEntity;
import net.mcreator.dbm.entity.StoryBeerus2Entity;
import net.mcreator.dbm.entity.StoryAndroid20Entity;
import net.mcreator.dbm.entity.StoryAndroid19Entity;
import net.mcreator.dbm.entity.StoryAndroid18Entity;
import net.mcreator.dbm.entity.StoryAndroid17Entity;
import net.mcreator.dbm.entity.SpiritBombEntity;
import net.mcreator.dbm.entity.SphereOfDestructionEntity;
import net.mcreator.dbm.entity.ShenronEntity;
import net.mcreator.dbm.entity.SaibamanEntity;
import net.mcreator.dbm.entity.SabertoothEntity;
import net.mcreator.dbm.entity.PunchingBagEntity;
import net.mcreator.dbm.entity.PowerPoleEntityEntity;
import net.mcreator.dbm.entity.PorungaEntity;
import net.mcreator.dbm.entity.PopoEntity;
import net.mcreator.dbm.entity.NorthKaioEntity;
import net.mcreator.dbm.entity.NamekianEntity;
import net.mcreator.dbm.entity.NamekEEntity;
import net.mcreator.dbm.entity.NamekDragonBallE7Entity;
import net.mcreator.dbm.entity.NamekDragonBallE6Entity;
import net.mcreator.dbm.entity.NamekDragonBallE5Entity;
import net.mcreator.dbm.entity.NamekDragonBallE4Entity;
import net.mcreator.dbm.entity.NamekDragonBallE3Entity;
import net.mcreator.dbm.entity.NamekDragonBallE2Entity;
import net.mcreator.dbm.entity.NamekDragonBallE1Entity;
import net.mcreator.dbm.entity.NamekChunkLoaderEntity;
import net.mcreator.dbm.entity.MasterPiccoloEntity;
import net.mcreator.dbm.entity.MasterKorinEntity;
import net.mcreator.dbm.entity.KingEnmaEntity;
import net.mcreator.dbm.entity.KiBlastEntity;
import net.mcreator.dbm.entity.KameTurtleEntity;
import net.mcreator.dbm.entity.KameSenninEntity;
import net.mcreator.dbm.entity.KameHouseSpawnerEntity;
import net.mcreator.dbm.entity.GregoryEntity;
import net.mcreator.dbm.entity.GiantKiBlastEntity;
import net.mcreator.dbm.entity.FusionLaunchEntity;
import net.mcreator.dbm.entity.EarthEEntity;
import net.mcreator.dbm.entity.DragonBallE7Entity;
import net.mcreator.dbm.entity.DragonBallE6Entity;
import net.mcreator.dbm.entity.DragonBallE5Entity;
import net.mcreator.dbm.entity.DragonBallE4Entity;
import net.mcreator.dbm.entity.DragonBallE3Entity;
import net.mcreator.dbm.entity.DragonBallE2Entity;
import net.mcreator.dbm.entity.DragonBallE1Entity;
import net.mcreator.dbm.entity.Dinosaur1Entity;
import net.mcreator.dbm.entity.DendeEntity;
import net.mcreator.dbm.entity.DeathBallEntity;
import net.mcreator.dbm.entity.BubblesEntity;
import net.mcreator.dbm.entity.BeerusBallEntity;
import net.mcreator.dbm.entity.BearThiefEntity;
import net.mcreator.dbm.entity.BabidiShipSpawnerEntity;
import net.mcreator.dbm.entity.BabidiEntity;
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
			EntityType.Builder.<SpiritBombEntity>of(SpiritBombEntity::new, MobCategory.MISC).setCustomClientFactory(SpiritBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(15f, 15f));
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
	public static final RegistryObject<EntityType<SaibamanEntity>> SAIBAMAN = register("saibaman",
			EntityType.Builder.<SaibamanEntity>of(SaibamanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SaibamanEntity::new).fireImmune().sized(0.6f, 1.1f));
	public static final RegistryObject<EntityType<StoryNappaEntity>> STORY_NAPPA = register("story_nappa", EntityType.Builder.<StoryNappaEntity>of(StoryNappaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryNappaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryVegetaEntity>> STORY_VEGETA = register("story_vegeta", EntityType.Builder.<StoryVegetaEntity>of(StoryVegetaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryVegetaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EarthEEntity>> EARTH_E = register("earth_e",
			EntityType.Builder.<EarthEEntity>of(EarthEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthEEntity::new).fireImmune().sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<NamekEEntity>> NAMEK_E = register("namek_e",
			EntityType.Builder.<NamekEEntity>of(NamekEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekEEntity::new).fireImmune().sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<StoryFriezaSoldierEntity>> STORY_FRIEZA_SOLDIER = register("story_frieza_soldier", EntityType.Builder.<StoryFriezaSoldierEntity>of(StoryFriezaSoldierEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryFriezaSoldierEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryCuiEntity>> STORY_CUI = register("story_cui",
			EntityType.Builder.<StoryCuiEntity>of(StoryCuiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryCuiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryDodoriaEntity>> STORY_DODORIA = register("story_dodoria", EntityType.Builder.<StoryDodoriaEntity>of(StoryDodoriaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryDodoriaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryZarbonEntity>> STORY_ZARBON = register("story_zarbon", EntityType.Builder.<StoryZarbonEntity>of(StoryZarbonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryZarbonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryGinyuEntity>> STORY_GINYU = register("story_ginyu", EntityType.Builder.<StoryGinyuEntity>of(StoryGinyuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryGinyuEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryGuldoEntity>> STORY_GULDO = register("story_guldo", EntityType.Builder.<StoryGuldoEntity>of(StoryGuldoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryGuldoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryRecoomeEntity>> STORY_RECOOME = register("story_recoome", EntityType.Builder.<StoryRecoomeEntity>of(StoryRecoomeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryRecoomeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryJeiceEntity>> STORY_JEICE = register("story_jeice", EntityType.Builder.<StoryJeiceEntity>of(StoryJeiceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryJeiceEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryBurterEntity>> STORY_BURTER = register("story_burter", EntityType.Builder.<StoryBurterEntity>of(StoryBurterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryBurterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryFriezaEntity>> STORY_FRIEZA = register("story_frieza", EntityType.Builder.<StoryFriezaEntity>of(StoryFriezaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryFriezaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SupernovaEntity>> SUPERNOVA = register("supernova",
			EntityType.Builder.<SupernovaEntity>of(SupernovaEntity::new, MobCategory.MISC).setCustomClientFactory(SupernovaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(10f, 10f));
	public static final RegistryObject<EntityType<DeathBallEntity>> DEATH_BALL = register("death_ball",
			EntityType.Builder.<DeathBallEntity>of(DeathBallEntity::new, MobCategory.MISC).setCustomClientFactory(DeathBallEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(2f, 2f));
	public static final RegistryObject<EntityType<NamekDragonBallE1Entity>> NAMEK_DRAGON_BALL_E_1 = register("namek_dragon_ball_e_1", EntityType.Builder.<NamekDragonBallE1Entity>of(NamekDragonBallE1Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE1Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE2Entity>> NAMEK_DRAGON_BALL_E_2 = register("namek_dragon_ball_e_2", EntityType.Builder.<NamekDragonBallE2Entity>of(NamekDragonBallE2Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE2Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE3Entity>> NAMEK_DRAGON_BALL_E_3 = register("namek_dragon_ball_e_3", EntityType.Builder.<NamekDragonBallE3Entity>of(NamekDragonBallE3Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE3Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE4Entity>> NAMEK_DRAGON_BALL_E_4 = register("namek_dragon_ball_e_4", EntityType.Builder.<NamekDragonBallE4Entity>of(NamekDragonBallE4Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE4Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE5Entity>> NAMEK_DRAGON_BALL_E_5 = register("namek_dragon_ball_e_5", EntityType.Builder.<NamekDragonBallE5Entity>of(NamekDragonBallE5Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE5Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE6Entity>> NAMEK_DRAGON_BALL_E_6 = register("namek_dragon_ball_e_6", EntityType.Builder.<NamekDragonBallE6Entity>of(NamekDragonBallE6Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE6Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<NamekDragonBallE7Entity>> NAMEK_DRAGON_BALL_E_7 = register("namek_dragon_ball_e_7", EntityType.Builder.<NamekDragonBallE7Entity>of(NamekDragonBallE7Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekDragonBallE7Entity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<PorungaEntity>> PORUNGA = register("porunga",
			EntityType.Builder.<PorungaEntity>of(PorungaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PorungaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NamekChunkLoaderEntity>> NAMEK_CHUNK_LOADER = register("namek_chunk_loader", EntityType.Builder.<NamekChunkLoaderEntity>of(NamekChunkLoaderEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekChunkLoaderEntity::new).fireImmune().sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<NamekianEntity>> NAMEKIAN = register("namekian",
			EntityType.Builder.<NamekianEntity>of(NamekianEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NamekianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryMechaFriezaEntity>> STORY_MECHA_FRIEZA = register("story_mecha_frieza", EntityType.Builder.<StoryMechaFriezaEntity>of(StoryMechaFriezaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryMechaFriezaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryKingColdEntity>> STORY_KING_COLD = register("story_king_cold", EntityType.Builder.<StoryKingColdEntity>of(StoryKingColdEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryKingColdEntity::new).fireImmune().sized(1.2f, 3f));
	public static final RegistryObject<EntityType<StoryMysteriousYoungManEntity>> STORY_MYSTERIOUS_YOUNG_MAN = register("story_mysterious_young_man",
			EntityType.Builder.<StoryMysteriousYoungManEntity>of(StoryMysteriousYoungManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(StoryMysteriousYoungManEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryAndroid19Entity>> STORY_ANDROID_19 = register("story_android_19", EntityType.Builder.<StoryAndroid19Entity>of(StoryAndroid19Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryAndroid19Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryAndroid20Entity>> STORY_ANDROID_20 = register("story_android_20", EntityType.Builder.<StoryAndroid20Entity>of(StoryAndroid20Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryAndroid20Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryAndroid18Entity>> STORY_ANDROID_18 = register("story_android_18", EntityType.Builder.<StoryAndroid18Entity>of(StoryAndroid18Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryAndroid18Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryAndroid17Entity>> STORY_ANDROID_17 = register("story_android_17", EntityType.Builder.<StoryAndroid17Entity>of(StoryAndroid17Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryAndroid17Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryCellEntity>> STORY_CELL = register("story_cell", EntityType.Builder.<StoryCellEntity>of(StoryCellEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryCellEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryCell2Entity>> STORY_CELL_2 = register("story_cell_2", EntityType.Builder.<StoryCell2Entity>of(StoryCell2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryCell2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryCell3Entity>> STORY_CELL_3 = register("story_cell_3", EntityType.Builder.<StoryCell3Entity>of(StoryCell3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryCell3Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryCellJrEntity>> STORY_CELL_JR = register("story_cell_jr", EntityType.Builder.<StoryCellJrEntity>of(StoryCellJrEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryCellJrEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<StoryCell4Entity>> STORY_CELL_4 = register("story_cell_4", EntityType.Builder.<StoryCell4Entity>of(StoryCell4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryCell4Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YardrattanEntity>> YARDRATTAN = register("yardrattan", EntityType.Builder.<YardrattanEntity>of(YardrattanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(YardrattanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabidiEntity>> BABIDI = register("babidi",
			EntityType.Builder.<BabidiEntity>of(BabidiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabidiEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<YardrattanMasterEntity>> YARDRATTAN_MASTER = register("yardrattan_master", EntityType.Builder.<YardrattanMasterEntity>of(YardrattanMasterEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YardrattanMasterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabidiShipSpawnerEntity>> BABIDI_SHIP_SPAWNER = register("babidi_ship_spawner", EntityType.Builder.<BabidiShipSpawnerEntity>of(BabidiShipSpawnerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(BabidiShipSpawnerEntity::new).fireImmune().sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<StoryKibitoEntity>> STORY_KIBITO = register("story_kibito", EntityType.Builder.<StoryKibitoEntity>of(StoryKibitoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryKibitoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StorySpopovichEntity>> STORY_SPOPOVICH = register("story_spopovich", EntityType.Builder.<StorySpopovichEntity>of(StorySpopovichEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StorySpopovichEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryPuipuiEntity>> STORY_PUIPUI = register("story_puipui", EntityType.Builder.<StoryPuipuiEntity>of(StoryPuipuiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryPuipuiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryDaburaEntity>> STORY_DABURA = register("story_dabura", EntityType.Builder.<StoryDaburaEntity>of(StoryDaburaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryDaburaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryYakonEntity>> STORY_YAKON = register("story_yakon", EntityType.Builder.<StoryYakonEntity>of(StoryYakonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(StoryYakonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryMajinBuuEntity>> STORY_MAJIN_BUU = register("story_majin_buu", EntityType.Builder.<StoryMajinBuuEntity>of(StoryMajinBuuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryMajinBuuEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StorySuperBuuEntity>> STORY_SUPER_BUU = register("story_super_buu", EntityType.Builder.<StorySuperBuuEntity>of(StorySuperBuuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StorySuperBuuEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryFusedBuuEntity>> STORY_FUSED_BUU = register("story_fused_buu", EntityType.Builder.<StoryFusedBuuEntity>of(StoryFusedBuuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryFusedBuuEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryKidBuuEntity>> STORY_KID_BUU = register("story_kid_buu", EntityType.Builder.<StoryKidBuuEntity>of(StoryKidBuuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryKidBuuEntity::new).fireImmune().sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<StoryBeerusEntity>> STORY_BEERUS = register("story_beerus", EntityType.Builder.<StoryBeerusEntity>of(StoryBeerusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryBeerusEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SphereOfDestructionEntity>> SPHERE_OF_DESTRUCTION = register("sphere_of_destruction", EntityType.Builder.<SphereOfDestructionEntity>of(SphereOfDestructionEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SphereOfDestructionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(2f, 2f));
	public static final RegistryObject<EntityType<BeerusBallEntity>> BEERUS_BALL = register("beerus_ball",
			EntityType.Builder.<BeerusBallEntity>of(BeerusBallEntity::new, MobCategory.MISC).setCustomClientFactory(BeerusBallEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(10f, 10f));
	public static final RegistryObject<EntityType<StoryBeerus2Entity>> STORY_BEERUS_2 = register("story_beerus_2", EntityType.Builder.<StoryBeerus2Entity>of(StoryBeerus2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryBeerus2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhisEntity>> WHIS = register("whis",
			EntityType.Builder.<WhisEntity>of(WhisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhisEntity::new).fireImmune().sized(0.6f, 4.1f));
	public static final RegistryObject<EntityType<StoryTagomaEntity>> STORY_TAGOMA = register("story_tagoma", EntityType.Builder.<StoryTagomaEntity>of(StoryTagomaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryTagomaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryShisamiEntity>> STORY_SHISAMI = register("story_shisami", EntityType.Builder.<StoryShisamiEntity>of(StoryShisamiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryShisamiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryGoldenFriezaEntity>> STORY_GOLDEN_FRIEZA = register("story_golden_frieza", EntityType.Builder.<StoryGoldenFriezaEntity>of(StoryGoldenFriezaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryGoldenFriezaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FusionLaunchEntity>> FUSION_LAUNCH = register("fusion_launch",
			EntityType.Builder.<FusionLaunchEntity>of(FusionLaunchEntity::new, MobCategory.MISC).setCustomClientFactory(FusionLaunchEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

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
			SaibamanEntity.init();
			StoryNappaEntity.init();
			StoryVegetaEntity.init();
			EarthEEntity.init();
			NamekEEntity.init();
			StoryFriezaSoldierEntity.init();
			StoryCuiEntity.init();
			StoryDodoriaEntity.init();
			StoryZarbonEntity.init();
			StoryGinyuEntity.init();
			StoryGuldoEntity.init();
			StoryRecoomeEntity.init();
			StoryJeiceEntity.init();
			StoryBurterEntity.init();
			StoryFriezaEntity.init();
			NamekDragonBallE1Entity.init();
			NamekDragonBallE2Entity.init();
			NamekDragonBallE3Entity.init();
			NamekDragonBallE4Entity.init();
			NamekDragonBallE5Entity.init();
			NamekDragonBallE6Entity.init();
			NamekDragonBallE7Entity.init();
			PorungaEntity.init();
			NamekChunkLoaderEntity.init();
			NamekianEntity.init();
			StoryMechaFriezaEntity.init();
			StoryKingColdEntity.init();
			StoryMysteriousYoungManEntity.init();
			StoryAndroid19Entity.init();
			StoryAndroid20Entity.init();
			StoryAndroid18Entity.init();
			StoryAndroid17Entity.init();
			StoryCellEntity.init();
			StoryCell2Entity.init();
			StoryCell3Entity.init();
			StoryCellJrEntity.init();
			StoryCell4Entity.init();
			YardrattanEntity.init();
			BabidiEntity.init();
			YardrattanMasterEntity.init();
			BabidiShipSpawnerEntity.init();
			StoryKibitoEntity.init();
			StorySpopovichEntity.init();
			StoryPuipuiEntity.init();
			StoryDaburaEntity.init();
			StoryYakonEntity.init();
			StoryMajinBuuEntity.init();
			StorySuperBuuEntity.init();
			StoryFusedBuuEntity.init();
			StoryKidBuuEntity.init();
			StoryBeerusEntity.init();
			StoryBeerus2Entity.init();
			WhisEntity.init();
			StoryTagomaEntity.init();
			StoryShisamiEntity.init();
			StoryGoldenFriezaEntity.init();
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
		event.put(SAIBAMAN.get(), SaibamanEntity.createAttributes().build());
		event.put(STORY_NAPPA.get(), StoryNappaEntity.createAttributes().build());
		event.put(STORY_VEGETA.get(), StoryVegetaEntity.createAttributes().build());
		event.put(EARTH_E.get(), EarthEEntity.createAttributes().build());
		event.put(NAMEK_E.get(), NamekEEntity.createAttributes().build());
		event.put(STORY_FRIEZA_SOLDIER.get(), StoryFriezaSoldierEntity.createAttributes().build());
		event.put(STORY_CUI.get(), StoryCuiEntity.createAttributes().build());
		event.put(STORY_DODORIA.get(), StoryDodoriaEntity.createAttributes().build());
		event.put(STORY_ZARBON.get(), StoryZarbonEntity.createAttributes().build());
		event.put(STORY_GINYU.get(), StoryGinyuEntity.createAttributes().build());
		event.put(STORY_GULDO.get(), StoryGuldoEntity.createAttributes().build());
		event.put(STORY_RECOOME.get(), StoryRecoomeEntity.createAttributes().build());
		event.put(STORY_JEICE.get(), StoryJeiceEntity.createAttributes().build());
		event.put(STORY_BURTER.get(), StoryBurterEntity.createAttributes().build());
		event.put(STORY_FRIEZA.get(), StoryFriezaEntity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_1.get(), NamekDragonBallE1Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_2.get(), NamekDragonBallE2Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_3.get(), NamekDragonBallE3Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_4.get(), NamekDragonBallE4Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_5.get(), NamekDragonBallE5Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_6.get(), NamekDragonBallE6Entity.createAttributes().build());
		event.put(NAMEK_DRAGON_BALL_E_7.get(), NamekDragonBallE7Entity.createAttributes().build());
		event.put(PORUNGA.get(), PorungaEntity.createAttributes().build());
		event.put(NAMEK_CHUNK_LOADER.get(), NamekChunkLoaderEntity.createAttributes().build());
		event.put(NAMEKIAN.get(), NamekianEntity.createAttributes().build());
		event.put(STORY_MECHA_FRIEZA.get(), StoryMechaFriezaEntity.createAttributes().build());
		event.put(STORY_KING_COLD.get(), StoryKingColdEntity.createAttributes().build());
		event.put(STORY_MYSTERIOUS_YOUNG_MAN.get(), StoryMysteriousYoungManEntity.createAttributes().build());
		event.put(STORY_ANDROID_19.get(), StoryAndroid19Entity.createAttributes().build());
		event.put(STORY_ANDROID_20.get(), StoryAndroid20Entity.createAttributes().build());
		event.put(STORY_ANDROID_18.get(), StoryAndroid18Entity.createAttributes().build());
		event.put(STORY_ANDROID_17.get(), StoryAndroid17Entity.createAttributes().build());
		event.put(STORY_CELL.get(), StoryCellEntity.createAttributes().build());
		event.put(STORY_CELL_2.get(), StoryCell2Entity.createAttributes().build());
		event.put(STORY_CELL_3.get(), StoryCell3Entity.createAttributes().build());
		event.put(STORY_CELL_JR.get(), StoryCellJrEntity.createAttributes().build());
		event.put(STORY_CELL_4.get(), StoryCell4Entity.createAttributes().build());
		event.put(YARDRATTAN.get(), YardrattanEntity.createAttributes().build());
		event.put(BABIDI.get(), BabidiEntity.createAttributes().build());
		event.put(YARDRATTAN_MASTER.get(), YardrattanMasterEntity.createAttributes().build());
		event.put(BABIDI_SHIP_SPAWNER.get(), BabidiShipSpawnerEntity.createAttributes().build());
		event.put(STORY_KIBITO.get(), StoryKibitoEntity.createAttributes().build());
		event.put(STORY_SPOPOVICH.get(), StorySpopovichEntity.createAttributes().build());
		event.put(STORY_PUIPUI.get(), StoryPuipuiEntity.createAttributes().build());
		event.put(STORY_DABURA.get(), StoryDaburaEntity.createAttributes().build());
		event.put(STORY_YAKON.get(), StoryYakonEntity.createAttributes().build());
		event.put(STORY_MAJIN_BUU.get(), StoryMajinBuuEntity.createAttributes().build());
		event.put(STORY_SUPER_BUU.get(), StorySuperBuuEntity.createAttributes().build());
		event.put(STORY_FUSED_BUU.get(), StoryFusedBuuEntity.createAttributes().build());
		event.put(STORY_KID_BUU.get(), StoryKidBuuEntity.createAttributes().build());
		event.put(STORY_BEERUS.get(), StoryBeerusEntity.createAttributes().build());
		event.put(STORY_BEERUS_2.get(), StoryBeerus2Entity.createAttributes().build());
		event.put(WHIS.get(), WhisEntity.createAttributes().build());
		event.put(STORY_TAGOMA.get(), StoryTagomaEntity.createAttributes().build());
		event.put(STORY_SHISAMI.get(), StoryShisamiEntity.createAttributes().build());
		event.put(STORY_GOLDEN_FRIEZA.get(), StoryGoldenFriezaEntity.createAttributes().build());
	}
}
