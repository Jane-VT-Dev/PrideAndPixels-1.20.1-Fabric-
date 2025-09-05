package com.june.item;

import com.june.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
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
                state.isIn(ModTags.Blocks.DRILL_MINABLE);


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

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {

        return
                state.isIn(ModTags.Blocks.DRILL_MINABLE);
    }

}
