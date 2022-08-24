package mrperson.amongus.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EffectRegistry {
    public static final StatusEffect SUS = new SusEffect();

    public static void init() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("amongus", "sus"), SUS);
    }
}
