package com.june.item;

import com.june.PridePixels;
import com.june.smithing_templates.QueerSmithingTemplate;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AROACE_INGOT = registerItem("aroace_ingot",new Item(new FabricItemSettings()));
    public static final Item BROWN_INGOT = registerItem("brown_ingot",new Item(new FabricItemSettings()));
    public static final Item BI_INGOT = registerItem("bi_ingot",new Item(new FabricItemSettings()));
    public static final Item BLACK_INGOT = registerItem("black_ingot",new Item(new FabricItemSettings()));
    public static final Item BLUE_INGOT = registerItem("blue_ingot",new Item(new FabricItemSettings()));
    public static final Item CYAN_INGOT = registerItem("cyan_ingot",new Item(new FabricItemSettings()));
    public static final Item DEMIGENDER_INGOT = registerItem("demigender_ingot",new Item(new FabricItemSettings()));
    public static final Item GENDERFLUID_INGOT = registerItem("genderfluid_ingot",new Item(new FabricItemSettings()));
    public static final Item GREEN_INGOT = registerItem("green_ingot",new Item(new FabricItemSettings()));
    public static final Item GRAY_INGOT = registerItem("gray_ingot",new Item(new FabricItemSettings()));
    public static final Item LESBIAN_INGOT = registerItem("lesbian_ingot",new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_INGOT = registerItem("light_blue_ingot",new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_INGOT = registerItem("light_gray_ingot",new Item(new FabricItemSettings()));
    public static final Item LIME_INGOT = registerItem("lime_ingot",new Item(new FabricItemSettings()));
    public static final Item MAGENTA_INGOT = registerItem("magenta_ingot",new Item(new FabricItemSettings()));
    public static final Item MLM_INGOT = registerItem("mlm_ingot",new Item(new FabricItemSettings()));
    public static final Item NONBINARY_INGOT = registerItem("nonbinary_ingot",new Item(new FabricItemSettings()));
    public static final Item ORANGE_INGOT = registerItem("orange_ingot",new Item(new FabricItemSettings()));
    public static final Item PAN_INGOT = registerItem("pan_ingot",new Item(new FabricItemSettings()));
    public static final Item PINK_INGOT = registerItem("pink_ingot",new Item(new FabricItemSettings()));
    public static final Item PURPLE_INGOT = registerItem("purple_ingot",new Item(new FabricItemSettings()));
    public static final Item QUEER_INGOT = registerItem("queer_ingot",new Item(new FabricItemSettings()));
    public static final Item RED_INGOT = registerItem("red_ingot",new Item(new FabricItemSettings()));
    public static final Item TRANS_INGOT = registerItem("trans_ingot",new Item(new FabricItemSettings()));
    public static final Item WHITE_INGOT = registerItem("white_ingot",new Item(new FabricItemSettings()));
    public static final Item YELLOW_INGOT = registerItem("yellow_ingot",new Item(new FabricItemSettings()));

    public static final Item RAW_BROWN_ORE = registerItem("raw_brown_ore",new Item(new FabricItemSettings()));

    public static final Item QUEER_SMITHING_TEMPLATE = registerItem("queer_smithing_template", QueerSmithingTemplate.createQueerUpgrade());

    //================================================================================

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PridePixels.MOD_ID, name),item);
    }

    public static void registerModItems(){
        PridePixels.LOGGER.info("Registering mod items for " + PridePixels.MOD_ID);
    }
}
