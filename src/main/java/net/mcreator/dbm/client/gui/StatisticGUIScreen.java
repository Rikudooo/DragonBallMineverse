package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.StatisticGUIMenu;
import net.mcreator.dbm.procedures.TPTextProcedure;
import net.mcreator.dbm.procedures.SubFormTextProcedure;
import net.mcreator.dbm.procedures.StrengthTextProcedure;
import net.mcreator.dbm.procedures.SpeedTextProcedure;
import net.mcreator.dbm.procedures.ReturnFormTextProcedure;
import net.mcreator.dbm.procedures.ResilienceTextProcedure;
import net.mcreator.dbm.procedures.RaceTextProcedure;
import net.mcreator.dbm.procedures.NameTextProcedure;
import net.mcreator.dbm.procedures.MeleeDamageTextProcedure;
import net.mcreator.dbm.procedures.MaxStaminaTextProcedure;
import net.mcreator.dbm.procedures.MaxKiTextProcedure;
import net.mcreator.dbm.procedures.MaxHealthTextProcedure;
import net.mcreator.dbm.procedures.KiPowerTextProcedure;
import net.mcreator.dbm.procedures.KiDamageTextProcedure;
import net.mcreator.dbm.procedures.FormTextProcedure;
import net.mcreator.dbm.procedures.FightingClassTextProcedure;
import net.mcreator.dbm.procedures.DisplayPlayerProcedure;
import net.mcreator.dbm.procedures.DefenseTextProcedure;
import net.mcreator.dbm.procedures.AlignmentTextProcedure;
import net.mcreator.dbm.procedures.AgeTextProcedure;
import net.mcreator.dbm.network.StatisticGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatisticGUIScreen extends AbstractContainerScreen<StatisticGUIMenu> {
	private final static HashMap<String, Object> guistate = StatisticGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_quit;
	ImageButton imagebutton_dbbutton;
	ImageButton imagebutton_dbbutton1;
	ImageButton imagebutton_dbbutton2;
	ImageButton imagebutton_dbbutton3;
	ImageButton imagebutton_dbbutton4;
	ImageButton imagebutton_multiply;
	ImageButton imagebutton_statsicon;
	ImageButton imagebutton_skillicon;
	ImageButton imagebutton_kiattackicon;
	ImageButton imagebutton_storyiconhovered;
	ImageButton imagebutton_formicon;
	ImageButton imagebutton_ultimateformicon;
	ImageButton imagebutton_groupicon;
	ImageButton imagebutton_icon8;
	ImageButton imagebutton_icon9;
	ImageButton imagebutton_icon10;
	ImageButton imagebutton_icon11;
	ImageButton imagebutton_icon12;
	ImageButton imagebutton_icon13;
	ImageButton imagebutton_icon14;

	public StatisticGUIScreen(StatisticGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (DisplayPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 34, 30, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + -15 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -173 && mouseX < leftPos + -149 && mouseY > topPos + -12 && mouseY < topPos + -2)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.statistic_gui.tooltip_body_increase_max_hp_and_stamin"), mouseX, mouseY);
		if (mouseX > leftPos + -173 && mouseX < leftPos + -134 && mouseY > topPos + 6 && mouseY < topPos + 16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.statistic_gui.tooltip_agility_increase_speed_stamina"), mouseX, mouseY);
		if (mouseX > leftPos + -173 && mouseX < leftPos + -127 && mouseY > topPos + 23 && mouseY < topPos + 34)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.statistic_gui.tooltip_strength_increase_melee_damage"), mouseX, mouseY);
		if (mouseX > leftPos + -173 && mouseX < leftPos + -137 && mouseY > topPos + 41 && mouseY < topPos + 52)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.statistic_gui.tooltip_spirit_increase_ki_pool"), mouseX, mouseY);
		if (mouseX > leftPos + -172 && mouseX < leftPos + -144 && mouseY > topPos + 60 && mouseY < topPos + 69)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.statistic_gui.tooltip_focus_increase_ki_damage"), mouseX, mouseY);
		if (mouseX > leftPos + -164 && mouseX < leftPos + -120 && mouseY > topPos + -85 && mouseY < topPos + -75)
			guiGraphics.renderTooltip(font, Component.literal(ReturnFormTextProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui.png"), this.leftPos + -176, this.topPos + -104, 0, 0, 350, 200, 350, 200);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 59, this.topPos + -46, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 95, this.topPos + -46, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 58, this.topPos + 34, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 91, this.topPos + 34, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/currenticon.png"), this.leftPos + -173, this.topPos + 94, 0, 0, 24, 24, 24, 24);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_player_stats"), -172, -101, -16777063, false);
		guiGraphics.drawString(this.font,

				NameTextProcedure.execute(entity), 62, -94, -16777216, false);
		guiGraphics.drawString(this.font,

				AlignmentTextProcedure.execute(entity), 62, -76, -16777216, false);
		guiGraphics.drawString(this.font,

				FightingClassTextProcedure.execute(entity), 62, -67, -16777216, false);
		guiGraphics.drawString(this.font,

				MaxHealthTextProcedure.execute(entity), 62, -31, -16751104, false);
		guiGraphics.drawString(this.font,

				MaxKiTextProcedure.execute(entity), 62, -22, -16737793, false);
		guiGraphics.drawString(this.font,

				RaceTextProcedure.execute(entity), 62, -85, -16777216, false);
		guiGraphics.drawString(this.font,

				MaxStaminaTextProcedure.execute(entity), 62, -13, -10092340, false);
		guiGraphics.drawString(this.font,

				StrengthTextProcedure.execute(entity), 62, -4, -13434880, false);
		guiGraphics.drawString(this.font,

				SpeedTextProcedure.execute(entity), 62, 5, -3355393, false);
		guiGraphics.drawString(this.font,

				DefenseTextProcedure.execute(entity), 62, 14, -6710887, false);
		guiGraphics.drawString(this.font,

				FormTextProcedure.execute(entity), -163, -85, -1, false);
		guiGraphics.drawString(this.font,

				SubFormTextProcedure.execute(entity), -163, -76, -1, false);
		guiGraphics.drawString(this.font,

				TPTextProcedure.execute(entity), -163, -65, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_body"), -172, -13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_agility"), -172, 5, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_strength"), -172, 23, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_spirit"), -172, 41, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.statistic_gui.label_ki_power"), -172, 59, -1, false);
		guiGraphics.drawString(this.font,

				KiPowerTextProcedure.execute(entity), 62, 23, -16763905, false);
		guiGraphics.drawString(this.font,

				MeleeDamageTextProcedure.execute(entity), 62, 41, -52429, false);
		guiGraphics.drawString(this.font,

				KiDamageTextProcedure.execute(entity), 62, 50, -10066177, false);
		guiGraphics.drawString(this.font,

				ResilienceTextProcedure.execute(entity), 62, 59, -3355444, false);
		guiGraphics.drawString(this.font,

				AgeTextProcedure.execute(entity), 62, -58, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_quit = new ImageButton(this.leftPos + 162, this.topPos + -102, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_quit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(0, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_quit", imagebutton_quit);
		this.addRenderableWidget(imagebutton_quit);
		imagebutton_dbbutton = new ImageButton(this.leftPos + -189, this.topPos + -14, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dbbutton.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(1, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dbbutton", imagebutton_dbbutton);
		this.addRenderableWidget(imagebutton_dbbutton);
		imagebutton_dbbutton1 = new ImageButton(this.leftPos + -189, this.topPos + 4, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dbbutton1.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(2, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dbbutton1", imagebutton_dbbutton1);
		this.addRenderableWidget(imagebutton_dbbutton1);
		imagebutton_dbbutton2 = new ImageButton(this.leftPos + -189, this.topPos + 22, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dbbutton2.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(3, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dbbutton2", imagebutton_dbbutton2);
		this.addRenderableWidget(imagebutton_dbbutton2);
		imagebutton_dbbutton3 = new ImageButton(this.leftPos + -189, this.topPos + 40, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dbbutton3.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(4, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dbbutton3", imagebutton_dbbutton3);
		this.addRenderableWidget(imagebutton_dbbutton3);
		imagebutton_dbbutton4 = new ImageButton(this.leftPos + -189, this.topPos + 58, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dbbutton4.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(5, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dbbutton4", imagebutton_dbbutton4);
		this.addRenderableWidget(imagebutton_dbbutton4);
		imagebutton_multiply = new ImageButton(this.leftPos + -188, this.topPos + -66, 13, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_multiply.png"), 13, 26, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(6, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_multiply", imagebutton_multiply);
		this.addRenderableWidget(imagebutton_multiply);
		imagebutton_statsicon = new ImageButton(this.leftPos + -171, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_statsicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(7, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statsicon", imagebutton_statsicon);
		this.addRenderableWidget(imagebutton_statsicon);
		imagebutton_skillicon = new ImageButton(this.leftPos + -146, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_skillicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(8, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillicon", imagebutton_skillicon);
		this.addRenderableWidget(imagebutton_skillicon);
		imagebutton_kiattackicon = new ImageButton(this.leftPos + -121, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kiattackicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(9, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiattackicon", imagebutton_kiattackicon);
		this.addRenderableWidget(imagebutton_kiattackicon);
		imagebutton_storyiconhovered = new ImageButton(this.leftPos + -46, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_storyiconhovered.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(10, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storyiconhovered", imagebutton_storyiconhovered);
		this.addRenderableWidget(imagebutton_storyiconhovered);
		imagebutton_formicon = new ImageButton(this.leftPos + -96, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_formicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(11, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_formicon", imagebutton_formicon);
		this.addRenderableWidget(imagebutton_formicon);
		imagebutton_ultimateformicon = new ImageButton(this.leftPos + -71, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_ultimateformicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(12, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ultimateformicon", imagebutton_ultimateformicon);
		this.addRenderableWidget(imagebutton_ultimateformicon);
		imagebutton_groupicon = new ImageButton(this.leftPos + -21, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_groupicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(13, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_groupicon", imagebutton_groupicon);
		this.addRenderableWidget(imagebutton_groupicon);
		imagebutton_icon8 = new ImageButton(this.leftPos + 4, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon8.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(14, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon8", imagebutton_icon8);
		this.addRenderableWidget(imagebutton_icon8);
		imagebutton_icon9 = new ImageButton(this.leftPos + 29, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon9.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(15, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon9", imagebutton_icon9);
		this.addRenderableWidget(imagebutton_icon9);
		imagebutton_icon10 = new ImageButton(this.leftPos + 54, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon10.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(16, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon10", imagebutton_icon10);
		this.addRenderableWidget(imagebutton_icon10);
		imagebutton_icon11 = new ImageButton(this.leftPos + 79, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon11.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(17, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon11", imagebutton_icon11);
		this.addRenderableWidget(imagebutton_icon11);
		imagebutton_icon12 = new ImageButton(this.leftPos + 104, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon12.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(18, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon12", imagebutton_icon12);
		this.addRenderableWidget(imagebutton_icon12);
		imagebutton_icon13 = new ImageButton(this.leftPos + 129, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon13.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(19, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon13", imagebutton_icon13);
		this.addRenderableWidget(imagebutton_icon13);
		imagebutton_icon14 = new ImageButton(this.leftPos + 154, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon14.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StatisticGUIButtonMessage(20, x, y, z));
				StatisticGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon14", imagebutton_icon14);
		this.addRenderableWidget(imagebutton_icon14);
	}
}
