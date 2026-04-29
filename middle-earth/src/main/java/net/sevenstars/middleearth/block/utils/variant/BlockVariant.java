package net.sevenstars.middleearth.block.utils.variant;

import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.form.BlockForm;

/**
 * This is an empty interface, used for the purpose of polymorphism when dealing with BlockFamilySetGroup
 */
public interface BlockVariant<F extends Enum<F> & BlockForm<F>> {
    String getPrefix();
    String getSuffix();

    BlockConfig<F> getConfig();
}
