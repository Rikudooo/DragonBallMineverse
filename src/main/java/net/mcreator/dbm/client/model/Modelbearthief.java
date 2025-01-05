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
public class Modelbearthief<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelbearthief"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart bone;
	public final ModelPart Head;

	public Modelbearthief(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.bone2 = this.Body.getChild("bone2");
		this.bone3 = this.Body.getChild("bone3");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.bone = this.RightArm.getChild("bone");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 113).addBox(-2.5F, 7.25F, -2.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 14.0F, -1.0F));
		PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 117).addBox(-2.0F, -4.125F, -2.225F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.1948F, 1.2828F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 116).addBox(-2.275F, -3.125F, -3.225F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2783F, 0.8045F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 117).addBox(-2.0F, -4.125F, -2.225F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.4557F, 0.8045F, -0.3927F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-3.5F, 7.25F, -2.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.0F, 14.0F, -1.0F));
		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 117).mirror().addBox(-3.0F, -4.125F, -2.225F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.1948F, 1.2828F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 116).mirror().addBox(-3.725F, -3.125F, -3.225F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.2783F, 0.8045F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 117).mirror().addBox(-3.0F, -4.125F, -2.225F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.4557F, 0.8045F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(7, 7).addBox(-3.0F, 12.2161F, 3.9408F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.7839F, 0.0592F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 38).addBox(-11.0F, -0.4F, -2.975F, 22.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
				.addBox(-11.0F, -0.4F, -2.35F, 22.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(57, 0).addBox(-6.0F, 0.0F, -3.0F, 12.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9752F, -0.9028F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 7).addBox(-3.0F, -0.35F, -0.175F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.1161F, -3.0592F, -0.3883F, 0.0F, 0.0F));
		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(19, 0).addBox(-6.0F, -7.0F, -3.0F, 12.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(-1, 24).mirror()
				.addBox(-6.8F, -0.3F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 24).addBox(5.8F, -0.3F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.2161F, -0.0592F));
		PartDefinition bone3 = Body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 9.2161F, -7.0592F));
		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(27, 17).addBox(0.0F, 0.0F, 7.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 17).addBox(-6.1F, 0.0F, 7.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0742F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 17).addBox(-6.0F, 0.0F, 0.6F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(6.0F, 5.9794F, 0.6611F));
		PartDefinition cube_r11 = LeftArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 14).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 8.5883F, -4.8155F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r12 = LeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 0).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0206F, 0.3389F, -0.3927F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-6.0F, 5.9794F, 0.6611F));
		PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-2.0F, -4.0F, -3.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 7.5534F, -5.1116F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r14 = RightArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-2.0F, -4.0F, -3.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 1.0206F, 0.3389F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone = RightArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-2.0F, 7.5534F, -5.1116F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(108, 126).mirror().addBox(0.2F, 0.0F, -14.525F, 0.05F, 0.5F, 0.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 124).mirror()
						.addBox(0.2F, 0.9F, -16.525F, 0.05F, 1.1F, 2.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(98, 116).mirror().addBox(0.2F, 0.0F, -14.025F, 0.05F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 1)
						.mirror().addBox(-0.25F, -1.0F, -4.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(98, 0).mirror().addBox(-0.25F, 0.0F, -3.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(109, 127).mirror().addBox(-0.025F, -0.2F, -0.975F, 0.05F, 0.7F, 0.725F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.225F, -16.4742F, -8.0292F, -2.3387F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 124).mirror().addBox(-0.025F, -0.5F, -1.25F, 0.05F, 1.0F, 2.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.225F, -15.7603F, -7.6935F, -1.5533F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(-0.1429F, 2.4979F, -0.1858F));
		PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(19, 25).addBox(-0.5F, -12.0F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(-3.0F, -9.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 54)
						.addBox(-2.0F, -6.0F, -6.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1429F, 2.7112F, 1.2422F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-1.25F, -0.85F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.1429F, -4.9505F, -2.4726F, 0.3655F, 0.147F, -0.3655F));
		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 67).addBox(-0.75F, -0.85F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8571F, -4.9505F, -2.4726F, 0.3655F, -0.147F, 0.3655F));
		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(27, 49).addBox(-1.0F, -0.75F, -0.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8571F, 2.2356F, -5.4491F, 0.2443F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
