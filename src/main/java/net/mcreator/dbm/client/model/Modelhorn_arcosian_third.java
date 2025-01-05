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
public class Modelhorn_arcosian_third<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhorn_arcosian_third"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhorn_arcosian_third(ModelPart root) {
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
		PartDefinition ArmThingy = Body.addOrReplaceChild("ArmThingy",
				CubeListBuilder.create().texOffs(19, 10).addBox(4.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10).addBox(-6.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10)
						.addBox(6.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10).addBox(8.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10)
						.addBox(10.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10).addBox(-8.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10)
						.addBox(-10.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 10).addBox(-12.0F, -25.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = Horns.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.2F, 0.1F, 0.0F));
		PartDefinition Horn_r1 = bone.addOrReplaceChild("Horn_r1", CubeListBuilder.create().texOffs(25, 27).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5648F, -31.9884F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Horn_r2 = bone.addOrReplaceChild("Horn_r2", CubeListBuilder.create().texOffs(23, 27).mirror().addBox(15.0F, -28.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone2 = Horns.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.1F, 0.0F));
		PartDefinition Horn_r3 = bone2.addOrReplaceChild("Horn_r3", CubeListBuilder.create().texOffs(25, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5648F, -31.9884F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Horn_r4 = bone2.addOrReplaceChild("Horn_r4", CubeListBuilder.create().texOffs(23, 27).addBox(-17.0F, -28.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition bone3 = Horns.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.2F, 1.1F, 7.0F));
		PartDefinition Horn_r5 = bone3.addOrReplaceChild("Horn_r5", CubeListBuilder.create().texOffs(23, 27).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7361F, -33.387F, 1.3536F, 1.5708F, 0.7854F, 1.9635F));
		PartDefinition Horn_r6 = bone3.addOrReplaceChild("Horn_r6", CubeListBuilder.create().texOffs(23, 27).addBox(-20.0F, -28.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition bone4 = Horns.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.2F, 1.1F, 7.0F));
		PartDefinition Horn_r7 = bone4.addOrReplaceChild("Horn_r7", CubeListBuilder.create().texOffs(23, 27).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.7361F, -33.387F, 1.3536F, 1.5708F, -0.7854F, -1.9635F));
		PartDefinition Horn_r8 = bone4.addOrReplaceChild("Horn_r8", CubeListBuilder.create().texOffs(23, 27).mirror().addBox(15.0F, -28.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition LargeHead = Head.addOrReplaceChild("LargeHead", CubeListBuilder.create(), PartPose.offset(2.0F, 24.0F, 0.0F));
		PartDefinition LargeHead2 = LargeHead.addOrReplaceChild("LargeHead2",
				CubeListBuilder.create().texOffs(16, 7).addBox(-5.0F, -28.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -31.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-4.0F, -30.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-4.0F, -27.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-4.0F, -27.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-4.0F, -30.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-3.0F, -30.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -28.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -28.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -28.0F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -28.0F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-3.0F, -27.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-3.0F, -30.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-3.0F, -27.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-5.0F, -31.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -31.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -31.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -31.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -31.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-1.0F, -32.0F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -32.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -27.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -27.0F, 4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -27.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-1.0F, -27.0F, 8.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -28.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition bone5 = LargeHead.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(16, 7).addBox(-5.0F, -28.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -32.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-5.0F, -32.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -28.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone7 = LargeHead.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(16, 7).addBox(-5.0F, -28.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -32.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-5.0F, -32.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -28.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition bone6 = LargeHead.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(16, 7).addBox(-5.0F, -28.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -32.0F, 8.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-5.0F, -32.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-5.0F, -28.0F, 4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 0.0F));
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
