package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.registration.ModBlocks;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.crop.*;
import net.sevenstars.middleearth.block.special.hangingstuff.CustomHangingBlock;
import net.sevenstars.middleearth.block.special.hangingstuff.HangingCobwebBlock;
import net.sevenstars.middleearth.block.special.plants.*;
import net.sevenstars.middleearth.block.special.saplings.VariantSaplingBlock;
import net.sevenstars.middleearth.block.special.shelobiteeggs.ShelobiteLarvaEggBlock;
import net.sevenstars.middleearth.block.special.shelobiteeggs.ShelobiteLarvaEggHangingBlock;
import net.sevenstars.middleearth.datageneration.content.TranslationEntries;
import net.sevenstars.middleearth.datageneration.content.models.TintableCrossModel;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;
import net.sevenstars.middleearth.registries.RegistryAliasesME;
import net.sevenstars.middleearth.world.features.tree.ModTreeConfiguredFeatures;
import net.sevenstars.middleearth.world.features.tree.MushroomTreeConfiguredFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import static net.sevenstars.middleearth.block.registration.WoodBlockSets.LEAVES_STRENGTH;

public class NatureBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Nature Blocks for " + MiddleEarth.MOD_ID);
    }

    // TODO: @Yelfra | Assign flammability/burnable

    // region MOSS
    public static final Block CORRUPTED_MOSS_CARPET = BlockRegistration.registerBlockWithItem("corrupted_moss_carpet",
            CarpetBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block CORRUPTED_MOSS_BLOCK = BlockRegistration.registerBlockWithItem("corrupted_moss_block",
            Block::new, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(0.1f).sounds(BlockSoundGroup.MOSS_BLOCK), ItemGroupsME.NATURE_BLOCKS_CONTENTS);

    public static final Block FOREST_MOSS_CARPET = BlockRegistration.registerBlockWithItem("forest_moss_carpet",
            CarpetBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block FOREST_MOSS_BLOCK = BlockRegistration.registerBlockWithItem("forest_moss_block",
            Block::new, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(0.1f).sounds(BlockSoundGroup.MOSS_BLOCK), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region PODZOL
    public static final Block OLD_PODZOL = BlockRegistration.registerBlockWithItem("old_podzol",
            Block::new, AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).strength(0.5F).sounds(BlockSoundGroup.GRAVEL), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block LORIEN_PODZOL = BlockRegistration.registerBlockWithItem("lorien_podzol",
            Block::new, AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).strength(0.5F).sounds(BlockSoundGroup.GRAVEL), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region GREEN PLANTS
    private static Block registerGreenPlant(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ)
                        .mapColor(DyeColor.GREEN),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block BLUE_FESCUE =         registerGreenPlant("blue_fescue",           CustomPlantBlock::new);
    public static final Block BROWN_GRASS =         registerGreenPlant("brown_grass",           CustomPlantBlock::new);
    public static final Block DYING_GRASS =         registerGreenPlant("dying_grass",           CustomPlantBlock::new);
    public static final Block GRIM_GRASS =          registerGreenPlant("grim_grass",            CustomPlantBlock::new);
    public static final Block MEADOWGRASS =         registerGreenPlant("meadowgrass",           CustomPlantBlock::new);
    public static final Block SPARSE_GRASS =        registerGreenPlant("sparse_grass",          CustomPlantBlock::new);
    public static final Block TEMPERATE_GRASS =     registerGreenPlant("temperate_grass",       CustomPlantBlock::new);
    public static final Block GRASS_TUFT =          registerGreenPlant("grass_tuft",            CustomPlantBlock::new);
    public static final Block HEATHER =             registerGreenPlant("heather",               CustomPlantBlock::new);
    public static final Block RED_HEATHER =         registerGreenPlant("red_heather",           CustomPlantBlock::new);
    public static final Block DEAD_HEATHER =        registerGreenPlant("dead_heather",          CustomPlantBlock::new);
    public static final Block DRY_HEATHER =         registerGreenPlant("dry_heather",           CustomPlantBlock::new);
    public static final Block HEATH =               registerGreenPlant("heath",                 CustomPlantBlock::new);

    public static final Block WHEATGRASS =          registerGreenPlant("wheatgrass",            CustomPlantBlock::new);
    public static final Block WILDERGRASS =         registerGreenPlant("wildergrass",           CustomPlantBlock::new);
    public static final Block WILD_GRASS =          registerGreenPlant("wild_grass",            CustomPlantBlock::new);

    public static final Block SEDUM =               registerGreenPlant("sedum",                 CustomPlantBlock::new);
    public static final Block ORANGE_SEDUM =        registerGreenPlant("orange_sedum",          CustomPlantBlock::new);
    public static final Block RED_SEDUM =           registerGreenPlant("red_sedum",             CustomPlantBlock::new);
    public static final Block YELLOW_SEDUM =        registerGreenPlant("yellow_sedum",          CustomPlantBlock::new);

    public static final Block GREEN_SHRUB =         registerGreenPlant("green_shrub",           CustomPlantBlock::new);
    public static final Block SMALL_DRY_SHRUB =     registerGreenPlant("small_dry_shrub",       CustomPlantBlock::new);

    public static final Block BEACH_GRASS =         registerGreenPlant("beach_grass",           DesertPlantBlock::new);
    public static final Block COASTAL_PANIC_GRASS = registerGreenPlant("coastal_panic_grass",   DesertPlantBlock::new);

    public static final Block TAN_SHRUB =           registerGreenPlant("tan_shrub",             DesertPlantBlock::new);

    public static final Block SHORT_DEAD_RUSHES =   registerGreenPlant("short_dead_rushes",     WaterloggablePlant::new);
    public static final Block SHORT_RUSHES =        registerGreenPlant("short_rushes",          WaterloggablePlant::new);
    public static final Block SHORT_REEDS =         registerGreenPlant("short_reeds",           WaterloggablePlant::new);
    public static final Block SHORT_CATTAILS =      registerGreenPlant("short_cattails",        WaterloggablePlant::new);
    public static final Block SHORT_BULRUSH =       registerGreenPlant("short_bulrush",         WaterloggablePlant::new);

    public static final Block FROZEN_GRASS =        registerGreenPlant("frozen_grass",          DesertPlantBlock::new);
    public static final Block FROZEN_TUFT =         registerGreenPlant("frozen_tuft",           CustomPlantBlock::new);
    public static final Block FROZEN_SHRUB =        registerGreenPlant("frozen_shrub",          CustomPlantBlock::new);

    public static final Block SCORCHED_GRASS =      registerGreenPlant("scorched_grass",        DesertPlantBlock::new);
    public static final Block SCORCHED_TUFT =       registerGreenPlant("scorched_tuft",         CustomPlantBlock::new);
    public static final Block SCORCHED_SHRUB =      registerGreenPlant("scorched_shrub",        CustomPlantBlock::new);

    public static final Block NETTLES =             registerGreenPlant("nettles",               PricklyPlantBlock::new);
    public static final Block THISTLE =             registerGreenPlant("thistle",               PricklyPlantBlock::new);

    public static final Block ATHELAS =             registerGreenPlant("athelas",               CustomPlantBlock::new);

    public static final Block BRAMBLES_OF_MORDOR =  registerGreenPlant("brambles_of_mordor",    MordorPricklyPlantBlock::new);
    // @formatter:on

    public static final Block BRACKEN = BlockRegistration.registerBlockWithItem("bracken",
            CustomPlantBlock::new, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ)
                    .mapColor(DyeColor.GREEN), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block GIANT_BUTTERBUR = BlockRegistration.registerBlockWithItem("giant_butterbur",
            CustomPlantBlock::new, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ)
                    .mapColor(DyeColor.GREEN), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region BROWN PLANTS
    private static Block registerBrownPlant(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).offset(AbstractBlock.OffsetType.XYZ)
                        .mapColor(DyeColor.BROWN),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block BLUE_BIGLEAF_HYDRANGEA =  registerBrownPlant("blue_bigleaf_hydrangea",    CustomPlantBlock::new);
    public static final Block PINK_BIGLEAF_HYDRANGEA =  registerBrownPlant("pink_bigleaf_hydrangea",    CustomPlantBlock::new);
    public static final Block WHITE_BIGLEAF_HYDRANGEA = registerBrownPlant("white_bigleaf_hydrangea",   CustomPlantBlock::new);
    public static final Block CAMPION =                 registerBrownPlant("campion",                   CustomPlantBlock::new);
    public static final Block FALSE_OATGRASS =          registerBrownPlant("false_oatgrass",            CustomPlantBlock::new);
    public static final Block LARGE_BLUE_FESCUE =       registerBrownPlant("large_blue_fescue",         CustomPlantBlock::new);
    public static final Block LARGE_BUSH =              registerBrownPlant("large_bush",                CustomPlantBlock::new);
    public static final Block LARGE_SHRIVELED_SHRUB =   registerBrownPlant("large_shriveled_shrub",     CustomPlantBlock::new);
    public static final Block HEATHER_BUSH =            registerBrownPlant("heather_bush",              CustomPlantBlock::new);
    public static final Block RED_HEATHER_BUSH =        registerBrownPlant("red_heather_bush",          CustomPlantBlock::new);
    public static final Block DRY_HEATHER_BUSH =        registerBrownPlant("dry_heather_bush",          CustomPlantBlock::new);
    public static final Block DEAD_HEATHER_BUSH =       registerBrownPlant("dead_heather_bush",         CustomPlantBlock::new);

    public static final Block RUSHES =                  registerBrownPlant("rushes",                    WaterloggablePlant::new);
    public static final Block DEAD_RUSHES =             registerBrownPlant("dead_rushes",               WaterloggablePlant::new);
    // @formatter:on
    public static final Block SHRIVELED_SHRUB = BlockRegistration.registerBlockWithItem("shriveled_shrub",
            CustomPlantBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BUSH).offset(AbstractBlock.OffsetType.XYZ)
                    .mapColor(DyeColor.BROWN), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region FLOWERS
    private static Block registerGlowingFlower(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                (settings) -> new FlowerBlock(StatusEffects.GLOWING, 3, settings),
                AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).noCollision().breakInstantly()
                        .sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ).mapColor(DyeColor.GREEN),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    private static Block registerFlower(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                (settings) -> new FlowerBlock(StatusEffects.SATURATION, 0, settings),
                AbstractBlock.Settings.copy(Blocks.DANDELION),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block ELANOR =      registerGlowingFlower("elanor");
    public static final Block MALLOS =      registerGlowingFlower("mallos");
    public static final Block NIPHREDIL =   registerGlowingFlower("niphredil");
    public static final Block SIMBELMYNE =  registerGlowingFlower("simbelmyne");

    public static final Block BLUE_GENTIAN =            registerFlower("blue_gentian");
    public static final Block GREEN_JEWEL_CORNFLOWER =  registerFlower("green_jewel_cornflower");
    public static final Block NOBLEWHITE =              registerFlower("noblewhite");

    public static final Block LIGHT_BLUE_FLOWERS =      registerFlower("light_blue_flowers");
    public static final Block MAGENTA_FLOWERS =         registerFlower("magenta_flowers");
    public static final Block ORANGE_FLOWERS =          registerFlower("orange_flowers");
    public static final Block PINK_FLOWERS =            registerFlower("pink_flowers");
    public static final Block PURPLE_FLOWERS =          registerFlower("purple_flowers");
    public static final Block RED_FLOWERS =             registerFlower("red_flowers");
    public static final Block WHITE_FLOWERS =           registerFlower("white_flowers");
    public static final Block YELLOW_FLOWERS =          registerFlower("yellow_flowers");

    public static final Block BLUE_LAVENDER =           registerFlower("blue_lavender");
    public static final Block LAVENDER =                registerFlower("lavender");
    public static final Block WHITE_LAVENDER =          registerFlower("white_lavender");
    public static final Block YELLOW_TROLLIUS =         registerFlower("yellow_trollius");
    // @formatter:on
    public static final Block YELLOW_FLOWER = BlockRegistration.registerBlockWithItem("yellow_flower",
            (settings) -> new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 0, settings), AbstractBlock.Settings.copy(Blocks.DANDELION), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block HOBBIT_SUNFLOWERS = BlockRegistration.registerBlockWithItem("hobbit_sunflowers",
            RotatableTallFlowerBlock::new, AbstractBlock.Settings.copy(Blocks.SUNFLOWER), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region FLOWER SHRUBS
    public static final Block HOGWEED = BlockRegistration.registerBlockWithItem("hogweed",
            TallPlantBlock::new, AbstractBlock.Settings.copy(Blocks.TALL_GRASS).breakInstantly(), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block SHORT_HOGWEED = BlockRegistration.registerBlockWithItem("short_hogweed",
            CustomPlantBlock::new, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region LICHEN/GROWTHS
    private static Block registerLichenGrowth(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                GlowLichenBlock::new,
                AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).replaceable().noCollision().strength(0.2f).sounds(BlockSoundGroup.GLOW_LICHEN)
                        .mapColor(DyeColor.GREEN).burnable(),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block AZALEA_FLOWER_GROWTH =    registerLichenGrowth("azalea_flower_growth");
    public static final Block DRY_GROWTH =              registerLichenGrowth("dry_growth");
    public static final Block GREEN_GROWTH =            registerLichenGrowth("green_growth");
    public static final Block IVY_GROWTH =              registerLichenGrowth("ivy_growth");
    public static final Block LILAC_FLOWER_GROWTH =     registerLichenGrowth("lilac_flower_growth");
    public static final Block PINK_FLOWER_GROWTH =      registerLichenGrowth("pink_flower_growth");
    public static final Block RED_FLOWER_GROWTH =       registerLichenGrowth("red_flower_growth");
    public static final Block THORNY_GROWTH =           registerLichenGrowth("thorny_growth");
    public static final Block WHITE_FLOWER_GROWTH =     registerLichenGrowth("white_flower_growth");
    public static final Block YELLOW_FLOWER_GROWTH =    registerLichenGrowth("yellow_flower_growth");

    public static final Block CORRUPTED_MOSS =          registerLichenGrowth("corrupted_moss");
    public static final Block MOSS =                    registerLichenGrowth("moss");
    public static final Block FOREST_MOSS =             registerLichenGrowth("forest_moss");
    public static final Block FROZEN_GROWTH =           registerLichenGrowth("frozen_growth");
    // @formatter:on
    public static final Block MORGUL_IVY = BlockRegistration.registerBlockWithItem("morgul_ivy",
            GlowLichenBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).replaceable().noCollision().strength(0.2f).sounds(BlockSoundGroup.GLOW_LICHEN)
                    .mapColor(DyeColor.GREEN).luminance(GlowLichenBlock.getLuminanceSupplier(5)).burnable(), ItemGroupsME.NATURE_BLOCKS_CONTENTS);

    public static final Block STICKY_SNOW = BlockRegistration.registerBlockWithItem("sticky_snow",
            GlowLichenBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.WHITE).replaceable().noCollision()
                    .strength(0.2f).sounds(BlockSoundGroup.SNOW), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block STICKY_ICE = BlockRegistration.registerBlockWithItem("sticky_ice",
            GlowLichenBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).replaceable().noCollision()
                    .strength(0.2f).sounds(BlockSoundGroup.GLASS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region CLOVERS
    public static final Block CLOVERS = BlockRegistration.registerBlockWithItem("clovers",
            FlowerbedBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_PETALS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region TALL BUSH
    public static final Block TALL_CATTAILS = BlockRegistration.registerBlockWithItem("tall_cattails",
            (settings) -> new CustomWaterloggableTallPlantBlock(settings, false), AbstractBlock.Settings.copy(Blocks.TALL_GRASS).breakInstantly(), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block TALL_BULRUSH = BlockRegistration.registerBlockWithItem("tall_bulrush",
            (settings) -> new CustomWaterloggableTallPlantBlock(settings, false), AbstractBlock.Settings.copy(Blocks.TALL_GRASS).breakInstantly(), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region LILY PADS
    private static Block registerLilyPads(String name, Consumer<AbstractBlock.Settings> modifier) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(Blocks.LILY_PAD);
        modifier.accept(settings);

        return BlockRegistration.registerBlock(name, LilyPadBlock::new, settings);
    }

    // @formatter:off
    public static final Block LARGE_FLOWERING_LILY_PAD =    registerLilyPads("large_flowering_lily_pad",    s -> {});
    public static final Block LARGE_LILY_PAD =              registerLilyPads("large_lily_pad",              s -> {});
    public static final Block SMALL_LILY_PADS =             registerLilyPads("small_lily_pads",             s -> s.noCollision());
    public static final Block SMALL_FLOWERING_LILY_PADS =   registerLilyPads("small_flowering_lily_pads",   s -> s.noCollision());
    public static final Block LILY_PADS =                   registerLilyPads("lily_pads",                   s -> s.noCollision());
    public static final Block FLOWERING_LILY_PADS =         registerLilyPads("flowering_lily_pads",         s -> s.noCollision());

    public static final Block DUCKWEED =                    registerLilyPads("duckweed",                    s -> s.noCollision());
    // @formatter:on
    // endregion

    // region ICE
    public static final Block SHORT_ICICLES = BlockRegistration.registerBlockWithItem("short_icicles",
            ShortIciclesBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).noCollision()
                    .strength(0.2f).sounds(BlockSoundGroup.GLASS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block DROOPING_ICICLES = BlockRegistration.registerBlockWithItem("drooping_icicles",
            DroopingIciclesBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).noCollision()
                    .strength(0.2f).sounds(BlockSoundGroup.GLASS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);

    public static final Block FLOATING_ICE = BlockRegistration.registerBlock("floating_ice",
            FloatingIceBlock::new, AbstractBlock.Settings.copy(Blocks.ICE));
    // endregion

    // region MUSHROOMS
    private static Block registerMushroomPlant(String name, RegistryKey<ConfiguredFeature<?, ?>> featureKey, Consumer<AbstractBlock.Settings> modifier) {
        return registerMushroom(name, Blocks.BROWN_MUSHROOM, settings -> new MushroomPlantBlock(featureKey, settings), modifier);
    }

    private static Block registerMushroomVariant(String name, Function<AbstractBlock.Settings, Block> factory, Consumer<AbstractBlock.Settings> modifier) {
        return registerMushroom(name, Blocks.BROWN_MUSHROOM, factory, modifier);
    }

    private static Block registerMushroomBlock(String name) {
        return registerMushroom(name, Blocks.BROWN_MUSHROOM_BLOCK, MushroomBlock::new, s -> {});
    }

    private static Block registerMushroom(String name, Block baseBlock, Function<AbstractBlock.Settings, Block> factory, Consumer<AbstractBlock.Settings> modifier) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(baseBlock);
        modifier.accept(settings);

        return BlockRegistration.registerBlockWithItem(
                name,
                factory,
                settings,
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block BROWN_BOLETE =    registerMushroomPlant("brown_bolete",    MushroomTreeConfiguredFeatures.BROWN_BOLETTE_TREE_KEY,   s -> {});
    public static final Block CAVE_AMANITA =    registerMushroomPlant("cave_amanita",    MushroomTreeConfiguredFeatures.CAVE_AMANITA_TREE_KEY,    s -> {});
    public static final Block DEEP_FIRECAP =    registerMushroomPlant("deep_firecap",    MushroomTreeConfiguredFeatures.DEEP_FIRECAP_TREE_KEY,    s -> {});
    public static final Block SKY_FIRECAP =     registerMushroomPlant("sky_firecap",     MushroomTreeConfiguredFeatures.SKY_FIRECAP_TREE_KEY,     s -> {});
    public static final Block YELLOW_AMANITA =  registerMushroomPlant("yellow_amanita",  MushroomTreeConfiguredFeatures.YELLOW_AMANITA_TREE_KEY,  s -> {});
    public static final Block MORSEL =          registerMushroomPlant("morsel",          null, s -> {});
    public static final Block TRUMPET_SHROOM =  registerMushroomPlant("trumpet_shroom",  null, s -> {});
    public static final Block VIOLET_CAPS =     registerMushroomPlant("violet_caps",     null, s -> {});
    public static final Block WHITE_MUSHROOM =  registerMushroomPlant("white_mushroom",  null, s -> {});

    public static final Block GHOSTSHROOM =     registerMushroomPlant("ghostshroom",     null, s -> s.luminance(state -> 4));
    public static final Block TUBESHRROM =      registerMushroomPlant("tubeshroom",      null, s -> s.luminance(state -> 4));

    public static final Block TALL_TRUMPET_SHROOM =     registerMushroomVariant("tall_trumpet_shroom",     TallMushroomBlock::new, s -> {});
    public static final Block TALL_TUBESHROOM =         registerMushroomVariant("tall_tubeshroom",         TallMushroomBlock::new, s -> s.luminance(state -> 5));

    public static final Block BROWN_BOLETE_TILLER =     registerMushroomVariant("brown_bolete_tiller",     FlowerbedMushroomBlock::new, s -> {});
    public static final Block CAVE_AMANITA_TILLER =     registerMushroomVariant("cave_amanita_tiller",     FlowerbedMushroomBlock::new, s -> {});
    public static final Block DEEP_FIRECAP_TILLER =     registerMushroomVariant("deep_firecap_tiller",     FlowerbedMushroomBlock::new, s -> {});
    public static final Block MORSEL_TILLER =           registerMushroomVariant("morsel_tiller",           FlowerbedMushroomBlock::new, s -> {});
    public static final Block SKY_FIRECAP_TILLER =      registerMushroomVariant("sky_firecap_tiller",      FlowerbedMushroomBlock::new, s -> {});
    public static final Block VIOLET_CAPS_TILLER =      registerMushroomVariant("violet_caps_tiller",      FlowerbedMushroomBlock::new, s -> {});
    public static final Block WHITE_MUSHROOM_TILLER =   registerMushroomVariant("white_mushroom_tiller",   FlowerbedMushroomBlock::new, s -> {});
    public static final Block YELLOW_AMANITA_TILLER =   registerMushroomVariant("yellow_amanita_tiller",   FlowerbedMushroomBlock::new, s -> {});
    public static final Block GHOSTSHROOM_TILLER =      registerMushroomVariant("ghostshroom_tiller",      FlowerbedMushroomBlock::new, s -> s.luminance(state -> 4));

    public static final Block BROWN_BOLETE_BLOCK =      registerMushroomBlock("brown_bolete_block");
    public static final Block CAVE_AMANITA_BLOCK =      registerMushroomBlock("cave_amanita_block");
    public static final Block DEEP_FIRECAP_BLOCK =      registerMushroomBlock("deep_firecap_block");
    public static final Block SKY_FIRECAP_BLOCK =       registerMushroomBlock("sky_firecap_block");
    public static final Block YELLOW_AMANITA_BLOCK =    registerMushroomBlock("yellow_amanita_block");
    // @formatter:on
    // endregion

    // region SAPLINGS
    @SafeVarargs
    private static Block registerSapling(String name, RegistryKey<ConfiguredFeature<?, ?>>... featureKeys) {
        if (featureKeys.length == 0) {
            throw new IllegalArgumentException("No feature keys provided");
        }

        Function<AbstractBlock.Settings, Block> factory;
        if (featureKeys.length > 1) {
            List<SaplingGenerator> generators = new ArrayList<>(featureKeys.length);
            for (RegistryKey<ConfiguredFeature<?, ?>> featureKey : featureKeys) {
                generators.add(new SaplingGenerator(name, Optional.empty(), Optional.ofNullable(featureKey), Optional.empty()));
            }

            factory = settings -> new VariantSaplingBlock(settings, generators);
        } else {
            factory = settings -> new SaplingBlock(
                    new SaplingGenerator(
                            name,
                            Optional.empty(), Optional.ofNullable(featureKeys[0]), Optional.empty()),
                    settings);
        }

        Block saplingBlock = BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.OAK_SAPLING),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );

        TintableCrossModel.notTintedBlocks.add(saplingBlock);

        return saplingBlock;
    }

    // @formatter:off
    public static final Block ASPEN_SAPLING =           registerSapling("aspen_sapling",            ModTreeConfiguredFeatures.ASPEN_TREE_KEY);
    public static final Block BEECH_SAPLING =           registerSapling("beech_sapling",            ModTreeConfiguredFeatures.BEECH_TREE_KEY);
    public static final Block CHESTNUT_SAPLING =        registerSapling("chestnut_sapling",         ModTreeConfiguredFeatures.CHESTNUT_TREE_KEY);
    public static final Block HOLLY_SAPLING =           registerSapling("holly_sapling",            ModTreeConfiguredFeatures.HOLLY_TREE_KEY);
    public static final Block FIR_SAPLING =             registerSapling("fir_sapling",              ModTreeConfiguredFeatures.FIR_TREE_KEY);
    public static final Block LARCH_SAPLING =           registerSapling("larch_sapling",            ModTreeConfiguredFeatures.LARCH_TREE_KEY);
    public static final Block WHITE_LEBETHRON_SAPLING = registerSapling("white_lebethron_sapling",  ModTreeConfiguredFeatures.WHITE_LEBETHRON_TREE_KEY);
    public static final Block MALLORN_SAPLING =         registerSapling("mallorn_sapling",          ModTreeConfiguredFeatures.MEGA_MALLORN_TREE_KEY);
    public static final Block MIRKWOOD_SAPLING =        registerSapling("mirkwood_sapling",         ModTreeConfiguredFeatures.SMALL_MIRKWOOD_TREE_KEY);
    public static final Block WHITE_PALM_SAPLING =      registerSapling("white_palm_sapling",       ModTreeConfiguredFeatures.WHITE_PALM_TREE_KEY);
    public static final Block PINE_SAPLING =            registerSapling("pine_sapling",             ModTreeConfiguredFeatures.PINE_TREE_KEY);
    public static final Block BLACK_PINE_SAPLING =      registerSapling("black_pine_sapling",       ModTreeConfiguredFeatures.BLACK_PINE_TREE_KEY);
    public static final Block WHITE_SPRUCE_SAPLING =    registerSapling("white_spruce_sapling",     ModTreeConfiguredFeatures.WILLOW_TREE_KEY);
    public static final Block WILLOW_SAPLING =          registerSapling("willow_sapling",           ModTreeConfiguredFeatures.WILLOW_TREE_KEY);

    public static final Block LEBETHRON_SAPLING =       registerSapling("lebethron_sapling",        ModTreeConfiguredFeatures.BLACK_LEBETHRON_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.WHITE_LEBETHRON_TREE_KEY);
    public static final Block MAPLE_SAPLING =           registerSapling("maple_sapling",            ModTreeConfiguredFeatures.MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.YELLOW_MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.ORANGE_MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.RED_MAPLE_TREE_KEY);
    public static final Block SILVER_MAPLE_SAPLING =    registerSapling("silver_maple_sapling",     ModTreeConfiguredFeatures.SILVER_MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.SILVER_YELLOW_MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.SILVER_ORANGE_MAPLE_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.SILVER_RED_MAPLE_TREE_KEY);
    public static final Block PALM_SAPLING =            registerSapling("palm_sapling",             ModTreeConfiguredFeatures.PALM_TREE_KEY,
                                                                                                            ModTreeConfiguredFeatures.WHITE_PALM_TREE_KEY);
    // @formatter:on
    // endregion

    // region LEAVES, BRANCHES
    private static Block registerLeafBlock(String name, Consumer<AbstractBlock.Settings> modifier) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(LEAVES_STRENGTH).sounds(BlockSoundGroup.GRASS);
        modifier.accept(settings);

        return BlockRegistration.registerBlockWithItem(
                name,
                (s) -> new TintedParticleLeavesBlock(0.01F, s),
                settings,
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    private static Block registerFallenLeaves(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                FallenLeavesBlock::new,
                AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET).nonOpaque().replaceable().noCollision(),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
    }

    // @formatter:off
    public static final Block LEBETHRON_LEAVES =            registerLeafBlock("lebethron_leaves",           s -> s.burnable());
    public static final Block BERRY_HOLLY_LEAVES =          registerLeafBlock("berry_holly_leaves",         s -> s.burnable());
    public static final Block DRY_LARCH_LEAVES =            registerLeafBlock("dry_larch_leaves",           s -> s.burnable());

    public static final Block ORANGE_MAPLE_LEAVES =         registerLeafBlock("orange_maple_leaves",        s -> s.burnable());
    public static final Block RED_MAPLE_LEAVES =            registerLeafBlock("red_maple_leaves",           s -> s.burnable());
    public static final Block YELLOW_MAPLE_LEAVES =         registerLeafBlock("yellow_maple_leaves",        s -> s.burnable());

    public static final Block DRY_PINE_LEAVES =             registerLeafBlock("dry_pine_leaves",            s -> s.burnable());

    public static final Block FLOWERING_MALLORN_LEAVES =    registerLeafBlock("flowering_mallorn_leaves",   s -> {});

    public static final Block FALLEN_LEAVES =           registerFallenLeaves("fallen_leaves");
    public static final Block FALLEN_MALLORN_LEAVES =   registerFallenLeaves("fallen_mallorn_leaves");
    public static final Block FALLEN_MIRKWOOD_LEAVES =  registerFallenLeaves("fallen_mirkwood_leaves");
    // @formatter:on

    public static final Block PINE_BRANCHES = BlockRegistration.registerBlockWithItem(
            "pine_branches",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(LEAVES_STRENGTH).sounds(BlockSoundGroup.GRASS).burnable(),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region VINES
    public static final Block WILLOW_VINES = BlockRegistration.registerBlockWithItem("willow_vines",
            CustomHangingBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_HANGING_MOSS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block MIRKWOOD_VINES = BlockRegistration.registerBlockWithItem("mirkwood_vines",
            CustomHangingBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_HANGING_MOSS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region BERRY BUSH
    public static final Block TOUGH_BERRY_BUSH = BlockRegistration.registerBlock("tough_berry_bush",
            ToughBerryBushBlock::new,
            AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));
    public static final Block STRAWBERRY_BUSH = BlockRegistration.registerBlock("strawberry_bush",
            StrawBerryBushBlock::new,
            AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));
    // endregion

    // region WILD CROPS
    private static Block registerWildCrop(String name, Function<AbstractBlock.Settings, Block> factory, boolean isTinted) {
        Block block = BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).sounds(BlockSoundGroup.CROP),
                ItemGroupsME.NATURE_BLOCKS_CONTENTS
        );
        if  (!isTinted) {
            TintableCrossModel.notTintedBlocks.add(block); // TODO: @Yelfra | Check with datagen later what this means
        }
        return block;
    }

    // @formatter:off
    public static final Block WILD_WHEAT =          registerWildCrop("wild_wheat",          WildCropBlock::new, false);
    public static final Block WILD_FLAX =           registerWildCrop("wild_flax",           WildCropBlock::new, false);
    public static final Block WILD_BELL_PEPPER =    registerWildCrop("wild_bell_pepper",    WildCropBlock::new, false);
    public static final Block WILD_CUCUMBER =       registerWildCrop("wild_cucumber",       WildCropBlock::new, false);
    public static final Block WILD_GARLIC =         registerWildCrop("wild_garlic",         WildCropBlock::new, false);
    public static final Block WILD_ONION =          registerWildCrop("wild_onion",          WildCropBlock::new, false);
    public static final Block WILD_LETTUCE =        registerWildCrop("wild_lettuce",        WildCropBlock::new, false);
    public static final Block WILD_LEEK =           registerWildCrop("wild_leek",           WildCropBlock::new, false);

    public static final Block WILD_POTATO =         registerWildCrop("wild_potato",         WildCropBlock::new, true);
    public static final Block WILD_CARROT =         registerWildCrop("wild_carrot",         WildCropBlock::new, true);
    public static final Block WILD_BEETROOT =       registerWildCrop("wild_beetroot",       WildCropBlock::new, true);

    public static final Block TALL_WILD_WHEAT =     registerWildCrop("tall_wild_wheat",     (settings) -> new CustomTallPlantBlock(settings, true), true);
    public static final Block WILD_PIPEWEED =       registerWildCrop("wild_pipeweed",       (settings) -> new CustomTallPlantBlock(settings, true), true);
    public static final Block WILD_TOMATO =         registerWildCrop("wild_tomato",         (settings) -> new CustomTallPlantBlock(settings, true), true);
    // @formatter:on
    // endregion

    // region CROPS
    private static Block registerCrop(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlock(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.POTATOES)
        );
    }

    // @formatter:off
    public static final Block TOMATO_CROP =         registerCrop("tomato_crop",         TomatoCropBlock::new);
    public static final Block BELL_PEPPER_CROP =    registerCrop("bell_pepper_crop",    BellpepperCropBlock::new);
    public static final Block CUCUMBER_CROP =       registerCrop("cucumber_crop",       CucumberCropBlock::new);
    public static final Block FLAX_CROP =           registerCrop("flax_crop",           FlaxCropBlock::new);
    public static final Block GARLIC_CROP =         registerCrop("garlic_crop",         GarlicCropBlock::new);
    public static final Block LEEK_CROP =           registerCrop("leek_crop",           LeekCropBlock::new);
    public static final Block LETTUCE_CROP =        registerCrop("lettuce_crop",        LettuceCropBlock::new);
    public static final Block ONION_CROP =          registerCrop("onion_crop",          OnionCropBlock::new);
    public static final Block PIPEWEED_CROP =       registerCrop("pipeweed_crop",       PipeweedCropBlock::new);
    // @formatter:on
    // endregion

    // region ROOTS
    public static final Block MIRKWOOD_ROOTS = BlockRegistration.registerBlockWithItem("mirkwood_roots",
            MangroveRootsBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_ROOTS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block MIRKWOOD_HANGING_ROOTS = BlockRegistration.registerBlockWithItem("mirkwood_hanging_roots",
            HangingRootsBlock::new, AbstractBlock.Settings.copy(Blocks.HANGING_ROOTS), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region WEBS
    public static final Block HANGING_WEBS = BlockRegistration.registerBlockWithItem("hanging_webs",
            HangingCobwebBlock::new, AbstractBlock.Settings.copy(Blocks.COBWEB), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block CORNER_COBWEB = BlockRegistration.registerBlockWithItem("corner_cobweb",
            CornerCobwebBlock::new, AbstractBlock.Settings.copy(Blocks.COBWEB), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block WEBBING = BlockRegistration.registerBlockWithItem("webbing",
            WebbingBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.WHITE).replaceable().noCollision().strength(0.2f)
                    .sounds(BlockSoundGroup.COBWEB).burnable().ticksRandomly(),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region LARVA EGGS
    public static final Block SHELOBITE_LARVA_EGG = BlockRegistration.registerBlockWithItem("shelobite_larva_egg",
            ShelobiteLarvaEggBlock::new, AbstractBlock.Settings.copy(Blocks.TURTLE_EGG), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block HANGING_SHELOBITE_LARVA_EGG = BlockRegistration.registerBlockWithItem("hanging_shelobite_larva_egg",
            ShelobiteLarvaEggHangingBlock::new, AbstractBlock.Settings.copy(Blocks.TURTLE_EGG), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    // endregion

    // region GLOW WORM
    public static final Block GLOWWORM_WEBBING = BlockRegistration.registerBlockWithItem("glowworm_webbing",
            GlowWormBottomBlock::new, AbstractBlock.Settings.copy(Blocks.WEEPING_VINES_PLANT).luminance(state -> 6), ItemGroupsME.NATURE_BLOCKS_CONTENTS);
    public static final Block GLOWWORM_MAIN = BlockRegistration.registerBlock("glowworm_main",
            GlowWormBlock::new, AbstractBlock.Settings.copy(Blocks.WEEPING_VINES).luminance(state -> 6));
    // endregion
}
