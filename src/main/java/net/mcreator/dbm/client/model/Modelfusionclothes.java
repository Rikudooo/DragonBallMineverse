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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfusionclothes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelfusionclothes"), "main");
	public final ModelPart Body;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelfusionclothes(ModelPart root) {
		this.Body = root.getChild("Body");
		this.bone = this.Body.getChild("bone");
		this.bone2 = this.Body.getChild("bone2");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 9)
				.addBox(-5.75F, -1.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 9).mirror().addBox(3.75F, -1.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(4, 9).mirror().addBox(-9.25F, -25.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-13.25F, -25.0F, 1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(5, 10).mirror().addBox(-9.75F, -24.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 9).mirror().addBox(-9.05F, -25.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(11.25F, 24.0F, 0.5F));
		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(4, 9).addBox(8.25F, -25.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
				.addBox(8.75F, -24.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 9).addBox(8.05F, -25.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.25F, 24.0F, 0.5F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
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
