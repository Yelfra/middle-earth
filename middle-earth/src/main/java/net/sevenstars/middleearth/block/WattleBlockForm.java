package net.sevenstars.middleearth.block;

import net.minecraft.block.Block;

public enum WattleBlockForm implements BlockForm {
    // @formatter:off
    BASE    ("",            (config, base) -> new Block(config.settings)),
    CROSS   ("_cross",      (config, base) -> new Block(config.settings)),
    RIGHT   ("_right",      (config, base) -> new Block(config.settings)),
    LEFT    ("_left",       (config, base) -> new Block(config.settings)),
    PILLAR  ("_pillar",     (config, base) -> new Block(config.settings)),
    DIAMOND ("_diamond",    (config, base) -> new Block(config.settings));
    // @formatter:on

    private final String suffix;
    private final FormFactory<BlockConfig<WattleBlockForm>, Block, Block> factory;

    WattleBlockForm(String suffix, FormFactory<BlockConfig<WattleBlockForm>, Block, Block> factory) {
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
    public Block create(BlockConfig<?> config, Block base) {
        return factory.apply((BlockConfig<WattleBlockForm>) config, base);
    }
}
