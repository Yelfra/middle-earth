package net.sevenstars.middleearth.block.utils;

import net.sevenstars.middleearth.block.BlockBehaviour;
import net.sevenstars.middleearth.block.utils.variant.BlockVariant;
import net.sevenstars.middleearth.block.utils.variant.BlockVariantSet;
import net.sevenstars.middleearth.block.utils.variant.WoodBlockVariant;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

/**
 * A collection mapping BlockVariant to BlockFamily. Ties together BlockFamily objects with similar characteristics.
 * Ex. STONE - Families of stone, stone bricks, cobblestone, chiseled stone,...
 * Used as an alternative to creating each BlockFamily with very similar characteristics separately.
 */
public final class BlockCollection<V extends Enum<V> & BlockVariant> implements Iterable<BlockFamily> {

    private final Map<V, BlockFamily> collection;

    /// Constructor independent of variants that keeps default variant configs.
    public BlockCollection(String baseName, BlockVariantSet<V> variants) {
        this(baseName, variants, (config, variant) -> config);
    }

    /// Constructor independent of variants - Modifies configs of all passed variants in the same way.
    public BlockCollection(
            String baseName,
            BlockVariantSet<V> variants,
            UnaryOperator<BlockConfig> configModifier
    ) {
        this(baseName, variants, (config, variant) -> configModifier.apply(config));
    }

    /// Variant-dependent constructor - Modifies configs of all passed variants, but can be used to modify variant configs separately.
    public BlockCollection(
            String baseName,
            BlockVariantSet<V> variants,
            BiFunction<BlockConfig, V, BlockConfig> configModifier
    ) {
        Map<V, BlockFamily> map = new EnumMap<>(variants.iterator().next().getDeclaringClass()); // Alternative to something such as <>(V.class())

        for (V variant : variants) {
            String name = variant.getPrefix() + baseName + variant.getSuffix();

            BlockConfig config = variant.getConfig();
            if (configModifier != null) {
                config = configModifier.apply(config, variant);
            }

            BlockFamily family = new BlockFamily(name, config);

            map.put(variant, family);
        }

        this.collection = Map.copyOf(map);
    }

    public BlockFamily get(V variant) {
        return collection.get(variant);
    }

    public boolean contains(V variant) {
        return collection.containsKey(variant);
    }

    public Set<V> variants() {
        return collection.keySet();
    }

    public Collection<BlockFamily> families() {
        return collection.values();
    }

    @Override
    public @NotNull Iterator<BlockFamily> iterator() {
        return collection.values().iterator();
    }

    // region BEHAVIOUR HELPERS
    public BlockCollection<V> fuel(int fuelTicks) {
        for (BlockFamily family : families()) {
            BlockBehaviour.registerFuel(family, fuelTicks);
        }
        return this;
    }

    public BlockCollection<V> flammable() {
        for (V variant : variants()) {
            if (variant instanceof WoodBlockVariant woodVariant) {
                BlockBehaviour.registerFlammable(this.get(variant), woodVariant.getBurn(), woodVariant.getSpread());
            }
        }
        return this;
    }

    public BlockCollection<V> strippablePair(V variant, V strippedVariant) {
        if (!collection.containsKey(variant) || !collection.containsKey(strippedVariant)) {
            return this;
        }
        BlockBehaviour.registerStrippablePair(this.get(variant), this.get(strippedVariant));
        return this;
    }
    // endregion
}
