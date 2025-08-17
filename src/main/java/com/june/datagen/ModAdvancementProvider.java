package com.june.datagen;

import com.june.PridePixels.*;
import com.june.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {


        Advancement.Builder.create()

                .display(new AdvancementDisplay(ItemStack.EMPTY,Text.literal("Display"),Text.literal("description"),null,AdvancementFrame.TASK,true,true,true))
                .criterion("got_brown_ingot",InventoryChangedCriterion.Conditions.items(ModItems.BROWN_INGOT))
                .rewards(AdvancementRewards.Builder.recipe(Identifier.of("pridepixels","pridepixels:data/recipes")));

    }
}
