package net.sevenstars.middleearth.block.utils.variant;

import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.List;
import java.util.function.Supplier;

import static net.sevenstars.middleearth.block.utils.form.BlockFormSet.*;

public enum StoneBlockVariant implements BlockVariant {
    // @formatter:off
    // TODO: @Yelfra | Some pillar variants such as POLISHED_BLOCKS_PILLAR in StoneBlockSets weren't marked as pillars
    BASE_BLOCKS                     ("", "",                            () -> BlockConfig.STONE().formSet(REGULAR)),
    DECORATIONS                     ("", "",                            () -> BlockConfig.STONE().formSet(STONE_DECOR)),
    REDSTONE_BLOCKS                 ("", "",                            () -> BlockConfig.STONE().formSet(STONE_REDSTONE)),

    COBBLESTONES                    ("cobble", "",                      () -> BlockConfig.COBBLESTONE().formSet(REGULAR), 0.5f),
    MOSSY_COBBLESTONES              ("mossy_cobble", "",                () -> BlockConfig.COBBLESTONE().formSet(REGULAR), 0.5f),
    COBBLED_BLOCKS                  ("cobbled_", "",                    () -> BlockConfig.COBBLESTONE().formSet(REGULAR), 0.5f),
    MOSSY_COBBLED_BLOCKS            ("mossy_cobbled_", "",              () -> BlockConfig.COBBLESTONE().formSet(REGULAR), 0.5f),

    BRICKS                          ("", "_bricks",                     () -> BlockConfig.STONE().formSet(REGULAR)),
    MOSSY_BRICKS                    ("mossy_", "_bricks",               () -> BlockConfig.STONE().formSet(REGULAR)),
    CRACKED_BRICKS                  ("cracked_", "_bricks",             () -> BlockConfig.STONE().formSet(REGULAR)),

    POLISHED_BRICKS                 ("polished_", "_bricks",            () -> BlockConfig.STONE().formSet(REGULAR)),
    MOSSY_POLISHED_BRICKS           ("mossy_polished_", "_bricks",      () -> BlockConfig.STONE().formSet(REGULAR)),
    CRACKED_POLISHED_BRICKS         ("cracked_polished_", "_bricks",    () -> BlockConfig.STONE().formSet(REGULAR)),

    TILES                           ("","_tiles",                       () -> BlockConfig.STONE().formSet(REGULAR)),
    MOSSY_TILES                     ("mossy_", "_tiles",                () -> BlockConfig.STONE().formSet(REGULAR)),
    CRACKED_TILES                   ("cracked_", "_tiles",              () -> BlockConfig.STONE().formSet(REGULAR)),

    SMOOTH_BLOCKS                   ("smooth_", "",                     () -> BlockConfig.STONE().formSet(REGULAR)),
    MOSSY_SMOOTH_BLOCKS             ("mossy_smooth_", "",               () -> BlockConfig.STONE().formSet(REGULAR)),
    CRACKED_SMOOTH_BLOCKS           ("cracked_smooth_", "",             () -> BlockConfig.STONE().formSet(REGULAR)),

    POLISHED_BLOCKS                 ("polished_", "",                   () -> BlockConfig.STONE().formSet(REGULAR)),
    MOSSY_POLISHED_BLOCKS           ("mossy_polished_", "",             () -> BlockConfig.STONE().formSet(REGULAR)),
    CRACKED_POLISHED_BLOCKS         ("cracked_polished_", "",           () -> BlockConfig.STONE().formSet(REGULAR)),

    POLISHED_PILLARS                ("polished_", "",                   () -> BlockConfig.STONE().formSet(REGULAR).pillar()),
    MOSSY_POLISHED_PILLARS          ("mossy_polished_", "",             () -> BlockConfig.STONE().formSet(REGULAR).pillar()),
    CRACKED_POLISHED_PILLARS        ("cracked_polished_", "",           () -> BlockConfig.STONE().formSet(REGULAR).pillar()),

    BRICKWORK_BLOCKS                ("", "_brickwork",                  () -> BlockConfig.STONE().formSet(REGULAR)),

    PILLARS                         ("", "_pillar",                     () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    MOSSY_PILLARS                   ("mossy_", "_pillar",               () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CRACKED_PILLARS                 ("cracked_", "_pillar",             () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),

    CHISELED_BLOCKS                 ("chiseled_", "",                   () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CHISELED_BRICKS                 ("chiseled_", "_bricks",            () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CHISELED_POLISHED_BRICKS        ("chiseled_polished_", "_bricks",   () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CHISELED_POLISHED_BLOCKS        ("chiseled_polished_", "",          () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CHISELED_TILES                  ("chiseled_", "_tiles",             () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),
    CHISELED_SMOOTH_BLOCKS          ("chiseled_smooth_", "",            () -> BlockConfig.STONE().formSet(STONE_PILLAR).pillar()),

    OLD_BLOCKS                      ("old_", "",                        () -> BlockConfig.STONE().formSet(REGULAR)),
    OLD_PILLARS                     ("old_", "",                        () -> BlockConfig.STONE().formSet(REGULAR).pillar()),
    CARVED_WINDOWS                  ("", "_carved_window",              () -> BlockConfig.STONE().formSet(TRANSPARENT).transparent());
    // @formatter:on

    private final String prefix;
    private final String suffix;
    private final Supplier<BlockConfig> config;

    /// Offset in hardness relative to base (stone) hardness - Ex. stone/cobblestone hardness is 1.5f/2.0f -> +0.5f.
    private final float hardnessModifier;

    StoneBlockVariant(String prefix, String suffix, Supplier<BlockConfig> config) {
        this(prefix, suffix, config, 0f);
    }

    StoneBlockVariant(String prefix, String suffix, Supplier<BlockConfig> config, float hardnessModifier) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.config = config;
        this.hardnessModifier = hardnessModifier;
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

    public float getHardnessModifier() {
        return hardnessModifier;
    }
}
