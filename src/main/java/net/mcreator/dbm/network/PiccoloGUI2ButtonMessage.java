
package net.mcreator.dbm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.PiccoloGUI2Menu;
import net.mcreator.dbm.procedures.LearnMakankosappoProcedure;
import net.mcreator.dbm.procedures.LearnKiWaveProcedure;
import net.mcreator.dbm.procedures.LearnGiantKiBlastProcedure;
import net.mcreator.dbm.procedures.CloseGUIProcedure;
import net.mcreator.dbm.DbmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PiccoloGUI2ButtonMessage {
	private final int buttonID, x, y, z;

	public PiccoloGUI2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PiccoloGUI2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PiccoloGUI2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PiccoloGUI2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = PiccoloGUI2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CloseGUIProcedure.execute(entity);
		}
		if (buttonID == 1) {

			LearnKiWaveProcedure.execute(entity);
		}
		if (buttonID == 2) {

			LearnMakankosappoProcedure.execute(entity);
		}
		if (buttonID == 3) {

			LearnGiantKiBlastProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(PiccoloGUI2ButtonMessage.class, PiccoloGUI2ButtonMessage::buffer, PiccoloGUI2ButtonMessage::new, PiccoloGUI2ButtonMessage::handler);
	}
}
