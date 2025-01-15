
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
import net.mcreator.dbm.world.inventory.StoryGUIMenu;
import net.mcreator.dbm.world.inventory.StoryGUI9Menu;
import net.mcreator.dbm.world.inventory.StoryGUI8Menu;
import net.mcreator.dbm.world.inventory.StoryGUI7Menu;
import net.mcreator.dbm.world.inventory.StoryGUI6Menu;
import net.mcreator.dbm.world.inventory.StoryGUI5Menu;
import net.mcreator.dbm.world.inventory.StoryGUI4Menu;
import net.mcreator.dbm.world.inventory.StoryGUI3Menu;
import net.mcreator.dbm.world.inventory.StoryGUI2Menu;
import net.mcreator.dbm.world.inventory.StoryGUI1Menu;
import net.mcreator.dbm.world.inventory.StoryGUI11Menu;
import net.mcreator.dbm.world.inventory.StoryGUI10Menu;
import net.mcreator.dbm.world.inventory.StatisticGUIMenu;
import net.mcreator.dbm.world.inventory.SkillsGUIMenu;
import net.mcreator.dbm.world.inventory.ShenronGUIMenu;
import net.mcreator.dbm.world.inventory.ShenronAgeGUIMenu;
import net.mcreator.dbm.world.inventory.SaiyanFormsGUIMenu;
import net.mcreator.dbm.world.inventory.PiccoloGUIMenu;
import net.mcreator.dbm.world.inventory.PiccoloGUI2Menu;
import net.mcreator.dbm.world.inventory.NorthKaioGUIMenu;
import net.mcreator.dbm.world.inventory.NorthKaioGUI2Menu;
import net.mcreator.dbm.world.inventory.KorinGUIMenu;
import net.mcreator.dbm.world.inventory.KorinDrinkGUIMenu;
import net.mcreator.dbm.world.inventory.KiAttacksGUIMenu;
import net.mcreator.dbm.world.inventory.KameSenninGUIMenu;
import net.mcreator.dbm.world.inventory.KameSenninGUI2Menu;
import net.mcreator.dbm.world.inventory.HalfSaiyanFormsGUIMenu;
import net.mcreator.dbm.world.inventory.FinishGUIMenu;
import net.mcreator.dbm.world.inventory.EnmaGUIMenu;
import net.mcreator.dbm.world.inventory.DendeGUIMenu;
import net.mcreator.dbm.world.inventory.CharacterCreationGUIMenu;
import net.mcreator.dbm.world.inventory.CharacterCreationGUI2Menu;
import net.mcreator.dbm.world.inventory.ArcosianFormsGUIMenu;
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
	public static final RegistryObject<MenuType<KameSenninGUIMenu>> KAME_SENNIN_GUI = REGISTRY.register("kame_sennin_gui", () -> IForgeMenuType.create(KameSenninGUIMenu::new));
	public static final RegistryObject<MenuType<KameSenninGUI2Menu>> KAME_SENNIN_GUI_2 = REGISTRY.register("kame_sennin_gui_2", () -> IForgeMenuType.create(KameSenninGUI2Menu::new));
	public static final RegistryObject<MenuType<StoryGUIMenu>> STORY_GUI = REGISTRY.register("story_gui", () -> IForgeMenuType.create(StoryGUIMenu::new));
	public static final RegistryObject<MenuType<KiAttacksGUIMenu>> KI_ATTACKS_GUI = REGISTRY.register("ki_attacks_gui", () -> IForgeMenuType.create(KiAttacksGUIMenu::new));
	public static final RegistryObject<MenuType<ShenronGUIMenu>> SHENRON_GUI = REGISTRY.register("shenron_gui", () -> IForgeMenuType.create(ShenronGUIMenu::new));
	public static final RegistryObject<MenuType<ShenronAgeGUIMenu>> SHENRON_AGE_GUI = REGISTRY.register("shenron_age_gui", () -> IForgeMenuType.create(ShenronAgeGUIMenu::new));
	public static final RegistryObject<MenuType<StoryGUI1Menu>> STORY_GUI_1 = REGISTRY.register("story_gui_1", () -> IForgeMenuType.create(StoryGUI1Menu::new));
	public static final RegistryObject<MenuType<StoryGUI2Menu>> STORY_GUI_2 = REGISTRY.register("story_gui_2", () -> IForgeMenuType.create(StoryGUI2Menu::new));
	public static final RegistryObject<MenuType<StoryGUI3Menu>> STORY_GUI_3 = REGISTRY.register("story_gui_3", () -> IForgeMenuType.create(StoryGUI3Menu::new));
	public static final RegistryObject<MenuType<StoryGUI4Menu>> STORY_GUI_4 = REGISTRY.register("story_gui_4", () -> IForgeMenuType.create(StoryGUI4Menu::new));
	public static final RegistryObject<MenuType<ArcosianFormsGUIMenu>> ARCOSIAN_FORMS_GUI = REGISTRY.register("arcosian_forms_gui", () -> IForgeMenuType.create(ArcosianFormsGUIMenu::new));
	public static final RegistryObject<MenuType<HalfSaiyanFormsGUIMenu>> HALF_SAIYAN_FORMS_GUI = REGISTRY.register("half_saiyan_forms_gui", () -> IForgeMenuType.create(HalfSaiyanFormsGUIMenu::new));
	public static final RegistryObject<MenuType<StoryGUI5Menu>> STORY_GUI_5 = REGISTRY.register("story_gui_5", () -> IForgeMenuType.create(StoryGUI5Menu::new));
	public static final RegistryObject<MenuType<StoryGUI6Menu>> STORY_GUI_6 = REGISTRY.register("story_gui_6", () -> IForgeMenuType.create(StoryGUI6Menu::new));
	public static final RegistryObject<MenuType<PiccoloGUIMenu>> PICCOLO_GUI = REGISTRY.register("piccolo_gui", () -> IForgeMenuType.create(PiccoloGUIMenu::new));
	public static final RegistryObject<MenuType<PiccoloGUI2Menu>> PICCOLO_GUI_2 = REGISTRY.register("piccolo_gui_2", () -> IForgeMenuType.create(PiccoloGUI2Menu::new));
	public static final RegistryObject<MenuType<StoryGUI7Menu>> STORY_GUI_7 = REGISTRY.register("story_gui_7", () -> IForgeMenuType.create(StoryGUI7Menu::new));
	public static final RegistryObject<MenuType<StoryGUI8Menu>> STORY_GUI_8 = REGISTRY.register("story_gui_8", () -> IForgeMenuType.create(StoryGUI8Menu::new));
	public static final RegistryObject<MenuType<StoryGUI9Menu>> STORY_GUI_9 = REGISTRY.register("story_gui_9", () -> IForgeMenuType.create(StoryGUI9Menu::new));
	public static final RegistryObject<MenuType<StoryGUI10Menu>> STORY_GUI_10 = REGISTRY.register("story_gui_10", () -> IForgeMenuType.create(StoryGUI10Menu::new));
	public static final RegistryObject<MenuType<StoryGUI11Menu>> STORY_GUI_11 = REGISTRY.register("story_gui_11", () -> IForgeMenuType.create(StoryGUI11Menu::new));
}
