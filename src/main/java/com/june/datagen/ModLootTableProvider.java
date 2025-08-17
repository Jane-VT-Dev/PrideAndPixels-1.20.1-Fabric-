package com.june.datagen;

import com.june.blocks.ModBlocks;
import com.june.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput);
    }

    @Override
    public void generate() {


        addDrop(ModBlocks.BROWN_STONE_ORE, brownOreDrops(ModBlocks.BROWN_STONE_ORE, ModItems.RAW_BROWN_ORE));
        addDrop(ModBlocks.BROWN_DEEPSLATE_ORE, brownOreDrops(ModBlocks.BROWN_DEEPSLATE_ORE, ModItems.RAW_BROWN_ORE));

        addDrop(ModBlocks.RAW_BROWN_ORE_BLOCK,ModBlocks.RAW_BROWN_ORE_BLOCK);

        addDrop(ModBlocks.AROACE_BLOCK,ModBlocks.AROACE_BLOCK);
        addDrop(ModBlocks.BI_BLOCK,ModBlocks.BI_BLOCK);
        addDrop(ModBlocks.DEMIGENDER_BLOCK,ModBlocks.DEMIGENDER_BLOCK);
        addDrop(ModBlocks.GENDERFLUID_BLOCK,ModBlocks.GENDERFLUID_BLOCK);
        addDrop(ModBlocks.LESBIAN_BLOCK,ModBlocks.LESBIAN_BLOCK);
        addDrop(ModBlocks.MLM_BLOCK,ModBlocks.MLM_BLOCK);
        addDrop(ModBlocks.NONBINARY_BLOCK,ModBlocks.NONBINARY_BLOCK);
        addDrop(ModBlocks.PAN_BLOCK,ModBlocks.PAN_BLOCK);
        addDrop(ModBlocks.TRANS_BLOCK,ModBlocks.TRANS_BLOCK);
        addDrop(ModBlocks.QUEER_BLOCK,ModBlocks.QUEER_BLOCK);

        addDrop(ModBlocks.BROWN_BLOCK,ModBlocks.BROWN_BLOCK);
        addDrop(ModBlocks.BLACK_BLOCK,ModBlocks.BLACK_BLOCK);
        addDrop(ModBlocks.BLUE_BLOCK,ModBlocks.BLUE_BLOCK);
        addDrop(ModBlocks.CYAN_BLOCK,ModBlocks.CYAN_BLOCK);
        addDrop(ModBlocks.GREEN_BLOCK,ModBlocks.GREEN_BLOCK);
        addDrop(ModBlocks.GRAY_BLOCK,ModBlocks.GRAY_BLOCK);
        addDrop(ModBlocks.LIGHT_BLUE_BLOCK,ModBlocks.LIGHT_BLUE_BLOCK);
        addDrop(ModBlocks.LIGHT_GRAY_BLOCK,ModBlocks.LIGHT_GRAY_BLOCK);
        addDrop(ModBlocks.LIME_BLOCK,ModBlocks.LIME_BLOCK);
        addDrop(ModBlocks.MAGENTA_BLOCK,ModBlocks.MAGENTA_BLOCK);
        addDrop(ModBlocks.ORANGE_BLOCK,ModBlocks.ORANGE_BLOCK);
        addDrop(ModBlocks.PINK_BLOCK,ModBlocks.PINK_BLOCK);
        addDrop(ModBlocks.PURPLE_BLOCK,ModBlocks.PURPLE_BLOCK);
        addDrop(ModBlocks.RED_BLOCK,ModBlocks.RED_BLOCK);
        addDrop(ModBlocks.WHITE_BLOCK,ModBlocks.WHITE_BLOCK);
        addDrop(ModBlocks.YELLOW_BLOCK,ModBlocks.YELLOW_BLOCK);





    }
    public LootTable.Builder brownOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1f, 1f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}



