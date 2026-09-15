package net.flamesparks4143.fluckmod.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BREAD_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().nutrition(5).saturationModifier(0.75f)
            .build();

}
