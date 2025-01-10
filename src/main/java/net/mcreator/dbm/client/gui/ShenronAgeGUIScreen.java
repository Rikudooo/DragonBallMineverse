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
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.dbm.world.inventory.ShenronAgeGUIMenu;
import net.mcreator.dbm.procedures.TextDemandsProcedure;
import net.mcreator.dbm.procedures.ReturnShenronProcedure;
import net.mcreator.dbm.network.ShenronAgeGUIButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShenronAgeGUIScreen extends AbstractContainerScreen<ShenronAgeGUIMenu> {
	private final static HashMap<String, Object> guistate = ShenronAgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox playername;
	EditBox enterage;
	ImageButton imagebutton_dialogexit;
	ImageButton imagebutton_dialogback;
	ImageButton imagebutton_changebutton;

	public ShenronAgeGUIScreen(ShenronAgeGUIMenu container, Inventory inventory, Component text) {
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
		playername.render(guiGraphics, mouseX, mouseY, partialTicks);
		enterage.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnShenronProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 20, 3, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + -29 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/dialogbox.png"), this.leftPos + -190, this.topPos + 23, 0, 0, 380, 90, 380, 90);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (playername.isFocused())
			return playername.keyPressed(key, b, c);
		if (enterage.isFocused())
			return enterage.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		playername.tick();
		enterage.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String playernameValue = playername.getValue();
		String enterageValue = enterage.getValue();
		super.resize(minecraft, width, height);
		playername.setValue(playernameValue);
		enterage.setValue(enterageValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.shenron_age_gui.label_king_enma"), -188, 11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dbm.shenron_age_gui.label_hello_there_so_youre_dead_hu"), -181, 32, -16724992, false);
		guiGraphics.drawString(this.font,

				TextDemandsProcedure.execute(world), 126, 12, -1, false);
	}

	@Override
	public void init() {
		super.init();
		playername = new EditBox(this.font, this.leftPos + -171, this.topPos + 51, 133, 18, Component.translatable("gui.dbm.shenron_age_gui.playername")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.playername").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.playername").getString());
				else
					setSuggestion(null);
			}
		};
		playername.setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.playername").getString());
		playername.setMaxLength(32767);
		guistate.put("text:playername", playername);
		this.addWidget(this.playername);
		enterage = new EditBox(this.font, this.leftPos + -171, this.topPos + 78, 25, 18, Component.translatable("gui.dbm.shenron_age_gui.enterage")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.enterage").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.enterage").getString());
				else
					setSuggestion(null);
			}
		};
		enterage.setSuggestion(Component.translatable("gui.dbm.shenron_age_gui.enterage").getString());
		enterage.setMaxLength(32767);
		guistate.put("text:enterage", enterage);
		this.addWidget(this.enterage);
		imagebutton_dialogexit = new ImageButton(this.leftPos + 179, this.topPos + 25, 9, 9, 0, 0, 9, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogexit.png"), 9, 18, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new ShenronAgeGUIButtonMessage(0, x, y, z));
				ShenronAgeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogexit", imagebutton_dialogexit);
		this.addRenderableWidget(imagebutton_dialogexit);
		imagebutton_dialogback = new ImageButton(this.leftPos + -188, this.topPos + 93, 12, 18, 0, 0, 18, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_dialogback.png"), 12, 36, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new ShenronAgeGUIButtonMessage(1, x, y, z));
				ShenronAgeGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dialogback", imagebutton_dialogback);
		this.addRenderableWidget(imagebutton_dialogback);
		imagebutton_changebutton = new ImageButton(this.leftPos + -98, this.topPos + 80, 60, 21, 0, 0, 21, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_changebutton.png"), 60, 42, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new ShenronAgeGUIButtonMessage(2, x, y, z));
				ShenronAgeGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_changebutton", imagebutton_changebutton);
		this.addRenderableWidget(imagebutton_changebutton);
	}
}
