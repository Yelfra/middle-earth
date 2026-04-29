package net.sevenstars.middleearth.block.utils.variant;

import net.sevenstars.middleearth.block.utils.BlockConfig;

/**
 * This is an empty interface, used for the purpose of polymorphism when dealing with BlockFamilySetGroup
 */
public interface BlockVariant {
    String getPrefix();
    String getSuffix();

    BlockConfig<?> getConfig();
}
