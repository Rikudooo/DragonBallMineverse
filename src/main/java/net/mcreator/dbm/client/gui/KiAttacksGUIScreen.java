package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.KiAttacksGUIMenu;
import net.mcreator.dbm.procedures.TextSelectedKiAttackProcedure;
import net.mcreator.dbm.procedures.TextKiAttack8Procedure;
import net.mcreator.dbm.procedures.TextKiAttack7Procedure;
import net.mcreator.dbm.procedures.TextKiAttack6Procedure;
import net.mcreator.dbm.procedures.TextKiAttack5Procedure;
import net.mcreator.dbm.procedures.TextKiAttack4Procedure;
import net.mcreator.dbm.procedures.TextKiAttack3Procedure;
import net.mcreator.dbm.procedures.TextKiAttack2Procedure;
import net.mcreator.dbm.procedures.TextKiAttack1Procedure;
import net.mcreator.dbm.network.KiAttacksGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KiAttacksGUIScreen extends AbstractContainerScreen<KiAttacksGUIMenu> {
	private final static HashMap<String, Object> guistate = KiAttacksGUIMenu.guistate;
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
	ImageButton imagebutton_iconki;
	ImageButton imagebutton_iconki1;
	ImageButton imagebutton_iconki2;
	ImageButton imagebutton_iconki3;
	ImageButton imagebutton_iconki4;
	ImageButton imagebutton_iconki5;
	ImageButton imagebutton_iconki6;
	ImageButton imagebutton_iconki7;
	ImageButton imagebutton_upicon;
	ImageButton imagebutton_downicon;
	ImageButton imagebutton_deleteicon;

	public KiAttacksGUIScreen(KiAttacksGUIMenu container, Inventory inventory, Component text) {
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
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui6.png"), this.leftPos + -176, this.topPos + -104, 0, 0, 257, 200, 257, 200);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/currenticon.png"), this.leftPos + -123, this.topPos + 94, 0, 0, 24, 24, 24, 24);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.ki_attacks_gui.label_player_stats"), -172, -101, -16777063, false);
		guiGraphics.drawString(this.font,

				TextSelectedKiAttackProcedure.execute(entity), 89, -40, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack1Procedure.execute(entity), -154, -76, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack2Procedure.execute(entity), -154, -58, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack3Procedure.execute(entity), -154, -40, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack4Procedure.execute(entity), -154, -22, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack5Procedure.execute(entity), -154, -4, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack6Procedure.execute(entity), -154, 14, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack7Procedure.execute(entity), -154, 32, -1, false);
		guiGraphics.drawString(this.font,

				TextKiAttack8Procedure.execute(entity), -154, 50, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_quit = new ImageButton(this.leftPos + 71, this.topPos + -103, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_quit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(0, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_quit", imagebutton_quit);
		this.addRenderableWidget(imagebutton_quit);
		imagebutton_statsicon = new ImageButton(this.leftPos + -171, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_statsicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(1, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statsicon", imagebutton_statsicon);
		this.addRenderableWidget(imagebutton_statsicon);
		imagebutton_skillicon = new ImageButton(this.leftPos + -146, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_skillicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(2, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillicon", imagebutton_skillicon);
		this.addRenderableWidget(imagebutton_skillicon);
		imagebutton_kiattackicon = new ImageButton(this.leftPos + -121, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kiattackicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(3, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiattackicon", imagebutton_kiattackicon);
		this.addRenderableWidget(imagebutton_kiattackicon);
		imagebutton_storyiconhovered = new ImageButton(this.leftPos + -46, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_storyiconhovered.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(4, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storyiconhovered", imagebutton_storyiconhovered);
		this.addRenderableWidget(imagebutton_storyiconhovered);
		imagebutton_formicon = new ImageButton(this.leftPos + -96, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_formicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(5, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_formicon", imagebutton_formicon);
		this.addRenderableWidget(imagebutton_formicon);
		imagebutton_ultimateformicon = new ImageButton(this.leftPos + -71, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_ultimateformicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(6, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ultimateformicon", imagebutton_ultimateformicon);
		this.addRenderableWidget(imagebutton_ultimateformicon);
		imagebutton_groupicon = new ImageButton(this.leftPos + -21, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_groupicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(7, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_groupicon", imagebutton_groupicon);
		this.addRenderableWidget(imagebutton_groupicon);
		imagebutton_icon8 = new ImageButton(this.leftPos + 4, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon8.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(8, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon8", imagebutton_icon8);
		this.addRenderableWidget(imagebutton_icon8);
		imagebutton_icon9 = new ImageButton(this.leftPos + 29, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon9.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(9, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon9", imagebutton_icon9);
		this.addRenderableWidget(imagebutton_icon9);
		imagebutton_icon10 = new ImageButton(this.leftPos + 54, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon10.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(10, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon10", imagebutton_icon10);
		this.addRenderableWidget(imagebutton_icon10);
		imagebutton_icon11 = new ImageButton(this.leftPos + 79, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon11.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(11, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon11", imagebutton_icon11);
		this.addRenderableWidget(imagebutton_icon11);
		imagebutton_icon12 = new ImageButton(this.leftPos + 104, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon12.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(12, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon12", imagebutton_icon12);
		this.addRenderableWidget(imagebutton_icon12);
		imagebutton_icon13 = new ImageButton(this.leftPos + 129, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon13.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(13, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon13", imagebutton_icon13);
		this.addRenderableWidget(imagebutton_icon13);
		imagebutton_icon14 = new ImageButton(this.leftPos + 154, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon14.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(14, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon14", imagebutton_icon14);
		this.addRenderableWidget(imagebutton_icon14);
		imagebutton_iconki = new ImageButton(this.leftPos + -163, this.topPos + -75, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(15, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki", imagebutton_iconki);
		this.addRenderableWidget(imagebutton_iconki);
		imagebutton_iconki1 = new ImageButton(this.leftPos + -163, this.topPos + -57, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki1.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(16, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki1", imagebutton_iconki1);
		this.addRenderableWidget(imagebutton_iconki1);
		imagebutton_iconki2 = new ImageButton(this.leftPos + -163, this.topPos + -39, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki2.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(17, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki2", imagebutton_iconki2);
		this.addRenderableWidget(imagebutton_iconki2);
		imagebutton_iconki3 = new ImageButton(this.leftPos + -163, this.topPos + -21, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki3.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(18, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki3", imagebutton_iconki3);
		this.addRenderableWidget(imagebutton_iconki3);
		imagebutton_iconki4 = new ImageButton(this.leftPos + -163, this.topPos + -3, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki4.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(19, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki4", imagebutton_iconki4);
		this.addRenderableWidget(imagebutton_iconki4);
		imagebutton_iconki5 = new ImageButton(this.leftPos + -163, this.topPos + 15, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki5.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(20, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki5", imagebutton_iconki5);
		this.addRenderableWidget(imagebutton_iconki5);
		imagebutton_iconki6 = new ImageButton(this.leftPos + -163, this.topPos + 33, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki6.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(21, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki6", imagebutton_iconki6);
		this.addRenderableWidget(imagebutton_iconki6);
		imagebutton_iconki7 = new ImageButton(this.leftPos + -163, this.topPos + 51, 8, 8, 0, 0, 8, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_iconki7.png"), 8, 16, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(22, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iconki7", imagebutton_iconki7);
		this.addRenderableWidget(imagebutton_iconki7);
		imagebutton_upicon = new ImageButton(this.leftPos + 98, this.topPos + -4, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_upicon.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(23, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_upicon", imagebutton_upicon);
		this.addRenderableWidget(imagebutton_upicon);
		imagebutton_downicon = new ImageButton(this.leftPos + 98, this.topPos + 22, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_downicon.png"), 18, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(24, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		});
		guistate.put("button:imagebutton_downicon", imagebutton_downicon);
		this.addRenderableWidget(imagebutton_downicon);
		imagebutton_deleteicon = new ImageButton(this.leftPos + 152, this.topPos + 34, 48, 16, 0, 0, 16, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_deleteicon.png"), 48, 32, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiAttacksGUIButtonMessage(25, x, y, z));
				KiAttacksGUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		});
		guistate.put("button:imagebutton_deleteicon", imagebutton_deleteicon);
		this.addRenderableWidget(imagebutton_deleteicon);
	}
}
