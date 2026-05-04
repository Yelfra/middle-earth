package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.special.plants.ModLeavesBlock;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.List;

public enum WoodBlockForm implements BlockForm {
    // @formatter:off
    LOG             ("", "_log",        (config, base) -> createLog(config, base)),
    STEM            ("", "_stem",       (config, base) -> createStem(config, base)),
    HYPHAE_STEM     ("", "_stem",       (config, base) -> createLog(config, base)),

    // Separation of normal and stripped forms is entirely for easier item grouping
    STRIPPED_LOG             ("stripped_", "_log",        (config, base) -> createLog(config, base)),
    STRIPPED_STEM            ("stripped_", "_stem",       (config, base) -> createStem(config, base)),
    STRIPPED_HYPHAE_STEM     ("stripped_", "_stem",       (config, base) -> createLog(config, base)),

    FENCE           ("", "_fence",      (config, base) -> createFence(config)),

    FENCE_GATE      ("", "_gate",       (config, base) -> createFenceGate(config)),

    LEAVES          ("", "_leaves",     (config, base) -> createLeaves()),
    LEAVES_ALT      ("", "_leaves",     (config, base) -> createLeavesAlt());
    // @formatter:on

    private final String prefix;
    private final String suffix;
    private final FormFactory<BlockConfig, Block, Block> factory;

    private static final WoodType WOOD_TYPE = WoodType.OAK; // FenceGateBlock requires a WoodType

    WoodBlockForm(String prefix, String suffix, FormFactory<BlockConfig, Block, Block> factory) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.factory = factory;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public Block create(BlockConfig config, Block base) {
        return factory.apply(config, base);
    }

    @Override
    public List<List<ItemStack>> getItemGroups() {
        return switch (this) {
            case LOG, STEM, HYPHAE_STEM ->
                    List.of(ItemGroupsME.WOOD_BLOCKS_CONTENTS, ItemGroupsME.NATURE_BLOCKS_CONTENTS);
            case LEAVES, LEAVES_ALT -> List.of(ItemGroupsME.NATURE_BLOCKS_CONTENTS);
            default -> List.of(ItemGroupsME.WOOD_BLOCKS_CONTENTS);
        };
    }

    /* Form Constructors */
    private static Block createLog(BlockConfig config, Block base) {
        if (base != null) {
            return base;
        }

        return new PillarBlock(config.settings);
    }

    private static Block createStem(BlockConfig config, Block base) {
        if (base != null) {
            return base;
        }

        return new MushroomBlock(config.settings);
    }

    private static Block createFence(BlockConfig config) {
        return new FenceBlock(config.settings.nonOpaque());
    }

    private static Block createFenceGate(BlockConfig config) {
        return new FenceGateBlock(WOOD_TYPE, config.settings.nonOpaque());
    }

    private static Block createLeaves() {
        return new TintedParticleLeavesBlock(0.01f, BlockConfig.LEAVES().settings);
    }

    private static Block createLeavesAlt() {
        return new ModLeavesBlock(0.01f, BlockConfig.LEAVES().settings, false);
    }
}
