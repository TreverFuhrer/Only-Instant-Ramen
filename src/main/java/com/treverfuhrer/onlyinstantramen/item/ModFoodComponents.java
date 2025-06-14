package com.treverfuhrer.onlyinstantramen.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {

    public static final FoodComponent NOODLES;
    public static final FoodComponent RAMEN;
    public static final FoodComponent COOKED_RAMEN;
    public static final FoodComponent BEEF_RAMEN;
    public static final FoodComponent COOKED_BEEF_RAMEN;


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
        BEEF_RAMEN = createRamen(4, 0.4f, new StatusEffectInstance(StatusEffects.STRENGTH, 300, 0), 1.0f).build();
        COOKED_BEEF_RAMEN = createRamen(9, 1.0f, new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0), 1.0f).build();
    }
}
