package net.sevenstars.middleearth.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.verticalSlabs.VerticalSlabBlock;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;

// TODO: @Yelfra | Rename this back to FamilyFactory as it's not useful for singular blocks
/**
 * Used for creating and registering (or fetching existing vanilla) blocks
 * - and (optionally) grouping them together in a BlockFamily.
 * Works like a method container for passing preset arguments to BlockRegistry.
 */
public class YelfraBlockFactory {

    private static final WoodType WOOD_TYPE = WoodType.OAK; // Some block constructors such as FenceGateBlock require a WoodType
    private static final int PRESS_TICKS = 30; // Button constructors require this

    public static BlockFamily registerFamilyWithBase(@Nullable Block base, YelfraBlockFamilyConfig config) {
        Map<YelfraBlockForm, Block> map = new EnumMap<>(YelfraBlockForm.class);

        if (config.formSet.contains(YelfraBlockForm.BASE)) {
            if (base == null) {
                base = createBase(config.name, config);
            }
            map.put(YelfraBlockForm.BASE, base);
        }
        config.settings.nonOpaque();

        String name = normalizeName(config.name);

        for (YelfraBlockForm form : config.formSet) {
            String formName = name + form.getSuffix();
            switch (form) {
                case SLAB           -> map.put(form, createSlab(formName, config));
                case VERTICAL_SLAB  -> map.put(form, createVerticalSlab(formName, config));
                case STAIRS         -> map.put(form, createStairs(formName, base.getDefaultState(), config));
                case WALL           -> map.put(form, createWall(formName, config));
                case FENCE          -> map.put(form, createFence(formName, config));
                case FENCE_GATE     -> map.put(form, createFenceGate(formName, config));
                case DOOR           -> map.put(form, createDoor(formName, config));
                case TRAPDOOR       -> map.put(form, createTrapdoor(formName, config));
                case PRESSURE_PLATE -> map.put(form, createPressurePlate(formName, config));
                case BUTTON         -> map.put(form, createButton(formName, config));
                case ROCKS          -> map.put(form, createRocks(formName, config));
                case STOOL          -> map.put(form, createStool(formName, config));
                case TABLE          -> map.put(form, createTable(formName, config));
                case CHAIR          -> map.put(form, createChair(formName, config));
                case BENCH          -> map.put(form, createBench(formName, config));
                case LADDER         -> map.put(form, createLadder(formName, config));
            }
        }

        return new BlockFamily(map);
    }

    public static BlockFamily registerFamily(YelfraBlockFamilyConfig config) {
        return registerFamilyWithBase(null, config);
    }

    /* Helper methods for creating each form */
    /* BASIC */
    public static Block createBase(String name, YelfraBlockFamilyConfig config) {
        // TODO: @Yelfra | Oxidizable pillar blocks?
        if (config.oxidationLevel != null) {
            return createBlock(name, s -> new OxidizableBlock(config.oxidationLevel, s), config.settings, config.group);
        }
        return createBlock(name,
                config.isPillar ? PillarBlock::new : Block::new, config.settings, config.group);
    }

    public static Block createSlab(String name, YelfraBlockFamilyConfig config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableSlabBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, SlabBlock::new, config.settings, config.group);
    }

    public static Block createVerticalSlab(String name, YelfraBlockFamilyConfig config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableVerticalSlabBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, VerticalSlabBlock::new, config.settings, config.group);
    }

    public static Block createStairs(String name, BlockState baseState, YelfraBlockFamilyConfig config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableStairsBlock(config.oxidationLevel, baseState, s)), config.settings, config.group);
        }
        return createBlock(name, (s -> new StairsBlock(baseState, s)), config.settings, config.group);
    }

    public static Block createWall(String name, YelfraBlockFamilyConfig config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableWallBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, WallBlock::new, config.settings, config.group);
    }

    public static Block createFence(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, FenceBlock::new, config.settings, config.group);
    }

    public static Block createFenceGate(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, (s -> new FenceGateBlock(WOOD_TYPE, s)), config.settings, config.group);
    }

    /* REDSTONE */
    public static Block createDoor(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, (s -> new DoorBlock(config.formSet.type, s)), config.settings, config.group);
    }

    public static Block createTrapdoor(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, (s -> new TrapdoorBlock(config.formSet.type, s)), config.settings, config.group);
    }

    public static Block createPressurePlate(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, (s -> new PressurePlateBlock(config.formSet.type, s)), config.settings, config.group);
    }

    public static Block createButton(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, (s -> new ButtonBlock(config.formSet.type, PRESS_TICKS, s)), config.settings, config.group);
    }

    /* DECORATIVE */
    public static Block createRocks(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, RocksBlock::new, config.settings, config.group);
    }

    public static Block createStool(String name, YelfraBlockFamilyConfig config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodStoolBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoolBlock::new, config.settings, config.group);
    }

    public static Block createTable(String name, YelfraBlockFamilyConfig config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodTableBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoneTableBlock::new, config.settings, config.group);
    }

    public static Block createChair(String name, YelfraBlockFamilyConfig config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodChairBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoneChairBlock::new, config.settings, config.group);
    }

    public static Block createBench(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, WoodBenchBlock::new, config.settings, config.group);
    }

    public static Block createLadder(String name, YelfraBlockFamilyConfig config) {
        return createBlock(name, ThickLadderBlock::new, config.settings, config.group);
    }

    /* All "createForm" helper methods call this */
    private static Block createBlock(String name,
                                     Function<AbstractBlock.Settings, Block> factory,
                                     AbstractBlock.Settings settings, List<ItemStack> group) {
        return YelfraBlockRegistration.getOrRegisterBlock(name, factory, settings, group);
    }

    private static String normalizeName(String name) {
        return name.replace("_bricks", "_brick")
                .replace("_tiles", "_tile")
                .replace("_block", "");
    }
}
