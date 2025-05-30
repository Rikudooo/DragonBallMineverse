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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGoku<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_goku"), "main");
	public final ModelPart Head;
	public final ModelPart Hair;
	public final ModelPart Bangs;
	public final ModelPart hairsmall_R2;
	public final ModelPart hairsmall_R1;
	public final ModelPart hairsmall_L2;
	public final ModelPart hairsmall_L1;
	public final ModelPart bone;
	public final ModelPart bone6;
	public final ModelPart bone2;
	public final ModelPart bone5;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone9;
	public final ModelPart bone12;
	public final ModelPart bone10;
	public final ModelPart bone11;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone13;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelGoku(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = this.Head.getChild("Hair");
		this.Bangs = this.Hair.getChild("Bangs");
		this.hairsmall_R2 = this.Bangs.getChild("hairsmall_R2");
		this.hairsmall_R1 = this.Bangs.getChild("hairsmall_R1");
		this.hairsmall_L2 = this.Bangs.getChild("hairsmall_L2");
		this.hairsmall_L1 = this.Bangs.getChild("hairsmall_L1");
		this.bone = this.Hair.getChild("bone");
		this.bone6 = this.Hair.getChild("bone6");
		this.bone2 = this.Hair.getChild("bone2");
		this.bone5 = this.Hair.getChild("bone5");
		this.bone3 = this.Hair.getChild("bone3");
		this.bone4 = this.Hair.getChild("bone4");
		this.bone9 = this.Hair.getChild("bone9");
		this.bone12 = this.bone9.getChild("bone12");
		this.bone10 = this.Hair.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone7 = this.Hair.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone13 = this.Hair.getChild("bone13");
		this.Body = root.getChild("Body");
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
		PartDefinition Bangs = Hair.addOrReplaceChild("Bangs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.25F));
		PartDefinition hairsmall_R2 = Bangs.addOrReplaceChild("hairsmall_R2", CubeListBuilder.create(), PartPose.offset(-1.0F, -8.0F, -3.0F));
		PartDefinition cube_r1 = hairsmall_R2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 56).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, 0.147F, 0.3655F));
		PartDefinition hairsmall_R1 = Bangs.addOrReplaceChild("hairsmall_R1", CubeListBuilder.create(), PartPose.offset(-3.0F, -8.0F, -3.0F));
		PartDefinition cube_r2 = hairsmall_R1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 56).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, 0.147F, 0.3655F));
		PartDefinition hairsmall_L2 = Bangs.addOrReplaceChild("hairsmall_L2", CubeListBuilder.create(), PartPose.offset(3.0F, -8.0F, -3.0F));
		PartDefinition cube_r3 = hairsmall_L2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, -0.147F, -0.3655F));
		PartDefinition hairsmall_L1 = Bangs.addOrReplaceChild("hairsmall_L1", CubeListBuilder.create(), PartPose.offset(1.0F, -8.0F, -3.0F));
		PartDefinition cube_r4 = hairsmall_L1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, -0.147F, -0.3655F));
		PartDefinition bone = Hair.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.325F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 57).addBox(1.5314F, -31.738F, 2.2404F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 56).addBox(1.0512F, -31.5111F, -5.1664F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));
		PartDefinition bone6 = Hair.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, -6.2803F, 2.5721F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r7 = bone6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-3.5314F, -31.738F, 2.2404F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3569F, 30.2803F, -2.9221F, -2.8449F, 1.501F, 3.1416F));
		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 56).mirror().addBox(-4.0512F, -31.5111F, -5.1664F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3569F, 30.2803F, -2.9221F, -3.1067F, 1.501F, -3.1416F));
		PartDefinition bone2 = Hair.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.3F));
		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 57).addBox(1.6904F, -29.5163F, 1.3958F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));
		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 56).addBox(1.0512F, -29.1186F, -5.4164F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));
		PartDefinition bone5 = Hair.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7632F, -3.8946F, 2.7127F, 0.0F, 0.0F, 0.2705F));
		PartDefinition cube_r11 = bone5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-3.6904F, -29.5163F, 1.3958F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5132F, 27.8946F, -3.0127F, -2.8449F, 1.501F, 3.1416F));
		PartDefinition cube_r12 = bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 56).mirror().addBox(-4.0512F, -29.1186F, -5.4164F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5132F, 27.8946F, -3.0127F, -3.1067F, 1.501F, -3.1416F));
		PartDefinition bone3 = Hair.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.2F));
		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 57).addBox(1.6197F, -26.9151F, 1.8127F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));
		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 56).addBox(0.9806F, -26.7702F, -4.6374F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));
		PartDefinition bone4 = Hair.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3607F, -1.552F, 2.6718F, 0.0F, 0.0F, 0.1571F));
		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-3.6197F, -26.9151F, 1.8127F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5107F, 25.552F, -2.8718F, -2.8449F, 1.501F, 3.1416F));
		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 56).mirror().addBox(-3.9806F, -26.7702F, -4.6374F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5107F, 25.552F, -2.8718F, -3.1067F, 1.501F, -3.1416F));
		PartDefinition bone9 = Hair.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-3.1488F, -9.874F, 0.6656F));
		PartDefinition cube_r17 = bone9.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(52, 54).addBox(1.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 54).addBox(2.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1488F, 33.874F, 0.9344F, -3.1067F, 1.5359F, -1.693F));
		PartDefinition bone12 = bone9.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4097F, 1.1231F, 0.0209F, 0.0F, 0.0F, 0.384F));
		PartDefinition cube_r18 = bone12
				.addOrReplaceChild(
						"cube_r18", CubeListBuilder.create().texOffs(56, 58).addBox(0.5827F, -22.9593F, -24.3735F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 57)
								.addBox(0.5827F, -22.9593F, -26.1735F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(0.5827F, -22.9593F, -28.1735F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.739F, 32.7509F, 0.9134F, -2.4784F, 1.5359F, -1.693F));
		PartDefinition cube_r19 = bone12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 57).addBox(-2.173F, -27.3937F, -24.5269F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.739F, 32.7509F, 0.9134F, -0.22F, 1.4517F, 0.3926F));
		PartDefinition bone10 = Hair.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-2.3488F, -9.874F, -1.3343F));
		PartDefinition cube_r20 = bone10
				.addOrReplaceChild(
						"cube_r20", CubeListBuilder.create().texOffs(54, 54).addBox(-0.9034F, -4.5788F, -33.979F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 54)
								.addBox(0.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 54).addBox(2.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.1488F, 33.874F, 0.9343F, -3.1067F, 1.5359F, -1.693F));
		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2097F, 0.7231F, 0.0209F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r21 = bone11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(50, 57).addBox(-2.173F, -27.3937F, -24.5269F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.939F, 33.1509F, 0.9134F, -0.22F, 1.4517F, 0.3926F));
		PartDefinition cube_r22 = bone11.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(54, 57).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0472F, -0.9356F, 0.0236F, -2.4784F, 1.5359F, -1.693F));
		PartDefinition bone7 = Hair.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.7788F, -8.684F, 2.275F));
		PartDefinition cube_r23 = bone7.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 55).addBox(-2.5306F, -3.6672F, -34.7427F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4788F, 32.684F, -2.6749F, -3.1067F, 1.5359F, -1.693F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.073F, -0.6127F, 0.1131F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 57).addBox(-5.4881F, -27.0602F, -24.5531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4058F, 33.2967F, -2.7881F, -0.22F, 1.4517F, 0.3926F));
		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 56).addBox(-2.5145F, -22.5211F, -28.8072F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4058F, 33.2967F, -2.7881F, -2.4784F, 1.5359F, -1.693F));
		PartDefinition bone13 = Hair.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.288F, -7.9401F, 0.3957F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r26 = bone13.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(53, 55).addBox(-2.5534F, -6.4788F, -32.979F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 55).addBox(-1.9034F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(53, 55).addBox(0.0966F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 55).addBox(2.0966F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4816F, 30.9413F, -0.7631F, -3.1067F, 1.5359F, -1.693F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-7.0F, -2.0608F, -2.6946F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.0F, 0.75F));
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
