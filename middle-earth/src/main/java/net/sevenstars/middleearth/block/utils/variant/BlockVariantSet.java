package net.sevenstars.middleearth.block.utils.variant;

import org.jetbrains.annotations.NotNull;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import static net.sevenstars.middleearth.block.utils.variant.WoodBlockVariant.*;

public class BlockVariantSet<V extends Enum<V> & BlockVariant> implements Iterable<V> {

    private final EnumSet<V> variants;

    @SafeVarargs
    public BlockVariantSet(BlockVariantSet<V> set, V... variants) {
        this.variants = EnumSet.copyOf(set.variants);
        this.variants.addAll(List.of(variants));
    }

    @SafeVarargs
    public BlockVariantSet(V... variants) {
        this.variants = EnumSet.copyOf(List.of(variants));
    }

    @Override
    public @NotNull Iterator<V> iterator() {
        return variants.iterator();
    }

    /* PRESETS */
    public static final BlockVariantSet<WoodBlockVariant> WOOD = new BlockVariantSet<>(
            WOOD_BLOCKS,
            STRIPPED_WOOD_BLOCKS,
            PLANK_BLOCKS,
            REDSTONE_BLOCKS,
            DECORATIVE_BLOCKS,
            SHINGLE_BLOCKS,
            ROOFING_BLOCKS
    );
    public static final BlockVariantSet<WoodBlockVariant> MUSHROOM = new BlockVariantSet<>(
            STEM_BLOCKS,
            PLANK_BLOCKS,
            REDSTONE_BLOCKS,
            DECORATIVE_BLOCKS,
            SHINGLE_BLOCKS
    );
    public static final BlockVariantSet<WoodBlockVariant> HYPHAE = new BlockVariantSet<>(
            HYPHAE_BLOCKS,
            STRIPPED_HYPHAE_BLOCKS,
            PLANK_BLOCKS,
            REDSTONE_BLOCKS,
            DECORATIVE_BLOCKS,
            SHINGLE_BLOCKS,
            ROOFING_BLOCKS
    );
}
