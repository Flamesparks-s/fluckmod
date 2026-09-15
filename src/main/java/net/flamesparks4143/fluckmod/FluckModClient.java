package net.flamesparks4143.fluckmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.flamesparks4143.fluckmod.entity.ModEntities;
import net.flamesparks4143.fluckmod.entity.client.duck.DuckModel;
import net.flamesparks4143.fluckmod.entity.client.duck.DuckRenderer;
import net.flamesparks4143.fluckmod.entity.client.duck_witch.DuckWitchModel;
import net.flamesparks4143.fluckmod.entity.client.duck_witch.DuckWitchRenderer;


public class FluckModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(DuckModel.DUCK, DuckModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DUCK, DuckRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(DuckWitchModel.DUCK_WITCH, DuckWitchModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DUCK_WITCH, DuckWitchRenderer::new);
    }
}
