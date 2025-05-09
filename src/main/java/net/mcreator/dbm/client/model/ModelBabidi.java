package net.mcreator.dbm.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBabidi<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_babidi"), "main");
	public final ModelPart bb_main;

	public ModelBabidi(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -1.0F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 15)
						.addBox(-1.5F, -12.0F, -6.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-3.5F, -17.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-4.0F, -10.0F, -3.0F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.5F, -15.0F, -5.0F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-5.5F, -10.75F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 53).addBox(3.5F, -10.75F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(3.5F, -10.75F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 53).addBox(-5.5F, -10.75F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-4.5F, -14.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 53).addBox(3.5F, -14.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-4.5F, -14.75F, 2.25F, 9.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 53).addBox(-4.75F, -9.75F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(2.25F, -9.75F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 53).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 2.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(23, 1).addBox(-3.5F, -1.4468F, -0.1785F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 1).addBox(-3.5F, -0.4468F, 0.8215F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.75F, -3.75F, -0.6632F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 0).addBox(-5.25F, 1.25F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -11.5F, -6.25F, 0.0F, 0.0F, -2.4871F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 0).addBox(-2.5F, -0.25F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -11.5F, -6.25F, 0.0F, 0.0F, -0.7418F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 4.0F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -10.0F, -0.5F, 0.7418F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
