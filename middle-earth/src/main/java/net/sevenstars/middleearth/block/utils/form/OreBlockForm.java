package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sevenstars.middleearth.block.utils.BlockConfig;

public enum OreBlockForm implements BlockForm {
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
    public Block create(BlockConfig<?> config, Block base) {
        return factory.apply((BlockConfig<OreBlockForm>) config, base);
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

    // Settings helper method - copies strength from base block to ore block
    private static AbstractBlock.Settings createSettings(Block block, Block base) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(block);
        if (base != null) {
            settings.strength(base.getHardness(), base.getBlastResistance());
        }
        return settings;
    }

    // TODO: @Yelfra | Make sure the blocks are created as before
//    if (ores.contains(OreBlocks.ORES.COAL_ORE)) {
//        coal_ore = ModNatureBlocks.registerBlock(
//                rockName + "coal_ore", (settings) -> new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), settings),
//                AbstractBlock.Settings.copy(Blocks.COAL_ORE).strength(STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.COPPER_ORE)) {
//        copper_ore = ModNatureBlocks.registerBlock(
//                rockName + "copper_ore", Block::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.TIN_ORE)) {
//        tin_ore = ModNatureBlocks.registerBlock(
//                rockName + "tin_ore", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.LEAD_ORE)) {
//        lead_ore = ModNatureBlocks.registerBlock(
//                rockName + "lead_ore", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.SILVER_ORE)) {
//        silver_ore = ModNatureBlocks.registerBlock(
//                rockName + "silver_ore", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.GOLD_ORE)) {
//        gold_ore = ModNatureBlocks.registerBlock(
//                rockName + "gold_ore", Block::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.IRON_ORE)) {
//        iron_ore = ModNatureBlocks.registerBlock(
//                rockName + "iron_ore", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
//
//        if (ores.contains(OreBlocks.ORES.MITHRIL_ORE)) {
//        mithril_ore = ModNatureBlocks.registerBlock(
//                rockName + "mithril_ore", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(
//                        STONE_STRENGTH * strength_mult, 3 * strength_mult), true);
//    }
}