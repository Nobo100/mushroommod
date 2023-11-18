
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mushroom.item.MushroomtoolsSwordItem;
import net.mcreator.mushroom.item.MushroomtoolsShovelItem;
import net.mcreator.mushroom.item.MushroomtoolsPickaxeItem;
import net.mcreator.mushroom.item.MushroomtoolsHoeItem;
import net.mcreator.mushroom.item.MushroomtoolsAxeItem;
import net.mcreator.mushroom.MushroomMod;

public class MushroomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MushroomMod.MODID);
	public static final RegistryObject<Item> MUSHROOMTOOLS_AXE = REGISTRY.register("mushroomtools_axe", () -> new MushroomtoolsAxeItem());
	public static final RegistryObject<Item> MUSHROOMTOOLS_PICKAXE = REGISTRY.register("mushroomtools_pickaxe", () -> new MushroomtoolsPickaxeItem());
	public static final RegistryObject<Item> MUSHROOMTOOLS_SWORD = REGISTRY.register("mushroomtools_sword", () -> new MushroomtoolsSwordItem());
	public static final RegistryObject<Item> MUSHROOMTOOLS_SHOVEL = REGISTRY.register("mushroomtools_shovel", () -> new MushroomtoolsShovelItem());
	public static final RegistryObject<Item> MUSHROOMTOOLS_HOE = REGISTRY.register("mushroomtools_hoe", () -> new MushroomtoolsHoeItem());
}
