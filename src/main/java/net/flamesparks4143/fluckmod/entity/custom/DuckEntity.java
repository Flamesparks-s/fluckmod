package net.flamesparks4143.fluckmod.entity.custom;

import net.flamesparks4143.fluckmod.entity.ModEntities;
import net.flamesparks4143.fluckmod.item.ModItems;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DuckEntity extends TameableEntity implements Tameable {
    public static AnimationState sittingAnimationState = new AnimationState();
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private boolean pendingSitAnimation;


    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(DuckEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public DuckEntity(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TameableEntity.TameableEscapeDangerGoal(1.25));
        this.goalSelector.add(2, new SitGoal(this));
        this.goalSelector.add(3, new AnimalMateGoal(this, 1.150));
        this.goalSelector.add(4, new TemptGoal(this, 1.250, Ingredient.ofItems(ModItems.BREAD_SLICE), false));
        this.goalSelector.add(5, new FollowOwnerGoal(this, 1.0, 5.0F, 1.0F));
        this.goalSelector.add(6, new FollowParentGoal(this, 1.10));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.10));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 4.0f));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }
    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20);
    }
    private void setIdleAnimationState() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }
    public void tick() {
        super.tick();
        this.setIdleAnimationState();

        if (this.getWorld().isClient()) {
            this.setIdleAnimationState();
        }
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!this.getWorld().isClient || this.isBaby() && this.isBreedingItem(itemStack)) {
            if (this.isTamed()) {
                if (this.isBreedingItem(itemStack) && this.getHealth() < this.getMaxHealth()) {
                    itemStack.decrementUnlessCreative(1, player);
                    FoodComponent foodComponent = itemStack.get(DataComponentTypes.FOOD);
                    float f = foodComponent != null ? foodComponent.nutrition() : 1.0f;
                    this.heal(2.0f * f);
                    return ActionResult.success(this.getWorld().isClient);
                }
                ActionResult actionResult = super.interactMob(player, hand);
                if (!actionResult.isAccepted() && this.isOwner(player)) {
                    this.setSitting(!this.isSitting());
                    this.jumping = false;
                    this.navigation.stop();
                    this.setTarget(null);
                    return ActionResult.SUCCESS_NO_ITEM_USED;
                } else {
                    return actionResult;
                }

            } else if (itemStack.isOf(ModItems.BREAD_SLICE)) {
                itemStack.decrementUnlessCreative(1, player);
                this.tryTame(player);
                return ActionResult.SUCCESS;
            }
            return super.interactMob(player, hand);
        } else {
            boolean bl = this.isOwner(player) || this.isTamed() || itemStack.isOf(ModItems.BREAD_SLICE) && !this.isTamed();
            return bl ? ActionResult.CONSUME : ActionResult.PASS;
        }

    }

    private ActionResult tryTame(PlayerEntity player) {
        if (this.random.nextInt(3) == 0) {
            this.setOwner(player);
            this.navigation.stop();
            this.setTarget(null);
            this.setSitting(true);
            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_POSITIVE_PLAYER_REACTION_PARTICLES);
        } else {
            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_NEGATIVE_PLAYER_REACTION_PARTICLES);
        }
        if (this.isTamed() && this.isOwner(player)) {
            this.setSitting(!this.isSitting());
            this.getNavigation().stop();
            return ActionResult.SUCCESS;
        }
        return null;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(ModItems.TOAST);
    }

    @Override
    public boolean canBreedWith(AnimalEntity other) {
        if (other == this) {
            return false;
        } else if (!this.isTamed()) {
            return false;
        } else if (!(other instanceof DuckEntity duckEntity)) {
            return false;
        } else if (!duckEntity.isTamed()) {
            return false;
        } else {
            return !duckEntity.isInSittingPose() && this.isInLove() && duckEntity.isInLove();
        }
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        DuckEntity baby = ModEntities.DUCK.create(world);
        DuckVariant variant = Util.getRandom(DuckVariant.values(), this.random);
        assert baby != null;
        baby.setVariant(variant);
        return baby;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(DATA_ID_TYPE_VARIANT, 0);

    }
    public DuckVariant getVariant() {
        return DuckVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }
    private void setVariant(DuckVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
        nbt.putBoolean("isSitting", this.isSitting());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));

    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
                                 @Nullable EntityData entityData) {
        DuckVariant variant = Util.getRandom(DuckVariant.values(), this.random);
        setVariant(variant);
        return super.initialize(world, difficulty, spawnReason, entityData);
    }
    @Override
    public void setSitting(boolean sitting) {
        super.setSitting(sitting);

        this.jumping = false;
        this.navigation.stop();
        setTarget(null);
        if (sitting) {
            setPose(EntityPose.SITTING);
        } else {
            setPose(EntityPose.STANDING);
        }
    }
    @Override
    public void onTrackedDataSet(TrackedData<?> data) {
        if (POSE.equals(data)) {
            if (getPose() == EntityPose.SITTING) {
                this.sittingAnimationState.start(this.age);
            } else {
                this.sittingAnimationState.stop();
            }
        }
        super.onTrackedDataSet(data);
    }
}
