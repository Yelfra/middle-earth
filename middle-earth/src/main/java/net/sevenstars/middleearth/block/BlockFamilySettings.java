package net.sevenstars.middleearth.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.block.registration.StoneBlockSets;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Grouped characteristics needed for creating a BlockFamily.
 * Designed to help with AbstractBlock.Settings parameters and other.
 */
public final class BlockFamilySettings {

    public final AbstractBlock.Settings settings;
    public boolean isPillar;
    public BasicBlockFormSet formSet;
    public @Nullable Oxidizable.OxidationLevel oxidationLevel;
    public List<ItemStack> group;

    public BlockFamilySettings(Block baseBlock) {
        this(AbstractBlock.Settings.copy(baseBlock));
    }

    public BlockFamilySettings(AbstractBlock.Settings settings) {
        this.settings = settings;
    }

    public BlockFamilySettings isPillar() {
        isPillar = true;
        return this;
    }

    public BlockFamilySettings formSet(BasicBlockFormSet formSet) {
        this.formSet = formSet;
        return this;
    }

    public BlockFamilySettings oxidationLevel(Oxidizable.OxidationLevel oxidationLevel) {
        this.oxidationLevel = oxidationLevel;
        return this;
    }

    public BlockFamilySettings group(List<ItemStack> group) {
        this.group = group;
        return this;
    }

    /* PRESETS */
    public static BlockFamilySettings STONE(MapColor color) {
        return BlockFamilySettings.STONE(color, BasicBlockFormSet.STONE_BASIC);
    }

    public static BlockFamilySettings STONE(MapColor color, BasicBlockFormSet formSet) {
        return new BlockFamilySettings(
                AbstractBlock.Settings.create()
                        .strength(StoneBlockSets.STONE_HARDNESS + 0.5f, StoneBlockSets.STONE_BLAST_RESISTANCE)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.STONE)
                        .requiresTool())
                .formSet(formSet)
                .group(ItemGroupsME.STONE_BLOCKS_CONTENTS);
    }

    public static BlockFamilySettings CLAY(MapColor color) {
        return BlockFamilySettings.CLAY(color, BasicBlockFormSet.STONE_BASIC);
    }

    public static BlockFamilySettings CLAY(MapColor color, BasicBlockFormSet formSet) {
        return new BlockFamilySettings(
                AbstractBlock.Settings.create()
                        .strength(1.25f, 4.2f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.TUFF)
                        .requiresTool())
                .formSet(formSet)
                .group(ItemGroupsME.STONE_BLOCKS_CONTENTS);
    }

    //    public static YelfraBlockFamilyConfig PLANKS(String name, MapColor color, boolean isPillar) {
//        return YelfraBlockFamilyConfig.WOOD(name, color, isPillar, YelfraBlockFormSet.PLANKS_BASIC);
//    }
//    public static YelfraBlockFamilyConfig PLANKS(String name, MapColor color, boolean isPillar, YelfraBlockFormSet formSet) {
//        return YelfraBlockFamilyConfig.WOOD(name, color, isPillar, formSet);
//    }
//    public static YelfraBlockFamilyConfig WOOD(String name, MapColor color, boolean isPillar) {
//        return YelfraBlockFamilyConfig.WOOD(name, color, isPillar, YelfraBlockFormSet.WOOD_BASIC);
//    }
    // TODO: @Yelfra | isPillar can be removed and appended as .isPillar() after call
    public static BlockFamilySettings WOOD_REGULAR(MapColor color) {
        return BlockFamilySettings.WOOD(color, BasicBlockFormSet.REGULAR);
    }

    public static BlockFamilySettings WOOD(MapColor color, BasicBlockFormSet formSet) {
        return new BlockFamilySettings(
                AbstractBlock.Settings.create()
                        .strength(2.0f, 3.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASS)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable())
                .formSet(formSet)
                .group(ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    }

    public static BlockFamilySettings THATCH(MapColor color, Oxidizable.OxidationLevel oxidationLevel) {
        return new BlockFamilySettings(
                AbstractBlock.Settings.create()
                        .strength(0.5f, 0.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BANJO)
                        .sounds(BlockSoundGroup.GRASS)
                        .burnable())
                .formSet(BasicBlockFormSet.REGULAR)
                .oxidationLevel(oxidationLevel)
                .group(ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }

    public static BlockFamilySettings METAL(MapColor color) {
        return new BlockFamilySettings(
                AbstractBlock.Settings.create()
                        .strength(3.0f, 6.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.COPPER)
                        .requiresTool())
                .formSet(BasicBlockFormSet.REGULAR)
                .group(ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }

    public static BlockFamilySettings WATTLE_AND_DAUB() {
        return new BlockFamilySettings(
                AbstractBlock.Settings.copy(Blocks.PACKED_MUD))
                .group(ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }
}