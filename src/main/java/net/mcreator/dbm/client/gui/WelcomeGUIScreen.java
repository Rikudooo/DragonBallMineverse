package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.WelcomeGUIMenu;
import net.mcreator.dbm.network.WelcomeGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WelcomeGUIScreen extends AbstractContainerScreen<WelcomeGUIMenu> {
	private final static HashMap<String, Object> guistate = WelcomeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_right;

	public WelcomeGUIScreen(WelcomeGUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/bluedbgui.png"), this.leftPos + -112, this.topPos + -83, 0, 0, 224, 166, 224, 166);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_welcome_to_dragon_ball_mineverse"), -106, -76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_on_an_epic_journey_through_the"), -106, -67, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_dragon_ball_where_power_knows_n"), -106, -58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_train_hard_unlock_powerful_form"), -106, -49, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_challenge_legendary_foes_your_a"), -106, -40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.welcome_gui.label_to_become_the_strongest_begins_n"), -106, -31, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_right = new ImageButton(this.leftPos + 97, this.topPos + 64, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_right.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new WelcomeGUIButtonMessage(0, x, y, z));
				WelcomeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right", imagebutton_right);
		this.addRenderableWidget(imagebutton_right);
	}
}
