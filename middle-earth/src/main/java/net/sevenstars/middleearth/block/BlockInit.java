package net.sevenstars.middleearth.block;

import net.sevenstars.middleearth.block.registry.*;

public class BlockInit {

    public static void register() {
        GenericBlocks.register();
        ExpandedVanillaBlocks.register();
        StoneBlocks.register();
        ModBlocks.register();
        GemBlocks.register();
        OreBlocks.register();
        WoodBlocks.register();
        NatureBlocks.register();
        DecorativeBlocks.register(); // Register after NatureBlocks

        BlockEntities.register(); // Register after DecorativeBlocks

        // TODO: @Yelfra | Block variants registry and behavior, call fuel
    }
}
