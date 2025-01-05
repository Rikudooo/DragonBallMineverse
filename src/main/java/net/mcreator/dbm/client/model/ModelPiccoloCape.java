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
public class ModelPiccoloCape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_piccolo_cape"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public ModelPiccoloCape(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition piccolocape = Body.addOrReplaceChild("piccolocape",
				CubeListBuilder.create().texOffs(96, 39).addBox(-5.0F, -24.5F, 3.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 21).addBox(-10.0F, -24.5F, -3.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(3.0F, -24.5F, -3.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(79, 26).addBox(-4.0F, -24.5F, 2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 26)
						.addBox(-4.0F, -24.5F, -3.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(103, 31).addBox(-4.0F, -24.625F, -4.25F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(103, 31)
						.addBox(3.9F, -24.625F, -4.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 32).addBox(-4.975F, -24.625F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(-5.0F, -24.625F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 31).addBox(-2.0F, -22.75F, -4.25F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(87, 40)
						.addBox(-9.0F, -23.5F, -3.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 35).addBox(-5.0F, -22.5F, -3.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 35)
						.addBox(-3.0F, -21.5F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 35).addBox(-2.0F, -20.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body_r1 = piccolocape.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(75, 43).addBox(-9.0F, 0.5F, 0.0F, 18.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.5F, 2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Body_r2 = piccolocape.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(104, 32).addBox(-1.5F, -1.225F, 4.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32).addBox(-1.5F, -1.225F, -5.025F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.4F, -2.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition antenna2 = Head.addOrReplaceChild("antenna2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1134F, -7.9647F, -5.0879F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r1 = Ears.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(53, 43).addBox(-0.425F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8249F, 0.274F, 0.2849F));
		PartDefinition head_r2 = Ears.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(53, 43).addBox(-0.25F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8702F, 0.3897F, 0.4233F));
		PartDefinition Ears2 = Head.addOrReplaceChild("Ears2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r3 = Ears2.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.575F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8249F, -0.274F, -0.2849F));
		PartDefinition head_r4 = Ears2.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.75F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8702F, -0.3897F, -0.4233F));
		PartDefinition turban = Head.addOrReplaceChild("turban",
				CubeListBuilder.create().texOffs(50, 8).addBox(-4.1F, -9.0F, -4.2F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 1).addBox(1.1F, -9.0F, -4.2F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 1)
						.addBox(1.1F, -9.0F, 0.175F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 9).addBox(-1.5F, -8.0F, -4.2F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-1.1F, -8.85F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11).addBox(-0.7F, -8.85F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-0.9F, -8.85F, 3.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11).addBox(-1.1F, -8.85F, 3.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.5F, -8.85F, -0.825F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(-1.1F, -9.0F, 0.15F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-0.9F, -9.0F, 0.15F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(0.95F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.75F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(-3.95F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-3.95F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(0.95F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.75F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(-1.1F, -9.0F, -4.175F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-0.9F, -9.0F, -4.175F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59).addBox(-1.5F, -9.0F, -2.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.5F, -8.85F, -3.225F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 11).addBox(-1.5F, -8.0F, -0.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 9)
						.addBox(-1.5F, -8.0F, 0.175F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 11).addBox(-4.1F, -9.0F, -0.2F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 11)
						.addBox(1.1F, -9.0F, -0.35F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 8).addBox(-4.1F, -9.0F, 0.175F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
