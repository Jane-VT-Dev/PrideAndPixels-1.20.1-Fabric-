package com.june.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.awt.*;

public class Special extends StatusEffect {
    public Special(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }



    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {


        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1, false, false, false));



        super.applyUpdateEffect(entity, amplifier);

    }


    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {

        entity.setGlowing(true);

        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {

        entity.setGlowing(false);
        super.onRemoved(entity, attributes, amplifier);
    }
}