package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.utils.BlockCollection;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.variant.BlockVariantSet;
import net.sevenstars.middleearth.block.utils.variant.StoneBlockVariant;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import static net.sevenstars.middleearth.block.utils.variant.StoneBlockVariant.*;

public class StoneBlocks {
    private static final float DEEPSLATE_HARDNESS = Blocks.DEEPSLATE.getHardness();
    private static final float DEEPSLATE_BLAST_RESISTANCE = Blocks.DEEPSLATE.getBlastResistance();

    private static final float NURGON_HARDNESS = 5.0F;
    private static final float NURGON_BLAST_RESISTANCE = 7.0F;

    private static final float MEDGON_HARDNESS = 7.0F;
    private static final float MEDGON_BLAST_RESISTANCE = 9.0F;

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Stone Blocks for " + MiddleEarth.MOD_ID);
    }

    // TODO: @Yelfra | Expanding on vanilla stone? Check ExpandedVanillaBlocks for repeated registration
    public static final BlockCollection<StoneBlockVariant> STONE = registerCollection(
            new BlockCollection<>(
                    "stone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLESTONES, MOSSY_COBBLESTONES,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.STONE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GRANITE = registerCollection(
            new BlockCollection<>(
                    "granite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS),
                    config -> {
                        config.settings.mapColor(MapColor.ORANGE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> DIORITE = registerCollection(
            new BlockCollection<>(
                    "diorite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> ANDESITE = registerCollection(
            new BlockCollection<>(
                    "andesite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> CALCITE = registerCollection(
            new BlockCollection<>(
                    "calcite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE).sounds(BlockSoundGroup.CALCITE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> DRIPSTONE = registerCollection(
            new BlockCollection<>(
                    "dripstone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            SMOOTH_BLOCKS,
                            POLISHED_BLOCKS,
                            BRICKS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> DEEPSLATE = registerCollection(
            new BlockCollection<>(
                    "deepslate",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    (config, variant) -> {
                        config.settings.strength(DEEPSLATE_HARDNESS + variant.getHardnessModifier(), DEEPSLATE_BLAST_RESISTANCE)
                                .mapColor(MapColor.DEEPSLATE_GRAY)
                                .sounds(BlockSoundGroup.DEEPSLATE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> TUFF = registerCollection(
            new BlockCollection<>(
                    "tuff",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE).sounds(BlockSoundGroup.TUFF);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> BASALT = registerCollection(
            new BlockCollection<>(
                    "basalt",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.GRAY).sounds(BlockSoundGroup.BASALT);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> BLACKSTONE = registerCollection(
            new BlockCollection<>(
                    "blackstone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            POLISHED_BRICKS, MOSSY_POLISHED_BRICKS, CRACKED_POLISHED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_POLISHED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.BLACK);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> DOLOMITE = registerCollection(
            new BlockCollection<>(
                    "dolomite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_PILLARS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.LIGHT_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> SLATE = registerCollection(
            new BlockCollection<>(
                    "slate",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.STONE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> NURGON = registerCollection(
            new BlockCollection<>(
                    "nurgon",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    (config, variant) -> {
                        config.settings.strength(NURGON_HARDNESS + variant.getHardnessModifier(), NURGON_BLAST_RESISTANCE)
                                .mapColor(MapColor.TERRACOTTA_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> MEDGON = registerCollection(
            new BlockCollection<>(
                    "medgon",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    (config, variant) -> {
                        config.settings.strength(MEDGON_HARDNESS + variant.getHardnessModifier(), MEDGON_BLAST_RESISTANCE)
                                .mapColor(MapColor.TERRACOTTA_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> CHALK = registerCollection(
            new BlockCollection<>(
                    "chalk",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            BRICKS,
                            OLD_BLOCKS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GNEISS = registerCollection(
            new BlockCollection<>(
                    "gneiss",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> ZIGILABAN = registerCollection(
            new BlockCollection<>(
                    "zigilaban",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GALONN = registerCollection(
            new BlockCollection<>(
                    "galonn",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.PALE_YELLOW);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> LIMESTONE = registerCollection(
            new BlockCollection<>(
                    "limestone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_PILLARS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.YELLOW);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> IZHERABAN = registerCollection(
            new BlockCollection<>(
                    "izheraban",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_PILLARS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.PALE_YELLOW);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> TRAVERTINE = registerCollection(
            new BlockCollection<>(
                    "travertine",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            SMOOTH_BLOCKS,
                            POLISHED_BLOCKS,
                            BRICKS,
                            OLD_PILLARS),
                    config -> {
                        config.settings.mapColor(MapColor.PALE_YELLOW);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GABBRO = registerCollection(
            new BlockCollection<>(
                    "gabbro",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.BROWN);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> BURZUM_GABBRO = registerCollection(
            new BlockCollection<>(
                    "burzum_gabbro",
                    new BlockVariantSet<>(
                            CHISELED_BLOCKS,
                            CHISELED_SMOOTH_BLOCKS,
                            CHISELED_POLISHED_BLOCKS,
                            CHISELED_POLISHED_BRICKS,
                            CHISELED_BRICKS,
                            CHISELED_TILES
                    ),
                    config -> {
                        config.settings.mapColor(MapColor.BROWN);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> ASHENSTONE = registerCollection(
            new BlockCollection<>(
                    "ashenstone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, CRACKED_BRICKS,
                            TILES, CRACKED_TILES,
                            PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.BLACK).sounds(BlockSoundGroup.DEEPSLATE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> PUMICE = registerCollection(
            new BlockCollection<>(
                    "pumice",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.BLACK);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> KHAGALABAN = registerCollection(
            new BlockCollection<>(
                    "khagalaban",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.BLUE);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> BLUE_TUFF = registerCollection(
            new BlockCollection<>(
                    "blue_tuff",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> SCHIST = registerCollection(
            new BlockCollection<>(
                    "schist",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS,
                            POLISHED_BLOCKS,
                            BRICKS,
                            TILES,
                            PILLARS),
                    config -> {
                        config.settings.mapColor(MapColor.WHITE_GRAY);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> IRONSTONE = registerCollection(
            new BlockCollection<>(
                    "ironstone",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.DARK_RED);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> HEMATITE = registerCollection(
            new BlockCollection<>(
                    "hematite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS, MOSSY_COBBLED_BLOCKS,
                            SMOOTH_BLOCKS, MOSSY_SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, MOSSY_POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, MOSSY_BRICKS, CRACKED_BRICKS,
                            TILES, MOSSY_TILES, CRACKED_TILES,
                            PILLARS, MOSSY_PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            BRICKWORK_BLOCKS,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.RED);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GREEN_TUFF = registerCollection(
            new BlockCollection<>(
                    "green_tuff",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            SMOOTH_BLOCKS, CRACKED_SMOOTH_BLOCKS,
                            POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, CRACKED_BRICKS,
                            TILES, CRACKED_TILES,
                            PILLARS, CRACKED_PILLARS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_BRICKS, CHISELED_TILES,
                            OLD_BLOCKS,
                            CARVED_WINDOWS),
                    config -> {
                        config.settings.mapColor(MapColor.GREEN);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> GILDED_GREEN_TUFF = registerCollection(
            new BlockCollection<>(
                    "gilded_green_tuff",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            CHISELED_BLOCKS, CHISELED_SMOOTH_BLOCKS, CHISELED_POLISHED_BLOCKS, CHISELED_POLISHED_BRICKS, CHISELED_BRICKS, CHISELED_TILES),
                    config -> {
                        config.settings.mapColor(MapColor.GREEN);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> JADEITE = registerCollection(
            new BlockCollection<>(
                    "jadeite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS,
                            POLISHED_BLOCKS, CRACKED_POLISHED_BLOCKS,
                            BRICKS, CRACKED_BRICKS,
                            TILES, CRACKED_TILES,
                            PILLARS, CRACKED_PILLARS),
                    config -> {
                        config.settings.mapColor(MapColor.EMERALD_GREEN);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> QUARTZITE = registerCollection(
            new BlockCollection<>(
                    "quartzite",
                    new BlockVariantSet<>(
                            BASE_BLOCKS,
                            COBBLED_BLOCKS,
                            POLISHED_BLOCKS,
                            BRICKS,
                            TILES),
                    config -> {
                        config.settings.mapColor(MapColor.RAW_IRON_PINK);
                        return config;
                    }
            ));

    public static final BlockCollection<StoneBlockVariant> TAN_CLAY = registerCollection(
            new BlockCollection<>(
                    "tan_clay",
                    new BlockVariantSet<>(
                            BRICKS,
                            TILES,
                            BRICKWORK_BLOCKS),
                    config -> {
                        config.settings.mapColor(MapColor.RAW_IRON_PINK);
                        return config;
                    }
            ));

    private static BlockCollection<StoneBlockVariant> registerCollection(BlockCollection<StoneBlockVariant> collection) {
        return BlockRegistration.registerBlockCollection(collection, ItemGroupsME.STONE_BLOCKS_CONTENTS);
    }
}
