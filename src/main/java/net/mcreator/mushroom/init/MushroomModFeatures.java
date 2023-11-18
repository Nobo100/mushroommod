
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mushroom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mushroom.world.features.ores.RedOreFeature;
import net.mcreator.mushroom.world.features.ores.PurpleOreFeature;
import net.mcreator.mushroom.MushroomMod;

@Mod.EventBusSubscriber
public class MushroomModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MushroomMod.MODID);
	public static final RegistryObject<Feature<?>> PURPLE_ORE = REGISTRY.register("purple_ore", PurpleOreFeature::new);
	public static final RegistryObject<Feature<?>> RED_ORE = REGISTRY.register("red_ore", RedOreFeature::new);
}
