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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfriezasecond<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelfriezasecond"), "main");
	public final ModelPart Head;
	public final ModelPart Ear;
	public final ModelPart Ear2;
	public final ModelPart Head2;
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart Tail1;
	public final ModelPart Tail2;
	public final ModelPart Tail3;
	public final ModelPart Tail4;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelfriezasecond(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Ear = this.Head.getChild("Ear");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Head2 = this.Head.getChild("Head2");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.Tail1 = this.Body.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.bone = this.Tail4.getChild("bone");
		this.bone2 = this.Tail4.getChild("bone2");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition Ear = Head.addOrReplaceChild("Ear",
				CubeListBuilder.create().texOffs(66, 49).addBox(8.0F, -59.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 49).addBox(8.0F, -59.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 49)
						.addBox(8.0F, -55.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(117, 123).addBox(8.0F, -57.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 49)
						.addBox(8.0F, -59.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 48.0F, 0.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(59, 48).addBox(8.0F, -59.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 48).addBox(8.0F, -59.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 48)
						.addBox(8.0F, -55.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 124).addBox(8.0F, -57.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 48)
						.addBox(8.0F, -59.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.0F, 48.0F, 0.0F));
		PartDefinition Head2 = Head.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Horn_r1 = Head2.addOrReplaceChild("Horn_r1",
				CubeListBuilder.create().texOffs(104, 120).addBox(-11.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 120).addBox(-5.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.673F, -21.273F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Horn_r2 = Head2.addOrReplaceChild("Horn_r2",
				CubeListBuilder.create().texOffs(104, 120).addBox(-11.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 120).addBox(-5.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.673F, -21.273F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Horn_r3 = Head2.addOrReplaceChild("Horn_r3", CubeListBuilder.create().texOffs(100, 120).mirror().addBox(30.0F, -57.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 48.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Horn_r4 = Head2.addOrReplaceChild("Horn_r4", CubeListBuilder.create().texOffs(100, 120).addBox(-40.0F, -57.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 48.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 32).addBox(-8.0F, 0.0F, -4.0F, 16.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 5.0F));
		PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.04F, 19.27F, 3.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r1 = Tail1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 46).addBox(-1.9F, -2.7149F, -7.5348F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0975F, 0.7877F, 10.9133F, -0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 46).addBox(-1.9F, -2.7149F, -7.5348F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0975F, 0.7877F, 6.9133F, -0.0087F, 0.0F, 0.0F));
		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, 10.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition cube_r3 = Tail2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 46).addBox(-2.5F, -2.875F, -1.2327F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.626F, 3.0951F, 0.4965F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 46).addBox(-2.5F, -2.875F, -1.2327F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.626F, 1.0951F, -2.9676F, -0.5236F, 0.0F, 0.0F));
		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 4.1F, 2.2F));
		PartDefinition cube_r5 = Tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 46).addBox(-2.5F, 6.125F, -16.3125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5025F, 9.9631F, 18.9784F, -0.925F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 46).addBox(-2.5F, 6.125F, -16.3125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5025F, 6.7685F, 16.5712F, -0.925F, 0.0F, 0.0F));
		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0F, 6.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 17.1688F, -5.7172F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(92, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 13.9742F, -3.31F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 11.1436F, -1.9446F, -1.8239F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 7.271F, -0.9431F, -1.8239F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 46).addBox(-2.5F, 15.5625F, -14.8125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5025F, 14.3768F, 18.4098F, -1.4312F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 46).addBox(-2.5F, 15.5625F, -14.8125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5025F, 10.4157F, 17.8531F, -1.4312F, 0.0F, 0.0F));
		PartDefinition bone = Tail4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -10.15F, -18.2F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 3).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0525F, 30.3633F, 10.2755F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 5).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9525F, 30.3633F, 10.2755F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(18, 5).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 5).addBox(-0.1F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0525F, 31.467F, 11.7228F, -2.2166F, 0.0F, 0.0F));
		PartDefinition bone2 = Tail4.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -10.15F, -18.2F));
		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 6).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0525F, 33.5579F, 7.8683F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 6).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9525F, 33.5579F, 7.8683F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(18, 5).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 5).addBox(-0.1F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0525F, 34.6615F, 9.3155F, -2.2166F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(80, 32).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -20.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(64, 96).addBox(-2.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, -20.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 96).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(3.8F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
