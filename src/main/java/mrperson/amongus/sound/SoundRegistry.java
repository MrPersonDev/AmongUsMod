package mrperson.amongus.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundRegistry {
    public static final Identifier IMPOSTER_AMBIENT_ID = new Identifier("amongus:imposter_ambient");
	public static final Identifier IMPOSTER_DEAD_ID = new Identifier("amongus:imposter_dead");
	public static final Identifier IMPOSTER_HURT_ID = new Identifier("amongus:imposter_hurt");
	public static final Identifier IMPOSTER_STEP_ID = new Identifier("amongus:imposter_step");

	public static SoundEvent IMPOSTER_AMBIENT_EVENT = new SoundEvent(IMPOSTER_AMBIENT_ID);
	public static SoundEvent IMPOSTER_DEAD_EVENT = new SoundEvent(IMPOSTER_DEAD_ID);
	public static SoundEvent IMPOSTER_HURT_EVENT = new SoundEvent(IMPOSTER_HURT_ID);
	public static SoundEvent IMPOSTER_STEP_EVENT = new SoundEvent(IMPOSTER_STEP_ID);

    public static void init() {
        Registry.register(Registry.SOUND_EVENT, IMPOSTER_AMBIENT_ID, IMPOSTER_AMBIENT_EVENT);
		Registry.register(Registry.SOUND_EVENT, IMPOSTER_DEAD_ID, IMPOSTER_DEAD_EVENT);
		Registry.register(Registry.SOUND_EVENT, IMPOSTER_HURT_ID, IMPOSTER_HURT_EVENT);
		Registry.register(Registry.SOUND_EVENT, IMPOSTER_STEP_ID, IMPOSTER_STEP_EVENT);
    }
}
