package mrperson.amongus.entity;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class Imposter extends ZombieEntity {
    public Imposter(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return ZombieEntity.createZombieAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 24.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 16.0D);
    }

    public static boolean canSpawn(EntityType<Imposter> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        if (pos.getY() > 0) return false;
        if (world.getLightLevel(pos) != 0) return false;
        if (random.nextBoolean()) return false;

        return canMobSpawn(type, world, spawnReason, pos, random);
    }

    protected boolean burnsInDaylight() {
        return false;
    }

    // protected SoundEvent getAmbientSound() {
    //     return AmongUs.TESTENTITY_AMBIENT_EVENT;
    // }

    // protected SoundEvent getHurtSound(DamageSource source) {
    //     return AmongUs.TESTENTITY_HURT_EVENT;
    // }

    // protected SoundEvent getDeathSound() {
    //     return AmongUs.TESTENTITY_DEAD_EVENT;
    // }

    // protected SoundEvent getStepSound() {
    //     return Testing.TESTENTITY_STEP_EVENT;
    // }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 0.8F;
    }
}