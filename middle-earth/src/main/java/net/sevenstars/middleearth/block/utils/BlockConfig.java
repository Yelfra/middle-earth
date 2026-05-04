package net.sevenstars.middleearth.block.utils;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;
import org.jetbrains.annotations.Nullable;

/**
 * Grouped characteristics needed for creating a BlockFamily.
 * Designed as an extension/wrapper to AbstractBlock.Settings and other parameters.
 */
public final class BlockConfig {

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
    public boolean isPillar;
    public @Nullable Oxidizable.OxidationLevel oxidationLevel;
    public @Nullable BlockMaterial material;

    public BlockFormSet formSet; // Used in BlockFamily creation - not used in Block creation itself

    public BlockConfig(Block baseBlock) {
        this(AbstractBlock.Settings.copy(baseBlock));
    }

    public BlockConfig(AbstractBlock.Settings settings) {
        this.settings = settings;
    }

    public BlockConfig pillar() {
        isPillar = true;
        return this;
    }

    public BlockConfig formSet(BlockFormSet formSet) {
        this.formSet = formSet;
        return this;
    }

    public BlockConfig oxidationLevel(Oxidizable.OxidationLevel oxidationLevel) {
        this.oxidationLevel = oxidationLevel;
        return this;
    }

    public BlockConfig transparent() {
        this.settings.nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never);
        return this;
    }

    public BlockConfig material(BlockMaterial material) {
        this.material = material;
        return this;
    }

    /* PRESETS */
    // region STONE
    public static BlockConfig STONE() {
        return new BlockConfig(Blocks.STONE).material(BlockMaterial.STONE);
    }

    public static BlockConfig STONE(MapColor color) {
        BlockConfig config = BlockConfig.STONE().formSet(BlockFormSet.REGULAR);
        config.settings.mapColor(color);
        return config;
    }

    public static BlockConfig STONE(MapColor color, BlockFormSet formSet) {
        return STONE(color).formSet(formSet);
    }

    public static BlockConfig COBBLESTONE() {
        return new BlockConfig(Blocks.COBBLESTONE).material(BlockMaterial.STONE);
    }
    // endregion

    // region HARD_CLAY
    public static BlockConfig HARD_CLAY(MapColor color) {
        return BlockConfig.HARD_CLAY(color, BlockFormSet.REGULAR);
    }

    public static BlockConfig HARD_CLAY(MapColor color, BlockFormSet formSet) {
        return new BlockConfig(
                AbstractBlock.Settings.create()
                        .strength(1.25f, 4.2f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.TUFF)
                        .requiresTool())
                .formSet(formSet)
                .material(BlockMaterial.STONE);
    }
    // endregion

    // region WOOD
    public static BlockConfig WOOD() {
        return new BlockConfig(Blocks.OAK_LOG).material(BlockMaterial.WOOD);
    }

    public static BlockConfig PLANKS() {
        return new BlockConfig(Blocks.OAK_PLANKS).material(BlockMaterial.WOOD);
    }

    public static BlockConfig PLANKS_SIMPLE(MapColor color) {
        return new BlockConfig(
                AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                        .mapColor(color))
                .formSet(BlockFormSet.SIMPLE)
                .material(BlockMaterial.WOOD);
    }

    public static BlockConfig LEAVES() {
        return new BlockConfig(Blocks.OAK_LEAVES);
    }
    // endregion


    // region MISC
    public static BlockConfig MUSHROOM() {
        return new BlockConfig(
                AbstractBlock.Settings.copy(Blocks.MUSHROOM_STEM)
        );
    }

    public static BlockConfig THATCH(MapColor color, Oxidizable.OxidationLevel oxidationLevel) {
        return new BlockConfig(
                AbstractBlock.Settings.create()
                        .strength(0.5f, 0.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BANJO)
                        .sounds(BlockSoundGroup.GRASS)
                        .burnable())
                .formSet(BlockFormSet.SIMPLE)
                .oxidationLevel(oxidationLevel);
    }

    public static BlockConfig METAL(MapColor color) {
        return new BlockConfig(
                AbstractBlock.Settings.create()
                        .strength(3.0f, 6.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.COPPER)
                        .requiresTool())
                .formSet(BlockFormSet.SIMPLE)
                .material(BlockMaterial.METAL);
    }

    public static BlockConfig WATTLE_AND_DAUB() {
        return new BlockConfig(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)).formSet(BlockFormSet.WATTLE_AND_DAUB);
    }

    public static BlockConfig GEM() {
        return new BlockConfig(Blocks.AMETHYST_BLOCK).formSet(BlockFormSet.GEM_COMPLETE);
    }

    public static BlockConfig ORE() {
        return new BlockConfig(Blocks.STONE);
    }
    // endregion
}