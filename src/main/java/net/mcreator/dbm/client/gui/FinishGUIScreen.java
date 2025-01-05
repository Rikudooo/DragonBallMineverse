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

import net.mcreator.dbm.world.inventory.FinishGUIMenu;
import net.mcreator.dbm.procedures.StrengthTextProcedure;
import net.mcreator.dbm.procedures.SpeedTextProcedure;
import net.mcreator.dbm.procedures.RaceTextProcedure;
import net.mcreator.dbm.procedures.NameTextProcedure;
import net.mcreator.dbm.procedures.MaxStaminaTextProcedure;
import net.mcreator.dbm.procedures.MaxKiTextProcedure;
import net.mcreator.dbm.procedures.MaxHealthTextProcedure;
import net.mcreator.dbm.procedures.KiPowerTextProcedure;
import net.mcreator.dbm.procedures.FightingClassTextProcedure;
import net.mcreator.dbm.procedures.DisplayPlayerProcedure;
import net.mcreator.dbm.procedures.DefenseTextProcedure;
import net.mcreator.dbm.procedures.AlignmentTextProcedure;
import net.mcreator.dbm.network.FinishGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FinishGUIScreen extends AbstractContainerScreen<FinishGUIMenu> {
	private final static HashMap<String, Object> guistate = FinishGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_left;
	ImageButton imagebutton_next;

	public FinishGUIScreen(FinishGUIMenu container, Inventory inventory, Component text) {
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
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 35, 30, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + -14 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/customformforgegui2.png"), this.leftPos + -144, this.topPos + -84, 0, 0, 285, 166, 285, 166);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallgui2.png"), this.leftPos + -33, this.topPos + -43, 0, 0, 64, 82, 64, 82);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 51, this.topPos + -58, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + -115, this.topPos + -58, 0, 0, 61, 3, 61, 3);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.finish_gui.label_player_info"), 53, -68, -10053121, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.finish_gui.label_player_stats"), -115, -68, -10053121, false);
		guiGraphics.drawString(this.font,

				NameTextProcedure.execute(entity), 44, -49, -1, false);
		guiGraphics.drawString(this.font,

				RaceTextProcedure.execute(entity), 44, -31, -1, false);
		guiGraphics.drawString(this.font,

				AlignmentTextProcedure.execute(entity), 44, -13, -1, false);
		guiGraphics.drawString(this.font,

				FightingClassTextProcedure.execute(entity), 44, 5, -1, false);
		guiGraphics.drawString(this.font,

				MaxHealthTextProcedure.execute(entity), -118, -49, -1, false);
		guiGraphics.drawString(this.font,

				MaxKiTextProcedure.execute(entity), -118, -36, -1, false);
		guiGraphics.drawString(this.font,

				MaxStaminaTextProcedure.execute(entity), -118, -23, -1, false);
		guiGraphics.drawString(this.font,

				StrengthTextProcedure.execute(entity), -118, -9, -1, false);
		guiGraphics.drawString(this.font,

				SpeedTextProcedure.execute(entity), -118, 6, -1, false);
		guiGraphics.drawString(this.font,

				DefenseTextProcedure.execute(entity), -118, 20, -1, false);
		guiGraphics.drawString(this.font,

				KiPowerTextProcedure.execute(entity), -118, 35, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_left = new ImageButton(this.leftPos + -140, this.topPos + 63, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_left.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new FinishGUIButtonMessage(0, x, y, z));
				FinishGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left", imagebutton_left);
		this.addRenderableWidget(imagebutton_left);
		imagebutton_next = new ImageButton(this.leftPos + 93, this.topPos + 63, 44, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_next.png"), 44, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new FinishGUIButtonMessage(1, x, y, z));
				FinishGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next", imagebutton_next);
		this.addRenderableWidget(imagebutton_next);
	}
}
