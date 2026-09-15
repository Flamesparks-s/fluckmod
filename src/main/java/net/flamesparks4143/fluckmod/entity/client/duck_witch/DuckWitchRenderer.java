package net.flamesparks4143.fluckmod.entity.client.duck_witch;

import net.flamesparks4143.fluckmod.FluckMod;
import net.flamesparks4143.fluckmod.entity.custom.DuckWitchEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DuckWitchRenderer extends MobEntityRenderer<DuckWitchEntity, DuckWitchModel<DuckWitchEntity>> {
    public DuckWitchRenderer(EntityRendererFactory.Context context) {
        super(context, new DuckWitchModel<>(context.getPart(DuckWitchModel.DUCK_WITCH)), 0.3f);
    }

    @Override
    public Identifier getTexture(DuckWitchEntity entity) {
        return Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/witch_duck.png");
    }
}
