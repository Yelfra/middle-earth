package net.sevenstars.middleearth.block.utils.variant;

import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;

import java.util.function.Supplier;

import static net.sevenstars.middleearth.block.utils.form.BlockFormSet.*;
import static net.sevenstars.middleearth.block.utils.form.WoodBlockForm.LEAVES;
import static net.sevenstars.middleearth.block.utils.form.WoodBlockForm.LEAVES_ALT;

public enum WoodBlockVariant implements BlockVariant {
    // @formatter:off
    WOOD_BLOCKS             ("", "_wood",               () -> BlockConfig.WOOD().formSet(WOOD).pillar(),                    5, 5),
    STRIPPED_WOOD_BLOCKS    ("stripped_", "_wood",      () -> BlockConfig.WOOD().formSet(STRIPPED_WOOD).pillar(),           5, 5),

    HYPHAE_BLOCKS           ("", "_hyphae",             () -> BlockConfig.MUSHROOM().formSet(HYPHAE).pillar(),              0, 0),
    STEM_BLOCKS             ("", "_stem",               () -> BlockConfig.MUSHROOM().formSet(MUSHROOM),                     0, 0),
    STRIPPED_HYPHAE_BLOCKS  ("stripped_", "_hyphae",    () -> BlockConfig.MUSHROOM().formSet(STRIPPED_HYPHAE).pillar(),     0, 0),

    PLANK_BLOCKS            ("", "_planks",             () -> BlockConfig.PLANKS().formSet(PLANKS),                         20, 5),
    REDSTONE_BLOCKS         ("", "",                    () -> BlockConfig.PLANKS().formSet(REDSTONE),                       20, 5),
    FURNITURE_BLOCKS        ("", "",                    () -> BlockConfig.PLANKS().formSet(FURNITURE),                      20, 5),

    ROOFING_BLOCKS          ("", "_roofing",            () -> BlockConfig.PLANKS().formSet(REGULAR),                        20, 5),
    SHINGLE_BLOCKS          ("", "_shingles",           () -> BlockConfig.PLANKS().formSet(REGULAR),                        20, 5),

    LEAF_BLOCKS             ("", "",                    () -> BlockConfig.LEAVES().formSet(new BlockFormSet(LEAVES)),       60, 30),
    LEAF_BLOCKS_ALT         ("", "",                    () -> BlockConfig.LEAVES().formSet(new BlockFormSet(LEAVES_ALT)),   60, 30);
    // @formatter:on

    private final String prefix;
    private final String suffix;
    private final Supplier<BlockConfig> config;
    private final int burn;
    private final int spread;

    WoodBlockVariant(String prefix, String suffix, Supplier<BlockConfig> config, int burn, int spread) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.config = config;
        this.burn = burn;
        this.spread = spread;
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
    public BlockConfig getConfig() {
        return config.get();
    }

    public int getBurn() {
        return burn;
    }

    public int getSpread() {
        return spread;
    }
}