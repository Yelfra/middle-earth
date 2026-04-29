package net.sevenstars.middleearth.block.utils;

import net.minecraft.block.Block;
import net.sevenstars.middleearth.block.utils.form.BasicBlockForm;
import net.sevenstars.middleearth.block.utils.form.BlockForm;
import net.sevenstars.middleearth.block.utils.form.GemBlockForm;
import org.jetbrains.annotations.Nullable;

import java.util.*;

import static net.sevenstars.middleearth.block.utils.form.GemBlockForm.*;

/**
 * Represents a container for closely related (and together-registered) blocks - and their block forms.
 * Ex: stone (base block), stone_stairs, stone_slab, stone_wall, ...
 */
public final class BlockFamily<F extends Enum<F> & BlockForm> implements Iterable<Block> {

    private final Map<F, Block> family;
    private final String name;

    public BlockFamily(String name, BlockConfig<F> config) {
        this(name, config, null);
    }

    public BlockFamily(String name, BlockConfig<F> config, @Nullable Block base) {
        Map<F, Block> map = new HashMap<>();

        for (F form : config.formSet) {
            // Could be done explicitly but this saves work and base is intuitively put as the first form
            if (form == BasicBlockForm.BASE) {
                base = form.create(config, base);
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

            map.put(form, form.create(config, base));
        }
        this.family = Map.copyOf(map);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Block get(F form) {
        return family.get(form);
    }

    public boolean has(F form) {
        return family.containsKey(form);
    }

    public Set<F> forms() {
        return family.keySet();
    }

    public Collection<Block> blocks() {
        return family.values();
    }

    @Override
    public Iterator<Block> iterator() {
        return blocks().iterator();
    }
}
