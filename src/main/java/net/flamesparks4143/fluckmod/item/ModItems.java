package net.flamesparks4143.fluckmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flamesparks4143.fluckmod.FluckMod;

import net.flamesparks4143.fluckmod.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BREAD_SLICE = registerItem("bread_slice", new Item(new Item.Settings().food(ModFoodComponents.BREAD_SLICE)));
    public static final Item TOAST = registerItem("toast", new Item(new Item.Settings().food(ModFoodComponents.TOAST)));
    public static final Item DUCK_SPAWN_EGG = registerItem("duck_spawn_egg",
            new SpawnEggItem(ModEntities.DUCK, 0xF9F8F1, 0xFF7F00, new Item.Settings()));
    public static final Item DUCK_WITCH_SPAWN_EGG = registerItem("duck_witch_spawn_egg",
            new SpawnEggItem(ModEntities.DUCK_WITCH, 0xF9F8Fd1, 0xFF7dF00, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FluckMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        FluckMod.LOGGER.info("Registering Mod Items for " + FluckMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
// other orange color, its a maybe 0xF9B446