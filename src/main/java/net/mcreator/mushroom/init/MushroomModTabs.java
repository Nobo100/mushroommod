
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mushroom.MushroomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MushroomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MushroomMod.MODID);
	public static final RegistryObject<CreativeModeTab> MUSHROOMSCOTTAGECORE = REGISTRY.register("mushroomscottagecore",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mushroom.mushroomscottagecore")).icon(() -> new ItemStack(MushroomModItems.PURPLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MushroomModItems.PURPLE.get());
				tabData.accept(MushroomModBlocks.RED_ORE.get().asItem());
				tabData.accept(MushroomModBlocks.RED_BLOCK.get().asItem());
				tabData.accept(MushroomModItems.RED.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MUSHROOM_COTTAGE_BLOCKS = REGISTRY.register("mushroom_cottage_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mushroom.mushroom_cottage_blocks")).icon(() -> new ItemStack(MushroomModItems.PURPLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MushroomModBlocks.PURPLE_BLOCK.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_ORE.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_WOOD.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_LOG.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_PLANKS.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_LEAVES.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_STAIRS.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_SLAB.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_FENCE.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_FENCE_GATE.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE.get().asItem());
				tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_BUTTON.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MUSHROOM_COTTAGETOOLS = REGISTRY.register("mushroom_cottagetools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mushroom.mushroom_cottagetools")).icon(() -> new ItemStack(MushroomModItems.PURPLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MushroomModItems.PURPLE_AXE.get());
				tabData.accept(MushroomModItems.PURPLE_PICKAXE.get());
				tabData.accept(MushroomModItems.PURPLE_SWORD.get());
				tabData.accept(MushroomModItems.PURPLE_SHOVEL.get());
				tabData.accept(MushroomModItems.PURPLE_HOE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MushroomModItems.PURPLE_ARMOR_HELMET.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_CHESTPLATE.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_LEGGINGS.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_BOOTS.get());
			tabData.accept(MushroomModItems.RED_ARMOR_HELMET.get());
			tabData.accept(MushroomModItems.RED_ARMOR_CHESTPLATE.get());
			tabData.accept(MushroomModItems.RED_ARMOR_LEGGINGS.get());
			tabData.accept(MushroomModItems.RED_ARMOR_BOOTS.get());
			tabData.accept(MushroomModItems.RED_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MushroomModItems.RED_PICKAXE.get());
			tabData.accept(MushroomModItems.RED_AXE.get());
			tabData.accept(MushroomModItems.RED_SHOVEL.get());
			tabData.accept(MushroomModItems.RED_HOE.get());
		}
	}
}
