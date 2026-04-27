package net.sevenstars.middleearth.block;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
