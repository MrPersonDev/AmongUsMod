package mrperson.amongus.entity;

import mrperson.amongus.AmongUsClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ImposterRenderer extends MobEntityRenderer<Imposter, ImposterModel> {
    public ImposterRenderer(EntityRendererFactory.Context context) {
        super(context, new ImposterModel(context.getPart(AmongUsClient.IMPOSTER_LAYER)), 0.7F);
    }

    public Identifier getTexture(Imposter entity) {
        return new Identifier("amongus", "textures/entity/imposter/imposter.png");
    }
}
