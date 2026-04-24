package net.sevenstars.middleearth.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.gemstones.CustomBuddingGemBlock;
import net.sevenstars.middleearth.block.special.verticalSlabs.VerticalSlabBlock;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;

import static net.sevenstars.middleearth.block.GemBlockForm.*;

// TODO: @Yelfra | Rename this back to FamilyFactory as it's not useful for singular blocks

/**
 * Used for creating and registering (or fetching existing vanilla) blocks
 * - and (optionally) grouping them together in a BlockFamily.
 * Works like a method container for passing preset arguments to BlockRegistry.
 */
public class BlockFactory {

    private static final WoodType WOOD_TYPE = WoodType.OAK; // Some block constructors such as FenceGateBlock require a WoodType
    private static final int PRESS_TICKS = 30; // Button constructors require this

    public static <V extends BlockVariant> BlockCollection<V> registerCollection(
            String baseName,
            BlockFamilySettings config,
            BlockVariantSet<V> variants
    ) {
        Map<V, BlockFamily<BasicBlockForm>> map = new HashMap<>(); // Could be replaced by an EnumMap but requires another parameter

        for (V variant : variants) {
            String name = variant.getPrefix() + baseName + variant.getSuffix();

            BlockFamily<BasicBlockForm> family = registerFamily(name, config);

            map.put(variant, family);
        }

        return new BlockCollection<>(map);
    }

    public static BlockFamily<BasicBlockForm> registerFamilyWithBase(@Nullable Block base, String baseName, BlockFamilySettings config) {
        Map<BasicBlockForm, Block> map = new EnumMap<>(BasicBlockForm.class);

        if (config.formSet.contains(BasicBlockForm.BASE)) {
            if (base == null) {
                base = createBase(baseName, config);
            }
            map.put(BasicBlockForm.BASE, base);
        }
        config.settings.nonOpaque();

        String name = normalizeName(baseName);

        for (BasicBlockForm form : config.formSet) {
            String formName = name + form.getSuffix();
            // @formatter:off
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
            // @formatter:on
        }

        return new BlockFamily<>(map);
    }

    public static BlockFamily<BasicBlockForm> registerFamily(String name, BlockFamilySettings config) {
        return registerFamilyWithBase(null, name, config);
    }

    public static BlockFamily<WattleBlockForm> registerWattleFamily(String baseName, BlockFamilySettings config) {
        Map<WattleBlockForm, Block> map = new EnumMap<>(WattleBlockForm.class);

        for (WattleBlockForm form : WattleBlockForm.values()) {
            map.put(form,
                    createBlock(baseName + form.getSuffix(), Block::new, config.settings, config.group));
        }

        return new BlockFamily<>(map);
    }

    public static BlockFamily<GemBlockForm> registerGemFamily(String baseName, List<ItemStack> group) {
        Map<GemBlockForm, Block> map = new EnumMap<>(GemBlockForm.class);

        for (GemBlockForm form : GemBlockForm.values()) {
            String name = form.getPrefix() + baseName + form.getSuffix();

            Block block = switch (form) {
                case BLOCK -> YelfraBlockRegistration.getOrRegisterBlock(
                        name,
                        AmethystBlock::new,
                        AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
                        group
                );
                case CLUSTER -> YelfraBlockRegistration.registerBlock(
                        name,
                        (settings) -> new AmethystClusterBlock(7, 3, settings),
                        AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER),
                        group
                );
                case LARGE_BUD -> YelfraBlockRegistration.registerBlock(
                        name,
                        (settings) -> new AmethystClusterBlock(5, 3, settings),
                        AbstractBlock.Settings.copy(Blocks.LARGE_AMETHYST_BUD),
                        group
                );
                case MEDIUM_BUD -> YelfraBlockRegistration.registerBlock(
                        name,
                        (settings) -> new AmethystClusterBlock(4, 3, settings),
                        AbstractBlock.Settings.copy(Blocks.MEDIUM_AMETHYST_BUD),
                        group
                );
                case SMALL_BUD -> YelfraBlockRegistration.registerBlock(
                        name,
                        (settings) -> new AmethystClusterBlock(3, 4, settings),
                        AbstractBlock.Settings.copy(Blocks.SMALL_AMETHYST_BUD),
                        group
                );
                case BUDDING -> YelfraBlockRegistration.registerBlock(
                        name,
                        (settings) -> new CustomBuddingGemBlock(
                                settings,
                                List.of(
                                        map.get(SMALL_BUD),
                                        map.get(MEDIUM_BUD),
                                        map.get(LARGE_BUD),
                                        map.get(CLUSTER)
                                )
                        ),
                        AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST),
                        group
                );
            };

