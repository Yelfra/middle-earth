package net.sevenstars.middleearth.block.utils;

import net.sevenstars.middleearth.block.utils.form.BlockForm;
import net.sevenstars.middleearth.block.utils.variant.BlockVariant;
import net.sevenstars.middleearth.block.utils.variant.BlockVariantSet;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

/**
 * A collection mapping BlockVariant to BlockFamily. Ties together BlockFamily objects with similar characteristics.
 * Ex. STONE - Families of stone, stone bricks, cobblestone, chiseled stone,...
 * Used as an alternative to creating each BlockFamily with very similar characteristics separately.
 */
public final class BlockCollection<V extends Enum<V> & BlockVariant<F>, F extends Enum<F> & BlockForm<F>> implements Iterable<BlockFamily<F>> {

    private final Map<V, BlockFamily<F>> collection;

    /// Constructor independent of variants that keeps default variant configs.
    public BlockCollection(String baseName, BlockVariantSet<V, F> variants) {
        this(baseName, variants, (config, variant) -> config);
    }

    /// Constructor independent of variants - Modifies configs of all passed variants in the same way.
    public BlockCollection(String baseName, BlockVariantSet<V, F> variants, UnaryOperator<BlockConfig<F>> configModifier) {
        this(baseName, variants, (config, variant) -> configModifier.apply(config));
    }

    /// Variant-dependent constructor - Modifies configs of all passed variants, but can be used to modify variant configs separately.
    public BlockCollection(String baseName, BlockVariantSet<V, F> variants, BiFunction<BlockConfig<F>, V, BlockConfig<F>> configModifier) {
        Map<V, BlockFamily<F>> map = new EnumMap<>(variants.iterator().next().getDeclaringClass()); // Alternative to something such as <>(V.class())

        for (V variant : variants) {
            String name = variant.getPrefix() + baseName + variant.getSuffix();

            BlockConfig<F> config = variant.getConfig();
            if (configModifier != null) {
                config = configModifier.apply(config, variant);
            }

            BlockFamily<F> family = new BlockFamily<>(name, config);

            map.put(variant, family);
        }

        this.collection = Map.copyOf(map);
    }

    public BlockFamily<F> get(V variant) {
        return collection.get(variant);
    }

    public Set<V> variants() {
        return collection.keySet();
    }

    public Collection<BlockFamily<F>> families() {
        return collection.values();
    }

    @Override
    public @NotNull Iterator<BlockFamily<F>> iterator() {
        return collection.values().iterator();
    }
}
