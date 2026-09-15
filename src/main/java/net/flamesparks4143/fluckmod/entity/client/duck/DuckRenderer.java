package net.flamesparks4143.fluckmod.entity.client;

import com.google.common.collect.Maps;
import net.flamesparks4143.fluckmod.FluckMod;
import net.flamesparks4143.fluckmod.entity.custom.DuckEntity;
import net.flamesparks4143.fluckmod.entity.custom.DuckVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class DuckRenderer extends MobEntityRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final Map<DuckVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DuckVariant.class), map -> {
               map.put(DuckVariant.DEFAULT,
                       Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/duck.png"));
               map.put(DuckVariant.MALLARD,
                       Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/mallard_duck.png"));
               map.put(DuckVariant.RUDDY,
                       Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/ruddy_duck.png"));
               map.put(DuckVariant.SCOTER,
                       Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/black_scoter_duck.png"));
               map.put(DuckVariant.TEAL,
                       Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/cinnamon_teal_duck.png"));
            });

    private static final Identifier MISSING = Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/missing_texture_duck.png");
    private static final Identifier SCULK = Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/sculk_duck.png");
    private static final Identifier THE_CRUSTADER = Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/the_crustader.png");
    private static final Identifier LEMONSKYRYAN = Identifier.of(FluckMod.MOD_ID, "textures/entity/duck/lemonskyryan_duck.png");

    public DuckRenderer(EntityRendererFactory.Context context) {
        super(context, new DuckModel<>(context.getPart(DuckModel.DUCK)), 0.3f);
    }

    @Override
    public Identifier getTexture(DuckEntity duckEntity) {
        if (duckEntity.hasCustomName()){
            String string = Formatting.strip(duckEntity.getName().getString());
            if ("Missing".equals(string)){
                return MISSING;
            }
            if ("Sculk".equals(string)){
                return SCULK;
            }
            if ("The Crustader".equals(string)){
                return THE_CRUSTADER;
            }
            if ("LemonSkyDuck".equals(string)){
                return LEMONSKYRYAN;
            }
        }
        return LOCATION_BY_VARIANT.get(duckEntity.getVariant());
    }

    @Override
    public void render(DuckEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
