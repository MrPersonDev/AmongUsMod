package mrperson.amongus.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class SusEffect extends StatusEffect {
    public SusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0xFF1010);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        ((PlayerEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, Integer.MAX_VALUE, 1, false, false));
        ((PlayerEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, Integer.MAX_VALUE, 1, false, false));
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        ((PlayerEntity)entity).removeStatusEffect(StatusEffects.SPEED);
        ((PlayerEntity)entity).removeStatusEffect(StatusEffects.NIGHT_VISION);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity)entity).removeStatusEffect(StatusEffects.BLINDNESS);
        }
    }
}
