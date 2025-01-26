package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.YardratGUI2Menu;
import net.mcreator.dbm.procedures.ReturnITNotOwnedProcedure;
import net.mcreator.dbm.network.YardratGUI2ButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class YardratGUI2Screen extends AbstractContainerScreen<YardratGUI2Menu> {
	private final static HashMap<String, Object> guistate = YardratGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_dialogexit;
	ImageButton imagebutton_learnbutton;

	public YardratGUI2Screen(YardratGUI2Menu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/learngui.png"), this.leftPos + -186, this.topPos + -23, 0, 0, 365, 125, 365, 125);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/yardratface.png"), this.leftPos + -173, this.topPos + -17, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/instanttransmissionicon2.png"), this.leftPos + -143, this.topPos + 35, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.yardrat_gui_2.label_king_enma"), -133, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.yardrat_gui_2.label_kaioken_15000_tp"), -127, 38, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_dialogexit = new ImageButton(this.leftPos + 168, this.topPos + 22, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogexit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new YardratGUI2ButtonMessage(0, x, y, z));
				YardratGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogexit", imagebutton_dialogexit);
		this.addRenderableWidget(imagebutton_dialogexit);
		imagebutton_learnbutton = new ImageButton(this.leftPos + -169, this.topPos + 36, 26, 13, 0, 0, 13, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_learnbutton.png"), 26, 26, e -> {
			if (ReturnITNotOwnedProcedure.execute(entity)) {
				DbmMod.PACKET_HANDLER.sendToServer(new YardratGUI2ButtonMessage(1, x, y, z));
				YardratGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ReturnITNotOwnedProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_learnbutton", imagebutton_learnbutton);
		this.addRenderableWidget(imagebutton_learnbutton);
	}
}
