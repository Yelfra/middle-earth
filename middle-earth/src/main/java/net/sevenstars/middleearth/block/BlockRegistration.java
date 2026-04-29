package net.sevenstars.middleearth.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.utils.BlockCollection;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.form.BlockForm;
import net.sevenstars.middleearth.block.utils.variant.BlockVariant;
import net.sevenstars.middleearth.datageneration.content.TranslationEntries;
import net.sevenstars.middleearth.registries.RegistryAliasesME;

import java.util.List;
import java.util.function.Function;

/**
 * Used for registering a new block or fetching an already existing vanilla block.
 */
public class BlockRegistration {

    public static Block getOrRegisterBlock(
            String name,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            List<ItemStack> group
    ) {
        if (isVanillaBlockRegistered(name)) {
            return getVanillaBlock(name);
        }

        return registerBlock(name, factory, settings, group);
    }

    public static Block getOrRegisterBlock(
            String name,
            Block block,
            List<ItemStack> group
    ) {
        if (isVanillaBlockRegistered(block)) {
            return block;
        }

        return registerBlock(name, block, group);
    }

    public static Block registerBlock(
            String name,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            List<ItemStack> group
    ) {
        // Construct block
        Block block = factory.apply(settings.registryKey(keyOfBlock(name)));

        return registerBlock(name, block, group);
    }

    public static Block registerBlock(
            String name,
            Block block,
            List<ItemStack> group
    ) {
        // Register block
        Identifier id = MiddleEarth.of(name);
        Registry.register(Registries.BLOCK, id, block);

        // Register block item
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(keyOfItem(name)));
        Registry.register(Registries.ITEM, id, item);

        Item.BLOCK_ITEMS.put(block, item);

        // Creative tab
        group.add(item.getDefaultStack());

        // Extras
        TranslationEntries.blockEntries.add(block);
        RegistryAliasesME.aliases.add(new RegistryAliasesME.Alias(Registries.BLOCK, name));
        RegistryAliasesME.aliases.add(new RegistryAliasesME.Alias(Registries.ITEM, name));

        return block;
    }

    public static <F extends Enum<F> & BlockForm> BlockFamily<F> registerBlockFamily(BlockFamily<F> blockFamily, List<ItemStack> group) {
        for (F form : blockFamily.forms()) {
            String name = normalizeName(form.getPrefix() + blockFamily.getName() + form.getSuffix());
            Block block = blockFamily.get(form);

            getOrRegisterBlock(name, block, group);
        }

        return blockFamily;
    }

    public static <F extends Enum<F> & BlockForm, V extends Enum<V> & BlockVariant> BlockCollection<V, F> registerBlockCollection(
            BlockCollection<V, F> collection, List<ItemStack> group
    ) {
        for (BlockFamily<F> family : collection) {
            registerBlockFamily(family, group);
        }

        return collection;
    }

    // TODO: @Yelfra | Move to a special utils class?
    public static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, MiddleEarth.of(name));
    }

    public static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, MiddleEarth.of(name));
    }

    private static Block getVanillaBlock(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name));
    }

    private static boolean isVanillaBlockRegistered(Block block) {
        return Registries.BLOCK.getId(block).getNamespace().equals("minecraft");
    }

    private static boolean isVanillaBlockRegistered(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name)) != Blocks.AIR;
    }

    private static String normalizeName(String name) {
        name = name.startsWith("_") ? name.substring(1) : name;
        return name.replace("bricks_", "brick_")
                .replace("tiles_", "tile_")
                .replace("block_", "");
    }
}
