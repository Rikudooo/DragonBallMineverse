package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.BabidiGUIMenu;
import net.mcreator.dbm.procedures.AlignmentGoodProcedure;
import net.mcreator.dbm.procedures.AlignmentEvilNeutralProcedure;
import net.mcreator.dbm.procedures.AlignmentBabidiNotOwnedProcedure;
import net.mcreator.dbm.network.BabidiGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BabidiGUIScreen extends AbstractContainerScreen<BabidiGUIMenu> {
	private final static HashMap<String, Object> guistate = BabidiGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_dialogexit;
	ImageButton imagebutton_babidiicon;

	public BabidiGUIScreen(BabidiGUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/dialogbox.png"), this.leftPos + -190, this.topPos + 23, 0, 0, 380, 90, 380, 90);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/babidiface.png"), this.leftPos + -187, this.topPos + -6, 0, 0, 32, 28, 32, 28);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.babidi_gui.label_king_enma"), -154, 11, -1, false);
		if (AlignmentGoodProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.babidi_gui.label_hello_there_so_youre_dead_hu"), -181, 32, -1, false);
		if (AlignmentEvilNeutralProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.babidi_gui.label_i_sense_some_evil_in_you"), -181, 32, -1, false);
		if (AlignmentBabidiNotOwnedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.babidi_gui.label_babidis_magic_cost_20000_tp"), -159, 90, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_dialogexit = new ImageButton(this.leftPos + 179, this.topPos + 25, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogexit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new BabidiGUIButtonMessage(0, x, y, z));
				BabidiGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogexit", imagebutton_dialogexit);
		this.addRenderableWidget(imagebutton_dialogexit);
		imagebutton_babidiicon = new ImageButton(this.leftPos + -181, this.topPos + 86, 18, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_babidiicon.png"), 18, 36, e -> {
			if (AlignmentBabidiNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new BabidiGUIButtonMessage(1, x, y, z));
				BabidiGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AlignmentBabidiNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_babidiicon", imagebutton_babidiicon);
		this.addRenderableWidget(imagebutton_babidiicon);
	}
}
