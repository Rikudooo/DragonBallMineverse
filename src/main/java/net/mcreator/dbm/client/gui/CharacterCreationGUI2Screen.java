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

import net.mcreator.dbm.world.inventory.CharacterCreationGUI2Menu;
import net.mcreator.dbm.procedures.ReturnWarriorProcedure;
import net.mcreator.dbm.procedures.ReturnSpiritualistProcedure;
import net.mcreator.dbm.procedures.ReturnNeutralProcedure;
import net.mcreator.dbm.procedures.ReturnMartialArtistProcedure;
import net.mcreator.dbm.procedures.ReturnGoodProcedure;
import net.mcreator.dbm.procedures.ReturnEvilProcedure;
import net.mcreator.dbm.procedures.FightingClassProcedure;
import net.mcreator.dbm.procedures.DisplayPlayerProcedure;
import net.mcreator.dbm.procedures.AlignmentProcedure;
import net.mcreator.dbm.network.CharacterCreationGUI2ButtonMessage;
import net.mcreator.dbm.DbmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterCreationGUI2Screen extends AbstractContainerScreen<CharacterCreationGUI2Menu> {
	private final static HashMap<String, Object> guistate = CharacterCreationGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_customleft;
	ImageButton imagebutton_customright;
	ImageButton imagebutton_customleft1;
	ImageButton imagebutton_customright1;
	ImageButton imagebutton_left;
	ImageButton imagebutton_right;

	public CharacterCreationGUI2Screen(CharacterCreationGUI2Menu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallgui2.png"), this.leftPos + 119, this.topPos + -43, 0, 0, 64, 82, 64, 82);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/alignment.png"), this.leftPos + -192, this.topPos + -77, 0, 0, 62, 21, 62, 21);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/fightingclass.png"), this.leftPos + -192, this.topPos + -1, 0, 0, 62, 21, 62, 21);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + -87, this.topPos + -7, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + -28, this.topPos + -7, 0, 0, 61, 3, 61, 3);

		guiGraphics.blit(new ResourceLocation("dbm:textures/screens/smallbluebar.png"), this.leftPos + 13, this.topPos + -7, 0, 0, 61, 3, 61, 3);

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

				AlignmentProcedure.execute(entity), -165, -45, -1, false);
		guiGraphics.drawString(this.font,

				FightingClassProcedure.execute(entity), -166, 32, -1, false);
		if (ReturnGoodProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_acts_with_compassion_and_righteo"), -91, -58, -6697729, false);
		if (ReturnGoodProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_righteousness_always_striving"), -91, -49, -6697729, false);
		if (ReturnGoodProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_protect_and_help_others"), -91, -40, -6697729, false);
		if (ReturnNeutralProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_balanced_between_good_and_evil"), -91, -58, -3368449, false);
		if (ReturnNeutralProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_focused_on_personal_goals"), -91, -49, -3368449, false);
		if (ReturnNeutralProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_without_extreme_morality"), -91, -40, -3368449, false);
		if (ReturnEvilProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_driven_by_selfish_desires_using"), -91, -58, -6750208, false);
		if (ReturnEvilProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_power_to_dominate_and"), -91, -49, -6750208, false);
		if (ReturnEvilProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_to_others"), -91, -40, -6750208, false);
		if (ReturnWarriorProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_a_fighter_who_relies_on_physical"), -91, 14, -3355444, false);
		if (ReturnWarriorProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_strength_and_durability_using_k"), -91, 23, -3355444, false);
		if (ReturnWarriorProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_to_enhance_powerful"), -91, 32, -3355444, false);
		if (ReturnWarriorProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_attacks_and_defense"), -91, 41, -3355444, false);
		if (ReturnMartialArtistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_a_balanced_combatant_mastering"), -91, 14, -6697729, false);
		if (ReturnMartialArtistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_physical_and_spiritual_technique"), -91, 23, -6697729, false);
		if (ReturnMartialArtistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_combining_precision_agility_an"), -91, 32, -6697729, false);
		if (ReturnMartialArtistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_and_ki_control"), -91, 41, -6697729, false);
		if (ReturnSpiritualistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_a_specialist_in_harnessing_ki_en"), -91, 14, -16737793, false);
		if (ReturnSpiritualistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_energy_focusing_on_advanced"), -91, 23, -16737793, false);
		if (ReturnSpiritualistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_techniques_and_longrange"), -91, 32, -16737793, false);
		if (ReturnSpiritualistProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dbm.character_creation_gui_2.label_hrough_energy_manipulation"), -91, 41, -16737793, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_customleft = new ImageButton(this.leftPos + -189, this.topPos + -48, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(0, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft", imagebutton_customleft);
		this.addRenderableWidget(imagebutton_customleft);
		imagebutton_customright = new ImageButton(this.leftPos + -178, this.topPos + -48, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(1, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright", imagebutton_customright);
		this.addRenderableWidget(imagebutton_customright);
		imagebutton_customleft1 = new ImageButton(this.leftPos + -189, this.topPos + 30, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customleft1.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(2, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customleft1", imagebutton_customleft1);
		this.addRenderableWidget(imagebutton_customleft1);
		imagebutton_customright1 = new ImageButton(this.leftPos + -178, this.topPos + 30, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_customright1.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(3, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_customright1", imagebutton_customright1);
		this.addRenderableWidget(imagebutton_customright1);
		imagebutton_left = new ImageButton(this.leftPos + -195, this.topPos + 63, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_left.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(4, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left", imagebutton_left);
		this.addRenderableWidget(imagebutton_left);
		imagebutton_right = new ImageButton(this.leftPos + 71, this.topPos + 63, 11, 15, 0, 0, 15, new ResourceLocation("dbm:textures/screens/atlas/imagebutton_right.png"), 11, 30, e -> {
			if (true) {
				DbmMod.PACKET_HANDLER.sendToServer(new CharacterCreationGUI2ButtonMessage(5, x, y, z));
				CharacterCreationGUI2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right", imagebutton_right);
		this.addRenderableWidget(imagebutton_right);
	}
}
