package net.flamesparks4143.fluckmod.entity.client;

import net.flamesparks4143.fluckmod.FluckMod;
import net.flamesparks4143.fluckmod.entity.custom.DuckEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class DuckModel <T extends DuckEntity> extends SinglePartEntityModel<T> {
   public static final EntityModelLayer DUCK = new EntityModelLayer(Identifier.of(FluckMod.MOD_ID, "duck"), "main");


    private final ModelPart duck;
    private final ModelPart head;

    public DuckModel(ModelPart root) {
        this.duck = root.getChild("duck");
        this.head = this.duck.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData duck = modelPartData.addChild("duck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, -2.0F));

        ModelPartData head = duck.addChild("head", ModelPartBuilder.create().uv(0, 12).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(32, 13).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.05F))
                .uv(28, 0).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = duck.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-27.0F, -6.0F, -14.0F, 6.0F, 4.0F, 8.0F, new Dilation(0.0001F))
                .uv(36, 0).cuboid(-27.0F, -6.0F, -14.0F, 6.0F, 4.0F, 8.0F, new Dilation(0.05F)), ModelTransform.pivot(24.0F, 7.0F, 13.0F));

        ModelPartData tail = duck.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData cube_r1 = tail.addChild("cube_r1", ModelPartBuilder.create().uv(14, 21).cuboid(-3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -4.0F, 5.0F, 0.5672F, 0.0F, 0.0F));

        ModelPartData left_leg = duck.addChild("left_leg", ModelPartBuilder.create().uv(28, 3).cuboid(-6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 25).cuboid(-6.5F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData right_leg = duck.addChild("right_leg", ModelPartBuilder.create().uv(28, 6).cuboid(-9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 25).cuboid(-9.5F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData left_arm = duck.addChild("left_arm", ModelPartBuilder.create().uv(16, 12).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
                .uv(50, 13).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.05F)), ModelTransform.pivot(3.0F, 1.0F, 3.0F));

        ModelPartData right_arm = duck.addChild("right_arm", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
                .uv(50, 23).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.05F)), ModelTransform.pivot(-3.0F, 1.0F, 3.0F));
        return TexturedModelData.of(modelData, 64, 64);
        }
        @Override
        public void setAngles(DuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngle(netHeadYaw, headPitch);

        this.animateMovement(DuckAnimations.DUCK_WALKING, limbSwing, limbSwingAmount, 2.0f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, DuckAnimations.DUCK_IDLE_1, ageInTicks, 1.0f);
        }
        private void setHeadAngle(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 25.0f);

        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
            duck.render(matrices, vertexConsumer, light, overlay, color);
        }

    @Override
    public ModelPart getPart() {

        return duck;
    }
}
