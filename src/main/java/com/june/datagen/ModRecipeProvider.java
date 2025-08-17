package com.june.datagen;

import com.june.blocks.ModBlocks;
import com.june.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AROACE_INGOT,1)
                .pattern(" 9 ")
                .pattern("LPL")
                .pattern(" E ")
                .input('9', ModItems.GREEN_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('E', ModItems.LIME_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BI_INGOT,1)
                .pattern(" F ")
                .pattern("5L5")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.DEMIGENDER_INGOT,1)
                .pattern(" D ")
                .pattern("QPQ")
                .pattern(" A ")
                .input('D', ModItems.LIGHT_GRAY_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('A', ModItems.GRAY_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.NONBINARY_INGOT,1)
                .pattern(" Q ")
                .pattern("LPL")
                .pattern(" 4 ")
                .input('Q', ModItems.YELLOW_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('4', ModItems.BLACK_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GENDERFLUID_INGOT,1)
                .pattern(" K ")
                .pattern("4LP")
                .pattern(" 5 ")
                .input('K', ModItems.PINK_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('4', ModItems.BLACK_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.LESBIAN_INGOT,1)
                .pattern(" N ")
                .pattern("FPI")
                .pattern(" L ")
                .input('N', ModItems.RED_INGOT)
                .input('F', ModItems.MAGENTA_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('I', ModItems.ORANGE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.MLM_INGOT,1)
                .pattern(" 6 ")
                .pattern("5P5")
                .pattern(" 6 ")
                .input('6', ModItems.CYAN_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.PAN_INGOT,1)
                .pattern(" F ")
                .pattern("CQC")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('C', ModItems.LIGHT_BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.QUEER_INGOT,1)
                .pattern("1B8")
                .pattern("G73")
                .pattern("HOJ")
                .input('1', ModItems.AROACE_INGOT)
                .input('B', ModItems.LESBIAN_INGOT)
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('G', ModItems.MLM_INGOT)
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('3', ModItems.BI_INGOT)
                .input('H', ModItems.NONBINARY_INGOT)
                .input('O', ModItems.TRANS_INGOT)
                .input('J', ModItems.PAN_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.TRANS_INGOT,1)
                .pattern(" K ")
                .pattern("CPC")
                .pattern(" K ")
                .input('K', ModItems.PINK_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('C', ModItems.LIGHT_BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BROWN_ORE, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_BROWN_ORE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BROWN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BROWN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLACK_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLUE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CYAN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.CYAN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GREEN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.GREEN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRAY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.GRAY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIGHT_BLUE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIGHT_BLUE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIGHT_GRAY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIGHT_GRAY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIME_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIME_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MAGENTA_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.MAGENTA_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORANGE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ORANGE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PINK_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PURPLE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.RED_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WHITE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.WHITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.YELLOW_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.YELLOW_BLOCK);

        //================================================================================


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.QUEER_SMITHING_TEMPLATE,2)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('T', ModItems.QUEER_SMITHING_TEMPLATE)

                .criterion(hasItem(ModItems.QUEER_SMITHING_TEMPLATE),conditionsFromItem(ModItems.QUEER_SMITHING_TEMPLATE))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModSpecialWeapons.MAGIC_WAND,1)
                .pattern("111")
                .pattern("1S1")
                .pattern("111")
                .input('1', ModItems.TRANS_INGOT)
                .input('S', Items.STICK)

                .criterion(hasItem(ModItems.TRANS_INGOT),conditionsFromItem(ModItems.TRANS_INGOT))
                .offerTo(exporter);

        

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModSpecialWeapons.BONK_STICK,1)
                .pattern(" A ")
                .pattern("ASA")
                .pattern(" A ")
                .input('A', ModItems.MLM_INGOT)
                .input('S', Items.STICK)

                .criterion(hasItem(ModItems.MLM_INGOT),conditionsFromItem(ModItems.MLM_INGOT))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModSpecialWeapons.FRYING_PAN,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.PAN_INGOT)
                .input('0', ModShovels.PAN_SHOVEL)

                .criterion(hasItem(ModShovels.PAN_SHOVEL),conditionsFromItem(ModShovels.PAN_SHOVEL))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModPickaxes.DRILL,1)
                .pattern("IRI")
                .pattern("SGA")
                .pattern("IRI")
                .input('R', Items.REDSTONE)
                .input('S', Items.DIAMOND_SHOVEL)
                .input('A', Items.DIAMOND_AXE)
                .input('G',ModPickaxes.GENDERFLUID_PICKAXE)
                .input('I',ModItems.GENDERFLUID_INGOT)


                .criterion(hasItem(Items.IRON_BLOCK),conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModSpecialWeapons.BATTLE_AXE,1)
                .pattern("IaI")
                .pattern("a0a")
                .pattern(" 0 ")

                .input('I', Items.IRON_AXE)
                .input('0', Items.STICK)
                .input('a', ModItems.BI_INGOT)

                .criterion(hasItem(Items.IRON_AXE),conditionsFromItem(Items.IRON_AXE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModSpecialWeapons.DAGGER,1)
                .pattern("a0a")
                .pattern("aIa")
                .pattern("aaa")

                .input('I', ModSwords.DEMIGENDER_SWORD)
                .input('0', Items.SHEARS)
                .input('a', ModItems.DEMIGENDER_INGOT)

                .criterion(hasItem(ModItems.DEMIGENDER_INGOT),conditionsFromItem(ModItems.DEMIGENDER_INGOT))
                .offerTo(exporter);



    }
}
