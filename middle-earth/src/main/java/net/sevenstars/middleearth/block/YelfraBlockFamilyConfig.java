package net.sevenstars.middleearth.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.sevenstars.middleearth.block.registration.StoneBlockSets;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Grouped characteristics needed for creating a BlockFamily.
 * Designed to help with AbstractBlock.Settings parameters and other.
 */
public final class YelfraBlockFamilyConfig {

    public final String name;
    public final AbstractBlock.Settings settings;
    public boolean isPillar;
    public YelfraBlockFormSet formSet;
    public @Nullable Oxidizable.OxidationLevel oxidationLevel;
    public List<ItemStack> group;

    public YelfraBlockFamilyConfig(Block baseBlock) {
        this(Registries.BLOCK.getId(baseBlock).getPath(), AbstractBlock.Settings.copy(baseBlock));
    }

    public YelfraBlockFamilyConfig(String name, AbstractBlock.Settings settings) {
        this.name = name;
        this.settings = settings;
    }

    public YelfraBlockFamilyConfig isPillar() {
        isPillar = true;
        return this;
    }

    public YelfraBlockFamilyConfig isPillar(boolean isPillar) {
        this.isPillar = isPillar;
        return this;
    }

    public YelfraBlockFamilyConfig formSet(YelfraBlockFormSet formSet) {
        this.formSet = formSet;
        return this;
    }

    public YelfraBlockFamilyConfig oxidationLevel(Oxidizable.OxidationLevel oxidationLevel) {
        this.oxidationLevel = oxidationLevel;
        return this;
    }

    public YelfraBlockFamilyConfig group(List<ItemStack> group) {
        this.group = group;
        return this;
    }

    /* PRESETS */
    public static YelfraBlockFamilyConfig STONE(String name, MapColor color) {
        return YelfraBlockFamilyConfig.STONE(name, color, YelfraBlockFormSet.STONE_BASIC);
    }

    public static YelfraBlockFamilyConfig STONE(String name, MapColor color, YelfraBlockFormSet formSet) {
        return new YelfraBlockFamilyConfig(
                name,
                AbstractBlock.Settings.create()
                        .strength(StoneBlockSets.STONE_HARDNESS + 0.5f, StoneBlockSets.STONE_BLAST_RESISTANCE)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.STONE)
                        .requiresTool())
                .formSet(formSet)
                .group(ItemGroupsME.STONE_BLOCKS_CONTENTS);
    }

    public static YelfraBlockFamilyConfig CLAY(String name, MapColor color) {
        return YelfraBlockFamilyConfig.CLAY(name, color, YelfraBlockFormSet.STONE_BASIC);
    }

    public static YelfraBlockFamilyConfig CLAY(String name, MapColor color, YelfraBlockFormSet formSet) {
        return new YelfraBlockFamilyConfig(
                name,
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
    public static YelfraBlockFamilyConfig WOOD_REGULAR(String name, MapColor color, boolean isPillar) {
        return YelfraBlockFamilyConfig.WOOD(name, color, isPillar, YelfraBlockFormSet.REGULAR);
    }

    public static YelfraBlockFamilyConfig WOOD(String name, MapColor color, boolean isPillar, YelfraBlockFormSet formSet) {
        return new YelfraBlockFamilyConfig(
                name,
                AbstractBlock.Settings.create()
                        .strength(2.0f, 3.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASS)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable())
                .isPillar(isPillar)
                .formSet(formSet)
                .group(ItemGroupsME.WOOD_BLOCKS_CONTENTS);
    }

    public static YelfraBlockFamilyConfig THATCH(String name, MapColor color, Oxidizable.OxidationLevel oxidationLevel) {
        return new YelfraBlockFamilyConfig(
                name,
                AbstractBlock.Settings.create()
                        .strength(0.5f, 0.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BANJO)
                        .sounds(BlockSoundGroup.GRASS)
                        .burnable())
                .formSet(YelfraBlockFormSet.REGULAR)
                .oxidationLevel(oxidationLevel)
                .group(ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }

    public static YelfraBlockFamilyConfig METAL(String name, MapColor color) {
        return new YelfraBlockFamilyConfig(
                name,
                AbstractBlock.Settings.create()
                        .strength(3.0f, 6.0f)
                        .mapColor(color)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.COPPER)
                        .requiresTool())
                .formSet(YelfraBlockFormSet.REGULAR)
                .group(ItemGroupsME.MISC_BLOCKS_CONTENTS);
    }
}