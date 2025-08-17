package com.june.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DrillToolItem extends Item {

    public DrillToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {

        return 100.0F;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return
            state.isOf(Blocks.STONE) ||
                        state.isOf(Blocks.DIRT) ||
                        state.isOf(Blocks.SAND) ||
                        state.isOf(Blocks.DIORITE) ||
                        state.isOf(Blocks.GRANITE) ||
                        state.isOf(Blocks.ANDESITE) ||
                        state.isOf(Blocks.DEEPSLATE)||
                        state.isOf(Blocks.COBBLESTONE) ||
                        state.isOf(Blocks.COBBLED_DEEPSLATE) ||
                        state.isOf(Blocks.GRAVEL) ||
                        state.isOf(Blocks.DRIPSTONE_BLOCK) ||
                        state.isOf(Blocks.NETHERRACK) ||
                        state.isOf(Blocks.TUFF) ||
                        state.isOf(Blocks.END_STONE);


    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && state.getHardness(world, pos) != 0.0F) {
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.literal("================"));
        tooltip.add(Text.literal("Cant mine Ores!"));
        tooltip.add(Text.literal("================"));

        super.appendTooltip(stack, world, tooltip, context);
    }



}
