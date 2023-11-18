
package net.mcreator.mushroom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PurpleItem extends Item {
	public PurpleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
