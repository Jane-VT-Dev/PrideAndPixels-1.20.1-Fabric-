package com.june.materials;

import com.june.PridePixels;
import com.june.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

import static com.june.materials.ModArmorStats.*;

public enum ModArmorMaterials implements ArmorMaterial {


    AROACE("aroace",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.AROACE_INGOT)),

    BI("bi",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.BI_INGOT)),

    DEMIGENDER("demigender",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.DEMIGENDER_INGOT)),

    GENDERFLUID("genderfluid",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.GENDERFLUID_INGOT)),

    LESBIAN("lesbian",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.LESBIAN_INGOT)),

    MLM("mlm",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.MLM_INGOT)),

    NONBINARY("nonbinary",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.NONBINARY_INGOT)),

    PAN("pan",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.PAN_INGOT)),

    QUEER("queer",
            25, new int[] {
            queer_helmet_armor,
            queer_chestplate_armor,
            queer_leggings_armor,
            queer_boots_armor },
            queer_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            queer_toughness,
            queer_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.QUEER_INGOT)),

    TRANS("trans",
            25, new int[] {
            common_helmet_armor,
            common_chestplate_armor,
            common_leggings_armor,
            common_boots_armor },
            common_enchantability,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            common_toughness,
            common_knockbackResistance,
            () -> Ingredient.ofItems(ModItems.TRANS_INGOT));


    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return PridePixels.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
