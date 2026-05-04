package net.sevenstars.middleearth.block.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sevenstars.middleearth.MiddleEarth;

import java.util.List;

public class BlockUtils {
    public static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, MiddleEarth.of(name));
    }

    public static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, MiddleEarth.of(name));
    }

    public static Block getVanillaBlock(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name));
    }

    public static boolean isVanillaBlock(Block block) {
        Identifier id = Registries.BLOCK.getId(block);
        return id != null && id.getNamespace().equals("minecraft"); // id = null for yet unregistered blocks
    }

    public static boolean isVanillaBlock(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name)) != Blocks.AIR;
    }

    public static String normalizeName(String name) {
        name = name.startsWith("_") ? name.substring(1) : name;
        return name.replace("bricks_", "brick_")
                .replace("tiles_", "tile_")
                .replace("block_", "")
                .replace("_planks_", "_")
                .replace("_wood_log", "_log")
                .replace("_stem_log", "_stem")
                .replace("_stem_stem", "_stem")
                .replace("_hyphae_stem", "_stem")
                .replace("stripped_stripped_", "stripped_");
    }

    /// Block should be registered beforehand!
    @SafeVarargs
    public static void addBlockToGroups(Block block, List<ItemStack>... groups) {
        if (isVanillaBlock(block)) {
            return;
        }
        for (List<ItemStack> group : groups) {
            group.add(block.asItem().getDefaultStack());
        }
    }

    /// Blocks in family should be registered beforehand!
    @SafeVarargs
    public static void addFamilyToGroups(BlockFamily family, List<ItemStack>... groups) {
        for (Block block : family) {
            addBlockToGroups(block, groups);
        }
    }

    /// Blocks in collection should be registered beforehand!
    @SafeVarargs
    public static void addCollectionToGroups(BlockCollection<?> collection, List<ItemStack>... groups) {
        for (BlockFamily family : collection) {
            addFamilyToGroups(family, groups);
        }
    }
}
