package net.sevenstars.middleearth.block;

import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * A collection mapping BlockVariant to BlockFamily.
 */
public final class BlockCollection <V extends Enum<V> & BlockVariant, F extends Enum<F> & BlockForm> implements Iterable<BlockFamily<F>> {

    private final Map<V, BlockFamily<F>> families;

    public BlockCollection(String baseName, BlockVariantSet<V> variants, UnaryOperator<BlockConfig<F>> configModifier) {
        Map<V, BlockFamily<F>> map = new EnumMap<>(variants.iterator().next().getDeclaringClass()); // Alternative to something such as <>(V.class())

        for (V variant : variants) {
            String name = variant.getPrefix() + baseName + variant.getSuffix();

            BlockConfig<F> config = configModifier.apply((BlockConfig<F>) variant.getConfig());

            BlockFamily<F> family = new BlockFamily<>(name, config);

            map.put(variant, family);
        }

        this.families = Map.copyOf(map);
    }

    public BlockFamily<F> get(V variant) {
        return families.get(variant);
    }

    @Override
    public @NotNull Iterator<BlockFamily<F>> iterator() {
        return families.values().iterator();
    }
}
