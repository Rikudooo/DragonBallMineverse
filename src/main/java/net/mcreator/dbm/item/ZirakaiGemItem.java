
package net.mcreator.dbm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZirakaiGemItem extends Item {
	public ZirakaiGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
