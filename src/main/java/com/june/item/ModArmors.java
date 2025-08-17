package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModArmors {


    public static final Item AROACE_HELMET = registerArmor("aroace_helmet",
            new ModArmorItemEff(ModArmorMaterials.AROACE, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item AROACE_CHESTPLATE = registerArmor("aroace_chestplate",
            new ArmorItem(ModArmorMaterials.AROACE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item AROACE_LEGGINGS = registerArmor("aroace_leggings",
            new ArmorItem(ModArmorMaterials.AROACE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item AROACE_BOOTS = registerArmor("aroace_boots",
            new ArmorItem(ModArmorMaterials.AROACE, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item BI_HELMET = registerArmor("bi_helmet",
            new ModArmorItemEff(ModArmorMaterials.BI, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item BI_CHESTPLATE = registerArmor("bi_chestplate",
            new ArmorItem(ModArmorMaterials.BI, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item BI_LEGGINGS = registerArmor("bi_leggings",
            new ArmorItem(ModArmorMaterials.BI, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item BI_BOOTS = registerArmor("bi_boots",
            new ArmorItem(ModArmorMaterials.BI, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item DEMIGENDER_HELMET = registerArmor("demigender_helmet",
            new ModArmorItemEff(ModArmorMaterials.DEMIGENDER, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item DEMIGENDER_CHESTPLATE = registerArmor("demigender_chestplate",
            new ArmorItem(ModArmorMaterials.DEMIGENDER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item DEMIGENDER_LEGGINGS = registerArmor("demigender_leggings",
            new ArmorItem(ModArmorMaterials.DEMIGENDER, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item DEMIGENDER_BOOTS = registerArmor("demigender_boots",
            new ArmorItem(ModArmorMaterials.DEMIGENDER, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item GENDERFLUID_HELMET = registerArmor("genderfluid_helmet",
            new ModArmorItemEff(ModArmorMaterials.GENDERFLUID, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item GENDERFLUID_CHESTPLATE = registerArmor("genderfluid_chestplate",
            new ArmorItem(ModArmorMaterials.GENDERFLUID, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item GENDERFLUID_LEGGINGS = registerArmor("genderfluid_leggings",
            new ArmorItem(ModArmorMaterials.GENDERFLUID, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item GENDERFLUID_BOOTS = registerArmor("genderfluid_boots",
            new ArmorItem(ModArmorMaterials.GENDERFLUID, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item LESBIAN_HELMET = registerArmor("lesbian_helmet",
            new ModArmorItemEff(ModArmorMaterials.LESBIAN, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item LESBIAN_CHESTPLATE = registerArmor("lesbian_chestplate",
            new ArmorItem(ModArmorMaterials.LESBIAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item LESBIAN_LEGGINGS = registerArmor("lesbian_leggings",
            new ArmorItem(ModArmorMaterials.LESBIAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item LESBIAN_BOOTS = registerArmor("lesbian_boots",
            new ArmorItem(ModArmorMaterials.LESBIAN, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item MLM_HELMET = registerArmor("mlm_helmet",
            new ModArmorItemEff(ModArmorMaterials.MLM, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item MLM_CHESTPLATE = registerArmor("mlm_chestplate",
            new ArmorItem(ModArmorMaterials.MLM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item MLM_LEGGINGS = registerArmor("mlm_leggings",
            new ArmorItem(ModArmorMaterials.MLM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item MLM_BOOTS = registerArmor("mlm_boots",
            new ArmorItem(ModArmorMaterials.MLM, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item NONBINARY_HELMET = registerArmor("nonbinary_helmet",
            new ModArmorItemEff(ModArmorMaterials.NONBINARY, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item NONBINARY_CHESTPLATE = registerArmor("nonbinary_chestplate",
            new ArmorItem(ModArmorMaterials.NONBINARY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item NONBINARY_LEGGINGS = registerArmor("nonbinary_leggings",
            new ArmorItem(ModArmorMaterials.NONBINARY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item NONBINARY_BOOTS = registerArmor("nonbinary_boots",
            new ArmorItem(ModArmorMaterials.NONBINARY, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item PAN_HELMET = registerArmor("pan_helmet",
            new ModArmorItemEff(ModArmorMaterials.PAN, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item PAN_CHESTPLATE = registerArmor("pan_chestplate",
            new ArmorItem(ModArmorMaterials.PAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item PAN_LEGGINGS = registerArmor("pan_leggings",
            new ArmorItem(ModArmorMaterials.PAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item PAN_BOOTS = registerArmor("pan_boots",
            new ArmorItem(ModArmorMaterials.PAN, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));

    public static final Item QUEER_HELMET = registerArmor("queer_helmet",
            new ModArmorItemEff(ModArmorMaterials.QUEER, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(600)));

    public static final Item QUEER_CHESTPLATE = registerArmor("queer_chestplate",
            new ArmorItem(ModArmorMaterials.QUEER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(750)));

    public static final Item QUEER_LEGGINGS = registerArmor("queer_leggings",
            new ArmorItem(ModArmorMaterials.QUEER, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(700)));

    public static final Item QUEER_BOOTS = registerArmor("queer_boots",
            new ArmorItem(ModArmorMaterials.QUEER, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(650)));

    public static final Item TRANS_HELMET = registerArmor("trans_helmet",
            new ModArmorItemEff(ModArmorMaterials.TRANS, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(500)));

    public static final Item TRANS_CHESTPLATE = registerArmor("trans_chestplate",
            new ArmorItem(ModArmorMaterials.TRANS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(650)));

    public static final Item TRANS_LEGGINGS = registerArmor("trans_leggings",
            new ArmorItem(ModArmorMaterials.TRANS, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(600)));

    public static final Item TRANS_BOOTS = registerArmor("trans_boots",
            new ArmorItem(ModArmorMaterials.TRANS, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(550)));



    private static Item registerArmor(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModArmors(){
        PridePixels.LOGGER.info("Registering mod items for " + PridePixels.MOD_ID);
    }

}
