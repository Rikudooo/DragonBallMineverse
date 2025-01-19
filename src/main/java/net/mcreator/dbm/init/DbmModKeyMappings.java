
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dbm.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.dbm.network.UseKiAttackMessage;
import net.mcreator.dbm.network.TransformMessage;
import net.mcreator.dbm.network.ThirdFunctionMessage;
import net.mcreator.dbm.network.SpaceKeyMessage;
import net.mcreator.dbm.network.RightMessage;
import net.mcreator.dbm.network.RightKeyMessage;
import net.mcreator.dbm.network.ReleasePowerMessage;
import net.mcreator.dbm.network.MenuMessage;
import net.mcreator.dbm.network.LeftMessage;
import net.mcreator.dbm.network.LeftKeyMessage;
import net.mcreator.dbm.network.KiSenseMessage;
import net.mcreator.dbm.network.ForwardKeyMessage;
import net.mcreator.dbm.network.FlyKeyMessage;
import net.mcreator.dbm.network.FireKiBlastMessage;
import net.mcreator.dbm.network.DetransformMessage;
import net.mcreator.dbm.network.ChargeKiMessage;
import net.mcreator.dbm.network.BlockingMessage;
import net.mcreator.dbm.network.BackwardKeyMessage;
import net.mcreator.dbm.network.AltFunctionMessage;
import net.mcreator.dbm.DbmMod;

