package net.sevenstars.middleearth.block;

import net.minecraft.block.BlockSetType;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import static net.sevenstars.middleearth.block.BasicBlockForm.*;

public class BasicBlockFormSet implements Iterable<BasicBlockForm> {

    private final EnumSet<BasicBlockForm> formSet;

    // Nullable - not marked as Nullable as safety checks have been implemented
    // Avoids unnecessary "might be null" warnings later - those cases are handled
    public final BlockSetType type;

    public BasicBlockFormSet(BasicBlockForm... forms) {
        this(null, forms);
    }

    public BasicBlockFormSet(BlockSetType blockSetType, BasicBlockForm... forms) {
        for (BasicBlockForm form : forms) {
            if (form.requiresType()) {
                throw new IllegalArgumentException(
                        "Form " + form + " requires a BlockSetType argument passed to BlockFormSet constructor"
                );
            }
        }
        this.formSet = EnumSet.noneOf(BasicBlockForm.class);
        Collections.addAll(this.formSet, forms);
        if (formSet.contains(STAIRS) && !formSet.contains(BASE)) {
            throw new IllegalArgumentException(
                    "STAIRS form requires a BASE form passed to BlockFormSet constructor"
            );
        }
        this.type = blockSetType;
    }

    public boolean contains(BasicBlockForm form) {
        return formSet.contains(form);
    }

    @Override
    public @NotNull Iterator<BasicBlockForm> iterator() {
        return Collections.unmodifiableSet(formSet).iterator();
    }

    /* PRESETS */
    // TODO: @Yelfra | Mushroom, stem sets; separate redstone and decorative set?
    public static final BasicBlockFormSet REGULAR =
            new BasicBlockFormSet(
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    // FormSet preset useful for expanding vanilla blocks, without including the existing block itself
    public static final BasicBlockFormSet REGULAR_NO_BASE =
            new BasicBlockFormSet(
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS
            );
    public static final BasicBlockFormSet STONE_BASIC =
            new BasicBlockFormSet(
                    BlockSetType.STONE,
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final BasicBlockFormSet STONE_REDSTONE =
            new BasicBlockFormSet(
                    BlockSetType.STONE,
                    TRAPDOOR,
                    PRESSURE_PLATE,
                    BUTTON
            );
    public static final BasicBlockFormSet STONE_DECORATIVE =
            new BasicBlockFormSet(
                    BlockSetType.STONE,
                    ROCKS,
                    STOOL,
                    TABLE,
                    CHAIR
                    //BENCH
            );
    public static final BasicBlockFormSet WOOD_BASIC =
            new BasicBlockFormSet(
                    BlockSetType.OAK,
                    BASE, // Log
                    // TODO: @Yelfra | Add specific case for wood (log wall on all sides)
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    WALL
            );
    public static final BasicBlockFormSet PLANKS_BASIC =
            new BasicBlockFormSet(
                    BlockSetType.OAK,
                    BASE,
                    SLAB,
                    VERTICAL_SLAB,
                    STAIRS,
                    FENCE,
                    FENCE_GATE
            );
    public static final BasicBlockFormSet PLANKS_REDSTONE =
            new BasicBlockFormSet(
                    BlockSetType.OAK,
                    DOOR,
                    TRAPDOOR,
                    PRESSURE_PLATE,
                    BUTTON
            );
    public static final BasicBlockFormSet PLANKS_DECORATIVE =
            new BasicBlockFormSet(
                    BlockSetType.OAK,
                    STOOL,
                    TABLE,
                    CHAIR,
                    BENCH
            );
    public static final BasicBlockFormSet SOIL =
            new BasicBlockFormSet(
                    BASE,
                    SLAB,
                    STAIRS
            );
}