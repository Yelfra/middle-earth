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

        //...

        // TODO: @Yelfra | Vanilla block variants registry and behavior - such as fuel for white wool slabs
    }
}
