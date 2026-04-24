package net.sevenstars.middleearth.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import static net.sevenstars.middleearth.block.YelfraBlockForm.*;

public class YelfraBlockFormSet implements Iterable<YelfraBlockForm> {

    private final EnumSet<YelfraBlockForm> formSet;

    // Nullable - not marked as Nullable as safety checks have been implemented
    // Avoids unnecessary "might be null" warnings later - those cases are handled
    public final BlockSetType type;

    public YelfraBlockFormSet(YelfraBlockForm... forms) {
        this(null, forms);
    }

    public YelfraBlockFormSet(BlockSetType blockSetType, YelfraBlockForm... forms) {
        for (YelfraBlockForm form : forms) {
            if (form.requiresType()) {
                throw new IllegalArgumentException(
                        "Form " + form + " requires a BlockSetType argument passed to BlockFormSet constructor"
                );
            }
        }
        this.formSet = EnumSet.noneOf(YelfraBlockForm.class);
        Collections.addAll(this.formSet, forms);
        if (formSet.contains(STAIRS) && !formSet.contains(BASE)) {
            throw new IllegalArgumentException(
                    "STAIRS form requires a BASE form passed to BlockFormSet constructor"
            );
        }
        this.type = blockSetType;
    }

    public boolean contains(YelfraBlockForm form) {
        return formSet.contains(form);
    }

    @Override
    public @NotNull Iterator<YelfraBlockForm> iterator() {
        return Collections.unmodifiableSet(formSet).iterator();
    }

    /* PRESETS */
    // TODO: @Yelfra | Mushroom, stem sets; separate redstone and decorative set?
    public static final YelfraBlockFormSet REGULAR =
            new YelfraBlockFormSet(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    // FormSet preset useful for expanding vanilla blocks, without including the existing block itself
    public static final YelfraBlockFormSet REGULAR_NO_BASE =
            new YelfraBlockFormSet(
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    public static final YelfraBlockFormSet STONE_BASIC =
            new YelfraBlockFormSet(
                    BlockSetType.STONE,
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final YelfraBlockFormSet STONE_REDSTONE =
            new YelfraBlockFormSet(
                    BlockSetType.STONE,
                    TRAPDOOR,
                    PRESSURE_PLATE,
                    BUTTON
            );
    public static final YelfraBlockFormSet STONE_DECORATIVE =
            new YelfraBlockFormSet(
                    BlockSetType.STONE,
                    ROCKS,
                    STOOL,
                    TABLE,
                    CHAIR
                    //BENCH
            );
    public static final YelfraBlockFormSet WOOD_BASIC =
            new YelfraBlockFormSet(
                    BlockSetType.OAK,
                    BASE, // Log
                    // TODO: @Yelfra | Add specific case for wood (log wall on all sides)
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final YelfraBlockFormSet PLANKS_BASIC =
            new YelfraBlockFormSet(
                    BlockSetType.OAK,
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    FENCE,
                    FENCE_GATE
            );
    public static final YelfraBlockFormSet PLANKS_REDSTONE =
            new YelfraBlockFormSet(
                    BlockSetType.OAK,
                    DOOR,
                    TRAPDOOR,
                    PRESSURE_PLATE,
                    BUTTON
            );
    public static final YelfraBlockFormSet PLANKS_DECORATIVE =
            new YelfraBlockFormSet(
                    BlockSetType.OAK,
                    STOOL,
                    TABLE,
                    CHAIR,
                    BENCH
            );
    public static final YelfraBlockFormSet SOIL =
            new YelfraBlockFormSet(
                    BASE,
                    SLAB,
                    STAIRS
            );
}