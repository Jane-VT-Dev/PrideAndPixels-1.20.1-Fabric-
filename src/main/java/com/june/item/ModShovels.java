package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModShovels {


    public static final Item AROACE_SHOVEL = registerShovel("aroace_shovel",
            new ShovelItem(ModToolMaterial.AROACE, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item BI_SHOVEL = registerShovel("bi_shovel",
            new ShovelItem(ModToolMaterial.BI, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DEMIGENDER_SHOVEL= registerShovel("demigender_shovel",
            new ShovelItem(ModToolMaterial.DEMIGENDER, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item GENDERFLUID_SHOVEL= registerShovel("genderfluid_shovel",
            new ShovelItem(ModToolMaterial.GENDERFLUID, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item LESBIAN_SHOVEL = registerShovel("lesbian_shovel",
            new ShovelItem(ModToolMaterial.LESBIAN, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item MLM_SHOVEL = registerShovel("mlm_shovel",
            new ShovelItem(ModToolMaterial.MLM, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item NONBINARY_SHOVEL = registerShovel("nonbinary_shovel",
            new ShovelItem(ModToolMaterial.NONBINARY, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item PAN_SHOVEL = registerShovel("pan_shovel",
            new ShovelItem(ModToolMaterial.PAN, 1, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item QUEER_SHOVEL = registerShovel("queer_shovel",
            new ShovelItem(ModToolMaterial.QUEER, 1, -3f, new FabricItemSettings().maxDamage(3000)));

    public static final Item TRANS_SHOVEL = registerShovel("trans_shovel",
            new ShovelItem(ModToolMaterial.TRANS, 1, -3f, new FabricItemSettings().maxDamage(2500)));


    private static Item registerShovel(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModShovels(){
        PridePixels.LOGGER.info("Registering mod items for " + PridePixels.MOD_ID);
    }
}
