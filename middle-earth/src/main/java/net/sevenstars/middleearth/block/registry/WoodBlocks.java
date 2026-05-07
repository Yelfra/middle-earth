package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.utils.BlockCollection;
import net.sevenstars.middleearth.block.utils.variant.BlockVariantSet;
import net.sevenstars.middleearth.block.utils.variant.WoodBlockVariant;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import static net.sevenstars.middleearth.block.utils.variant.WoodBlockVariant.*;

public class WoodBlocks {
    public static final int WOOD_FUEL_TICKS = 300;

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Wood Blocks for " + MiddleEarth.MOD_ID);
    }

    // region VANILLA EXTENDED
    public static final BlockCollection<WoodBlockVariant> OAK = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "oak",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.OAK_TAN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> SPRUCE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "spruce",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.SPRUCE_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> BIRCH = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "birch",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.PALE_YELLOW);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> JUNGLE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "jungle",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.DIRT_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> ACACIA = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "acacia",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.ORANGE);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> DARK_OAK = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "dark_oak",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> MANGROVE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "mangrove",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.RED);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> CHERRY = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "cherry",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.TERRACOTTA_WHITE);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> PALE_OAK = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "pale_oak",
                    new BlockVariantSet<>(
                            WOOD_BLOCKS,
                            STRIPPED_WOOD_BLOCKS,
                            PLANK_BLOCKS,
                            REDSTONE_BLOCKS,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.OFF_WHITE);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> BAMBOO = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "bamboo",
                    new BlockVariantSet<>(
                            PLANK_BLOCKS,
                            DECORATIVE_BLOCKS,
                            SHINGLE_BLOCKS,
                            ROOFING_BLOCKS
                    ),
                    config -> {
                        config.settings.mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.BAMBOO_WOOD);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);
    // endregion

    // region M-E NATURAL
    public static final BlockCollection<WoodBlockVariant> ASPEN = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "aspen",
                    new BlockVariantSet<>(
                            WOOD_BLOCKS,
                            STRIPPED_WOOD_BLOCKS,
                            PLANK_BLOCKS,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.SPRUCE_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> BEECH = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "beech",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.LIGHT_GRAY);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> LARCH = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "larch",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.DIRT_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> BLACK_LEBETHRON = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "black_lebethron",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.BLACK);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> WHITE_LEBETHRON = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "white_lebethron",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.WHITE);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> CHESTNUT = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "chestnut",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.TERRACOTTA_YELLOW);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> FIR = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "fir",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.SPRUCE_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> HOLLY = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "holly",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.WHITE_GRAY);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> MALLORN = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "mallorn",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS_ALT
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS_ALT) {
                            config.settings.mapColor(MapColor.WHITE);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> MAPLE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "maple",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.DULL_RED);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> SILVER_MAPLE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "silver_maple",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.OFF_WHITE);

                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> MIRKWOOD = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "mirkwood",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.PALE_GREEN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> PALM = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "palm",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.DIRT_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> WHITE_PALM = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "white_palm",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.OFF_WHITE);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> PINE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "pine",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> BLACK_PINE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "black_pine",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.TERRACOTTA_ORANGE);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> WHITE_SPRUCE = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "white_spruce",
                    new BlockVariantSet<>(
                            WOOD_BLOCKS,
                            STRIPPED_WOOD_BLOCKS,
                            PLANK_BLOCKS,
                            SHINGLE_BLOCKS,
                            ROOFING_BLOCKS,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.SPRUCE_BROWN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);

    public static final BlockCollection<WoodBlockVariant> WILLOW = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "willow",
                    new BlockVariantSet<>(
                            BlockVariantSet.WOOD,
                            LEAF_BLOCKS
                    ),
                    (config, variant) -> {
                        if (variant != LEAF_BLOCKS) {
                            config.settings.mapColor(MapColor.PALE_GREEN);
                        }
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);
    // endregion

    // TODO: @Yelfra | Possible tweak of values for these to make them "weaker" wood alternatives
    // region ROTTEN, SCORCHED, DEAD
    public static final BlockCollection<WoodBlockVariant> ROTTEN_WOOD = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "rotten",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.PALE_GREEN);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);
    // TODO: @Yelfra | Removed flammability from scorched wood
    public static final BlockCollection<WoodBlockVariant> SCORCHED_WOOD = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "scorched",
                    BlockVariantSet.WOOD,
                    config -> {
                        config.settings.mapColor(MapColor.BLACK);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).fuel(WOOD_FUEL_TICKS).strippablePair(WOOD_BLOCKS, STRIPPED_WOOD_BLOCKS);
    public static final BlockCollection<WoodBlockVariant> DEAD_WOOD = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "dead",
                    new BlockVariantSet<>(
                            WOOD_BLOCKS,
                            PLANK_BLOCKS
                    ),
                    config -> {
                        config.settings.mapColor(MapColor.GRAY);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).flammable().fuel(WOOD_FUEL_TICKS);
    // endregion

    // region HYPHAE (NETHER STEM)
    public static final BlockCollection<WoodBlockVariant> CRIMSON = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "crimson",
                    BlockVariantSet.HYPHAE,
                    config -> {
                        config.settings.mapColor(MapColor.DULL_PINK);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).strippablePair(HYPHAE_BLOCKS, STRIPPED_HYPHAE_BLOCKS);
    public static final BlockCollection<WoodBlockVariant> WARPED = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "warped",
                    BlockVariantSet.HYPHAE,
                    config -> {
                        config.settings.mapColor(MapColor.DARK_AQUA);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    ).strippablePair(HYPHAE_BLOCKS, STRIPPED_HYPHAE_BLOCKS);
    // endregion

    // TODO: @Yelfra | All blocks derived from mushrooms now have the vanilla mushroom strength - Leave it that way or revert back?
    // region MUSHROOM
    public static final BlockCollection<WoodBlockVariant> MUSHROOM = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "mushroom",
                    BlockVariantSet.MUSHROOM,
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockCollection<WoodBlockVariant> DARK_MUSHROOM = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "dark_mushroom",
                    BlockVariantSet.MUSHROOM,
                    config -> {
                        config.settings.mapColor(MapColor.TERRACOTTA_BLACK);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    public static final BlockCollection<WoodBlockVariant> GRAY_MUSHROOM = BlockRegistration.registerBlockCollection(
            new BlockCollection<>(
                    "gray_mushroom",
                    BlockVariantSet.MUSHROOM,
                    config -> {
                        config.settings.mapColor(MapColor.GRAY);
                        return config;
                    }
            ),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS
    );
    // endregion
}
