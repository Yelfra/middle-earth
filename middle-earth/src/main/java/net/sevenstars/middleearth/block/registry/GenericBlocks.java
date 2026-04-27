package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.minecraft.block.*;
import net.sevenstars.middleearth.block.*;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class GenericBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering GENERIC Blocks for " + MiddleEarth.MOD_ID);

        registerFuels();
        registerFlammable();
        registerOxidizable();
        registerWaxable();
    }

    private static void registerFuels() {
        // TODO: @Yelfra | See if any of these shouldn't be fuel (or missing)
        // TODO: ... or have their fuel values tweaked (might be hardcoded to wood)
        BlockBehaviour.registerFuel(WEATHERED_SHINGLES);

        BlockBehaviour.registerFuel(TREATED_WOOD);
        BlockBehaviour.registerFuel(TREATED_WOOD_PLANKS);
        BlockBehaviour.registerFuel(TREATED_WOOD_BEAM);
        BlockBehaviour.registerFuel(TREATED_WOOD_CARVED_BEAM);
        BlockBehaviour.registerFuel(TREATED_WOOD_PANELS);
        BlockBehaviour.registerFuel(TREATED_WOOD_TILING);

        BlockBehaviour.registerFuel(AGED_WOOD);
        BlockBehaviour.registerFuel(AGED_WOOD_BOARDS);
        BlockBehaviour.registerFuel(AGED_WOOD_CARVING);
        BlockBehaviour.registerFuel(AGED_WOOD_PLANKS);
        BlockBehaviour.registerFuel(AGED_WOOD_BEAM);
        BlockBehaviour.registerFuel(AGED_WOOD_FISH_CARVING);
        BlockBehaviour.registerFuel(AGED_WOOD_PANELS);
        BlockBehaviour.registerFuel(AGED_WOOD_SHINGLES);
        BlockBehaviour.registerFuel(AGED_WOOD_CARVED_BEAM);
        BlockBehaviour.registerFuel(AGED_WOOD_KNOTTED_BEAM);
        BlockBehaviour.registerFuel(AGED_WOOD_REDDISH_BEAM);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_CARVED_PILLAR);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_CARVING);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_HORSES);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_TRIM);
    }

    private static void registerFlammable() {
        int woodBurn = 5;
        int woodSpread = 20;
        // TODO: @Yelfra | See if any of these shouldn't be burnable/flammable (or missing)
        // TODO: @Yelfra | If needed, tweak (woodBurn, woodSpread) individually
        BlockBehaviour.registerFlammable(WEATHERED_SHINGLES, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(TREATED_WOOD, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(TREATED_WOOD_PLANKS, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(TREATED_WOOD_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(TREATED_WOOD_CARVED_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(TREATED_WOOD_PANELS, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(TREATED_WOOD_TILING, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(AGED_WOOD, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_BOARDS, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_CARVING, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_PLANKS, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_FISH_CARVING, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_PANELS, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_SHINGLES, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_CARVED_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_KNOTTED_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_REDDISH_BEAM, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_GILDED_CARVED_PILLAR, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_GILDED_CARVING, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_GILDED_HORSES, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_WOOD_GILDED_TRIM, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WEATHERED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(OLD_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(ROTTEN_THATCH, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(WAXED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_WEATHERED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_AGED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_OLD_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_ROTTEN_THATCH, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WEATHERED_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(AGED_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(OLD_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(ROTTEN_REED_THATCH, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(WAXED_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_WEATHERED_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_AGED_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_OLD_REED_THATCH, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(WAXED_ROTTEN_REED_THATCH, woodBurn, woodSpread);

        BlockBehaviour.registerFlammable(REED, woodBurn, woodSpread);
        BlockBehaviour.registerFlammable(STRAW, woodBurn, woodSpread);
    }

    private static void registerOxidizable() {
        BlockBehaviour.registerOxidizablePair(THATCH, WEATHERED_THATCH);
        BlockBehaviour.registerOxidizablePair(WEATHERED_THATCH, AGED_THATCH);
        BlockBehaviour.registerOxidizablePair(AGED_THATCH, OLD_THATCH);
        // BlockBehaviour.registerOxidizablePair(OLD_THATCH, ROTTEN_THATCH); // Transition not possible

        BlockBehaviour.registerOxidizablePair(REED_THATCH, WEATHERED_REED_THATCH);
        BlockBehaviour.registerOxidizablePair(WEATHERED_REED_THATCH, AGED_REED_THATCH);
        BlockBehaviour.registerOxidizablePair(AGED_REED_THATCH, OLD_REED_THATCH);
        // BlockBehaviour.registerOxidizablePair(OLD_REED_THATCH, ROTTEN_REED_THATCH); // Transition not possible
    }

    private static void registerWaxable() {
        BlockBehaviour.registerWaxablePair(THATCH, WAXED_THATCH);
        BlockBehaviour.registerWaxablePair(WEATHERED_THATCH, WAXED_WEATHERED_THATCH);
        BlockBehaviour.registerWaxablePair(AGED_THATCH, WAXED_AGED_THATCH);
        BlockBehaviour.registerWaxablePair(OLD_THATCH, WAXED_OLD_THATCH);
        BlockBehaviour.registerWaxablePair(ROTTEN_THATCH, WAXED_ROTTEN_THATCH);

        BlockBehaviour.registerWaxablePair(REED_THATCH, WAXED_REED_THATCH);
        BlockBehaviour.registerWaxablePair(WEATHERED_REED_THATCH, WAXED_WEATHERED_REED_THATCH);
        BlockBehaviour.registerWaxablePair(AGED_REED_THATCH, WAXED_AGED_REED_THATCH);
        BlockBehaviour.registerWaxablePair(OLD_REED_THATCH, WAXED_OLD_REED_THATCH);
        BlockBehaviour.registerWaxablePair(ROTTEN_REED_THATCH, WAXED_ROTTEN_REED_THATCH);
    }

    // region STONE
    public static final BlockFamily<BasicBlockForm> WHITE_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("white_daub", BlockConfig.STONE(MapColor.TERRACOTTA_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_daub", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> YELLOW_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("yellow_daub", BlockConfig.STONE(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> PLASTER = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("plaster", BlockConfig.STONE(MapColor.OFF_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> STUCCO = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("stucco", BlockConfig.STONE(MapColor.OFF_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> PACKED_MIRE = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("packed_mire", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> MIRE_BRICKS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("mire_bricks", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OLD_BRICKS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("old_bricks", BlockConfig.STONE(MapColor.DULL_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> MOSSY_MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("mossy_mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> CRACKED_MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cracked_mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> MIXED_STONES_BRICKWORK = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("mixed_stones_brickwork", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // region CLAY TILING
    public static final BlockFamily<BasicBlockForm> CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("clay_tiling", BlockConfig.HARD_CLAY(MapColor.ORANGE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> BLACK_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("black_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BLUE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("blue_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BROWN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("brown_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> CYAN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cyan_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> GRAY_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("gray_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> GREEN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("green_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_BLUE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_blue_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIGHT_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_GRAY_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_gray_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIGHT_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIME_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("lime_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIME)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> MAGENTA_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("magenta_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_MAGENTA)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> ORANGE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("orange_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_ORANGE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> PINK_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("pink_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_PINK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> PURPLE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("purple_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_PURPLE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> RED_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("red_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WHITE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("white_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> YELLOW_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("yellow_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // region (Coloured) ROOF TILES
    public static final BlockFamily<BasicBlockForm> BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BRIGHT_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("bright_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BRIGHT_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("bright_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BRIGHT_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("bright_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BRIGHT_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("bright_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> BRIGHT_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("bright_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> DARK_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("dark_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> LIGHT_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("light_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OFF_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("off_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // region WOOD
    public static final BlockFamily<BasicBlockForm> WEATHERED_SHINGLES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("weathered_shingles", BlockConfig.WOOD_REGULAR(MapColor.WHITE_GRAY)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> TREATED_WOOD = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_PLANKS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood_planks", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood_beam", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_CARVED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood_carved_beam", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_PANELS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood_panels", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("treated_wood_tiling", BlockConfig.WOOD_REGULAR(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> AGED_WOOD = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_BOARDS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_boards", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_carving", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_PLANKS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_planks", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_beam", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_FISH_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_fish_carving", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_PANELS = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_panels", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_SHINGLES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_shingles", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> AGED_WOOD_CARVED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_carved_beam", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_KNOTTED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_knotted_beam", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_REDDISH_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_reddish_beam", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_CARVED_PILLAR = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_gilded_carved_pillar", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_gilded_carving", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_HORSES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_gilded_horses", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_TRIM = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_wood_gilded_trim", BlockConfig.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    // endregion

    // region THATCH
    public static final BlockFamily<BasicBlockForm> THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WEATHERED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("weathered_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OLD_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("old_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> ROTTEN_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("rotten_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> WAXED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_WEATHERED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_weathered_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_AGED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_aged_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_OLD_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_old_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_ROTTEN_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_rotten_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WEATHERED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("weathered_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> AGED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("aged_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> OLD_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("old_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> ROTTEN_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("rotten_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily<BasicBlockForm> WAXED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_WEATHERED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_weathered_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_AGED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_aged_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_OLD_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_old_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> WAXED_ROTTEN_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("waxed_rotten_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion

    // region REED, STRAW
    public static final BlockFamily<BasicBlockForm> REED = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("reed_block",
                    new BlockConfig<BasicBlockForm>(
                            AbstractBlock.Settings.create()
                                    .strength(0.6f, 0.0f)
                                    .mapColor(MapColor.PALE_YELLOW)
                                    .instrument(NoteBlockInstrument.BANJO)
                                    .sounds(BlockSoundGroup.GRASS)
                                    .burnable())
                            .pillar()
                            .formSet(BlockFormSet.REGULAR)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> STRAW = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("straw_block",
                    new BlockConfig<BasicBlockForm>(
                            AbstractBlock.Settings.create()
                                    .strength(0.6f, 0.0f)
                                    .mapColor(MapColor.PALE_YELLOW)
                                    .instrument(NoteBlockInstrument.BANJO)
                                    .sounds(BlockSoundGroup.GRASS)
                                    .burnable())
                            .pillar()
                            .formSet(BlockFormSet.REGULAR)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion

    // region CUT METAL
    public static final BlockFamily<BasicBlockForm> CUT_BRONZE = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cut_bronze", BlockConfig.METAL(MapColor.ORANGE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> CUT_CRUDE_PLATES = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cut_crude_plates", BlockConfig.METAL(MapColor.DIRT_BROWN)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> CUT_LEAD = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cut_lead", BlockConfig.METAL(MapColor.GRAY)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<BasicBlockForm> CUT_SILVER = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("cut_silver", BlockConfig.METAL(MapColor.WHITE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion
}
