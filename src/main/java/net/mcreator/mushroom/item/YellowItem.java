
package net.mcreator.mushroom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class YellowItem extends Item {
	public YellowItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
