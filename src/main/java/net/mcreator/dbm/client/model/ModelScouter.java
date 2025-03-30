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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelScouter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_scouter"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart Scouter;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelScouter(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Scouter = this.Head.getChild("Scouter");
		this.bone = this.Scouter.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
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
		PartDefinition Scouter = Head.addOrReplaceChild("Scouter", CubeListBuilder.create(), PartPose.offset(0.0F, 23.5F, -1.3F));
		PartDefinition cube_r1 = Scouter.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 2).addBox(0.775F, -0.85F, -0.25F, 0.45F, 1.7F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1684F, -28.0F, -1.9816F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = Scouter.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 2).addBox(-0.225F, -0.85F, -0.35F, 0.45F, 1.7F, 0.575F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4818F, -28.0F, -2.8F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone = Scouter.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(19, 0).addBox(4.0F, -29.5F, -1.85F, 0.25F, 3.0F, 2.2F, new CubeDeformation(0.0F)).texOffs(1, 11).addBox(4.35F, -28.35F, -2.2F, 0.35F, 0.7F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 4)
						.addBox(4.25F, -28.35F, -2.2F, 0.35F, 0.7F, 0.6F, new CubeDeformation(0.0F)).texOffs(9, 3).addBox(4.25F, -28.85F, -2.8F, 0.55F, 1.7F, 0.6F, new CubeDeformation(0.0F)).texOffs(10, 4)
						.addBox(4.25F, -28.85F, -2.2F, 0.55F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(10, 4).addBox(4.25F, -27.65F, -2.2F, 0.55F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 1)
						.addBox(4.2F, -29.25F, -1.6F, 0.7F, 2.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 2).addBox(4.2F, -29.25F, -0.5F, 0.7F, 2.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(9, 3)
						.addBox(4.2F, -29.25F, -1.0F, 0.7F, 0.4F, 0.5F, new CubeDeformation(0.0F)).texOffs(8, 3).addBox(4.2F, -27.15F, -1.0F, 0.7F, 0.4F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(1, 6).addBox(4.25F, -28.5F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 6).addBox(4.25F, -28.1F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 6)
						.addBox(4.25F, -27.7F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 6).addBox(4.25F, -27.3F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 6)
						.addBox(4.25F, -28.9F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(2, 1).addBox(4.25F, -28.7F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(4.25F, -28.3F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(4.25F, -27.9F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(4.25F, -27.5F, -0.4F, 0.55F, 0.2F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.6F));
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
