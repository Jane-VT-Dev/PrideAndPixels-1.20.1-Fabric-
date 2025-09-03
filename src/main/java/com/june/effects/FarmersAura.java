package com.june.effects;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class FarmersAura extends StatusEffect {
    public FarmersAura(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

    if (!entity.getWorld().isClient) {
        if (entity.isSneaking()){
            if (entity.getHealth() >= 10.0F){
                entity.dropItem(Items.LEAD);
                entity.setHealth(entity.getHealth() - 1.0F);
                    }else entity.setFrozenTicks(50);
        }
    }
        super.applyUpdateEffect(entity, amplifier);
    }
}