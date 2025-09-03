package com.june.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Popular extends StatusEffect {
    public Popular(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {



            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 30, amplifier,false,false,false));


        super.applyUpdateEffect(entity, amplifier);

    }
}