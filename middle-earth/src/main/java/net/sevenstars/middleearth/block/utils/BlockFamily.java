package net.sevenstars.middleearth.block.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.sevenstars.middleearth.block.BlockBehaviour;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.form.BlockForm;
import net.sevenstars.middleearth.block.utils.form.GemBlockForm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

import static net.sevenstars.middleearth.block.utils.form.GemBlockForm.*;

/**
 * Represents a container for closely related (and together-registered) blocks - and their block forms.
 * Ex: stone (base block), stone_stairs, stone_slab, stone_wall, ...
 */
public final class BlockFamily implements Iterable<Block> {

    private final Map<BlockForm, Block> family;
    private final String name;

    public BlockFamily(String name, BlockConfig config) {
        this(name, config, null);
    }

    public BlockFamily(String name, BlockConfig config, @Nullable Block base) {
        Map<BlockForm, Block> map = new LinkedHashMap<>();

        for (BlockForm form : config.formSet) {
            // BASE should come first in form sets
            if (form == BasicBlockForm.BASE) {
                base = getVanillaOrCreate(name, form, config, base);
                map.put(form, base);
                continue;
            }
            // Budding constructor logic could not be put into the enum class itself, so it's implemented here
            else if (form == GemBlockForm.BUDDING) {
                map.put(form, GemBlockForm.createBudding(
                        map.get(SMALL_BUD),
                        map.get(MEDIUM_BUD),
                        map.get(LARGE_BUD),
                        map.get(CLUSTER)
                ));
                continue;
            }

            map.put(form, getVanillaOrCreate(name, form, config, base));
        }
        this.family = map;
        this.name = name;
    }

    /// Attempts to return a vanilla block by name before creating a new one.
    private static Block getVanillaOrCreate(String name, BlockForm form, BlockConfig config, Block base) {
        String blockName = BlockUtils.normalizeName(form.getPrefix() + name + form.getSuffix());

        Block vanillaBlock = Registries.BLOCK.get(Identifier.ofVanilla(blockName));
        if (vanillaBlock != Blocks.AIR) {
            return vanillaBlock;
        }

        return form.create(config, base);
    }

    public String getName() {
        return name;
    }

    public Block get(BlockForm form) {
        return family.get(form);
    }

    public boolean has(BlockForm form) {
        return family.containsKey(form);
    }

    public Set<BlockForm> forms() {
        return family.keySet();
    }

    public Collection<Block> blocks() {
        return family.values();
    }

    public void put(BlockForm form, Block block) {
        family.put(form, block);
    }

    @Override
    public @NotNull Iterator<Block> iterator() {
        return blocks().iterator();
    }

    // region BEHAVIOUR HELPERS
    public BlockFamily fuel(int fuelTicks) {
        BlockBehaviour.registerFuel(this, fuelTicks);
        return this;
    }

    public BlockFamily flammable(int burn, int spread) {
        BlockBehaviour.registerFlammable(this, burn, spread);
        return this;
    }

    public BlockFamily oxidizableFrom(BlockFamily fromFamily) {
        BlockBehaviour.registerOxidizablePair(fromFamily, this);
        return this;
    }

    public BlockFamily waxableFrom(BlockFamily fromFamily) {
        BlockBehaviour.registerWaxablePair(fromFamily, this);
        return this;
    }

    public BlockFamily strippableFrom(BlockFamily fromFamily) {
        BlockBehaviour.registerStrippablePair(fromFamily, this);
        return this;
    }
    // endregion
}
