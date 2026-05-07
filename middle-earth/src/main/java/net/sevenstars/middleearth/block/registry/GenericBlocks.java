package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockBehaviour;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class GenericBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering GENERIC Blocks for " + MiddleEarth.MOD_ID);

        registerFuels();
        registerFlammable();
        registerOxidizable();
        registerWaxable();
    }

    // TODO: @Yelfra | Append behaviour to end of block families instead of through helper methods

    private static void registerFuels() {
        // TODO: @Yelfra | See if any of these shouldn't be fuel (or missing)
        // TODO: ... or have their fuel values tweaked (might be hardcoded to wood)
        int woodFuelTicks = 300;
        BlockBehaviour.registerFuel(WEATHERED_SHINGLES, woodFuelTicks);

        BlockBehaviour.registerFuel(TREATED_WOOD, woodFuelTicks);
        BlockBehaviour.registerFuel(TREATED_WOOD_PLANKS, woodFuelTicks);
        BlockBehaviour.registerFuel(TREATED_WOOD_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(TREATED_WOOD_CARVED_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(TREATED_WOOD_PANELS, woodFuelTicks);
        BlockBehaviour.registerFuel(TREATED_WOOD_TILING, woodFuelTicks);

        BlockBehaviour.registerFuel(AGED_WOOD, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_BOARDS, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_CARVING, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_PLANKS, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_FISH_CARVING, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_PANELS, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_SHINGLES, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_CARVED_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_KNOTTED_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_REDDISH_BEAM, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_CARVED_PILLAR, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_CARVING, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_HORSES, woodFuelTicks);
        BlockBehaviour.registerFuel(AGED_WOOD_GILDED_TRIM, woodFuelTicks);
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
    public static final BlockFamily WHITE_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily("white_daub", BlockConfig.STONE(MapColor.TERRACOTTA_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_daub", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily YELLOW_DAUB = BlockRegistration.registerBlockFamily(
            new BlockFamily("yellow_daub", BlockConfig.STONE(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily PLASTER = BlockRegistration.registerBlockFamily(
            new BlockFamily("plaster", BlockConfig.STONE(MapColor.OFF_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily STUCCO = BlockRegistration.registerBlockFamily(
            new BlockFamily("stucco", BlockConfig.STONE(MapColor.OFF_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily PACKED_MIRE = BlockRegistration.registerBlockFamily(
            new BlockFamily("packed_mire", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily MIRE_BRICKS = BlockRegistration.registerBlockFamily(
            new BlockFamily("mire_bricks", BlockConfig.STONE(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OLD_BRICKS = BlockRegistration.registerBlockFamily(
            new BlockFamily("old_bricks", BlockConfig.STONE(MapColor.DULL_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily("mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily MOSSY_MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily("mossy_mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily CRACKED_MIXED_STONES = BlockRegistration.registerBlockFamily(
            new BlockFamily("cracked_mixed_stones", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily MIXED_STONES_BRICKWORK = BlockRegistration.registerBlockFamily(
            new BlockFamily("mixed_stones_brickwork", BlockConfig.STONE(MapColor.STONE_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // region CLAY TILING
    public static final BlockFamily CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("clay_tiling", BlockConfig.HARD_CLAY(MapColor.ORANGE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily BLACK_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("black_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLACK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BLUE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("blue_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BROWN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("brown_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily CYAN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("cyan_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily GRAY_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("gray_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily GREEN_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("green_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_BLUE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_blue_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIGHT_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_GRAY_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_gray_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIGHT_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIME_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("lime_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_LIME)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily MAGENTA_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("magenta_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_MAGENTA)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily ORANGE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("orange_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_ORANGE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily PINK_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("pink_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_PINK)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily PURPLE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("purple_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_PURPLE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily RED_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("red_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily WHITE_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("white_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_WHITE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily YELLOW_CLAY_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("yellow_clay_tiling", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // region ROOF TILES
    public static final BlockFamily BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BRIGHT_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("bright_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_BLUE_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_blue_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BLUE)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_BROWN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_brown_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BRIGHT_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("bright_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_CYAN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_cyan_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_CYAN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_GRAY_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_gray_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GRAY)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BRIGHT_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("bright_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_GREEN_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_green_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_GREEN)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BRIGHT_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("bright_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_RED_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_red_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_RED)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );

    public static final BlockFamily YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily BRIGHT_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("bright_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily DARK_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("dark_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIGHT_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("light_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    public static final BlockFamily OFF_YELLOW_ROOF_TILES = BlockRegistration.registerBlockFamily(
            new BlockFamily("off_yellow_roof_tiles", BlockConfig.HARD_CLAY(MapColor.TERRACOTTA_YELLOW)),
            ItemGroupsME.STONE_BLOCKS_CONTENTS
    );
    // endregion

    // TODO: @Yelfra | Move to WoodBlocks
    // region WOOD
    public static final BlockFamily WEATHERED_SHINGLES = BlockRegistration.registerBlockFamily(
            new BlockFamily("weathered_shingles", BlockConfig.PLANKS_SIMPLE(MapColor.WHITE_GRAY)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    // TODO: @Yelfra | Do sth about this
    public static final BlockFamily TREATED_WOOD = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily TREATED_WOOD_PLANKS = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood_planks", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily TREATED_WOOD_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood_beam", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily TREATED_WOOD_CARVED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood_carved_beam", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily TREATED_WOOD_PANELS = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood_panels", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily TREATED_WOOD_TILING = BlockRegistration.registerBlockFamily(
            new BlockFamily("treated_wood_tiling", BlockConfig.PLANKS_SIMPLE(MapColor.SPRUCE_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    // TODO: @Yelfra | Do sth about this
    public static final BlockFamily AGED_WOOD = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_BOARDS = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_boards", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_carving", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_PLANKS = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_planks", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_beam", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_FISH_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_fish_carving", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_PANELS = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_panels", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_SHINGLES = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_shingles", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN)),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily AGED_WOOD_CARVED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_carved_beam", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_KNOTTED_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_knotted_beam", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_REDDISH_BEAM = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_reddish_beam", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );

    public static final BlockFamily AGED_WOOD_GILDED_CARVED_PILLAR = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_gilded_carved_pillar", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_GILDED_CARVING = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_gilded_carving", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_GILDED_HORSES = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_gilded_horses", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_WOOD_GILDED_TRIM = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_wood_gilded_trim", BlockConfig.PLANKS_SIMPLE(MapColor.TERRACOTTA_BROWN).pillar()),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    // endregion

    // TODO: @Yelfra | Create collection
    // region THATCH
    public static final BlockFamily THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WEATHERED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("weathered_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily OLD_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("old_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily ROTTEN_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("rotten_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily WAXED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_WEATHERED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_weathered_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_AGED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_aged_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_OLD_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_old_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_ROTTEN_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_rotten_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WEATHERED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("weathered_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily AGED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("aged_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily OLD_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("old_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily ROTTEN_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("rotten_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );

    public static final BlockFamily WAXED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_WEATHERED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_weathered_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_AGED_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_aged_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_OLD_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_old_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily WAXED_ROTTEN_REED_THATCH = BlockRegistration.registerBlockFamily(
            new BlockFamily("waxed_rotten_reed_thatch", BlockConfig.THATCH(MapColor.PALE_YELLOW, null)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion

    // region REED, STRAW
    public static final BlockFamily REED = BlockRegistration.registerBlockFamily(
            new BlockFamily("reed_block",
                    new BlockConfig(
                            AbstractBlock.Settings.create()
                                    .strength(0.6f, 0.0f)
                                    .mapColor(MapColor.PALE_YELLOW)
                                    .instrument(NoteBlockInstrument.BANJO)
                                    .sounds(BlockSoundGroup.GRASS)
                                    .burnable())
                            .pillar()
                            .formSet(BlockFormSet.SIMPLE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily STRAW = BlockRegistration.registerBlockFamily(
            new BlockFamily("straw_block",
                    new BlockConfig(
                            AbstractBlock.Settings.create()
                                    .strength(0.6f, 0.0f)
                                    .mapColor(MapColor.PALE_YELLOW)
                                    .instrument(NoteBlockInstrument.BANJO)
                                    .sounds(BlockSoundGroup.GRASS)
                                    .burnable())
                            .pillar()
                            .formSet(BlockFormSet.SIMPLE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion

    // region CUT METAL
    public static final BlockFamily CUT_BRONZE = BlockRegistration.registerBlockFamily(
            new BlockFamily("cut_bronze", BlockConfig.METAL(MapColor.ORANGE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily CUT_CRUDE_PLATES = BlockRegistration.registerBlockFamily(
            new BlockFamily("cut_crude_plates", BlockConfig.METAL(MapColor.DIRT_BROWN)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily CUT_LEAD = BlockRegistration.registerBlockFamily(
            new BlockFamily("cut_lead", BlockConfig.METAL(MapColor.GRAY)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily CUT_SILVER = BlockRegistration.registerBlockFamily(
            new BlockFamily("cut_silver", BlockConfig.METAL(MapColor.WHITE)),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    // endregion
}
