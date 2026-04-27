package net.sevenstars.middleearth.block;

import java.util.function.Supplier;

import static net.sevenstars.middleearth.block.BlockFormSet.*;

public enum StoneBlockVariant implements BlockVariant {
    // @formatter:off
    // TODO: @Yelfra | Some pillar variants such as POLISHED_BLOCKS_PILLAR in StoneBlockSets weren't marked as pillars
    BASE_BLOCKS                     ("", "",                            () -> BlockConfig.STONE().formSet(STONE_COMPLETE)),

    COBBLESTONES                    ("cobble", "",                      () -> BlockConfig.COBBLESTONE().formSet(STONE_BASIC)), // TODO: @Yelfra | Only used for vanilla stone, might not be necessary
    MOSSY_COBBLESTONES              ("mossy_cobble", "",                () -> BlockConfig.COBBLESTONE().formSet(STONE_BASIC)),

    COBBLED_BLOCKS                  ("cobbled_", "",                    () -> BlockConfig.COBBLESTONE().formSet(STONE_BASIC)),
    MOSSY_COBBLED_BLOCKS            ("mossy_cobbled_", "",              () -> BlockConfig.COBBLESTONE().formSet(STONE_BASIC)),

    BRICKS                          ("", "_bricks",                     () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    MOSSY_BRICKS                    ("mossy_", "_bricks",               () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CRACKED_BRICKS                  ("cracked_", "_bricks",             () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    POLISHED_BRICKS                 ("polished_", "_bricks",            () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    MOSSY_POLISHED_BRICKS           ("mossy_polished_", "_bricks",      () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CRACKED_POLISHED_BRICKS         ("cracked_polished_", "_bricks",    () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    TILES                           ("","_tiles",                       () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    MOSSY_TILES                     ("mossy_", "_tiles",                () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CRACKED_TILES                   ("cracked_", "_tiles",              () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    SMOOTH_BLOCKS                   ("smooth_", "",                     () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    MOSSY_SMOOTH_BLOCKS             ("mossy_smooth_", "",               () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CRACKED_SMOOTH_BLOCKS           ("cracked_smooth_", "",             () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    POLISHED_BLOCKS                 ("polished_", "",                   () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    MOSSY_POLISHED_BLOCKS           ("mossy_polished_", "",             () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CRACKED_POLISHED_BLOCKS         ("cracked_polished_", "",           () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    POLISHED_PILLARS                ("polished_", "",                   () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()), // TODO: @Yelfra | "_pillar" suffix?
    MOSSY_POLISHED_PILLARS          ("mossy_polished_", "",             () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()),
    CRACKED_POLISHED_PILLARS        ("cracked_polished_", "",           () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()),

    BRICKWORKS                      ("", "_brickwork",                  () -> BlockConfig.STONE().formSet(STONE_BASIC)),

    PILLARS                         ("", "_pillar",                     () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()),
    MOSSY_PILLARS                   ("mossy_", "_pillar",               () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()),
    CRACKED_PILLARS                 ("cracked_", "_pillar",             () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()),

    CHISELED_BLOCKS                 ("chiseled_", "",                   () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    CHISELED_BLOCKS_NO_RESTRICTION  ("chiseled_", "",                   () -> BlockConfig.STONE().formSet(STONE_BASIC)), // TODO: @Yelfra | What is the difference?
    OLD_BLOCKS                      ("old_", "",                        () -> BlockConfig.STONE().formSet(STONE_BASIC)),
    OLD_PILLARS                     ("old_", "",                        () -> BlockConfig.STONE().formSet(STONE_BASIC).pillar()), // TODO: @Yelfra | "_pillar" suffix?
    CARVED_WINDOWS                  ("", "_carved_window",              () -> BlockConfig.STONE().formSet(TRANSPARENT).transparent());
    // @formatter:on

    private final String prefix;
    private final String suffix;
    // Using Supplier instead of copying configs or settings (not worth it) - this avoids altering the enum's configs
    private final Supplier<BlockConfig<BasicBlockForm>> config;

    StoneBlockVariant(String prefix, String suffix, Supplier<BlockConfig<BasicBlockForm>> config) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.config = config;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    @Override
    public BlockConfig<BasicBlockForm> getConfig() {
        return config.get();
    }
}
