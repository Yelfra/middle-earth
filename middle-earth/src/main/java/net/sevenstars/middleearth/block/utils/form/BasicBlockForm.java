package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.verticalSlabs.TransparentVerticalSlab;
import net.sevenstars.middleearth.block.special.verticalSlabs.VerticalSlabBlock;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.Collections;
import java.util.List;

public enum BasicBlockForm implements BlockForm {
    // @formatter:off
    BASE            ("",                (config, base) -> createOrGetBase(config, base)),
    SLAB            ("_slab",           (config, base) -> createSlab(config)),
    VERTICAL_SLAB   ("_vertical_slab",  (config, base) -> createVerticalSlab(config)),
    STAIRS          ("_stairs",         (config, base) -> createStairs(config, base.getDefaultState())),
    WALL            ("_wall",           (config, base) -> createWall(config)),

    BASE_T          ("",                (config, base) -> createTransparentBase(config)),  // Transparent
    VERTICAL_SLAB_T ("_vertical_slab",  (config, base) -> createTransparentVerticalSlab(config)), // Transparent

    DOOR            ("_door",           (config, base) -> createDoor(config)),
    TRAPDOOR        ("_trapdoor",       (config, base) -> createTrapdoor(config)),
    PRESSURE_PLATE  ("_pressure_plate", (config, base) -> createPressurePlate(config)),
    BUTTON          ("_button",         (config, base) -> createButton(config)),

    // TODO: @Yelfra | Possibly separate decoration forms to WoodBlockForm/StoneBlockForm
    STOOL           ("_stool",          (config, base) -> createStool(config)),
    TABLE           ("_table",          (config, base) -> createTable(config)),
    CHAIR           ("_chair",          (config, base) -> createChair(config)),
    BENCH           ("_bench",          (config, base) -> createBench(config)),
    LADDER          ("_ladder",         (config, base) -> createLadder(config));
    // TODO: @Yelfra | Add pane? Possibly missing bar forms (as in iron bars)?
    // @formatter:on

    private final String suffix;
    private final FormFactory<BlockConfig, Block, Block> factory;

    private static final int PRESS_TICKS = 30; // Button requires this

    BasicBlockForm(String suffix, FormFactory<BlockConfig, Block, Block> factory) {
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
    public Block create(BlockConfig config, Block base) {
        return factory.apply(config, base);
    }

    @Override
    public List<List<ItemStack>> getItemGroups() {
        return switch (this) {
            case STOOL, TABLE, CHAIR, BENCH, LADDER ->
                    List.of(ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
            default -> Collections.emptyList();
        };
    }

    /* Form Constructors */
    // region BASIC
    private static Block createOrGetBase(BlockConfig config, Block base) {
        if (base != null) {
            return base;
        }

        if (config.oxidationLevel != null) {
            return new OxidizableBlock(config.oxidationLevel, config.settings);
        }
        return config.isPillar ? new PillarBlock(config.settings) : new Block(config.settings);
    }

    private static Block createSlab(BlockConfig config) {
        if (config.oxidationLevel != null) {
            return new OxidizableSlabBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new SlabBlock(config.settings.nonOpaque());
    }

    private static Block createVerticalSlab(BlockConfig config) {
        if (config.oxidationLevel != null) {
            return new OxidizableVerticalSlabBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new VerticalSlabBlock(config.settings.nonOpaque());
    }

    private static Block createStairs(BlockConfig config, BlockState baseState) {
        if (config.oxidationLevel != null) {
            return new OxidizableStairsBlock(config.oxidationLevel, baseState, config.settings.nonOpaque());
        }
        return new StairsBlock(baseState, config.settings.nonOpaque());
    }

    private static Block createWall(BlockConfig config) {
        if (config.oxidationLevel != null) {
            return new OxidizableWallBlock(config.oxidationLevel, config.settings.nonOpaque());
        }
        return new WallBlock(config.settings.nonOpaque());
    }
    // endregion

    // region REDSTONE
    private static Block createDoor(BlockConfig config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new DoorBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createTrapdoor(BlockConfig config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new TrapdoorBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createPressurePlate(BlockConfig config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new PressurePlateBlock(config.material.type, config.settings.nonOpaque());
    }

    private static Block createButton(BlockConfig config) {
        if (config.material == null) {
            throw new IllegalArgumentException("BlockMaterial cannot be null");
        }
        return new ButtonBlock(config.material.type, PRESS_TICKS, config.settings.nonOpaque());
    }
    // endregion

    // region DECORATIVE
    private static Block createStool(BlockConfig config) {
        return (config.material == BlockConfig.BlockMaterial.WOOD) ?
                new WoodStoolBlock(config.settings.nonOpaque()) :
                new StoolBlock(config.settings.nonOpaque());
    }

    private static Block createTable(BlockConfig config) {
        return (config.material == BlockConfig.BlockMaterial.WOOD) ?
                new WoodTableBlock(config.settings.nonOpaque()) :
                new StoneTableBlock(config.settings.nonOpaque());
    }

    private static Block createChair(BlockConfig config) {
        return (config.material == BlockConfig.BlockMaterial.WOOD) ?
                new WoodChairBlock(config.settings.nonOpaque()) :
                new StoneChairBlock(config.settings.nonOpaque());
    }

    private static Block createBench(BlockConfig config) {
        return new WoodBenchBlock(config.settings.nonOpaque());
    }

    private static Block createLadder(BlockConfig config) {
        return new ThickLadderBlock(config.settings.nonOpaque());
    }

    private static Block createTransparentBase(BlockConfig config) {
        return new TransparentBlock(config.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                .suffocates(Blocks::never).blockVision(Blocks::never));
    }

    private static Block createTransparentVerticalSlab(BlockConfig config) {
        return new TransparentVerticalSlab(config.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                .suffocates(Blocks::never).blockVision(Blocks::never));
    }
    // endregion
}
