package net.sevenstars.middleearth.block.utils;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.block.utils.form.*;
import org.jetbrains.annotations.Nullable;

/**
 * Grouped characteristics needed for creating a BlockFamily.
 * Designed as an extension/wrapper to AbstractBlock.Settings and other parameters.
 */
public final class BlockConfig<F extends Enum<F> & BlockForm<F>> {

    public enum BlockMaterial {
        WOOD(BlockSetType.OAK),
        STONE(BlockSetType.STONE),
        METAL(BlockSetType.COPPER);

        public final BlockSetType type;

        BlockMaterial(BlockSetType type) {
            this.type = type;
        }
    }

    public final AbstractBlock.Settings settings;
    public BlockFormSet<F> formSet;
    public boolean isPillar;
    public @Nullable Oxidizable.OxidationLevel oxidationLevel;
    public @Nullable BlockMaterial material;

    public BlockConfig(Block baseBlock) {
        this(AbstractBlock.Settings.copy(baseBlock));
    }

    public BlockConfig(AbstractBlock.Settings settings) {
        this.settings = settings;
    }

    public BlockConfig<F> pillar() {
        isPillar = true;
        return this;
    }

    public BlockConfig<F> formSet(BlockFormSet<F> formSet) {
        this.formSet = formSet;
        return this;
    }

    public BlockConfig<F> oxidationLevel(Oxidizable.OxidationLevel oxidationLevel) {
        this.oxidationLevel = oxidationLevel;
        return this;
    }

    public BlockConfig<F> transparent() {
        this.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never);
        return this;
    }

    public BlockConfig<F> material(BlockMaterial material) {
        this.material = material;
        return this;
    }

    /* PRESETS */
    // region BASIC
    public static BlockConfig<BasicBlockForm> STONE() {
        return new BlockConfig<BasicBlockForm>(Blocks.STONE).material(BlockMaterial.STONE);
    }

    public static BlockConfig<BasicBlockForm> STONE(MapColor color) {
        BlockConfig<BasicBlockForm> config = BlockConfig.STONE().formSet(BlockFormSet.STONE_BASIC);
        config.settings.mapColor(color);
        return config;
    }

    public static BlockConfig<BasicBlockForm> STONE(MapColor color, BlockFormSet<BasicBlockForm> formSet) {
        return STONE(color).formSet(formSet);
    }

    public static BlockConfig<BasicBlockForm> COBBLESTONE() {
        return new BlockConfig<BasicBlockForm>(Blocks.COBBLESTONE).material(BlockMaterial.STONE);
    }

    public static BlockConfig<BasicBlockForm> HARD_CLAY(MapColor color) {
        return BlockConfig.HARD_CLAY(color, BlockFormSet.STONE_BASIC);
    }

    public static BlockConfig<BasicBlockForm> HARD_CLAY(MapColor color, BlockFormSet<BasicBlockForm> formSet) {
        return new BlockConfig<BasicBlockForm>(
                AbstractBlock.Settings.create()
                        .strength(1.25f, 4.2f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.TUFF)
                        .requiresTool())
                .formSet(formSet)
                .material(BlockMaterial.STONE);
    }

    // TODO: @Yelfra | isPillar can be removed and appended as .isPillar() after call
    public static BlockConfig<BasicBlockForm> WOOD_REGULAR(MapColor color) {
        return BlockConfig.WOOD(color, BlockFormSet.REGULAR);
    }

    public static BlockConfig<BasicBlockForm> WOOD(MapColor color, BlockFormSet<BasicBlockForm> formSet) {
        return new BlockConfig<BasicBlockForm>(
                AbstractBlock.Settings.create()
                        .strength(2.0f, 3.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASS)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable())
                .formSet(formSet)
                .material(BlockMaterial.WOOD);
    }

    public static BlockConfig<BasicBlockForm> THATCH(MapColor color, Oxidizable.OxidationLevel oxidationLevel) {
        return new BlockConfig<BasicBlockForm>(
                AbstractBlock.Settings.create()
                        .strength(0.5f, 0.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BANJO)
                        .sounds(BlockSoundGroup.GRASS)
                        .burnable())
                .formSet(BlockFormSet.REGULAR)
                .oxidationLevel(oxidationLevel);
    }

    public static BlockConfig<BasicBlockForm> METAL(MapColor color) {
        return new BlockConfig<BasicBlockForm>(
                AbstractBlock.Settings.create()
                        .strength(3.0f, 6.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.COPPER)
                        .requiresTool())
                .formSet(BlockFormSet.REGULAR)
                .material(BlockMaterial.METAL);
    }
    // endregion

    // region WATTLE_AND_DAUB
    public static BlockConfig<WattleBlockForm> WATTLE_AND_DAUB() {
        return new BlockConfig<WattleBlockForm>(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)).formSet(BlockFormSet.WATTLE_AND_DAUB);
    }
    // endregion

    // region GEM
    // This preset is solely used to pass the form set to BlockFamily constructor - GemBlockForm doesn't use BlockConfig
    public static BlockConfig<GemBlockForm> GEM() {
        return new BlockConfig<GemBlockForm>(Blocks.AMETHYST_BLOCK).formSet(BlockFormSet.GEM_COMPLETE);
    }
    // endregion

    // region ORE
    public static BlockConfig<OreBlockForm> ORE() {
        return new BlockConfig<>(Blocks.STONE);
    }
    // endregion
}