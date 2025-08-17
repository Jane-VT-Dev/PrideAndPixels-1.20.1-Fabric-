package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModSwords {

    public static final Item AROACE_SWORD = registerSwords("aroace_sword",
            new SwordItem(ModToolMaterial.AROACE, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item BI_SWORD = registerSwords("bi_sword",
            new SwordItem(ModToolMaterial.BI, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DEMIGENDER_SWORD = registerSwords("demigender_sword",
            new SwordItem(ModToolMaterial.DEMIGENDER, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item GENDERFLUID_SWORD = registerSwords("genderfluid_sword",
            new SwordItem(ModToolMaterial.GENDERFLUID, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item LESBIAN_SWORD = registerSwords("lesbian_sword",
            new SwordItem(ModToolMaterial.LESBIAN, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item MLM_SWORD = registerSwords("mlm_sword",
            new SwordItem(ModToolMaterial.MLM, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item NONBINARY_SWORD = registerSwords("nonbinary_sword",
            new SwordItem(ModToolMaterial.NONBINARY, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item PAN_SWORD = registerSwords("pan_sword",
            new SwordItem(ModToolMaterial.PAN, 4, -2f, new FabricItemSettings().maxDamage(2500)));

    public static final Item QUEER_SWORD = registerSwords("queer_sword",
            new SwordItem(ModToolMaterial.QUEER, 4, -1.5f, new FabricItemSettings().maxDamage(3000)));

    public static final Item TRANS_SWORD = registerSwords("trans_sword",
            new SwordItem(ModToolMaterial.TRANS, 4, -2f, new FabricItemSettings().maxDamage(2500)));



    private static Item registerSwords(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModSwords(){
        PridePixels.LOGGER.info("Registering mod swords for " + PridePixels.MOD_ID);
    }

}
