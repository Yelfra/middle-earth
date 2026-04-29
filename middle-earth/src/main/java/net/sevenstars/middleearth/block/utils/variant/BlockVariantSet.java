package net.sevenstars.middleearth.block.utils.variant;

import net.sevenstars.middleearth.block.utils.form.BlockForm;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class BlockVariantSet<V extends Enum<V> & BlockVariant<F>, F extends Enum<F> & BlockForm<F>> implements Iterable<V> {

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
