
package net.mcreator.dbm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.world.inventory.StoryGUI45Menu;
import net.mcreator.dbm.procedures.SpawnSuperPerfectCellProcedure;
import net.mcreator.dbm.procedures.SetStory46Procedure;
import net.mcreator.dbm.procedures.OpenUltimateSkillsGUIProcedure;
import net.mcreator.dbm.procedures.OpenStoryGUIProcedure;
import net.mcreator.dbm.procedures.OpenStatsGUIProcedure;
import net.mcreator.dbm.procedures.OpenSkillsGUIProcedure;
import net.mcreator.dbm.procedures.OpenRacialSkillsGUIProcedure;
import net.mcreator.dbm.procedures.OpenKiAttacksGUIProcedure;
import net.mcreator.dbm.procedures.OpenIcon9Procedure;
import net.mcreator.dbm.procedures.OpenIcon8Procedure;
import net.mcreator.dbm.procedures.OpenIcon14Procedure;
import net.mcreator.dbm.procedures.OpenIcon13Procedure;
import net.mcreator.dbm.procedures.OpenIcon12Procedure;
import net.mcreator.dbm.procedures.OpenIcon11Procedure;
import net.mcreator.dbm.procedures.OpenIcon10Procedure;
import net.mcreator.dbm.procedures.OpenGroupGUIProcedure;
import net.mcreator.dbm.procedures.CloseGUIProcedure;
import net.mcreator.dbm.DbmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StoryGUI45ButtonMessage {
	private final int buttonID, x, y, z;

	public StoryGUI45ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StoryGUI45ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StoryGUI45ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StoryGUI45ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StoryGUI45Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CloseGUIProcedure.execute(entity);
		}
		if (buttonID == 1) {

			OpenStatsGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenSkillsGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenKiAttacksGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenStoryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenRacialSkillsGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenUltimateSkillsGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenGroupGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OpenIcon8Procedure.execute();
		}
		if (buttonID == 9) {

			OpenIcon9Procedure.execute();
		}
		if (buttonID == 10) {

			OpenIcon10Procedure.execute();
		}
		if (buttonID == 11) {

			OpenIcon11Procedure.execute();
		}
		if (buttonID == 12) {

			OpenIcon12Procedure.execute();
		}
		if (buttonID == 13) {

			OpenIcon13Procedure.execute();
		}
		if (buttonID == 14) {

			OpenIcon14Procedure.execute();
		}
		if (buttonID == 15) {

			SetStory46Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 16) {

			SpawnSuperPerfectCellProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbmMod.addNetworkMessage(StoryGUI45ButtonMessage.class, StoryGUI45ButtonMessage::buffer, StoryGUI45ButtonMessage::new, StoryGUI45ButtonMessage::handler);
	}
}
