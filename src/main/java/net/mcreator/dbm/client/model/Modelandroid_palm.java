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
public class Modelandroid_palm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelandroid_palm"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelandroid_palm(ModelPart root) {
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
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition KiAbsorber = RightArm.addOrReplaceChild("KiAbsorber",
				CubeListBuilder.create().texOffs(60, 61).addBox(-0.3F, -0.5F, -0.6F, 0.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 60).addBox(-0.3F, -0.5F, 0.5F, 0.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.5F, -0.5F, -0.3F, 0.1F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.6F, -0.5F, -0.3F, 0.1F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-0.4F, -0.5F, -0.5F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.4F, -0.5F, 0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.3F, -0.5F, -0.5F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(0.3F, -0.5F, 0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-0.5F, -0.5F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.5F, -0.5F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.4F, -0.5F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(0.4F, -0.5F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 9.55F, 0.0F));
		PartDefinition bone = KiAbsorber.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(61, 50).addBox(-5.7F, -11.95F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50).addBox(-6.4F, -11.95F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50)
						.addBox(-5.7F, -11.95F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50).addBox(-6.4F, -11.95F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 50)
						.addBox(-6.5F, -11.95F, -0.3F, 1.0F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(60, 49).addBox(-6.3F, -11.95F, -0.5F, 0.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.5F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition KiAbsorber2 = LeftArm.addOrReplaceChild("KiAbsorber2",
				CubeListBuilder.create().texOffs(60, 61).addBox(-0.3F, -0.5F, -0.6F, 0.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 60).addBox(-0.3F, -0.5F, 0.5F, 0.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.5F, -0.5F, -0.3F, 0.1F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.6F, -0.5F, -0.3F, 0.1F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-0.4F, -0.5F, -0.5F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.4F, -0.5F, 0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.3F, -0.5F, -0.5F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(0.3F, -0.5F, 0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-0.5F, -0.5F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-0.5F, -0.5F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(0.4F, -0.5F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(0.4F, -0.5F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 9.55F, 0.0F));
		PartDefinition bone2 = KiAbsorber2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(61, 50).addBox(-5.7F, -11.95F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50).addBox(-6.4F, -11.95F, -0.4F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50)
						.addBox(-5.7F, -11.95F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 50).addBox(-6.4F, -11.95F, 0.3F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 50)
						.addBox(-6.5F, -11.95F, -0.3F, 1.0F, 1.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(60, 49).addBox(-6.3F, -11.95F, -0.5F, 0.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.5F, 0.0F));
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
