package net.sevenstars.middleearth.block.special;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class CandleHeapBlock extends Block {
    public static final BooleanProperty LIT = Properties.LIT;
    // TODO: @Yelfra | Possible extension of CandleBlock/AbstractCandleBlock
    // TODO: @Yelfra | Waterlogged property? Extinguishing under water

    // @formatter:off
    private static final ImmutableList<Vec3d> particles = ImmutableList.of(
            new Vec3d(0.875,    0.34375,    0.875),
            new Vec3d(0.3125,   0.25,       0.875),
            new Vec3d(0.125,    0.34375,    0.875),
            new Vec3d(0.8125,   0.25,       0.5625),
            new Vec3d(0.625,    0.53125,    0.625),
            new Vec3d(0.375,    0.46875,    0.6875),
            new Vec3d(0.1875,   0.28125,    0.5625),
            new Vec3d(0.5,      0.46875,    0.375),
            new Vec3d(0.1875,   0.25,       0.3125),
            new Vec3d(0.8125,   0.34375,    0.125),
            new Vec3d(0.5625,   0.25,       0.1875),
            new Vec3d(0.3125,   0.34375,    0.125)
    );
    // @formatter:on

    public CandleHeapBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return createCodec(CandleHeapBlock::new);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient || !player.getAbilities().allowModifyWorld) {
            return ActionResult.SUCCESS;
        }

        boolean isLit = state.get(LIT);
        ItemStack itemInHand = player.getMainHandStack();

        if (isLit) {
            if (itemInHand.isEmpty()) {
                extinguish(world, state, pos, player);
            }
        } else {
            if (player.isInCreativeMode() || itemInHand.isOf(Items.FLINT_AND_STEEL) || itemInHand.isOf(Items.TORCH)) {
                setLit(world, state, pos);
            }
        }
        return ActionResult.SUCCESS;
    }

    protected static void setLit(WorldAccess world, BlockState state, BlockPos pos) {
        world.setBlockState(pos, state.with(LIT, true), Block.NOTIFY_ALL);
        world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.5F, 1.0F);
    }

    protected static void extinguish(World world, BlockState state, BlockPos pos, @Nullable Entity entity) {
        world.setBlockState(pos, state.with(LIT, false), Block.NOTIFY_ALL);

        for (int i = 0; i < 20; ++i) {
            spawnSmokeParticle(world, pos, true, true);
        }

        world.emitGameEvent(entity, GameEvent.BLOCK_CHANGE, pos);
        world.playSound(null, pos, SoundEvents.BLOCK_CANDLE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);
    }

    protected static void spawnSmokeParticle(World world, BlockPos pos, boolean isSignal, boolean lotsOfSmoke) {
        Random random = world.getRandom();
        SimpleParticleType simpleParticleType = isSignal ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
        world.addImportantParticleClient(simpleParticleType, true,
                (double) pos.getX() + 0.5 + random.nextDouble() / 3.0 * (double) (random.nextBoolean() ? 1 : -1),
                (double) pos.getY() + random.nextDouble() + random.nextDouble(),
                (double) pos.getZ() + 0.5 + random.nextDouble() / 3.0 * (double) (random.nextBoolean() ? 1 : -1),
                0.0, 0.07, 0.0);
        if (lotsOfSmoke) {
            world.addParticleClient(ParticleTypes.SMOKE,
                    (double) pos.getX() + 0.5 + random.nextDouble() / 4.0 * (double) (random.nextBoolean() ? 1 : -1),
                    (double) pos.getY() + 0.4,
                    (double) pos.getZ() + 0.5 + random.nextDouble() / 4.0 * (double) (random.nextBoolean() ? 1 : -1),
                    0.0, 0.005, 0.0);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!state.get(LIT)) {
            return;
        }

        particles.forEach((offset) -> {
            spawnCandleParticles(world, offset.add(pos.getX(), pos.getY(), pos.getZ()), random);
        });
    }

    protected static void spawnCandleParticles(World world, Vec3d pos, Random random) {
        float f = random.nextFloat();
        if (f < 0.3F) {
            world.addParticleClient(ParticleTypes.SMOKE, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
            if (f < 0.17F) {
                world.playSoundClient(
                        pos.x + 0.5,
                        pos.y + 0.5,
                        pos.z + 0.5,
                        SoundEvents.BLOCK_CANDLE_AMBIENT, SoundCategory.BLOCKS,
                        1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F,
                        false);
            }
        }

        world.addParticleClient(ParticleTypes.SMALL_FLAME, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
    }
}
