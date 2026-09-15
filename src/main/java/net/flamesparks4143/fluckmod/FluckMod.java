package net.flamesparks4143.fluckmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.flamesparks4143.fluckmod.entity.ModEntities;
import net.flamesparks4143.fluckmod.entity.custom.DuckEntity;
import net.flamesparks4143.fluckmod.entity.custom.DuckWitchEntity;
import net.flamesparks4143.fluckmod.item.ModItems;
import net.flamesparks4143.fluckmod.item.ModItemsGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FluckMod implements ModInitializer {
	public static final String MOD_ID = "fluckmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();

		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.DUCK, DuckEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DUCK_WITCH, DuckWitchEntity.createAttributes());
	}
}
