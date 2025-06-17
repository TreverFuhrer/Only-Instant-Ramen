package com.treverfuhrer.onlyinstantramen.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {

    public static final FoodComponent NOODLES;
    public static final FoodComponent RAMEN;
    public static final FoodComponent COOKED_RAMEN;

    // Strength
    public static final FoodComponent BEEF_RAMEN;
    public static final FoodComponent COOKED_BEEF_RAMEN;
    public static final FoodComponent BRUTE_RAMEN;
    public static final FoodComponent COOKED_BRUTE_RAMEN;

    // Regeneration
    public static final FoodComponent HERBAL_RAMEN;
    public static final FoodComponent COOKED_HERBAL_RAMEN;
    public static final FoodComponent GOLDENLEAF_RAMEN;
    public static final FoodComponent COOKED_GOLDENLEAF_RAMEN;

    // Night Vision
    public static final FoodComponent GLOWBERRY_RAMEN;
    public static final FoodComponent COOKED_GLOWBERRY_RAMEN;
    public static final FoodComponent FOX_RAMEN;
    public static final FoodComponent COOKED_FOX_RAMEN;

    // Jump Boost
    public static final FoodComponent RABBIT_RAMEN;
    public static final FoodComponent COOKED_RABBIT_RAMEN;
    public static final FoodComponent LEAPING_RAMEN;
    public static final FoodComponent COOKED_LEAPING_RAMEN;

    // Slow Falling
    public static final FoodComponent FEATHER_RAMEN;
    public static final FoodComponent COOKED_FEATHER_RAMEN;
    public static final FoodComponent CLOUD_RAMEN;
    public static final FoodComponent COOKED_CLOUD_RAMEN;

    // Fire Resistance
    public static final FoodComponent SPICY_RAMEN;
    public static final FoodComponent COOKED_SPICY_RAMEN;
    public static final FoodComponent BLAZING_RAMEN;
    public static final FoodComponent COOKED_BLAZING_RAMEN;

    // Water Breathing
    public static final FoodComponent TURTLE_RAMEN;
    public static final FoodComponent COOKED_TURTLE_RAMEN;
    public static final FoodComponent DEEPSEA_RAMEN;
    public static final FoodComponent COOKED_DEEPSEA_RAMEN;

    // Swiftness
    public static final FoodComponent CARROT_RAMEN;
    public static final FoodComponent COOKED_CARROT_RAMEN;
    public static final FoodComponent SWIFT_RAMEN;
    public static final FoodComponent COOKED_SWIFT_RAMEN;

    // Healing
    public static final FoodComponent MEND_RAMEN;
    public static final FoodComponent COOKED_MEND_RAMEN;
    public static final FoodComponent REVIVE_RAMEN;
    public static final FoodComponent COOKED_REVIVE_RAMEN;

    // Invisibility
    public static final FoodComponent FAINT_RAMEN;
    public static final FoodComponent COOKED_FAINT_RAMEN;
    public static final FoodComponent GHOST_RAMEN;
    public static final FoodComponent COOKED_GHOST_RAMEN;

    // Resistance
    public static final FoodComponent STONE_RAMEN;
    public static final FoodComponent COOKED_STONE_RAMEN;
    public static final FoodComponent IRON_RAMEN;
    public static final FoodComponent COOKED_IRON_RAMEN;

    // Harming
    public static final FoodComponent BURNED_RAMEN;

    // Weakness
    public static final FoodComponent SPOILED_RAMEN;

    // NAUSEA
    public static final FoodComponent MOLDY_RAMEN;

    // POISON
    public static final FoodComponent ROTTEN_RAMEN;

    // Slowness
    public static final FoodComponent THICK_RAMEN;

    // Extra
    public static final FoodComponent TINKER_RAMEN; // Haste 1
    public static final FoodComponent MINERS_RAMEN; // Haste 2
    public static final FoodComponent DRIFT_RAMEN; // Levetation 1
    public static final FoodComponent SHULKER_RAMEN; // Levetation 2
    public static final FoodComponent LUCKY_RAMEN; // Luck 1
    public static final FoodComponent COOKED_LUCKY_RAMEN; // Luck 2


    public ModFoodComponents() {}

    private static FoodComponent.Builder createRamen(int hunger, float saturation, StatusEffectInstance effect, float effectChance) {
        return (new FoodComponent.Builder())
            .nutrition(hunger)
            .saturationModifier(saturation)
            .statusEffect(effect, effectChance)
            .usingConvertsTo(Items.BOWL);
    }

    static {
        NOODLES = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.1f).build();
        RAMEN = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.2f).usingConvertsTo(Items.BOWL).build();
        COOKED_RAMEN = (new FoodComponent.Builder()).nutrition(7).saturationModifier(0.8f).usingConvertsTo(Items.BOWL).build();

        // Strength
        BEEF_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.STRENGTH, 300, 0), 1.0f).build();
        COOKED_BEEF_RAMEN = createRamen(8, 0.9f, new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0), 1.0f).build();
        BRUTE_RAMEN = createRamen(5, 0.5f, new StatusEffectInstance(StatusEffects.STRENGTH, 300, 1), 1.0f).build();
        COOKED_BRUTE_RAMEN = createRamen(9, 1.0f, new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 1), 1.0f).build();

        // Regeneration
        HERBAL_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f).build();
        COOKED_HERBAL_RAMEN = createRamen(7, 0.8f, new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0), 1.0f).build();
        GOLDENLEAF_RAMEN = createRamen(5, 0.5f, new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f).build();
        COOKED_GOLDENLEAF_RAMEN = createRamen(9, 1.0f, new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1), 1.0f).build();

        // Night Vision
        GLOWBERRY_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0), 1.0f).build();
        COOKED_GLOWBERRY_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1800, 0), 1.0f).build();
        FOX_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 1), 1.0f).build();
        COOKED_FOX_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1800, 1), 1.0f).build();

        // Jump Boost
        RABBIT_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.JUMP_BOOST, 300, 0), 1.0f).build();
        COOKED_RABBIT_RAMEN = createRamen(7, 0.7f, new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1800, 0), 1.0f).build();
        LEAPING_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.JUMP_BOOST, 300, 1), 1.0f).build();
        COOKED_LEAPING_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1800, 1), 1.0f).build();

        // Slow Falling
        FEATHER_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 300, 0), 1.0f).build();
        COOKED_FEATHER_RAMEN = createRamen(7, 0.7f, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1800, 0), 1.0f).build();
        CLOUD_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 300, 1), 1.0f).build();
        COOKED_CLOUD_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1800, 1), 1.0f).build();

        // Fire Resistance
        SPICY_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300, 0), 1.0f).build();
        COOKED_SPICY_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1800, 0), 1.0f).build();
        BLAZING_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300, 1), 1.0f).build();
        COOKED_BLAZING_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1800, 1), 1.0f).build();

        // Water Breathing
        TURTLE_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300, 0), 1.0f).build();
        COOKED_TURTLE_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1800, 0), 1.0f).build();
        DEEPSEA_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300, 1), 1.0f).build();
        COOKED_DEEPSEA_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1800, 1), 1.0f).build();

        // Swiftness
        CARROT_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.SPEED, 300, 0), 1.0f).build();
        COOKED_CARROT_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.SPEED, 1800, 0), 1.0f).build();
        SWIFT_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.SPEED, 300, 1), 1.0f).build();
        COOKED_SWIFT_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.SPEED, 1800, 1), 1.0f).build();

        // Healing
        MEND_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1.0f).build();
        COOKED_MEND_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1.0f).build();
        REVIVE_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1.0f).build();
        COOKED_REVIVE_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1.0f).build();

        // Invisibility
        FAINT_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.INVISIBILITY, 300, 0), 1.0f).build();
        COOKED_FAINT_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.INVISIBILITY, 1800, 0), 1.0f).build();
        GHOST_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.INVISIBILITY, 300, 1), 1.0f).build();
        COOKED_GHOST_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.INVISIBILITY, 1800, 1), 1.0f).build();

        // Resistance
        STONE_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 1.0f).build();
        COOKED_STONE_RAMEN = createRamen(6, 0.6f, new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0), 1.0f).build();
        IRON_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 1), 1.0f).build();
        COOKED_IRON_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 1), 1.0f).build();

        // Extra
        TINKER_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 1.0f).build();
        MINERS_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.HASTE, 1800, 1), 1.0f).build();
        DRIFT_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.LEVITATION, 200, 0), 1.0f).build();
        SHULKER_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.LEVITATION, 400, 1), 1.0f).build();
        LUCKY_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.LUCK, 300, 0), 1.0f).build();
        COOKED_LUCKY_RAMEN = createRamen(8, 0.8f, new StatusEffectInstance(StatusEffects.LUCK, 1800, 0), 1.0f).build();

        // Harming
        BURNED_RAMEN = createRamen(3, 0.3f, new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), 1.0f).build();        

        // Slowness
        THICK_RAMEN = createRamen(2, 0.2f, new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 0), 1.0f).build();

        // WEAKNESS
        SPOILED_RAMEN = createRamen(2, 0.1f, new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 0), 1.0f).build();
        
        // NAUSEA
        MOLDY_RAMEN = createRamen(2, 0.1f, new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1.0f).build();
        
        // POISON
        ROTTEN_RAMEN = createRamen(2, 0.1f, new StatusEffectInstance(StatusEffects.POISON, 200, 0), 1.0f).build();

    }
}