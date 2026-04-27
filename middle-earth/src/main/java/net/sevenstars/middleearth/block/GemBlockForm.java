package net.sevenstars.middleearth.block;

import net.minecraft.block.*;
import net.sevenstars.middleearth.block.special.gemstones.CustomBuddingGemBlock;

import java.util.List;

public enum GemBlockForm implements BlockForm {
    // @formatter:off
    BLOCK       ("",            "_block",   (config, base) -> createBlock()),
    CLUSTER     ("",            "_cluster", (config, base) -> createCluster()),
    LARGE_BUD   ("large_",      "_bud",     (config, base) -> createLargeBud()),
    MEDIUM_BUD  ("medium_",     "_bud",     (config, base) -> createMediumBud()),
    SMALL_BUD   ("small_",      "_bud",     (config, base) -> createSmallBud()),
    BUDDING     ("budding_",    "",         (config, base) -> null); // Keep BUDDING last, constructor is called explicitly outside
    // @formatter:on

    private final String prefix;
    private final String suffix;
    private final FormFactory<BlockConfig<GemBlockForm>, Block, Block> factory;

    GemBlockForm(String prefix, String suffix, FormFactory<BlockConfig<GemBlockForm>, Block, Block> factory) {
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
    public Block create(BlockConfig<?> config, Block base) {
        return factory.apply((BlockConfig<GemBlockForm>) config, base);
    }

    /* Form Constructors */
    private static Block createBlock() {
        return new AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    }

    private static Block createCluster() {
        return new AmethystClusterBlock(7, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER)); // TODO: @Yelfra | Hardcoded height, width
    }

    private static Block createLargeBud() {
        return new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.LARGE_AMETHYST_BUD)); // TODO: @Yelfra | Hardcoded height, width
    }

    private static Block createMediumBud() {
        return new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.MEDIUM_AMETHYST_BUD)); // TODO: @Yelfra | Hardcoded height, width
    }

    private static Block createSmallBud() {
        return new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.SMALL_AMETHYST_BUD)); // TODO: @Yelfra | Hardcoded height, width
    }

    public static Block createBudding(Block smallBud, Block mediumBud, Block largeBud, Block cluster) {
        return new CustomBuddingGemBlock(AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
                List.of(
                        smallBud,
                        mediumBud,
                        largeBud,
                        cluster
                )
        );
    }
}