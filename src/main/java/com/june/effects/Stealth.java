package com.june.effects;

import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class Stealth extends StatusEffect {
    public Stealth(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {


        if (entity.isSneaking()){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30, amplifier+1,false,false,false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 80, amplifier+2,false,false,false));

        }

        super.applyUpdateEffect(entity, amplifier);

    }
}