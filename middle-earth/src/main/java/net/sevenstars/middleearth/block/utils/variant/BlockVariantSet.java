package net.sevenstars.middleearth.block.utils.variant;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class BlockVariantSet<V extends Enum<V> & BlockVariant> implements Iterable<V> {

    private final EnumSet<V> variants;

    @SafeVarargs
    public BlockVariantSet(V... variants) {
        this.variants = EnumSet.copyOf(List.of(variants));
    }

    @Override
    public Iterator<V> iterator() {
        return variants.iterator();
    }
}
