package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.verticalSlabs.TransparentVerticalSlab;
import net.sevenstars.middleearth.block.special.verticalSlabs.VerticalSlabBlock;

public enum BasicBlockForm implements BlockForm<BasicBlockForm> {
    // @formatter:off
    BASE            ("",                (config, base) -> createBase(config, base)),
    SLAB            ("_slab",           (config, base) -> createSlab(config)),
    VERTICAL_SLAB   ("_vertical_slab",  (config, base) -> createVerticalSlab(config)),
    STAIRS          ("_stairs",         (config, base) -> createStairs(config, base.getDefaultState())),
    WALL            ("_wall",           (config, base) -> createWall(config)),
    FENCE           ("_fence",          (config, base) -> createFence(config)),
    FENCE_GATE      ("_gate",           (config, base) -> createFenceGate(config)),
    DOOR            ("_door",           (config, base) -> createDoor(config)),
    TRAPDOOR        ("_trapdoor",       (config, base) -> createTrapdoor(config)),
    PRESSURE_PLATE  ("_pressure_plate", (config, base) -> createPressurePlate(config)),
    BUTTON          ("_button",         (config, base) -> createButton(config)),
    ROCKS           ("_rocks",          (config, base) -> createRocks(config)),
    STOOL           ("_stool",          (config, base) -> createStool(config)),
    TABLE           ("_table",          (config, base) -> createTable(config)),
    CHAIR           ("_chair",          (config, base) -> createChair(config)),
    BENCH           ("_bench",          (config, base) -> createBench(config)),
    LADDER          ("_ladder",         (config, base) -> createLadder(config)),
    BASE_T          ("",                (config, base) -> createTransparentBase(config)),  // Transparent
    VERTICAL_SLAB_T ("_vertical_slab",  (config, base) -> createTransparentVerticalSlab(config)); // Transparent
    // @formatter:on
    // TODO: @Yelfra | Add panel? Possibly missing bar variants (as in iron bars)?

    private final String suffix;
    private final FormFactory<BlockConfig<BasicBlockForm>, Block, Block> factory;

    private static final WoodType WOOD_TYPE = WoodType.OAK; // FenceGateBlock requires a WoodType
    private static final int PRESS_TICKS = 30; // Button requires this

    BasicBlockForm(String suffix, FormFactory<BlockConfig<BasicBlockForm>, Block, Block> factory) {
        this.suffix = suffix;
        this.factory = factory;
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public Block create(BlockConfig<BasicBlockForm> config, Block base) {
        return factory.apply(config, base);
    }

    /* Form Constructors */
    // region BASIC
    private static Block createBase(BlockConfig<BasicBlockForm> config, Block base) {
        if (base != null) {
            return base;
        }
        // TODO: @Yelfra | Oxidizable pillar blocks?
        if (config.oxidationLevel != null) {
            return new OxidizableBlock(config.oxidationLevel, config.settings);
        }
        return config.isPillar ? new PillarBlock(config.settings) : new Block(config.settings);
    }

    private static Block createSlab(BlockConfig<BasicBlockForm> config) {
        if (config.oxidationLevel != null) {
            return new OxidizableSlabBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new SlabBlock(config.settings.nonOpaque());
    }

    private static Block createVerticalSlab(BlockConfig<BasicBlockForm> config) {
        if (config.oxidationLevel != null) {
            return new OxidizableVerticalSlabBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new VerticalSlabBlock(config.settings.nonOpaque());
    }

    private static Block createStairs(BlockConfig<BasicBlockForm> config, BlockState baseState) {
        if (config.oxidationLevel != null) {
            return new OxidizableStairsBlock(config.oxidationLevel, baseState, config.settings.nonOpaque());
        }
        return new StairsBlock(baseState, config.settings.nonOpaque());
    }

    private static Block createWall(BlockConfig<BasicBlockForm> config) {
        if (config.oxidationLevel != null) {
            return new OxidizableWallBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new WallBlock(config.settings.nonOpaque());
    }

    private static Block createFence(BlockConfig<BasicBlockForm> config) {
        return new FenceBlock(config.settings.nonOpaque());
    }

    private static Block createFenceGate(BlockConfig<BasicBlockForm> config) {
        return new FenceGateBlock(WOOD_TYPE, config.settings.nonOpaque());
    }
    // endregion

    // region REDSTONE
    private static Block createDoor(BlockConfig<BasicBlockForm> config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new DoorBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createTrapdoor(BlockConfig<BasicBlockForm> config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new TrapdoorBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createPressurePlate(BlockConfig<BasicBlockForm> config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new PressurePlateBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createButton(BlockConfig<BasicBlockForm> config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new ButtonBlock(config.material.type, PRESS_TICKS, config.settings.nonOpaque());
    }
    // endregion

    // region DECORATIVE
    private static Block createRocks(BlockConfig<BasicBlockForm> config) {
        return new RocksBlock(config.settings.nonOpaque());
    }

    private static Block createStool(BlockConfig<BasicBlockForm> config) {
        if (config.material == BlockConfig.BlockMaterial.WOOD) {
            return new WoodStoolBlock(config.settings.nonOpaque());
        }
        return new StoolBlock(config.settings.nonOpaque());
    }

    private static Block createTable(BlockConfig<BasicBlockForm> config) {
        if (config.material == BlockConfig.BlockMaterial.WOOD) {
            return new WoodTableBlock(config.settings.nonOpaque());
        }
        return new StoneTableBlock(config.settings.nonOpaque());
    }

    private static Block createChair(BlockConfig<BasicBlockForm> config) {
        if (config.material == BlockConfig.BlockMaterial.WOOD) {
            return new WoodChairBlock(config.settings.nonOpaque());
        }
        return new StoneChairBlock(config.settings.nonOpaque());
    }

    private static Block createBench(BlockConfig<BasicBlockForm> config) {
        return new WoodBenchBlock(config.settings.nonOpaque());
    }

    private static Block createLadder(BlockConfig<BasicBlockForm> config) {
        return new ThickLadderBlock(config.settings.nonOpaque());
    }

    private static Block createTransparentBase(BlockConfig<BasicBlockForm> config) {
        return new TransparentBlock(config.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                .suffocates(Blocks::never).blockVision(Blocks::never));
    }

    private static Block createTransparentVerticalSlab(BlockConfig<BasicBlockForm> config) {
        return new TransparentVerticalSlab(config.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                .suffocates(Blocks::never).blockVision(Blocks::never));
    }
    // endregion
}
