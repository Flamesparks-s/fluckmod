package net.flamesparks4143.fluckmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flamesparks4143.fluckmod.FluckMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public static final ItemGroup FLUCK_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FluckMod.MOD_ID, "fluck_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BREAD_SLICE))
                    .displayName(Text.translatable("itemgroup.fluckmod.fluck_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BREAD_SLICE);
                        entries.add(ModItems.TOAST);
                        entries.add(ModItems.DUCK_SPAWN_EGG);
                        entries.add(ModItems.DUCK_WITCH_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups() {
        FluckMod.LOGGER.info("Registering Item Groups for" + FluckMod.MOD_ID);
    }
}
