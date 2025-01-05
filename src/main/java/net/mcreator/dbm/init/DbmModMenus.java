
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.dbm.world.inventory.WelcomeGUIMenu;
import net.mcreator.dbm.world.inventory.StatisticGUIMenu;
import net.mcreator.dbm.world.inventory.SkillsGUIMenu;
import net.mcreator.dbm.world.inventory.SaiyanFormsGUIMenu;
import net.mcreator.dbm.world.inventory.NorthKaioGUIMenu;
import net.mcreator.dbm.world.inventory.NorthKaioGUI2Menu;
import net.mcreator.dbm.world.inventory.KorinGUIMenu;
import net.mcreator.dbm.world.inventory.KorinDrinkGUIMenu;
import net.mcreator.dbm.world.inventory.FinishGUIMenu;
import net.mcreator.dbm.world.inventory.EnmaGUIMenu;
import net.mcreator.dbm.world.inventory.DendeGUIMenu;
import net.mcreator.dbm.world.inventory.CharacterCreationGUIMenu;
import net.mcreator.dbm.world.inventory.CharacterCreationGUI2Menu;
import net.mcreator.dbm.DbmMod;

public class DbmModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DbmMod.MODID);
	public static final RegistryObject<MenuType<WelcomeGUIMenu>> WELCOME_GUI = REGISTRY.register("welcome_gui", () -> IForgeMenuType.create(WelcomeGUIMenu::new));
	public static final RegistryObject<MenuType<CharacterCreationGUIMenu>> CHARACTER_CREATION_GUI = REGISTRY.register("character_creation_gui", () -> IForgeMenuType.create(CharacterCreationGUIMenu::new));
	public static final RegistryObject<MenuType<CharacterCreationGUI2Menu>> CHARACTER_CREATION_GUI_2 = REGISTRY.register("character_creation_gui_2", () -> IForgeMenuType.create(CharacterCreationGUI2Menu::new));
	public static final RegistryObject<MenuType<FinishGUIMenu>> FINISH_GUI = REGISTRY.register("finish_gui", () -> IForgeMenuType.create(FinishGUIMenu::new));
	public static final RegistryObject<MenuType<StatisticGUIMenu>> STATISTIC_GUI = REGISTRY.register("statistic_gui", () -> IForgeMenuType.create(StatisticGUIMenu::new));
	public static final RegistryObject<MenuType<SkillsGUIMenu>> SKILLS_GUI = REGISTRY.register("skills_gui", () -> IForgeMenuType.create(SkillsGUIMenu::new));
	public static final RegistryObject<MenuType<EnmaGUIMenu>> ENMA_GUI = REGISTRY.register("enma_gui", () -> IForgeMenuType.create(EnmaGUIMenu::new));
	public static final RegistryObject<MenuType<NorthKaioGUIMenu>> NORTH_KAIO_GUI = REGISTRY.register("north_kaio_gui", () -> IForgeMenuType.create(NorthKaioGUIMenu::new));
	public static final RegistryObject<MenuType<SaiyanFormsGUIMenu>> SAIYAN_FORMS_GUI = REGISTRY.register("saiyan_forms_gui", () -> IForgeMenuType.create(SaiyanFormsGUIMenu::new));
	public static final RegistryObject<MenuType<NorthKaioGUI2Menu>> NORTH_KAIO_GUI_2 = REGISTRY.register("north_kaio_gui_2", () -> IForgeMenuType.create(NorthKaioGUI2Menu::new));
	public static final RegistryObject<MenuType<KorinGUIMenu>> KORIN_GUI = REGISTRY.register("korin_gui", () -> IForgeMenuType.create(KorinGUIMenu::new));
	public static final RegistryObject<MenuType<DendeGUIMenu>> DENDE_GUI = REGISTRY.register("dende_gui", () -> IForgeMenuType.create(DendeGUIMenu::new));
	public static final RegistryObject<MenuType<KorinDrinkGUIMenu>> KORIN_DRINK_GUI = REGISTRY.register("korin_drink_gui", () -> IForgeMenuType.create(KorinDrinkGUIMenu::new));
}
