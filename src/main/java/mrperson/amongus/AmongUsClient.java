package mrperson.amongus;

import mrperson.amongus.entity.EntityRegistry;
import mrperson.amongus.entity.ImposterModel;
import mrperson.amongus.entity.ImposterRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class AmongUsClient implements ClientModInitializer {
    public static final EntityModelLayer IMPOSTER_LAYER = new EntityModelLayer(new Identifier("amongus", "imposter"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityRegistry.IMPOSTER, (context) -> {
            return new ImposterRenderer(context);
        });
        
        EntityModelLayerRegistry.registerModelLayer(IMPOSTER_LAYER, ImposterModel::getTexturedModelData);
    }
}
