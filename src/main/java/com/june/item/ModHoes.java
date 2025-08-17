package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModHoes {


    public static final Item AROACE_HOE = registerHoe("aroace_hoe",
            new HoeItem(ModToolMaterial.AROACE, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item BI_HOE = registerHoe("bi_hoe",
            new HoeItem(ModToolMaterial.BI, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DEMIGENDER_HOE = registerHoe("demigender_hoe",
            new HoeItem(ModToolMaterial.DEMIGENDER, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item GENDERFLUID_HOE = registerHoe("genderfluid_hoe",
            new HoeItem(ModToolMaterial.GENDERFLUID, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item LESBIAN_HOE = registerHoe("lesbian_hoe",
            new HoeItem(ModToolMaterial.LESBIAN, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item MLM_HOE = registerHoe("mlm_hoe",
            new HoeItem(ModToolMaterial.MLM, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item NONBINARY_HOE = registerHoe("nonbinary_hoe",
            new HoeItem(ModToolMaterial.NONBINARY, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item PAN_HOE = registerHoe("pan_hoe",
            new HoeItem(ModToolMaterial.PAN, -4, 0f, new FabricItemSettings().maxDamage(2500)));

    public static final Item QUEER_HOE = registerHoe("queer_hoe",
            new HoeItem(ModToolMaterial.QUEER, -4, 0f, new FabricItemSettings().maxDamage(3000)));

    public static final Item TRANS_HOE = registerHoe("trans_hoe",
            new HoeItem(ModToolMaterial.TRANS, -4, 0f, new FabricItemSettings().maxDamage(2500)));



    private static Item registerHoe(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModHoes(){
        PridePixels.LOGGER.info("Registering mod items for " + PridePixels.MOD_ID);
    }
}
