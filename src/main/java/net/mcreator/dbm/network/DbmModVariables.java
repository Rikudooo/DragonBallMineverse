package net.mcreator.dbm.network;

import org.spongepowered.asm.mixin.injection.Group;

import org.jetbrains.annotations.Blocking;

import org.checkerframework.checker.units.qual.Speed;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.DbmMod;

import java.util.function.Supplier;
import java.util.ArrayList;

import com.ibm.icu.number.Scale;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbmModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		DbmMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.MaxHealth = original.MaxHealth;
			clone.MaxKi = original.MaxKi;
			clone.Ki = original.Ki;
			clone.Race = original.Race;
			clone.Alignment = original.Alignment;
			clone.FightingClass = original.FightingClass;
			clone.AlignmentPoints = original.AlignmentPoints;
			clone.Skin1 = original.Skin1;
			clone.Skin2 = original.Skin2;
			clone.Skin3 = original.Skin3;
			clone.Skin4 = original.Skin4;
			clone.EyesColor = original.EyesColor;
			clone.HairColor = original.HairColor;
			clone.EyesType = original.EyesType;
			clone.HairStyle = original.HairStyle;
			clone.HairID = original.HairID;
			clone.HairStyleID = original.HairStyleID;
			clone.EyesTypeID = original.EyesTypeID;
			clone.EyesColorID = original.EyesColorID;
			clone.Skin1ID = original.Skin1ID;
			clone.Skin2ID = original.Skin2ID;
			clone.Skin3ID = original.Skin3ID;
			clone.Skin4ID = original.Skin4ID;
			clone.BodyType = original.BodyType;
			clone.CreationUnfinished = original.CreationUnfinished;
			clone.Mouth = original.Mouth;
			clone.EyeBrows = original.EyeBrows;
			clone.Form = original.Form;
			clone.MouthID = original.MouthID;
			clone.Body = original.Body;
			clone.Spirit = original.Spirit;
			clone.Agility = original.Agility;
			clone.Strength = original.Strength;
			clone.Defense = original.Defense;
			clone.MaxStamina = original.MaxStamina;
			clone.Speed = original.Speed;
			clone.TrainingPoints = original.TrainingPoints;
			clone.NeededTrainingPoints = original.NeededTrainingPoints;
			clone.SubForm = original.SubForm;
			clone.FormBoost = original.FormBoost;
			clone.SubFormBoost = original.SubFormBoost;
			clone.TotalFormBoost = original.TotalFormBoost;
			clone.MeleeDamage = original.MeleeDamage;
			clone.ReleasedPower = original.ReleasedPower;
			clone.Focus = original.Focus;
			clone.KiDamage = original.KiDamage;
			clone.Resilience = original.Resilience;
			clone.Stamina = original.Stamina;
			clone.KiCharge = original.KiCharge;
			clone.AttackCount = original.AttackCount;
			clone.TransformationTimer = original.TransformationTimer;
			clone.Transforming = original.Transforming;
			clone.TPCost = original.TPCost;
			clone.StatIncrease = original.StatIncrease;
			clone.Scale = original.Scale;
			clone.Tail = original.Tail;
			clone.Dead = original.Dead;
			clone.TailColorID = original.TailColorID;
			clone.StaminaPause = original.StaminaPause;
			clone.StaminaTimer = original.StaminaTimer;
			clone.SpacePressed = original.SpacePressed;
			clone.Allocations = original.Allocations;
			clone.ShootKiBlast = original.ShootKiBlast;
			clone.KiBlastTimer = original.KiBlastTimer;
			clone.SelectedKiAttack = original.SelectedKiAttack;
			clone.KiSlot1 = original.KiSlot1;
			clone.Aura = original.Aura;
			clone.SelectedKiSlot = original.SelectedKiSlot;
			clone.AlternativeFunction = original.AlternativeFunction;
			clone.KiDrain = original.KiDrain;
			clone.ChargingKiAttack = original.ChargingKiAttack;
			clone.KiAttackSize = original.KiAttackSize;
			clone.KiAttackTimer = original.KiAttackTimer;
			clone.KiAttackCharge = original.KiAttackCharge;
			clone.LaunchKiAttack = original.LaunchKiAttack;
			clone.KiAttackCost = original.KiAttackCost;
			clone.OldYawAndPitch = original.OldYawAndPitch;
			clone.OldYAW = original.OldYAW;
			clone.OldPitch = original.OldPitch;
			clone.KiAttackDuration = original.KiAttackDuration;
			clone.CurrentKiAttack = original.CurrentKiAttack;
			clone.KiAttackHits = original.KiAttackHits;
			clone.KiSlot2 = original.KiSlot2;
			clone.KiSlot3 = original.KiSlot3;
			clone.KiSlot4 = original.KiSlot4;
			clone.KiSlot5 = original.KiSlot5;
			clone.KiSlot6 = original.KiSlot6;
			clone.KiSlot7 = original.KiSlot7;
			clone.KiSlot8 = original.KiSlot8;
			clone.ForwardPressed = original.ForwardPressed;
			clone.Flying = original.Flying;
			clone.RightPressed = original.RightPressed;
			clone.LeftPressed = original.LeftPressed;
			clone.BackwardPressed = original.BackwardPressed;
			clone.ReleasePower = original.ReleasePower;
			clone.PowerReleaseTimer = original.PowerReleaseTimer;
			clone.PowerPoleScale = original.PowerPoleScale;
			clone.FormPath = original.FormPath;
			clone.RacialFormLevel = original.RacialFormLevel;
			clone.FormLike = original.FormLike;
			clone.KaiokenOwned = original.KaiokenOwned;
			clone.KaiokenLevel = original.KaiokenLevel;
			clone.HealthDrain = original.HealthDrain;
			clone.AuraTexture = original.AuraTexture;
			clone.AuraTextureD = original.AuraTextureD;
			clone.Blocking = original.Blocking;
			clone.BlockingTimer = original.BlockingTimer;
			clone.SelectSkill = original.SelectSkill;
			clone.JumpLevel = original.JumpLevel;
			clone.PotentialReleaseLevel = original.PotentialReleaseLevel;
			clone.FlyLevel = original.FlyLevel;
			clone.KiSenseLevel = original.KiSenseLevel;
			clone.KiSenseTarget = original.KiSenseTarget;
			clone.KiSenseSingle = original.KiSenseSingle;
			clone.Endurance = original.Endurance;
			clone.MaxEndurance = original.MaxEndurance;
			clone.PowerLevel = original.PowerLevel;
			clone.SenzuTimeout = original.SenzuTimeout;
			clone.FlyingNimbus = original.FlyingNimbus;
			clone.WaterDrank = original.WaterDrank;
			clone.RiddingNimbus = original.RiddingNimbus;
			clone.SpacePod = original.SpacePod;
			clone.Age = original.Age;
			clone.Width = original.Width;
			clone.JumpTimer = original.JumpTimer;
			clone.CanJump = original.CanJump;
			clone.KiAttackRoll = original.KiAttackRoll;
			clone.StoryModeProgress = original.StoryModeProgress;
			clone.SelectedKiMove = original.SelectedKiMove;
			clone.Aging = original.Aging;
			clone.LastAgeTime = original.LastAgeTime;
			clone.DBDistance = original.DBDistance;
			clone.SelectedDB = original.SelectedDB;
			clone.StoryGUI = original.StoryGUI;
			clone.GKi = original.GKi;
			clone.Legendary = original.Legendary;
			clone.MaxRacialLevel = original.MaxRacialLevel;
			clone.RacialTPCost = original.RacialTPCost;
			clone.SaibamanDefeated = original.SaibamanDefeated;
			clone.FriezaSoldierDefeated = original.FriezaSoldierDefeated;
			clone.CurrentInvite = original.CurrentInvite;
			clone.Member1 = original.Member1;
			clone.Member2 = original.Member2;
			clone.Member3 = original.Member3;
			clone.Member4 = original.Member4;
			clone.Member5 = original.Member5;
			clone.Group = original.Group;
			clone.HealthDrainTimer = original.HealthDrainTimer;
			clone.DefeatedFriezaSoldiers2 = original.DefeatedFriezaSoldiers2;
			clone.TimeChamberTimeLimit = original.TimeChamberTimeLimit;
			clone.TimeChamberLocked = original.TimeChamberLocked;
			clone.DefeatedCellJr = original.DefeatedCellJr;
			clone.EarthToHTCTimeLimit = original.EarthToHTCTimeLimit;
			clone.InstantTransmissionSkill = original.InstantTransmissionSkill;
			clone.InstantTransmission = original.InstantTransmission;
			clone.BabidiMagic = original.BabidiMagic;
			clone.KOed = original.KOed;
			clone.KOTimer = original.KOTimer;
			clone.MemberName1 = original.MemberName1;
			clone.MemberName2 = original.MemberName2;
			clone.MemberName3 = original.MemberName3;
			clone.MemberName4 = original.MemberName4;
			clone.MemberName5 = original.MemberName5;
			clone.FriendlyFire = original.FriendlyFire;
			clone.FormMasteries = original.FormMasteries;
			clone.RaceAbility = original.RaceAbility;
			clone.ZenkaiLevel = original.ZenkaiLevel;
			clone.Headwear = original.Headwear;
			clone.ScouterMode = original.ScouterMode;
			clone.ScouterLocked = original.ScouterLocked;
			clone.ScouterEntity = original.ScouterEntity;
			clone.ScouterDistance = original.ScouterDistance;
			clone.ScouterPL = original.ScouterPL;
			if (!event.isWasDeath()) {
				clone.KiAttackDamage = original.KiAttackDamage;
				clone.Height = original.Height;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					DbmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					DbmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					DbmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "dbm_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				DbmMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "dbm_mapvars";
		public boolean OtherWorldGenerated = false;
		public boolean DefaultStructureLoaded = false;
		public boolean KameHouseSpawned = false;
		public String KameHouseCoords = "Kame House is unknown";
		public boolean ShenronCalled = false;
		public double ShenronSpawnTimer = 0;
		public boolean DragonBallsUsable = true;
		public boolean DragonBallsJumped = false;
		public double ShenronDemands = 3.0;
		public boolean ShenronSpawned = false;
		public double DBx1 = 0;
		public double DBx2 = 0;
		public double DBx3 = 0;
		public double DBx4 = 0;
		public double DBx5 = 0;
		public double DBx6 = 0;
		public double DBx7 = 0;
		public double DBy1 = 0;
		public double DBy2 = 0;
		public double DBy3 = 0;
		public double DBy4 = 0;
		public double DBy5 = 0;
		public double DBy6 = 0;
		public double DBy7 = 0;
		public double DBz1 = 0;
		public double DBz2 = 0;
		public double DBz3 = 0;
		public double DBz4 = 0;
		public double DBz5 = 0;
		public double DBz6 = 0;
		public double DBz7 = 0;
		public boolean DBSpawned1 = false;
		public boolean DBSpawned2 = false;
		public boolean DBSpawned3 = false;
		public boolean DBSpawned4 = false;
		public boolean DBSpawned5 = false;
		public boolean DBSpawned6 = false;
		public boolean DBSpawned7 = false;
		public double DragonBallTimer = 0;
		public boolean kamehousepspawnerSpawned = false;
		public boolean EarthSpawned = false;
		public boolean NamekSpawned = false;
		public boolean NamekDragonBallsUsable = true;
		public boolean PorungaCalled = false;
		public double NDBx1 = 0;
		public double NDBy1 = 0;
		public double NDBz1 = 0;
		public double NDBx2 = 0;
		public double NDBy2 = 0;
		public double NDBz2 = 0;
		public double NDBx3 = 0;
		public double NDBy3 = 0;
		public double NDBz3 = 0;
		public double NDBx4 = 0;
		public double NDBy4 = 0;
		public double NDBz4 = 0;
		public double NDBx5 = 0;
		public double NDBy5 = 0;
		public double NDBz5 = 0;
		public double NDBx6 = 0;
		public double NDBy6 = 0;
		public double NDBz6 = 0;
		public double NDBx7 = 0;
		public double NDBy7 = 0;
		public double NDBz7 = 0;
		public double PorungaSpawnTimer = 0;
		public boolean PorungaSpawned = false;
		public double NamekDragonBallTimer = 0;
		public double PorungaDemands = 3.0;
		public boolean NDBSpawned1 = false;
		public boolean NDBSpawned2 = false;
		public boolean NDBSpawned3 = false;
		public boolean NDBSpawned4 = false;
		public boolean NDBSpawned5 = false;
		public boolean NDBSpawned6 = false;
		public boolean NDBSpawned7 = false;
		public boolean HTCSpawned = false;
		public String BabidiShipCoords = "Babidi's Ship is unknown";
		public boolean BabidiShip = false;
		public boolean BabidiShipSpawner = false;
		public boolean LegendarySpawned = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			if (nbt == null) {
				nbt = save(new CompoundTag());
			}
			OtherWorldGenerated = nbt.getBoolean("OtherWorldGenerated");
			DefaultStructureLoaded = nbt.getBoolean("DefaultStructureLoaded");
			KameHouseSpawned = nbt.getBoolean("KameHouseSpawned");
			KameHouseCoords = nbt.getString("KameHouseCoords");
			ShenronCalled = nbt.getBoolean("ShenronCalled");
			ShenronSpawnTimer = nbt.getDouble("ShenronSpawnTimer");
			DragonBallsUsable = nbt.getBoolean("DragonBallsUsable");
			DragonBallsJumped = nbt.getBoolean("DragonBallsJumped");
			ShenronDemands = nbt.getDouble("ShenronDemands");
			ShenronSpawned = nbt.getBoolean("ShenronSpawned");
			DBx1 = nbt.getDouble("DBx1");
			DBx2 = nbt.getDouble("DBx2");
			DBx3 = nbt.getDouble("DBx3");
			DBx4 = nbt.getDouble("DBx4");
			DBx5 = nbt.getDouble("DBx5");
			DBx6 = nbt.getDouble("DBx6");
			DBx7 = nbt.getDouble("DBx7");
			DBy1 = nbt.getDouble("DBy1");
			DBy2 = nbt.getDouble("DBy2");
			DBy3 = nbt.getDouble("DBy3");
			DBy4 = nbt.getDouble("DBy4");
			DBy5 = nbt.getDouble("DBy5");
			DBy6 = nbt.getDouble("DBy6");
			DBy7 = nbt.getDouble("DBy7");
			DBz1 = nbt.getDouble("DBz1");
			DBz2 = nbt.getDouble("DBz2");
			DBz3 = nbt.getDouble("DBz3");
			DBz4 = nbt.getDouble("DBz4");
			DBz5 = nbt.getDouble("DBz5");
			DBz6 = nbt.getDouble("DBz6");
			DBz7 = nbt.getDouble("DBz7");
			DBSpawned1 = nbt.getBoolean("DBSpawned1");
			DBSpawned2 = nbt.getBoolean("DBSpawned2");
			DBSpawned3 = nbt.getBoolean("DBSpawned3");
			DBSpawned4 = nbt.getBoolean("DBSpawned4");
			DBSpawned5 = nbt.getBoolean("DBSpawned5");
			DBSpawned6 = nbt.getBoolean("DBSpawned6");
			DBSpawned7 = nbt.getBoolean("DBSpawned7");
			DragonBallTimer = nbt.getDouble("DragonBallTimer");
			kamehousepspawnerSpawned = nbt.getBoolean("kamehousepspawnerSpawned");
			EarthSpawned = nbt.getBoolean("EarthSpawned");
			NamekSpawned = nbt.getBoolean("NamekSpawned");
			NamekDragonBallsUsable = nbt.getBoolean("NamekDragonBallsUsable");
			PorungaCalled = nbt.getBoolean("PorungaCalled");
			NDBx1 = nbt.getDouble("NDBx1");
			NDBy1 = nbt.getDouble("NDBy1");
			NDBz1 = nbt.getDouble("NDBz1");
			NDBx2 = nbt.getDouble("NDBx2");
			NDBy2 = nbt.getDouble("NDBy2");
			NDBz2 = nbt.getDouble("NDBz2");
			NDBx3 = nbt.getDouble("NDBx3");
			NDBy3 = nbt.getDouble("NDBy3");
			NDBz3 = nbt.getDouble("NDBz3");
			NDBx4 = nbt.getDouble("NDBx4");
			NDBy4 = nbt.getDouble("NDBy4");
			NDBz4 = nbt.getDouble("NDBz4");
			NDBx5 = nbt.getDouble("NDBx5");
			NDBy5 = nbt.getDouble("NDBy5");
			NDBz5 = nbt.getDouble("NDBz5");
			NDBx6 = nbt.getDouble("NDBx6");
			NDBy6 = nbt.getDouble("NDBy6");
			NDBz6 = nbt.getDouble("NDBz6");
			NDBx7 = nbt.getDouble("NDBx7");
			NDBy7 = nbt.getDouble("NDBy7");
			NDBz7 = nbt.getDouble("NDBz7");
			PorungaSpawnTimer = nbt.getDouble("PorungaSpawnTimer");
			PorungaSpawned = nbt.getBoolean("PorungaSpawned");
			NamekDragonBallTimer = nbt.getDouble("NamekDragonBallTimer");
			PorungaDemands = nbt.getDouble("PorungaDemands");
			NDBSpawned1 = nbt.getBoolean("NDBSpawned1");
			NDBSpawned2 = nbt.getBoolean("NDBSpawned2");
			NDBSpawned3 = nbt.getBoolean("NDBSpawned3");
			NDBSpawned4 = nbt.getBoolean("NDBSpawned4");
			NDBSpawned5 = nbt.getBoolean("NDBSpawned5");
			NDBSpawned6 = nbt.getBoolean("NDBSpawned6");
			NDBSpawned7 = nbt.getBoolean("NDBSpawned7");
			HTCSpawned = nbt.getBoolean("HTCSpawned");
			BabidiShipCoords = nbt.getString("BabidiShipCoords");
			BabidiShip = nbt.getBoolean("BabidiShip");
			BabidiShipSpawner = nbt.getBoolean("BabidiShipSpawner");
			LegendarySpawned = nbt.getBoolean("LegendarySpawned");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("OtherWorldGenerated", OtherWorldGenerated);
			nbt.putBoolean("DefaultStructureLoaded", DefaultStructureLoaded);
			nbt.putBoolean("KameHouseSpawned", KameHouseSpawned);
			nbt.putString("KameHouseCoords", KameHouseCoords);
			nbt.putBoolean("ShenronCalled", ShenronCalled);
			nbt.putDouble("ShenronSpawnTimer", ShenronSpawnTimer);
			nbt.putBoolean("DragonBallsUsable", DragonBallsUsable);
			nbt.putBoolean("DragonBallsJumped", DragonBallsJumped);
			nbt.putDouble("ShenronDemands", ShenronDemands);
			nbt.putBoolean("ShenronSpawned", ShenronSpawned);
			nbt.putDouble("DBx1", DBx1);
			nbt.putDouble("DBx2", DBx2);
			nbt.putDouble("DBx3", DBx3);
			nbt.putDouble("DBx4", DBx4);
			nbt.putDouble("DBx5", DBx5);
			nbt.putDouble("DBx6", DBx6);
			nbt.putDouble("DBx7", DBx7);
			nbt.putDouble("DBy1", DBy1);
			nbt.putDouble("DBy2", DBy2);
			nbt.putDouble("DBy3", DBy3);
			nbt.putDouble("DBy4", DBy4);
			nbt.putDouble("DBy5", DBy5);
			nbt.putDouble("DBy6", DBy6);
			nbt.putDouble("DBy7", DBy7);
			nbt.putDouble("DBz1", DBz1);
			nbt.putDouble("DBz2", DBz2);
			nbt.putDouble("DBz3", DBz3);
			nbt.putDouble("DBz4", DBz4);
			nbt.putDouble("DBz5", DBz5);
			nbt.putDouble("DBz6", DBz6);
			nbt.putDouble("DBz7", DBz7);
			nbt.putBoolean("DBSpawned1", DBSpawned1);
			nbt.putBoolean("DBSpawned2", DBSpawned2);
			nbt.putBoolean("DBSpawned3", DBSpawned3);
			nbt.putBoolean("DBSpawned4", DBSpawned4);
			nbt.putBoolean("DBSpawned5", DBSpawned5);
			nbt.putBoolean("DBSpawned6", DBSpawned6);
			nbt.putBoolean("DBSpawned7", DBSpawned7);
			nbt.putDouble("DragonBallTimer", DragonBallTimer);
			nbt.putBoolean("kamehousepspawnerSpawned", kamehousepspawnerSpawned);
			nbt.putBoolean("EarthSpawned", EarthSpawned);
			nbt.putBoolean("NamekSpawned", NamekSpawned);
			nbt.putBoolean("NamekDragonBallsUsable", NamekDragonBallsUsable);
			nbt.putBoolean("PorungaCalled", PorungaCalled);
			nbt.putDouble("NDBx1", NDBx1);
			nbt.putDouble("NDBy1", NDBy1);
			nbt.putDouble("NDBz1", NDBz1);
			nbt.putDouble("NDBx2", NDBx2);
			nbt.putDouble("NDBy2", NDBy2);
			nbt.putDouble("NDBz2", NDBz2);
			nbt.putDouble("NDBx3", NDBx3);
			nbt.putDouble("NDBy3", NDBy3);
			nbt.putDouble("NDBz3", NDBz3);
			nbt.putDouble("NDBx4", NDBx4);
			nbt.putDouble("NDBy4", NDBy4);
			nbt.putDouble("NDBz4", NDBz4);
			nbt.putDouble("NDBx5", NDBx5);
			nbt.putDouble("NDBy5", NDBy5);
			nbt.putDouble("NDBz5", NDBz5);
			nbt.putDouble("NDBx6", NDBx6);
			nbt.putDouble("NDBy6", NDBy6);
			nbt.putDouble("NDBz6", NDBz6);
			nbt.putDouble("NDBx7", NDBx7);
			nbt.putDouble("NDBy7", NDBy7);
			nbt.putDouble("NDBz7", NDBz7);
			nbt.putDouble("PorungaSpawnTimer", PorungaSpawnTimer);
			nbt.putBoolean("PorungaSpawned", PorungaSpawned);
			nbt.putDouble("NamekDragonBallTimer", NamekDragonBallTimer);
			nbt.putDouble("PorungaDemands", PorungaDemands);
			nbt.putBoolean("NDBSpawned1", NDBSpawned1);
			nbt.putBoolean("NDBSpawned2", NDBSpawned2);
			nbt.putBoolean("NDBSpawned3", NDBSpawned3);
			nbt.putBoolean("NDBSpawned4", NDBSpawned4);
			nbt.putBoolean("NDBSpawned5", NDBSpawned5);
			nbt.putBoolean("NDBSpawned6", NDBSpawned6);
			nbt.putBoolean("NDBSpawned7", NDBSpawned7);
			nbt.putBoolean("HTCSpawned", HTCSpawned);
			nbt.putString("BabidiShipCoords", BabidiShipCoords);
			nbt.putBoolean("BabidiShip", BabidiShip);
			nbt.putBoolean("BabidiShipSpawner", BabidiShipSpawner);
			nbt.putBoolean("LegendarySpawned", LegendarySpawned);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				DbmMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("dbm", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double MaxHealth = 20.0;
		public double MaxKi = 0;
		public double Ki = 0.0;
		public String Race = "Saiyan";
		public String Alignment = "Neutral";
		public String FightingClass = "Warrior";
		public double AlignmentPoints = 0;
		public double Skin1 = 1.0;
		public double Skin2 = 1.0;
		public double Skin3 = 1.0;
		public double Skin4 = 1.0;
		public double EyesColor = 1.0;
		public double HairColor = 1.0;
		public double EyesType = 1.0;
		public double HairStyle = 1.0;
		public String HairID = "dbm:textures/entities/notexture.png";
		public String HairStyleID = "dbm:textures/entities/notexture.png";
		public String EyesTypeID = "dbm:textures/entities/notexture.png";
		public String EyesColorID = "dbm:textures/entities/notexture.png";
		public String Skin1ID = "dbm:textures/entities/notexture.png";
		public String Skin2ID = "dbm:textures/entities/notexture.png";
		public String Skin3ID = "dbm:textures/entities/notexture.png";
		public String Skin4ID = "dbm:textures/entities/notexture.png";
		public String BodyType = "Humanoid";
		public boolean CreationUnfinished = false;
		public double Mouth = 0.0;
		public double EyeBrows = 0;
		public String Form = "Base";
		public String MouthID = "dbm:textures/entities/notexture.png";
		public double Body = 1.0;
		public double Spirit = 0.0;
		public double Agility = 1.0;
		public double Strength = 1.0;
		public double Defense = 0;
		public double MaxStamina = 0;
		public double Speed = 0;
		public double TrainingPoints = 0;
		public double NeededTrainingPoints = 5.0;
		public String SubForm = "Base";
		public double FormBoost = 1.0;
		public double SubFormBoost = 1.0;
		public double TotalFormBoost = 1.0;
		public double MeleeDamage = 0;
		public double ReleasedPower = 0.5;
		public double Focus = 0;
		public double KiDamage = 0;
		public double Resilience = 0;
		public double Stamina = 0;
		public boolean KiCharge = false;
		public double AttackCount = 1.0;
		public double TransformationTimer = 0;
		public boolean Transforming = false;
		public double TPCost = 0;
		public double StatIncrease = 1.0;
		public double Scale = 1.0;
		public boolean Tail = false;
		public boolean Dead = false;
		public String TailColorID = "dbm:textures/entities/notexture.png";
		public boolean StaminaPause = false;
		public double StaminaTimer = 0;
		public boolean SpacePressed = false;
		public double Allocations = 0;
		public boolean ShootKiBlast = false;
		public double KiBlastTimer = 0;
		public String SelectedKiAttack = "Empty";
		public String KiSlot1 = "Empty";
		public boolean Aura = false;
		public double SelectedKiSlot = 1.0;
		public boolean AlternativeFunction = false;
		public double KiDrain = 0;
		public boolean ChargingKiAttack = false;
		public double KiAttackSize = 0;
		public double KiAttackTimer = 0;
		public double KiAttackCharge = 0;
		public boolean LaunchKiAttack = false;
		public double KiAttackCost = 0;
		public double KiAttackDamage = 0;
		public boolean OldYawAndPitch = false;
		public double OldYAW = 0;
		public double OldPitch = 0;
		public double KiAttackDuration = 0;
		public String CurrentKiAttack = "Empty";
		public double KiAttackHits = 0;
		public String KiSlot2 = "Empty";
		public String KiSlot3 = "Empty";
		public String KiSlot4 = "Empty";
		public String KiSlot5 = "Empty";
		public String KiSlot6 = "Empty";
		public String KiSlot7 = "Empty";
		public String KiSlot8 = "Empty";
		public boolean ForwardPressed = false;
		public boolean Flying = false;
		public boolean RightPressed = false;
		public boolean LeftPressed = false;
		public boolean BackwardPressed = false;
		public boolean ReleasePower = false;
		public double PowerReleaseTimer = 0;
		public double PowerPoleScale = 0;
		public String FormPath = "Base";
		public double RacialFormLevel = 0;
		public String FormLike = "\"\"";
		public double KaiokenOwned = 0;
		public double KaiokenLevel = 0;
		public double HealthDrain = 0;
		public String AuraTexture = "\"\"";
		public String AuraTextureD = "dbm:textures/entities/aura_base.png";
		public boolean Blocking = false;
		public double BlockingTimer = 0;
		public String SelectSkill = "None";
		public double JumpLevel = 0;
		public double PotentialReleaseLevel = 0;
		public double FlyLevel = 0;
		public double KiSenseLevel = 0;
		public String KiSenseTarget = "Off";
		public boolean KiSenseSingle = false;
		public double Endurance = 1.0;
		public double MaxEndurance = 1.0;
		public double PowerLevel = 0;
		public double SenzuTimeout = 0;
		public boolean FlyingNimbus = false;
		public boolean WaterDrank = false;
		public boolean RiddingNimbus = false;
		public boolean SpacePod = false;
		public double Age = 10.0;
		public double Height = 1.0;
		public double Width = 1.0;
		public double JumpTimer = 0;
		public boolean CanJump = false;
		public double KiAttackRoll = 0;
		public String StoryModeProgress = "None";
		public String SelectedKiMove = "None";
		public double Aging = 0;
		public double LastAgeTime = 0;
		public String DBDistance = "\"\"";
		public double SelectedDB = 0;
		public double StoryGUI = 0;
		public boolean GKi = false;
		public boolean Legendary = false;
		public double MaxRacialLevel = 0;
		public double RacialTPCost = 0;
		public double SaibamanDefeated = 0;
		public double FriezaSoldierDefeated = 0;
		public String CurrentInvite = "None";
		public String Member1 = "None";
		public String Member2 = "None";
		public String Member3 = "None";
		public String Member4 = "None";
		public String Member5 = "None";
		public boolean Group = false;
		public double HealthDrainTimer = 0;
		public double DefeatedFriezaSoldiers2 = 0;
		public double TimeChamberTimeLimit = 24000.0;
		public boolean TimeChamberLocked = false;
		public double DefeatedCellJr = 0;
		public double EarthToHTCTimeLimit = 0;
		public boolean InstantTransmissionSkill = false;
		public boolean InstantTransmission = false;
		public boolean BabidiMagic = false;
		public boolean KOed = false;
		public double KOTimer = 0;
		public String MemberName1 = "None";
		public String MemberName2 = "None";
		public String MemberName3 = "None";
		public String MemberName4 = "None";
		public String MemberName5 = "None";
		public String FriendlyFire = "Off";
		public ListTag FormMasteries = new ListTag();
		public boolean RaceAbility = false;
		public double ZenkaiLevel = 0.0;
		public String Headwear = "None";
		public double ScouterMode = 0.0;
		public boolean ScouterLocked = false;
		public String ScouterEntity = "\"\"";
		public double ScouterDistance = 0;
		public double ScouterPL = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				DbmMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("MaxHealth", MaxHealth);
			nbt.putDouble("MaxKi", MaxKi);
			nbt.putDouble("Ki", Ki);
			nbt.putString("Race", Race);
			nbt.putString("Alignment", Alignment);
			nbt.putString("FightingClass", FightingClass);
			nbt.putDouble("AlignmentPoints", AlignmentPoints);
			nbt.putDouble("Skin1", Skin1);
			nbt.putDouble("Skin2", Skin2);
			nbt.putDouble("Skin3", Skin3);
			nbt.putDouble("Skin4", Skin4);
			nbt.putDouble("EyesColor", EyesColor);
			nbt.putDouble("HairColor", HairColor);
			nbt.putDouble("EyesType", EyesType);
			nbt.putDouble("HairStyle", HairStyle);
			nbt.putString("HairID", HairID);
			nbt.putString("HairStyleID", HairStyleID);
			nbt.putString("EyesTypeID", EyesTypeID);
			nbt.putString("EyesColorID", EyesColorID);
			nbt.putString("Skin1ID", Skin1ID);
			nbt.putString("Skin2ID", Skin2ID);
			nbt.putString("Skin3ID", Skin3ID);
			nbt.putString("Skin4ID", Skin4ID);
			nbt.putString("BodyType", BodyType);
			nbt.putBoolean("CreationUnfinished", CreationUnfinished);
			nbt.putDouble("Mouth", Mouth);
			nbt.putDouble("EyeBrows", EyeBrows);
			nbt.putString("Form", Form);
			nbt.putString("MouthID", MouthID);
			nbt.putDouble("Body", Body);
			nbt.putDouble("Spirit", Spirit);
			nbt.putDouble("Agility", Agility);
			nbt.putDouble("Strength", Strength);
			nbt.putDouble("Defense", Defense);
			nbt.putDouble("MaxStamina", MaxStamina);
			nbt.putDouble("Speed", Speed);
			nbt.putDouble("TrainingPoints", TrainingPoints);
			nbt.putDouble("NeededTrainingPoints", NeededTrainingPoints);
			nbt.putString("SubForm", SubForm);
			nbt.putDouble("FormBoost", FormBoost);
			nbt.putDouble("SubFormBoost", SubFormBoost);
			nbt.putDouble("TotalFormBoost", TotalFormBoost);
			nbt.putDouble("MeleeDamage", MeleeDamage);
			nbt.putDouble("ReleasedPower", ReleasedPower);
			nbt.putDouble("Focus", Focus);
			nbt.putDouble("KiDamage", KiDamage);
			nbt.putDouble("Resilience", Resilience);
			nbt.putDouble("Stamina", Stamina);
			nbt.putBoolean("KiCharge", KiCharge);
			nbt.putDouble("AttackCount", AttackCount);
			nbt.putDouble("TransformationTimer", TransformationTimer);
			nbt.putBoolean("Transforming", Transforming);
			nbt.putDouble("TPCost", TPCost);
			nbt.putDouble("StatIncrease", StatIncrease);
			nbt.putDouble("Scale", Scale);
			nbt.putBoolean("Tail", Tail);
			nbt.putBoolean("Dead", Dead);
			nbt.putString("TailColorID", TailColorID);
			nbt.putBoolean("StaminaPause", StaminaPause);
			nbt.putDouble("StaminaTimer", StaminaTimer);
			nbt.putBoolean("SpacePressed", SpacePressed);
			nbt.putDouble("Allocations", Allocations);
			nbt.putBoolean("ShootKiBlast", ShootKiBlast);
			nbt.putDouble("KiBlastTimer", KiBlastTimer);
			nbt.putString("SelectedKiAttack", SelectedKiAttack);
			nbt.putString("KiSlot1", KiSlot1);
			nbt.putBoolean("Aura", Aura);
			nbt.putDouble("SelectedKiSlot", SelectedKiSlot);
			nbt.putBoolean("AlternativeFunction", AlternativeFunction);
			nbt.putDouble("KiDrain", KiDrain);
			nbt.putBoolean("ChargingKiAttack", ChargingKiAttack);
			nbt.putDouble("KiAttackSize", KiAttackSize);
			nbt.putDouble("KiAttackTimer", KiAttackTimer);
			nbt.putDouble("KiAttackCharge", KiAttackCharge);
			nbt.putBoolean("LaunchKiAttack", LaunchKiAttack);
			nbt.putDouble("KiAttackCost", KiAttackCost);
			nbt.putDouble("KiAttackDamage", KiAttackDamage);
			nbt.putBoolean("OldYawAndPitch", OldYawAndPitch);
			nbt.putDouble("OldYAW", OldYAW);
			nbt.putDouble("OldPitch", OldPitch);
			nbt.putDouble("KiAttackDuration", KiAttackDuration);
			nbt.putString("CurrentKiAttack", CurrentKiAttack);
			nbt.putDouble("KiAttackHits", KiAttackHits);
			nbt.putString("KiSlot2", KiSlot2);
			nbt.putString("KiSlot3", KiSlot3);
			nbt.putString("KiSlot4", KiSlot4);
			nbt.putString("KiSlot5", KiSlot5);
			nbt.putString("KiSlot6", KiSlot6);
			nbt.putString("KiSlot7", KiSlot7);
			nbt.putString("KiSlot8", KiSlot8);
			nbt.putBoolean("ForwardPressed", ForwardPressed);
			nbt.putBoolean("Flying", Flying);
			nbt.putBoolean("RightPressed", RightPressed);
			nbt.putBoolean("LeftPressed", LeftPressed);
			nbt.putBoolean("BackwardPressed", BackwardPressed);
			nbt.putBoolean("ReleasePower", ReleasePower);
			nbt.putDouble("PowerReleaseTimer", PowerReleaseTimer);
			nbt.putDouble("PowerPoleScale", PowerPoleScale);
			nbt.putString("FormPath", FormPath);
			nbt.putDouble("RacialFormLevel", RacialFormLevel);
			nbt.putString("FormLike", FormLike);
			nbt.putDouble("KaiokenOwned", KaiokenOwned);
			nbt.putDouble("KaiokenLevel", KaiokenLevel);
			nbt.putDouble("HealthDrain", HealthDrain);
			nbt.putString("AuraTexture", AuraTexture);
			nbt.putString("AuraTextureD", AuraTextureD);
			nbt.putBoolean("Blocking", Blocking);
			nbt.putDouble("BlockingTimer", BlockingTimer);
			nbt.putString("SelectSkill", SelectSkill);
			nbt.putDouble("JumpLevel", JumpLevel);
			nbt.putDouble("PotentialReleaseLevel", PotentialReleaseLevel);
			nbt.putDouble("FlyLevel", FlyLevel);
			nbt.putDouble("KiSenseLevel", KiSenseLevel);
			nbt.putString("KiSenseTarget", KiSenseTarget);
			nbt.putBoolean("KiSenseSingle", KiSenseSingle);
			nbt.putDouble("Endurance", Endurance);
			nbt.putDouble("MaxEndurance", MaxEndurance);
			nbt.putDouble("PowerLevel", PowerLevel);
			nbt.putDouble("SenzuTimeout", SenzuTimeout);
			nbt.putBoolean("FlyingNimbus", FlyingNimbus);
			nbt.putBoolean("WaterDrank", WaterDrank);
			nbt.putBoolean("RiddingNimbus", RiddingNimbus);
			nbt.putBoolean("SpacePod", SpacePod);
			nbt.putDouble("Age", Age);
			nbt.putDouble("Height", Height);
			nbt.putDouble("Width", Width);
			nbt.putDouble("JumpTimer", JumpTimer);
			nbt.putBoolean("CanJump", CanJump);
			nbt.putDouble("KiAttackRoll", KiAttackRoll);
			nbt.putString("StoryModeProgress", StoryModeProgress);
			nbt.putString("SelectedKiMove", SelectedKiMove);
			nbt.putDouble("Aging", Aging);
			nbt.putDouble("LastAgeTime", LastAgeTime);
			nbt.putString("DBDistance", DBDistance);
			nbt.putDouble("SelectedDB", SelectedDB);
			nbt.putDouble("StoryGUI", StoryGUI);
			nbt.putBoolean("GKi", GKi);
			nbt.putBoolean("Legendary", Legendary);
			nbt.putDouble("MaxRacialLevel", MaxRacialLevel);
			nbt.putDouble("RacialTPCost", RacialTPCost);
			nbt.putDouble("SaibamanDefeated", SaibamanDefeated);
			nbt.putDouble("FriezaSoldierDefeated", FriezaSoldierDefeated);
			nbt.putString("CurrentInvite", CurrentInvite);
			nbt.putString("Member1", Member1);
			nbt.putString("Member2", Member2);
			nbt.putString("Member3", Member3);
			nbt.putString("Member4", Member4);
			nbt.putString("Member5", Member5);
			nbt.putBoolean("Group", Group);
			nbt.putDouble("HealthDrainTimer", HealthDrainTimer);
			nbt.putDouble("DefeatedFriezaSoldiers2", DefeatedFriezaSoldiers2);
			nbt.putDouble("TimeChamberTimeLimit", TimeChamberTimeLimit);
			nbt.putBoolean("TimeChamberLocked", TimeChamberLocked);
			nbt.putDouble("DefeatedCellJr", DefeatedCellJr);
			nbt.putDouble("EarthToHTCTimeLimit", EarthToHTCTimeLimit);
			nbt.putBoolean("InstantTransmissionSkill", InstantTransmissionSkill);
			nbt.putBoolean("InstantTransmission", InstantTransmission);
			nbt.putBoolean("BabidiMagic", BabidiMagic);
			nbt.putBoolean("KOed", KOed);
			nbt.putDouble("KOTimer", KOTimer);
			nbt.putString("MemberName1", MemberName1);
			nbt.putString("MemberName2", MemberName2);
			nbt.putString("MemberName3", MemberName3);
			nbt.putString("MemberName4", MemberName4);
			nbt.putString("MemberName5", MemberName5);
			nbt.putString("FriendlyFire", FriendlyFire);
			nbt.put("FormMasteries", this.FormMasteries);
			nbt.putBoolean("RaceAbility", RaceAbility);
			nbt.putDouble("ZenkaiLevel", ZenkaiLevel);
			nbt.putString("Headwear", Headwear);
			nbt.putDouble("ScouterMode", ScouterMode);
			nbt.putBoolean("ScouterLocked", ScouterLocked);
			nbt.putString("ScouterEntity", ScouterEntity);
			nbt.putDouble("ScouterDistance", ScouterDistance);
			nbt.putDouble("ScouterPL", ScouterPL);
			return nbt;
		}

		public void readNBT(Tag tag) {
			if (tag == null) {
				tag = writeNBT();
			}
			CompoundTag nbt = (CompoundTag) tag;
			if (nbt == null) {
				nbt = (CompoundTag) writeNBT();
			}
			MaxHealth = nbt.getDouble("MaxHealth");
			MaxKi = nbt.getDouble("MaxKi");
			Ki = nbt.getDouble("Ki");
			Race = nbt.getString("Race");
			Alignment = nbt.getString("Alignment");
			FightingClass = nbt.getString("FightingClass");
			AlignmentPoints = nbt.getDouble("AlignmentPoints");
			Skin1 = nbt.getDouble("Skin1");
			Skin2 = nbt.getDouble("Skin2");
			Skin3 = nbt.getDouble("Skin3");
			Skin4 = nbt.getDouble("Skin4");
			EyesColor = nbt.getDouble("EyesColor");
			HairColor = nbt.getDouble("HairColor");
			EyesType = nbt.getDouble("EyesType");
			HairStyle = nbt.getDouble("HairStyle");
			HairID = nbt.getString("HairID");
			HairStyleID = nbt.getString("HairStyleID");
			EyesTypeID = nbt.getString("EyesTypeID");
			EyesColorID = nbt.getString("EyesColorID");
			Skin1ID = nbt.getString("Skin1ID");
			Skin2ID = nbt.getString("Skin2ID");
			Skin3ID = nbt.getString("Skin3ID");
			Skin4ID = nbt.getString("Skin4ID");
			BodyType = nbt.getString("BodyType");
			CreationUnfinished = nbt.getBoolean("CreationUnfinished");
			Mouth = nbt.getDouble("Mouth");
			EyeBrows = nbt.getDouble("EyeBrows");
			Form = nbt.getString("Form");
			MouthID = nbt.getString("MouthID");
			Body = nbt.getDouble("Body");
			Spirit = nbt.getDouble("Spirit");
			Agility = nbt.getDouble("Agility");
			Strength = nbt.getDouble("Strength");
			Defense = nbt.getDouble("Defense");
			MaxStamina = nbt.getDouble("MaxStamina");
			Speed = nbt.getDouble("Speed");
			TrainingPoints = nbt.getDouble("TrainingPoints");
			NeededTrainingPoints = nbt.getDouble("NeededTrainingPoints");
			SubForm = nbt.getString("SubForm");
			FormBoost = nbt.getDouble("FormBoost");
			SubFormBoost = nbt.getDouble("SubFormBoost");
			TotalFormBoost = nbt.getDouble("TotalFormBoost");
			MeleeDamage = nbt.getDouble("MeleeDamage");
			ReleasedPower = nbt.getDouble("ReleasedPower");
			Focus = nbt.getDouble("Focus");
			KiDamage = nbt.getDouble("KiDamage");
			Resilience = nbt.getDouble("Resilience");
			Stamina = nbt.getDouble("Stamina");
			KiCharge = nbt.getBoolean("KiCharge");
			AttackCount = nbt.getDouble("AttackCount");
			TransformationTimer = nbt.getDouble("TransformationTimer");
			Transforming = nbt.getBoolean("Transforming");
			TPCost = nbt.getDouble("TPCost");
			StatIncrease = nbt.getDouble("StatIncrease");
			Scale = nbt.getDouble("Scale");
			Tail = nbt.getBoolean("Tail");
			Dead = nbt.getBoolean("Dead");
			TailColorID = nbt.getString("TailColorID");
			StaminaPause = nbt.getBoolean("StaminaPause");
			StaminaTimer = nbt.getDouble("StaminaTimer");
			SpacePressed = nbt.getBoolean("SpacePressed");
			Allocations = nbt.getDouble("Allocations");
			ShootKiBlast = nbt.getBoolean("ShootKiBlast");
			KiBlastTimer = nbt.getDouble("KiBlastTimer");
			SelectedKiAttack = nbt.getString("SelectedKiAttack");
			KiSlot1 = nbt.getString("KiSlot1");
			Aura = nbt.getBoolean("Aura");
			SelectedKiSlot = nbt.getDouble("SelectedKiSlot");
			AlternativeFunction = nbt.getBoolean("AlternativeFunction");
			KiDrain = nbt.getDouble("KiDrain");
			ChargingKiAttack = nbt.getBoolean("ChargingKiAttack");
			KiAttackSize = nbt.getDouble("KiAttackSize");
			KiAttackTimer = nbt.getDouble("KiAttackTimer");
			KiAttackCharge = nbt.getDouble("KiAttackCharge");
			LaunchKiAttack = nbt.getBoolean("LaunchKiAttack");
			KiAttackCost = nbt.getDouble("KiAttackCost");
			KiAttackDamage = nbt.getDouble("KiAttackDamage");
			OldYawAndPitch = nbt.getBoolean("OldYawAndPitch");
			OldYAW = nbt.getDouble("OldYAW");
			OldPitch = nbt.getDouble("OldPitch");
			KiAttackDuration = nbt.getDouble("KiAttackDuration");
			CurrentKiAttack = nbt.getString("CurrentKiAttack");
			KiAttackHits = nbt.getDouble("KiAttackHits");
			KiSlot2 = nbt.getString("KiSlot2");
			KiSlot3 = nbt.getString("KiSlot3");
			KiSlot4 = nbt.getString("KiSlot4");
			KiSlot5 = nbt.getString("KiSlot5");
			KiSlot6 = nbt.getString("KiSlot6");
			KiSlot7 = nbt.getString("KiSlot7");
			KiSlot8 = nbt.getString("KiSlot8");
			ForwardPressed = nbt.getBoolean("ForwardPressed");
			Flying = nbt.getBoolean("Flying");
			RightPressed = nbt.getBoolean("RightPressed");
			LeftPressed = nbt.getBoolean("LeftPressed");
			BackwardPressed = nbt.getBoolean("BackwardPressed");
			ReleasePower = nbt.getBoolean("ReleasePower");
			PowerReleaseTimer = nbt.getDouble("PowerReleaseTimer");
			PowerPoleScale = nbt.getDouble("PowerPoleScale");
			FormPath = nbt.getString("FormPath");
			RacialFormLevel = nbt.getDouble("RacialFormLevel");
			FormLike = nbt.getString("FormLike");
			KaiokenOwned = nbt.getDouble("KaiokenOwned");
			KaiokenLevel = nbt.getDouble("KaiokenLevel");
			HealthDrain = nbt.getDouble("HealthDrain");
			AuraTexture = nbt.getString("AuraTexture");
			AuraTextureD = nbt.getString("AuraTextureD");
			Blocking = nbt.getBoolean("Blocking");
			BlockingTimer = nbt.getDouble("BlockingTimer");
			SelectSkill = nbt.getString("SelectSkill");
			JumpLevel = nbt.getDouble("JumpLevel");
			PotentialReleaseLevel = nbt.getDouble("PotentialReleaseLevel");
			FlyLevel = nbt.getDouble("FlyLevel");
			KiSenseLevel = nbt.getDouble("KiSenseLevel");
			KiSenseTarget = nbt.getString("KiSenseTarget");
			KiSenseSingle = nbt.getBoolean("KiSenseSingle");
			Endurance = nbt.getDouble("Endurance");
			MaxEndurance = nbt.getDouble("MaxEndurance");
			PowerLevel = nbt.getDouble("PowerLevel");
			SenzuTimeout = nbt.getDouble("SenzuTimeout");
			FlyingNimbus = nbt.getBoolean("FlyingNimbus");
			WaterDrank = nbt.getBoolean("WaterDrank");
			RiddingNimbus = nbt.getBoolean("RiddingNimbus");
			SpacePod = nbt.getBoolean("SpacePod");
			Age = nbt.getDouble("Age");
			Height = nbt.getDouble("Height");
			Width = nbt.getDouble("Width");
			JumpTimer = nbt.getDouble("JumpTimer");
			CanJump = nbt.getBoolean("CanJump");
			KiAttackRoll = nbt.getDouble("KiAttackRoll");
			StoryModeProgress = nbt.getString("StoryModeProgress");
			SelectedKiMove = nbt.getString("SelectedKiMove");
			Aging = nbt.getDouble("Aging");
			LastAgeTime = nbt.getDouble("LastAgeTime");
			DBDistance = nbt.getString("DBDistance");
			SelectedDB = nbt.getDouble("SelectedDB");
			StoryGUI = nbt.getDouble("StoryGUI");
			GKi = nbt.getBoolean("GKi");
			Legendary = nbt.getBoolean("Legendary");
			MaxRacialLevel = nbt.getDouble("MaxRacialLevel");
			RacialTPCost = nbt.getDouble("RacialTPCost");
			SaibamanDefeated = nbt.getDouble("SaibamanDefeated");
			FriezaSoldierDefeated = nbt.getDouble("FriezaSoldierDefeated");
			CurrentInvite = nbt.getString("CurrentInvite");
			Member1 = nbt.getString("Member1");
			Member2 = nbt.getString("Member2");
			Member3 = nbt.getString("Member3");
			Member4 = nbt.getString("Member4");
			Member5 = nbt.getString("Member5");
			Group = nbt.getBoolean("Group");
			HealthDrainTimer = nbt.getDouble("HealthDrainTimer");
			DefeatedFriezaSoldiers2 = nbt.getDouble("DefeatedFriezaSoldiers2");
			TimeChamberTimeLimit = nbt.getDouble("TimeChamberTimeLimit");
			TimeChamberLocked = nbt.getBoolean("TimeChamberLocked");
			DefeatedCellJr = nbt.getDouble("DefeatedCellJr");
			EarthToHTCTimeLimit = nbt.getDouble("EarthToHTCTimeLimit");
			InstantTransmissionSkill = nbt.getBoolean("InstantTransmissionSkill");
			InstantTransmission = nbt.getBoolean("InstantTransmission");
			BabidiMagic = nbt.getBoolean("BabidiMagic");
			KOed = nbt.getBoolean("KOed");
			KOTimer = nbt.getDouble("KOTimer");
			MemberName1 = nbt.getString("MemberName1");
			MemberName2 = nbt.getString("MemberName2");
			MemberName3 = nbt.getString("MemberName3");
			MemberName4 = nbt.getString("MemberName4");
			MemberName5 = nbt.getString("MemberName5");
			FriendlyFire = nbt.getString("FriendlyFire");
			this.FormMasteries = nbt.get("FormMasteries") instanceof ListTag FormMasteries ? FormMasteries : new ListTag();
			RaceAbility = nbt.getBoolean("RaceAbility");
			ZenkaiLevel = nbt.getDouble("ZenkaiLevel");
			Headwear = nbt.getString("Headwear");
			ScouterMode = nbt.getDouble("ScouterMode");
			ScouterLocked = nbt.getBoolean("ScouterLocked");
			ScouterEntity = nbt.getString("ScouterEntity");
			ScouterDistance = nbt.getDouble("ScouterDistance");
			ScouterPL = nbt.getDouble("ScouterPL");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.MaxHealth = message.data.MaxHealth;
					variables.MaxKi = message.data.MaxKi;
					variables.Ki = message.data.Ki;
					variables.Race = message.data.Race;
					variables.Alignment = message.data.Alignment;
					variables.FightingClass = message.data.FightingClass;
					variables.AlignmentPoints = message.data.AlignmentPoints;
					variables.Skin1 = message.data.Skin1;
					variables.Skin2 = message.data.Skin2;
					variables.Skin3 = message.data.Skin3;
					variables.Skin4 = message.data.Skin4;
					variables.EyesColor = message.data.EyesColor;
					variables.HairColor = message.data.HairColor;
					variables.EyesType = message.data.EyesType;
					variables.HairStyle = message.data.HairStyle;
					variables.HairID = message.data.HairID;
					variables.HairStyleID = message.data.HairStyleID;
					variables.EyesTypeID = message.data.EyesTypeID;
					variables.EyesColorID = message.data.EyesColorID;
					variables.Skin1ID = message.data.Skin1ID;
					variables.Skin2ID = message.data.Skin2ID;
					variables.Skin3ID = message.data.Skin3ID;
					variables.Skin4ID = message.data.Skin4ID;
					variables.BodyType = message.data.BodyType;
					variables.CreationUnfinished = message.data.CreationUnfinished;
					variables.Mouth = message.data.Mouth;
					variables.EyeBrows = message.data.EyeBrows;
					variables.Form = message.data.Form;
					variables.MouthID = message.data.MouthID;
					variables.Body = message.data.Body;
					variables.Spirit = message.data.Spirit;
					variables.Agility = message.data.Agility;
					variables.Strength = message.data.Strength;
					variables.Defense = message.data.Defense;
					variables.MaxStamina = message.data.MaxStamina;
					variables.Speed = message.data.Speed;
					variables.TrainingPoints = message.data.TrainingPoints;
					variables.NeededTrainingPoints = message.data.NeededTrainingPoints;
					variables.SubForm = message.data.SubForm;
					variables.FormBoost = message.data.FormBoost;
					variables.SubFormBoost = message.data.SubFormBoost;
					variables.TotalFormBoost = message.data.TotalFormBoost;
					variables.MeleeDamage = message.data.MeleeDamage;
					variables.ReleasedPower = message.data.ReleasedPower;
					variables.Focus = message.data.Focus;
					variables.KiDamage = message.data.KiDamage;
					variables.Resilience = message.data.Resilience;
					variables.Stamina = message.data.Stamina;
					variables.KiCharge = message.data.KiCharge;
					variables.AttackCount = message.data.AttackCount;
					variables.TransformationTimer = message.data.TransformationTimer;
					variables.Transforming = message.data.Transforming;
					variables.TPCost = message.data.TPCost;
					variables.StatIncrease = message.data.StatIncrease;
					variables.Scale = message.data.Scale;
					variables.Tail = message.data.Tail;
					variables.Dead = message.data.Dead;
					variables.TailColorID = message.data.TailColorID;
					variables.StaminaPause = message.data.StaminaPause;
					variables.StaminaTimer = message.data.StaminaTimer;
					variables.SpacePressed = message.data.SpacePressed;
					variables.Allocations = message.data.Allocations;
					variables.ShootKiBlast = message.data.ShootKiBlast;
					variables.KiBlastTimer = message.data.KiBlastTimer;
					variables.SelectedKiAttack = message.data.SelectedKiAttack;
					variables.KiSlot1 = message.data.KiSlot1;
					variables.Aura = message.data.Aura;
					variables.SelectedKiSlot = message.data.SelectedKiSlot;
					variables.AlternativeFunction = message.data.AlternativeFunction;
					variables.KiDrain = message.data.KiDrain;
					variables.ChargingKiAttack = message.data.ChargingKiAttack;
					variables.KiAttackSize = message.data.KiAttackSize;
					variables.KiAttackTimer = message.data.KiAttackTimer;
					variables.KiAttackCharge = message.data.KiAttackCharge;
					variables.LaunchKiAttack = message.data.LaunchKiAttack;
					variables.KiAttackCost = message.data.KiAttackCost;
					variables.KiAttackDamage = message.data.KiAttackDamage;
					variables.OldYawAndPitch = message.data.OldYawAndPitch;
					variables.OldYAW = message.data.OldYAW;
					variables.OldPitch = message.data.OldPitch;
					variables.KiAttackDuration = message.data.KiAttackDuration;
					variables.CurrentKiAttack = message.data.CurrentKiAttack;
					variables.KiAttackHits = message.data.KiAttackHits;
					variables.KiSlot2 = message.data.KiSlot2;
					variables.KiSlot3 = message.data.KiSlot3;
					variables.KiSlot4 = message.data.KiSlot4;
					variables.KiSlot5 = message.data.KiSlot5;
					variables.KiSlot6 = message.data.KiSlot6;
					variables.KiSlot7 = message.data.KiSlot7;
					variables.KiSlot8 = message.data.KiSlot8;
					variables.ForwardPressed = message.data.ForwardPressed;
					variables.Flying = message.data.Flying;
					variables.RightPressed = message.data.RightPressed;
					variables.LeftPressed = message.data.LeftPressed;
					variables.BackwardPressed = message.data.BackwardPressed;
					variables.ReleasePower = message.data.ReleasePower;
					variables.PowerReleaseTimer = message.data.PowerReleaseTimer;
					variables.PowerPoleScale = message.data.PowerPoleScale;
					variables.FormPath = message.data.FormPath;
					variables.RacialFormLevel = message.data.RacialFormLevel;
					variables.FormLike = message.data.FormLike;
					variables.KaiokenOwned = message.data.KaiokenOwned;
					variables.KaiokenLevel = message.data.KaiokenLevel;
					variables.HealthDrain = message.data.HealthDrain;
					variables.AuraTexture = message.data.AuraTexture;
					variables.AuraTextureD = message.data.AuraTextureD;
					variables.Blocking = message.data.Blocking;
					variables.BlockingTimer = message.data.BlockingTimer;
					variables.SelectSkill = message.data.SelectSkill;
					variables.JumpLevel = message.data.JumpLevel;
					variables.PotentialReleaseLevel = message.data.PotentialReleaseLevel;
					variables.FlyLevel = message.data.FlyLevel;
					variables.KiSenseLevel = message.data.KiSenseLevel;
					variables.KiSenseTarget = message.data.KiSenseTarget;
					variables.KiSenseSingle = message.data.KiSenseSingle;
					variables.Endurance = message.data.Endurance;
					variables.MaxEndurance = message.data.MaxEndurance;
					variables.PowerLevel = message.data.PowerLevel;
					variables.SenzuTimeout = message.data.SenzuTimeout;
					variables.FlyingNimbus = message.data.FlyingNimbus;
					variables.WaterDrank = message.data.WaterDrank;
					variables.RiddingNimbus = message.data.RiddingNimbus;
					variables.SpacePod = message.data.SpacePod;
					variables.Age = message.data.Age;
					variables.Height = message.data.Height;
					variables.Width = message.data.Width;
					variables.JumpTimer = message.data.JumpTimer;
					variables.CanJump = message.data.CanJump;
					variables.KiAttackRoll = message.data.KiAttackRoll;
					variables.StoryModeProgress = message.data.StoryModeProgress;
					variables.SelectedKiMove = message.data.SelectedKiMove;
					variables.Aging = message.data.Aging;
					variables.LastAgeTime = message.data.LastAgeTime;
					variables.DBDistance = message.data.DBDistance;
					variables.SelectedDB = message.data.SelectedDB;
					variables.StoryGUI = message.data.StoryGUI;
					variables.GKi = message.data.GKi;
					variables.Legendary = message.data.Legendary;
					variables.MaxRacialLevel = message.data.MaxRacialLevel;
					variables.RacialTPCost = message.data.RacialTPCost;
					variables.SaibamanDefeated = message.data.SaibamanDefeated;
					variables.FriezaSoldierDefeated = message.data.FriezaSoldierDefeated;
					variables.CurrentInvite = message.data.CurrentInvite;
					variables.Member1 = message.data.Member1;
					variables.Member2 = message.data.Member2;
					variables.Member3 = message.data.Member3;
					variables.Member4 = message.data.Member4;
					variables.Member5 = message.data.Member5;
					variables.Group = message.data.Group;
					variables.HealthDrainTimer = message.data.HealthDrainTimer;
					variables.DefeatedFriezaSoldiers2 = message.data.DefeatedFriezaSoldiers2;
					variables.TimeChamberTimeLimit = message.data.TimeChamberTimeLimit;
					variables.TimeChamberLocked = message.data.TimeChamberLocked;
					variables.DefeatedCellJr = message.data.DefeatedCellJr;
					variables.EarthToHTCTimeLimit = message.data.EarthToHTCTimeLimit;
					variables.InstantTransmissionSkill = message.data.InstantTransmissionSkill;
					variables.InstantTransmission = message.data.InstantTransmission;
					variables.BabidiMagic = message.data.BabidiMagic;
					variables.KOed = message.data.KOed;
					variables.KOTimer = message.data.KOTimer;
					variables.MemberName1 = message.data.MemberName1;
					variables.MemberName2 = message.data.MemberName2;
					variables.MemberName3 = message.data.MemberName3;
					variables.MemberName4 = message.data.MemberName4;
					variables.MemberName5 = message.data.MemberName5;
					variables.FriendlyFire = message.data.FriendlyFire;
					variables.FormMasteries = message.data.FormMasteries;
					variables.RaceAbility = message.data.RaceAbility;
					variables.ZenkaiLevel = message.data.ZenkaiLevel;
					variables.Headwear = message.data.Headwear;
					variables.ScouterMode = message.data.ScouterMode;
					variables.ScouterLocked = message.data.ScouterLocked;
					variables.ScouterEntity = message.data.ScouterEntity;
					variables.ScouterDistance = message.data.ScouterDistance;
					variables.ScouterPL = message.data.ScouterPL;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
