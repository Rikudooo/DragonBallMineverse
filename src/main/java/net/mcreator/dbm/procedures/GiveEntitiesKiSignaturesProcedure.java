package net.mcreator.dbm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveEntitiesKiSignaturesProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("KiSignature") == false) {
			entity.getPersistentData().putDouble("KiSignatureX", Math.round(Mth.nextInt(RandomSource.create(), 0, 255)));
			entity.getPersistentData().putDouble("KiSignatureY", Math.round(Mth.nextInt(RandomSource.create(), 0, 255)));
			entity.getPersistentData().putDouble("KiSignatureZ", Math.round(Mth.nextInt(RandomSource.create(), 0, 255)));
			entity.getPersistentData().putDouble("PowerLevel", (Math.cbrt(Math.pow((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
					* (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity8.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0), 2)) / 2));
			entity.getPersistentData().putBoolean("KiSignature", true);
		}
	}
}
