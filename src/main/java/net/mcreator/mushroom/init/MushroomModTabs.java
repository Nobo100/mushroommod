
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mushroom.MushroomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MushroomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MushroomMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_FENCE_GATE.get().asItem());
			tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MushroomModItems.PURPLE_SWORD.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_HELMET.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_CHESTPLATE.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_LEGGINGS.get());
			tabData.accept(MushroomModItems.PURPLE_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_LEAVES.get().asItem());
			tabData.accept(MushroomModBlocks.PURPLE_MUSHROOM_FENCE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MushroomModItems.PURPLE_AXE.get());
			tabData.accept(MushroomModItems.PURPLE_PICKAXE.get());
			tabData.accept(MushroomModItems.PURPLE_SHOVEL.get());
			tabData.accept(MushroomModItems.PURPLE_HOE.get());
		}
	}
}
