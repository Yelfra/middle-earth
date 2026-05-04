package net.sevenstars.middleearth.block.utils.variant;

import net.minecraft.item.ItemStack;
import net.sevenstars.middleearth.block.utils.BlockConfig;
import net.sevenstars.middleearth.block.utils.form.BlockForm;

import java.util.List;

/**
 * This is an empty interface, used for the purpose of polymorphism when dealing with BlockFamilySetGroup
 */
public interface BlockVariant {
    String getPrefix();
    String getSuffix();

    BlockConfig getConfig();
}
