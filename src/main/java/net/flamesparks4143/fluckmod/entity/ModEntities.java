package net.flamesparks4143.fluckmod.entity;

import net.flamesparks4143.fluckmod.FluckMod;
import net.flamesparks4143.fluckmod.entity.custom.DuckEntity;
import net.flamesparks4143.fluckmod.entity.custom.DuckWitchEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<DuckEntity> DUCK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(FluckMod.MOD_ID, "duck"),
            EntityType.Builder.create(DuckEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.4f, 0.8f).build());

    public static final EntityType<DuckWitchEntity> DUCK_WITCH = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(FluckMod.MOD_ID, "duck_witch"),
            EntityType.Builder.create(DuckWitchEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.4f, 0.8f).build());



    public static void registerModEntities() {
        FluckMod.LOGGER.info("Registering Mod Entities for " + FluckMod.MOD_ID);
    }
}
