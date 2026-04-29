package net.sevenstars.middleearth.block.registry;

import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.*;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.GemBlockForm;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

public class GemBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering GemBlocks for " + MiddleEarth.MOD_ID);
    }

    // Height and width of clusters/buds are hardcoded in GemBlockForm to default values
    public static final BlockFamily<GemBlockForm> QUARTZ = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("quartz", BlockConfig.GEM()),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> RED_AGATE = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("red_agate", BlockConfig.GEM()),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> CITRINE = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("citrine", BlockConfig.GEM()),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
    public static final BlockFamily<GemBlockForm> GLOWSTONE = BlockRegistration.registerBlockFamily(
            new BlockFamily<>("glowstone", BlockConfig.GEM()),
            ItemGroupsME.MISC_BLOCKS_CONTENTS
    );
}
