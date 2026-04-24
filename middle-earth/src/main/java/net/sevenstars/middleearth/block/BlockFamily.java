package net.sevenstars.middleearth.block;

import net.minecraft.block.Block;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Represents a simple container for closely related (and together-registered) blocks.
 * Ex: stone (base block), stone_stairs, stone_slab, stone_wall, ...
 */
public final class BlockFamily <F extends BlockForm> implements Iterable<Block> {

    private final Map<F, Block> family;

    public BlockFamily(Map<F, Block> family) {
        this.family = Map.copyOf(family);
        BlockFamilies.ALL.add(this);
    }

    public Block get(F form) {
        return family.get(form);
    }

    public boolean has(F form) {
        return family.containsKey(form);
    }

    public Set<F> forms() {
        return family.keySet();
    }

    public Collection<Block> blocks() {
        return family.values();
    }

    @Override
    public Iterator<Block> iterator() {
        return blocks().iterator();
    }
}
