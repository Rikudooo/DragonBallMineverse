package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.NamekianFormsGUIMenu;
import net.mcreator.dbm.procedures.TextRacialTPCostProcedure;
import net.mcreator.dbm.procedures.TextRacialMaxLevelProcedure;
import net.mcreator.dbm.procedures.ReturnRacialFormOver4Procedure;
import net.mcreator.dbm.procedures.ReturnKaiokenOwnedProcedure;
import net.mcreator.dbm.procedures.ReturnFormPathNotSubformProcedure;
import net.mcreator.dbm.procedures.ReturnBabidiMagicOwnedProcedure;
import net.mcreator.dbm.procedures.RacialFormLevelTextProcedure;
import net.mcreator.dbm.procedures.KaiokenOwnedTextProcedure;
import net.mcreator.dbm.procedures.FormPathTextProcedure;
import net.mcreator.dbm.procedures.FormPathKaiokenProcedure;
import net.mcreator.dbm.procedures.FormPathBabidiMagicProcedure;
import net.mcreator.dbm.procedures.BabidiMagicTextProcedure;
import net.mcreator.dbm.network.NamekianFormsGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NamekianFormsGUIScreen extends AbstractContainerScreen<NamekianFormsGUIMenu> {
	private final static HashMap<String, Object> guistate = NamekianFormsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_quit;
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
	ImageButton imagebutton_upgradeicon;
	ImageButton imagebutton_kaiokenicon;
	ImageButton imagebutton_babidiicon;
	ImageButton imagebutton_giantnamekianicon;
	ImageButton imagebutton_fullpowericon;
	ImageButton imagebutton_powerunleashednamek;
	ImageButton imagebutton_supernamekianicon;
	ImageButton imagebutton_orangenamekianicon;
	ImageButton imagebutton_regenicon;

	public NamekianFormsGUIScreen(NamekianFormsGUIMenu container, Inventory inventory, Component text) {
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
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -85 && mouseY < topPos + -67)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_jump_allows_you_to_jump_higher"), mouseX, mouseY);
		if (ReturnRacialFormOver4Procedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -49 && mouseY < topPos + -31)
				guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_super_saiyan_2_upgrade_your_rac"), mouseX, mouseY);
		if (ReturnKaiokenOwnedProcedure.execute(entity))
			if (mouseX > leftPos + 16 && mouseX < leftPos + 34 && mouseY > topPos + -85 && mouseY < topPos + -67)
				guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_kaioken_a_technique_that_gives"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + 23 && mouseY < topPos + 41)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_golden_cooler_combine_your_two"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + 59 && mouseY < topPos + 77)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_black_reach_the_pinnacle_of_you"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -12 && mouseY < topPos + 5)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_super_namekian_a_namekian_whose"), mouseX, mouseY);
		if (mouseX > leftPos + -119 && mouseX < leftPos + -101 && mouseY > topPos + -85 && mouseY < topPos + -67)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.namekian_forms_gui.tooltip_regeneration_press_the_transfor"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui3.png"), this.leftPos + -177, this.topPos + -104, 0, 0, 224, 200, 224, 200);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/currenticon.png"), this.leftPos + -98, this.topPos + 94, 0, 0, 24, 24, 24, 24);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui4.png"), this.leftPos + 61, this.topPos + -50, 0, 0, 120, 101, 120, 101);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.namekian_forms_gui.label_player_stats"), -173, -101, -16777063, false);
		guiGraphics.drawString(this.font,

				FormPathTextProcedure.execute(entity), 71, -40, -1, false);
		if (ReturnFormPathNotSubformProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					RacialFormLevelTextProcedure.execute(entity), 71, -22, -1, false);
		if (FormPathKaiokenProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					KaiokenOwnedTextProcedure.execute(entity), 71, -22, -1, false);
		guiGraphics.drawString(this.font,

				TextRacialMaxLevelProcedure.execute(entity), 71, -4, -1, false);
		guiGraphics.drawString(this.font,

				TextRacialTPCostProcedure.execute(entity), 71, 14, -1, false);
		if (FormPathBabidiMagicProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					BabidiMagicTextProcedure.execute(entity), 71, -22, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_quit = new ImageButton(this.leftPos + 37, this.topPos + -102, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_quit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(0, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_quit", imagebutton_quit);
		this.addRenderableWidget(imagebutton_quit);
		imagebutton_statsicon = new ImageButton(this.leftPos + -171, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_statsicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(1, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statsicon", imagebutton_statsicon);
		this.addRenderableWidget(imagebutton_statsicon);
		imagebutton_skillicon = new ImageButton(this.leftPos + -146, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_skillicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(2, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillicon", imagebutton_skillicon);
		this.addRenderableWidget(imagebutton_skillicon);
		imagebutton_kiattackicon = new ImageButton(this.leftPos + -121, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kiattackicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(3, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiattackicon", imagebutton_kiattackicon);
		this.addRenderableWidget(imagebutton_kiattackicon);
		imagebutton_storyiconhovered = new ImageButton(this.leftPos + -46, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_storyiconhovered.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(4, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storyiconhovered", imagebutton_storyiconhovered);
		this.addRenderableWidget(imagebutton_storyiconhovered);
		imagebutton_formicon = new ImageButton(this.leftPos + -96, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_formicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(5, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_formicon", imagebutton_formicon);
		this.addRenderableWidget(imagebutton_formicon);
		imagebutton_ultimateformicon = new ImageButton(this.leftPos + -71, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_ultimateformicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(6, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ultimateformicon", imagebutton_ultimateformicon);
		this.addRenderableWidget(imagebutton_ultimateformicon);
		imagebutton_groupicon = new ImageButton(this.leftPos + -21, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_groupicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(7, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_groupicon", imagebutton_groupicon);
		this.addRenderableWidget(imagebutton_groupicon);
		imagebutton_icon8 = new ImageButton(this.leftPos + 4, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon8.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(8, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon8", imagebutton_icon8);
		this.addRenderableWidget(imagebutton_icon8);
		imagebutton_icon9 = new ImageButton(this.leftPos + 29, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon9.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(9, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon9", imagebutton_icon9);
		this.addRenderableWidget(imagebutton_icon9);
		imagebutton_icon10 = new ImageButton(this.leftPos + 54, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon10.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(10, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon10", imagebutton_icon10);
		this.addRenderableWidget(imagebutton_icon10);
		imagebutton_icon11 = new ImageButton(this.leftPos + 79, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon11.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(11, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon11", imagebutton_icon11);
		this.addRenderableWidget(imagebutton_icon11);
		imagebutton_icon12 = new ImageButton(this.leftPos + 104, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon12.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(12, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon12", imagebutton_icon12);
		this.addRenderableWidget(imagebutton_icon12);
		imagebutton_icon13 = new ImageButton(this.leftPos + 129, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon13.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(13, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon13", imagebutton_icon13);
		this.addRenderableWidget(imagebutton_icon13);
		imagebutton_icon14 = new ImageButton(this.leftPos + 154, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon14.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(14, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon14", imagebutton_icon14);
		this.addRenderableWidget(imagebutton_icon14);
		imagebutton_upgradeicon = new ImageButton(this.leftPos + 98, this.topPos + 32, 48, 16, 0, 0, 16, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_upgradeicon.png"), 48, 32, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(15, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_upgradeicon", imagebutton_upgradeicon);
		this.addRenderableWidget(imagebutton_upgradeicon);
		imagebutton_kaiokenicon = new ImageButton(this.leftPos + 16, this.topPos + -85, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kaiokenicon.png"), 18, 36, e -> {
			if (ReturnKaiokenOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(16, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnKaiokenOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_kaiokenicon", imagebutton_kaiokenicon);
		this.addRenderableWidget(imagebutton_kaiokenicon);
		imagebutton_babidiicon = new ImageButton(this.leftPos + 16, this.topPos + -58, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_babidiicon.png"), 18, 36, e -> {
			if (ReturnBabidiMagicOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new NamekianFormsGUIButtonMessage(17, x, y, z));
				NamekianFormsGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnBabidiMagicOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_babidiicon", imagebutton_babidiicon);
		this.addRenderableWidget(imagebutton_babidiicon);
		imagebutton_giantnamekianicon = new ImageButton(this.leftPos + -163, this.topPos + -85, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_giantnamekianicon.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_giantnamekianicon", imagebutton_giantnamekianicon);
		this.addRenderableWidget(imagebutton_giantnamekianicon);
		imagebutton_fullpowericon = new ImageButton(this.leftPos + -163, this.topPos + -49, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_fullpowericon.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_fullpowericon", imagebutton_fullpowericon);
		this.addRenderableWidget(imagebutton_fullpowericon);
		imagebutton_powerunleashednamek = new ImageButton(this.leftPos + -163, this.topPos + 23, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_powerunleashednamek.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_powerunleashednamek", imagebutton_powerunleashednamek);
		this.addRenderableWidget(imagebutton_powerunleashednamek);
		imagebutton_supernamekianicon = new ImageButton(this.leftPos + -163, this.topPos + -12, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_supernamekianicon.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_supernamekianicon", imagebutton_supernamekianicon);
		this.addRenderableWidget(imagebutton_supernamekianicon);
		imagebutton_orangenamekianicon = new ImageButton(this.leftPos + -163, this.topPos + 59, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_orangenamekianicon.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_orangenamekianicon", imagebutton_orangenamekianicon);
		this.addRenderableWidget(imagebutton_orangenamekianicon);
		imagebutton_regenicon = new ImageButton(this.leftPos + -119, this.topPos + -85, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_regenicon.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_regenicon", imagebutton_regenicon);
		this.addRenderableWidget(imagebutton_regenicon);
	}
}
