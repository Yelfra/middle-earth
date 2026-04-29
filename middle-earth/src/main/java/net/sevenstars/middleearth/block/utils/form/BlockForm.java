package net.sevenstars.middleearth.block.utils.form;

import net.minecraft.block.Block;
import net.sevenstars.middleearth.block.utils.BlockConfig;

/**
 * An interface used for the purpose of polymorphism when dealing with BlockFamily.
 * Features a functional interface FormFactory that acts as a blueprint constructor for forms.
 * Instead of going through many cases of a switch block while iterating through forms, each form can call its constructor.
 */
public interface BlockForm {
    String getPrefix();
    String getSuffix();

    Block create(BlockConfig<?> config, Block base);

    @FunctionalInterface
    interface FormFactory<A, B, R> {
        R apply(A a, B b);
    }
}
