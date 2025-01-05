
package net.mcreator.dbm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonRadarItem extends Item {
	public DragonRadarItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
