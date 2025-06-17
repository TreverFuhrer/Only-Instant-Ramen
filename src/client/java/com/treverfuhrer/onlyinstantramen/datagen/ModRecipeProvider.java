package com.treverfuhrer.onlyinstantramen.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.treverfuhrer.onlyinstantramen.OnlyInstantRamen;
import com.treverfuhrer.onlyinstantramen.item.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider{

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // List of ramen pairs
        List<RamenPair> ramenPairs = List.of(
            new RamenPair(ModItems.RAMEN, ModItems.COOKED_RAMEN, "ramen"),
            new RamenPair(ModItems.BEEF_RAMEN, ModItems.COOKED_BEEF_RAMEN, "beef_ramen")
        );

        for (RamenPair pair : ramenPairs) {
            generateCookingSet(exporter, pair.uncooked(), pair.cooked(), pair.id());
            offerBasicRamenCrafting(exporter, pair.uncooked(), pair.id());
        }
    }

    private void generateCookingSet(RecipeExporter exporter, Item input, Item output, String baseName) {
        float xp = 0.35f;
        int smeltTime = 200;
        int smokeTime = 100;
        int campfireTime = 600;

        offerSmelting(exporter, List.of(input), RecipeCategory.FOOD, output, xp, smeltTime, baseName + "_from_smelting");
        offerSmoking(exporter, List.of(input), RecipeCategory.FOOD, output, xp, smokeTime, baseName + "_from_smoking");
        offerCampfireCooking(exporter, List.of(input), RecipeCategory.FOOD, output, xp, campfireTime, baseName + "_from_campfire");
    }

    // Helpers
    private void offerSmoking(RecipeExporter exporter, List<Item> inputs, RecipeCategory category, Item output, float experience, int cookingTime, String name) {
    for (Item input : inputs) {
        CookingRecipeJsonBuilder.create(
                Ingredient.ofItems(input),
                category,
                output,
                experience,
                cookingTime,
                RecipeSerializer.SMOKING,
                SmokingRecipe::new
            )
            .criterion("has_" + input.getTranslationKey(), conditionsFromItem(input))
            .offerTo(exporter, Identifier.of(OnlyInstantRamen.MOD_ID, name));
        }
    }


    private void offerCampfireCooking(RecipeExporter exporter, List<Item> inputs, RecipeCategory category, Item output, float experience, int cookingTime, String name) {
    for (Item input : inputs) {
        CookingRecipeJsonBuilder.create(
                Ingredient.ofItems(input),
                category,
                output,
                experience,
                cookingTime,
                RecipeSerializer.CAMPFIRE_COOKING,
                CampfireCookingRecipe::new
            )
            .criterion("has_" + input.getTranslationKey(), conditionsFromItem(input))
            .offerTo(exporter, Identifier.of(OnlyInstantRamen.MOD_ID, name));
        }
    }

    private void offerBasicRamenCrafting(RecipeExporter exporter, Item output, String name) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
            .input(Items.WHEAT)
            .input(Items.WHEAT)
            .input(Items.EGG)
            .input(Ingredient.ofItems(Items.WATER_BUCKET, Items.GLASS_BOTTLE))
            .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
            .offerTo(exporter, Identifier.of(OnlyInstantRamen.MOD_ID, name + "_crafting"));
    }

    // record class to pair uncooked/cooked ramen items
    private record RamenPair(Item uncooked, Item cooked, String id) {}

    
    
}
