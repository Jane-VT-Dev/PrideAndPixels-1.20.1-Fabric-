package com.june.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class StrongButSlow extends StatusEffect {
    public StrongButSlow(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {



        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {


        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 30, 0,false,false,false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 30, 0,false,false,false));

        super.applyUpdateEffect(entity, amplifier);

    }
}