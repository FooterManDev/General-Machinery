package io.github.registry;

import io.github.GeneralMachinery;
import io.github.registry.entities.block.FoundryBlock;
import io.github.registry.entities.block.FoundryEntityType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class GeneralBlocks {
    public static final DeferredRegister<Block> B = DeferredRegister.create(Registries.BLOCK, GeneralMachinery.ID);
    public Collection<DeferredHolder<Block, ? extends Block>> allBlocks = B.getEntries();
    public static final DeferredRegister<BlockEntityType<?>> BE = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, GeneralMachinery.ID);
    public Collection<DeferredHolder<BlockEntityType<?>, ? extends BlockEntityType<?>>> allBEs = BE.getEntries();


    public static final Supplier<Block> foundry = B.register("foundry", () ->
            new Block(AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE)));

    public static final Supplier<BlockEntityType<FoundryEntityType>> foundryBE = BE.register("foundry", () ->
            BlockEntityType.Builder.create(FoundryEntityType::new, foundry.get()).build(null));
}
