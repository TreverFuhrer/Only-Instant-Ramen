// package com.treverfuhrer.onlyinstantramen.item;

// import java.util.List;
// import java.util.Locale;

// import com.treverfuhrer.onlyinstantramen.OnlyInstantRamen;

// import net.minecraft.component.ComponentType;
// import net.minecraft.component.type.FoodComponent;
// import net.minecraft.component.type.FoodComponent.StatusEffectEntry;
// import net.minecraft.entity.effect.StatusEffectInstance;
// import net.minecraft.item.Item;
// import net.minecraft.item.ItemStack;
// import net.minecraft.item.tooltip.TooltipType;
// import net.minecraft.registry.Registries;
// import net.minecraft.registry.Registry;
// import net.minecraft.text.Text;
// import net.minecraft.util.Identifier;
// import net.minecraft.util.Pair;

// public class TooltipRamenItem extends Item {

//     public TooltipRamenItem(Settings settings) {
//         super(settings);
//     }

//     @Override
//     public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
//         super.appendTooltip(stack, context, tooltip, type);

//         stack.getItem().get

//         FoodComponent food = stack.getItem().getComponents().get(ComponentType.);
//         if (food != null) {
//             for (StatusEffectEntry entry : food.effects()) {
//                 StatusEffectInstance inst = entry.effect();
//                 // translate the effect name:
//                 Text name = Text.translatable(inst.getEffectType().getKey().toString());
//                 int level = inst.getAmplifier() + 1;
//                 // use vanilla “potion.withAmplifier” formatting, e.g. “Strength II”
//                 tooltip.add(Text.translatable("potion.withAmplifier", name, Text.literal(Integer.toString(level))));
//             }
//         }
//     }

//     public static Item registerRamen(String name, FoodComponent component) {
//         return Registry.register(
//             Registries.ITEM,
//             Identifier.of(OnlyInstantRamen.MOD_ID, name),
//             new TooltipRamenItem(new Item.Settings().maxCount(1).food(component))
//         );
//     }
    
// }
