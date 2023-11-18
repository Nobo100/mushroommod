
package net.mcreator.mushroom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueItem extends Item {
	public BlueItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
