
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dbm.DbmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbmModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DbmMod.MODID);
	public static final RegistryObject<CreativeModeTab> DBM_BLOCKS = REGISTRY.register("dbm_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dbm.dbm_blocks")).icon(() -> new ItemStack(DbmModBlocks.NAMEK_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DbmModBlocks.NAMEK_GRASS_BLOCK.get().asItem());
				tabData.accept(DbmModBlocks.NAMEK_DIRT.get().asItem());
				tabData.accept(DbmModBlocks.AJISA_LOG.get().asItem());
				tabData.accept(DbmModBlocks.AJISA_LEAVES.get().asItem());
				tabData.accept(DbmModBlocks.AJISA_PLANKS.get().asItem());
				tabData.accept(DbmModBlocks.NAMEK_GRASS.get().asItem());
				tabData.accept(DbmModBlocks.KAIOSHINKAI_GRASS_BLOCK.get().asItem());
				tabData.accept(DbmModBlocks.KAIOSHINKAI_DIRT.get().asItem());
				tabData.accept(DbmModBlocks.KAIOSHINKAI_LEAVES.get().asItem());
				tabData.accept(DbmModBlocks.KAIOSHINKAI_LOG.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DBM_ITEMS = REGISTRY.register("dbm_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dbm.dbm_items")).icon(() -> new ItemStack(DbmModItems.DRAGON_RADAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DbmModItems.SENZU_BEAN.get());
				tabData.accept(DbmModItems.DRAGON_RADAR.get());
				tabData.accept(DbmModItems.POWER_POLE.get());
				tabData.accept(DbmModItems.PUNCHING_BAG_ITEM.get());
				tabData.accept(DbmModItems.RAW_DINOSAUR.get());
				tabData.accept(DbmModItems.COOKED_DINOSAUR.get());
				tabData.accept(DbmModItems.DRAGON_BALL_1.get());
				tabData.accept(DbmModItems.DRAGON_BALL_2.get());
				tabData.accept(DbmModItems.DRAGON_BALL_3.get());
				tabData.accept(DbmModItems.DRAGON_BALL_4.get());
				tabData.accept(DbmModItems.DRAGON_BALL_5.get());
				tabData.accept(DbmModItems.DRAGON_BALL_6.get());
				tabData.accept(DbmModItems.DRAGON_BALL_7.get());
				tabData.accept(DbmModItems.SPACE_POD.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_1.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_2.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_3.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_4.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_5.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_6.get());
				tabData.accept(DbmModItems.NAMEK_DRAGON_BALL_7.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BUILDING_BLOCKS = REGISTRY.register("building_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dbm.building_blocks")).icon(() -> new ItemStack(DbmModBlocks.BUILDING_BLOCK_WHITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_TILES.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_SLAB_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_SLAB_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_WHITE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_LIGHT_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_DARK_GRAY.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_BROWN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_CYAN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_SKY_BLUE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_DARK_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_GREEN.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_LIME.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_YELLOW.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_ORANGE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_RED.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_PURPLE.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_PINK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_STAIRS_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_STAIRS_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_FENCE_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BRICKS_FENCE_INVERTED_BLACK.get().asItem());
				tabData.accept(DbmModBlocks.BUILDING_BLOCK_TILES_2.get().asItem());
				tabData.accept(DbmModBlocks.BLUE_DOOR.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> CLOTHES = REGISTRY.register("clothes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dbm.clothes")).icon(() -> new ItemStack(DbmModItems.TURTLE_GI_KING_KAI_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DbmModItems.TURTLE_GI_KING_KAI_CHESTPLATE.get());
				tabData.accept(DbmModItems.TURTLE_GI_KING_KAI_LEGGINGS.get());
				tabData.accept(DbmModItems.BATTLE_ARMOR_CHESTPLATE.get());
				tabData.accept(DbmModItems.BATTLE_ARMOR_LEGGINGS.get());
				tabData.accept(DbmModItems.TURTLE_GI_CHESTPLATE.get());
				tabData.accept(DbmModItems.TURTLE_GI_LEGGINGS.get());
				tabData.accept(DbmModItems.OLD_SCHOOL_TURTLE_GI_CHESTPLATE.get());
				tabData.accept(DbmModItems.OLD_SCHOOL_TURTLE_GI_LEGGINGS.get());
				tabData.accept(DbmModItems.PURPLE_GI_CHESTPLATE.get());
				tabData.accept(DbmModItems.PURPLE_GI_LEGGINGS.get());
				tabData.accept(DbmModItems.ROYAL_BLUE_FIT_CHESTPLATE.get());
				tabData.accept(DbmModItems.ROYAL_BLUE_FIT_LEGGINGS.get());
				tabData.accept(DbmModItems.RIKUDO_GI_CHESTPLATE.get());
				tabData.accept(DbmModItems.RIKUDO_GI_LEGGINGS.get());
				tabData.accept(DbmModItems.FUTURE_FIT_CHESTPLATE.get());
				tabData.accept(DbmModItems.FUTURE_FIT_LEGGINGS.get());
				tabData.accept(DbmModItems.BLACK_WHITE_FIT_CHESTPLATE.get());
				tabData.accept(DbmModItems.BLACK_WHITE_FIT_LEGGINGS.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(DbmModItems.SABERTOOTH_SPAWN_EGG.get());
			tabData.accept(DbmModItems.BEAR_THIEF_SPAWN_EGG.get());
			tabData.accept(DbmModItems.DINOSAUR_1_SPAWN_EGG.get());
			tabData.accept(DbmModItems.NAMEKIAN_SPAWN_EGG.get());
			tabData.accept(DbmModItems.YARDRATTAN_SPAWN_EGG.get());

		}
	}
}
