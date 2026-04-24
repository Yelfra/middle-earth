package net.sevenstars.middleearth.block.registry;

import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockFactory;
import net.sevenstars.middleearth.block.BlockFamily;
import net.sevenstars.middleearth.block.GemBlockForm;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class GemBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering GemBlocks for " + MiddleEarth.MOD_ID);
    }

    // Height and width of clusters/buds are hardcoded to default values
    public static final BlockFamily<GemBlockForm> QUARTZ = BlockFactory.registerGemFamily(
            "quartz",
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> RED_AGATE = BlockFactory.registerGemFamily(
            "red_agate",
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> CITRINE = BlockFactory.registerGemFamily(
            "citrine",
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> GLOWSTONE = BlockFactory.registerGemFamily(
            "glowstone",
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
}
