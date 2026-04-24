package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.YelfraBlockRegistration;
import net.sevenstars.middleearth.block.registration.ModBlocks;
import net.sevenstars.middleearth.block.special.gemstones.CustomBuddingGemBlock;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.List;

public class CrystalBlocks {

    // TODO: @Yelfra | Expand upon CrystalBlockForm (and BlockForm) in FamilyConfig and Factory
    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering GemBlocks for " + MiddleEarth.MOD_ID);
    }

    public static final Block QUARTZ_BLOCK = YelfraBlockRegistration.registerBlock(
            "quartz_block",
            AmethystBlock::new,
            AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block QUARTZ_CLUSTER = YelfraBlockRegistration.registerBlock(
            "quartz_cluster",
            (settings) -> new AmethystClusterBlock(7, 3, settings),
            AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LARGE_QUARTZ_BUD = YelfraBlockRegistration.registerBlock(
            "large_quartz_bud",
            (settings) -> new AmethystClusterBlock(5, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.QUARTZ_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MEDIUM_QUARTZ_BUD = YelfraBlockRegistration.registerBlock(
            "medium_quartz_bud",
            (settings) -> new AmethystClusterBlock(4, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.QUARTZ_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SMALL_QUARTZ_BUD = YelfraBlockRegistration.registerBlock(
            "small_quartz_bud",
            (settings) -> new AmethystClusterBlock(3, 4, settings),
            AbstractBlock.Settings.copy(ModBlocks.QUARTZ_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BUDDING_QUARTZ = YelfraBlockRegistration.registerBlock(
            "budding_quartz",
            (settings) -> new CustomBuddingGemBlock(settings, List.of(SMALL_QUARTZ_BUD, MEDIUM_QUARTZ_BUD, LARGE_QUARTZ_BUD, QUARTZ_CLUSTER)),
            AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block RED_AGATE_BLOCK = YelfraBlockRegistration.registerBlock(
            "red_agate_block",
            AmethystBlock::new,
            AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_AGATE_CLUSTER = YelfraBlockRegistration.registerBlock(
            "red_agate_cluster",
            (settings) -> new AmethystClusterBlock(7, 3, settings),
            AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LARGE_RED_AGATE_BUD = YelfraBlockRegistration.registerBlock(
            "large_red_agate_bud",
            (settings) -> new AmethystClusterBlock(5, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.RED_AGATE_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MEDIUM_RED_AGATE_BUD = YelfraBlockRegistration.registerBlock(
            "medium_red_agate_bud",
            (settings) -> new AmethystClusterBlock(4, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.RED_AGATE_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SMALL_RED_AGATE_BUD = YelfraBlockRegistration.registerBlock(
            "small_red_agate_bud",
            (settings) -> new AmethystClusterBlock(3, 4, settings),
            AbstractBlock.Settings.copy(ModBlocks.RED_AGATE_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BUDDING_RED_AGATE = YelfraBlockRegistration.registerBlock(
            "budding_red_agate",
            (settings) -> new CustomBuddingGemBlock(settings, List.of(SMALL_RED_AGATE_BUD, MEDIUM_RED_AGATE_BUD, LARGE_RED_AGATE_BUD, RED_AGATE_CLUSTER)),
            AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block CITRINE_BLOCK = YelfraBlockRegistration.registerBlock(
            "citrine_block",
            AmethystBlock::new,
            AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CITRINE_CLUSTER = YelfraBlockRegistration.registerBlock(
            "citrine_cluster",
            (settings) -> new AmethystClusterBlock(7, 3, settings),
            AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LARGE_CITRINE_BUD = YelfraBlockRegistration.registerBlock(
            "large_citrine_bud",
            (settings) -> new AmethystClusterBlock(5, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.CITRINE_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MEDIUM_CITRINE_BUD = YelfraBlockRegistration.registerBlock(
            "medium_citrine_bud",
            (settings) -> new AmethystClusterBlock(4, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.CITRINE_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SMALL_CITRINE_BUD = YelfraBlockRegistration.registerBlock(
            "small_citrine_bud",
            (settings) -> new AmethystClusterBlock(3, 4, settings),
            AbstractBlock.Settings.copy(ModBlocks.CITRINE_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BUDDING_CITRINE = YelfraBlockRegistration.registerBlock(
            "budding_citrine",
            (settings) -> new CustomBuddingGemBlock(settings, List.of(SMALL_CITRINE_BUD, MEDIUM_CITRINE_BUD, LARGE_CITRINE_BUD, CITRINE_CLUSTER)),
            AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block GLOWSTONE_BLOCK = YelfraBlockRegistration.registerBlock(
            "glowstone_block",
            AmethystBlock::new,
            AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).luminance(state -> 12),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GLOWSTONE_CLUSTER = YelfraBlockRegistration.registerBlock(
            "glowstone_cluster",
            (settings) -> new AmethystClusterBlock(7, 3, settings),
            AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).luminance(state -> 10),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LARGE_GLOWSTONE_BUD = YelfraBlockRegistration.registerBlock(
            "large_glowstone_bud",
            (settings) -> new AmethystClusterBlock(5, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.GLOWSTONE_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance(state -> 9),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MEDIUM_GLOWSTONE_BUD = YelfraBlockRegistration.registerBlock(
            "medium_glowstone_bud",
            (settings) -> new AmethystClusterBlock(4, 3, settings),
            AbstractBlock.Settings.copy(ModBlocks.GLOWSTONE_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance(state -> 7),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SMALL_GLOWSTONE_BUD = YelfraBlockRegistration.registerBlock(
            "small_glowstone_bud",
            (settings) -> new AmethystClusterBlock(3, 4, settings),
            AbstractBlock.Settings.copy(ModBlocks.GLOWSTONE_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance(state -> 5),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BUDDING_GLOWSTONE = YelfraBlockRegistration.registerBlock(
            "budding_glowstone",
            (settings) -> new CustomBuddingGemBlock(settings, List.of(SMALL_GLOWSTONE_BUD, MEDIUM_GLOWSTONE_BUD, LARGE_GLOWSTONE_BUD, GLOWSTONE_CLUSTER)),
            AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
}
