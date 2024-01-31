package com.starfish_studios.foundation.event;

import com.starfish_studios.foundation.block.FrameBlock;
import com.starfish_studios.foundation.registry.FoundationBlocks;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;

public class FoundationBlockUseEvent implements UseBlockCallback {
    @Override
    public InteractionResult interact(Player player, Level world, InteractionHand hand, BlockHitResult hitResult) {
        final BlockPos blockPos = hitResult.getBlockPos();

        if (world.getBlockState(blockPos).getBlock() == FoundationBlocks.OAK_FRAME && player.getItemInHand(hand).getItem() == Items.STICK) {
            if (world.getBlockState(blockPos).getValue(FrameBlock.MIDDLE)) {
                world.setBlockAndUpdate(blockPos, world.getBlockState(blockPos).setValue(FrameBlock.MIDDLE, false));
            } else {
                world.setBlockAndUpdate(blockPos, world.getBlockState(blockPos).setValue(FrameBlock.MIDDLE, true));
            }
            world.playSound(player, blockPos, Blocks.SCAFFOLDING.getSoundType(world.getBlockState(blockPos)).getPlaceSound(), player.getSoundSource(), 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

}
