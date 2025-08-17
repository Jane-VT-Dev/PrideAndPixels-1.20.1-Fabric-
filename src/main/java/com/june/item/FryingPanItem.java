package com.june.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.Vec3d;

public class FryingPanItem extends SwordItem {
    public FryingPanItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addVelocity(new Vec3d(target.getX() - attacker.getX(), 0.03, target.getZ() - attacker.getZ()).normalize().multiply(1f));

        if (target.isPlayer()){

            target.move(MovementType.PLAYER,new Vec3d(target.getX() - attacker.getX(), 0.03, target.getZ() - attacker.getZ()).normalize().multiply(1f));

        }
        return super.postHit(stack, target, attacker);


    }

}
