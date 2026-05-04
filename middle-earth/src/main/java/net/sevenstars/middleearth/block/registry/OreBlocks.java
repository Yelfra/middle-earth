package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.Blocks;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;
import net.sevenstars.middleearth.block.utils.form.OreBlockForm;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import static net.sevenstars.middleearth.block.utils.form.BasicBlockForm.BASE;
import static net.sevenstars.middleearth.block.utils.form.OreBlockForm.*;
import static net.sevenstars.middleearth.block.utils.variant.StoneBlockVariant.BASE_BLOCKS;

/**
 * Load after StoneBlocks!
 */
public class OreBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Ore Blocks for " + MiddleEarth.MOD_ID);
    }

    public static final BlockFamily STONE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, TIN)),
                    Blocks.STONE
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );

    public static final BlockFamily KHAGALABAN = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "khagalaban",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.KHAGALABAN.get(BASE_BLOCKS).get(BASE)
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
    public static final BlockFamily ASHEN = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "ashen",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.ASHENSTONE.get(BASE_BLOCKS).get(BASE)
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
    public static final BlockFamily LIMESTONE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "limestone",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.LIMESTONE.get(BASE_BLOCKS).get(BASE)
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
    public static final BlockFamily CALCITE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "calcite",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.CALCITE.get(BASE_BLOCKS).get(BASE) // TODO: @Yelfra | Family taking on strength of calcite when stone's was originally intended
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
    public static final BlockFamily SLATE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "slate",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.SLATE.get(BASE_BLOCKS).get(BASE) // TODO: @Yelfra | Changed this from calcite
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
    public static final BlockFamily IRONSTONE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "ironstone",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, COAL, COPPER, TIN)),
                    StoneBlocks.IRONSTONE.get(BASE_BLOCKS).get(BASE) // TODO: @Yelfra | Changed this from calcite
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );

    public static final BlockFamily DEEPSLATE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "deepslate",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, TIN, LEAD)),
                    Blocks.DEEPSLATE
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );

    public static final BlockFamily NURGON = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "nurgon",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, TIN, LEAD, SILVER, GOLD, IRON)),
                    StoneBlocks.NURGON.get(BASE_BLOCKS).get(BASE)
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );

    public static final BlockFamily MEDGON = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "medgon",
                    BlockConfig.ORE().formSet(new BlockFormSet(BASE, LEAD, SILVER, GOLD, IRON, MITHRIL)),
                    StoneBlocks.MEDGON.get(BASE_BLOCKS).get(BASE)
            ),
            ItemGroupsME.NATURE_BLOCKS_CONTENTS
    );
}

