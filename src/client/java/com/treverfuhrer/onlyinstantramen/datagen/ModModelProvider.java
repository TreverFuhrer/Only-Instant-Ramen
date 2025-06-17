package com.treverfuhrer.onlyinstantramen.datagen;

import com.treverfuhrer.onlyinstantramen.item.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider{

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // No Blocks to gen
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NOODLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RAMEN, Models.GENERATED);

        // Strength
        itemModelGenerator.register(ModItems.BEEF_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BEEF_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRUTE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BRUTE_RAMEN, Models.GENERATED);

        // Regeneration
        itemModelGenerator.register(ModItems.HERBAL_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_HERBAL_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDENLEAF_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_GOLDENLEAF_RAMEN, Models.GENERATED);

        // Night Vision
        itemModelGenerator.register(ModItems.GLOWBERRY_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_GLOWBERRY_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOX_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FOX_RAMEN, Models.GENERATED);

        // Jump Boost
        itemModelGenerator.register(ModItems.RABBIT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RABBIT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAPING_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_LEAPING_RAMEN, Models.GENERATED);

        // Slow Falling
        itemModelGenerator.register(ModItems.FEATHER_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FEATHER_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOUD_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CLOUD_RAMEN, Models.GENERATED);

        // Fire Resistance
        itemModelGenerator.register(ModItems.SPICY_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SPICY_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZING_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BLAZING_RAMEN, Models.GENERATED);

        // Water Breathing
        itemModelGenerator.register(ModItems.TURTLE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_TURTLE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSEA_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_DEEPSEA_RAMEN, Models.GENERATED);

        // Swiftness
        itemModelGenerator.register(ModItems.CARROT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CARROT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWIFT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SWIFT_RAMEN, Models.GENERATED);

        // Healing
        itemModelGenerator.register(ModItems.MEND_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_MEND_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.REVIVE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_REVIVE_RAMEN, Models.GENERATED);

        // Invisibility
        itemModelGenerator.register(ModItems.FAINT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FAINT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GHOST_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_GHOST_RAMEN, Models.GENERATED);

        // Resistance
        itemModelGenerator.register(ModItems.STONE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_STONE_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_IRON_RAMEN, Models.GENERATED);

        // Poison
        itemModelGenerator.register(ModItems.ROTTEN_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_ROTTEN_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIRULENT_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_VIRULENT_RAMEN, Models.GENERATED);

        // Harming
        itemModelGenerator.register(ModItems.VICIOUS_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_VICIOUS_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLIGHTED_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BLIGHTED_RAMEN, Models.GENERATED);

        // Slowness
        itemModelGenerator.register(ModItems.THICK_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_THICK_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GELATINOUS_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_GELATINOUS_RAMEN, Models.GENERATED);

        // Weakness
        itemModelGenerator.register(ModItems.SPOILED_RAMEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SPOILED_RAMEN, Models.GENERATED);
    }
}
