package com.june.datagen;


import com.june.blocks.ModBlocks;
import com.june.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BROWN_ORE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AROACE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BI_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEMIGENDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GENDERFLUID_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LESBIAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MLM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NONBINARY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUEER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANS_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.AROACE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BI_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMIGENDER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GENDERFLUID_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESBIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MLM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NONBINARY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUEER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRANS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_BROWN_ORE, Models.GENERATED);

        itemModelGenerator.register(ModPickaxes.AROACE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.BI_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.DEMIGENDER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.GENDERFLUID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.LESBIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.MLM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.NONBINARY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.PAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.QUEER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModPickaxes.TRANS_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModAxes.AROACE_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModAxes.BI_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.DEMIGENDER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.GENDERFLUID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.LESBIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.MLM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.NONBINARY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.PAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.QUEER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModAxes.TRANS_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModShovels.AROACE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.BI_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.DEMIGENDER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.GENDERFLUID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.LESBIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.MLM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.NONBINARY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.PAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.QUEER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModShovels.TRANS_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModHoes.AROACE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.BI_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.DEMIGENDER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.GENDERFLUID_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.LESBIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.MLM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.NONBINARY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.PAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.QUEER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModHoes.TRANS_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModSwords.AROACE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.BI_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.DEMIGENDER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.GENDERFLUID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.LESBIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.MLM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.NONBINARY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.PAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.QUEER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModSwords.TRANS_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.AROACE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.AROACE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.AROACE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.AROACE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.BI_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.BI_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.BI_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.BI_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.DEMIGENDER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.DEMIGENDER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.DEMIGENDER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.DEMIGENDER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.GENDERFLUID_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.GENDERFLUID_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.GENDERFLUID_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.GENDERFLUID_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.LESBIAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.LESBIAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.LESBIAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.LESBIAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.MLM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.MLM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.MLM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.MLM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.NONBINARY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.NONBINARY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.NONBINARY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.NONBINARY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.PAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.PAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.PAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.PAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.QUEER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.QUEER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.QUEER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.QUEER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.TRANS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.TRANS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.TRANS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModArmors.TRANS_BOOTS));

        itemModelGenerator.register(ModSpecialWeapons.BONK_STICK,Models.HANDHELD);
        itemModelGenerator.register(ModSpecialWeapons.MAGIC_WAND,Models.HANDHELD);


        itemModelGenerator.register(ModItems.QUEER_SMITHING_TEMPLATE,Models.HANDHELD);

    }
}