import com.mojang.blaze3d.platform.InputConstants;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DbmModKeyMappings {
	public static final KeyMapping MENU = new KeyMapping("key.dbm.menu", GLFW.GLFW_KEY_M, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MENU_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MENU_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new MenuMessage(1, dt));
				MenuMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHARGE_KI = new KeyMapping("key.dbm.charge_ki", GLFW.GLFW_KEY_X, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new ChargeKiMessage(0, 0));
				ChargeKiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_KI_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_KI_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new ChargeKiMessage(1, dt));
				ChargeKiMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRANSFORM = new KeyMapping("key.dbm.transform", GLFW.GLFW_KEY_G, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new TransformMessage(0, 0));
				TransformMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				TRANSFORM_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TRANSFORM_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new TransformMessage(1, dt));
				TransformMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FIRE_KI_BLAST = new KeyMapping("key.dbm.fire_ki_blast", GLFW.GLFW_KEY_R, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new FireKiBlastMessage(0, 0));
				FireKiBlastMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FIRE_KI_BLAST_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FIRE_KI_BLAST_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new FireKiBlastMessage(1, dt));
				FireKiBlastMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DETRANSFORM = new KeyMapping("key.dbm.detransform", GLFW.GLFW_KEY_H, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new DetransformMessage(0, 0));
				DetransformMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ALT_FUNCTION = new KeyMapping("key.dbm.alt_function", GLFW.GLFW_KEY_Z, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new AltFunctionMessage(0, 0));
				AltFunctionMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ALT_FUNCTION_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ALT_FUNCTION_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new AltFunctionMessage(1, dt));
				AltFunctionMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_KI_ATTACK = new KeyMapping("key.dbm.use_ki_attack", InputConstants.Type.MOUSE, GLFW.GLFW_MOUSE_BUTTON_RIGHT, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new UseKiAttackMessage(0, 0));
				UseKiAttackMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				USE_KI_ATTACK_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - USE_KI_ATTACK_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new UseKiAttackMessage(1, dt));
				UseKiAttackMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FORWARD_KEY = new KeyMapping("key.dbm.forward_key", GLFW.GLFW_KEY_W, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new ForwardKeyMessage(0, 0));
				ForwardKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FORWARD_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FORWARD_KEY_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new ForwardKeyMessage(1, dt));
				ForwardKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FLY_KEY = new KeyMapping("key.dbm.fly_key", GLFW.GLFW_KEY_K, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new FlyKeyMessage(0, 0));
				FlyKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPACE_KEY = new KeyMapping("key.dbm.space_key", GLFW.GLFW_KEY_SPACE, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new SpaceKeyMessage(0, 0));
				SpaceKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SPACE_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SPACE_KEY_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new SpaceKeyMessage(1, dt));
				SpaceKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RIGHT_KEY = new KeyMapping("key.dbm.right_key", GLFW.GLFW_KEY_D, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new RightKeyMessage(0, 0));
				RightKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				RIGHT_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RIGHT_KEY_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new RightKeyMessage(1, dt));
				RightKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LEFT_KEY = new KeyMapping("key.dbm.left_key", GLFW.GLFW_KEY_A, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new LeftKeyMessage(0, 0));
				LeftKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				LEFT_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LEFT_KEY_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new LeftKeyMessage(1, dt));
				LeftKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BACKWARD_KEY = new KeyMapping("key.dbm.backward_key", GLFW.GLFW_KEY_S, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new BackwardKeyMessage(0, 0));
				BackwardKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				BACKWARD_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - BACKWARD_KEY_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new BackwardKeyMessage(1, dt));
				BackwardKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RELEASE_POWER = new KeyMapping("key.dbm.release_power", GLFW.GLFW_KEY_C, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new ReleasePowerMessage(0, 0));
				ReleasePowerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				RELEASE_POWER_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RELEASE_POWER_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new ReleasePowerMessage(1, dt));
				ReleasePowerMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BLOCKING = new KeyMapping("key.dbm.blocking", GLFW.GLFW_KEY_F, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new BlockingMessage(0, 0));
				BlockingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				BLOCKING_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - BLOCKING_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new BlockingMessage(1, dt));
				BlockingMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping KI_SENSE = new KeyMapping("key.dbm.ki_sense", GLFW.GLFW_KEY_F6, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new KiSenseMessage(0, 0));
				KiSenseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				KI_SENSE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - KI_SENSE_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new KiSenseMessage(1, dt));
				KiSenseMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LEFT = new KeyMapping("key.dbm.left", GLFW.GLFW_KEY_LEFT, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				LEFT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LEFT_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new LeftMessage(1, dt));
				LeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RIGHT = new KeyMapping("key.dbm.right", GLFW.GLFW_KEY_RIGHT, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RIGHT_LASTPRESS);
				DbmMod.PACKET_HANDLER.sendToServer(new RightMessage(1, dt));
				RightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping THIRD_FUNCTION = new KeyMapping("key.dbm.third_function", GLFW.GLFW_KEY_L, "key.categories.dbm") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DbmMod.PACKET_HANDLER.sendToServer(new ThirdFunctionMessage(0, 0));
				ThirdFunctionMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long MENU_LASTPRESS = 0;
	private static long CHARGE_KI_LASTPRESS = 0;
	private static long TRANSFORM_LASTPRESS = 0;
	private static long FIRE_KI_BLAST_LASTPRESS = 0;
	private static long ALT_FUNCTION_LASTPRESS = 0;
	private static long USE_KI_ATTACK_LASTPRESS = 0;
	private static long FORWARD_KEY_LASTPRESS = 0;
	private static long SPACE_KEY_LASTPRESS = 0;
	private static long RIGHT_KEY_LASTPRESS = 0;
	private static long LEFT_KEY_LASTPRESS = 0;
	private static long BACKWARD_KEY_LASTPRESS = 0;
	private static long RELEASE_POWER_LASTPRESS = 0;
	private static long BLOCKING_LASTPRESS = 0;
	private static long KI_SENSE_LASTPRESS = 0;
	private static long LEFT_LASTPRESS = 0;
	private static long RIGHT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MENU);
		event.register(CHARGE_KI);
		event.register(TRANSFORM);
		event.register(FIRE_KI_BLAST);
		event.register(DETRANSFORM);
		event.register(ALT_FUNCTION);
		event.register(USE_KI_ATTACK);
		event.register(FORWARD_KEY);
		event.register(FLY_KEY);
		event.register(SPACE_KEY);
		event.register(RIGHT_KEY);
		event.register(LEFT_KEY);
		event.register(BACKWARD_KEY);
		event.register(RELEASE_POWER);
		event.register(BLOCKING);
		event.register(KI_SENSE);
		event.register(LEFT);
		event.register(RIGHT);
		event.register(THIRD_FUNCTION);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MENU.consumeClick();
				CHARGE_KI.consumeClick();
				TRANSFORM.consumeClick();
				FIRE_KI_BLAST.consumeClick();
				DETRANSFORM.consumeClick();
				ALT_FUNCTION.consumeClick();
				USE_KI_ATTACK.consumeClick();
				FORWARD_KEY.consumeClick();
				FLY_KEY.consumeClick();
				SPACE_KEY.consumeClick();
				RIGHT_KEY.consumeClick();
				LEFT_KEY.consumeClick();
				BACKWARD_KEY.consumeClick();
				RELEASE_POWER.consumeClick();
				BLOCKING.consumeClick();
				KI_SENSE.consumeClick();
				LEFT.consumeClick();
				RIGHT.consumeClick();
				THIRD_FUNCTION.consumeClick();
			}
		}
	}
}
