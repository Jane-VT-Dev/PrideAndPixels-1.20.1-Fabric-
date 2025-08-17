package com.june.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class LanceItem extends Item {
    public LanceItem(Settings settings) {
        super(settings);
    }

    public final Random random = Random.create();

@Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (!world.isClient){


                if (user.isOnGround()) {

                    user.useRiptide(50);
                    user.setVelocity(0, 4, 0);

                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 90, 4, false, false, false));
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 10, false, false, false));

                    user.damage(user.getDamageSources().generic(), 2);
                    user.getItemCooldownManager().set(ModSpecialWeapons.LANCE,100);


                    if (user.isInSneakingPose()){

                        user.swingHand(hand);
                        world.createExplosion(user,user.getX(),user.getY()-0.5,user.getZ(),8, World.ExplosionSourceType.NONE);
                        user.getItemCooldownManager().set(ModSpecialWeapons.LANCE,150);
                        user.setVelocity(0, 12, 0);

                    }
                }
                else
                    user.useRiptide(50);
                    user.setVelocity(0, 2, 0);
                    user.damage(user.getDamageSources().generic(), 2);
                    user.getItemCooldownManager().set(ModSpecialWeapons.LANCE,100);
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 50, 10, false, false, false));

        }

        return super.use(world, user, hand);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addVelocity(new Vec3d(target.getX() - attacker.getX(), 0.03, target.getZ() - attacker.getZ()).normalize().multiply(1.2f));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10, 3, false, false, false));
        stack.damage(1,attacker, Entity::attemptTickInVoid);
        return super.postHit(stack, target, attacker);
    }
}

