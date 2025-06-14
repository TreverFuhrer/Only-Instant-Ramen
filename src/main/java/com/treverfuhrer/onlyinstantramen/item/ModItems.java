package com.treverfuhrer.onlyinstantramen.item;

import com.treverfuhrer.onlyinstantramen.OnlyInstantRamen;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {

    private ModItems() {}
 
    // Items
    public static final Item NOODLES = register("noodles", 
        new Item(new Item.Settings().maxCount(1).food(ModFoodComponents.NOODLES)));

    public static final Item DEFAULT_RAMEN = register("default_ramen", 
        new Item(new Item.Settings().maxCount(1).food(ModFoodComponents.DEFAULT_RAMEN)));

    public static final Item BEEF_RAMEN = register("beef_ramen", 
        new Item(new Item.Settings().maxCount(1).food(ModFoodComponents.BEEF_RAMEN)));
 

    // Helper
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyInstantRamen.MOD_ID, name), item);
    }
 
    public static void initialize() {
        OnlyInstantRamen.LOGGER.info("Registering Mod Items for " + OnlyInstantRamen.MOD_ID);
    }
}
