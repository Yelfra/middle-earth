package net.sevenstars.middleearth.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.utils.BlockCollection;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.BlockUtils;
import net.sevenstars.middleearth.block.utils.form.BlockForm;
import net.sevenstars.middleearth.block.utils.variant.BlockVariant;
import net.sevenstars.middleearth.datageneration.content.TranslationEntries;
import net.sevenstars.middleearth.registries.RegistryAliasesME;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Used for registering a new block or fetching an already existing vanilla block.
 */
public class BlockRegistration {

    @SafeVarargs
    public static Block getOrRegisterBlock(
            String name,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            List<ItemStack>... itemGroups
    ) {
        if (BlockUtils.isVanillaBlock(name)) {
            return BlockUtils.getVanillaBlock(name);
        }

        return registerBlock(name, factory, settings, itemGroups);
    }

    @SafeVarargs
    public static Block getOrRegisterBlock(
            String name,
            Block block,
            List<ItemStack>... itemGroup
    ) {
        if (BlockUtils.isVanillaBlock(block)) {
            return block;
        }

        return registerBlock(name, block, itemGroup);
    }

    @SafeVarargs
    public static Block registerBlock(
            String name,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            List<ItemStack>... itemGroups
    ) {
        // Construct block
        Block block = factory.apply(settings.registryKey(BlockUtils.keyOfBlock(name)));

        return registerBlock(name, block, itemGroups);
    }

    @SafeVarargs
    public static Block registerBlock(
            String name,
            Block block,
            List<ItemStack>... itemGroups
    ) {
        // Register block
        Identifier id = MiddleEarth.of(name);
        Registry.register(Registries.BLOCK, id, block);

        // Register block item
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(BlockUtils.keyOfItem(name)));
        Registry.register(Registries.ITEM, id, item);

        Item.BLOCK_ITEMS.put(block, item);

        // Creative tab
        for (List<ItemStack> group : itemGroups) {
            group.add(item.getDefaultStack());
        }

        // Extras
        TranslationEntries.blockEntries.add(block);
        RegistryAliasesME.aliases.add(new RegistryAliasesME.Alias(Registries.BLOCK, name));
        RegistryAliasesME.aliases.add(new RegistryAliasesME.Alias(Registries.ITEM, name));

        return block;
    }

    @SafeVarargs
    public static BlockFamily registerBlockFamily(BlockFamily blockFamily, List<ItemStack>... itemGroups) {
        for (BlockForm form : blockFamily.forms()) {
            String name = BlockUtils.normalizeName(form.getPrefix() + blockFamily.getName() + form.getSuffix());

            List<List<ItemStack>> formGroups = new ArrayList<>(form.getItemGroups());

            for (List<ItemStack> group : itemGroups) {
                if (!formGroups.contains(group)) {
                    formGroups.add(group);
                }
            }

            Block block = getOrRegisterBlock(
                    name,
                    blockFamily.get(form),
                    formGroups.toArray(List[]::new)
            );

            blockFamily.put(form, block);
        }

        return blockFamily;
    }

    @SafeVarargs
    public static <V extends Enum<V> & BlockVariant> BlockCollection<V> registerBlockCollection(
            BlockCollection<V> collection, List<ItemStack>... itemGroups
    ) {
        for (BlockFamily family : collection) {
            registerBlockFamily(family, itemGroups);
        }

        return collection;
    }

    /// For blocks such as fire, water, lava blocks, etc. - which aren't obtainable by themselves.
    public static Block registerBlockWithoutItem(
            String name,
            Block block
    ) {
        // Register block
        Identifier id = MiddleEarth.of(name);
        Registry.register(Registries.BLOCK, id, block);

        return block;
    }
}
