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
import net.sevenstars.middleearth.datageneration.content.TranslationEntries;
import net.sevenstars.middleearth.registries.RegistryAliasesME;

import java.util.List;
import java.util.function.Function;

/**
 * Used for registering a new block or fetching an already existing vanilla block
 */
public class BlockRegistration {

    public static Block getOrRegisterBlock(
            String name,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            List<ItemStack> group
    ) {
        // Get vanilla block if already registered
        if (isVanillaBlockRegistered(name)) {
            return getVanillaBlock(name);
        }

        return registerBlock(name, factory, settings, group);
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
            String name = blockFamily.getName();
            if (form != BasicBlockForm.BASE) {
                name = normalizeName(name);
            }
            name = form.getPrefix() + name + form.getSuffix();

            Block block = blockFamily.get(form);
            registerBlock(name, block, group);
        }

        return blockFamily;
    }

    public static Block getVanillaBlock(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name));
    }

    public static boolean isVanillaBlockRegistered(String name) {
        return Registries.BLOCK.get(Identifier.ofVanilla(name)) != Blocks.AIR;
    }

    // TODO: @Yelfra | Move to a special utils class?
    public static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, MiddleEarth.of(name));
    }

    public static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, MiddleEarth.of(name));
    }

    private static String normalizeName(String name) {
        return name.replace("_bricks", "_brick")
                .replace("_tiles", "_tile")
                .replace("_block", "");
    }
}
