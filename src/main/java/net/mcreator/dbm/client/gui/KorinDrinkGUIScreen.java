package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.KorinDrinkGUIMenu;
import net.mcreator.dbm.network.KorinDrinkGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KorinDrinkGUIScreen extends AbstractContainerScreen<KorinDrinkGUIMenu> {
	private final static HashMap<String, Object> guistate = KorinDrinkGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_dialogexit;
	ImageButton imagebutton_drinkbutton;

	public KorinDrinkGUIScreen(KorinDrinkGUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/korinface.png"), this.leftPos + -189, this.topPos + -12, 0, 0, 34, 32, 34, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.korin_drink_gui.label_king_enma"), -154, 11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.korin_drink_gui.label_hello_there_so_youre_dead_hu"), -181, 32, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.korin_drink_gui.label_be_fully_released_you_will_also"), -181, 41, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.korin_drink_gui.label_theres_only_a_10_it_works_els"), -181, 50, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_dialogexit = new ImageButton(this.leftPos + 179, this.topPos + 25, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogexit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KorinDrinkGUIButtonMessage(0, x, y, z));
				KorinDrinkGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogexit", imagebutton_dialogexit);
		this.addRenderableWidget(imagebutton_dialogexit);
		imagebutton_drinkbutton = new ImageButton(this.leftPos + 104, this.topPos + 77, 68, 29, 0, 0, 29, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_drinkbutton.png"), 68, 58, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new KorinDrinkGUIButtonMessage(1, x, y, z));
				KorinDrinkGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_drinkbutton", imagebutton_drinkbutton);
		this.addRenderableWidget(imagebutton_drinkbutton);
	}
}
