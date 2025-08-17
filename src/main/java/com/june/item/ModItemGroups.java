package com.june.item;

import com.june.PridePixels;
import com.june.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_ORES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PridePixels.MOD_ID, "queer_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pridepixels.ores"))
                    .icon(() -> new ItemStack(ModItems.AROACE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AROACE_INGOT);
                        entries.add(ModItems.BROWN_INGOT);
                        entries.add(ModItems.BI_INGOT);
                        entries.add(ModItems.BLACK_INGOT);
                        entries.add(ModItems.BLUE_INGOT);
                        entries.add(ModItems.CYAN_INGOT);
                        entries.add(ModItems.DEMIGENDER_INGOT);
                        entries.add(ModItems.GENDERFLUID_INGOT);
                        entries.add(ModItems.GREEN_INGOT);
                        entries.add(ModItems.GRAY_INGOT);
                        entries.add(ModItems.LESBIAN_INGOT);
                        entries.add(ModItems.LIGHT_BLUE_INGOT);
                        entries.add(ModItems.LIGHT_GRAY_INGOT);
                        entries.add(ModItems.LIME_INGOT);
                        entries.add(ModItems.MAGENTA_INGOT);
                        entries.add(ModItems.MLM_INGOT);
                        entries.add(ModItems.NONBINARY_INGOT);
                        entries.add(ModItems.ORANGE_INGOT);
                        entries.add(ModItems.PAN_INGOT);
                        entries.add(ModItems.PINK_INGOT);
                        entries.add(ModItems.PURPLE_INGOT);
                        entries.add(ModItems.QUEER_INGOT);
                        entries.add(ModItems.RED_INGOT);
                        entries.add(ModItems.TRANS_INGOT);
                        entries.add(ModItems.WHITE_INGOT);
                        entries.add(ModItems.YELLOW_INGOT);

                        entries.add(ModItems.RAW_BROWN_ORE);
                        entries.add(ModBlocks.BROWN_STONE_ORE);
                        entries.add(ModBlocks.BROWN_DEEPSLATE_ORE);
                        entries.add(ModBlocks.RAW_BROWN_ORE_BLOCK);


                        entries.add(ModBlocks.AROACE_BLOCK);
                        entries.add(ModBlocks.BROWN_BLOCK);
                        entries.add(ModBlocks.BI_BLOCK);
                        entries.add(ModBlocks.BLACK_BLOCK);
                        entries.add(ModBlocks.BLUE_BLOCK);
                        entries.add(ModBlocks.CYAN_BLOCK);
                        entries.add(ModBlocks.DEMIGENDER_BLOCK);
                        entries.add(ModBlocks.GENDERFLUID_BLOCK);
                        entries.add(ModBlocks.GREEN_BLOCK);
                        entries.add(ModBlocks.GRAY_BLOCK);
                        entries.add(ModBlocks.LESBIAN_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_BLOCK);
                        entries.add(ModBlocks.LIGHT_GRAY_BLOCK);
                        entries.add(ModBlocks.LIME_BLOCK);
                        entries.add(ModBlocks.MAGENTA_BLOCK);
                        entries.add(ModBlocks.MLM_BLOCK);
                        entries.add(ModBlocks.NONBINARY_BLOCK);
                        entries.add(ModBlocks.ORANGE_BLOCK);
                        entries.add(ModBlocks.PAN_BLOCK);
                        entries.add(ModBlocks.PINK_BLOCK);
                        entries.add(ModBlocks.PURPLE_BLOCK);
                        entries.add(ModBlocks.QUEER_BLOCK);
                        entries.add(ModBlocks.RED_BLOCK);
                        entries.add(ModBlocks.TRANS_BLOCK);
                        entries.add(ModBlocks.WHITE_BLOCK);
                        entries.add(ModBlocks.YELLOW_BLOCK);

                    }).build());


    public static final ItemGroup QUEERCRAFT_ITEMS_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PridePixels.MOD_ID, "queer_pickaxe"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pridepixels.tools"))
                    .icon(() -> new ItemStack(ModPickaxes.QUEER_PICKAXE)).entries((displayContext, entries) -> {

                    entries.add(ModPickaxes.AROACE_PICKAXE);
                    entries.add(ModAxes.AROACE_AXE);
                    entries.add(ModShovels.AROACE_SHOVEL);
                    entries.add(ModHoes.AROACE_HOE);
                    entries.add(ModPickaxes.BI_PICKAXE);
                    entries.add(ModAxes.BI_AXE);
                    entries.add(ModShovels.BI_SHOVEL);
                    entries.add(ModHoes.BI_HOE);
                    entries.add(ModPickaxes.DEMIGENDER_PICKAXE);
                    entries.add(ModAxes.DEMIGENDER_AXE);
                    entries.add(ModShovels.DEMIGENDER_SHOVEL);
                    entries.add(ModHoes.DEMIGENDER_HOE);
                    entries.add(ModPickaxes.GENDERFLUID_PICKAXE);
                    entries.add(ModAxes.GENDERFLUID_AXE);
                    entries.add(ModShovels.GENDERFLUID_SHOVEL);
                    entries.add(ModHoes.GENDERFLUID_HOE);
                    entries.add(ModPickaxes.LESBIAN_PICKAXE);
                    entries.add(ModAxes.LESBIAN_AXE);
                    entries.add(ModShovels.LESBIAN_SHOVEL);
                    entries.add(ModHoes.LESBIAN_HOE);
                    entries.add(ModPickaxes.MLM_PICKAXE);
                    entries.add(ModAxes.MLM_AXE);
                    entries.add(ModShovels.MLM_SHOVEL);
                    entries.add(ModHoes.MLM_HOE);
                    entries.add(ModPickaxes.NONBINARY_PICKAXE);
                    entries.add(ModAxes.NONBINARY_AXE);
                    entries.add(ModShovels.NONBINARY_SHOVEL);
                    entries.add(ModHoes.NONBINARY_HOE);
                    entries.add(ModPickaxes.PAN_PICKAXE);
                    entries.add(ModAxes.PAN_AXE);
                    entries.add(ModShovels.PAN_SHOVEL);
                    entries.add(ModHoes.PAN_HOE);
                    entries.add(ModPickaxes.QUEER_PICKAXE);
                    entries.add(ModAxes.QUEER_AXE);
                    entries.add(ModShovels.QUEER_SHOVEL);
                    entries.add(ModHoes.QUEER_HOE);
                    entries.add(ModPickaxes.TRANS_PICKAXE);
                    entries.add(ModAxes.TRANS_AXE);
                    entries.add(ModShovels.TRANS_SHOVEL);
                    entries.add(ModHoes.TRANS_HOE);

                    entries.add(ModPickaxes.DRILL);

                    }).build());

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PridePixels.MOD_ID, "queer_sword"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pridepixels.weapons"))
                    .icon(() -> new ItemStack(ModSwords.QUEER_SWORD)).entries((displayContext, entries) -> {

                        entries.add(ModSwords.AROACE_SWORD);
                        entries.add(ModSwords.BI_SWORD);
                        entries.add(ModSwords.DEMIGENDER_SWORD);
                        entries.add(ModSwords.GENDERFLUID_SWORD);
                        entries.add(ModSwords.LESBIAN_SWORD);
                        entries.add(ModSwords.MLM_SWORD);
                        entries.add(ModSwords.NONBINARY_SWORD);
                        entries.add(ModSwords.PAN_SWORD);
                        entries.add(ModSwords.QUEER_SWORD);
                        entries.add(ModSwords.TRANS_SWORD);
                        entries.add(ModSpecialWeapons.SCYTHE);
                        entries.add(ModSpecialWeapons.BONK_STICK);
                        entries.add(ModSpecialWeapons.DAGGER);
                        entries.add(ModSpecialWeapons.LANCE);
                        entries.add(ModSpecialWeapons.J_S_LANCE);
                        entries.add(ModSpecialWeapons.MAGIC_WAND);
                        entries.add(ModSpecialWeapons.FRYING_PAN);
                        entries.add(ModSpecialWeapons.BATTLE_AXE);

                    }).build());

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_ARMOR = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PridePixels.MOD_ID, "queer_chestplate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pridepixels.armor"))
                    .icon(() -> new ItemStack(ModArmors.AROACE_CHESTPLATE)).entries((displayContext, entries) -> {

                        entries.add(ModArmors.AROACE_HELMET);
                        entries.add(ModArmors.AROACE_CHESTPLATE);
                        entries.add(ModArmors.AROACE_LEGGINGS);
                        entries.add(ModArmors.AROACE_BOOTS);

                        entries.add(ModArmors.BI_HELMET);
                        entries.add(ModArmors.BI_CHESTPLATE);
                        entries.add(ModArmors.BI_LEGGINGS);
                        entries.add(ModArmors.BI_BOOTS);

                        entries.add(ModArmors.DEMIGENDER_HELMET);
                        entries.add(ModArmors.DEMIGENDER_CHESTPLATE);
                        entries.add(ModArmors.DEMIGENDER_LEGGINGS);
                        entries.add(ModArmors.DEMIGENDER_BOOTS);

                        entries.add(ModArmors.GENDERFLUID_HELMET);
                        entries.add(ModArmors.GENDERFLUID_CHESTPLATE);
                        entries.add(ModArmors.GENDERFLUID_LEGGINGS);
                        entries.add(ModArmors.GENDERFLUID_BOOTS);

                        entries.add(ModArmors.LESBIAN_HELMET);
                        entries.add(ModArmors.LESBIAN_CHESTPLATE);
                        entries.add(ModArmors.LESBIAN_LEGGINGS);
                        entries.add(ModArmors.LESBIAN_BOOTS);

                        entries.add(ModArmors.MLM_HELMET);
                        entries.add(ModArmors.MLM_CHESTPLATE);
                        entries.add(ModArmors.MLM_LEGGINGS);
                        entries.add(ModArmors.MLM_BOOTS);

                        entries.add(ModArmors.NONBINARY_HELMET);
                        entries.add(ModArmors.NONBINARY_CHESTPLATE);
                        entries.add(ModArmors.NONBINARY_LEGGINGS);
                        entries.add(ModArmors.NONBINARY_BOOTS);

                        entries.add(ModArmors.PAN_HELMET);
                        entries.add(ModArmors.PAN_CHESTPLATE);
                        entries.add(ModArmors.PAN_LEGGINGS);
                        entries.add(ModArmors.PAN_BOOTS);

                        entries.add(ModArmors.QUEER_HELMET);
                        entries.add(ModArmors.QUEER_CHESTPLATE);
                        entries.add(ModArmors.QUEER_LEGGINGS);
                        entries.add(ModArmors.QUEER_BOOTS);

                        entries.add(ModArmors.TRANS_HELMET);
                        entries.add(ModArmors.TRANS_CHESTPLATE);
                        entries.add(ModArmors.TRANS_LEGGINGS);
                        entries.add(ModArmors.TRANS_BOOTS);

                    }).build());

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_OTHER = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PridePixels.MOD_ID, "queer_other"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pridepixels.other"))
                    .icon(() -> new ItemStack(ModItems.QUEER_SMITHING_TEMPLATE)).entries((displayContext, entries) -> {

                    entries.add(ModItems.QUEER_SMITHING_TEMPLATE);

                    }).build());

                        public static void registerItemGroups() {
                            PridePixels.LOGGER.info("Registering Item Groups for " + PridePixels.MOD_ID);
    }
}
