package com.june.datagen;

import com.june.item.*;
import com.june.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TOOLS)

                .add(ModAxes.AROACE_AXE)
                .add(ModPickaxes.AROACE_PICKAXE)
                .add(ModShovels.AROACE_SHOVEL)
                .add(ModHoes.AROACE_HOE)

                .add(ModAxes.BI_AXE)
                .add(ModPickaxes.BI_PICKAXE)
                .add(ModShovels.BI_SHOVEL)
                .add(ModHoes.BI_HOE)

                .add(ModAxes.DEMIGENDER_AXE)
                .add(ModPickaxes.DEMIGENDER_PICKAXE)
                .add(ModShovels.DEMIGENDER_SHOVEL)
                .add(ModHoes.DEMIGENDER_HOE)

                .add(ModAxes.GENDERFLUID_AXE)
                .add(ModPickaxes.GENDERFLUID_PICKAXE)
                .add(ModShovels.GENDERFLUID_SHOVEL)
                .add(ModHoes.GENDERFLUID_HOE)

                .add(ModAxes.LESBIAN_AXE)
                .add(ModPickaxes.LESBIAN_PICKAXE)
                .add(ModShovels.LESBIAN_SHOVEL)
                .add(ModHoes.LESBIAN_HOE)

                .add(ModAxes.MLM_AXE)
                .add(ModPickaxes.MLM_PICKAXE)
                .add(ModShovels.MLM_SHOVEL)
                .add(ModHoes.MLM_HOE)

                .add(ModAxes.NONBINARY_AXE)
                .add(ModPickaxes.NONBINARY_PICKAXE)
                .add(ModShovels.NONBINARY_SHOVEL)
                .add(ModHoes.NONBINARY_HOE)

                .add(ModAxes.PAN_AXE)
                .add(ModPickaxes.PAN_PICKAXE)
                .add(ModShovels.PAN_SHOVEL)
                .add(ModHoes.PAN_HOE)

                .add(ModAxes.QUEER_AXE)
                .add(ModPickaxes.QUEER_PICKAXE)
                .add(ModShovels.QUEER_SHOVEL)
                .add(ModHoes.QUEER_HOE)

                .add(ModAxes.TRANS_AXE)
                .add(ModPickaxes.TRANS_PICKAXE)
                .add(ModShovels.TRANS_SHOVEL)
                .add(ModHoes.TRANS_HOE);



        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModSwords.AROACE_SWORD)
                .add(ModSwords.BI_SWORD)
                .add(ModSwords.DEMIGENDER_SWORD)
                .add(ModSwords.GENDERFLUID_SWORD)
                .add(ModSwords.LESBIAN_SWORD)
                .add(ModSwords.MLM_SWORD)
                .add(ModSwords.NONBINARY_SWORD)
                .add(ModSwords.PAN_SWORD)
                .add(ModSwords.QUEER_SWORD)
                .add(ModSwords.PAN_SWORD)
                .add(ModSwords.TRANS_SWORD)
                .add(ModSpecialWeapons.BATTLE_AXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModAxes.AROACE_AXE)
                .add(ModAxes.BI_AXE)
                .add(ModAxes.DEMIGENDER_AXE)
                .add(ModAxes.GENDERFLUID_AXE)
                .add(ModAxes.LESBIAN_AXE)
                .add(ModAxes.MLM_AXE)
                .add(ModAxes.NONBINARY_AXE)
                .add(ModAxes.PAN_AXE)
                .add(ModAxes.QUEER_AXE)
                .add(ModAxes.TRANS_AXE)
                .add(ModSpecialWeapons.BATTLE_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModPickaxes.AROACE_PICKAXE)
                .add(ModPickaxes.BI_PICKAXE)
                .add(ModPickaxes.DEMIGENDER_PICKAXE)
                .add(ModPickaxes.GENDERFLUID_PICKAXE)
                .add(ModPickaxes.LESBIAN_PICKAXE)
                .add(ModPickaxes.MLM_PICKAXE)
                .add(ModPickaxes.NONBINARY_PICKAXE)
                .add(ModPickaxes.PAN_PICKAXE)
                .add(ModPickaxes.QUEER_PICKAXE)
                .add(ModPickaxes.TRANS_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModShovels.AROACE_SHOVEL)
                .add(ModShovels.BI_SHOVEL)
                .add(ModShovels.DEMIGENDER_SHOVEL)
                .add(ModShovels.GENDERFLUID_SHOVEL)
                .add(ModShovels.LESBIAN_SHOVEL)
                .add(ModShovels.MLM_SHOVEL)
                .add(ModShovels.NONBINARY_SHOVEL)
                .add(ModShovels.PAN_SHOVEL)
                .add(ModShovels.QUEER_SHOVEL)
                .add(ModShovels.TRANS_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModHoes.AROACE_HOE)
                .add(ModHoes.BI_HOE)
                .add(ModHoes.DEMIGENDER_HOE)
                .add(ModHoes.GENDERFLUID_HOE)
                .add(ModHoes.LESBIAN_HOE)
                .add(ModHoes.MLM_HOE)
                .add(ModHoes.NONBINARY_HOE)
                .add(ModHoes.PAN_HOE)
                .add(ModHoes.QUEER_HOE)
                .add(ModHoes.TRANS_HOE)
                .add(ModSpecialWeapons.SCYTHE);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.QUEER_SMITHING_TEMPLATE);


    }


}
