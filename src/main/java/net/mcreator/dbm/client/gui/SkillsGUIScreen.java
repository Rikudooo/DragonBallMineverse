package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.SkillsGUIMenu;
import net.mcreator.dbm.procedures.TextSelectedSkillProcedure;
import net.mcreator.dbm.procedures.TextPotentialReleaseLevelProcedure;
import net.mcreator.dbm.procedures.TextKiSenseLevelProcedure;
import net.mcreator.dbm.procedures.TextJumpLevelProcedure;
import net.mcreator.dbm.procedures.TextFlyLevelProcedure;
import net.mcreator.dbm.procedures.ReturnSkillPotentialReleaseProcedure;
import net.mcreator.dbm.procedures.ReturnSkillKiSenseProcedure;
import net.mcreator.dbm.procedures.ReturnSkillJumpProcedure;
import net.mcreator.dbm.procedures.ReturnSkillFlyProcedure;
import net.mcreator.dbm.network.SkillsGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SkillsGUIScreen extends AbstractContainerScreen<SkillsGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillsGUIMenu.guistate;
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
	ImageButton imagebutton_jumpicon;
	ImageButton imagebutton_flyiconskill;
	ImageButton imagebutton_potentialreleaseicon;
	ImageButton imagebutton_upgradeicon;
	ImageButton imagebutton_kisenseicon;

	public SkillsGUIScreen(SkillsGUIMenu container, Inventory inventory, Component text) {
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
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.skills_gui.tooltip_jump_allows_you_to_jump_higher"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -58 && mouseY < topPos + -40)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.skills_gui.tooltip_fly_gives_the_player_the_abilit"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -31 && mouseY < topPos + -13)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.skills_gui.tooltip_potential_release_allows_you_to"), mouseX, mouseY);
		if (mouseX > leftPos + -163 && mouseX < leftPos + -145 && mouseY > topPos + -4 && mouseY < topPos + 14)
			guiGraphics.renderTooltip(font, Component.translatable("gui.dbm.skills_gui.tooltip_ki_sense"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui5.png"), this.leftPos + -176, this.topPos + -104, 0, 0, 257, 200, 257, 200);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/currenticon.png"), this.leftPos + -148, this.topPos + 94, 0, 0, 24, 24, 24, 24);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui4.png"), this.leftPos + 83, this.topPos + -48, 0, 0, 120, 101, 120, 101);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.skills_gui.label_player_stats"), -172, -101, -16777063, false);
		guiGraphics.drawString(this.font,

				TextSelectedSkillProcedure.execute(entity), 89, -40, -1, false);
		if (ReturnSkillJumpProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TextJumpLevelProcedure.execute(entity), 89, -22, -1, false);
		if (ReturnSkillJumpProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.skills_gui.label_upgradecost"), 89, -4, -1, false);
		if (ReturnSkillPotentialReleaseProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TextPotentialReleaseLevelProcedure.execute(entity), 89, -22, -1, false);
		if (ReturnSkillFlyProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TextFlyLevelProcedure.execute(entity), 89, -22, -1, false);
		if (ReturnSkillKiSenseProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TextKiSenseLevelProcedure.execute(entity), 89, -22, -1, false);
		if (ReturnSkillFlyProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.skills_gui.label_cost_5000_tp"), 89, -4, -1, false);
		if (ReturnSkillPotentialReleaseProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.skills_gui.label_cost_2000_tp"), 89, -4, -1, false);
		if (ReturnSkillKiSenseProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.skills_gui.label_cost_6000_tp"), 89, -4, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_quit = new ImageButton(this.leftPos + 71, this.topPos + -103, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_quit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(0, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_quit", imagebutton_quit);
		this.addRenderableWidget(imagebutton_quit);
		imagebutton_statsicon = new ImageButton(this.leftPos + -171, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_statsicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(1, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statsicon", imagebutton_statsicon);
		this.addRenderableWidget(imagebutton_statsicon);
		imagebutton_skillicon = new ImageButton(this.leftPos + -146, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_skillicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(2, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillicon", imagebutton_skillicon);
		this.addRenderableWidget(imagebutton_skillicon);
		imagebutton_kiattackicon = new ImageButton(this.leftPos + -121, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kiattackicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(3, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiattackicon", imagebutton_kiattackicon);
		this.addRenderableWidget(imagebutton_kiattackicon);
		imagebutton_storyiconhovered = new ImageButton(this.leftPos + -46, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_storyiconhovered.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(4, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storyiconhovered", imagebutton_storyiconhovered);
		this.addRenderableWidget(imagebutton_storyiconhovered);
		imagebutton_formicon = new ImageButton(this.leftPos + -96, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_formicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(5, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_formicon", imagebutton_formicon);
		this.addRenderableWidget(imagebutton_formicon);
		imagebutton_ultimateformicon = new ImageButton(this.leftPos + -71, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_ultimateformicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(6, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ultimateformicon", imagebutton_ultimateformicon);
		this.addRenderableWidget(imagebutton_ultimateformicon);
		imagebutton_groupicon = new ImageButton(this.leftPos + -21, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_groupicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(7, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_groupicon", imagebutton_groupicon);
		this.addRenderableWidget(imagebutton_groupicon);
		imagebutton_icon8 = new ImageButton(this.leftPos + 4, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon8.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(8, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon8", imagebutton_icon8);
		this.addRenderableWidget(imagebutton_icon8);
		imagebutton_icon9 = new ImageButton(this.leftPos + 29, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon9.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(9, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon9", imagebutton_icon9);
		this.addRenderableWidget(imagebutton_icon9);
		imagebutton_icon10 = new ImageButton(this.leftPos + 54, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon10.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(10, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon10", imagebutton_icon10);
		this.addRenderableWidget(imagebutton_icon10);
		imagebutton_icon11 = new ImageButton(this.leftPos + 79, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon11.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(11, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon11", imagebutton_icon11);
		this.addRenderableWidget(imagebutton_icon11);
		imagebutton_icon12 = new ImageButton(this.leftPos + 104, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon12.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(12, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon12", imagebutton_icon12);
		this.addRenderableWidget(imagebutton_icon12);
		imagebutton_icon13 = new ImageButton(this.leftPos + 129, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon13.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(13, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon13", imagebutton_icon13);
		this.addRenderableWidget(imagebutton_icon13);
		imagebutton_icon14 = new ImageButton(this.leftPos + 154, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon14.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(14, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon14", imagebutton_icon14);
		this.addRenderableWidget(imagebutton_icon14);
		imagebutton_jumpicon = new ImageButton(this.leftPos + -163, this.topPos + -85, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_jumpicon.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(15, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_jumpicon", imagebutton_jumpicon);
		this.addRenderableWidget(imagebutton_jumpicon);
		imagebutton_flyiconskill = new ImageButton(this.leftPos + -163, this.topPos + -58, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_flyiconskill.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(16, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_flyiconskill", imagebutton_flyiconskill);
		this.addRenderableWidget(imagebutton_flyiconskill);
		imagebutton_potentialreleaseicon = new ImageButton(this.leftPos + -163, this.topPos + -31, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_potentialreleaseicon.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(17, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_potentialreleaseicon", imagebutton_potentialreleaseicon);
		this.addRenderableWidget(imagebutton_potentialreleaseicon);
		imagebutton_upgradeicon = new ImageButton(this.leftPos + 89, this.topPos + 32, 48, 16, 0, 0, 16, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_upgradeicon.png"), 48, 32, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(18, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_upgradeicon", imagebutton_upgradeicon);
		this.addRenderableWidget(imagebutton_upgradeicon);
		imagebutton_kisenseicon = new ImageButton(this.leftPos + -163, this.topPos + -4, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kisenseicon.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new SkillsGUIButtonMessage(19, x, y, z));
				SkillsGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kisenseicon", imagebutton_kisenseicon);
		this.addRenderableWidget(imagebutton_kisenseicon);
	}
}
