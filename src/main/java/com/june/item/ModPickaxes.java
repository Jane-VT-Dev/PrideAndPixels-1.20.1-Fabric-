package com.june.item;

import com.june.PridePixels;
import com.june.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPickaxes {


    public static final Item AROACE_PICKAXE = registerPickaxe("aroace_pickaxe",
            new PickaxeItem(ModToolMaterial.AROACE, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item BI_PICKAXE = registerPickaxe("bi_pickaxe",
            new PickaxeItem(ModToolMaterial.BI, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DEMIGENDER_PICKAXE = registerPickaxe("demigender_pickaxe",
            new PickaxeItem(ModToolMaterial.DEMIGENDER, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item GENDERFLUID_PICKAXE = registerPickaxe("genderfluid_pickaxe",
            new PickaxeItem(ModToolMaterial.GENDERFLUID, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item LESBIAN_PICKAXE = registerPickaxe("lesbian_pickaxe",
            new PickaxeItem(ModToolMaterial.LESBIAN, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item MLM_PICKAXE = registerPickaxe("mlm_pickaxe",
            new PickaxeItem(ModToolMaterial.MLM, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item NONBINARY_PICKAXE = registerPickaxe("nonbinary_pickaxe",
            new PickaxeItem(ModToolMaterial.NONBINARY, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item PAN_PICKAXE = registerPickaxe("pan_pickaxe",
            new PickaxeItem(ModToolMaterial.PAN, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item QUEER_PICKAXE = registerPickaxe("queer_pickaxe",
            new PickaxeItem(ModToolMaterial.QUEER, 1, -2.8f, new FabricItemSettings().maxDamage(3000)));

    public static final Item TRANS_PICKAXE = registerPickaxe("trans_pickaxe",
            new PickaxeItem(ModToolMaterial.TRANS, 1, -2.8f, new FabricItemSettings().maxDamage(2500)));

    public static final Item DRILL = registerPickaxe("drill",new DrillToolItem(new FabricItemSettings().maxDamage(3000)));

    private static Item registerPickaxe(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModPickaxes(){
        PridePixels.LOGGER.info("Registering mod items for " + PridePixels.MOD_ID);
    }
}

