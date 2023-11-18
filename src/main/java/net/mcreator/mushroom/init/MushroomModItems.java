
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

import net.mcreator.mushroom.item.PurpleSwordItem;
import net.mcreator.mushroom.item.PurpleShovelItem;
import net.mcreator.mushroom.item.PurplePickaxeItem;
import net.mcreator.mushroom.item.PurpleItem;
import net.mcreator.mushroom.item.PurpleHoeItem;
import net.mcreator.mushroom.item.PurpleAxeItem;
import net.mcreator.mushroom.item.PurpleArmorItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