            map.put(form, block);
        }

        return new BlockFamily<>(map);
    }

    /* Helper methods for creating each form */
    // region BASIC
    private static Block createBase(String name, BlockFamilySettings config) {
        // TODO: @Yelfra | Oxidizable pillar blocks?
        if (config.oxidationLevel != null) {
            return createBlock(name, s -> new OxidizableBlock(config.oxidationLevel, s), config.settings, config.group);
        }
        return createBlock(name,
                config.isPillar ? PillarBlock::new : Block::new, config.settings, config.group);
    }

    private static Block createSlab(String name, BlockFamilySettings config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableSlabBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, SlabBlock::new, config.settings, config.group);
    }

    private static Block createVerticalSlab(String name, BlockFamilySettings config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableVerticalSlabBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, VerticalSlabBlock::new, config.settings, config.group);
    }

    private static Block createStairs(String name, BlockState baseState, BlockFamilySettings config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableStairsBlock(config.oxidationLevel, baseState, s)), config.settings, config.group);
        }
        return createBlock(name, (s -> new StairsBlock(baseState, s)), config.settings, config.group);
    }

    private static Block createWall(String name, BlockFamilySettings config) {
        if (config.oxidationLevel != null) {
            return createBlock(name,
                    (s -> new OxidizableWallBlock(config.oxidationLevel, s)), config.settings, config.group);
        }
        return createBlock(name, WallBlock::new, config.settings, config.group);
    }

    private static Block createFence(String name, BlockFamilySettings config) {
        return createBlock(name, FenceBlock::new, config.settings, config.group);
    }

    private static Block createFenceGate(String name, BlockFamilySettings config) {
        return createBlock(name, (s -> new FenceGateBlock(WOOD_TYPE, s)), config.settings, config.group);
    }
    // endregion

    // region REDSTONE
    private static Block createDoor(String name, BlockFamilySettings config) {
        return createBlock(name, (s -> new DoorBlock(config.formSet.type, s)), config.settings, config.group);
    }

    private static Block createTrapdoor(String name, BlockFamilySettings config) {
        return createBlock(name, (s -> new TrapdoorBlock(config.formSet.type, s)), config.settings, config.group);
    }

    private static Block createPressurePlate(String name, BlockFamilySettings config) {
        return createBlock(name, (s -> new PressurePlateBlock(config.formSet.type, s)), config.settings, config.group);
    }

    private static Block createButton(String name, BlockFamilySettings config) {
        return createBlock(name, (s -> new ButtonBlock(config.formSet.type, PRESS_TICKS, s)), config.settings, config.group);
    }
    // endregion

    // region DECORATIVE
    private static Block createRocks(String name, BlockFamilySettings config) {
        return createBlock(name, RocksBlock::new, config.settings, config.group);
    }

    private static Block createStool(String name, BlockFamilySettings config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodStoolBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoolBlock::new, config.settings, config.group);
    }

    private static Block createTable(String name, BlockFamilySettings config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodTableBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoneTableBlock::new, config.settings, config.group);
    }

    private static Block createChair(String name, BlockFamilySettings config) {
        if (config.formSet.type == BlockSetType.OAK) {
            return createBlock(name, WoodChairBlock::new, config.settings, config.group);
        }
        return createBlock(name, StoneChairBlock::new, config.settings, config.group);
    }

    private static Block createBench(String name, BlockFamilySettings config) {
        return createBlock(name, WoodBenchBlock::new, config.settings, config.group);
    }

    private static Block createLadder(String name, BlockFamilySettings config) {
        return createBlock(name, ThickLadderBlock::new, config.settings, config.group);
    }
    // endregion

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
