package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.GokuGUI2Menu;
import net.mcreator.dbm.procedures.SolarFlareNotOwnedProcedure;
import net.mcreator.dbm.procedures.ReturnITNotOwnedProcedure;
import net.mcreator.dbm.procedures.KiWaveNotOwnedProcedure;
import net.mcreator.dbm.procedures.KameHouseAdditionalGenerationConditionProcedure;
import net.mcreator.dbm.procedures.FusionNotOwnedProcedure;
import net.mcreator.dbm.network.GokuGUI2ButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GokuGUI2Screen extends AbstractContainerScreen<GokuGUI2Menu> {
	private final static HashMap<String, Object> guistate = GokuGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_dialogexit;
	ImageButton imagebutton_learnbutton;
	ImageButton imagebutton_learnbutton1;
	ImageButton imagebutton_learnbutton2;
	ImageButton imagebutton_learnbutton3;
	ImageButton imagebutton_learnbutton4;

	public GokuGUI2Screen(GokuGUI2Menu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/learngui.png"), this.leftPos + -186, this.topPos + -24, 0, 0, 365, 125, 365, 125);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/gokuface.png"), this.leftPos + -189, this.topPos + -48, 0, 0, 64, 64, 64, 64);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/kiwave.png"), this.leftPos + -143, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/kamehameha.png"), this.leftPos + -143, this.topPos + 51, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/solarflare.png"), this.leftPos + -143, this.topPos + 69, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/instanttransmissionicon.png"), this.leftPos + 16, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/fusion.png"), this.leftPos + 18, this.topPos + 56, 0, 0, 10, 8, 10, 8);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_king_enma"), -133, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_kaioken_15000_tp"), -127, 38, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_spirit_bomb_cost_8000_tp"), -127, 55, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_giant_ki_blast_560_tp"), -127, 72, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_instant_transmission"), 31, 38, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.goku_gui_2.label_fusion"), 31, 55, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_dialogexit = new ImageButton(this.leftPos + 168, this.topPos + 22, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogexit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(0, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogexit", imagebutton_dialogexit);
		this.addRenderableWidget(imagebutton_dialogexit);
		imagebutton_learnbutton = new ImageButton(this.leftPos + -169, this.topPos + 36, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton.png"), 26, 26, e -> {
			if (KiWaveNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(1, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = KiWaveNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton", imagebutton_learnbutton);
		this.addRenderableWidget(imagebutton_learnbutton);
		imagebutton_learnbutton1 = new ImageButton(this.leftPos + -169, this.topPos + 54, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton1.png"), 26, 26, e -> {
			if (KameHouseAdditionalGenerationConditionProcedure.execute(world, x, z)) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(2, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = KameHouseAdditionalGenerationConditionProcedure.execute(world, x, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton1", imagebutton_learnbutton1);
		this.addRenderableWidget(imagebutton_learnbutton1);
		imagebutton_learnbutton2 = new ImageButton(this.leftPos + -169, this.topPos + 71, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton2.png"), 26, 26, e -> {
			if (SolarFlareNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(3, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = SolarFlareNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton2", imagebutton_learnbutton2);
		this.addRenderableWidget(imagebutton_learnbutton2);
		imagebutton_learnbutton3 = new ImageButton(this.leftPos + -9, this.topPos + 36, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton3.png"), 26, 26, e -> {
			if (ReturnITNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(4, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnITNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton3", imagebutton_learnbutton3);
		this.addRenderableWidget(imagebutton_learnbutton3);
		imagebutton_learnbutton4 = new ImageButton(this.leftPos + -9, this.topPos + 54, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton4.png"), 26, 26, e -> {
			if (FusionNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new GokuGUI2ButtonMessage(5, x, y, z));
				GokuGUI2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = FusionNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton4", imagebutton_learnbutton4);
		this.addRenderableWidget(imagebutton_learnbutton4);
	}
}
