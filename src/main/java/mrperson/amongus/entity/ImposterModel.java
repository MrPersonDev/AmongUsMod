package mrperson.amongus.entity;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ImposterModel extends EntityModel<Imposter> {
	private final ModelPart bb_main;
	public ImposterModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(24, 9).cuboid(-3.5F, -3.0F, -2.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 18).cuboid(0.5F, -3.0F, -2.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -10.0F, -3.0F, 8.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-3.5F, -14.0F, -2.5F, 7.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(12, 25).cuboid(-3.0F, -13.0F, -3.5F, 6.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 0).cuboid(-2.5F, -15.0F, -1.5F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 22).cuboid(-2.0F, -13.0F, 2.5F, 4.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);}
	@Override
	public void setAngles(Imposter entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}