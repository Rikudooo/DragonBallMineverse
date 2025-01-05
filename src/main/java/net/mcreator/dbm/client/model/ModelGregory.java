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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGregory<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_gregory"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Torso;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Head;

	public ModelGregory(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Torso = root.getChild("Torso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(7, 28).addBox(-0.6F, 3.8F, -1.0F, 1.1F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-0.6F, 1.8F, -0.1F, 1.1F, 2.0F, 1.1F, new CubeDeformation(0.0F)).texOffs(6, 28)
						.addBox(-0.55F, -0.2F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-0.55F, 4.3F, -1.2F, 1.0F, 0.5F, 3.4F, new CubeDeformation(0.0F)),
				PartPose.offset(1.25F, 19.2F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 25).addBox(-0.6F, 2.0F, -0.1F, 1.1F, 2.0F, 1.1F, new CubeDeformation(0.0F)).texOffs(7, 28).addBox(-0.6F, 4.0F, -1.0F, 1.1F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-0.55F, 4.5F, -1.2F, 1.0F, 0.5F, 3.4F, new CubeDeformation(0.0F)).texOffs(6, 28).addBox(-0.55F, 0.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.15F, 19.0F, 0.0F));
		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-1.0F, -0.6F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.9792F, -0.5753F, -0.358F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 20).addBox(-1.1292F, 1.4247F, -0.508F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(1, 21)
						.addBox(-0.6292F, 3.2247F, -0.008F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(1, 21).addBox(-0.6292F, 3.2247F, -0.408F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(1, 21)
						.addBox(-0.6292F, 3.2247F, 0.367F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0208F, 14.5753F, 0.358F));
		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 21).addBox(-0.125F, -0.5F, -0.2F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5042F, 3.5175F, -0.5219F, -0.576F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.0208F, -0.5753F, -0.358F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 16).mirror()
				.addBox(-0.1208F, 1.4247F, -0.508F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 17).mirror().addBox(0.3792F, 3.2247F, -0.008F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 17)
				.mirror().addBox(0.3792F, 3.2247F, -0.408F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 17).mirror().addBox(0.3792F, 3.2247F, 0.367F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0208F, 14.5753F, 0.358F));
		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 17).mirror().addBox(-0.125F, -0.5F, -0.2F, 0.25F, 1.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5042F, 3.5175F, -0.5219F, -0.576F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9F, -3.25F, -1.0F, 3.75F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
				.addBox(0.85F, -3.5F, -1.25F, 1.75F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 4).mirror().addBox(-2.6F, -3.5F, -1.25F, 1.75F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
