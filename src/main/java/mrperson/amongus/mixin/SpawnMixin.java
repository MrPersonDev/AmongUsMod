package mrperson.amongus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import mrperson.amongus.entity.EntityRegistry;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class SpawnMixin {
    @Inject(method = "addCaveMobs", at = @At("TAIL"))
	private static void addTestEntity(SpawnSettings.Builder builder, CallbackInfo ci) {
		builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityRegistry.IMPOSTER, 100, 1, 3));
	}
}
