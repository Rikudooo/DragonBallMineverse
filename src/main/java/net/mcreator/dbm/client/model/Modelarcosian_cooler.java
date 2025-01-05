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
public class Modelarcosian_cooler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelarcosian_cooler"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelarcosian_cooler(ModelPart root) {
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
		PartDefinition Cooler = Head.addOrReplaceChild("Cooler",
				CubeListBuilder.create().texOffs(16, 11).addBox(0.0F, -30.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.0F, -31.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -31.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-3.5F, -32.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(1.5F, -32.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.5F, -33.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.5F, -33.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.5F, -34.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(2.0F, -34.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-2.5F, -34.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -34.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.0F, -35.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -35.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-1.0F, -36.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -36.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.0F, -36.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(2.0F, -38.0F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(2.0F, -39.5F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -38.0F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-3.0F, -39.5F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.0F, -36.0F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(2.0F, -36.0F, -4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-5.0F, -33.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(3.0F, -33.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-2.0F, -30.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_r1 = Cooler.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-3.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror()
						.addBox(-3.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror().addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9393F, -31.6464F, -3.75F, 0.0F, 0.0F, -0.7854F));
		PartDefinition head_r2 = Cooler.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(16, 11).addBox(1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9393F, -31.6464F, -3.75F, 0.0F, 0.0F, 0.7854F));
		PartDefinition head_r3 = Cooler.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(16, 11).addBox(-4.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-3.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0761F, -31.6173F, -3.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition head_r4 = Cooler.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror()
				.addBox(1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0761F, -31.6173F, -3.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition head_r5 = Cooler.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-3.25F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror()
						.addBox(-3.25F, 0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror().addBox(-2.25F, 0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 11).mirror()
						.addBox(-1.25F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.3499F, -33.61F, -3.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition head_r6 = Cooler.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(16, 11).addBox(0.25F, 0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(1.25F, 0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(1.25F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-0.75F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3499F, -33.61F, -3.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
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
