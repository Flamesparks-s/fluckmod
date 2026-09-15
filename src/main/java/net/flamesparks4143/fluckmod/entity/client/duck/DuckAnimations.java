package net.flamesparks4143.fluckmod.entity.client;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class DuckAnimations {
	public static final Animation DUCK_SITTING = Animation.Builder.create(1.1667F)
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.build();

    public static final Animation DUCK_IDLE_1 = Animation.Builder.create(1.4167F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation DUCK_WALKING = Animation.Builder.create(2.0F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.9583F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.9583F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation DUCK_RUNNING = Animation.Builder.create(1.3333F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.6F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation DUCK_FALLING = Animation.Builder.create(1.3333F).looping()
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -55.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();
}

