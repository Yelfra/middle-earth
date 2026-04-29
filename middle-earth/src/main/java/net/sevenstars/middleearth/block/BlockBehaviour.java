package net.sevenstars.middleearth.block;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.form.BlockForm;

import java.util.HashMap;
import java.util.Map;

import static net.sevenstars.middleearth.block.utils.form.BasicBlockForm.*;

/**
 * A collection of helper methods to apply behaviors to a BlockFamily or a singular Block
 */
public class BlockBehaviour {

    // TODO: @Yelfra | Relocate later, and register elements
    public static Map<Block, Integer> FUEL = new HashMap<>();

    public static void registerFuel(Block block, int fuel) {
        FUEL.put(block, fuel);
    }

    // TODO: @Yelfra | Hardcoded wood fuel values
    // Currently only supports WOOD BasicBlockForm
    public static <F extends Enum<F> & BlockForm<F>> void registerFuel(BlockFamily<F> blockFamily) {
        for (F form : blockFamily.forms()) {
            if (form instanceof BasicBlockForm) {
                switch (form) {
                    case BUTTON -> registerFuel(blockFamily.get(form), 100);
                    case SLAB, VERTICAL_SLAB -> registerFuel(blockFamily.get(form), 150);
                    case DOOR, TRAPDOOR -> registerFuel(blockFamily.get(form), 200);
                    default -> registerFuel(blockFamily.get(form), 300);
                }
            }
        }
    }

    public static void registerFlammable(Block block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }

    public static void registerFlammable(BlockFamily<?> blockFamily, int burn, int spread) {
        for (Block block : blockFamily.blocks()) {
            registerFlammable(block, burn, spread);
        }
    }

    public static void registerOxidizablePair(Block fromBlock, Block toBlock) {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(fromBlock, toBlock);
    }

    public static <F extends Enum<F> & BlockForm<F>> void registerOxidizablePair(BlockFamily<F> fromFamily, BlockFamily<F> toFamily) {
        for (F form : fromFamily.forms()) {
            if (toFamily.has(form)) {
                registerOxidizablePair(fromFamily.get(form), toFamily.get(form));
            }
        }
    }

    public static void registerWaxablePair(Block fromBlock, Block toBlock) {
        OxidizableBlocksRegistry.registerWaxableBlockPair(fromBlock, toBlock);
    }

    public static <F extends Enum<F> & BlockForm<F>> void registerWaxablePair(BlockFamily<F> fromFamily, BlockFamily<F> toFamily) {
        for (F form : fromFamily.forms()) {
            if (toFamily.has(form)) {
                registerWaxablePair(fromFamily.get(form), toFamily.get(form));
            }
        }
    }

    public static void registerCompost(Block block, float chance) {
        CompostingChanceRegistry.INSTANCE.add(block, chance);
    }
}
