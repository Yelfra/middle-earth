package net.sevenstars.middleearth.block.registration;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.*;
import net.sevenstars.middleearth.block.special.LayersBlock;
import net.sevenstars.middleearth.block.special.SpikesBlock;
import net.sevenstars.middleearth.block.special.StoneMyceliumBlock;
import net.sevenstars.middleearth.block.special.dirts.CustomFarmlandBlock;
import net.sevenstars.middleearth.block.special.dirts.CustomGrassBlock;
import net.sevenstars.middleearth.block.special.dirts.CustomPathBlock;
import net.sevenstars.middleearth.block.special.pointedBlocks.PointedDolomiteBlock;
import net.sevenstars.middleearth.block.special.pointedBlocks.PointedGalonnBlock;
import net.sevenstars.middleearth.block.special.pointedBlocks.PointedIzherabanBlock;
import net.sevenstars.middleearth.block.special.pointedBlocks.PointedLimestoneBlock;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import static net.sevenstars.middleearth.block.BasicBlockForm.*;

public class YelfraModBlocks {
    public static final float DIRT_STRENGTH = 0.6f;

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering ModBlocks for " + MiddleEarth.MOD_ID);

        registerFlammable();
    }

    private static void registerFlammable() {
        BlockBehaviour.registerFlammable(TREATED_WOOD_ROPE_FENCE, 20, 5);
        BlockBehaviour.registerFlammable(NET, 60, 30);
    }

    // TODO: @Yelfra | For god's sake fix the custom Pointed...Block classes to not reinvent the wheel by copying PointedDripstoneBlock
    // region POINTED DRIPSTONE (Variants)
    public static final Block POINTED_DOLOMITE = BlockRegistration.registerBlock(
            "pointed_dolomite",
            PointedDolomiteBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_LIMESTONE = BlockRegistration.registerBlock(
            "pointed_limestone",
            PointedLimestoneBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_IZHERABAN = BlockRegistration.registerBlock(
            "pointed_izheraban",
            PointedIzherabanBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_GALONN = BlockRegistration.registerBlock(
            "pointed_galonn",
            PointedGalonnBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    // endregion

    // region WATTLE TRAPDOORS
    public static final Block BLACK_WATTLE_TRAPDOOR = BlockRegistration.registerBlock(
            "black_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_TRAPDOOR = BlockRegistration.registerBlock(
            "dark_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_TRAPDOOR = BlockRegistration.registerBlock(
            "green_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_TRAPDOOR = BlockRegistration.registerBlock(
            "red_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block WATTLE_TRAPDOOR = BlockRegistration.registerBlock(
            "wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    // endregion

    public static final Block TREATED_WOOD_ROPE_FENCE = BlockRegistration.registerBlock(
            "treated_wood_rope_fence",
            FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS); // TODO: @Yelfra | Used to be droppable - Implement droppable in new fence class?

    // region DIRT, GRASS, SOIL
    public static final Block SNOWY_GRASS_BLOCK = BlockRegistration.registerBlock(
            "snowy_grass_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily<BasicBlockForm> SNOWY_DIRT = BlockFactory.registerFamily(
            "snowy_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> DRY_DIRT = BlockFactory.registerFamily(
            "dry_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> GRASSY_DIRT = BlockFactory.registerFamily(
            "grassy_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> PEBBLED_GRASS = BlockFactory.registerFamily(
            "pebbled_grass",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.COBBLESTONE))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COBBLY_DIRT = BlockFactory.registerFamily(
            "cobbly_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final Block MIRE = BlockRegistration.registerBlock(
            "mire",
            MudBlock::new,
            AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // TODO: @Yelfra | Implement MudBlock slabs and stairs?
    public static final Block MIRE_SLAB = BlockRegistration.registerBlock(
            "mire_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(MIRE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MIRE_STAIRS = BlockRegistration.registerBlock(
            "mire_stairs",
            (settings) -> new StairsBlock(MIRE.getDefaultState(), settings), AbstractBlock.Settings.copy(MIRE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final BlockFamily<BasicBlockForm> TURF = BlockFactory.registerFamily(
            "turf",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRASS))
                    .formSet(new BasicBlockFormSet(BASE, SLAB, VERTICAL_SLAB, STAIRS))
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily<BasicBlockForm> DIRTY_ROOTS = BlockFactory.registerFamily(
            "dirty_roots",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily<BasicBlockForm> FOUL_DIRT = BlockFactory.registerFamily(
            "foul_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily<BasicBlockForm> ASHEN_DIRT = BlockFactory.registerFamily(
            "ashen_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COBBLY_ASHEN_DIRT = BlockFactory.registerFamily(
            "cobbly_ashen_dirt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    // endregion

    // region CHALKSOIL
    public static final BlockFamily<BasicBlockForm> CHALKSOIL = BlockFactory.registerFamily(
            "chalksoil",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block CHALKSOIL_GRASS_BLOCK = BlockRegistration.registerBlock(
            "chalksoil_grass_block",
            (settings) -> new CustomGrassBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily<BasicBlockForm> GRASSY_CHALKSOIL = BlockFactory.registerFamily(
            "grassy_chalksoil",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COARSE_CHALKSOIL = BlockFactory.registerFamily(
            "coarse_chalksoil",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block CHALKSOIL_PATH = BlockRegistration.registerBlock(
            "chalksoil_path",
            (settings) -> new CustomPathBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CHALKSOIL_FARMLAND = BlockRegistration.registerBlock(
            "chalksoil_farmland",
            (settings) -> new CustomFarmlandBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region LOAM
    public static final BlockFamily<BasicBlockForm> LOAM = BlockFactory.registerFamily(
            "loam",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block LOAM_GRASS_BLOCK = BlockRegistration.registerBlock(
            "loam_grass_block",
            (settings) -> new CustomGrassBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily<BasicBlockForm> GRASSY_LOAM = BlockFactory.registerFamily(
            "grassy_loam",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COARSE_LOAM = BlockFactory.registerFamily(
            "coarse_loam",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block LOAM_PATH = BlockRegistration.registerBlock(
            "loam_path",
            (settings) -> new CustomPathBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LOAM_FARMLAND = BlockRegistration.registerBlock(
            "loam_farmland",
            (settings) -> new CustomFarmlandBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region PEAT
    public static final BlockFamily<BasicBlockForm> PEAT = BlockFactory.registerFamily(
            "peat",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block PEAT_GRASS_BLOCK = BlockRegistration.registerBlock(
            "peat_grass_block",
            (settings) -> new CustomGrassBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily<BasicBlockForm> GRASSY_PEAT = BlockFactory.registerFamily(
            "grassy_peat",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COARSE_PEAT = BlockFactory.registerFamily(
            "coarse_peat",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block PEAT_PATH = BlockRegistration.registerBlock(
            "peat_path",
            (settings) -> new CustomPathBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block PEAT_FARMLAND = BlockRegistration.registerBlock(
            "peat_farmland",
            (settings) -> new CustomFarmlandBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region SILT
    public static final BlockFamily<BasicBlockForm> SILT = BlockFactory.registerFamily(
            "silt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block SILT_GRASS_BLOCK = BlockRegistration.registerBlock(
            "silt_grass_block",
            (settings) -> new CustomGrassBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily<BasicBlockForm> GRASSY_SILT = BlockFactory.registerFamily(
            "grassy_silt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily<BasicBlockForm> COARSE_SILT = BlockFactory.registerFamily(
            "coarse_silt",
            new BlockConfig(
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(BasicBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block SILT_PATH = BlockRegistration.registerBlock(
            "silt_path",
            (settings) -> new CustomPathBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILT_FARMLAND = BlockRegistration.registerBlock(
            "silt_farmland",
            (settings) -> new CustomFarmlandBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block EMBERS = BlockRegistration.registerBlock(
            "embers",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.NETHERRACK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region PILES
    public static final Block SKELETAL_PILE = BlockRegistration.registerBlock(
            "skeletal_pile",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BONE_BLOCK).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.BONE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SKELETAL_PILE_LAYER = BlockRegistration.registerBlock(
            "skeletal_pile_layer",
            (settings) -> new LayersBlock(settings, SKELETAL_PILE),
            AbstractBlock.Settings.copy(SKELETAL_PILE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block WASTE_PILE = BlockRegistration.registerBlock(
            "waste_pile",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.MUD).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WASTE_PILE_LAYER = BlockRegistration.registerBlock(
            "waste_pile_layer",
            (settings) -> new LayersBlock(settings, WASTE_PILE),
            AbstractBlock.Settings.copy(WASTE_PILE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // TODO: @Yelfra | Helper method for base, cross, left, right, pillar, diamond
    // region WATTLE
    public static final BlockFamily<WattleBlockForm> WATTLE_AND_BRICK = BlockFactory.registerWattleFamily(
            "wattle_and_brick", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> WATTLE_AND_WHITE_DAUB = BlockFactory.registerWattleFamily(
            "wattle_and_white_daub", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> BLACK_WATTLE_AND_WHITE_DAUB = BlockFactory.registerWattleFamily(
            "black_wattle_and_white_daub", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> GREEN_WATTLE_AND_WHITE_DAUB = BlockFactory.registerWattleFamily(
            "green_wattle_and_white_daub", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> RED_WATTLE_AND_WHITE_DAUB = BlockFactory.registerWattleFamily(
            "red_wattle_and_white_daub", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> DARK_WATTLE_AND_WHITE_DAUB = BlockFactory.registerWattleFamily(
            "dark_wattle_and_white_daub", BlockConfig.WATTLE_AND_DAUB());
    public static final BlockFamily<WattleBlockForm> WATTLE_AND_YELLOW_DAUB = BlockFactory.registerWattleFamily(
            "wattle_and_yellow_daub", BlockConfig.WATTLE_AND_DAUB());
    //endregion

    // region METAL
    public static final Block RAW_MITHRIL_BLOCK = BlockRegistration.registerBlock(
            "raw_mithril_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(4f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MITHRIL_BLOCK = BlockRegistration.registerBlock(
            "mithril_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_TIN_BLOCK = BlockRegistration.registerBlock(
            "raw_tin_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE).strength(2f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TIN_BLOCK = BlockRegistration.registerBlock(
            "tin_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_LEAD_BLOCK = BlockRegistration.registerBlock(
            "raw_lead_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LEAD_BLOCK = BlockRegistration.registerBlock(
            "lead_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(2f).requiresTool(), // TODO: @Yelfra | Strength value compared to raw block seems inconsistent with other types
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_SILVER_BLOCK = BlockRegistration.registerBlock(
            "raw_silver_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILVER_BLOCK = BlockRegistration.registerBlock(
            "silver_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_BLOCK = BlockRegistration.registerBlock(
            "bronze_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(5f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_BLOCK = BlockRegistration.registerBlock(
            "crude_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(5.5f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block STEEL_BLOCK = BlockRegistration.registerBlock(
            "steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block KHAZAD_STEEL_BLOCK = BlockRegistration.registerBlock(
            "khazad_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(7f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block EDHEL_STEEL_BLOCK = BlockRegistration.registerBlock(
            "edhel_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BURZUM_STEEL_BLOCK = BlockRegistration.registerBlock(
            "burzum_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block NET = BlockRegistration.registerBlock(
            "net",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_WOOL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region BARS
    public static final Block BRONZE_BARS = BlockRegistration.registerBlock(
            "bronze_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_BARS = BlockRegistration.registerBlock(
            "crude_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_BARS = BlockRegistration.registerBlock(
            "treated_steel_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BURZUM_BARS = BlockRegistration.registerBlock(
            "burzum_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILVER_BARS = BlockRegistration.registerBlock(
            "silver_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).sounds(BlockSoundGroup.METAL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GILDED_BARS = BlockRegistration.registerBlock(
            "gilded_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).sounds(BlockSoundGroup.COPPER),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region DOORS, TRAPDOORS
    public static final Block AGED_WOOD_DOOR = BlockRegistration.registerBlock(
            "aged_wood_door",
            (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings),
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_DOOR = BlockRegistration.registerBlock(
            "bronze_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_DOOR = BlockRegistration.registerBlock(
            "crude_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_DOOR = BlockRegistration.registerBlock(
            "treated_steel_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block AGED_WOOD_TRAPDOOR = BlockRegistration.registerBlock(
            "aged_wood_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings),
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_TRAPDOOR = BlockRegistration.registerBlock(
            "bronze_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_TRAPDOOR = BlockRegistration.registerBlock(
            "crude_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_TRAPDOOR = BlockRegistration.registerBlock(
            "treated_steel_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block BURZUM_SPIKES = BlockRegistration.registerBlock(
            "burzum_spikes",
            SpikesBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region SAND & GRAVEL
    public static final Block RIVER_SAND = BlockRegistration.registerBlock(
            "river_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // TODO: @Yelfra | Missing RIVER_SAND_LAYER?
    public static final Block BLACK_SAND = BlockRegistration.registerBlock(
            "black_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_SAND_LAYER = BlockRegistration.registerBlock(
            "black_sand_layer",
            (settings) -> new LayersBlock(settings, BLACK_SAND),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WHITE_SAND = BlockRegistration.registerBlock(
            "white_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WHITE_SAND_LAYER = BlockRegistration.registerBlock(
            "white_sand_layer",
            (settings) -> new LayersBlock(settings, WHITE_SAND),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_SAND = BlockRegistration.registerBlock(
            "ashen_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.SAND).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_SAND_LAYER = BlockRegistration.registerBlock(
            "ashen_sand_layer",
            (settings) -> new LayersBlock(settings, ASHEN_SAND),
            AbstractBlock.Settings.copy(ASHEN_SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_GRAVEL = BlockRegistration.registerBlock(
            "ashen_gravel",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.GRAVEL).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_GRAVEL_LAYER = BlockRegistration.registerBlock(
            "ashen_gravel_layer",
            (settings) -> new LayersBlock(settings, ASHEN_GRAVEL),
            AbstractBlock.Settings.copy(ASHEN_GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block STONE_MYCELIUM = BlockRegistration.registerBlock(
            "stone_mycelium",
            StoneMyceliumBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE).ticksRandomly(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block ASH_BLOCK = BlockRegistration.registerBlock(
            "ash_block",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
}
