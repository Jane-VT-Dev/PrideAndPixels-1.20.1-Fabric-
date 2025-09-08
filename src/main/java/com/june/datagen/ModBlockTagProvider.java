package com.june.datagen;

import com.june.blocks.ModBlocks;
import com.june.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                    .add(ModBlocks.BROWN_STONE_ORE)
                    .add(ModBlocks.BROWN_DEEPSLATE_ORE)
                    .add(ModBlocks.RAW_BROWN_ORE_BLOCK)
                    .add(ModBlocks.BROWN_BLOCK)
                    .add(ModBlocks.AROACE_BLOCK)
                    .add(ModBlocks.BI_BLOCK)
                    .add(ModBlocks.BLACK_BLOCK)
                    .add(ModBlocks.BLUE_BLOCK)
                    .add(ModBlocks.CYAN_BLOCK)
                    .add(ModBlocks.DEMIGENDER_BLOCK)
                    .add(ModBlocks.GENDERFLUID_BLOCK)
                    .add(ModBlocks.GREEN_BLOCK)
                    .add(ModBlocks.GRAY_BLOCK)
                    .add(ModBlocks.LESBIAN_BLOCK)
                    .add(ModBlocks.LIGHT_BLUE_BLOCK)
                    .add(ModBlocks.LIGHT_GRAY_BLOCK)
                    .add(ModBlocks.LIME_BLOCK)
                    .add(ModBlocks.MAGENTA_BLOCK)
                    .add(ModBlocks.MLM_BLOCK)
                    .add(ModBlocks.NONBINARY_BLOCK)
                    .add(ModBlocks.ORANGE_BLOCK)
                    .add(ModBlocks.PAN_BLOCK)
                    .add(ModBlocks.PINK_BLOCK)
                    .add(ModBlocks.PURPLE_BLOCK)
                    .add(ModBlocks.QUEER_BLOCK)
                    .add(ModBlocks.RED_BLOCK)
                    .add(ModBlocks.TRANS_BLOCK)
                    .add(ModBlocks.WHITE_BLOCK)
                    .add(ModBlocks.YELLOW_BLOCK);

            getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(ModBlocks.BROWN_STONE_ORE)
                    .add(ModBlocks.BROWN_DEEPSLATE_ORE)
                    .add(ModBlocks.RAW_BROWN_ORE_BLOCK)
                    .add(ModBlocks.BROWN_BLOCK)
                    .add(ModBlocks.AROACE_BLOCK)
                    .add(ModBlocks.BI_BLOCK)
                    .add(ModBlocks.BLACK_BLOCK)
                    .add(ModBlocks.BLUE_BLOCK)
                    .add(ModBlocks.CYAN_BLOCK)
                    .add(ModBlocks.DEMIGENDER_BLOCK)
                    .add(ModBlocks.GENDERFLUID_BLOCK)
                    .add(ModBlocks.GREEN_BLOCK)
                    .add(ModBlocks.GRAY_BLOCK)
                    .add(ModBlocks.LESBIAN_BLOCK)
                    .add(ModBlocks.LIGHT_BLUE_BLOCK)
                    .add(ModBlocks.LIGHT_GRAY_BLOCK)
                    .add(ModBlocks.LIME_BLOCK)
                    .add(ModBlocks.MAGENTA_BLOCK)
                    .add(ModBlocks.MLM_BLOCK)
                    .add(ModBlocks.NONBINARY_BLOCK)
                    .add(ModBlocks.ORANGE_BLOCK)
                    .add(ModBlocks.PAN_BLOCK)
                    .add(ModBlocks.PINK_BLOCK)
                    .add(ModBlocks.PURPLE_BLOCK)
                    .add(ModBlocks.QUEER_BLOCK)
                    .add(ModBlocks.RED_BLOCK)
                    .add(ModBlocks.TRANS_BLOCK)
                    .add(ModBlocks.WHITE_BLOCK)
                    .add(ModBlocks.YELLOW_BLOCK);


    }
}
