package io.github.registry.entities.block;

import io.github.registry.GeneralBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class FoundryEntityType extends BlockEntity {

    public FoundryEntityType(BlockPos pos, BlockState state) {
        super(GeneralBlocks.foundryBE.get(), pos, state);
    }
}
