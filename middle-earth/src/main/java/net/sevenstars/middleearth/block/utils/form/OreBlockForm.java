package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sevenstars.middleearth.block.utils.BlockConfig;

public enum OreBlockForm implements BlockForm<OreBlockForm> {
    // @formatter:off
    ORIGIN              ("", "",                (config, base) -> base), // Base blocks get used as the stone of the ore

    COAL                ("", "_coal_ore",       (config, base) -> createCoal(base)),
    COPPER              ("", "_copper_ore",     (config, base) -> createCopper(base)),
    TIN                 ("", "_tin_ore",        (config, base) -> createTin(base)),
    LEAD                ("", "_lead_ore",       (config, base) -> createLead(base)),
    SILVER              ("", "_silver_ore",     (config, base) -> createSilver(base)),
    GOLD                ("", "_gold_ore",       (config, base) -> createGold(base)),
    IRON                ("", "_iron_ore",       (config, base) -> createIron(base)),
    MITHRIL             ("", "_mithril_ore",    (config, base) -> createMithril(base));
    // @formatter:on

    private final String prefix;
    private final String suffix;
    private final FormFactory<BlockConfig<OreBlockForm>, Block, Block> factory;

    OreBlockForm(String prefix, String suffix, FormFactory<BlockConfig<OreBlockForm>, Block, Block> factory) {
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
    public Block create(BlockConfig<OreBlockForm> config, Block base) {
        return factory.apply(config, base);
    }

    /* Form Constructors */
    private static Block createCoal(Block base) {
        return new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                createSettings(Blocks.COAL_ORE, base));
    }

    private static Block createCopper(Block base) {
        return new Block(createSettings(Blocks.COPPER_ORE, base));
    }

    private static Block createTin(Block base) {
        return new Block(createSettings(Blocks.IRON_ORE, base)); // TODO: @Yelfra | Blocks.COPPER_ORE feels closer
    }

    private static Block createLead(Block base) {
        return new Block(createSettings(Blocks.IRON_ORE, base));
    }

    private static Block createSilver(Block base) {
        return new Block(createSettings(Blocks.IRON_ORE, base));
    }

    private static Block createGold(Block base) {
        return new Block(createSettings(Blocks.GOLD_ORE, base));
    }

    private static Block createIron(Block base) {
        return new Block(createSettings(Blocks.IRON_ORE, base));
    }

    private static Block createMithril(Block base) {
        return new Block(createSettings(Blocks.IRON_ORE, base));
    }

    /// Settings helper method - Take ore block's settings, but apply base block's strength
    private static AbstractBlock.Settings createSettings(Block block, Block base) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(block);
        if (base != null) {
            settings.strength(base.getHardness(), base.getBlastResistance());
        }
        return settings;
    }
}