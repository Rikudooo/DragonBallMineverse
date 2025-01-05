
package net.mcreator.dbm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.CharacterCreationGUI2Menu;
import net.mcreator.dbm.procedures.OpenFinishGUIProcedure;
import net.mcreator.dbm.procedures.OpenCreationGUIProcedure;
import net.mcreator.dbm.procedures.FightingClassRightProcedure;
import net.mcreator.dbm.procedures.FightingClassLeftProcedure;
import net.mcreator.dbm.procedures.AlignmentRightProcedure;
import net.mcreator.dbm.procedures.AlignmentLeftProcedure;
import net.mcreator.dbm.DbmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CharacterCreationGUI2ButtonMessage {
	private final int buttonID, x, y, z;

	public CharacterCreationGUI2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CharacterCreationGUI2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CharacterCreationGUI2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CharacterCreationGUI2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CharacterCreationGUI2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AlignmentLeftProcedure.execute(entity);
		}
		if (buttonID == 1) {

			AlignmentRightProcedure.execute(entity);
		}
		if (buttonID == 2) {

			FightingClassLeftProcedure.execute(entity);
		}
		if (buttonID == 3) {

			FightingClassRightProcedure.execute(entity);
		}
		if (buttonID == 4) {

			OpenCreationGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenFinishGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(CharacterCreationGUI2ButtonMessage.class, CharacterCreationGUI2ButtonMessage::buffer, CharacterCreationGUI2ButtonMessage::new, CharacterCreationGUI2ButtonMessage::handler);
	}
}
