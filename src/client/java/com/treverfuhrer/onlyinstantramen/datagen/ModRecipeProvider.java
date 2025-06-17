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

    private record RamenPair(Item uncooked, Item cooked, String id) {}
    private record RamenRecipe(Item output, List<ItemConvertible> ingredients, String id) {}

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {


        // PROBLEMS
        // Invisibility has same recipe as BURNED_RAMEN


        // Recipes
        List<RamenRecipe> ramenRecipes = List.of(
            // Base
            new RamenRecipe(ModItems.NOODLES, List.of(Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION), "noodles"),
            new RamenRecipe(ModItems.RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION), "ramen"),
            new RamenRecipe(ModItems.RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION), "ramen_from_noodles"),

            /* ---------- STRENGTH ---------- */
            // Beef Ramen
            new RamenRecipe(ModItems.BEEF_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.COOKED_BEEF), "beef_ramen"),
            new RamenRecipe(ModItems.BEEF_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.COOKED_BEEF), "beef_ramen_from_noodles"),
            new RamenRecipe(ModItems.BEEF_RAMEN, List.of(ModItems.RAMEN, Items.COOKED_BEEF), "beef_ramen_from_ramen"),
            // Brute Ramen
            new RamenRecipe(ModItems.BRUTE_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.COOKED_BEEF, Items.BLAZE_POWDER), "brute_ramen"),
            new RamenRecipe(ModItems.BRUTE_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.COOKED_BEEF, Items.BLAZE_POWDER), "brute_ramen_from_noodles"),
            new RamenRecipe(ModItems.BRUTE_RAMEN, List.of(ModItems.RAMEN, Items.COOKED_BEEF, Items.BLAZE_POWDER), "brute_ramen_from_ramen"),
            new RamenRecipe(ModItems.BRUTE_RAMEN, List.of(ModItems.BEEF_RAMEN, Items.BLAZE_POWDER), "brute_ramen_from_beef_ramen"),

            /* ---------- REGENERATION ---------- */
            // Herbal Ramen
            new RamenRecipe(ModItems.HERBAL_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SUGAR), "herbal_ramen"),
            new RamenRecipe(ModItems.HERBAL_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SUGAR), "herbal_ramen_from_noodles"),
            new RamenRecipe(ModItems.HERBAL_RAMEN, List.of(ModItems.RAMEN, Items.SUGAR), "herbal_ramen_from_ramen"),
            // Goldenleaf Ramen
            new RamenRecipe(ModItems.GOLDENLEAF_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SUGAR, Items.GHAST_TEAR), "goldenleaf_ramen"),
            new RamenRecipe(ModItems.GOLDENLEAF_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SUGAR, Items.GHAST_TEAR), "goldenleaf_ramen_from_noodles"),
            new RamenRecipe(ModItems.GOLDENLEAF_RAMEN, List.of(ModItems.RAMEN, Items.SUGAR, Items.GHAST_TEAR), "goldenleaf_ramen_from_ramen"),
            new RamenRecipe(ModItems.GOLDENLEAF_RAMEN, List.of(ModItems.HERBAL_RAMEN, Items.GHAST_TEAR), "goldenleaf_ramen_from_herbal_ramen"),

            /* ---------- NIGHT VISION ---------- */
            // Glowberry Ramen
            new RamenRecipe(ModItems.GLOWBERRY_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.GLOW_BERRIES), "glowberry_ramen"),
            new RamenRecipe(ModItems.GLOWBERRY_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.GLOW_BERRIES), "glowberry_ramen_from_noodles"),
            new RamenRecipe(ModItems.GLOWBERRY_RAMEN, List.of(ModItems.RAMEN, Items.GLOW_BERRIES), "glowberry_ramen_from_ramen"),
            // Fox Ramen
            new RamenRecipe(ModItems.FOX_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.GLOW_BERRIES, Items.GOLDEN_CARROT), "fox_ramen"),
            new RamenRecipe(ModItems.FOX_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.GLOW_BERRIES, Items.GOLDEN_CARROT), "fox_ramen_from_noodles"),
            new RamenRecipe(ModItems.FOX_RAMEN, List.of(ModItems.RAMEN, Items.GLOW_BERRIES, Items.GOLDEN_CARROT), "fox_ramen_from_ramen"),
            new RamenRecipe(ModItems.FOX_RAMEN, List.of(ModItems.GLOWBERRY_RAMEN, Items.GOLDEN_CARROT), "fox_ramen_from_glowberry_ramen"),

            /* ---------- INVISIBILITY ---------- */
            /* --------- corruption of night vision ramen --------- */
            // Faint Ramen
            new RamenRecipe(ModItems.FAINT_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.GLOW_BERRIES, Items.FERMENTED_SPIDER_EYE), "faint_ramen"),
            new RamenRecipe(ModItems.FAINT_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.GLOW_BERRIES, Items.FERMENTED_SPIDER_EYE), "faint_ramen_from_noodles"),
            new RamenRecipe(ModItems.FAINT_RAMEN, List.of(ModItems.RAMEN, Items.GLOW_BERRIES, Items.FERMENTED_SPIDER_EYE), "faint_ramen_from_ramen"),
            new RamenRecipe(ModItems.FAINT_RAMEN, List.of(ModItems.GLOWBERRY_RAMEN, Items.FERMENTED_SPIDER_EYE), "faint_ramen_from_glowberry_ramen"),

            // Ghost Ramen
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.GLOW_BERRIES, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE), "ghost_ramen"),
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.GLOW_BERRIES, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE), "ghost_ramen_from_noodles"),
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(ModItems.RAMEN, Items.GLOW_BERRIES, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE), "ghost_ramen_from_ramen"),
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(ModItems.GLOWBERRY_RAMEN, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE), "ghost_ramen_from_glowberry_ramen"),
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(ModItems.FOX_RAMEN, Items.FERMENTED_SPIDER_EYE), "ghost_ramen_from_fox_ramen"),
            new RamenRecipe(ModItems.GHOST_RAMEN, List.of(ModItems.FAINT_RAMEN, Items.GOLDEN_CARROT), "ghost_ramen_from_faint_ramen"),

            /* ---------- JUMP BOOST ---------- */
            // Rabbit Ramen
            new RamenRecipe(ModItems.RABBIT_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.RABBIT_HIDE), "rabbit_ramen"),
            new RamenRecipe(ModItems.RABBIT_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.RABBIT_HIDE), "rabbit_ramen_from_noodles"),
            new RamenRecipe(ModItems.RABBIT_RAMEN, List.of(ModItems.RAMEN, Items.RABBIT_HIDE), "rabbit_ramen_from_ramen"),
            // Leaping Ramen
            new RamenRecipe(ModItems.LEAPING_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.RABBIT_HIDE, Items.RABBIT_FOOT), "leaping_ramen"),
            new RamenRecipe(ModItems.LEAPING_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.RABBIT_HIDE, Items.RABBIT_FOOT), "leaping_ramen_from_noodles"),
            new RamenRecipe(ModItems.LEAPING_RAMEN, List.of(ModItems.RAMEN, Items.RABBIT_HIDE, Items.RABBIT_FOOT), "leaping_ramen_from_ramen"),
            new RamenRecipe(ModItems.LEAPING_RAMEN, List.of(ModItems.RABBIT_RAMEN, Items.RABBIT_FOOT), "leaping_ramen_from_rabbit_ramen"),

            /* ---------- SLOW FALLING ---------- */
            // Feather Ramen
            new RamenRecipe(ModItems.FEATHER_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.FEATHER), "feather_ramen"),
            new RamenRecipe(ModItems.FEATHER_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.FEATHER), "feather_ramen_from_noodles"),
            new RamenRecipe(ModItems.FEATHER_RAMEN, List.of(ModItems.RAMEN, Items.FEATHER), "feather_ramen_from_ramen"),

            // Cloud Ramen
            new RamenRecipe(ModItems.CLOUD_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.FEATHER, Items.PHANTOM_MEMBRANE), "cloud_ramen"),
            new RamenRecipe(ModItems.CLOUD_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.FEATHER, Items.PHANTOM_MEMBRANE), "cloud_ramen_from_noodles"),
            new RamenRecipe(ModItems.CLOUD_RAMEN, List.of(ModItems.RAMEN, Items.FEATHER, Items.PHANTOM_MEMBRANE), "cloud_ramen_from_ramen"),
            new RamenRecipe(ModItems.CLOUD_RAMEN, List.of(ModItems.FEATHER_RAMEN, Items.PHANTOM_MEMBRANE), "cloud_ramen_from_feather_ramen"),

            /* ---------- FIRE RESISTANCE ---------- */
            // Spicy Ramen
            new RamenRecipe(ModItems.SPICY_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.REDSTONE), "spicy_ramen"),
            new RamenRecipe(ModItems.SPICY_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.REDSTONE), "spicy_ramen_from_noodles"),
            new RamenRecipe(ModItems.SPICY_RAMEN, List.of(ModItems.RAMEN, Items.REDSTONE), "spicy_ramen_from_ramen"),

            // Blazing Ramen
            new RamenRecipe(ModItems.BLAZING_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.REDSTONE, Items.MAGMA_CREAM), "blazing_ramen"),
            new RamenRecipe(ModItems.BLAZING_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.REDSTONE, Items.MAGMA_CREAM), "blazing_ramen_from_noodles"),
            new RamenRecipe(ModItems.BLAZING_RAMEN, List.of(ModItems.RAMEN, Items.REDSTONE, Items.MAGMA_CREAM), "blazing_ramen_from_ramen"),
            new RamenRecipe(ModItems.BLAZING_RAMEN, List.of(ModItems.SPICY_RAMEN, Items.MAGMA_CREAM), "blazing_ramen_from_spicy_ramen"),

            /* ---------- WATER BREATHING ---------- */
            // Turtle Ramen
            new RamenRecipe(ModItems.TURTLE_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.TURTLE_SCUTE), "turtle_ramen"),
            new RamenRecipe(ModItems.TURTLE_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.TURTLE_SCUTE), "turtle_ramen_from_noodles"),
            new RamenRecipe(ModItems.TURTLE_RAMEN, List.of(ModItems.RAMEN, Items.TURTLE_SCUTE), "turtle_ramen_from_ramen"),

            // Deepsea Ramen
            new RamenRecipe(ModItems.DEEPSEA_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.TURTLE_SCUTE, Items.PUFFERFISH), "deepsea_ramen"),
            new RamenRecipe(ModItems.DEEPSEA_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.TURTLE_SCUTE, Items.PUFFERFISH), "deepsea_ramen_from_noodles"),
            new RamenRecipe(ModItems.DEEPSEA_RAMEN, List.of(ModItems.RAMEN,  Items.TURTLE_SCUTE, Items.PUFFERFISH), "deepsea_ramen_from_ramen"),
            new RamenRecipe(ModItems.DEEPSEA_RAMEN, List.of(ModItems.TURTLE_RAMEN, Items.PUFFERFISH), "deepsea_ramen_from_turtle_ramen"),

            /* ---------- SWIFTNESS ---------- */
            // Carrot Ramen
            new RamenRecipe(ModItems.CARROT_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.CARROT), "carrot_ramen"),
            new RamenRecipe(ModItems.CARROT_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.CARROT), "carrot_ramen_from_noodles"),
            new RamenRecipe(ModItems.CARROT_RAMEN, List.of(ModItems.RAMEN, Items.CARROT), "carrot_ramen_from_ramen"),

            // Swift Ramen
            new RamenRecipe(ModItems.SWIFT_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.CARROT, Items.SUGAR), "swift_ramen"),
            new RamenRecipe(ModItems.SWIFT_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.CARROT, Items.SUGAR), "swift_ramen_from_noodles"),
            new RamenRecipe(ModItems.SWIFT_RAMEN, List.of(ModItems.RAMEN, Items.CARROT, Items.SUGAR), "swift_ramen_from_ramen"),
            new RamenRecipe(ModItems.SWIFT_RAMEN, List.of(ModItems.CARROT_RAMEN, Items.SUGAR), "swift_ramen_from_carrot_ramen"),

            /* ---------- HEALING ---------- */
            // Mend Ramen
            new RamenRecipe(ModItems.MEND_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.MELON_SLICE), "mend_ramen"),
            new RamenRecipe(ModItems.MEND_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.MELON_SLICE), "mend_ramen_from_noodles"),
            new RamenRecipe(ModItems.MEND_RAMEN, List.of(ModItems.RAMEN, Items.MELON_SLICE), "mend_ramen_from_ramen"),

            // Revive Ramen
            new RamenRecipe(ModItems.REVIVE_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE), "revive_ramen"),
            new RamenRecipe(ModItems.REVIVE_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE), "revive_ramen_from_noodles"),
            new RamenRecipe(ModItems.REVIVE_RAMEN, List.of(ModItems.RAMEN, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE), "revive_ramen_from_ramen"),
            new RamenRecipe(ModItems.REVIVE_RAMEN, List.of(ModItems.MEND_RAMEN, Items.GLISTERING_MELON_SLICE), "revive_ramen_from_mend_ramen"),

            /* ---------- RESISTANCE ---------- */
            // Stone Ramen
            new RamenRecipe(ModItems.STONE_RAMEN, List.of(ModItems.RAMEN, Items.COBBLESTONE), "stone_ramen_from_ramen"),
            new RamenRecipe(ModItems.STONE_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.COBBLESTONE), "stone_ramen"),
            new RamenRecipe(ModItems.STONE_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.COBBLESTONE), "stone_ramen_from_noodles"),

            // Iron Ramen
            new RamenRecipe(ModItems.IRON_RAMEN, List.of(ModItems.STONE_RAMEN, Items.IRON_INGOT), "iron_ramen_from_stone_ramen"),
            new RamenRecipe(ModItems.IRON_RAMEN, List.of(ModItems.RAMEN, Items.COBBLESTONE, Items.IRON_INGOT), "iron_ramen_from_ramen"),
            new RamenRecipe(ModItems.IRON_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.COBBLESTONE, Items.IRON_INGOT), "iron_ramen"),
            new RamenRecipe(ModItems.IRON_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.COBBLESTONE, Items.IRON_INGOT), "iron_ramen_from_noodles"),

            /* ---------- POISON ---------- */
            // Rotten Ramen
            new RamenRecipe(ModItems.ROTTEN_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SPIDER_EYE), "rotten_ramen"),
            new RamenRecipe(ModItems.ROTTEN_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SPIDER_EYE),"rotten_ramen_from_noodles"),
            new RamenRecipe(ModItems.ROTTEN_RAMEN, List.of(ModItems.RAMEN, Items.SPIDER_EYE), "rotten_ramen_from_ramen"),

            // Virulent Ramen
            new RamenRecipe(ModItems.VIRULENT_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SPIDER_EYE, Items.GLOWSTONE_DUST), "virulent_ramen"),
            new RamenRecipe(ModItems.VIRULENT_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SPIDER_EYE, Items.GLOWSTONE_DUST), "virulent_ramen_from_noodles"),
            new RamenRecipe(ModItems.VIRULENT_RAMEN, List.of(ModItems.RAMEN, Items.SPIDER_EYE, Items.GLOWSTONE_DUST), "virulent_ramen_from_ramen"),
            new RamenRecipe(ModItems.VIRULENT_RAMEN, List.of(ModItems.ROTTEN_RAMEN, Items.GLOWSTONE_DUST), "virulent_ramen_from_rotten_ramen"),


            /* ------------------------- HARMING  ------------------------- */
            /* ---------- corruption of health and poison ramens ---------- */
            // Vicious Ramen
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "vicious_mend_ramen"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "vicious_mend_ramen_from_noodles"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(ModItems.RAMEN, Items.MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "vicious_mend_ramen_from_ramen"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(ModItems.MEND_RAMEN, Items.FERMENTED_SPIDER_EYE), "vicious_mend_ramen_from_mend_ramen"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SPIDER_EYE, Items.FERMENTED_SPIDER_EYE), "vicious_rotten_ramen"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SPIDER_EYE, Items.FERMENTED_SPIDER_EYE), "vicious_rotten_ramen_from_noodles"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(ModItems.RAMEN, Items.SPIDER_EYE, Items.FERMENTED_SPIDER_EYE), "vicious_rotten_ramen_from_ramen"),
            new RamenRecipe(ModItems.VICIOUS_RAMEN, List.of(ModItems.VICIOUS_RAMEN, Items.FERMENTED_SPIDER_EYE), "vicious_rotten_ramen_from_vicious_ramen"),
            
            // Blighted Ramen
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "blighted_revive_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "blighted_revive_ramen_from_noodles"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.RAMEN, Items.MELON_SLICE, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "blighted_revive_ramen_from_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.MEND_RAMEN, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE), "blighted_revive_ramen_from_mend_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.REVIVE_RAMEN, Items.FERMENTED_SPIDER_EYE), "blighted_revive_ramen_from_revive_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.VICIOUS_RAMEN, Items.GLISTERING_MELON_SLICE), "blighted_revive_ramen_from_vicious_ramen"),

            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.SPIDER_EYE, Items.GLOWSTONE_DUST, Items.FERMENTED_SPIDER_EYE), "blighted_ramen_virulent"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.SPIDER_EYE, Items.GLOWSTONE_DUST, Items.FERMENTED_SPIDER_EYE), "blighted_ramen_virulent_from_noodles"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.RAMEN, Items.SPIDER_EYE, Items.GLOWSTONE_DUST, Items.FERMENTED_SPIDER_EYE), "blighted_ramen_virulent_from_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.ROTTEN_RAMEN, Items.GLOWSTONE_DUST, Items.FERMENTED_SPIDER_EYE), "blighted_ramen_virulent_from_rotten_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.VIRULENT_RAMEN, Items.FERMENTED_SPIDER_EYE), "blighted_ramen_virulent_from_virulent_ramen"),
            new RamenRecipe(ModItems.BLIGHTED_RAMEN, List.of(ModItems.VICIOUS_RAMEN, Items.GLOWSTONE_DUST), "blighted_ramen_virulent_from_vicious_ramen"),

            /* ------------------------- SLOWNESS  ------------------------- */
            /* --------- corruption of speed and jump boost ramens --------- */
            // Thick Ramen
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.RABBIT_HIDE, Items.FERMENTED_SPIDER_EYE), "thick_rabbit_ramen"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.RABBIT_HIDE, Items.FERMENTED_SPIDER_EYE), "thick_rabbit_ramen_from_noodles"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(ModItems.RAMEN, Items.RABBIT_HIDE, Items.FERMENTED_SPIDER_EYE), "thick_rabbit_ramen_from_ramen"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(ModItems.RABBIT_RAMEN, Items.FERMENTED_SPIDER_EYE), "thick_rabbit_ramen_from_rabbit_ramen"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.CARROT, Items.FERMENTED_SPIDER_EYE), "thick_carrot_ramen"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.CARROT, Items.FERMENTED_SPIDER_EYE), "thick_carrot_ramen_from_noodles"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(ModItems.RAMEN, Items.CARROT, Items.FERMENTED_SPIDER_EYE), "thick_carrot_ramen_from_ramen"),
            new RamenRecipe(ModItems.THICK_RAMEN, List.of(ModItems.CARROT_RAMEN, Items.FERMENTED_SPIDER_EYE), "thick_carrot_ramen_from_carrot_ramen"),
            
            // Gelatinous Ramen
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.RABBIT_HIDE, Items.RABBIT_FOOT, Items.FERMENTED_SPIDER_EYE), "gelatinous_leaping_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.RABBIT_HIDE, Items.RABBIT_FOOT, Items.FERMENTED_SPIDER_EYE), "gelatinous_leaping_ramen_from_noodles"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.RAMEN, Items.RABBIT_HIDE, Items.RABBIT_FOOT, Items.FERMENTED_SPIDER_EYE), "gelatinous_leaping_ramen_from_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.RABBIT_RAMEN, Items.RABBIT_FOOT, Items.FERMENTED_SPIDER_EYE), "gelatinous_leaping_ramen_from_rabbit_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.LEAPING_RAMEN, Items.FERMENTED_SPIDER_EYE), "gelatinous_leaping_ramen_from_leaping_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.THICK_RAMEN, Items.RABBIT_HIDE), "gelatinous_leaping_ramen_from_thick_ramen"),
            
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.CARROT, Items.SUGAR, Items.FERMENTED_SPIDER_EYE), "gelatinous_swift_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.CARROT, Items.SUGAR, Items.FERMENTED_SPIDER_EYE), "gelatinous_swift_ramen_from_noodles"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.RAMEN, Items.CARROT, Items.SUGAR, Items.FERMENTED_SPIDER_EYE), "gelatinous_swift_ramen_from_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.CARROT_RAMEN, Items.SUGAR, Items.FERMENTED_SPIDER_EYE), "gelatinous_swift_ramen_from_carrot_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.SWIFT_RAMEN, Items.FERMENTED_SPIDER_EYE), "gelatinous_swift_ramen_from_swift_ramen"),
            new RamenRecipe(ModItems.GELATINOUS_RAMEN, List.of(ModItems.THICK_RAMEN, Items.SUGAR), "gelatinous_swift_ramen_from_thick_ramen"),
            
            /* --------------- WEAKNESS (no L2) --------------- */
            /* --------- corruption of strength ramen --------- */
            // Spoiled Ramen
            new RamenRecipe(ModItems.SPOILED_RAMEN, List.of(Items.BOWL, Items.WHEAT, Items.WHEAT, Items.EGG, Items.POTION, Items.COOKED_BEEF, Items.FERMENTED_SPIDER_EYE), "spoiled_ramen"),
            new RamenRecipe(ModItems.SPOILED_RAMEN, List.of(Items.BOWL, ModItems.NOODLES, Items.POTION, Items.COOKED_BEEF, Items.FERMENTED_SPIDER_EYE), "spoiled_ramen_from_noodles"),
            new RamenRecipe(ModItems.SPOILED_RAMEN, List.of(ModItems.RAMEN, Items.COOKED_BEEF, Items.FERMENTED_SPIDER_EYE), "spoiled_ramen_from_ramen"),
            new RamenRecipe(ModItems.SPOILED_RAMEN, List.of(ModItems.BEEF_RAMEN, Items.FERMENTED_SPIDER_EYE), "spoiled_ramen_from_beef_ramen")

        );


        for (RamenRecipe recipe : ramenRecipes) {
            offerRamenRecipe(exporter, recipe);
        }

        // Pair recipes
        List<RamenPair> ramenPairs = List.of(
            new RamenPair(ModItems.RAMEN, ModItems.COOKED_RAMEN, "ramen"),
            new RamenPair(ModItems.BEEF_RAMEN, ModItems.COOKED_BEEF_RAMEN, "beef_ramen"),
            new RamenPair(ModItems.BRUTE_RAMEN, ModItems.COOKED_BRUTE_RAMEN, "brute_ramen"),
            new RamenPair(ModItems.HERBAL_RAMEN, ModItems.COOKED_HERBAL_RAMEN, "herbal_ramen"),
            new RamenPair(ModItems.GOLDENLEAF_RAMEN, ModItems.COOKED_GOLDENLEAF_RAMEN, "goldenleaf_ramen"),
            new RamenPair(ModItems.GLOWBERRY_RAMEN, ModItems.COOKED_GLOWBERRY_RAMEN, "glowberry_ramen"),
            new RamenPair(ModItems.FOX_RAMEN, ModItems.COOKED_FOX_RAMEN, "fox_ramen"),
            new RamenPair(ModItems.RABBIT_RAMEN, ModItems.COOKED_RABBIT_RAMEN, "rabbit_ramen"),
            new RamenPair(ModItems.LEAPING_RAMEN, ModItems.COOKED_LEAPING_RAMEN, "leaping_ramen"),
            new RamenPair(ModItems.FEATHER_RAMEN, ModItems.COOKED_FEATHER_RAMEN, "feather_ramen"),
            new RamenPair(ModItems.CLOUD_RAMEN, ModItems.COOKED_CLOUD_RAMEN, "cloud_ramen"),
            new RamenPair(ModItems.SPICY_RAMEN, ModItems.COOKED_SPICY_RAMEN, "spicy_ramen"),
            new RamenPair(ModItems.BLAZING_RAMEN, ModItems.COOKED_BLAZING_RAMEN, "blazing_ramen"),
            new RamenPair(ModItems.TURTLE_RAMEN, ModItems.COOKED_TURTLE_RAMEN, "turtle_ramen"),
            new RamenPair(ModItems.DEEPSEA_RAMEN, ModItems.COOKED_DEEPSEA_RAMEN, "deepsea_ramen"),
            new RamenPair(ModItems.CARROT_RAMEN, ModItems.COOKED_CARROT_RAMEN, "carrot_ramen"),
            new RamenPair(ModItems.SWIFT_RAMEN, ModItems.COOKED_SWIFT_RAMEN, "swift_ramen"),
            new RamenPair(ModItems.MEND_RAMEN, ModItems.COOKED_MEND_RAMEN, "mend_ramen"),
            new RamenPair(ModItems.REVIVE_RAMEN, ModItems.COOKED_REVIVE_RAMEN, "revive_ramen"),
            new RamenPair(ModItems.FAINT_RAMEN, ModItems.COOKED_FAINT_RAMEN, "faint_ramen"),
            new RamenPair(ModItems.GHOST_RAMEN, ModItems.COOKED_GHOST_RAMEN, "ghost_ramen"),
            new RamenPair(ModItems.STONE_RAMEN, ModItems.COOKED_STONE_RAMEN, "stone_ramen"),
            new RamenPair(ModItems.IRON_RAMEN, ModItems.COOKED_IRON_RAMEN, "iron_ramen"),
            new RamenPair(ModItems.ROTTEN_RAMEN, ModItems.COOKED_ROTTEN_RAMEN, "rotten_ramen"),
            new RamenPair(ModItems.VIRULENT_RAMEN, ModItems.COOKED_VIRULENT_RAMEN, "virulent_ramen"),
            new RamenPair(ModItems.VICIOUS_RAMEN, ModItems.COOKED_VICIOUS_RAMEN, "vicious_ramen"),
            new RamenPair(ModItems.BLIGHTED_RAMEN, ModItems.COOKED_BLIGHTED_RAMEN, "blighted_ramen"),
            new RamenPair(ModItems.THICK_RAMEN, ModItems.COOKED_THICK_RAMEN, "thick_ramen"),
            new RamenPair(ModItems.GELATINOUS_RAMEN, ModItems.COOKED_GELATINOUS_RAMEN, "gelatinous_ramen"),
            new RamenPair(ModItems.SPOILED_RAMEN, ModItems.COOKED_SPOILED_RAMEN, "spoiled_ramen")
        );

        for (RamenPair pair : ramenPairs) {
            generateCookingSet(exporter, pair.uncooked(), pair.cooked(), pair.id());
        }
    }

    private void generateCookingSet(RecipeExporter exporter, Item input, Item output, String baseName) {
        float xp = 0.35f;
        int smeltTime = 200;
        int smokeTime = 100;
        int campfireTime = 600;

        offerSmelting(exporter, List.of(input), RecipeCategory.FOOD, output, xp, smeltTime, "cooked_" + baseName + "_from_smelting");
        offerSmoking(exporter, List.of(input), RecipeCategory.FOOD, output, xp, smokeTime, "cooked_" + baseName + "_from_smoking");
        offerCampfireCooking(exporter, List.of(input), RecipeCategory.FOOD, output, xp, campfireTime, "cooked_" + baseName + "_from_campfire");
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

    private void offerRamenRecipe(RecipeExporter exporter, RamenRecipe recipe) {
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, recipe.output());

        for (ItemConvertible ingredient : recipe.ingredients()) {
            builder.input(ingredient);
        }

        // Use first ingredient for unlock criterion
        builder.criterion(hasItem(recipe.ingredients().get(0)), conditionsFromItem(recipe.ingredients().get(0)));

        builder.offerTo(exporter, Identifier.of(OnlyInstantRamen.MOD_ID, recipe.id() + "_crafting"));
    }
}
