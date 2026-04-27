package net.sevenstars.middleearth.block;

import net.minecraft.block.BlockSetType;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import static net.sevenstars.middleearth.block.BasicBlockForm.*;
import static net.sevenstars.middleearth.block.GemBlockForm.*;

public class BlockFormSet<F extends Enum<F> & BlockForm> implements Iterable<F> {

    private final EnumSet<F> formSet;

    @SafeVarargs
    public BlockFormSet(F... forms) {
        if (forms.length == 0) throw new IllegalArgumentException("Empty form set");

        this.formSet = EnumSet.noneOf(forms[0].getDeclaringClass());
        Collections.addAll(this.formSet, forms);
    }

    public boolean contains(F form) {
        return formSet.contains(form);
    }

    @Override
    public @NotNull Iterator<F> iterator() {
        return Collections.unmodifiableSet(formSet).iterator();
    }

    /* PRESETS */
    // TODO: @Yelfra | Mushroom, stem sets; separate redstone and decorative set?
    // region BASIC
    public static final BlockFormSet<BasicBlockForm> REGULAR =
            new BlockFormSet<>(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    // FormSet preset useful for expanding vanilla blocks, without including the existing block itself
    public static final BlockFormSet<BasicBlockForm> REGULAR_NO_BASE =
            new BlockFormSet<>(
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    public static final BlockFormSet<BasicBlockForm> STONE_BASIC =
            new BlockFormSet<>(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final BlockFormSet<BasicBlockForm> STONE_COMPLETE =
            new BlockFormSet<>(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL,
                    TRAPDOOR,
                    PRESSURE_PLATE,
                    BUTTON,
                    ROCKS,
                    STOOL,
                    TABLE,
                    CHAIR
                    //,BENCH // TODO: @Yelfra | StoneBenchBlock doesn't exist
            );
    public static final BlockFormSet<BasicBlockForm> WOOD_BASIC =
            new BlockFormSet<>(
                    BASE, // Log
                    // TODO: @Yelfra | Add specific case for wood (log wall on all sides)
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final BlockFormSet<BasicBlockForm> PLANKS_BASIC =
            new BlockFormSet<>(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    FENCE,
                    FENCE_GATE
            );
    public static final BlockFormSet<BasicBlockForm> SOIL =
            new BlockFormSet<>(
                    BASE,
                    SLAB,
                    STAIRS
            );
    public static final BlockFormSet<BasicBlockForm> TRANSPARENT =
            new BlockFormSet<>(
                    BASE_T,
                    VERTICAL_SLAB_T
            );
    // endregion

    // region GEM
    public static final BlockFormSet<GemBlockForm> GEM_COMPLETE =
            new BlockFormSet<>(
                    BLOCK,
                    SMALL_BUD,
                    MEDIUM_BUD,
                    LARGE_BUD,
                    CLUSTER,
                    BUDDING
            );
    // endregion
}