package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.special.*;
import net.sevenstars.middleearth.block.special.artefact.arkenstone.ArkenstoneBlock;
import net.sevenstars.middleearth.block.special.artefact.arkenstone.ArkenstoneWallBlock;
import net.sevenstars.middleearth.block.special.artisantable.ArtisanTable;
import net.sevenstars.middleearth.block.special.beds.CustomBedBlock;
import net.sevenstars.middleearth.block.special.bellows.BellowsBlock;
import net.sevenstars.middleearth.block.special.curtains.CurtainsBlock;
import net.sevenstars.middleearth.block.special.curtains.SmallCurtainsBlock;
import net.sevenstars.middleearth.block.special.doors.*;
import net.sevenstars.middleearth.block.special.fireBlocks.*;
import net.sevenstars.middleearth.block.special.fire_of_orthanc.FireOfOrthancBlock;
import net.sevenstars.middleearth.block.special.forge.ForgeBlock;
import net.sevenstars.middleearth.block.special.pots.AmphoraBlock;
import net.sevenstars.middleearth.block.special.pots.FatPotBlock;
import net.sevenstars.middleearth.block.special.pots.JarBlock;
import net.sevenstars.middleearth.block.special.pots.JugBlock;
import net.sevenstars.middleearth.block.special.reinforcedChest.ReinforcedChestBlock;
import net.sevenstars.middleearth.block.special.shapingAnvil.dwarvenTreatedAnvil.DwarvenShapingAnvilBlock;
import net.sevenstars.middleearth.block.special.shapingAnvil.elvenTreatedAnvil.ElvenTreatedAnvilblock;
import net.sevenstars.middleearth.block.special.shapingAnvil.orcishTreatedAnvil.OrcishTreatedAnvilblock;
import net.sevenstars.middleearth.block.special.shapingAnvil.treatedAnvil.TreatedAnvilblock;
import net.sevenstars.middleearth.block.special.statues.StatueBlock;
import net.sevenstars.middleearth.block.special.structureManager.StructureManagerBlock;
import net.sevenstars.middleearth.block.special.structureManager.nest.StructureNestBlock;
import net.sevenstars.middleearth.block.special.toggeable_lights.*;
import net.sevenstars.middleearth.block.special.torches.METorchBlock;
import net.sevenstars.middleearth.block.special.torches.MEWallTorchBlock;
import net.sevenstars.middleearth.block.special.torches.OrcSconceBlock;
import net.sevenstars.middleearth.block.special.wood_pile.WoodPileBlock;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.BlockFamily;
import net.sevenstars.middleearth.block.utils.form.BlockFormSet;
import net.sevenstars.middleearth.item.utils.ItemGroupsME;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class DecorativeBlocks {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Decorative Blocks for " + MiddleEarth.MOD_ID);
    }

    // TODO: @Yelfra | Check flammability/fuel

    // region LANTERNS
    private static Block registerLantern(String name, Function<AbstractBlock.Settings, Block> factory) {
        return registerLantern(name, factory, s -> {});
    }

    private static Block registerLantern(String name, Function<AbstractBlock.Settings, Block> factory, Consumer<AbstractBlock.Settings> modifier) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create().luminance(createLightLevelFromLitBlockState(15)).strength(1.0f);
        modifier.accept(settings);

        return BlockRegistration.registerBlock(name, factory, settings);
    }

    public static final Block SILVER_LANTERN = registerLantern("silver_lantern", SilverLanternBlock::new);
    public static final Block WALL_SILVER_LANTERN = registerLantern("silver_lantern_wall", WallSilverLanternBlock::new);

    public static final Block LEAD_LANTERN = registerLantern("lead_lantern", LeadLanternBlock::new);
    public static final Block WALL_LEAD_LANTERN = registerLantern("lead_lantern_wall", WallLeadLanternBlock::new);

    public static final Block ELVEN_LANTERN = registerLantern("elven_lantern", ElvenLanternBlock::new);
    public static final Block WALL_ELVEN_LANTERN = registerLantern("elven_lantern_wall", WallElvenLanternBlock::new);

    public static final Block DWARVEN_LANTERN = registerLantern("dwarven_lantern", DwarvenLanternBlock::new, AbstractBlock.Settings::nonOpaque);
    public static final Block WALL_DWARVEN_LANTERN = registerLantern("dwarven_lantern_wall", WallDwarvenLanternBlock::new);

    public static final Block CRYSTAL_LAMP = registerLantern("crystal_lamp", CrystalLampBlock::new, AbstractBlock.Settings::nonOpaque);
    public static final Block WALL_CRYSTAL_LAMP = registerLantern("crystal_lamp_wall", WallCrystalLampBlock::new);

    public static final Block CRUDE_LANTERN = registerLantern("crude_lantern", CrudeLanternBlock::new, AbstractBlock.Settings::nonOpaque);
    public static final Block WALL_CRUDE_LANTERN = registerLantern("crude_lantern_wall", WallCrudeLanternBlock::new);

    public static final Block TREATED_STEEL_LANTERN = registerLantern("treated_steel_lantern", ShireLanternBlock::new, AbstractBlock.Settings::nonOpaque);
    public static final Block WALL_TREATED_STEEL_LANTERN = registerLantern("treated_steel_lantern_wall", WallShireLanternBlock::new);
    // endregion

    // region SMITHING
    private static Block registerAnvil(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlock(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(1.65f).requiresTool().nonOpaque());
    }

    public static final Block TREATED_ANVIL = registerAnvil("treated_anvil", TreatedAnvilblock::new);
    public static final Block DWARVEN_TREATED_ANVIL = registerAnvil("dwarven_treated_anvil", DwarvenShapingAnvilBlock::new);
    public static final Block ELVEN_TREATED_ANVIL = registerAnvil("elven_treated_anvil", ElvenTreatedAnvilblock::new);
    public static final Block ORCISH_TREATED_ANVIL = registerAnvil("orcish_treated_anvil", OrcishTreatedAnvilblock::new);

    public static final Block FORGE = BlockRegistration.registerBlock(
            "forge",
            ForgeBlock::new,
            AbstractBlock.Settings.copy(Blocks.BRICKS).luminance(createLightLevelFromLitBlockState(15)).strength(1.65f).requiresTool());
    public static final Block BELLOWS = BlockRegistration.registerBlock(
            "bellows",
            BellowsBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
    public static final Block ARTISAN_TABLE = BlockRegistration.registerBlock(
            "artisan_table",
            ArtisanTable::new,
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE).nonOpaque());
    // endregion

    // region STRUCTURE
    public static final Block STRUCTURE_MANAGER = BlockRegistration.registerBlock(
            "structure_manager",
            StructureManagerBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
    public static final Block STRUCTURE_NEST = BlockRegistration.registerBlock(
            "structure_nest",
            StructureNestBlock::new,
            AbstractBlock.Settings.create().strength(-1.0f, 3600000.8f).noCollision().dropsNothing().nonOpaque().allowsSpawning(Blocks::never).noBlockBreakParticles().pistonBehavior(PistonBehavior.BLOCK));
    // endregion

    // region STORAGE/CONTAINER
    private static Block registerContainer(String name, Function<AbstractBlock.Settings, Block> factory, Consumer<AbstractBlock.Settings> modifier) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.WOOD).nonOpaque();
        modifier.accept(settings);

        return BlockRegistration.registerBlock(name, factory, settings);
    }

    public static final Block SMALL_CRATE = registerContainer(
            "small_crate",
            CrateBlock::new,
            s -> s.strength(2.0f, 3.0f));
    public static final Block THIN_BARREL = registerContainer(
            "thin_barrel",
            ThinBarrelBlock::new,
            s -> s.strength(2.0f, 3.0f));
    public static final Block REINFORCED_CHEST = registerContainer(
            "reinforced_chest",
            ReinforcedChestBlock::new,
            s -> s.strength(5.0f).requiresTool());
    // endregion

    // region PILE/HEAP
    public static final Block WOOD_PILE = BlockRegistration.registerBlock(
            "wood_pile",
            WoodPileBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(1.0f).nonOpaque());
    public static final Block CANDLE_HEAP = BlockRegistration.registerBlockWithItem(
            "candle_heap",
            CandleHeapBlock::new,
            AbstractBlock.Settings.copy(Blocks.CANDLE).nonOpaque().luminance(createLightLevelFromLitBlockState(10)));
    // endregion

    // region STATUE
    private static Block registerStatue(String name, Block block) {
        return BlockRegistration.registerBlock(
                name,
                StatueBlock::new,
                AbstractBlock.Settings.copy(block).nonOpaque().requiresTool());
    }

    public static final Block BASALT_STATUE = registerStatue("basalt_statue", Blocks.BASALT);
    public static final Block CALCITE_STATUE = registerStatue("calcite_statue", Blocks.CALCITE);
    public static final Block GALONN_STATUE = registerStatue("galonn_statue", Blocks.STONE);
    public static final Block KHAGALABAN_STATUE = registerStatue("khagalaban_statue", Blocks.STONE);
    public static final Block MEDGON_SPIKE = registerStatue("medgon_spike", Blocks.STONE);
    public static final Block PUMICE_STATUE = registerStatue("pumice_statue", Blocks.BASALT);
    public static final Block TUFF_STATUE = registerStatue("tuff_statue", Blocks.TUFF);
    // endregion

    // region ORTHANC
    public static final Block FIRE_OF_ORTHANC = BlockRegistration.registerBlock(
            "fire_of_orthanc",
            FireOfOrthancBlock::new,
            AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(6f).burnable().solidBlock(Blocks::never).nonOpaque());
    public static final Block TORCH_OF_ORTHANC = BlockRegistration.registerBlock(
            "torch_of_orthanc",
            (settings) -> new TorchOfOrthancBlock(settings, ParticleTypes.FLAME),
            AbstractBlock.Settings.copy(Blocks.TORCH).luminance(createLightLevelFromLitBlockState(15)).nonOpaque().requiresTool());
    // endregion

    // region TAPPER
    public static final Block TAPPER = BlockRegistration.registerBlockWithItem(
            "tapper",
            TapperBlock::new,
            AbstractBlock.Settings.copy(Blocks.BEEHIVE).breakInstantly().nonOpaque(),
            ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // region GLASS/WINDOWS
    private static Block registerGlass(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                TransparentBlock::new,
                AbstractBlock.Settings.copy(Blocks.GLASS),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    private static Block registerGlassPane(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                PaneBlock::new,
                AbstractBlock.Settings.copy(Blocks.GLASS_PANE),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    // @formatter:off
    public static final Block WOOD_FRAMED_WINDOW =          registerGlass("wood_framed_window");
    public static final Block AGED_WOOD_WINDOW =            registerGlass("aged_wood_window");
    public static final Block WATTLE_AND_BRICK_WINDOW =     registerGlass("wattle_and_brick_window");
    public static final Block WATTLE_FRAMED_WINDOW =        registerGlass("wattle_framed_window");
    public static final Block DARK_WATTLE_FRAMED_WINDOW =   registerGlass("dark_wattle_framed_window");
    public static final Block BLACK_WATTLE_FRAMED_WINDOW =  registerGlass("black_wattle_framed_window");
    public static final Block GREEN_WATTLE_FRAMED_WINDOW =  registerGlass("green_wattle_framed_window");
    public static final Block RED_WATTLE_FRAMED_WINDOW =    registerGlass("red_wattle_framed_window");
    public static final Block WHITE_WATTLE_FRAMED_WINDOW =  registerGlass("white_wattle_framed_window");
    public static final Block MUD_BRICK_ROUND_WINDOW =      registerGlass("mud_brick_round_window");
    public static final Block WHITE_DAUB_ROUND_WINDOW =     registerGlass("white_daub_round_window");
    public static final Block YELLOW_DAUB_ROUND_WINDOW =    registerGlass("yellow_daub_round_window");
    public static final Block WHITE_DAUB_HOBBIT_WINDOW =    registerGlass("white_daub_hobbit_window");
    public static final Block YELLOW_DAUB_HOBBIT_WINDOW =   registerGlass("yellow_daub_hobbit_window");
    public static final Block PLASTER_HOBBIT_WINDOW =       registerGlass("plaster_hobbit_window");
    public static final Block PLASTER_ROUND_WINDOW =        registerGlass("plaster_round_window");

    public static final Block WOOD_FRAMED_WINDOW_PANE =         registerGlassPane("wood_framed_window_pane");
    public static final Block AGED_WOOD_WINDOW_PANE =           registerGlassPane("aged_wood_window_pane");
    public static final Block WATTLE_AND_BRICK_WINDOW_PANE =    registerGlassPane("wattle_and_brick_window_pane");
    public static final Block WATTLE_FRAMED_WINDOW_PANE =       registerGlassPane("wattle_framed_window_pane");
    public static final Block DARK_WATTLE_FRAMED_WINDOW_PANE =  registerGlassPane("dark_wattle_framed_window_pane");
    public static final Block BLACK_WATTLE_FRAMED_WINDOW_PANE = registerGlassPane("black_wattle_framed_window_pane");
    public static final Block GREEN_WATTLE_FRAMED_WINDOW_PANE = registerGlassPane("green_wattle_framed_window_pane");
    public static final Block RED_WATTLE_FRAMED_WINDOW_PANE =   registerGlassPane("red_wattle_framed_window_pane");
    public static final Block WHITE_WATTLE_FRAMED_WINDOW_PANE = registerGlassPane("white_wattle_framed_window_pane");
    public static final Block MUD_BRICK_ROUND_WINDOW_PANE =     registerGlassPane("mud_brick_round_window_pane");
    public static final Block WHITE_DAUB_ROUND_WINDOW_PANE =    registerGlassPane("white_daub_round_window_pane");
    public static final Block YELLOW_DAUB_ROUND_WINDOW_PANE =   registerGlassPane("yellow_daub_round_window_pane");
    public static final Block WHITE_DAUB_HOBBIT_WINDOW_PANE =   registerGlassPane("white_daub_hobbit_window_pane");
    public static final Block YELLOW_DAUB_HOBBIT_WINDOW_PANE =  registerGlassPane("yellow_daub_hobbit_window_pane");
    public static final Block PLASTER_HOBBIT_WINDOW_PANE =      registerGlassPane("plaster_hobbit_window_pane");
    public static final Block PLASTER_ROUND_WINDOW_PANE =       registerGlassPane("plaster_round_window_pane");

    // LEAD GLASS
    public static final Block LEAD_GLASS =                      registerGlass("lead_glass");
    public static final Block BLACK_STAINED_LEAD_GLASS =        registerGlass("black_stained_lead_glass");
    public static final Block BLUE_STAINED_LEAD_GLASS =         registerGlass("blue_stained_lead_glass");
    public static final Block BROWN_STAINED_LEAD_GLASS =        registerGlass("brown_stained_lead_glass");
    public static final Block CYAN_STAINED_LEAD_GLASS =         registerGlass("cyan_stained_lead_glass");
    public static final Block GRAY_STAINED_LEAD_GLASS =         registerGlass("gray_stained_lead_glass");
    public static final Block GREEN_STAINED_LEAD_GLASS =        registerGlass("green_stained_lead_glass");
    public static final Block LIGHT_BLUE_STAINED_LEAD_GLASS =   registerGlass("light_blue_stained_lead_glass");
    public static final Block LIGHT_GRAY_STAINED_LEAD_GLASS =   registerGlass("light_gray_stained_lead_glass");
    public static final Block LIME_STAINED_LEAD_GLASS =         registerGlass("lime_stained_lead_glass");
    public static final Block MAGENTA_STAINED_LEAD_GLASS =      registerGlass("magenta_stained_lead_glass");
    public static final Block ORANGE_STAINED_LEAD_GLASS =       registerGlass("orange_stained_lead_glass");
    public static final Block PINK_STAINED_LEAD_GLASS =         registerGlass("pink_stained_lead_glass");
    public static final Block PURPLE_STAINED_LEAD_GLASS =       registerGlass("purple_stained_lead_glass");
    public static final Block RED_STAINED_LEAD_GLASS =          registerGlass("red_stained_lead_glass");
    public static final Block WHITE_STAINED_LEAD_GLASS =        registerGlass("white_stained_lead_glass");
    public static final Block YELLOW_STAINED_LEAD_GLASS =       registerGlass("yellow_stained_lead_glass");

    public static final Block LEAD_GLASS_PANE =                     registerGlassPane("lead_glass_pane");
    public static final Block BLACK_STAINED_LEAD_GLASS_PANE =       registerGlassPane("black_stained_lead_glass_pane");
    public static final Block BLUE_STAINED_LEAD_GLASS_PANE =        registerGlassPane("blue_stained_lead_glass_pane");
    public static final Block BROWN_STAINED_LEAD_GLASS_PANE =       registerGlassPane("brown_stained_lead_glass_pane");
    public static final Block CYAN_STAINED_LEAD_GLASS_PANE =        registerGlassPane("cyan_stained_lead_glass_pane");
    public static final Block GRAY_STAINED_LEAD_GLASS_PANE =        registerGlassPane("gray_stained_lead_glass_pane");
    public static final Block GREEN_STAINED_LEAD_GLASS_PANE =       registerGlassPane("green_stained_lead_glass_pane");
    public static final Block LIGHT_BLUE_STAINED_LEAD_GLASS_PANE =  registerGlassPane("light_blue_stained_lead_glass_pane");
    public static final Block LIGHT_GRAY_STAINED_LEAD_GLASS_PANE =  registerGlassPane("light_gray_stained_lead_glass_pane");
    public static final Block LIME_STAINED_LEAD_GLASS_PANE =        registerGlassPane("lime_stained_lead_glass_pane");
    public static final Block MAGENTA_STAINED_LEAD_GLASS_PANE =     registerGlassPane("magenta_stained_lead_glass_pane");
    public static final Block ORANGE_STAINED_LEAD_GLASS_PANE =      registerGlassPane("orange_stained_lead_glass_pane");
    public static final Block PINK_STAINED_LEAD_GLASS_PANE =        registerGlassPane("pink_stained_lead_glass_pane");
    public static final Block PURPLE_STAINED_LEAD_GLASS_PANE =      registerGlassPane("purple_stained_lead_glass_pane");
    public static final Block RED_STAINED_LEAD_GLASS_PANE =         registerGlassPane("red_stained_lead_glass_pane");
    public static final Block WHITE_STAINED_LEAD_GLASS_PANE =       registerGlassPane("white_stained_lead_glass_pane");
    public static final Block YELLOW_STAINED_LEAD_GLASS_PANE =      registerGlassPane("yellow_stained_lead_glass_pane");
    // @formatter:on
    // endregion

    // TODO: @Yelfra | ColouredBlockForm? Factory parameter on BlockFamily?
    // region CUSHIONS
    private static Block registerCushion(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                CushionBlock::new,
                AbstractBlock.Settings.copy(Blocks.OAK_SLAB).nonOpaque(),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    }

    public static final Block BLUE_CUSHION = registerCushion("blue_cushion");
    public static final Block BROWN_CUSHION = registerCushion("brown_cushion");
    public static final Block DARK_BLUE_CUSHION = registerCushion("dark_blue_cushion");
    public static final Block DARK_BROWN_CUSHION = registerCushion("dark_brown_cushion");
    public static final Block DARK_GREEN_CUSHION = registerCushion("dark_green_cushion");
    public static final Block DARK_RED_CUSHION = registerCushion("dark_red_cushion");
    public static final Block GREEN_CUSHION = registerCushion("green_cushion");
    public static final Block RED_CUSHION = registerCushion("red_cushion");
    // endregion

    // region CURTAINS
    private static Block registerSmallCurtain(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                SmallCurtainsBlock::new,
                AbstractBlock.Settings.copy(Blocks.RED_CARPET).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    }

    private static Block registerCurtain(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                CurtainsBlock::new,
                AbstractBlock.Settings.copy(Blocks.RED_CARPET).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    }

    public static final Block SMALL_BLACK_CURTAIN = registerSmallCurtain("small_black_curtain");
    public static final Block SMALL_BLUE_CURTAIN = registerSmallCurtain("small_blue_curtain");
    public static final Block SMALL_BROWN_CURTAIN = registerSmallCurtain("small_brown_curtain");
    public static final Block SMALL_BURNT_CURTAIN = registerSmallCurtain("small_burnt_curtain");
    public static final Block SMALL_DARK_BLUE_CURTAIN = registerSmallCurtain("small_dark_blue_curtain");
    public static final Block SMALL_DARK_BROWN_CURTAIN = registerSmallCurtain("small_dark_brown_curtain");
    public static final Block SMALL_DARK_GREEN_CURTAIN = registerSmallCurtain("small_dark_green_curtain");
    public static final Block SMALL_DARK_RED_CURTAIN = registerSmallCurtain("small_dark_red_curtain");
    public static final Block SMALL_FANCY_BLUE_CURTAIN = registerSmallCurtain("small_fancy_blue_curtain");
    public static final Block SMALL_FANCY_GREEN_CURTAIN = registerSmallCurtain("small_fancy_green_curtain");
    public static final Block SMALL_FANCY_RED_CURTAIN = registerSmallCurtain("small_fancy_red_curtain");
    public static final Block SMALL_GRAY_CURTAIN = registerSmallCurtain("small_gray_curtain");
    public static final Block SMALL_GREEN_CURTAIN = registerSmallCurtain("small_green_curtain");
    public static final Block SMALL_PURPLE_CURTAIN = registerSmallCurtain("small_purple_curtain");
    public static final Block SMALL_RED_CURTAIN = registerSmallCurtain("small_red_curtain");
    public static final Block SMALL_ROTTEN_CURTAIN = registerSmallCurtain("small_rotten_curtain");
    public static final Block SMALL_WHITE_CURTAIN = registerSmallCurtain("small_white_curtain");
    public static final Block SMALL_YELLOW_CURTAIN = registerSmallCurtain("small_yellow_curtain");

    public static final Block BLACK_CURTAIN = registerCurtain("black_curtain");
    public static final Block BLUE_CURTAIN = registerCurtain("blue_curtain");
    public static final Block BROWN_CURTAIN = registerCurtain("brown_curtain");
    public static final Block BURNT_CURTAIN = registerCurtain("burnt_curtain");
    public static final Block DARK_BLUE_CURTAIN = registerCurtain("dark_blue_curtain");
    public static final Block DARK_BROWN_CURTAIN = registerCurtain("dark_brown_curtain");
    public static final Block DARK_GREEN_CURTAIN = registerCurtain("dark_green_curtain");
    public static final Block DARK_RED_CURTAIN = registerCurtain("dark_red_curtain");
    public static final Block FANCY_BLUE_CURTAIN = registerCurtain("fancy_blue_curtain");
    public static final Block FANCY_GREEN_CURTAIN = registerCurtain("fancy_green_curtain");
    public static final Block FANCY_RED_CURTAIN = registerCurtain("fancy_red_curtain");
    public static final Block GRAY_CURTAIN = registerCurtain("gray_curtain");
    public static final Block GREEN_CURTAIN = registerCurtain("green_curtain");
    public static final Block PURPLE_CURTAIN = registerCurtain("purple_curtain");
    public static final Block RED_CURTAIN = registerCurtain("red_curtain");
    public static final Block ROTTEN_CURTAIN = registerCurtain("rotten_curtain");
    public static final Block WHITE_CURTAIN = registerCurtain("white_curtain");
    public static final Block YELLOW_CURTAIN = registerCurtain("yellow_curtain");
    // endregion

    // TODO: @Yelfra | Could be made into a collection with other treated_wood blocks in GenericBlocks
    // region FURNITURE
    public static final BlockFamily TREATED_WOOD_FURNITURE = BlockRegistration.registerBlockFamily(
            new BlockFamily(
                    "treated_wood",
                    new BlockConfig(Blocks.OAK_PLANKS).material(BlockConfig.BlockMaterial.WOOD).formSet(BlockFormSet.FURNITURE)
            ),
            ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
    ).flammable(20, 5).fuel(300);
//    public static final Block TREATED_WOOD_STOOL = BlockRegistration.registerBlock("treated_wood_stool",
//            WoodStoolBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
//    public static final Block TREATED_WOOD_BENCH = BlockRegistration.registerBlock("treated_wood_bench",
//            WoodBenchBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
//    public static final Block TREATED_WOOD_TABLE = BlockRegistration.registerBlock("treated_wood_table",
//            WoodTableBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
//    public static final Block TREATED_WOOD_CHAIR = BlockRegistration.registerBlock("treated_wood_chair",
//            WoodChairBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    //endregion

    // TODO: @Yelfra | Possible improvements?
    // region LADDER
    public static final Block TREATED_WOOD_LADDER = BlockRegistration.registerBlockWithItem("treated_wood_ladder",
            ThickLadderBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.LADDER).burnable(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);

    public static final Block ROPE_LADDER = BlockRegistration.registerBlockWithItem("rope_ladder",
            ThickLadderBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL).burnable(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // region WATER CONTAINERS
    public static final Block WATERING_CAN = BlockRegistration.registerBlockWithItem("watering_can",
            WateringCanBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().requiresTool(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT); // TODO: @Yelfra | Requires tool? To pickup a watering can?
    public static final Block WOODEN_BUCKET = BlockRegistration.registerBlockWithItem("wooden_bucket",
            WoodenBucketBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // TODO: @Yelfra | Possible improvements?
    // region POTTED PLANTS
    private static Block registerPottedPlant(String name, Block block) {
        return BlockRegistration.registerBlock(
                name,
                settings -> new FlowerPotBlock(block, settings),
                AbstractBlock.Settings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)
        );
    }

    // @formatter:off
    public static final Block POTTED_ASPEN_SAPLING =            registerPottedPlant("potted_aspen_sapling",             NatureBlocks.ASPEN_SAPLING);
    public static final Block POTTED_BEECH_SAPLING =            registerPottedPlant("potted_beech_sapling",             NatureBlocks.BEECH_SAPLING);
    public static final Block POTTED_CHESTNUT_SAPLING =         registerPottedPlant("potted_chestnut_sapling",          NatureBlocks.CHESTNUT_SAPLING);
    public static final Block POTTED_HOLLY_SAPLING =            registerPottedPlant("potted_holly_sapling",             NatureBlocks.HOLLY_SAPLING);
    public static final Block POTTED_FIR_SAPLING =              registerPottedPlant("potted_fir_sapling",               NatureBlocks.FIR_SAPLING);
    public static final Block POTTED_LARCH_SAPLING =            registerPottedPlant("potted_larch_sapling",             NatureBlocks.LARCH_SAPLING);
    public static final Block POTTED_LEBETHRON_SAPLING =        registerPottedPlant("potted_lebethron_sapling",         NatureBlocks.LEBETHRON_SAPLING);
    public static final Block POTTED_WHITE_LEBETHRON_SAPLING =  registerPottedPlant("potted_white_lebethron_sapling",   NatureBlocks.WHITE_LEBETHRON_SAPLING);
    public static final Block POTTED_MALLORN_SAPLING =          registerPottedPlant("potted_mallorn_sapling",           NatureBlocks.MALLORN_SAPLING);
    public static final Block POTTED_MAPLE_SAPLING =            registerPottedPlant("potted_maple_sapling",             NatureBlocks.MAPLE_SAPLING);
    public static final Block POTTED_SILVER_MAPLE_SAPLING =     registerPottedPlant("potted_silver_maple_sapling",      NatureBlocks.SILVER_MAPLE_SAPLING);
    public static final Block POTTED_MIRKWOOD_SAPLING =         registerPottedPlant("potted_mirkwood_sapling",          NatureBlocks.MIRKWOOD_SAPLING);
    public static final Block POTTED_PALM_SAPLING =             registerPottedPlant("potted_palm_sapling",              NatureBlocks.PALM_SAPLING);
    public static final Block POTTED_WHITE_PALM_SAPLING =       registerPottedPlant("potted_white_palm_sapling",        NatureBlocks.WHITE_PALM_SAPLING);
    public static final Block POTTED_PINE_SAPLING =             registerPottedPlant("potted_pine_sapling",              NatureBlocks.PINE_SAPLING);
    public static final Block POTTED_BLACK_PINE_SAPLING =       registerPottedPlant("potted_black_pine_sapling",        NatureBlocks.BLACK_PINE_SAPLING);
    public static final Block POTTED_WHITE_SPRUCE_SAPLING =     registerPottedPlant("potted_white_spruce_sapling",      NatureBlocks.WHITE_SPRUCE_SAPLING);
    public static final Block POTTED_WILLOW_SAPLING =           registerPottedPlant("potted_willow_sapling",            NatureBlocks.WILLOW_SAPLING);

    public static final Block POTTED_GREEN_SHRUB =              registerPottedPlant("potted_green_shrub",               NatureBlocks.GREEN_SHRUB);
    public static final Block POTTED_ELANOR =                   registerPottedPlant("potted_elanor",                    NatureBlocks.ELANOR);
    public static final Block POTTED_MALLOS =                   registerPottedPlant("potted_mallos",                    NatureBlocks.MALLOS);
    public static final Block POTTED_NIPHREDIL =                registerPottedPlant("potted_niphredil",                 NatureBlocks.NIPHREDIL);
    public static final Block POTTED_SIMBELMYNE =               registerPottedPlant("potted_simbelmyne",                NatureBlocks.SIMBELMYNE);
    public static final Block POTTED_YELLOW_FLOWER =            registerPottedPlant("potted_yellow_flower",             NatureBlocks.YELLOW_FLOWER);
    public static final Block POTTED_YELLOW_TROLLIUS =          registerPottedPlant("potted_yellow_trollius",           NatureBlocks.YELLOW_TROLLIUS);
    public static final Block POTTED_TAN_SHRUB =                registerPottedPlant("potted_tan_shrub",                 NatureBlocks.TAN_SHRUB);
    public static final Block POTTED_BLUE_GENTIAN =             registerPottedPlant("potted_blue_gentian",              NatureBlocks.BLUE_GENTIAN);
    public static final Block POTTED_GREEN_JEWEL_CORNFLOWER =   registerPottedPlant("potted_green_jewel_cornflower",    NatureBlocks.GREEN_JEWEL_CORNFLOWER);
    public static final Block POTTED_NOBLEWHITE =               registerPottedPlant("potted_noblewhite",                NatureBlocks.NOBLEWHITE);
    public static final Block POTTED_SCORCHED_SHRUB =           registerPottedPlant("potted_scorched_shrub",            NatureBlocks.SCORCHED_SHRUB);
    public static final Block POTTED_FROZEN_SHRUB =             registerPottedPlant("potted_frozen_shrub",              NatureBlocks.FROZEN_SHRUB);

    public static final Block POTTED_CAVE_AMANITA =             registerPottedPlant("potted_cave_amanita",              NatureBlocks.CAVE_AMANITA);
    public static final Block POTTED_DEEP_FIRECAP =             registerPottedPlant("potted_deep_firecap",              NatureBlocks.DEEP_FIRECAP);
    public static final Block POTTED_GHOSTSHROOM =              registerPottedPlant("potted_ghostshroom",               NatureBlocks.GHOSTSHROOM);
    public static final Block POTTED_MORSEL =                   registerPottedPlant("potted_morsel",                    NatureBlocks.MORSEL);
    public static final Block POTTED_SKYFIRECAP =               registerPottedPlant("potted_sky_firecap",               NatureBlocks.SKY_FIRECAP);
    public static final Block POTTED_TRUMPET_SHROOM =           registerPottedPlant("potted_trumpet_shroom",            NatureBlocks.TRUMPET_SHROOM);
    public static final Block POTTED_TUBESHROOM =               registerPottedPlant("potted_tubeshroom",                NatureBlocks.TUBESHRROM);
    public static final Block POTTED_VIOLET_CAPS =              registerPottedPlant("potted_violet_caps",               NatureBlocks.VIOLET_CAPS);
    public static final Block POTTED_WHITE_MUSHROOM =           registerPottedPlant("potted_white_mushroom",            NatureBlocks.WHITE_MUSHROOM);
    public static final Block POTTED_YELLOW_AMANITA =           registerPottedPlant("potted_yellow_amanita",            NatureBlocks.YELLOW_AMANITA);
    // @formatter:on
    // endregion

    // region POTTERY
    private static Block registerPottery(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.DECORATED_POT).nonOpaque(),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    public static final Block BROWN_JUG = registerPottery("brown_jug", JugBlock::new);
    public static final Block GRAY_POT = registerPottery("gray_pot", JugBlock::new);
    public static final Block LARGE_JUG = registerPottery("large_jug", JugBlock::new);

    public static final Block AMPHORA = registerPottery("amphora", AmphoraBlock::new);
    public static final Block BROWN_AMPHORA = registerPottery("brown_amphora", AmphoraBlock::new);
    public static final Block GRAY_VASE = registerPottery("gray_vase", AmphoraBlock::new);

    public static final Block BROWN_JAR = registerPottery("brown_jar", JarBlock::new);
    public static final Block CLAY_JAR = registerPottery("clay_jar", JarBlock::new);
    public static final Block GRAY_JAR = registerPottery("gray_jar", JarBlock::new);

    public static final Block BROWN_FAT_POT = registerPottery("brown_fat_pot", FatPotBlock::new);
    public static final Block FAT_POT = registerPottery("fat_pot", FatPotBlock::new);
    public static final Block GRAY_FAT_POT = registerPottery("gray_fat_pot", FatPotBlock::new);
    public static final Block POT_OF_GOLD = registerPottery("pot_of_gold", FatPotBlock::new);
    // endregion

    // TODO: @Yelfra | Check if copying gold block's settings also makes it impossible to gather by hand
    // region TREASURE
    public static final Block GOLDEN_CHALICE = BlockRegistration.registerBlockWithItem("golden_chalice",
            ChaliceBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);

    public static final Block COPPER_TREASURE_HEAP_LAYER = BlockRegistration.registerBlockWithItem("copper_treasure_heap_layer",
            LayersAltBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block SILVER_TREASURE_HEAP_LAYER = BlockRegistration.registerBlockWithItem("silver_treasure_heap_layer",
            LayersAltBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block GOLD_TREASURE_HEAP_LAYER = BlockRegistration.registerBlockWithItem("gold_treasure_heap_layer",
            LayersAltBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);

    public static final Block COPPER_COIN_PILE = BlockRegistration.registerBlockWithItem("copper_coin_pile",
            CoinPileBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).noCollision().nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block SILVER_COIN_PILE = BlockRegistration.registerBlockWithItem("silver_coin_pile",
            CoinPileBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).noCollision().nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block GOLD_COIN_PILE = BlockRegistration.registerBlockWithItem("gold_coin_pile",
            CoinPileBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).noCollision().nonOpaque(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // region RODS
    public static final Block CRUDE_ROD = BlockRegistration.registerBlockWithItem("crude_rod",
            DecorativeRodBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().requiresTool(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block TREATED_STEEL_ROD = BlockRegistration.registerBlockWithItem("treated_steel_rod",
            DecorativeRodBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().requiresTool(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // region ROPE AND CHAINS
    private static Block registerChain(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                ChainBlock::new,
                AbstractBlock.Settings.copy(Blocks.CHAIN),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    // TODO: @Yelfra | Flammable
    public static final Block ROPE = BlockRegistration.registerBlockWithItem("rope",
            ChainBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).noCollision(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);

    public static final Block BRONZE_CHAIN = registerChain("bronze_chain");
    public static final Block BRONZE_BROAD_CHAIN = registerChain("bronze_broad_chain");
    public static final Block CRUDE_CHAIN = registerChain("crude_chain");
    public static final Block CRUDE_BROAD_CHAIN = registerChain("crude_broad_chain");
    public static final Block SPIKY_CHAIN = registerChain("spiky_chain");
    // endregion

    // region CHIMNEY
    public static final Block CHIMNEY = BlockRegistration.registerBlockWithItem("chimney",
            ChimneyBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).requiresTool(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // region FIRE PITS/BRAZIERS
    private static Block registerFirePit(String name, Function<AbstractBlock.Settings, Block> factory, Block baseBlock) {
        return BlockRegistration.registerBlockWithItem(
                name,
                factory,
                AbstractBlock.Settings.copy(baseBlock).luminance(createLightLevelFromLitBlockState(15)).nonOpaque().requiresTool(),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    // TODO: @Yelfra | Small braziers should probably have weaker illumination than big braziers
    public static final Block BIG_BRAZIER = registerFirePit("big_brazier", BrazierBlock::new, Blocks.IRON_BLOCK);
    public static final Block SMALL_BRAZIER = registerFirePit("small_brazier", SmallBrazierBlock::new, Blocks.IRON_BLOCK);
    public static final Block GILDED_BIG_BRAZIER = registerFirePit("gilded_big_brazier", GildedBrazierBlock::new, Blocks.IRON_BLOCK);
    public static final Block GILDED_SMALL_BRAZIER = registerFirePit("gilded_small_brazier", GildedSmallBrazierBlock::new, Blocks.IRON_BLOCK);
    public static final Block FIRE_BOWL = registerFirePit("fire_bowl", FireBowlBlock::new, Blocks.IRON_BLOCK);
    public static final Block BONFIRE = registerFirePit("bonfire", BonfireBlock::new, Blocks.CAMPFIRE);
    // endregion

    // region SCONCES
    // TODO: @Yelfra | Sconces same luminance as braziers?
    private static Block registerSconce(String name, Function<AbstractBlock.Settings, Block> factory) {
        return BlockRegistration.registerBlock(
                name,
                factory,
                AbstractBlock.Settings.copy(Blocks.LANTERN).luminance(createLightLevelFromLitBlockState(15)).nonOpaque().requiresTool()
        );
    }

    public static final Block SCONCE = registerSconce("sconce", METorchBlock::new); // TODO: @Yelfra | "METorchBlock" convention should probably follow "TorchBlockME"
    public static final Block WALL_SCONCE = registerSconce("wall_sconce", MEWallTorchBlock::new);

    public static final Block GILDED_SCONCE = registerSconce("gilded_sconce", METorchBlock::new);
    public static final Block GILDED_WALL_SCONCE = registerSconce("gilded_wall_sconce", MEWallTorchBlock::new);

    public static final Block ORCISH_SCONCE = registerSconce("orcish_sconce", OrcSconceBlock::new);
    public static final Block ORCISH_WALL_SCONCE = registerSconce("orcish_wall_sconce", MEWallTorchBlock::new);
    // endregion

    // region BOOKS
    public static final Block GROUND_BOOK = BlockRegistration.registerBlockWithItem("ground_book",
            GroundBookBlock::new, AbstractBlock.Settings.create().breakInstantly().nonOpaque().noCollision(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    public static final Block DWARVEN_GROUND_BOOK = BlockRegistration.registerBlockWithItem("dwarven_ground_book",
            DwarvenGroundBookBlock::new, AbstractBlock.Settings.create().breakInstantly().nonOpaque().noCollision(), ItemGroupsME.DECORATIVES_BLOCKS_CONTENT);
    // endregion

    // TODO: @Yelfra | Some wooden doors/gates should be burnable?
    // region DOORS, GATES
    private static Block registerDoor(String name, Function<AbstractBlock.Settings, Block> factory, Block baseBlock) {
        return BlockRegistration.registerBlock(
                name,
                factory,
                AbstractBlock.Settings.copy(baseBlock).nonOpaque()
        );
    }

    // @formatter:off
    public static final Block TALL_BLACK_PINE_DOOR =        registerDoor("tall_black_pine_door",        LargeDoor3x1::new, Blocks.OAK_PLANKS);

    public static final Block OAK_STABLE_DOOR =             registerDoor("oak_stable_door",             LargeDoor4x2::new, Blocks.OAK_PLANKS);
    public static final Block REINFORCED_BLACK_PINE_DOOR =  registerDoor("reinforced_black_pine_door",  LargeDoor4x2::new, Blocks.OAK_PLANKS);
    public static final Block REINFORCED_SPRUCE_DOOR =      registerDoor("reinforced_spruce_door",      LargeDoor4x2::new, Blocks.OAK_PLANKS);
    public static final Block SIMPLE_LARCH_GATE =           registerDoor("simple_larch_gate",           LargeDoor4x2::new, Blocks.OAK_PLANKS);
    public static final Block RICKETY_SIMPLE_LARCH_DOOR =   registerDoor("rickety_simple_larch_door",   LargeDoor4x2::new, Blocks.OAK_PLANKS);
    public static final Block SPRUCE_STABLE_DOOR =          registerDoor("spruce_stable_door",          LargeDoor4x2::new, Blocks.OAK_PLANKS);

    public static final Block LARGE_STURDY_DOOR =           registerDoor("large_sturdy_door",           LargeDoor5x3::new, Blocks.OAK_PLANKS);

    public static final Block LARGE_BEECH_FENCE_GATE =      registerDoor("large_beech_fence_gate",      LargeDoor1x2::new, Blocks.OAK_PLANKS);

    public static final Block LARCH_HOBBIT_DOOR =           registerDoor("larch_hobbit_door",           LargeDoor2x2::new, Blocks.OAK_PLANKS);
    public static final Block SPRUCE_HOBBIT_DOOR =          registerDoor("spruce_hobbit_door",          LargeDoor2x2::new, Blocks.OAK_PLANKS);

    public static final Block BLUE_HOBBIT_DOOR =            registerDoor("blue_hobbit_door",            LargeDoor2x2::new, Blocks.OAK_PLANKS);
    public static final Block GREEN_HOBBIT_DOOR =           registerDoor("green_hobbit_door",           LargeDoor2x2::new, Blocks.OAK_PLANKS);
    public static final Block LIGHT_BLUE_HOBBIT_DOOR =      registerDoor("light_blue_hobbit_door",      LargeDoor2x2::new, Blocks.OAK_PLANKS);
    public static final Block RED_HOBBIT_DOOR =             registerDoor("red_hobbit_door",             LargeDoor2x2::new, Blocks.OAK_PLANKS);
    public static final Block YELLOW_HOBBIT_DOOR =          registerDoor("yellow_hobbit_door",          LargeDoor2x2::new, Blocks.OAK_PLANKS);

    public static final Block GREAT_GONDORIAN_GATE =        registerDoor("great_gondorian_gate",        LargeDoor10x5::new, Blocks.IRON_DOOR);

    public static final Block GREAT_DWARVEN_GATE =          registerDoor("great_dwarven_gate",          LargeDoor5x2::new, Blocks.IRON_DOOR);
    public static final Block HIDDEN_DWARVEN_DOOR =         registerDoor("hidden_dwarven_door",         LargeThickDoor3x2::new, Blocks.STONE);
    public static final Block VARNISHED_DWARVEN_DOOR =      registerDoor("varnished_dwarven_door",      LargeDoor4x2::new, Blocks.IRON_DOOR);
    public static final Block RUINED_DWARVEN_DOOR =         registerDoor("ruined_dwarven_door",         LargeDoor4x2::new, Blocks.OAK_PLANKS);

    public static final Block GREAT_ELVEN_GATE =            registerDoor("great_elven_gate",            LargeDoor6x2::new, Blocks.OAK_DOOR);

    public static final Block GREAT_ORCISH_GATE =           registerDoor("great_orcish_gate",           LargeDoor10x4::new, Blocks.IRON_DOOR);
    // @formatter:on
    // endregion

    // region BEDS
    private static Block registerBed(String name) {
        return BlockRegistration.registerBlockWithItem(
                name,
                (settings) -> new CustomBedBlock(DyeColor.BLACK, settings),
                AbstractBlock.Settings.copy(Blocks.BLACK_BED),
                ItemGroupsME.DECORATIVES_BLOCKS_CONTENT
        );
    }

    public static final Block FANCY_BED = registerBed("fancy_bed");
    public static final Block FUR_BED = registerBed("fur_bed");
    public static final Block STRAW_BED = registerBed("straw_bed");
    // endregion

    // region ARKENSTONE
    public static final Block ARKENSTONE = BlockRegistration.registerBlock("arkenstone",
            ArkenstoneBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).luminance((state -> 7)).nonOpaque().requiresTool());
    public static final Block WALL_ARKENSTONE = BlockRegistration.registerBlock("wall_arkenstone",
            ArkenstoneWallBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).luminance((state -> 7)).nonOpaque().requiresTool());
    // endregion

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> (Boolean) state.get(Properties.LIT) ? litLevel : 0;
    }
}
