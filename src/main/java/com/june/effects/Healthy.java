package com.june.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Objects;
import java.util.jar.Attributes;

public class Healthy extends StatusEffect {
    public Healthy(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        if(entity.getHealth()<=3.0f){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, amplifier,false,false,false));

        }

        super.applyUpdateEffect(entity, amplifier);

    }

    }

