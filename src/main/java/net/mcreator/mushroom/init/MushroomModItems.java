
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mushroom.item.YellowSwordItem;
import net.mcreator.mushroom.item.YellowShovelItem;
import net.mcreator.mushroom.item.YellowPickaxeItem;
import net.mcreator.mushroom.item.YellowItem;
import net.mcreator.mushroom.item.YellowHoeItem;
import net.mcreator.mushroom.item.YellowAxeItem;
import net.mcreator.mushroom.item.YellowArmorItem;
import net.mcreator.mushroom.item.RedSwordItem;
import net.mcreator.mushroom.item.RedShovelItem;
import net.mcreator.mushroom.item.RedPickaxeItem;
import net.mcreator.mushroom.item.RedItem;
import net.mcreator.mushroom.item.RedHoeItem;
import net.mcreator.mushroom.item.RedAxeItem;
import net.mcreator.mushroom.item.RedArmorItem;
import net.mcreator.mushroom.item.PurpleSwordItem;
import net.mcreator.mushroom.item.PurpleShovelItem;
import net.mcreator.mushroom.item.PurplePickaxeItem;
import net.mcreator.mushroom.item.PurpleItem;
import net.mcreator.mushroom.item.PurpleHoeItem;
import net.mcreator.mushroom.item.PurpleAxeItem;
import net.mcreator.mushroom.item.PurpleArmorItem;
import net.mcreator.mushroom.item.BlueSwordItem;
import net.mcreator.mushroom.item.BlueShovelItem;
import net.mcreator.mushroom.item.BluePickaxeItem;
import net.mcreator.mushroom.item.BlueItem;
import net.mcreator.mushroom.item.BlueHoeItem;
import net.mcreator.mushroom.item.BlueAxeItem;
import net.mcreator.mushroom.item.BlueArmorItem;
import net.mcreator.mushroom.MushroomMod;

