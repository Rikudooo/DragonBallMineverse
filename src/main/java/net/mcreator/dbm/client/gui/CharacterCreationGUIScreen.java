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

import net.mcreator.dbm.world.inventory.CharacterCreationGUIMenu;
import net.mcreator.dbm.procedures.WidthProcedure;
import net.mcreator.dbm.procedures.Skin4Procedure;
import net.mcreator.dbm.procedures.Skin3Procedure;
import net.mcreator.dbm.procedures.Skin2Procedure;
import net.mcreator.dbm.procedures.Skin1Procedure;
import net.mcreator.dbm.procedures.ReturnTailTrueProcedure;
import net.mcreator.dbm.procedures.ReturnTailOffProcedure;
import net.mcreator.dbm.procedures.ReturnSaiyanOrHalfSaiyanProcedure;
import net.mcreator.dbm.procedures.ReturnHumanoidProcedure;
import net.mcreator.dbm.procedures.ReturnHas4SkinsProcedure;
import net.mcreator.dbm.procedures.ReturnHas3SkinsProcedure;
import net.mcreator.dbm.procedures.ReturnHas2SkinsProcedure;
import net.mcreator.dbm.procedures.RaceProcedure;
import net.mcreator.dbm.procedures.MouthProcedure;
import net.mcreator.dbm.procedures.HeightProcedure;
import net.mcreator.dbm.procedures.HairProcedure;
import net.mcreator.dbm.procedures.HairColorProcedure;
import net.mcreator.dbm.procedures.EyesProcedure;
import net.mcreator.dbm.procedures.EyesColorProcedure;
import net.mcreator.dbm.procedures.EyebrowsProcedure;
import net.mcreator.dbm.procedures.DisplayPlayerProcedure;
import net.mcreator.dbm.network.CharacterCreationGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterCreationGUIScreen extends AbstractContainerScreen<CharacterCreationGUIMenu> {
	private final static HashMap<String, Object> guistate = CharacterCreationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_customleft;
	ImageButton imagebutton_customright;
	ImageButton imagebutton_customleft1;
	ImageButton imagebutton_customright1;
	ImageButton imagebutton_customleft2;
	ImageButton imagebutton_customright2;
	ImageButton imagebutton_customleft3;
	ImageButton imagebutton_customright3;
	ImageButton imagebutton_customleft4;
	ImageButton imagebutton_customright4;
	ImageButton imagebutton_customleft5;
	ImageButton imagebutton_customright5;
	ImageButton imagebutton_customleft6;
	ImageButton imagebutton_customright6;
	ImageButton imagebutton_customleft7;
	ImageButton imagebutton_customright7;
	ImageButton imagebutton_customleft8;
	ImageButton imagebutton_customright8;
	ImageButton imagebutton_customleft9;
	ImageButton imagebutton_customright9;
	ImageButton imagebutton_customleft10;
	ImageButton imagebutton_customright10;
	ImageButton imagebutton_left;
	ImageButton imagebutton_right;
	ImageButton imagebutton_onandoffbutton;
	ImageButton imagebutton_customleft11;
	ImageButton imagebutton_customright11;
	ImageButton imagebutton_customleft12;
	ImageButton imagebutton_customright12;

	public CharacterCreationGUIScreen(CharacterCreationGUIMenu container, Inventory inventory, Component text) {
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
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 152, this.topPos + 35, 30, 0f + (float) Math.atan((this.leftPos + 152 - mouseX) / 40.0), (float) Math.atan((this.topPos + -14 - mouseY) / 40.0),
					livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/customformforgegui2.png"), this.leftPos + -199, this.topPos + -84, 0, 0, 285, 166, 285, 166);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/skin.png"), this.leftPos + 15, this.topPos + -75, 0, 0, 62, 21, 62, 21);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallgui2.png"), this.leftPos + 119, this.topPos + -43, 0, 0, 64, 82, 64, 82);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/race.png"), this.leftPos + -190, this.topPos + -75, 0, 0, 62, 21, 62, 21);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/eyes.png"), this.leftPos + -53, this.topPos + -75, 0, 0, 62, 21, 62, 21);

		if (ReturnHumanoidProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dbm:textures/screens/hair.png"), this.leftPos + -190, this.topPos + -23, 0, 0, 62, 21, 62, 21);
		}
		if (ReturnHumanoidProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + -189, this.topPos + 38, 0, 0, 61, 3, 61, 3);
		}

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + -59, this.topPos + -14, 0, 0, 61, 3, 61, 3);

		if (ReturnTailOffProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dbm:textures/screens/officon.png"), this.leftPos + -179, this.topPos + -34, 0, 0, 16, 7, 16, 7);
		}
		if (ReturnTailTrueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dbm:textures/screens/onicon.png"), this.leftPos + -179, this.topPos + -34, 0, 0, 16, 7, 16, 7);
		}

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/size.png"), this.leftPos + -122, this.topPos + -75, 0, 0, 62, 21, 62, 21);

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
		guiGraphics.drawString(this.font,

				RaceProcedure.execute(entity), -176, -51, -1, false);
		if (ReturnHumanoidProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					HairProcedure.execute(entity), -169, 1, -1, false);
		if (ReturnHumanoidProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					HairColorProcedure.execute(entity), -169, 18, -65536, false);
		guiGraphics.drawString(this.font,

				EyesProcedure.execute(entity), -36, -50, -1, false);
		guiGraphics.drawString(this.font,

				EyesColorProcedure.execute(entity), -36, -33, -65536, false);
		if (ReturnHumanoidProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					EyebrowsProcedure.execute(entity), -169, 46, -1, false);
		guiGraphics.drawString(this.font,

				MouthProcedure.execute(entity), -36, -5, -1, false);
		guiGraphics.drawString(this.font,

				Skin1Procedure.execute(entity), 41, -49, -1, false);
		if (ReturnHas2SkinsProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					Skin2Procedure.execute(entity), 41, -22, -1, false);
		if (ReturnHas3SkinsProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					Skin3Procedure.execute(entity), 41, 5, -1, false);
		if (ReturnHas4SkinsProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					Skin4Procedure.execute(entity), 41, 32, -1, false);
		guiGraphics.drawString(this.font,

				HeightProcedure.execute(entity), -96, -50, -1, false);
		guiGraphics.drawString(this.font,

				WidthProcedure.execute(entity), -96, -33, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_customleft = new ImageButton(this.leftPos + -190, this.topPos + -53, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(0, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft", imagebutton_customleft);
		this.addRenderableWidget(imagebutton_customleft);
		imagebutton_customright = new ImageButton(this.leftPos + -139, this.topPos + -53, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(1, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright", imagebutton_customright);
		this.addRenderableWidget(imagebutton_customright);
		imagebutton_customleft1 = new ImageButton(this.leftPos + -182, this.topPos + -1, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft1.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(2, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft1", imagebutton_customleft1);
		this.addRenderableWidget(imagebutton_customleft1);
		imagebutton_customright1 = new ImageButton(this.leftPos + -147, this.topPos + -1, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright1.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(3, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright1", imagebutton_customright1);
		this.addRenderableWidget(imagebutton_customright1);
		imagebutton_customleft2 = new ImageButton(this.leftPos + -182, this.topPos + 16, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft2.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(4, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft2", imagebutton_customleft2);
		this.addRenderableWidget(imagebutton_customleft2);
		imagebutton_customright2 = new ImageButton(this.leftPos + -147, this.topPos + 16, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright2.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(5, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright2", imagebutton_customright2);
		this.addRenderableWidget(imagebutton_customright2);
		imagebutton_customleft3 = new ImageButton(this.leftPos + -182, this.topPos + 44, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft3.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(6, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft3", imagebutton_customleft3);
		this.addRenderableWidget(imagebutton_customleft3);
		imagebutton_customright3 = new ImageButton(this.leftPos + -147, this.topPos + 44, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright3.png"), 11, 30, e -> {
			if (ReturnHumanoidProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(7, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHumanoidProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright3", imagebutton_customright3);
		this.addRenderableWidget(imagebutton_customright3);
		imagebutton_customleft4 = new ImageButton(this.leftPos + -49, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft4.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(8, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft4", imagebutton_customleft4);
		this.addRenderableWidget(imagebutton_customleft4);
		imagebutton_customright4 = new ImageButton(this.leftPos + -18, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright4.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(9, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright4", imagebutton_customright4);
		this.addRenderableWidget(imagebutton_customright4);
		imagebutton_customleft5 = new ImageButton(this.leftPos + -49, this.topPos + -35, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft5.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(10, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft5", imagebutton_customleft5);
		this.addRenderableWidget(imagebutton_customleft5);
		imagebutton_customright5 = new ImageButton(this.leftPos + -18, this.topPos + -35, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright5.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(11, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright5", imagebutton_customright5);
		this.addRenderableWidget(imagebutton_customright5);
		imagebutton_customleft6 = new ImageButton(this.leftPos + -49, this.topPos + -7, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft6.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(12, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft6", imagebutton_customleft6);
		this.addRenderableWidget(imagebutton_customleft6);
		imagebutton_customright6 = new ImageButton(this.leftPos + -18, this.topPos + -7, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright6.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(13, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright6", imagebutton_customright6);
		this.addRenderableWidget(imagebutton_customright6);
		imagebutton_customleft7 = new ImageButton(this.leftPos + 25, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft7.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(14, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft7", imagebutton_customleft7);
		this.addRenderableWidget(imagebutton_customleft7);
		imagebutton_customright7 = new ImageButton(this.leftPos + 57, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright7.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(15, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright7", imagebutton_customright7);
		this.addRenderableWidget(imagebutton_customright7);
		imagebutton_customleft8 = new ImageButton(this.leftPos + 25, this.topPos + -25, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft8.png"), 11, 30, e -> {
			if (ReturnHas2SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(16, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas2SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft8", imagebutton_customleft8);
		this.addRenderableWidget(imagebutton_customleft8);
		imagebutton_customright8 = new ImageButton(this.leftPos + 57, this.topPos + -25, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright8.png"), 11, 30, e -> {
			if (ReturnHas2SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(17, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas2SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright8", imagebutton_customright8);
		this.addRenderableWidget(imagebutton_customright8);
		imagebutton_customleft9 = new ImageButton(this.leftPos + 25, this.topPos + 2, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft9.png"), 11, 30, e -> {
			if (ReturnHas3SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(18, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas3SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft9", imagebutton_customleft9);
		this.addRenderableWidget(imagebutton_customleft9);
		imagebutton_customright9 = new ImageButton(this.leftPos + 57, this.topPos + 2, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright9.png"), 11, 30, e -> {
			if (ReturnHas3SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(19, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas3SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright9", imagebutton_customright9);
		this.addRenderableWidget(imagebutton_customright9);
		imagebutton_customleft10 = new ImageButton(this.leftPos + 25, this.topPos + 29, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft10.png"), 11, 30, e -> {
			if (ReturnHas4SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(20, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas4SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customleft10", imagebutton_customleft10);
		this.addRenderableWidget(imagebutton_customleft10);
		imagebutton_customright10 = new ImageButton(this.leftPos + 57, this.topPos + 29, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright10.png"), 11, 30, e -> {
			if (ReturnHas4SkinsProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(21, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnHas4SkinsProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_customright10", imagebutton_customright10);
		this.addRenderableWidget(imagebutton_customright10);
		imagebutton_left = new ImageButton(this.leftPos + -195, this.topPos + 63, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_left.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(22, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left", imagebutton_left);
		this.addRenderableWidget(imagebutton_left);
		imagebutton_right = new ImageButton(this.leftPos + 71, this.topPos + 63, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_right.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(23, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right", imagebutton_right);
		this.addRenderableWidget(imagebutton_right);
		imagebutton_onandoffbutton = new ImageButton(this.leftPos + -179, this.topPos + -34, 16, 7, 0, 0, 7, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_onandoffbutton.png"), 16, 14, e -> {
			if (ReturnSaiyanOrHalfSaiyanProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(24, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnSaiyanOrHalfSaiyanProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_onandoffbutton", imagebutton_onandoffbutton);
		this.addRenderableWidget(imagebutton_onandoffbutton);
		imagebutton_customleft11 = new ImageButton(this.leftPos + -110, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft11.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(25, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft11", imagebutton_customleft11);
		this.addRenderableWidget(imagebutton_customleft11);
		imagebutton_customright11 = new ImageButton(this.leftPos + -83, this.topPos + -52, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright11.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(26, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 26, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright11", imagebutton_customright11);
		this.addRenderableWidget(imagebutton_customright11);
		imagebutton_customleft12 = new ImageButton(this.leftPos + -110, this.topPos + -35, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft12.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(27, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 27, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft12", imagebutton_customleft12);
		this.addRenderableWidget(imagebutton_customleft12);
		imagebutton_customright12 = new ImageButton(this.leftPos + -83, this.topPos + -35, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright12.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUIButtonMessage(28, x, y, z));
				CharacterCreationGUIButtonMessage.handleButtonAction(entity, 28, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright12", imagebutton_customright12);
		this.addRenderableWidget(imagebutton_customright12);
	}
}
