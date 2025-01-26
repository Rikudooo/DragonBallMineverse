package net.mcreator.dbm.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMajinBuu<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_majin_buu"), "main");
	public final ModelPart legL;
	public final ModelPart legR;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart armL;
	public final ModelPart armR;

	public ModelMajinBuu(ModelPart root) {
		this.legL = root.getChild("legL");
		this.legR = root.getChild("legR");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.armL = root.getChild("armL");
		this.armR = root.getChild("armR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legL = partdefinition.addOrReplaceChild("legL",
				CubeListBuilder.create().texOffs(44, 61).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 45).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-1.5F, 6.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(-1.0F, 7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 16.0F, 0.0F));
		PartDefinition legR = partdefinition.addOrReplaceChild("legR",
				CubeListBuilder.create().texOffs(44, 61).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 45).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-1.5F, 6.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(-1.0F, 7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 16.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 13).addBox(-7.0F, 5.5F, -1.5F, 14.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.5F, 3.5F, -2.0F, 15.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-2.5F, 5.5F, -2.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-7.0F, 1.5F, -1.5F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-6.0F, -2.5F, -0.5F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 21).addBox(-6.0F, -2.5F, -0.5F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(38, 13)
						.addBox(-6.0F, -3.0F, -1.0F, 12.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-6.0F, -3.0F, -1.0F, 12.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-8.0F, -3.0F, 10.0F, 16.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.5F, -3.5F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(56, 53).addBox(-4.0F, 4.25F, -6.25F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 45).addBox(-4.0F, 4.25F, -6.25F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -10.25F, 2.25F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.25F, -4.25F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 3.75F, -2.3562F, 0.0F, 0.0F));
		PartDefinition armL = partdefinition.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 3.0F, 0.0F));
		PartDefinition armR = partdefinition.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(28, 61).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 3.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
