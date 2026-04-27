package net.sevenstars.middleearth.block;

/**
 * This is an empty interface, used for the purpose of polymorphism when dealing with BlockFamilySetGroup
 */
public interface BlockVariant {
    String getPrefix();
    String getSuffix();

    BlockConfig<?> getConfig();
}
