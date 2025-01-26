package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.StoryGUI53Menu;
import net.mcreator.dbm.procedures.ReturnSpopovichDefeatedProcedure;
import net.mcreator.dbm.procedures.ReturnOnEarthProcedure;
import net.mcreator.dbm.network.StoryGUI53ButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoryGUI53Screen extends AbstractContainerScreen<StoryGUI53Menu> {
	private final static HashMap<String, Object> guistate = StoryGUI53Menu.guistate;
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
	ImageButton imagebutton_next2;
	ImageButton imagebutton_start;

	public StoryGUI53Screen(StoryGUI53Menu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/4stardbgui2.png"), this.leftPos + -176, this.topPos + -104, 0, 0, 350, 200, 350, 200);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/currenticon.png"), this.leftPos + -48, this.topPos + 94, 0, 0, 24, 24, 24, 24);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_player_stats"), -172, -101, -16777063, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_hey_looking_for_an_adventure_w"), -163, -76, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_be_on_planet_earth"), -154, 5, -256, false);
		if (ReturnOnEarthProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_be_on_planet_earth_done"), -154, 5, -256, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_on_par_with_vegetas_he_was_sen"), -163, -67, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_strong"), -163, -58, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_defeat_spopovich"), -154, 23, -256, false);
		if (ReturnSpopovichDefeatedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.story_gui_53.label_defeat_spopovich_done"), -154, 23, -256, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_quit = new ImageButton(this.leftPos + 163, this.topPos + -102, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_quit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(0, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_quit", imagebutton_quit);
		this.addRenderableWidget(imagebutton_quit);
		imagebutton_statsicon = new ImageButton(this.leftPos + -171, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_statsicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(1, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statsicon", imagebutton_statsicon);
		this.addRenderableWidget(imagebutton_statsicon);
		imagebutton_skillicon = new ImageButton(this.leftPos + -146, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_skillicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(2, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillicon", imagebutton_skillicon);
		this.addRenderableWidget(imagebutton_skillicon);
		imagebutton_kiattackicon = new ImageButton(this.leftPos + -121, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_kiattackicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(3, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiattackicon", imagebutton_kiattackicon);
		this.addRenderableWidget(imagebutton_kiattackicon);
		imagebutton_storyiconhovered = new ImageButton(this.leftPos + -46, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_storyiconhovered.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(4, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storyiconhovered", imagebutton_storyiconhovered);
		this.addRenderableWidget(imagebutton_storyiconhovered);
		imagebutton_formicon = new ImageButton(this.leftPos + -96, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_formicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(5, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_formicon", imagebutton_formicon);
		this.addRenderableWidget(imagebutton_formicon);
		imagebutton_ultimateformicon = new ImageButton(this.leftPos + -71, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_ultimateformicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(6, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ultimateformicon", imagebutton_ultimateformicon);
		this.addRenderableWidget(imagebutton_ultimateformicon);
		imagebutton_groupicon = new ImageButton(this.leftPos + -21, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_groupicon.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(7, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_groupicon", imagebutton_groupicon);
		this.addRenderableWidget(imagebutton_groupicon);
		imagebutton_icon8 = new ImageButton(this.leftPos + 4, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon8.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(8, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon8", imagebutton_icon8);
		this.addRenderableWidget(imagebutton_icon8);
		imagebutton_icon9 = new ImageButton(this.leftPos + 29, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon9.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(9, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon9", imagebutton_icon9);
		this.addRenderableWidget(imagebutton_icon9);
		imagebutton_icon10 = new ImageButton(this.leftPos + 54, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon10.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(10, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon10", imagebutton_icon10);
		this.addRenderableWidget(imagebutton_icon10);
		imagebutton_icon11 = new ImageButton(this.leftPos + 79, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon11.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(11, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon11", imagebutton_icon11);
		this.addRenderableWidget(imagebutton_icon11);
		imagebutton_icon12 = new ImageButton(this.leftPos + 104, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon12.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(12, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon12", imagebutton_icon12);
		this.addRenderableWidget(imagebutton_icon12);
		imagebutton_icon13 = new ImageButton(this.leftPos + 129, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon13.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(13, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon13", imagebutton_icon13);
		this.addRenderableWidget(imagebutton_icon13);
		imagebutton_icon14 = new ImageButton(this.leftPos + 154, this.topPos + 96, 20, 20, 0, 0, 20, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_icon14.png"), 20, 40, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(14, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_icon14", imagebutton_icon14);
		this.addRenderableWidget(imagebutton_icon14);
		imagebutton_next2 = new ImageButton(this.leftPos + 135, this.topPos + 77, 36, 16, 0, 0, 16, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_next2.png"), 36, 32, e -> {
			if (ReturnSpopovichDefeatedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(15, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnSpopovichDefeatedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_next2", imagebutton_next2);
		this.addRenderableWidget(imagebutton_next2);
		imagebutton_start = new ImageButton(this.leftPos + 98, this.topPos + 77, 36, 16, 0, 0, 16, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_start.png"), 36, 32, e -> {
			if (ReturnOnEarthProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new StoryGUI53ButtonMessage(16, x, y, z));
				StoryGUI53ButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnOnEarthProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_start", imagebutton_start);
		this.addRenderableWidget(imagebutton_start);
	}
}
