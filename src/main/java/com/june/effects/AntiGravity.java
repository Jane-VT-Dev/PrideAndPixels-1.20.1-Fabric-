package com.june.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class AntiGravity extends StatusEffect {

    public AntiGravity(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        entity.setNoGravity(!entity.isOnGround());
        if (entity.isSneaking()) {
                    entity.setNoGravity(false);
                    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0, false, false, false));
        }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1,false,false,false));

        super.applyUpdateEffect(entity, amplifier);

    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {

        entity.setNoGravity(false);
        entity.removeStatusEffect(StatusEffects.SLOW_FALLING);
        entity.removeStatusEffect(StatusEffects.SPEED);
        super.onRemoved(entity, attributes, amplifier);
    }
}

