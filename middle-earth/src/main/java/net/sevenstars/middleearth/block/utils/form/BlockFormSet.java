package net.sevenstars.middleearth.block.utils.form;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import static net.sevenstars.middleearth.block.utils.form.BasicBlockForm.*;
import static net.sevenstars.middleearth.block.utils.form.GemBlockForm.*;
import static net.sevenstars.middleearth.block.utils.form.StoneBlockForm.ROCKS;
import static net.sevenstars.middleearth.block.utils.form.WattleBlockForm.*;
import static net.sevenstars.middleearth.block.utils.form.WoodBlockForm.*;

public class BlockFormSet implements Iterable<BlockForm> {

    private final Set<BlockForm> formSet = new LinkedHashSet<>(); // Had to ditch EnumSet because of wildcard

    public BlockFormSet(BlockForm... forms) {
        if (forms.length == 0) {
            throw new IllegalArgumentException("Empty form set");
        }
        Collections.addAll(this.formSet, forms);
    }

    public BlockFormSet(BlockFormSet preset, BlockForm... forms) {
        if (preset == null) {
            throw new IllegalArgumentException("Preset cannot be null");
        } else if (forms.length == 0) {
            throw new IllegalArgumentException("Empty form set");
        }
        this.formSet.addAll(preset.formSet);
        Collections.addAll(this.formSet, forms);
    }

    public boolean contains(BlockForm form) {
        return formSet.contains(form);
    }

    @Override
    public @NotNull Iterator<BlockForm> iterator() {
        return Collections.unmodifiableSet(formSet).iterator();
    }

    /* PRESETS */
    // region COMMON
    public static final BlockFormSet SIMPLE = new BlockFormSet(
            BASE, SLAB, VERTICAL_SLAB, STAIRS
    );
    /// FormSet preset useful for expanding vanilla blocks, without including the existing block itself.
    public static final BlockFormSet SIMPLE_NO_BASE = new BlockFormSet(
            SLAB, VERTICAL_SLAB, STAIRS
    );
    public static final BlockFormSet REGULAR = new BlockFormSet(
            BASE, SLAB, VERTICAL_SLAB, STAIRS, WALL
    );
    public static final BlockFormSet REDSTONE = new BlockFormSet(
            FENCE_GATE, DOOR, TRAPDOOR, PRESSURE_PLATE, BUTTON
    );
    public static final BlockFormSet FURNITURE = new BlockFormSet(
            TABLE, CHAIR, STOOL, BENCH
    );
    public static final BlockFormSet TRANSPARENT = new BlockFormSet(
            BASE_T, VERTICAL_SLAB_T
    );
    // endregion

    // region STONE
    public static final BlockFormSet STONE_PILLAR = new BlockFormSet(
            BASE, VERTICAL_SLAB, WALL
    );
    public static final BlockFormSet STONE_DECOR = new BlockFormSet(
            ROCKS, TABLE, CHAIR, STOOL, LADDER
    );
    public static final BlockFormSet STONE_REDSTONE = new BlockFormSet(
            TRAPDOOR, PRESSURE_PLATE, BUTTON
    );
    // endregion

    // region WOOD
    public static final BlockFormSet WOOD = new BlockFormSet(
            LOG, BASE, SLAB, VERTICAL_SLAB, STAIRS, WALL, FENCE
    );
    public static final BlockFormSet STRIPPED_WOOD = new BlockFormSet(
            STRIPPED_LOG, BASE, SLAB, VERTICAL_SLAB, STAIRS, WALL, FENCE
    );
    public static final BlockFormSet PLANKS = new BlockFormSet(
            BASE, SLAB, VERTICAL_SLAB, STAIRS, FENCE
    );
    public static final BlockFormSet MUSHROOM = new BlockFormSet(
            STEM, SLAB, VERTICAL_SLAB, STAIRS, FENCE
    );
    public static final BlockFormSet STRIPPED_MUSHROOM = new BlockFormSet(
            STRIPPED_STEM, SLAB, VERTICAL_SLAB, STAIRS, FENCE
    );
    public static final BlockFormSet HYPHAE = new BlockFormSet(
            HYPHAE_STEM, BASE, SLAB, VERTICAL_SLAB, STAIRS, FENCE
    );
    public static final BlockFormSet STRIPPED_HYPHAE = new BlockFormSet(
            STRIPPED_HYPHAE_STEM, BASE, SLAB, VERTICAL_SLAB, STAIRS, FENCE
    );
    // endregion

    // region MISC
    public static final BlockFormSet SOIL = new BlockFormSet(
            BASE, SLAB, STAIRS
    );

    public static final BlockFormSet WATTLE_AND_DAUB = new BlockFormSet(
            PLAIN, CROSS, RIGHT, LEFT, PILLAR, DIAMOND
    );

    public static final BlockFormSet GEM_COMPLETE = new BlockFormSet(
            BLOCK, SMALL_BUD, MEDIUM_BUD, LARGE_BUD, CLUSTER, BUDDING
    );
    // endregion
}