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
public class Modelhair_16_ssj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhair_16_ssj"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhair_16_ssj(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hair = Head.addOrReplaceChild("hair", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 58).addBox(-1.131F, -2.0213F, -0.0401F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1605F, -29.9392F, -5.959F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r2 = hair.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 59).addBox(2.0937F, -1.0F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.052F, -32.677F, 0.2535F, -1.9373F, 1.5272F, 0.0F));
		PartDefinition cube_r3 = hair.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 56).addBox(-0.0938F, -1.0F, -3.75F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
				.addBox(-2.0938F, -1.0F, -1.75F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 57).addBox(-4.0938F, -1.0F, -2.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.052F, -32.677F, 0.066F, -1.9373F, 1.5272F, 0.0F));
		PartDefinition cube_r4 = hair.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 59).addBox(-0.3594F, -2.3558F, -0.4097F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7599F, -25.7645F, 4.5305F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5 = hair.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 58).addBox(-2.0938F, -2.45F, -5.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.052F, -25.6145F, 8.0035F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r6 = hair.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 58).addBox(-2.0938F, -2.5F, -5.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.052F, -28.802F, 8.0035F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r7 = hair.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 59).addBox(-0.3594F, -2.3558F, -1.1097F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7599F, -29.327F, 4.5305F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r8 = hair.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(50, 58).addBox(-7.4844F, -0.8558F, -1.0472F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 57).addBox(-3.4844F, -0.8558F, -2.0472F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7599F, -33.202F, -3.407F, -1.3439F, 1.5272F, 0.0F));
		PartDefinition cube_r9 = hair.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(48, 56).addBox(-5.3594F, -0.8558F, -3.0472F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(51, 59).addBox(-1.2969F, -0.8558F, -0.0472F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7599F, -33.202F, -3.2195F, -1.3439F, 1.5272F, 0.0F));
		PartDefinition cube_r10 = hair.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 57).addBox(-0.8185F, -1.2022F, -1.877F, 1.3125F, 1.5625F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1605F, -29.9392F, -5.959F, 0.6632F, 0.0F, 0.0F));
		PartDefinition bone2 = hair.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3651F, -31.7645F, -4.9695F, 0.0F, 0.5672F, 3.0107F));
		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 58).addBox(-0.6719F, -1.1546F, -2.6564F, 1.3125F, 1.5625F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6632F, -0.192F, 0.0F));
		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 58).addBox(-0.9844F, -1.2308F, -1.0472F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, -0.192F, 0.0F));
		PartDefinition bone = hair.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -32.0F, -4.0F, 2.252F, -0.7025F, 1.9336F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 58).addBox(-0.385F, -1.1709F, -2.8002F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4695F, -0.0089F, -0.7707F, -0.0411F, 0.6512F, -0.4756F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 58).addBox(-1.025F, -1.2615F, -1.0053F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4695F, -0.0089F, -0.7707F, -0.6694F, 0.6512F, -0.4756F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
