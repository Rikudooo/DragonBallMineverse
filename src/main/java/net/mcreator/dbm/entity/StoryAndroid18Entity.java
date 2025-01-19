
package net.mcreator.dbm.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.procedures.StoryMobFlyConditionProcedure;
import net.mcreator.dbm.procedures.BasicAttackPatternProcedure;
import net.mcreator.dbm.procedures.Android18DefeatedProcedure;
import net.mcreator.dbm.init.DbmModEntities;

public class StoryAndroid18Entity extends Monster {
	public static final EntityDataAccessor<String> DATA_SelectedKiAttack = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_KiAttackSize = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_OldYAW = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_OldPITCH = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_KiAttackHits = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Scale = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Ki = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_KiCharging = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> DATA_Form = SynchedEntityData.defineId(StoryAndroid18Entity.class, EntityDataSerializers.STRING);

	public StoryAndroid18Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(DbmModEntities.STORY_ANDROID_18.get(), world);
	}

	public StoryAndroid18Entity(EntityType<StoryAndroid18Entity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_SelectedKiAttack, "None");
		this.entityData.define(DATA_KiAttackSize, 0);
		this.entityData.define(DATA_OldYAW, 0);
		this.entityData.define(DATA_OldPITCH, 0);
		this.entityData.define(DATA_KiAttackHits, 0);
		this.entityData.define(DATA_Scale, 1);
		this.entityData.define(DATA_Ki, 100);
		this.entityData.define(DATA_KiCharging, false);
		this.entityData.define(DATA_Form, "Base");
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.2, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = StoryAndroid18Entity.this.getRandom();
				double dir_x = StoryAndroid18Entity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = StoryAndroid18Entity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = StoryAndroid18Entity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = StoryAndroid18Entity.this.getX();
				double y = StoryAndroid18Entity.this.getY();
				double z = StoryAndroid18Entity.this.getZ();
				Entity entity = StoryAndroid18Entity.this;
				Level world = StoryAndroid18Entity.this.level();
				return super.canUse() && StoryMobFlyConditionProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		Android18DefeatedProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("DataSelectedKiAttack", this.entityData.get(DATA_SelectedKiAttack));
		compound.putInt("DataKiAttackSize", this.entityData.get(DATA_KiAttackSize));
		compound.putInt("DataOldYAW", this.entityData.get(DATA_OldYAW));
		compound.putInt("DataOldPITCH", this.entityData.get(DATA_OldPITCH));
		compound.putInt("DataKiAttackHits", this.entityData.get(DATA_KiAttackHits));
		compound.putInt("DataScale", this.entityData.get(DATA_Scale));
		compound.putInt("DataKi", this.entityData.get(DATA_Ki));
		compound.putBoolean("DataKiCharging", this.entityData.get(DATA_KiCharging));
		compound.putString("DataForm", this.entityData.get(DATA_Form));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataSelectedKiAttack"))
			this.entityData.set(DATA_SelectedKiAttack, compound.getString("DataSelectedKiAttack"));
		if (compound.contains("DataKiAttackSize"))
			this.entityData.set(DATA_KiAttackSize, compound.getInt("DataKiAttackSize"));
		if (compound.contains("DataOldYAW"))
			this.entityData.set(DATA_OldYAW, compound.getInt("DataOldYAW"));
		if (compound.contains("DataOldPITCH"))
			this.entityData.set(DATA_OldPITCH, compound.getInt("DataOldPITCH"));
		if (compound.contains("DataKiAttackHits"))
			this.entityData.set(DATA_KiAttackHits, compound.getInt("DataKiAttackHits"));
		if (compound.contains("DataScale"))
			this.entityData.set(DATA_Scale, compound.getInt("DataScale"));
		if (compound.contains("DataKi"))
			this.entityData.set(DATA_Ki, compound.getInt("DataKi"));
		if (compound.contains("DataKiCharging"))
			this.entityData.set(DATA_KiCharging, compound.getBoolean("DataKiCharging"));
		if (compound.contains("DataForm"))
			this.entityData.set(DATA_Form, compound.getString("DataForm"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BasicAttackPatternProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 700);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 700);
		builder = builder.add(Attributes.FOLLOW_RANGE, 128);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}
