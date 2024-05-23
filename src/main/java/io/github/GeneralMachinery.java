package io.github;

import io.github.registry.GeneralBlocks;
import io.github.registry.GeneralItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(GeneralMachinery.ID)
public final class GeneralMachinery {
    public static final String ID = "generalmachinery";
    public static GeneralMachinery I;

    public GeneralMachinery(IEventBus bus) {
        GeneralItems.I.register(bus);
        GeneralBlocks.B.register(bus);
        GeneralBlocks.BE.register(bus);
    }
}
