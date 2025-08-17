package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModAxes {

    public static final Item AROACE_AXE = registerAxes("aroace_axe",
            new AxeItem(ModToolMaterial.AROACE, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item BI_AXE = registerAxes("bi_axe",
            new AxeItem(ModToolMaterial.BI, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DEMIGENDER_AXE = registerAxes("demigender_axe",
            new AxeItem(ModToolMaterial.DEMIGENDER, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item GENDERFLUID_AXE = registerAxes("genderfluid_axe",
            new AxeItem(ModToolMaterial.GENDERFLUID, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item LESBIAN_AXE = registerAxes("lesbian_axe",
            new AxeItem(ModToolMaterial.LESBIAN, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item MLM_AXE = registerAxes("mlm_axe",
            new AxeItem(ModToolMaterial.MLM, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item NONBINARY_AXE = registerAxes("nonbinary_axe",
            new AxeItem(ModToolMaterial.NONBINARY, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item PAN_AXE = registerAxes("pan_axe",
            new AxeItem(ModToolMaterial.PAN, 6, -3f, new FabricItemSettings().maxDamage(2500)));

    public static final Item QUEER_AXE = registerAxes("queer_axe",
            new AxeItem(ModToolMaterial.QUEER, 6, -3f, new FabricItemSettings().maxDamage(3000)));

    public static final Item TRANS_AXE = registerAxes("trans_axe",
            new AxeItem(ModToolMaterial.TRANS, 6, -3f, new FabricItemSettings().maxDamage(2500)));





    private static Item registerAxes(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModAxes(){
        PridePixels.LOGGER.info("Registering mod swords for " + PridePixels.MOD_ID);
    }
}
