
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.dbm.client.gui.WelcomeGUIScreen;
import net.mcreator.dbm.client.gui.StoryGUIScreen;
import net.mcreator.dbm.client.gui.StoryGUI6Screen;
import net.mcreator.dbm.client.gui.StoryGUI5Screen;
import net.mcreator.dbm.client.gui.StoryGUI4Screen;
import net.mcreator.dbm.client.gui.StoryGUI3Screen;
import net.mcreator.dbm.client.gui.StoryGUI2Screen;
import net.mcreator.dbm.client.gui.StoryGUI1Screen;
import net.mcreator.dbm.client.gui.StatisticGUIScreen;
import net.mcreator.dbm.client.gui.SkillsGUIScreen;
import net.mcreator.dbm.client.gui.ShenronGUIScreen;
import net.mcreator.dbm.client.gui.ShenronAgeGUIScreen;
import net.mcreator.dbm.client.gui.SaiyanFormsGUIScreen;
import net.mcreator.dbm.client.gui.PiccoloGUIScreen;
import net.mcreator.dbm.client.gui.PiccoloGUI2Screen;
import net.mcreator.dbm.client.gui.NorthKaioGUIScreen;
import net.mcreator.dbm.client.gui.NorthKaioGUI2Screen;
import net.mcreator.dbm.client.gui.KorinGUIScreen;
import net.mcreator.dbm.client.gui.KorinDrinkGUIScreen;
import net.mcreator.dbm.client.gui.KiAttacksGUIScreen;
import net.mcreator.dbm.client.gui.KameSenninGUIScreen;
import net.mcreator.dbm.client.gui.KameSenninGUI2Screen;
import net.mcreator.dbm.client.gui.HalfSaiyanFormsGUIScreen;
import net.mcreator.dbm.client.gui.FinishGUIScreen;
import net.mcreator.dbm.client.gui.EnmaGUIScreen;
import net.mcreator.dbm.client.gui.DendeGUIScreen;
import net.mcreator.dbm.client.gui.CharacterCreationGUIScreen;
import net.mcreator.dbm.client.gui.CharacterCreationGUI2Screen;
import net.mcreator.dbm.client.gui.ArcosianFormsGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DbmModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DbmModMenus.WELCOME_GUI.get(), WelcomeGUIScreen::new);
			MenuScreens.register(DbmModMenus.CHARACTER_CREATION_GUI.get(), CharacterCreationGUIScreen::new);
			MenuScreens.register(DbmModMenus.CHARACTER_CREATION_GUI_2.get(), CharacterCreationGUI2Screen::new);
			MenuScreens.register(DbmModMenus.FINISH_GUI.get(), FinishGUIScreen::new);
			MenuScreens.register(DbmModMenus.STATISTIC_GUI.get(), StatisticGUIScreen::new);
			MenuScreens.register(DbmModMenus.SKILLS_GUI.get(), SkillsGUIScreen::new);
			MenuScreens.register(DbmModMenus.ENMA_GUI.get(), EnmaGUIScreen::new);
			MenuScreens.register(DbmModMenus.NORTH_KAIO_GUI.get(), NorthKaioGUIScreen::new);
			MenuScreens.register(DbmModMenus.SAIYAN_FORMS_GUI.get(), SaiyanFormsGUIScreen::new);
			MenuScreens.register(DbmModMenus.NORTH_KAIO_GUI_2.get(), NorthKaioGUI2Screen::new);
			MenuScreens.register(DbmModMenus.KORIN_GUI.get(), KorinGUIScreen::new);
			MenuScreens.register(DbmModMenus.DENDE_GUI.get(), DendeGUIScreen::new);
			MenuScreens.register(DbmModMenus.KORIN_DRINK_GUI.get(), KorinDrinkGUIScreen::new);
			MenuScreens.register(DbmModMenus.KAME_SENNIN_GUI.get(), KameSenninGUIScreen::new);
			MenuScreens.register(DbmModMenus.KAME_SENNIN_GUI_2.get(), KameSenninGUI2Screen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI.get(), StoryGUIScreen::new);
			MenuScreens.register(DbmModMenus.KI_ATTACKS_GUI.get(), KiAttacksGUIScreen::new);
			MenuScreens.register(DbmModMenus.SHENRON_GUI.get(), ShenronGUIScreen::new);
			MenuScreens.register(DbmModMenus.SHENRON_AGE_GUI.get(), ShenronAgeGUIScreen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_1.get(), StoryGUI1Screen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_2.get(), StoryGUI2Screen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_3.get(), StoryGUI3Screen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_4.get(), StoryGUI4Screen::new);
			MenuScreens.register(DbmModMenus.ARCOSIAN_FORMS_GUI.get(), ArcosianFormsGUIScreen::new);
			MenuScreens.register(DbmModMenus.HALF_SAIYAN_FORMS_GUI.get(), HalfSaiyanFormsGUIScreen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_5.get(), StoryGUI5Screen::new);
			MenuScreens.register(DbmModMenus.STORY_GUI_6.get(), StoryGUI6Screen::new);
			MenuScreens.register(DbmModMenus.PICCOLO_GUI.get(), PiccoloGUIScreen::new);
			MenuScreens.register(DbmModMenus.PICCOLO_GUI_2.get(), PiccoloGUI2Screen::new);
		});
	}
}
