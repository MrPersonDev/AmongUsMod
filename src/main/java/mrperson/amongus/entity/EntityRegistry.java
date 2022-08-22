package mrperson.amongus.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class EntityRegistry {
    public static final EntityType<Imposter> IMPOSTER = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("amongus", "imposter"),
		FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Imposter::new).dimensions(EntityDimensions.fixed(0.5F, 0.9F)).build()
	);

	public static void init() {
		FabricDefaultAttributeRegistry.register(IMPOSTER, Imposter.createAttributes());
		SpawnRestriction.register(IMPOSTER, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Imposter::canSpawn);
	}
}
