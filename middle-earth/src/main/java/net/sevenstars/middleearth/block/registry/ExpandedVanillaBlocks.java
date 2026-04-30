package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockBehaviour;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.special.LayersBlock;
import net.sevenstars.middleearth.block.special.OxidizablePaneBlock;
import net.sevenstars.middleearth.block.special.OxidizableVerticalSlabBlock;
import net.sevenstars.middleearth.block.special.OxidizableWallBlock;
import net.sevenstars.middleearth.block.special.verticalSlabs.VerticalSlabBlock;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class ExpandedVanillaBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering ExpandedVanillaBlocks for " + MiddleEarth.MOD_ID);

        registerFlammable();
        registerOxidizable();
        registerWaxable();
    }

    private static void registerFlammable() {
        int woolBurn = 60;
        int woolSpread = 30;
        BlockBehaviour.registerFlammable(BLACK_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(BLUE_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(BROWN_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(CYAN_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(GRAY_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(GREEN_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(LIGHT_BLUE_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(LIGHT_GRAY_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(LIME_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(MAGENTA_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(ORANGE_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(PINK_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(PURPLE_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(RED_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(WHITE_WOOL, woolBurn, woolSpread);
        BlockBehaviour.registerFlammable(YELLOW_WOOL, woolBurn, woolSpread);
    }

    private static void registerOxidizable() {
        BlockBehaviour.registerOxidizablePair(COPPER_BARS, EXPOSED_COPPER_BARS);
        BlockBehaviour.registerOxidizablePair(EXPOSED_COPPER_BARS, WEATHERED_COPPER_BARS);
        BlockBehaviour.registerOxidizablePair(WEATHERED_COPPER_BARS, OXIDIZED_COPPER_BARS);

        BlockBehaviour.registerOxidizablePair(CUT_COPPER_WALL, EXPOSED_CUT_COPPER_WALL);
        BlockBehaviour.registerOxidizablePair(EXPOSED_CUT_COPPER_WALL, WEATHERED_CUT_COPPER_WALL);
        BlockBehaviour.registerOxidizablePair(WEATHERED_CUT_COPPER_WALL, OXIDIZED_CUT_COPPER_WALL);

        BlockBehaviour.registerOxidizablePair(CUT_COPPER_VERTICAL_SLAB, EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        BlockBehaviour.registerOxidizablePair(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        BlockBehaviour.registerOxidizablePair(WEATHERED_CUT_COPPER_VERTICAL_SLAB, OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }

    private static void registerWaxable() {
        BlockBehaviour.registerWaxablePair(COPPER_BARS, WAXED_COPPER_BARS);
        BlockBehaviour.registerWaxablePair(EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
        BlockBehaviour.registerWaxablePair(WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
        BlockBehaviour.registerWaxablePair(OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);

        BlockBehaviour.registerWaxablePair(CUT_COPPER_WALL, WAXED_CUT_COPPER_WALL);
        BlockBehaviour.registerWaxablePair(EXPOSED_CUT_COPPER_WALL, WAXED_EXPOSED_CUT_COPPER_WALL);
        BlockBehaviour.registerWaxablePair(WEATHERED_CUT_COPPER_WALL, WAXED_WEATHERED_CUT_COPPER_WALL);
        BlockBehaviour.registerWaxablePair(OXIDIZED_CUT_COPPER_WALL, WAXED_OXIDIZED_CUT_COPPER_WALL);

        BlockBehaviour.registerWaxablePair(CUT_COPPER_VERTICAL_SLAB, WAXED_CUT_COPPER_VERTICAL_SLAB);
        BlockBehaviour.registerWaxablePair(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        BlockBehaviour.registerWaxablePair(WEATHERED_CUT_COPPER_VERTICAL_SLAB, WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        BlockBehaviour.registerWaxablePair(OXIDIZED_CUT_COPPER_VERTICAL_SLAB, WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }

    // Helper method to reduce family boilerplate
    private static BlockFamily<BasicBlockForm> registerFamily(Block block) {
        return BlockRegistration.registerBlockFamily(
                new BlockFamily<>(
                        Registries.BLOCK.getId(block).getPath(),
                        new BlockConfig<BasicBlockForm>(block).formSet(BlockFormSet.REGULAR_NO_BASE),
                        block
                ),
                ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }

    // region COPPER BARS
    public static final Block COPPER_BARS = BlockRegistration.registerBlock(
            "copper_bars",
            (settings) -> new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings),
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block EXPOSED_COPPER_BARS = BlockRegistration.registerBlock(
            "exposed_copper_bars",
            (settings) -> new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED, settings),
            AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WEATHERED_COPPER_BARS = BlockRegistration.registerBlock(
            "weathered_copper_bars",
            (settings) -> new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block OXIDIZED_COPPER_BARS = BlockRegistration.registerBlock(
            "oxidized_copper_bars",
            (settings) -> new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block WAXED_COPPER_BARS = BlockRegistration.registerBlock(
            "waxed_copper_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_EXPOSED_COPPER_BARS = BlockRegistration.registerBlock(
            "waxed_exposed_copper_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_WEATHERED_COPPER_BARS = BlockRegistration.registerBlock(
            "waxed_weathered_copper_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_OXIDIZED_COPPER_BARS = BlockRegistration.registerBlock(
            "waxed_oxidized_copper_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region CUT COPPER WALLS
    public static final Block CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "cut_copper_wall",
            (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings),
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block EXPOSED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "exposed_cut_copper_wall",
            (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings),
            AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WEATHERED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "weathered_cut_copper_wall",
            (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block OXIDIZED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "oxidized_cut_copper_wall",
            (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "waxed_cut_copper_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "waxed_exposed_cut_copper_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "waxed_weathered_cut_copper_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = BlockRegistration.registerBlock(
            "waxed_oxidized_cut_copper_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region CUT COPPER VERTICAL SLABS
    public static final Block CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "cut_copper_vertical_slab",
            (settings) -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings),
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "exposed_cut_copper_vertical_slab",
            (settings) -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings),
            AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "weathered_cut_copper_vertical_slab",
            (settings) -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "oxidized_cut_copper_vertical_slab",
            (settings) -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "waxed_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "waxed_exposed_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "waxed_weathered_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "waxed_oxidized_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final BlockFamily<BasicBlockForm> PACKED_MUD = registerFamily(Blocks.PACKED_MUD);

    // region WOOL
    public static final BlockFamily<BasicBlockForm> BLACK_WOOL = registerFamily(Blocks.BLACK_WOOL);
    public static final BlockFamily<BasicBlockForm> BLUE_WOOL = registerFamily(Blocks.BLUE_WOOL);
    public static final BlockFamily<BasicBlockForm> BROWN_WOOL = registerFamily(Blocks.BROWN_WOOL);
    public static final BlockFamily<BasicBlockForm> CYAN_WOOL = registerFamily(Blocks.CYAN_WOOL);
    public static final BlockFamily<BasicBlockForm> GRAY_WOOL = registerFamily(Blocks.GRAY_WOOL);
    public static final BlockFamily<BasicBlockForm> GREEN_WOOL = registerFamily(Blocks.GREEN_WOOL);
    public static final BlockFamily<BasicBlockForm> LIGHT_BLUE_WOOL = registerFamily(Blocks.LIGHT_BLUE_WOOL);
    public static final BlockFamily<BasicBlockForm> LIGHT_GRAY_WOOL = registerFamily(Blocks.LIGHT_GRAY_WOOL);
    public static final BlockFamily<BasicBlockForm> LIME_WOOL = registerFamily(Blocks.LIME_WOOL);
    public static final BlockFamily<BasicBlockForm> MAGENTA_WOOL = registerFamily(Blocks.MAGENTA_WOOL);
    public static final BlockFamily<BasicBlockForm> ORANGE_WOOL = registerFamily(Blocks.ORANGE_WOOL);
    public static final BlockFamily<BasicBlockForm> PINK_WOOL = registerFamily(Blocks.PINK_WOOL);
    public static final BlockFamily<BasicBlockForm> PURPLE_WOOL = registerFamily(Blocks.PURPLE_WOOL);
    public static final BlockFamily<BasicBlockForm> RED_WOOL = registerFamily(Blocks.RED_WOOL);
    public static final BlockFamily<BasicBlockForm> WHITE_WOOL = registerFamily(Blocks.WHITE_WOOL);
    public static final BlockFamily<BasicBlockForm> YELLOW_WOOL = registerFamily(Blocks.YELLOW_WOOL);
    // endregion

    // region VANILLA SLABS
    public static final Block DIRT_SLAB = BlockRegistration.registerBlock(
            "dirt_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block COARSE_DIRT_SLAB = BlockRegistration.registerBlock(
            "coarse_dirt_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.COARSE_DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ROOTED_DIRT_SLAB = BlockRegistration.registerBlock(
            "rooted_dirt_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MUD_SLAB = BlockRegistration.registerBlock(
            "mud_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MOSS_SLAB = BlockRegistration.registerBlock(
            "moss_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    //endregion

    //region VANILLA STAIRS
    public static final Block DIRT_STAIRS = BlockRegistration.registerBlock(
            "dirt_stairs",
            (settings) -> new StairsBlock(Blocks.DIRT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block COARSE_DIRT_STAIRS = BlockRegistration.registerBlock(
            "coarse_dirt_stairs",
            (settings) -> new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.COARSE_DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ROOTED_DIRT_STAIRS = BlockRegistration.registerBlock(
            "rooted_dirt_stairs",
            (settings) -> new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MUD_STAIRS = BlockRegistration.registerBlock(
            "mud_stairs",
            (settings) -> new StairsBlock(Blocks.MUD.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.DIRT).sounds(BlockSoundGroup.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MOSS_STAIRS = BlockRegistration.registerBlock(
            "moss_stairs",
            (settings) -> new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    //endregion

    //region VANILLA VERTICAL SLABS
    public static final Block BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block MUD_BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "mud_brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "smooth_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "cut_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "smooth_red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "cut_red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block PRISMARINE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "prismarine_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "prismarine_brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "dark_prismarine_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block NETHER_BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "nether_brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "red_nether_brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "end_stone_brick_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block PURPUR_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "purpur_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block QUARTZ_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "quartz_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = BlockRegistration.registerBlock(
            "smooth_quartz_vertical_slab",
            VerticalSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    //endregion

    //region VANILLA LAYERS
    public static final Block GRAVEL_LAYER = BlockRegistration.registerBlock(
            "gravel_layer",
            (settings) -> new LayersBlock(settings, Blocks.GRAVEL),
            AbstractBlock.Settings.copy(Blocks.GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SAND_LAYER = BlockRegistration.registerBlock(
            "sand_layer",
            (settings) -> new LayersBlock(settings, Blocks.SAND),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    //endregion
}
