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

    public static final Item BEEF_RAMEN = registerRamen("beef_ramen", ModFoodComponents.BEEF_RAMEN);
    public static final Item COOKED_BEEF_RAMEN = registerRamen("cooked_beef_ramen", ModFoodComponents.COOKED_BEEF_RAMEN);
 
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
            content.add(ModItems.NOODLES);
            content.add(ModItems.RAMEN);
            content.add(ModItems.COOKED_RAMEN);
            content.add(ModItems.BEEF_RAMEN);
            content.add(ModItems.COOKED_BEEF_RAMEN);
        });
    }
 
    // Initialize on startup
    public static void initialize() {
        OnlyInstantRamen.LOGGER.info("Registering Mod Items for " + OnlyInstantRamen.MOD_ID);
        registerToVanillaItemGroups();
    }
}
