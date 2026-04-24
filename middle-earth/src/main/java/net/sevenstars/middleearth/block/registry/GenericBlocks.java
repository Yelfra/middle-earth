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
    public static final BlockFamily<BasicBlockForm> WHITE_DAUB = BlockFactory.registerFamily(
            "white_daub", BlockFamilySettings.STONE(MapColor.TERRACOTTA_WHITE));
    public static final BlockFamily<BasicBlockForm> DARK_DAUB = BlockFactory.registerFamily(
            "dark_daub", BlockFamilySettings.STONE(MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily<BasicBlockForm> YELLOW_DAUB = BlockFactory.registerFamily(
            "yellow_daub", BlockFamilySettings.STONE(MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily<BasicBlockForm> PLASTER = BlockFactory.registerFamily(
            "plaster", BlockFamilySettings.STONE(MapColor.OFF_WHITE));
    public static final BlockFamily<BasicBlockForm> STUCCO = BlockFactory.registerFamily(
            "stucco", BlockFamilySettings.STONE(MapColor.OFF_WHITE));
    public static final BlockFamily<BasicBlockForm> PACKED_MIRE = BlockFactory.registerFamily(
            "packed_mire", BlockFamilySettings.STONE(MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily<BasicBlockForm> MIRE_BRICKS = BlockFactory.registerFamily(
            "mire_bricks", BlockFamilySettings.STONE(MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily<BasicBlockForm> OLD_BRICKS = BlockFactory.registerFamily(
            "old_bricks", BlockFamilySettings.STONE(MapColor.DULL_RED));

    public static final BlockFamily<BasicBlockForm> MIXED_STONES = BlockFactory.registerFamily(
            "mixed_stones", BlockFamilySettings.STONE(MapColor.STONE_GRAY));
    public static final BlockFamily<BasicBlockForm> MOSSY_MIXED_STONES = BlockFactory.registerFamily(
            "mossy_mixed_stones", BlockFamilySettings.STONE(MapColor.STONE_GRAY));
    public static final BlockFamily<BasicBlockForm> CRACKED_MIXED_STONES = BlockFactory.registerFamily(
            "cracked_mixed_stones", BlockFamilySettings.STONE(MapColor.STONE_GRAY));
    public static final BlockFamily<BasicBlockForm> MIXED_STONES_BRICKWORK = BlockFactory.registerFamily(
            "mixed_stones_brickwork", BlockFamilySettings.STONE(MapColor.STONE_GRAY));
    // endregion

    // region CLAY TILING
    public static final BlockFamily<BasicBlockForm> CLAY_TILING = BlockFactory.registerFamily(
            "clay_tiling", BlockFamilySettings.CLAY(MapColor.ORANGE));

    public static final BlockFamily<BasicBlockForm> BLACK_CLAY_TILING = BlockFactory.registerFamily(
            "black_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLACK));
    public static final BlockFamily<BasicBlockForm> BLUE_CLAY_TILING = BlockFactory.registerFamily(
            "blue_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily<BasicBlockForm> BROWN_CLAY_TILING = BlockFactory.registerFamily(
            "brown_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily<BasicBlockForm> CYAN_CLAY_TILING = BlockFactory.registerFamily(
            "cyan_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily<BasicBlockForm> GRAY_CLAY_TILING = BlockFactory.registerFamily(
            "gray_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily<BasicBlockForm> GREEN_CLAY_TILING = BlockFactory.registerFamily(
            "green_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily<BasicBlockForm> LIGHT_BLUE_CLAY_TILING = BlockFactory.registerFamily(
            "light_blue_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_LIGHT_BLUE));
    public static final BlockFamily<BasicBlockForm> LIGHT_GRAY_CLAY_TILING = BlockFactory.registerFamily(
            "light_gray_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final BlockFamily<BasicBlockForm> LIME_CLAY_TILING = BlockFactory.registerFamily(
            "lime_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_LIME));
    public static final BlockFamily<BasicBlockForm> MAGENTA_CLAY_TILING = BlockFactory.registerFamily(
            "magenta_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_MAGENTA));
    public static final BlockFamily<BasicBlockForm> ORANGE_CLAY_TILING = BlockFactory.registerFamily(
            "orange_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_ORANGE));
    public static final BlockFamily<BasicBlockForm> PINK_CLAY_TILING = BlockFactory.registerFamily(
            "pink_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_PINK));
    public static final BlockFamily<BasicBlockForm> PURPLE_CLAY_TILING = BlockFactory.registerFamily(
            "purple_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_PURPLE));
    public static final BlockFamily<BasicBlockForm> RED_CLAY_TILING = BlockFactory.registerFamily(
            "red_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));
    public static final BlockFamily<BasicBlockForm> WHITE_CLAY_TILING = BlockFactory.registerFamily(
            "white_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_WHITE));
    public static final BlockFamily<BasicBlockForm> YELLOW_CLAY_TILING = BlockFactory.registerFamily(
            "yellow_clay_tiling", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    // endregion

    // region (Coloured) ROOF TILES
    public static final BlockFamily<BasicBlockForm> BLUE_ROOF_TILES = BlockFactory.registerFamily(
            "blue_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily<BasicBlockForm> BRIGHT_BLUE_ROOF_TILES = BlockFactory.registerFamily(
            "bright_blue_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily<BasicBlockForm> DARK_BLUE_ROOF_TILES = BlockFactory.registerFamily(
            "dark_blue_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily<BasicBlockForm> LIGHT_BLUE_ROOF_TILES = BlockFactory.registerFamily(
            "light_blue_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));
    public static final BlockFamily<BasicBlockForm> OFF_BLUE_ROOF_TILES = BlockFactory.registerFamily(
            "off_blue_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BLUE));

    public static final BlockFamily<BasicBlockForm> BROWN_ROOF_TILES = BlockFactory.registerFamily(
            "brown_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily<BasicBlockForm> DARK_BROWN_ROOF_TILES = BlockFactory.registerFamily(
            "dark_brown_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily<BasicBlockForm> OFF_BROWN_ROOF_TILES = BlockFactory.registerFamily(
            "off_brown_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_BROWN));

    public static final BlockFamily<BasicBlockForm> CYAN_ROOF_TILES = BlockFactory.registerFamily(
            "cyan_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily<BasicBlockForm> BRIGHT_CYAN_ROOF_TILES = BlockFactory.registerFamily(
            "bright_cyan_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily<BasicBlockForm> DARK_CYAN_ROOF_TILES = BlockFactory.registerFamily(
            "dark_cyan_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily<BasicBlockForm> LIGHT_CYAN_ROOF_TILES = BlockFactory.registerFamily(
            "light_cyan_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));
    public static final BlockFamily<BasicBlockForm> OFF_CYAN_ROOF_TILES = BlockFactory.registerFamily(
            "off_cyan_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_CYAN));

    public static final BlockFamily<BasicBlockForm> GRAY_ROOF_TILES = BlockFactory.registerFamily(
            "gray_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily<BasicBlockForm> DARK_GRAY_ROOF_TILES = BlockFactory.registerFamily(
            "dark_gray_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily<BasicBlockForm> LIGHT_GRAY_ROOF_TILES = BlockFactory.registerFamily(
            "light_gray_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GRAY));
    public static final BlockFamily<BasicBlockForm> OFF_GRAY_ROOF_TILES = BlockFactory.registerFamily(
            "off_gray_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GRAY));

    public static final BlockFamily<BasicBlockForm> GREEN_ROOF_TILES = BlockFactory.registerFamily(
            "green_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily<BasicBlockForm> BRIGHT_GREEN_ROOF_TILES = BlockFactory.registerFamily(
            "bright_green_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily<BasicBlockForm> DARK_GREEN_ROOF_TILES = BlockFactory.registerFamily(
            "dark_green_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily<BasicBlockForm> LIGHT_GREEN_ROOF_TILES = BlockFactory.registerFamily(
            "light_green_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));
    public static final BlockFamily<BasicBlockForm> OFF_GREEN_ROOF_TILES = BlockFactory.registerFamily(
            "off_green_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_GREEN));

    public static final BlockFamily<BasicBlockForm> RED_ROOF_TILES = BlockFactory.registerFamily(
            "red_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));
    public static final BlockFamily<BasicBlockForm> BRIGHT_RED_ROOF_TILES = BlockFactory.registerFamily(
            "bright_red_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));
    public static final BlockFamily<BasicBlockForm> DARK_RED_ROOF_TILES = BlockFactory.registerFamily(
            "dark_red_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));
    public static final BlockFamily<BasicBlockForm> LIGHT_RED_ROOF_TILES = BlockFactory.registerFamily(
            "light_red_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));
    public static final BlockFamily<BasicBlockForm> OFF_RED_ROOF_TILES = BlockFactory.registerFamily(
            "off_red_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_RED));

    public static final BlockFamily<BasicBlockForm> YELLOW_ROOF_TILES = BlockFactory.registerFamily(
            "yellow_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily<BasicBlockForm> BRIGHT_YELLOW_ROOF_TILES = BlockFactory.registerFamily(
            "bright_yellow_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily<BasicBlockForm> DARK_YELLOW_ROOF_TILES = BlockFactory.registerFamily(
            "dark_yellow_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily<BasicBlockForm> LIGHT_YELLOW_ROOF_TILES = BlockFactory.registerFamily(
            "light_yellow_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    public static final BlockFamily<BasicBlockForm> OFF_YELLOW_ROOF_TILES = BlockFactory.registerFamily(
            "off_yellow_roof_tiles", BlockFamilySettings.CLAY(MapColor.TERRACOTTA_YELLOW));
    // endregion

    // region WOOD
    public static final BlockFamily<BasicBlockForm> WEATHERED_SHINGLES = BlockFactory.registerFamily(
            "weathered_shingles", BlockFamilySettings.WOOD_REGULAR(MapColor.WHITE_GRAY));

    public static final BlockFamily<BasicBlockForm> TREATED_WOOD = BlockFactory.registerFamily(
            "treated_wood", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_PLANKS = BlockFactory.registerFamily(
            "treated_wood_planks", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN));
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_BEAM = BlockFactory.registerFamily(
            "treated_wood_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_CARVED_BEAM = BlockFactory.registerFamily(
            "treated_wood_carved_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_PANELS = BlockFactory.registerFamily(
            "treated_wood_panels", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN));
    public static final BlockFamily<BasicBlockForm> TREATED_WOOD_TILING = BlockFactory.registerFamily(
            "treated_wood_tiling", BlockFamilySettings.WOOD_REGULAR(MapColor.SPRUCE_BROWN));

    public static final BlockFamily<BasicBlockForm> AGED_WOOD = BlockFactory.registerFamily(
            "aged_wood", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_BOARDS = BlockFactory.registerFamily(
            "aged_wood_boards", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_CARVING = BlockFactory.registerFamily(
            "aged_wood_carving", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_PLANKS = BlockFactory.registerFamily(
            "aged_wood_planks", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_BEAM = BlockFactory.registerFamily(
            "aged_wood_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_FISH_CARVING = BlockFactory.registerFamily(
            "aged_wood_fish_carving", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_PANELS = BlockFactory.registerFamily(
            "aged_wood_panels", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN));
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_SHINGLES = BlockFactory.registerFamily(
            "aged_wood_shingles", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN));

    public static final BlockFamily<BasicBlockForm> AGED_WOOD_CARVED_BEAM = BlockFactory.registerFamily(
            "aged_wood_carved_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_KNOTTED_BEAM = BlockFactory.registerFamily(
            "aged_wood_knotted_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_REDDISH_BEAM = BlockFactory.registerFamily(
            "aged_wood_reddish_beam", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());

    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_CARVED_PILLAR = BlockFactory.registerFamily(
            "aged_wood_gilded_carved_pillar", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_CARVING = BlockFactory.registerFamily(
            "aged_wood_gilded_carving", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_HORSES = BlockFactory.registerFamily(
            "aged_wood_gilded_horses", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    public static final BlockFamily<BasicBlockForm> AGED_WOOD_GILDED_TRIM = BlockFactory.registerFamily(
            "aged_wood_gilded_trim", BlockFamilySettings.WOOD_REGULAR(MapColor.TERRACOTTA_BROWN).isPillar());
    // endregion

    // region THATCH
    public static final BlockFamily<BasicBlockForm> THATCH = BlockFactory.registerFamily(
            "thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED));
    public static final BlockFamily<BasicBlockForm> WEATHERED_THATCH = BlockFactory.registerFamily(
            "weathered_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED));
    public static final BlockFamily<BasicBlockForm> AGED_THATCH = BlockFactory.registerFamily(
            "aged_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED));
    public static final BlockFamily<BasicBlockForm> OLD_THATCH = BlockFactory.registerFamily(
            "old_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));
    public static final BlockFamily<BasicBlockForm> ROTTEN_THATCH = BlockFactory.registerFamily(
            "rotten_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));

    public static final BlockFamily<BasicBlockForm> WAXED_THATCH = BlockFactory.registerFamily(
            "waxed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_WEATHERED_THATCH = BlockFactory.registerFamily(
            "waxed_weathered_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_AGED_THATCH = BlockFactory.registerFamily(
            "waxed_aged_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_OLD_THATCH = BlockFactory.registerFamily(
            "waxed_old_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_ROTTEN_THATCH = BlockFactory.registerFamily(
            "waxed_rotten_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));

    public static final BlockFamily<BasicBlockForm> REED_THATCH = BlockFactory.registerFamily(
            "reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.UNAFFECTED));
    public static final BlockFamily<BasicBlockForm> WEATHERED_REED_THATCH = BlockFactory.registerFamily(
            "weathered_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.EXPOSED));
    public static final BlockFamily<BasicBlockForm> AGED_REED_THATCH = BlockFactory.registerFamily(
            "aged_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.WEATHERED));
    public static final BlockFamily<BasicBlockForm> OLD_REED_THATCH = BlockFactory.registerFamily(
            "old_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));
    public static final BlockFamily<BasicBlockForm> ROTTEN_REED_THATCH = BlockFactory.registerFamily(
            "rotten_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, Oxidizable.OxidationLevel.OXIDIZED));

    public static final BlockFamily<BasicBlockForm> WAXED_REED_THATCH = BlockFactory.registerFamily(
            "waxed_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_WEATHERED_REED_THATCH = BlockFactory.registerFamily(
            "waxed_weathered_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_AGED_REED_THATCH = BlockFactory.registerFamily(
            "waxed_aged_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_OLD_REED_THATCH = BlockFactory.registerFamily(
            "waxed_old_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    public static final BlockFamily<BasicBlockForm> WAXED_ROTTEN_REED_THATCH = BlockFactory.registerFamily(
            "waxed_rotten_reed_thatch", BlockFamilySettings.THATCH(MapColor.PALE_YELLOW, null));
    // endregion

    // region REED, STRAW
    public static final BlockFamily<BasicBlockForm> REED = BlockFactory.registerFamily(
            "reed_block",
            new BlockFamilySettings(
                    AbstractBlock.Settings.create()
                            .strength(0.6f, 0.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BANJO)
                            .sounds(BlockSoundGroup.GRASS)
                            .burnable())
                    .isPillar()
                    .formSet(BasicBlockFormSet.REGULAR)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> STRAW = BlockFactory.registerFamily(
            "straw_block",
            new BlockFamilySettings(
                    AbstractBlock.Settings.create()
                            .strength(0.6f, 0.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BANJO)
                            .sounds(BlockSoundGroup.GRASS)
                            .burnable())
                    .isPillar()
                    .formSet(BasicBlockFormSet.REGULAR)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    // endregion

    // region CUT METAL
    public static final BlockFamily<BasicBlockForm> CUT_BRONZE = BlockFactory.registerFamily(
            "cut_bronze", BlockFamilySettings.METAL(MapColor.ORANGE));
    public static final BlockFamily<BasicBlockForm> CUT_CRUDE_PLATES = BlockFactory.registerFamily(
            "cut_crude_plates", BlockFamilySettings.METAL(MapColor.DIRT_BROWN));
    public static final BlockFamily<BasicBlockForm> CUT_LEAD = BlockFactory.registerFamily(
            "cut_lead", BlockFamilySettings.METAL(MapColor.GRAY));
    public static final BlockFamily<BasicBlockForm> CUT_SILVER = BlockFactory.registerFamily(
            "cut_silver", BlockFamilySettings.METAL(MapColor.WHITE));
    // endregion
}
