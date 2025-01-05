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
public class ModelNorthKaio<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_north_kaio"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Torso;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Head;

	public ModelNorthKaio(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Torso = root.getChild("Torso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(112, 119).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 123).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 21.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 119).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 119).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 21.0F, 0.0F));
		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(50, 24).addBox(-8.5F, -11.0F, -1.0F, 17.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 24).addBox(-8.5F, -11.3625F, -1.0007F, 17.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 4)
						.addBox(-8.5F, -6.0F, -5.5F, 17.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(54, 12).addBox(-8.5F, -6.0F, 3.0F, 17.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition cube_r1_r1 = Torso.addOrReplaceChild("cube_r1_r1", CubeListBuilder.create().texOffs(5, 47).addBox(-8.5F, -17.3F, -12.725F, 17.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0696F, -2.3723F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone3 = Torso.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-10.65F, -11.35F, 2.05F));
		PartDefinition cube_r6_r1 = bone3.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-3.5F, 0.0F, -2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(20.85F, 1.975F, -2.1F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r7_r1 = bone3.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-3.5F, 0.0F, -2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(20.85F, 1.975F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone = bone3.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(87, 11).addBox(-3.0F, 0.0F, -2.1F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(87, 11)
				.addBox(-3.0F, 0.0F, -0.9F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(87, 11).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(21.3F, 0.0F, 0.0F));
		PartDefinition bone2 = Torso.addOrReplaceChild(
				"bone2", CubeListBuilder.create().texOffs(87, 11).mirror().addBox(-3.0F, 0.0F, -2.1F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(87, 11).mirror()
						.addBox(-3.0F, 0.0F, -0.9F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(87, 11).mirror().addBox(-3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-10.65F, -11.35F, 2.05F));
		PartDefinition cube_r8_r1 = bone2.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-3.5F, 0.0F, -2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 1.975F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r5_r1 = bone2.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-3.5F, 0.0F, -2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 1.975F, -2.1F, 1.5708F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(112, 17).addBox(-3.5F, -3.0F, 0.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 9.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -3.0F, -1.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 9.0F, 1.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -6.3F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
				.addBox(-3.5F, -7.3F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 15).addBox(-3.0F, -8.3F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 1.0F));
		PartDefinition EAr_r1 = Head.addOrReplaceChild("EAr_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.25F, -1.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.3F, 0.0F, -0.2607F, -0.7769F, -0.6013F));
		PartDefinition EAr_r2 = Head.addOrReplaceChild("EAr_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, -1.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.3F, 0.0F, -0.2607F, 0.7769F, 0.6013F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 8.0F));
		PartDefinition cube_r8_r2 = cube_r6.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(21, -8).mirror().addBox(2.0F, -3.0F, -5.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -14.3F, -14.5F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r7_r2 = cube_r6.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(21, -8).addBox(-2.0F, -3.0F, -5.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -14.3F, -14.5F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
