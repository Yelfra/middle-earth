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

import static net.sevenstars.middleearth.block.YelfraBlockForm.*;

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
    public static final Block POINTED_DOLOMITE = YelfraBlockRegistration.registerBlock(
            "pointed_dolomite",
            PointedDolomiteBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_LIMESTONE = YelfraBlockRegistration.registerBlock(
            "pointed_limestone",
            PointedLimestoneBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_IZHERABAN = YelfraBlockRegistration.registerBlock(
            "pointed_izheraban",
            PointedIzherabanBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    public static final Block POINTED_GALONN = YelfraBlockRegistration.registerBlock(
            "pointed_galonn",
            PointedGalonnBlock::new,
            AbstractBlock.Settings.copy(Blocks.POINTED_DRIPSTONE)
                    .ticksRandomly().strength(1.5F, 3.0F).dynamicBounds()
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            ItemGroupsME.STONE_BLOCKS_CONTENTS);
    // endregion

    // region WATTLE TRAPDOORS
    public static final Block BLACK_WATTLE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "black_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "dark_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "green_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "red_wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    public static final Block WATTLE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "wattle_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    // endregion

    public static final Block TREATED_WOOD_ROPE_FENCE = YelfraBlockRegistration.registerBlock(
            "treated_wood_rope_fence",
            FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE),
            ItemGroupsME.WOOD_BLOCKS_CONTENTS); // TODO: @Yelfra | Implement droppable in new fence class?

    // region DIRT, GRASS, SOIL
    public static final Block SNOWY_GRASS_BLOCK = YelfraBlockRegistration.registerBlock(
            "snowy_grass_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily SNOWY_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "snowy_dirt",
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily DRY_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "dry_dirt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily GRASSY_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "grassy_dirt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily PEBBLED_GRASS = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "pebbled_grass",
                    AbstractBlock.Settings.copy(Blocks.COBBLESTONE))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COBBLY_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "cobbly_dirt",
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final Block MIRE = YelfraBlockRegistration.registerBlock(
            "mire",
            MudBlock::new,
            AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // TODO: @Yelfra | Implement MudBlock slabs and stairs?
    public static final Block MIRE_SLAB = YelfraBlockRegistration.registerBlock(
            "mire_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(MIRE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MIRE_STAIRS = YelfraBlockRegistration.registerBlock(
            "mire_stairs",
            (settings) -> new StairsBlock(MIRE.getDefaultState(), settings), AbstractBlock.Settings.copy(MIRE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final BlockFamily TURF = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "turf",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRASS))
                    .formSet(new YelfraBlockFormSet(BASE, SLAB, VERTICAL_SLAB, STAIRS))
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily DIRTY_ROOTS = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "dirty_roots",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily FOUL_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "foul_dirt",
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );

    public static final BlockFamily ASHEN_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "ashen_dirt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COBBLY_ASHEN_DIRT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "cobbly_ashen_dirt",
                    AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    // endregion

    // region CHALKSOIL
    public static final BlockFamily CHALKSOIL = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "chalksoil",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block CHALKSOIL_GRASS_BLOCK = YelfraBlockRegistration.registerBlock(
            "chalksoil_grass_block",
            (settings) -> new CustomGrassBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily GRASSY_CHALKSOIL = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "grassy_chalksoil",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COARSE_CHALKSOIL = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "coarse_chalksoil",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block CHALKSOIL_PATH = YelfraBlockRegistration.registerBlock(
            "chalksoil_path",
            (settings) -> new CustomPathBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CHALKSOIL_FARMLAND = YelfraBlockRegistration.registerBlock(
            "chalksoil_farmland",
            (settings) -> new CustomFarmlandBlock(settings, CHALKSOIL.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region LOAM
    public static final BlockFamily LOAM = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "loam",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block LOAM_GRASS_BLOCK = YelfraBlockRegistration.registerBlock(
            "loam_grass_block",
            (settings) -> new CustomGrassBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily GRASSY_LOAM = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "grassy_loam",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COARSE_LOAM = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "coarse_loam",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block LOAM_PATH = YelfraBlockRegistration.registerBlock(
            "loam_path",
            (settings) -> new CustomPathBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LOAM_FARMLAND = YelfraBlockRegistration.registerBlock(
            "loam_farmland",
            (settings) -> new CustomFarmlandBlock(settings, LOAM.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region PEAT
    public static final BlockFamily PEAT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "PEAT",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block PEAT_GRASS_BLOCK = YelfraBlockRegistration.registerBlock(
            "peat_grass_block",
            (settings) -> new CustomGrassBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily GRASSY_PEAT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "grassy_peat",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COARSE_PEAT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "coarse_peat",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block PEAT_PATH = YelfraBlockRegistration.registerBlock(
            "peat_path",
            (settings) -> new CustomPathBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block PEAT_FARMLAND = YelfraBlockRegistration.registerBlock(
            "peat_farmland",
            (settings) -> new CustomFarmlandBlock(settings, PEAT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region SILT
    public static final BlockFamily SILT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "silt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block SILT_GRASS_BLOCK = YelfraBlockRegistration.registerBlock(
            "silt_grass_block",
            (settings) -> new CustomGrassBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final BlockFamily GRASSY_SILT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "grassy_silt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final BlockFamily COARSE_SILT = YelfraBlockFactory.registerFamily(
            new YelfraBlockFamilyConfig(
                    "coarse_silt",
                    AbstractBlock.Settings.copy(Blocks.DIRT).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL))
                    .formSet(YelfraBlockFormSet.SOIL)
                    .group(ItemGroupsME.MISC_BLOCKS_CONTENTS)
    );
    public static final Block SILT_PATH = YelfraBlockRegistration.registerBlock(
            "silt_path",
            (settings) -> new CustomPathBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILT_FARMLAND = YelfraBlockRegistration.registerBlock(
            "silt_farmland",
            (settings) -> new CustomFarmlandBlock(settings, SILT.get(BASE)),
            AbstractBlock.Settings.copy(Blocks.FARMLAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block EMBERS = YelfraBlockRegistration.registerBlock(
            "embers",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.NETHERRACK),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region PILES
    public static final Block SKELETAL_PILE = YelfraBlockRegistration.registerBlock(
            "skeletal_pile",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BONE_BLOCK).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.BONE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SKELETAL_PILE_LAYER = YelfraBlockRegistration.registerBlock(
            "skeletal_pile_layer",
            (settings) -> new LayersBlock(settings, SKELETAL_PILE),
            AbstractBlock.Settings.copy(SKELETAL_PILE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block WASTE_PILE = YelfraBlockRegistration.registerBlock(
            "waste_pile",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.MUD).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WASTE_PILE_LAYER = YelfraBlockRegistration.registerBlock(
            "waste_pile_layer",
            (settings) -> new LayersBlock(settings, WASTE_PILE),
            AbstractBlock.Settings.copy(WASTE_PILE),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // TODO: @Yelfra | Helper method for base, cross, left, right, pillar, diamond
    // region WATTLE
    public static final Block WATTLE_AND_BRICK = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_BRICK_CROSS = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_BRICK_RIGHT = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_BRICK_LEFT = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_BRICK_PILLAR = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_BRICK_DIAMOND = YelfraBlockRegistration.registerBlock(
            "wattle_and_brick_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block WATTLE_AND_WHITE_DAUB = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_WHITE_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_WHITE_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_WHITE_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_WHITE_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_WHITE_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "wattle_and_white_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block BLACK_WATTLE_AND_WHITE_DAUB = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_WATTLE_AND_WHITE_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_WATTLE_AND_WHITE_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_WATTLE_AND_WHITE_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_WATTLE_AND_WHITE_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_WATTLE_AND_WHITE_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "black_wattle_and_white_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block GREEN_WATTLE_AND_WHITE_DAUB = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_AND_WHITE_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_AND_WHITE_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_AND_WHITE_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_AND_WHITE_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GREEN_WATTLE_AND_WHITE_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "green_wattle_and_white_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block RED_WATTLE_AND_WHITE_DAUB = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_AND_WHITE_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_AND_WHITE_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_AND_WHITE_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_AND_WHITE_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RED_WATTLE_AND_WHITE_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "red_wattle_and_white_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block DARK_WATTLE_AND_DARK_DAUB = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_AND_DARK_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_AND_DARK_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_AND_DARK_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_AND_DARK_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block DARK_WATTLE_AND_DARK_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "dark_wattle_and_dark_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block WATTLE_AND_YELLOW_DAUB = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_YELLOW_DAUB_CROSS = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub_cross",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_YELLOW_DAUB_RIGHT = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub_right",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_YELLOW_DAUB_LEFT = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub_left",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_YELLOW_DAUB_PILLAR = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub_pillar",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WATTLE_AND_YELLOW_DAUB_DIAMOND = YelfraBlockRegistration.registerBlock(
            "wattle_and_yellow_daub_diamond",
            Block::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    //endregion

    // region METAL
    public static final Block RAW_MITHRIL_BLOCK = YelfraBlockRegistration.registerBlock(
            "raw_mithril_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(4f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block MITHRIL_BLOCK = YelfraBlockRegistration.registerBlock(
            "mithril_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_TIN_BLOCK = YelfraBlockRegistration.registerBlock(
            "raw_tin_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE).strength(2f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TIN_BLOCK = YelfraBlockRegistration.registerBlock(
            "tin_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_LEAD_BLOCK = YelfraBlockRegistration.registerBlock(
            "raw_lead_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block LEAD_BLOCK = YelfraBlockRegistration.registerBlock(
            "lead_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(2f).requiresTool(), // TODO: @Yelfra | Strength value compared to raw block seems inconsistent with other types
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block RAW_SILVER_BLOCK = YelfraBlockRegistration.registerBlock(
            "raw_silver_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).strength(3f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILVER_BLOCK = YelfraBlockRegistration.registerBlock(
            "silver_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_BLOCK = YelfraBlockRegistration.registerBlock(
            "bronze_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(5f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_BLOCK = YelfraBlockRegistration.registerBlock(
            "crude_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(5.5f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block STEEL_BLOCK = YelfraBlockRegistration.registerBlock(
            "steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block KHAZAD_STEEL_BLOCK = YelfraBlockRegistration.registerBlock(
            "khazad_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(7f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block EDHEL_STEEL_BLOCK = YelfraBlockRegistration.registerBlock(
            "edhel_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BURZUM_STEEL_BLOCK = YelfraBlockRegistration.registerBlock(
            "burzum_steel_block",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(6f).requiresTool(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block NET = YelfraBlockRegistration.registerBlock(
            "net",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_WOOL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region BARS
    public static final Block BRONZE_BARS = YelfraBlockRegistration.registerBlock(
            "bronze_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_BARS = YelfraBlockRegistration.registerBlock(
            "crude_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_BARS = YelfraBlockRegistration.registerBlock(
            "treated_steel_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BURZUM_BARS = YelfraBlockRegistration.registerBlock(
            "burzum_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block SILVER_BARS = YelfraBlockRegistration.registerBlock(
            "silver_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).sounds(BlockSoundGroup.METAL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block GILDED_BARS = YelfraBlockRegistration.registerBlock(
            "gilded_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).sounds(BlockSoundGroup.COPPER),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    // region DOORS, TRAPDOORS
    public static final Block AGED_WOOD_DOOR = YelfraBlockRegistration.registerBlock(
            "aged_wood_door",
            (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings),
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_DOOR = YelfraBlockRegistration.registerBlock(
            "bronze_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_DOOR = YelfraBlockRegistration.registerBlock(
            "crude_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_DOOR = YelfraBlockRegistration.registerBlock(
            "treated_steel_door",
            (settings) -> new DoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block AGED_WOOD_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "aged_wood_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings),
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BRONZE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "bronze_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block CRUDE_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "crude_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block TREATED_STEEL_TRAPDOOR = YelfraBlockRegistration.registerBlock(
            "treated_steel_trapdoor",
            (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block BURZUM_SPIKES = YelfraBlockRegistration.registerBlock(
            "burzum_spikes",
            SpikesBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    // region SAND & GRAVEL
    public static final Block RIVER_SAND = YelfraBlockRegistration.registerBlock(
            "river_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // TODO: @Yelfra | Missing RIVER_SAND_LAYER?
    public static final Block BLACK_SAND = YelfraBlockRegistration.registerBlock(
            "black_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block BLACK_SAND_LAYER = YelfraBlockRegistration.registerBlock(
            "black_sand_layer",
            (settings) -> new LayersBlock(settings, BLACK_SAND),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WHITE_SAND = YelfraBlockRegistration.registerBlock(
            "white_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block WHITE_SAND_LAYER = YelfraBlockRegistration.registerBlock(
            "white_sand_layer",
            (settings) -> new LayersBlock(settings, WHITE_SAND),
            AbstractBlock.Settings.copy(Blocks.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_SAND = YelfraBlockRegistration.registerBlock(
            "ashen_sand",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.SAND).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_SAND_LAYER = YelfraBlockRegistration.registerBlock(
            "ashen_sand_layer",
            (settings) -> new LayersBlock(settings, ASHEN_SAND),
            AbstractBlock.Settings.copy(ASHEN_SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_GRAVEL = YelfraBlockRegistration.registerBlock(
            "ashen_gravel",
            (settings) -> new ColoredFallingBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(Blocks.GRAVEL).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    public static final Block ASHEN_GRAVEL_LAYER = YelfraBlockRegistration.registerBlock(
            "ashen_gravel_layer",
            (settings) -> new LayersBlock(settings, ASHEN_GRAVEL),
            AbstractBlock.Settings.copy(ASHEN_GRAVEL),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
    // endregion

    public static final Block STONE_MYCELIUM = YelfraBlockRegistration.registerBlock(
            "stone_mycelium",
            StoneMyceliumBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE).ticksRandomly(),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);

    public static final Block ASH_BLOCK = YelfraBlockRegistration.registerBlock(
            "ash_block",
            (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings),
            AbstractBlock.Settings.copy(Blocks.SAND).strength(DIRT_STRENGTH).sounds(BlockSoundGroup.SAND),
            ItemGroupsME.MISC_BLOCKS_CONTENTS);
}
