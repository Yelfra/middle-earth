package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.minecraft.block.*;
import net.sevenstars.middleearth.block.*;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class GenericBlocks {

    // TODO: @Yelfra | Use or remove
    // public static final List<BlockFamily> GENERIC_FAMILIES = new ArrayList<>();

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
    public static final BlockFamily WHITE_DAUB = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("white_daub", MapColor.TERRACOTTA_WHITE));
    public static final BlockFamily DARK_DAUB = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("dark_daub", MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily YELLOW_DAUB = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("yellow_daub", MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily PLASTER = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("plaster", MapColor.OFF_WHITE));
    public static final BlockFamily STUCCO = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("stucco", MapColor.OFF_WHITE));
    public static final BlockFamily PACKED_MIRE = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("packed_mire", MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily MIRE_BRICKS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("mire_bricks", MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily OLD_BRICKS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("old_bricks", MapColor.DULL_RED));

    public static final BlockFamily MIXED_STONES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("mixed_stones", MapColor.STONE_GRAY));
    public static final BlockFamily MOSSY_MIXED_STONES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("mossy_mixed_stones", MapColor.STONE_GRAY));
    public static final BlockFamily CRACKED_MIXED_STONES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("cracked_mixed_stones", MapColor.STONE_GRAY));
    public static final BlockFamily MIXED_STONES_BRICKWORK = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.STONE("mixed_stones_brickwork", MapColor.STONE_GRAY));
    // endregion

    // region CLAY TILING
    public static final BlockFamily CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("clay_tiling", MapColor.ORANGE));

    public static final BlockFamily BLACK_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("black_clay_tiling", MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily BLUE_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("blue_clay_tiling", MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily BROWN_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("brown_clay_tiling", MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily CYAN_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("cyan_clay_tiling", MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily GRAY_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("gray_clay_tiling", MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily GREEN_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("green_clay_tiling", MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily LIGHT_BLUE_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_blue_clay_tiling", MapColor.TERRACOTTA_LIGHT_BLUE));
    public static final BlockFamily LIGHT_GRAY_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_gray_clay_tiling", MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final BlockFamily LIME_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("lime_clay_tiling", MapColor.TERRACOTTA_LIME));
    public static final BlockFamily MAGENTA_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("magenta_clay_tiling", MapColor.TERRACOTTA_MAGENTA));
    public static final BlockFamily ORANGE_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("orange_clay_tiling", MapColor.TERRACOTTA_ORANGE));
    public static final BlockFamily PINK_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("pink_clay_tiling", MapColor.TERRACOTTA_PINK));
    public static final BlockFamily PURPLE_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("purple_clay_tiling", MapColor.TERRACOTTA_PURPLE));
    public static final BlockFamily RED_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("red_clay_tiling", MapColor.TERRACOTTA_RED));
    public static final BlockFamily WHITE_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("white_clay_tiling", MapColor.TERRACOTTA_WHITE));
    public static final BlockFamily YELLOW_CLAY_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("yellow_clay_tiling", MapColor.TERRACOTTA_YELLOW));
    // endregion

    // region (Coloured) ROOF TILES
    public static final BlockFamily BLUE_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("blue_roof_tiles", MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily BRIGHT_BLUE_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("bright_blue_roof_tiles", MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily DARK_BLUE_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_blue_roof_tiles", MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily LIGHT_BLUE_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_blue_roof_tiles", MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily OFF_BLUE_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_blue_roof_tiles", MapColor.TERRACOTTA_BLUE));

    public static final BlockFamily BROWN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("brown_roof_tiles", MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily DARK_BROWN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_brown_roof_tiles", MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily OFF_BROWN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_brown_roof_tiles", MapColor.TERRACOTTA_BROWN));

    public static final BlockFamily CYAN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("cyan_roof_tiles", MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily BRIGHT_CYAN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("bright_cyan_roof_tiles", MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily DARK_CYAN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_cyan_roof_tiles", MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily LIGHT_CYAN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_cyan_roof_tiles", MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily OFF_CYAN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_cyan_roof_tiles", MapColor.TERRACOTTA_CYAN));

    public static final BlockFamily GRAY_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("gray_roof_tiles", MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily DARK_GRAY_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_gray_roof_tiles", MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily LIGHT_GRAY_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_gray_roof_tiles", MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily OFF_GRAY_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_gray_roof_tiles", MapColor.TERRACOTTA_GRAY));

    public static final BlockFamily GREEN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("green_roof_tiles", MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily BRIGHT_GREEN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("bright_green_roof_tiles", MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily DARK_GREEN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_green_roof_tiles", MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily LIGHT_GREEN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_green_roof_tiles", MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily OFF_GREEN_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_green_roof_tiles", MapColor.TERRACOTTA_GREEN));

    public static final BlockFamily RED_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("red_roof_tiles", MapColor.TERRACOTTA_RED));
    public static final BlockFamily BRIGHT_RED_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("bright_red_roof_tiles", MapColor.TERRACOTTA_RED));
    public static final BlockFamily DARK_RED_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_red_roof_tiles", MapColor.TERRACOTTA_RED));
    public static final BlockFamily LIGHT_RED_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_red_roof_tiles", MapColor.TERRACOTTA_RED));
    public static final BlockFamily OFF_RED_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_red_roof_tiles", MapColor.TERRACOTTA_RED));

    public static final BlockFamily YELLOW_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("yellow_roof_tiles", MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily BRIGHT_YELLOW_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("bright_yellow_roof_tiles", MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily DARK_YELLOW_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("dark_yellow_roof_tiles", MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily LIGHT_YELLOW_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("light_yellow_roof_tiles", MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily OFF_YELLOW_ROOF_TILES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.CLAY("off_yellow_roof_tiles", MapColor.TERRACOTTA_YELLOW));
    // endregion

    // region WOOD
    public static final BlockFamily WEATHERED_SHINGLES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("weathered_shingles", MapColor.WHITE_GRAY, false));

    public static final BlockFamily TREATED_WOOD = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood", MapColor.SPRUCE_BROWN, true));
    public static final BlockFamily TREATED_WOOD_PLANKS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood_planks", MapColor.SPRUCE_BROWN, false));
    public static final BlockFamily TREATED_WOOD_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood_beam", MapColor.SPRUCE_BROWN, true));
    public static final BlockFamily TREATED_WOOD_CARVED_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood_carved_beam", MapColor.SPRUCE_BROWN, true));
    public static final BlockFamily TREATED_WOOD_PANELS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood_panels", MapColor.SPRUCE_BROWN, false));
    public static final BlockFamily TREATED_WOOD_TILING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("treated_wood_tiling", MapColor.SPRUCE_BROWN, false));

    public static final BlockFamily AGED_WOOD = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_BOARDS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_boards", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_CARVING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_carving", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_PLANKS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_planks", MapColor.TERRACOTTA_BROWN, false));
    public static final BlockFamily AGED_WOOD_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_beam", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_FISH_CARVING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_fish_carving", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_PANELS = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_panels", MapColor.TERRACOTTA_BROWN, false));
    public static final BlockFamily AGED_WOOD_SHINGLES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_shingles", MapColor.TERRACOTTA_BROWN, false));

    public static final BlockFamily AGED_WOOD_CARVED_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_carved_beam", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_KNOTTED_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_knotted_beam", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_REDDISH_BEAM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_reddish_beam", MapColor.TERRACOTTA_BROWN, true));

    public static final BlockFamily AGED_WOOD_GILDED_CARVED_PILLAR = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_gilded_carved_pillar", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_GILDED_CARVING = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_gilded_carving", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_GILDED_HORSES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_gilded_horses", MapColor.TERRACOTTA_BROWN, true));
    public static final BlockFamily AGED_WOOD_GILDED_TRIM = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.WOOD_REGULAR("aged_wood_gilded_trim", MapColor.TERRACOTTA_BROWN, true));
    // endregion

    // region THATCH
    public static final BlockFamily THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED));
    public static final BlockFamily WEATHERED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("weathered_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED));
    public static final BlockFamily AGED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("aged_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED));
    public static final BlockFamily OLD_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("old_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));
    public static final BlockFamily ROTTEN_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("rotten_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));

    public static final BlockFamily WAXED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_WEATHERED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_weathered_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_AGED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_aged_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_OLD_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_old_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_ROTTEN_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_rotten_thatch", MapColor.PALE_YELLOW, null));

    public static final BlockFamily REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("reed_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED));
    public static final BlockFamily WEATHERED_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("weathered_reed_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED));
    public static final BlockFamily AGED_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("aged_reed_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED));
    public static final BlockFamily OLD_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("old_reed_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));
    public static final BlockFamily ROTTEN_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("rotten_reed_thatch", MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));

    public static final BlockFamily WAXED_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_reed_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_WEATHERED_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_weathered_reed_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_AGED_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_aged_reed_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_OLD_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_old_reed_thatch", MapColor.PALE_YELLOW, null));
    public static final BlockFamily WAXED_ROTTEN_REED_THATCH = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.THATCH("waxed_rotten_reed_thatch", MapColor.PALE_YELLOW, null));
    // endregion

    // region REED, STRAW
    public static final BlockFamily REED = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig("reed_block",
                    AbstractBlock.Settings.create()
                            .strength(0.6f, 0.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BANJO)
                            .sounds(BlockSoundGroup.GRASS)
                            .burnable())
                    .isPillar()
                    .formSet(YelfraBlockFormSet.REGULAR)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily STRAW = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig("straw_block",
                    AbstractBlock.Settings.create()
                            .strength(0.6f, 0.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BANJO)
                            .sounds(BlockSoundGroup.GRASS)
                            .burnable())
                    .isPillar()
                    .formSet(YelfraBlockFormSet.REGULAR)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    // endregion

    // region CUT METAL
    public static final BlockFamily CUT_BRONZE = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.METAL("cut_bronze", MapColor.ORANGE));
    public static final BlockFamily CUT_CRUDE_PLATES = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.METAL("cut_crude_plates", MapColor.DIRT_BROWN));
    public static final BlockFamily CUT_LEAD = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.METAL("cut_lead", MapColor.GRAY));
    public static final BlockFamily CUT_SILVER = YelfraBlockFactory.registerFamily(
            YelfraBlockFamilyConfig.METAL("cut_silver", MapColor.WHITE));
    // endregion
}
