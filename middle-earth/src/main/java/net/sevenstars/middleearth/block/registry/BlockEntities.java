package net.sevenstars.middleearth.block.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.sevenstars.middleearth.MiddleEarth;
import net.sevenstars.middleearth.block.BlockRegistration;
import net.sevenstars.middleearth.block.special.beds.CustomBedBlockEntity;
import net.sevenstars.middleearth.block.special.bellows.BellowsBlockEntity;
import net.sevenstars.middleearth.block.special.fireBlocks.*;
import net.sevenstars.middleearth.block.special.forge.ForgeBlockEntity;
import net.sevenstars.middleearth.block.special.reinforcedChest.ReinforcedChestBlockEntity;
import net.sevenstars.middleearth.block.special.shapingAnvil.TreatedAnvilBlockEntity;
import net.sevenstars.middleearth.block.special.structureManager.StructureManagerBlockEntity;
import net.sevenstars.middleearth.block.special.structureManager.nest.StructureNestBlockEntity;
import net.sevenstars.middleearth.block.special.wood_pile.WoodPileBlockEntity;

public class BlockEntities {

    public static void register() {
        MiddleEarth.LOGGER.logDebugMsg("Registering Block Entities for " + MiddleEarth.MOD_ID);

        BlockEntityType.BARREL.addSupportedBlock(DecorativeBlocks.SMALL_CRATE);
        BlockEntityType.BARREL.addSupportedBlock(DecorativeBlocks.THIN_BARREL);
    }

    public static final BlockEntityType<ForgeBlockEntity> FORGE = BlockRegistration.registerBlockEntity(
            "forge",
            ForgeBlockEntity::new,
            DecorativeBlocks.FORGE);
    public static final BlockEntityType<TreatedAnvilBlockEntity> TREATED_ANVIL = BlockRegistration.registerBlockEntity(
            "treated_anvil",
            TreatedAnvilBlockEntity::new,
            DecorativeBlocks.TREATED_ANVIL,
            DecorativeBlocks.DWARVEN_TREATED_ANVIL,
            DecorativeBlocks.ELVEN_TREATED_ANVIL,
            DecorativeBlocks.ORCISH_TREATED_ANVIL);
    public static final BlockEntityType<BellowsBlockEntity> BELLOWS = BlockRegistration.registerBlockEntity(
            "bellows",
            BellowsBlockEntity::new,
            DecorativeBlocks.BELLOWS);

    public static final BlockEntityType<StructureManagerBlockEntity> STRUCTURE_MANAGER = BlockRegistration.registerBlockEntity(
            "structure_manager",
            StructureManagerBlockEntity::new,
            DecorativeBlocks.STRUCTURE_MANAGER);
    public static final BlockEntityType<StructureNestBlockEntity> STRUCTURE_NEST = BlockRegistration.registerBlockEntity(
            "structure_nest",
            StructureNestBlockEntity::new,
            DecorativeBlocks.STRUCTURE_NEST);

    public static final BlockEntityType<ReinforcedChestBlockEntity> REINFORCED_CHEST = BlockRegistration.registerBlockEntity(
            "reinforced_chest",
            ReinforcedChestBlockEntity::new,
            DecorativeBlocks.REINFORCED_CHEST);

    public static final BlockEntityType<WoodPileBlockEntity> WOOD_PILE = BlockRegistration.registerBlockEntity(
            "wood_pile",
            WoodPileBlockEntity::new,
            DecorativeBlocks.WOOD_PILE);

    public static final BlockEntityType<BrazierBlockEntity> BIG_BRAZIER = BlockRegistration.registerBlockEntity(
            "big_brazier",
            BrazierBlockEntity::new,
            DecorativeBlocks.BIG_BRAZIER);
    public static final BlockEntityType<SmallBrazierBlockEntity> SMALL_BRAZIER = BlockRegistration.registerBlockEntity(
            "small_brazier",
            SmallBrazierBlockEntity::new,
            DecorativeBlocks.SMALL_BRAZIER);
    public static final BlockEntityType<GildedBrazierBlockEntity> GILDED_BIG_BRAZIER = BlockRegistration.registerBlockEntity(
            "gilded_big_brazier",
            GildedBrazierBlockEntity::new,
            DecorativeBlocks.GILDED_BIG_BRAZIER);
    public static final BlockEntityType<GildedSmallBrazierBlockEntity> GILDED_SMALL_BRAZIER = BlockRegistration.registerBlockEntity(
            "gilded_small_brazier",
            GildedSmallBrazierBlockEntity::new,
            DecorativeBlocks.GILDED_SMALL_BRAZIER);
    public static final BlockEntityType<FireBowlBlockEntity> FIRE_BOWL = BlockRegistration.registerBlockEntity(
            "fire_bowl",
            FireBowlBlockEntity::new,
            DecorativeBlocks.FIRE_BOWL);
    public static final BlockEntityType<BonfireBlockEntity> BONFIRE = BlockRegistration.registerBlockEntity(
            "bonfire",
            BonfireBlockEntity::new,
            DecorativeBlocks.BONFIRE);

    public static final BlockEntityType<ChimneyBlockEntity> CHIMNEY = BlockRegistration.registerBlockEntity(
            "chimney",
            ChimneyBlockEntity::new,
            DecorativeBlocks.CHIMNEY);

    public static final BlockEntityType<CustomBedBlockEntity> BED = BlockRegistration.registerBlockEntity(
            "bed",
            CustomBedBlockEntity::new,
            DecorativeBlocks.FANCY_BED,
            DecorativeBlocks.FUR_BED,
            DecorativeBlocks.STRAW_BED);
}
