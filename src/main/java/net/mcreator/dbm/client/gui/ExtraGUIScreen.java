package net.mcreator.dbm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dbm.world.inventory.ExtraGUIMenu;
import net.mcreator.dbm.procedures.DisplayPlayerProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ExtraGUIScreen extends AbstractContainerScreen<ExtraGUIMenu> {
	private final static HashMap<String, Object> guistate = ExtraGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ExtraGUIScreen(ExtraGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 188;
	}

	private static final ResourceLocation texture = new ResourceLocation("dbm:textures/screens/extra_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (DisplayPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 43, this.topPos + 80, 30, 0f + (float) Math.atan((this.leftPos + 43 - mouseX) / 40.0), (float) Math.atan((this.topPos + 31 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/playerinput.png"), this.leftPos + 18, this.topPos + 17, 0, 0, 50, 66, 50, 66);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/scouter.png"), this.leftPos + 97, this.topPos + 37, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/weights.png"), this.leftPos + 97, this.topPos + 55, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.extra_gui.label_inventory"), 6, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.extra_gui.label_extra_slots"), 4, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
