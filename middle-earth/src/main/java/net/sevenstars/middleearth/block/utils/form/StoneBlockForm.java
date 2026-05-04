package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.special.RocksBlock;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.List;

public enum StoneBlockForm implements BlockForm {
    // @formatter:off
    ROCKS           ("_rocks",          (config, base) -> createRocks(config));
    // @formatter:on

    private final String suffix;
    private final FormFactory<BlockConfig, Block, Block> factory;

    StoneBlockForm(String suffix, FormFactory<BlockConfig, Block, Block> factory) {
        this.suffix = suffix;
        this.factory = factory;
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public Block create(BlockConfig config, Block base) {
        return factory.apply(config, base);
    }

    @Override
    public List<List<ItemStack>> getItemGroups() {
        return List.of(ItemGroupsME.STONE_BLOCKS_CONTENTS);
    }

    /* Form Constructors */
    private static Block createRocks(BlockConfig config) {
        return new RocksBlock(config.settings.nonOpaque());
    }
}
