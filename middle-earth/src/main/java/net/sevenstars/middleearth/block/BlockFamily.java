package net.sevenstars.middleearth.block;

import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Represents a simple container for closely related (and together-registered) blocks.
 * Ex: stone (base block), stone_stairs, stone_slab, stone_wall, ...
 */
public final class BlockFamily {

    private final Map<YelfraBlockForm, Block> family;

    public BlockFamily(Map<YelfraBlockForm, Block> family) {
        this.family = Map.copyOf(family);
        BlockFamilies.ALL.add(this);
    }

    public Block get(YelfraBlockForm form) {
        return family.get(form);
    }

    public boolean has(YelfraBlockForm form) {
        return family.containsKey(form);
    }

    public Set<YelfraBlockForm> forms() {
        return family.keySet();
    }

    public Collection<Block> blocks() {
        return family.values();
    }
}
