package net.flamesparks4143.fluckmod.entity.client.duck_witch;

import net.flamesparks4143.fluckmod.FluckMod;
import net.flamesparks4143.fluckmod.entity.custom.DuckWitchEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class DuckWitchModel <T extends DuckWitchEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer DUCK_WITCH = new EntityModelLayer(Identifier.of(FluckMod.MOD_ID, "duck_witch"), "main");
    private final ModelPart bone;
    private final ModelPart head;
    private final ModelPart hat;
    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart left_leg;
    private final ModelPart right_leg;
    private final ModelPart left_arm;
    private final ModelPart right_arm;

    public DuckWitchModel(ModelPart root) {
        this.bone = root.getChild("bone");
        this.head = this.bone.getChild("head");
        this.hat = this.head.getChild("hat");
        this.body = this.bone.getChild("body");
        this.tail = this.bone.getChild("tail");
        this.left_leg = this.bone.getChild("left_leg");
        this.right_leg = this.bone.getChild("right_leg");
        this.left_arm = this.bone.getChild("left_arm");
        this.right_arm = this.bone.getChild("right_arm");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, -2.0F));

        ModelPartData head = bone.addChild("head", ModelPartBuilder.create().uv(0, 19).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(22, 28).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData hat = head.addChild("hat", ModelPartBuilder.create().uv(0, 12).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.05F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r1 = hat.addChild("cube_r1", ModelPartBuilder.create().uv(14, 28).cuboid(-2.0F, -1.5F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.05F)), ModelTransform.of(1.0F, -4.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData cube_r2 = hat.addChild("cube_r2", ModelPartBuilder.create().uv(24, 12).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.05F)), ModelTransform.of(0.0F, -3.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        ModelPartData body = bone.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-27.0F, -6.0F, -14.0F, 6.0F, 4.0F, 8.0F, new Dilation(0.0001F)), ModelTransform.pivot(24.0F, 7.0F, 13.0F));

        ModelPartData tail = bone.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData cube_r3 = tail.addChild("cube_r3", ModelPartBuilder.create().uv(28, 0).cuboid(-3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -4.0F, 5.0F, 0.5672F, 0.0F, 0.0F));

        ModelPartData left_leg = bone.addChild("left_leg", ModelPartBuilder.create().uv(30, 18).cuboid(-6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 4).cuboid(-6.5F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData right_leg = bone.addChild("right_leg", ModelPartBuilder.create().uv(30, 21).cuboid(-9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 8).cuboid(-9.5F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 5.0F, 2.0F));

        ModelPartData left_arm = bone.addChild("left_arm", ModelPartBuilder.create().uv(16, 19).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 1.0F, 3.0F));

        ModelPartData right_arm = bone.addChild("right_arm", ModelPartBuilder.create().uv(0, 27).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 1.0F, 3.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public ModelPart getPart() {
        return bone;
    }

    @Override
    public void setAngles(DuckWitchEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngle(netHeadYaw, headPitch);

        this.animateMovement(DuckWitchAnimations.animation_walking, limbSwing, limbSwingAmount, 2.0f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, DuckWitchAnimations.animation_idle, ageInTicks, 1.0f);
    }
    private void setHeadAngle(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 25.0f);

        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        bone.render(matrices, vertexConsumer, light, overlay, color);
    }
}
