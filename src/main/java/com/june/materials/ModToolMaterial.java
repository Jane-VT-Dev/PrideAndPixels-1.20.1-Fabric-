package com.june.materials;

import com.june.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

import static com.june.materials.ModToolMaterialStats.*;


public enum ModToolMaterial implements ToolMaterial {

        AROACE(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.AROACE_INGOT)),

        BI(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.BI_INGOT)),

        DEMIGENDER(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.DEMIGENDER_INGOT)),

        GENDERFLUID(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.GENDERFLUID_INGOT)),

        LESBIAN(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.LESBIAN_INGOT)),

        MLM(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.MLM_INGOT)),

        NONBINARY(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.NONBINARY_INGOT)),

        PAN(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
                () -> Ingredient.ofItems(ModItems.PAN_INGOT)),

    TRANS(common_mining_level, common_durability, common_mining_speed, common_attack_damage, common_enchantability,
            () -> Ingredient.ofItems(ModItems.TRANS_INGOT)),

        QUEER(queer_mining_level, queer_durability, queer_mining_speed, queer_attack_damage, queer_enchantability,
                () -> Ingredient.ofItems(ModItems.QUEER_INGOT));

        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Supplier<Ingredient> repairIngredient;

        ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attckDamage;
            this.enchantability = enchantability;
            this.repairIngredient = repairIngredient;
        }

        @Override
        public int getDurability() {
            return this.itemDurability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return this.miningSpeed;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getMiningLevel() {
            return this.miningLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }
    }

