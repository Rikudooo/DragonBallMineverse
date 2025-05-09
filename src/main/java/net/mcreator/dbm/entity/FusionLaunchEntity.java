
package net.mcreator.dbm.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.dbm.procedures.FusionProcedure;
import net.mcreator.dbm.procedures.FusionLaunchWhileProjectileFlyingTickProcedure;
import net.mcreator.dbm.init.DbmModEntities;
import net.mcreator.dbm.init.DbmModBlocks;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FusionLaunchEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(DbmModBlocks.INVISIBLE_LIGHT.get());

	public FusionLaunchEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(DbmModEntities.FUSION_LAUNCH.get(), world);
	}

	public FusionLaunchEntity(EntityType<? extends FusionLaunchEntity> type, Level world) {
		super(type, world);
	}

	public FusionLaunchEntity(EntityType<? extends FusionLaunchEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FusionLaunchEntity(EntityType<? extends FusionLaunchEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		FusionProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entity, this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		FusionLaunchWhileProjectileFlyingTickProcedure.execute(this);
		if (this.inGround)
			this.discard();
	}

	public static FusionLaunchEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 5);
	}

	public static FusionLaunchEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1f, 5, 5);
	}

	public static FusionLaunchEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		FusionLaunchEntity entityarrow = new FusionLaunchEntity(DbmModEntities.FUSION_LAUNCH.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static FusionLaunchEntity shoot(LivingEntity entity, LivingEntity target) {
		FusionLaunchEntity entityarrow = new FusionLaunchEntity(DbmModEntities.FUSION_LAUNCH.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
