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
public class ModelKingCold<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_king_cold"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelKingCold(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -34.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(100, 70).addBox(-8.0F, -3.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Head_r3 = Head_r1.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(100, 70).addBox(-3.0218F, -10.016F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2021F, -0.1416F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(100, 70).addBox(-2.0F, -3.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Head_r4 = Head_r2.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(100, 70).addBox(-4.0F, -10.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(32, 32).addBox(-8.0F, -8.0F, -4.0F, 16.0F, 30.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 75).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
								.addBox(8.0F, -8.0F, -4.0F, 4.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 64).mirror().addBox(-12.0F, -8.0F, -4.0F, 4.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offset(0.0F, -22.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(26, 200).addBox(-36.0F, -56.0F, 14.5F, 56.0F, 56.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 47.6675F, 0.4426F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 4.0F));
		PartDefinition Body_r1 = bone.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(208, 12).addBox(-3.0F, -1.0F, 32.0F, 6.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(174, 16).addBox(-4.0F, -2.0F, 14.0F, 8.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -4.0F, -1.4399F, 0.0F, 0.0F));
		PartDefinition bone2 = Body
				.addOrReplaceChild(
						"bone2", CubeListBuilder.create().texOffs(0, 180).addBox(-28.0F, -54.0F, -5.0F, 22.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 180).addBox(-28.0F, -54.0F, 5.0F, 22.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(2, 164).addBox(-28.0F, -56.0F, -5.0F, 22.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 186).addBox(-6.0F, -56.0F, -5.0F, 2.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 46.0F, 0.0F));
		PartDefinition bone3 = Body.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 181).mirror().addBox(6.0F, -54.0F, -5.0F, 22.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 180).mirror()
						.addBox(6.0F, -54.0F, 5.0F, 22.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 164).mirror().addBox(6.0F, -56.0F, -5.0F, 22.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 186).mirror()
						.addBox(4.0F, -56.0F, -5.0F, 2.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 46.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(80, 32).addBox(-8.0F, -6.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, -24.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(64, 96).addBox(0.0F, -6.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, -24.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 96).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 128).addBox(-3.6F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(3.8F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
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
