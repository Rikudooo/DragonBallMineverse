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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelspacepod<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelspacepod"), "main");
	public final ModelPart Body;
	public final ModelPart SpacePod;
	public final ModelPart Seat;
	public final ModelPart Casing;
	public final ModelPart Door;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelspacepod(ModelPart root) {
		this.Body = root.getChild("Body");
		this.SpacePod = this.Body.getChild("SpacePod");
		this.Seat = this.SpacePod.getChild("Seat");
		this.Casing = this.SpacePod.getChild("Casing");
		this.Door = this.SpacePod.getChild("Door");
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
		PartDefinition SpacePod = Body.addOrReplaceChild("SpacePod", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition Seat = SpacePod.addOrReplaceChild("Seat",
				CubeListBuilder.create().texOffs(0, 63).addBox(-14.0F, -11.0F, 4.0F, 12.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(74, 0).addBox(-2.0F, -14.0F, 4.0F, 3.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-17.0F, -14.0F, 4.0F, 3.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(80, 6).addBox(-17.0F, -26.0F, 10.0F, 3.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 6)
						.addBox(-2.0F, -26.0F, 10.0F, 3.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(6, 69).addBox(-14.0F, -23.0F, 10.0F, 12.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 11)
						.addBox(-17.0F, -26.0F, 18.0F, 18.0F, 24.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 2.0F, -8.0F));
		PartDefinition Casing = SpacePod.addOrReplaceChild("Casing",
				CubeListBuilder.create().texOffs(384, 65).addBox(-16.0F, 48.0F, -16.0F, 32.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(384, 0).addBox(-16.0F, 16.0F, -16.0F, 32.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(446, 33)
						.addBox(-16.0F, 17.0F, 15.0F, 32.0F, 31.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 450).addBox(-16.0F, 17.0F, -16.0F, 1.0F, 31.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.0F, 17.0F, -16.0F, 1.0F, 31.0F, 31.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition Door = SpacePod.addOrReplaceChild("Door",
				CubeListBuilder.create().texOffs(361, 483).addBox(-15.0F, 44.0F, -16.0F, 30.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(349, 488).addBox(-15.0F, 21.0F, -16.0F, 5.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(424, 488)
						.addBox(10.0F, 21.0F, -16.0F, 5.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(454, 488).addBox(-10.0F, 21.0F, -16.0F, 2.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(454, 488)
						.addBox(8.0F, 21.0F, -16.0F, 2.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 488).addBox(-8.0F, 21.0F, -16.0F, 16.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(478, 492)
						.addBox(-8.0F, 23.0F, -16.0F, 16.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 488).addBox(-8.0F, 42.0F, -16.0F, 16.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(362, 488)
						.addBox(-15.0F, 17.0F, -16.0F, 30.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
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
