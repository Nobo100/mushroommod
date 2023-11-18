
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mushroom.block.PurpleOreBlock;
import net.mcreator.mushroom.block.PurpleMushroomWoodBlock;
import net.mcreator.mushroom.block.PurpleMushroomStairsBlock;
import net.mcreator.mushroom.block.PurpleMushroomSlabBlock;
import net.mcreator.mushroom.block.PurpleMushroomPressurePlateBlock;
import net.mcreator.mushroom.block.PurpleMushroomPlanksBlock;
import net.mcreator.mushroom.block.PurpleMushroomLogBlock;
import net.mcreator.mushroom.block.PurpleMushroomLeavesBlock;
import net.mcreator.mushroom.block.PurpleMushroomFenceGateBlock;
import net.mcreator.mushroom.block.PurpleMushroomFenceBlock;
import net.mcreator.mushroom.block.PurpleMushroomButtonBlock;
import net.mcreator.mushroom.block.PurpleBlockBlock;
import net.mcreator.mushroom.MushroomMod;

public class MushroomModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MushroomMod.MODID);
	public static final RegistryObject<Block> PURPLE_BLOCK = REGISTRY.register("purple_block", () -> new PurpleBlockBlock());
	public static final RegistryObject<Block> PURPLE_ORE = REGISTRY.register("purple_ore", () -> new PurpleOreBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_WOOD = REGISTRY.register("purple_mushroom_wood", () -> new PurpleMushroomWoodBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_LOG = REGISTRY.register("purple_mushroom_log", () -> new PurpleMushroomLogBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_PLANKS = REGISTRY.register("purple_mushroom_planks", () -> new PurpleMushroomPlanksBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_LEAVES = REGISTRY.register("purple_mushroom_leaves", () -> new PurpleMushroomLeavesBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_STAIRS = REGISTRY.register("purple_mushroom_stairs", () -> new PurpleMushroomStairsBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_SLAB = REGISTRY.register("purple_mushroom_slab", () -> new PurpleMushroomSlabBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_FENCE = REGISTRY.register("purple_mushroom_fence", () -> new PurpleMushroomFenceBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_FENCE_GATE = REGISTRY.register("purple_mushroom_fence_gate", () -> new PurpleMushroomFenceGateBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_PRESSURE_PLATE = REGISTRY.register("purple_mushroom_pressure_plate", () -> new PurpleMushroomPressurePlateBlock());
	public static final RegistryObject<Block> PURPLE_MUSHROOM_BUTTON = REGISTRY.register("purple_mushroom_button", () -> new PurpleMushroomButtonBlock());
}
