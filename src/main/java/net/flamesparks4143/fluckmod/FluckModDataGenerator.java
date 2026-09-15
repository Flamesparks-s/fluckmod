package net.flamesparks4143.fluckmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.flamesparks4143.fluckmod.datagen.ModItemTagProvider;
import net.flamesparks4143.fluckmod.datagen.ModModelProvider;
import net.flamesparks4143.fluckmod.datagen.ModRecipeProvider;

public class FluckModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
