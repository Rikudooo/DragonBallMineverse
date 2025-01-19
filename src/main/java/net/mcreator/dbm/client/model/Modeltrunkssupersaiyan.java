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
public class Modeltrunkssupersaiyan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modeltrunkssupersaiyan"), "main");
	public final ModelPart Head;
	public final ModelPart Hair;
	public final ModelPart bone13;
	public final ModelPart cube_r1;
	public final ModelPart cube_r2;
	public final ModelPart cube_r3;
	public final ModelPart bone12;
	public final ModelPart bone11;
	public final ModelPart cube_r4;
	public final ModelPart cube_r5;
	public final ModelPart cube_r6;
	public final ModelPart cube_r7;
	public final ModelPart bone10;
	public final ModelPart bone9;
	public final ModelPart bone8;
	public final ModelPart Hair2;
	public final ModelPart cube_r8;
	public final ModelPart cube_r9;
	public final ModelPart Body;
	public final ModelPart bone7;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modeltrunkssupersaiyan(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = this.Head.getChild("Hair");
		this.bone13 = this.Hair.getChild("bone13");
		this.cube_r1 = this.bone13.getChild("cube_r1");
		this.cube_r2 = this.bone13.getChild("cube_r2");
		this.cube_r3 = this.bone13.getChild("cube_r3");
		this.bone12 = this.bone13.getChild("bone12");
		this.bone11 = this.Hair.getChild("bone11");
		this.cube_r4 = this.bone11.getChild("cube_r4");
		this.cube_r5 = this.bone11.getChild("cube_r5");
		this.cube_r6 = this.bone11.getChild("cube_r6");
		this.cube_r7 = this.bone11.getChild("cube_r7");
		this.bone10 = this.bone11.getChild("bone10");
		this.bone9 = this.Hair.getChild("bone9");
		this.bone8 = this.Hair.getChild("bone8");
		this.Hair2 = this.Hair.getChild("Hair2");
		this.cube_r8 = this.Hair2.getChild("cube_r8");
		this.cube_r9 = this.Hair2.getChild("cube_r9");
		this.Body = root.getChild("Body");
		this.bone7 = this.Body.getChild("bone7");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone13 = Hair.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.0F, 0.0F));
		PartDefinition cube_r1 = bone13.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, 3.0F, 0.0F, 0.0F, 2.8362F));
		PartDefinition cube_r2 = bone13.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, 1.0F, 0.0F, 0.0F, 2.7053F));
		PartDefinition cube_r3 = bone13.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, -1.0F, 0.0F, 0.0F, 2.4871F));
		PartDefinition bone12 = bone13.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(39, 1).addBox(-0.2929F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -3.5F, -0.5942F, 0.5484F, 2.228F));
		PartDefinition bone11 = Hair.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(4.0F, -8.0F, 0.0F));
		PartDefinition cube_r4 = bone11.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, -3.0F, 0.0F, 0.0F, -2.9671F));
		PartDefinition cube_r5 = bone11.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 0.0F, -2.618F));
		PartDefinition cube_r6 = bone11.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, 3.0F, 0.0F, 0.0F, -2.9234F));
		PartDefinition cube_r7 = bone11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, 1.0F, 0.0F, 0.0F, -2.8362F));
		PartDefinition bone10 = bone11.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(39, 1).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -3.25F, -0.6353F, -0.4981F, -2.1457F));
		PartDefinition bone9 = Hair.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(39, 1).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -9.0F, -4.0F, 1.2053F, -0.147F, -0.3655F));
		PartDefinition bone8 = Hair.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(39, 1).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.825F, -9.175F, -4.0F, 1.2053F, 0.147F, 0.3655F));
		PartDefinition Hair2 = Hair.addOrReplaceChild("Hair2",
				CubeListBuilder.create().texOffs(39, 1).addBox(-4.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-4.5F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(-4.5F, -8.65F, -3.85F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(3.5F, -8.65F, -3.85F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-1.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(0.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(1.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(2.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-3.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Hair2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 1).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, 4.5F, 2.9671F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Hair2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 1).addBox(-1.25F, -5.0F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -9.0F, 4.5F, 2.9234F, 0.0F, 0.0F));
		PartDefinition cube_r11_r1 = cube_r9.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(39, 1).mirror().addBox(-10.0F, -38.0F, 1.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.25F, 33.0F, -4.5F, -0.0873F, 0.0F, 0.2182F));
		PartDefinition cube_r10_r1 = cube_r9.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(39, 1).addBox(8.0F, -38.0F, 1.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 33.0F, -4.5F, -0.0873F, 0.0F, -0.2182F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone7 = Body.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(58, 49).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 43)
						.addBox(-0.5F, -12.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62).addBox(-0.5F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.25F, -13.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62).addBox(-0.75F, -13.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.75F, -13.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62).addBox(-0.25F, -13.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, 2.0F, 0.0F, 0.0F, -0.7854F));
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
