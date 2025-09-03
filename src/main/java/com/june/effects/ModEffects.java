package com.june.effects;

import com.june.PridePixels;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> HEAT_FROM_FIRE = registerStatusEffect("heat_from_fire",
            new Heat_From_Fire_Effect(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> HEALTHY = registerStatusEffect("healthy",
            new Healthy(StatusEffectCategory.BENEFICIAL, 0x36ebab));

    public static final RegistryEntry<StatusEffect> STEALTH = registerStatusEffect("stealth",
            new Stealth(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> FARMERS_AURA = registerStatusEffect("farmers_aura",
            new FarmersAura(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> POPULAR = registerStatusEffect("popular",
            new Popular(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> STRONG_BUT_SLOW = registerStatusEffect("strong_but_slow",
            new StrongButSlow(StatusEffectCategory.BENEFICIAL, 0x36ebab));

    public static final RegistryEntry<StatusEffect> ANTI_GRAVITY = registerStatusEffect("anti_gravity",
            new AntiGravity(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> MERLING = registerStatusEffect("merling",
            new Merling(StatusEffectCategory.BENEFICIAL, 0x36ebab));


    public static final RegistryEntry<StatusEffect> SPECIAL = registerStatusEffect("special",
            new Special(StatusEffectCategory.BENEFICIAL, 0x36ebab));




    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PridePixels.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        PridePixels.LOGGER.info("Registering Mod Effects for " + PridePixels.MOD_ID);
    }
}
