
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
import net.mcreator.dbm.entity.GregoryEntity;
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
			EntityType.Builder.<SpiritBombEntity>of(SpiritBombEntity::new, MobCategory.MISC).setCustomClientFactory(SpiritBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
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
	}
}
