package com.june.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Merling extends StatusEffect {
    public Merling(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {


       if (entity.isSubmergedInWater()) {
           entity.setAir(entity.getMaxAir());
           entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3, amplifier + 1, false, false, false));
       }
        super.applyUpdateEffect(entity, amplifier);

    }




}