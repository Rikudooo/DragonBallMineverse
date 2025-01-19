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
public class Modelfriezafirst<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelfriezafirst"), "main");
	public final ModelPart Head;
	public final ModelPart Ear;
	public final ModelPart Ear2;
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart ShoulderPadLeft;
	public final ModelPart Tail1;
	public final ModelPart Tail2;
	public final ModelPart Tail3;
	public final ModelPart Tail4;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart ShoulderPadRight;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelfriezafirst(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Ear = this.Head.getChild("Ear");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.ShoulderPadLeft = this.Body.getChild("ShoulderPadLeft");
		this.Tail1 = this.Body.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.bone = this.Tail4.getChild("bone");
		this.bone2 = this.Tail4.getChild("bone2");
		this.ShoulderPadRight = this.Body.getChild("ShoulderPadRight");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Horn_r1 = Head.addOrReplaceChild("Horn_r1", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(15.0F, -28.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Horn_r2 = Head.addOrReplaceChild("Horn_r2", CubeListBuilder.create().texOffs(50, 60).addBox(-20.0F, -28.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Ear = Head.addOrReplaceChild("Ear",
				CubeListBuilder.create().texOffs(18, 10).addBox(4.0F, -29.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10).addBox(4.0F, -29.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(4.0F, -27.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62).addBox(4.0F, -28.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(4.0F, -29.5F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(18, 10).addBox(4.0F, -29.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10).addBox(4.0F, -29.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(4.0F, -27.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62).addBox(4.0F, -28.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(4.0F, -29.5F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 24.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 2.5F));
		PartDefinition ShoulderPadLeft = Body.addOrReplaceChild("ShoulderPadLeft", CubeListBuilder.create().texOffs(0, 32).addBox(4.0F, -25.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition shoulderpad_r1 = ShoulderPadLeft.addOrReplaceChild("shoulderpad_r1", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.0F, -24.0F, 2.0F, 0.0262F, 0.0F, 0.0F));
		PartDefinition shoulderpad_r2 = ShoulderPadLeft.addOrReplaceChild("shoulderpad_r2", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.0F, -24.0F, -2.0F, -0.0175F, 0.0F, 0.0F));
		PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 9.635F, 1.75F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r1 = Tail1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 23).addBox(-0.95F, -1.3575F, -3.7674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0487F, 0.3939F, 5.4566F, -0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 23).addBox(-0.95F, -1.3575F, -3.7674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0487F, 0.3939F, 3.4566F, -0.0087F, 0.0F, 0.0F));
		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.025F, 5.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition cube_r3 = Tail2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 23).addBox(-1.25F, -1.4375F, -0.6163F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.313F, 1.5475F, 0.2482F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 23).addBox(-1.25F, -1.4375F, -0.6163F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.313F, 0.5475F, -1.4838F, -0.5236F, 0.0F, 0.0F));
		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 2.05F, 1.1F));
		PartDefinition cube_r5 = Tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 23).addBox(-1.25F, 3.0625F, -8.1563F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 4.9815F, 9.4892F, -0.925F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 23).addBox(-1.25F, 3.0625F, -8.1563F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 3.3843F, 8.2856F, -0.925F, 0.0F, 0.0F));
		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 8.5844F, -2.8586F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 6.9871F, -1.655F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 5.5718F, -0.9723F, -1.8239F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 3.6355F, -0.4715F, -1.8239F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 23).addBox(-1.25F, 7.7812F, -7.4063F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 7.1884F, 9.2049F, -1.4312F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(46, 23).addBox(-1.25F, 7.7812F, -7.4063F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 5.2079F, 8.9266F, -1.4312F, 0.0F, 0.0F));
		PartDefinition bone = Tail4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -5.075F, -9.1F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0262F, 15.1817F, 5.1378F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9762F, 15.1817F, 5.1378F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 2).addBox(-0.05F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0262F, 15.7335F, 5.8614F, -2.2166F, 0.0F, 0.0F));
		PartDefinition bone2 = Tail4.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.075F, -9.1F));
		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0262F, 16.7789F, 3.9341F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9762F, 16.7789F, 3.9341F, -2.2166F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(9, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 2).addBox(-0.05F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0262F, 17.3308F, 4.6578F, -2.2166F, 0.0F, 0.0F));
		PartDefinition ShoulderPadRight = Body.addOrReplaceChild("ShoulderPadRight", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(4.0F, -25.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-14.0F, 24.0F, 0.0F));
		PartDefinition shoulderpad_r3 = ShoulderPadRight.addOrReplaceChild("shoulderpad_r3", CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, 2.0F, 0.0175F, 0.0F, 0.0F));
		PartDefinition shoulderpad_r4 = ShoulderPadRight.addOrReplaceChild("shoulderpad_r4", CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, -2.0F, -0.0218F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
