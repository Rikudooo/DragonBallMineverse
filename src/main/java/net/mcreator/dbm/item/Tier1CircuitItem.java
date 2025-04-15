
package net.mcreator.dbm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier1CircuitItem extends Item {
	public Tier1CircuitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
