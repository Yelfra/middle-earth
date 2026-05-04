package net.sevenstars.middleearth.block;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BlockForm;

import java.util.HashMap;
import java.util.Map;

import static net.sevenstars.middleearth.block.utils.form.BasicBlockForm.*;
import static net.sevenstars.middleearth.block.utils.form.WoodBlockForm.*;

/**
 * A collection of helper methods to apply behaviors to a BlockFamily or a singular Block
 */
public class BlockBehaviour {

    // TODO: @Yelfra | Relocate later, and register elements
    public static Map<Block, Integer> FUEL = new HashMap<>();

    public static void registerFuel(Block block, int fuelTicks) {
        FUEL.put(block, fuelTicks);
    }

    // TODO: @Yelfra | Hardcoded wood calculations
    // Fuel tick proportions based on wood
    public static void registerFuel(BlockFamily blockFamily, int fuelTicks) {
        for (BlockForm form : blockFamily.forms()) {
            switch (form) {
                // TODO: @Yelfra | Some values might need to be rounded
                case BUTTON -> registerFuel(blockFamily.get(form), fuelTicks / 3);
                case SLAB, VERTICAL_SLAB -> registerFuel(blockFamily.get(form), fuelTicks / 2);
                case DOOR -> registerFuel(blockFamily.get(form), fuelTicks * 2 / 3);
                case LOG, STRIPPED_LOG, BASE, STAIRS, WALL, FENCE, FENCE_GATE, PRESSURE_PLATE, TRAPDOOR, LADDER ->
                        registerFuel(blockFamily.get(form), fuelTicks);
                default -> {
                }
            }
        }
    }

    public static void registerFlammable(Block block, int burn, int spread) {
        if (burn == 0 || spread == 0) {
            return;
        }
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }

    public static void registerFlammable(BlockFamily blockFamily, int burn, int spread) {
        for (Block block : blockFamily.blocks()) {
            registerFlammable(block, burn, spread);
        }
    }

    public static void registerOxidizablePair(Block fromBlock, Block toBlock) {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(fromBlock, toBlock);
    }

    public static void registerOxidizablePair(BlockFamily fromFamily, BlockFamily toFamily) {
        for (BlockForm form : fromFamily.forms()) {
            if (toFamily.has(form)) {
                registerOxidizablePair(fromFamily.get(form), toFamily.get(form));
            }
        }
    }

    public static void registerWaxablePair(Block fromBlock, Block toBlock) {
        OxidizableBlocksRegistry.registerWaxableBlockPair(fromBlock, toBlock);
    }

    public static void registerWaxablePair(BlockFamily fromFamily, BlockFamily toFamily) {
        for (BlockForm form : fromFamily.forms()) {
            if (toFamily.has(form)) {
                registerWaxablePair(fromFamily.get(form), toFamily.get(form));
            }
        }
    }

    public static void registerStrippablePair(Block fromBlock, Block toBlock) {
        StrippableBlockRegistry.register(fromBlock, toBlock);
    }

    public static void registerStrippablePair(BlockFamily fromFamily, BlockFamily toFamily) {
        for (BlockForm form : fromFamily.forms()) {
            if (toFamily.has(form)) {
                registerStrippablePair(fromFamily.get(form), toFamily.get(form));
            }
        }
    }

    public static void registerCompost(Block block, float chance) {
        CompostingChanceRegistry.INSTANCE.add(block, chance);
    }
}
