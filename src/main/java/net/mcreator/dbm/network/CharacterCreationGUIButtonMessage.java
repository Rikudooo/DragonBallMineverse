
package net.mcreator.dbm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.CharacterCreationGUIMenu;
import net.mcreator.dbm.procedures.WidthleftProcedure;
import net.mcreator.dbm.procedures.WidthRightProcedure;
import net.mcreator.dbm.procedures.Skin4RightProcedure;
import net.mcreator.dbm.procedures.Skin4LeftProcedure;
import net.mcreator.dbm.procedures.Skin3RightProcedure;
import net.mcreator.dbm.procedures.Skin3LeftProcedure;
import net.mcreator.dbm.procedures.Skin2RightProcedure;
import net.mcreator.dbm.procedures.Skin2LeftProcedure;
import net.mcreator.dbm.procedures.Skin1RightProcedure;
import net.mcreator.dbm.procedures.Skin1LeftProcedure;
import net.mcreator.dbm.procedures.SetTailTrueFalseProcedure;
import net.mcreator.dbm.procedures.SelectRaceRightProcedure;
import net.mcreator.dbm.procedures.SelectRaceLeftProcedure;
import net.mcreator.dbm.procedures.OpenCreation2GUIProcedure;
import net.mcreator.dbm.procedures.MouthRightProcedure;
import net.mcreator.dbm.procedures.MouthLeftProcedure;
import net.mcreator.dbm.procedures.MenuOnKeyReleasedProcedure;
import net.mcreator.dbm.procedures.HeightRightProcedure;
import net.mcreator.dbm.procedures.HeightLeftProcedure;
import net.mcreator.dbm.procedures.HairRightProcedure;
import net.mcreator.dbm.procedures.HairLeftProcedure;
import net.mcreator.dbm.procedures.HairColorRightProcedure;
import net.mcreator.dbm.procedures.HairColorLeftProcedure;
import net.mcreator.dbm.procedures.EyesRightProcedure;
import net.mcreator.dbm.procedures.EyesLeftProcedure;
import net.mcreator.dbm.procedures.EyesColorRightProcedure;
import net.mcreator.dbm.procedures.EyesColorLeftProcedure;
import net.mcreator.dbm.procedures.EyebrowsRightProcedure;
import net.mcreator.dbm.procedures.EyebrowsLeftProcedure;
import net.mcreator.dbm.DbmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CharacterCreationGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CharacterCreationGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CharacterCreationGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CharacterCreationGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CharacterCreationGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CharacterCreationGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SelectRaceLeftProcedure.execute(entity);
		}
		if (buttonID == 1) {

			SelectRaceRightProcedure.execute(entity);
		}
		if (buttonID == 2) {

			HairLeftProcedure.execute(entity);
		}
		if (buttonID == 3) {

			HairRightProcedure.execute(entity);
		}
		if (buttonID == 4) {

			HairColorLeftProcedure.execute(entity);
		}
		if (buttonID == 5) {

			HairColorRightProcedure.execute(entity);
		}
		if (buttonID == 6) {

			EyebrowsLeftProcedure.execute(entity);
		}
		if (buttonID == 7) {

			EyebrowsRightProcedure.execute(entity);
		}
		if (buttonID == 8) {

			EyesLeftProcedure.execute(entity);
		}
		if (buttonID == 9) {

			EyesRightProcedure.execute(entity);
		}
		if (buttonID == 10) {

			EyesColorLeftProcedure.execute(entity);
		}
		if (buttonID == 11) {

			EyesColorRightProcedure.execute(entity);
		}
		if (buttonID == 12) {

			MouthLeftProcedure.execute(entity);
		}
		if (buttonID == 13) {

			MouthRightProcedure.execute(entity);
		}
		if (buttonID == 14) {

			Skin1LeftProcedure.execute(entity);
		}
		if (buttonID == 15) {

			Skin1RightProcedure.execute(entity);
		}
		if (buttonID == 16) {

			Skin2LeftProcedure.execute(entity);
		}
		if (buttonID == 17) {

			Skin2RightProcedure.execute(entity);
		}
		if (buttonID == 18) {

			Skin3LeftProcedure.execute(entity);
		}
		if (buttonID == 19) {

			Skin3RightProcedure.execute(entity);
		}
		if (buttonID == 20) {

			Skin4LeftProcedure.execute(entity);
		}
		if (buttonID == 21) {

			Skin4RightProcedure.execute(entity);
		}
		if (buttonID == 22) {

			MenuOnKeyReleasedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 23) {

			OpenCreation2GUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 24) {

			SetTailTrueFalseProcedure.execute(entity);
		}
		if (buttonID == 25) {

			HeightLeftProcedure.execute(entity);
		}
		if (buttonID == 26) {

			HeightRightProcedure.execute(entity);
		}
		if (buttonID == 27) {

			WidthleftProcedure.execute(entity);
		}
		if (buttonID == 28) {

			WidthRightProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(CharacterCreationGUIButtonMessage.class, CharacterCreationGUIButtonMessage::buffer, CharacterCreationGUIButtonMessage::new, CharacterCreationGUIButtonMessage::handler);
	}
}
