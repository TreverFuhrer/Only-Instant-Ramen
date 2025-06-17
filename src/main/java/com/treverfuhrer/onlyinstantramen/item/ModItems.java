package com.treverfuhrer.onlyinstantramen.item;

import com.treverfuhrer.onlyinstantramen.OnlyInstantRamen;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {

    private ModItems() {}
 
    // Items
    public static final Item NOODLES = registerRamen("noodles", ModFoodComponents.NOODLES);
    public static final Item RAMEN = registerRamen("ramen", ModFoodComponents.RAMEN);
    public static final Item COOKED_RAMEN = registerRamen("cooked_ramen", ModFoodComponents.COOKED_RAMEN);

    // Strength
    public static final Item BEEF_RAMEN = registerRamen("beef_ramen", ModFoodComponents.BEEF_RAMEN);
    public static final Item COOKED_BEEF_RAMEN = registerRamen("cooked_beef_ramen", ModFoodComponents.COOKED_BEEF_RAMEN);
    public static final Item BRUTE_RAMEN = registerRamen("brute_ramen", ModFoodComponents.BRUTE_RAMEN);
    public static final Item COOKED_BRUTE_RAMEN = registerRamen("cooked_brute_ramen", ModFoodComponents.COOKED_BRUTE_RAMEN);

    // Regeneration
    public static final Item HERBAL_RAMEN = registerRamen("herbal_ramen", ModFoodComponents.HERBAL_RAMEN);
    public static final Item COOKED_HERBAL_RAMEN = registerRamen("cooked_herbal_ramen", ModFoodComponents.COOKED_HERBAL_RAMEN);
    public static final Item GOLDENLEAF_RAMEN = registerRamen("goldenleaf_ramen", ModFoodComponents.GOLDENLEAF_RAMEN);
    public static final Item COOKED_GOLDENLEAF_RAMEN = registerRamen("cooked_goldenleaf_ramen", ModFoodComponents.COOKED_GOLDENLEAF_RAMEN);

    // Night Vision
    public static final Item GLOWBERRY_RAMEN = registerRamen("glowberry_ramen", ModFoodComponents.GLOWBERRY_RAMEN);
    public static final Item COOKED_GLOWBERRY_RAMEN = registerRamen("cooked_glowberry_ramen", ModFoodComponents.COOKED_GLOWBERRY_RAMEN);
    public static final Item FOX_RAMEN = registerRamen("fox_ramen", ModFoodComponents.FOX_RAMEN);
    public static final Item COOKED_FOX_RAMEN = registerRamen("cooked_fox_ramen", ModFoodComponents.COOKED_FOX_RAMEN);

    // Jump Boost
    public static final Item RABBIT_RAMEN = registerRamen("rabbit_ramen", ModFoodComponents.RABBIT_RAMEN);
    public static final Item COOKED_RABBIT_RAMEN = registerRamen("cooked_rabbit_ramen", ModFoodComponents.COOKED_RABBIT_RAMEN);
    public static final Item LEAPING_RAMEN = registerRamen("leaping_ramen", ModFoodComponents.LEAPING_RAMEN);
    public static final Item COOKED_LEAPING_RAMEN = registerRamen("cooked_leaping_ramen", ModFoodComponents.COOKED_LEAPING_RAMEN);

    // Slow Falling
    public static final Item FEATHER_RAMEN = registerRamen("feather_ramen", ModFoodComponents.FEATHER_RAMEN);
    public static final Item COOKED_FEATHER_RAMEN = registerRamen("cooked_feather_ramen", ModFoodComponents.COOKED_FEATHER_RAMEN);
    public static final Item CLOUD_RAMEN = registerRamen("cloud_ramen", ModFoodComponents.CLOUD_RAMEN);
    public static final Item COOKED_CLOUD_RAMEN = registerRamen("cooked_cloud_ramen", ModFoodComponents.COOKED_CLOUD_RAMEN);

    // Fire Resistance
    public static final Item SPICY_RAMEN = registerRamen("spicy_ramen", ModFoodComponents.SPICY_RAMEN);
    public static final Item COOKED_SPICY_RAMEN = registerRamen("cooked_spicy_ramen", ModFoodComponents.COOKED_SPICY_RAMEN);
    public static final Item BLAZING_RAMEN = registerRamen("blazing_ramen", ModFoodComponents.BLAZING_RAMEN);
    public static final Item COOKED_BLAZING_RAMEN = registerRamen("cooked_blazing_ramen", ModFoodComponents.COOKED_BLAZING_RAMEN);

    // Water Breathing
    public static final Item TURTLE_RAMEN = registerRamen("turtle_ramen", ModFoodComponents.TURTLE_RAMEN);
    public static final Item COOKED_TURTLE_RAMEN = registerRamen("cooked_turtle_ramen", ModFoodComponents.COOKED_TURTLE_RAMEN);
    public static final Item DEEPSEA_RAMEN = registerRamen("deepsea_ramen", ModFoodComponents.DEEPSEA_RAMEN);
    public static final Item COOKED_DEEPSEA_RAMEN = registerRamen("cooked_deepsea_ramen", ModFoodComponents.COOKED_DEEPSEA_RAMEN);

    // Swiftness
    public static final Item CARROT_RAMEN = registerRamen("carrot_ramen", ModFoodComponents.CARROT_RAMEN);
    public static final Item COOKED_CARROT_RAMEN = registerRamen("cooked_carrot_ramen", ModFoodComponents.COOKED_CARROT_RAMEN);
    public static final Item SWIFT_RAMEN = registerRamen("swift_ramen", ModFoodComponents.SWIFT_RAMEN);
    public static final Item COOKED_SWIFT_RAMEN = registerRamen("cooked_swift_ramen", ModFoodComponents.COOKED_SWIFT_RAMEN);

    // Healing
    public static final Item MEND_RAMEN = registerRamen("mend_ramen", ModFoodComponents.MEND_RAMEN);
    public static final Item COOKED_MEND_RAMEN = registerRamen("cooked_mend_ramen", ModFoodComponents.COOKED_MEND_RAMEN);
    public static final Item REVIVE_RAMEN = registerRamen("revive_ramen", ModFoodComponents.REVIVE_RAMEN);
    public static final Item COOKED_REVIVE_RAMEN = registerRamen("cooked_revive_ramen", ModFoodComponents.COOKED_REVIVE_RAMEN);

    // Invisibility
    public static final Item FAINT_RAMEN = registerRamen("faint_ramen", ModFoodComponents.FAINT_RAMEN);
    public static final Item COOKED_FAINT_RAMEN = registerRamen("cooked_faint_ramen", ModFoodComponents.COOKED_FAINT_RAMEN);
    public static final Item GHOST_RAMEN = registerRamen("ghost_ramen", ModFoodComponents.GHOST_RAMEN);
    public static final Item COOKED_GHOST_RAMEN = registerRamen("cooked_ghost_ramen", ModFoodComponents.COOKED_GHOST_RAMEN);

    // Resistance
    public static final Item STONE_RAMEN = registerRamen("stone_ramen", ModFoodComponents.STONE_RAMEN);
    public static final Item COOKED_STONE_RAMEN = registerRamen("cooked_stone_ramen", ModFoodComponents.COOKED_STONE_RAMEN);
    public static final Item IRON_RAMEN = registerRamen("iron_ramen", ModFoodComponents.IRON_RAMEN);
    public static final Item COOKED_IRON_RAMEN = registerRamen("cooked_iron_ramen", ModFoodComponents.COOKED_IRON_RAMEN);

    // POISON
    public static final Item ROTTEN_RAMEN = registerRamen("rotten_ramen", ModFoodComponents.ROTTEN_RAMEN);
    public static final Item COOKED_ROTTEN_RAMEN = registerRamen("cooked_rotten_ramen", ModFoodComponents.COOKED_ROTTEN_RAMEN);
    public static final Item VIRULENT_RAMEN = registerRamen("virulent_ramen", ModFoodComponents.VIRULENT_RAMEN);
    public static final Item COOKED_VIRULENT_RAMEN = registerRamen("cooked_virulent_ramen", ModFoodComponents.COOKED_VIRULENT_RAMEN);

    // Harming
    public static final Item VICIOUS_RAMEN = registerRamen("vicious_ramen", ModFoodComponents.VICIOUS_RAMEN);
    public static final Item COOKED_VICIOUS_RAMEN = registerRamen("cooked_vicious_ramen", ModFoodComponents.COOKED_VICIOUS_RAMEN);
    public static final Item BLIGHTED_RAMEN = registerRamen("blighted_ramen", ModFoodComponents.BLIGHTED_RAMEN);
    public static final Item COOKED_BLIGHTED_RAMEN = registerRamen("cooked_blighted_ramen", ModFoodComponents.COOKED_BLIGHTED_RAMEN);

    // Slowness
    public static final Item THICK_RAMEN = registerRamen("thick_ramen", ModFoodComponents.THICK_RAMEN);
    public static final Item COOKED_THICK_RAMEN = registerRamen("cooked_thick_ramen", ModFoodComponents.COOKED_THICK_RAMEN);
    public static final Item GELATINOUS_RAMEN = registerRamen("gelatinous_ramen", ModFoodComponents.GELATINOUS_RAMEN);
    public static final Item COOKED_GELATINOUS_RAMEN = registerRamen("cooked_gelatinous_ramen", ModFoodComponents.COOKED_GELATINOUS_RAMEN);

    // WEAKNESS
    public static final Item SPOILED_RAMEN = registerRamen("spoiled_ramen", ModFoodComponents.SPOILED_RAMEN);
    public static final Item COOKED_SPOILED_RAMEN = registerRamen("cooked_spoiled_ramen", ModFoodComponents.COOKED_SPOILED_RAMEN);

    // Helper methods
    public static Item registerRamen(String name,  FoodComponent component) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyInstantRamen.MOD_ID, name), 
            new Item(new Item.Settings().maxCount(1).food(component)));
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyInstantRamen.MOD_ID, name), item);
    }

    // Item Groups
    public static void registerToVanillaItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(Items.SPIDER_EYE, NOODLES);

            // Reverse order for correct appearance
            content.addAfter(NOODLES, COOKED_SPOILED_RAMEN);
            content.addAfter(NOODLES, SPOILED_RAMEN);
            content.addAfter(NOODLES, COOKED_GELATINOUS_RAMEN);
            content.addAfter(NOODLES, GELATINOUS_RAMEN);
            content.addAfter(NOODLES, COOKED_THICK_RAMEN);
            content.addAfter(NOODLES, THICK_RAMEN);
            content.addAfter(NOODLES, COOKED_BLIGHTED_RAMEN);
            content.addAfter(NOODLES, BLIGHTED_RAMEN);
            content.addAfter(NOODLES, COOKED_VICIOUS_RAMEN);
            content.addAfter(NOODLES, VICIOUS_RAMEN);
            content.addAfter(NOODLES, COOKED_VIRULENT_RAMEN);
            content.addAfter(NOODLES, VIRULENT_RAMEN);
            content.addAfter(NOODLES, COOKED_ROTTEN_RAMEN);
            content.addAfter(NOODLES, ROTTEN_RAMEN);
            content.addAfter(NOODLES, COOKED_IRON_RAMEN);
            content.addAfter(NOODLES, IRON_RAMEN);
            content.addAfter(NOODLES, COOKED_STONE_RAMEN);
            content.addAfter(NOODLES, STONE_RAMEN);
            content.addAfter(NOODLES, COOKED_GHOST_RAMEN);
            content.addAfter(NOODLES, GHOST_RAMEN);
            content.addAfter(NOODLES, COOKED_FAINT_RAMEN);
            content.addAfter(NOODLES, FAINT_RAMEN);
            content.addAfter(NOODLES, COOKED_REVIVE_RAMEN);
            content.addAfter(NOODLES, REVIVE_RAMEN);
            content.addAfter(NOODLES, COOKED_MEND_RAMEN);
            content.addAfter(NOODLES, MEND_RAMEN);
            content.addAfter(NOODLES, COOKED_SWIFT_RAMEN);
            content.addAfter(NOODLES, SWIFT_RAMEN);
            content.addAfter(NOODLES, COOKED_CARROT_RAMEN);
            content.addAfter(NOODLES, CARROT_RAMEN);
            content.addAfter(NOODLES, COOKED_DEEPSEA_RAMEN);
            content.addAfter(NOODLES, DEEPSEA_RAMEN);
            content.addAfter(NOODLES, COOKED_TURTLE_RAMEN);
            content.addAfter(NOODLES, TURTLE_RAMEN);
            content.addAfter(NOODLES, COOKED_BLAZING_RAMEN);
            content.addAfter(NOODLES, BLAZING_RAMEN);
            content.addAfter(NOODLES, COOKED_SPICY_RAMEN);
            content.addAfter(NOODLES, SPICY_RAMEN);
            content.addAfter(NOODLES, COOKED_CLOUD_RAMEN);
            content.addAfter(NOODLES, CLOUD_RAMEN);
            content.addAfter(NOODLES, COOKED_FEATHER_RAMEN);
            content.addAfter(NOODLES, FEATHER_RAMEN);
            content.addAfter(NOODLES, COOKED_LEAPING_RAMEN);
            content.addAfter(NOODLES, LEAPING_RAMEN);
            content.addAfter(NOODLES, COOKED_RABBIT_RAMEN);
            content.addAfter(NOODLES, RABBIT_RAMEN);
            content.addAfter(NOODLES, COOKED_FOX_RAMEN);
            content.addAfter(NOODLES, FOX_RAMEN);
            content.addAfter(NOODLES, COOKED_GLOWBERRY_RAMEN);
            content.addAfter(NOODLES, GLOWBERRY_RAMEN);
            content.addAfter(NOODLES, COOKED_GOLDENLEAF_RAMEN);
            content.addAfter(NOODLES, GOLDENLEAF_RAMEN);
            content.addAfter(NOODLES, COOKED_HERBAL_RAMEN);
            content.addAfter(NOODLES, HERBAL_RAMEN);
            content.addAfter(NOODLES, COOKED_BRUTE_RAMEN);
            content.addAfter(NOODLES, BRUTE_RAMEN);
            content.addAfter(NOODLES, COOKED_BEEF_RAMEN);
            content.addAfter(NOODLES, BEEF_RAMEN);
            content.addAfter(NOODLES, COOKED_RAMEN);
            content.addAfter(NOODLES, RAMEN);
        });
    }

 
    // Initialize on startup
    public static void initialize() {
        OnlyInstantRamen.LOGGER.info("Registering Mod Items for " + OnlyInstantRamen.MOD_ID);
        registerToVanillaItemGroups();
    }
}