public class MushroomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MushroomMod.MODID);
	public static final RegistryObject<Item> PURPLE_BLOCK = block(MushroomModBlocks.PURPLE_BLOCK);
	public static final RegistryObject<Item> PURPLE_ORE = block(MushroomModBlocks.PURPLE_ORE);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_WOOD = block(MushroomModBlocks.PURPLE_MUSHROOM_WOOD);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_LOG = block(MushroomModBlocks.PURPLE_MUSHROOM_LOG);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_PLANKS = block(MushroomModBlocks.PURPLE_MUSHROOM_PLANKS);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_LEAVES = block(MushroomModBlocks.PURPLE_MUSHROOM_LEAVES);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_STAIRS = block(MushroomModBlocks.PURPLE_MUSHROOM_STAIRS);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_SLAB = block(MushroomModBlocks.PURPLE_MUSHROOM_SLAB);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_FENCE = block(MushroomModBlocks.PURPLE_MUSHROOM_FENCE);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_FENCE_GATE = block(MushroomModBlocks.PURPLE_MUSHROOM_FENCE_GATE);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_PRESSURE_PLATE = block(MushroomModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE);
	public static final RegistryObject<Item> PURPLE_MUSHROOM_BUTTON = block(MushroomModBlocks.PURPLE_MUSHROOM_BUTTON);
	public static final RegistryObject<Item> PURPLE_AXE = REGISTRY.register("purple_axe", () -> new PurpleAxeItem());
	public static final RegistryObject<Item> PURPLE_PICKAXE = REGISTRY.register("purple_pickaxe", () -> new PurplePickaxeItem());
	public static final RegistryObject<Item> PURPLE_SWORD = REGISTRY.register("purple_sword", () -> new PurpleSwordItem());
	public static final RegistryObject<Item> PURPLE_SHOVEL = REGISTRY.register("purple_shovel", () -> new PurpleShovelItem());
	public static final RegistryObject<Item> PURPLE_HOE = REGISTRY.register("purple_hoe", () -> new PurpleHoeItem());
	public static final RegistryObject<Item> PURPLE = REGISTRY.register("purple", () -> new PurpleItem());
	public static final RegistryObject<Item> PURPLE_ARMOR_HELMET = REGISTRY.register("purple_armor_helmet", () -> new PurpleArmorItem.Helmet());
	public static final RegistryObject<Item> PURPLE_ARMOR_CHESTPLATE = REGISTRY.register("purple_armor_chestplate", () -> new PurpleArmorItem.Chestplate());
	public static final RegistryObject<Item> PURPLE_ARMOR_LEGGINGS = REGISTRY.register("purple_armor_leggings", () -> new PurpleArmorItem.Leggings());
	public static final RegistryObject<Item> PURPLE_ARMOR_BOOTS = REGISTRY.register("purple_armor_boots", () -> new PurpleArmorItem.Boots());
	public static final RegistryObject<Item> RED_ARMOR_HELMET = REGISTRY.register("red_armor_helmet", () -> new RedArmorItem.Helmet());
	public static final RegistryObject<Item> RED_ARMOR_CHESTPLATE = REGISTRY.register("red_armor_chestplate", () -> new RedArmorItem.Chestplate());
	public static final RegistryObject<Item> RED_ARMOR_LEGGINGS = REGISTRY.register("red_armor_leggings", () -> new RedArmorItem.Leggings());
	public static final RegistryObject<Item> RED_ARMOR_BOOTS = REGISTRY.register("red_armor_boots", () -> new RedArmorItem.Boots());
	public static final RegistryObject<Item> RED_ORE = block(MushroomModBlocks.RED_ORE);
	public static final RegistryObject<Item> RED_BLOCK = block(MushroomModBlocks.RED_BLOCK);
	public static final RegistryObject<Item> RED = REGISTRY.register("red", () -> new RedItem());
	public static final RegistryObject<Item> RED_PICKAXE = REGISTRY.register("red_pickaxe", () -> new RedPickaxeItem());
	public static final RegistryObject<Item> RED_AXE = REGISTRY.register("red_axe", () -> new RedAxeItem());
	public static final RegistryObject<Item> RED_SWORD = REGISTRY.register("red_sword", () -> new RedSwordItem());
	public static final RegistryObject<Item> RED_SHOVEL = REGISTRY.register("red_shovel", () -> new RedShovelItem());
	public static final RegistryObject<Item> RED_HOE = REGISTRY.register("red_hoe", () -> new RedHoeItem());
	public static final RegistryObject<Item> BLUE_ARMOR_HELMET = REGISTRY.register("blue_armor_helmet", () -> new BlueArmorItem.Helmet());
	public static final RegistryObject<Item> BLUE_ARMOR_CHESTPLATE = REGISTRY.register("blue_armor_chestplate", () -> new BlueArmorItem.Chestplate());
	public static final RegistryObject<Item> BLUE_ARMOR_LEGGINGS = REGISTRY.register("blue_armor_leggings", () -> new BlueArmorItem.Leggings());
	public static final RegistryObject<Item> BLUE_ARMOR_BOOTS = REGISTRY.register("blue_armor_boots", () -> new BlueArmorItem.Boots());
	public static final RegistryObject<Item> YELLOW_ARMOR_HELMET = REGISTRY.register("yellow_armor_helmet", () -> new YellowArmorItem.Helmet());
	public static final RegistryObject<Item> YELLOW_ARMOR_CHESTPLATE = REGISTRY.register("yellow_armor_chestplate", () -> new YellowArmorItem.Chestplate());
	public static final RegistryObject<Item> YELLOW_ARMOR_LEGGINGS = REGISTRY.register("yellow_armor_leggings", () -> new YellowArmorItem.Leggings());
	public static final RegistryObject<Item> YELLOW_ARMOR_BOOTS = REGISTRY.register("yellow_armor_boots", () -> new YellowArmorItem.Boots());
	public static final RegistryObject<Item> BLUE_ORE = block(MushroomModBlocks.BLUE_ORE);
	public static final RegistryObject<Item> BLUE_BLOCK = block(MushroomModBlocks.BLUE_BLOCK);
	public static final RegistryObject<Item> YELLOW_ORE = block(MushroomModBlocks.YELLOW_ORE);
	public static final RegistryObject<Item> YELLOW_BLOCK = block(MushroomModBlocks.YELLOW_BLOCK);
	public static final RegistryObject<Item> BLUE = REGISTRY.register("blue", () -> new BlueItem());
	public static final RegistryObject<Item> YELLOW = REGISTRY.register("yellow", () -> new YellowItem());
	public static final RegistryObject<Item> BLUE_PICKAXE = REGISTRY.register("blue_pickaxe", () -> new BluePickaxeItem());
	public static final RegistryObject<Item> BLUE_AXE = REGISTRY.register("blue_axe", () -> new BlueAxeItem());
	public static final RegistryObject<Item> BLUE_SWORD = REGISTRY.register("blue_sword", () -> new BlueSwordItem());
	public static final RegistryObject<Item> BLUE_SHOVEL = REGISTRY.register("blue_shovel", () -> new BlueShovelItem());
	public static final RegistryObject<Item> BLUE_HOE = REGISTRY.register("blue_hoe", () -> new BlueHoeItem());
	public static final RegistryObject<Item> YELLOW_PICKAXE = REGISTRY.register("yellow_pickaxe", () -> new YellowPickaxeItem());
	public static final RegistryObject<Item> YELLOW_AXE = REGISTRY.register("yellow_axe", () -> new YellowAxeItem());
	public static final RegistryObject<Item> YELLOW_SWORD = REGISTRY.register("yellow_sword", () -> new YellowSwordItem());
	public static final RegistryObject<Item> YELLOW_SHOVEL = REGISTRY.register("yellow_shovel", () -> new YellowShovelItem());
	public static final RegistryObject<Item> YELLOW_HOE = REGISTRY.register("yellow_hoe", () -> new YellowHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
