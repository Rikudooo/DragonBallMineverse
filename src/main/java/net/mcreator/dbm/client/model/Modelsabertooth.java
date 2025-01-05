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
public class Modelsabertooth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelsabertooth"), "main");
	public final ModelPart Body2;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg2;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Head;

	public Modelsabertooth(ModelPart root) {
		this.Body2 = root.getChild("Body2");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-5.5F, -5.469F, 4.3326F, 11.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -4.031F, 0.1674F, 9.0F, 8.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.3436F, 4.4115F, -7.7168F));
		PartDefinition tail = Body2.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.1436F, -0.4115F, 26.7168F));
		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(81, 85).addBox(30.2316F, -4.0398F, -1.91F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3464F, 2.355F, 14.7562F, 1.1002F, -0.0003F, 0.0087F));
		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 13).addBox(30.2317F, -3.6037F, -1.6615F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3254F, 0.1468F, 9.0141F, 1.3097F, -0.0003F, 0.0087F));
		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 62).addBox(30.232F, -2.8872F, -0.824F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3226F, 0.0441F, 2.8973F, 1.554F, -0.0003F, 0.0087F));
		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(102, 63).addBox(29.7201F, 12.8139F, -0.8591F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 13).addBox(30.2287F, 7.0196F, -0.5132F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3795F, 5.9726F, 19.8567F, 0.6464F, -0.0003F, 0.0087F));
		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 0).addBox(30.2287F, 1.1923F, -1.1644F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3795F, 5.9726F, 19.8567F, 0.7337F, -0.0003F, 0.0087F));
		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 35).addBox(30.2316F, 1.7508F, -1.7694F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.3464F, 2.355F, 14.7562F, 0.9955F, -0.0003F, 0.0087F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(4.0F, 4.0F, 15.0F));
		PartDefinition cube_r2 = LeftLeg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(26.5821F, -7.7935F, -5.3367F, 5.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.5208F, 5.0313F, -0.0313F, -0.488F, 0.0F, 0.0F));
		PartDefinition cube_r3 = LeftLeg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 75).addBox(42.461F, -5.9624F, 1.8292F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.2705F, 13.0762F, -6.8073F, 0.7162F, -0.0003F, 0.0087F));
		PartDefinition cube_r4 = LeftLeg2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(74, 91).addBox(43.5085F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 91).addBox(44.9403F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(24, 91).addBox(45.9816F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 76).addBox(43.5085F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 90)
						.addBox(44.9403F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 17).addBox(45.9816F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 88)
						.addBox(44.8102F, -5.5667F, -3.5179F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.4479F, 18.1563F, 2.6203F, 0.0181F, -0.0003F, 0.0087F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offset(-6.8F, 4.0F, 15.0F));
		PartDefinition cube_r7 = RightLeg2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-31.5821F, -7.7935F, -5.3367F, 5.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(27.5208F, 5.0313F, -0.0313F, -0.488F, 0.0F, 0.0F));
		PartDefinition cube_r14 = RightLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-47.461F, -5.9624F, 1.8292F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(43.2705F, 13.0762F, -6.8073F, 0.7162F, 0.0003F, -0.0087F));
		PartDefinition cube_r15 = RightLeg2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-45.5085F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 91).mirror()
						.addBox(-46.9403F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 91).mirror().addBox(-47.9816F, -1.5667F, -6.6418F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(90, 76).mirror().addBox(-45.5085F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 90).mirror()
						.addBox(-46.9403F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 17).mirror().addBox(-47.9816F, -1.5667F, -4.8196F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(66, 88).mirror().addBox(-46.8102F, -5.5667F, -3.5179F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(43.4479F, 18.1563F, 2.6203F, 0.0181F, 0.0003F, -0.0087F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(6.1034F, 6.5956F, -2.7459F));
		PartDefinition cube_r6_r1 = LeftLeg.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(76, 8).addBox(-1.0F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3157F, 9.8848F, -3.908F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7_r1 = LeftLeg.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(52, 67).addBox(-2.5F, -5.5F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3157F, 0.1152F, -0.092F, -0.3534F, 0.0F, 0.0F));
		PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(85, 9).addBox(-1.0116F, -0.9997F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 36).addBox(-2.1133F, -1.0015F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(76, 78).addBox(0.1598F, -0.9997F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 26).addBox(0.1598F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 75)
						.addBox(-0.8815F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 75).addBox(-2.3133F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2777F, 15.9021F, -7.7857F, 0.0181F, -0.0003F, 0.0087F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-8.8034F, 6.5956F, -2.7459F));
		PartDefinition cube_r7_r2 = RightLeg.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-1.0F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3157F, 9.8848F, -3.908F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8_r1 = RightLeg.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-2.5F, -5.5F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3157F, 0.1152F, -0.092F, -0.3534F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.9884F, -0.9997F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 36).mirror()
						.addBox(0.1133F, -1.0015F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 78).mirror().addBox(-2.1598F, -0.9997F, -0.0889F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(76, 26).mirror().addBox(-2.1598F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 75).mirror()
						.addBox(-1.1185F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 75).mirror().addBox(0.3133F, -0.9997F, -1.9111F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2777F, 15.9021F, -7.7857F, 0.0181F, 0.0003F, -0.0087F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 62).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3675F, 3.8186F, -7.9543F));
		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(59, 35).addBox(26.3155F, -23.3116F, -15.4893F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(49, 0).addBox(27.7381F, -17.354F, -21.7371F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
						.texOffs(37, 35).addBox(26.3631F, -19.3116F, -22.5181F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(26, 62).addBox(29.4519F, -19.7021F, -22.5181F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(27.7598F, -19.3116F, -22.5181F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(49, 13).addBox(31.0139F, -19.3116F, -22.5181F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
						.addBox(25.0775F, -18.4005F, -15.4893F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-30.1329F, 20.1814F, 7.9543F));
		PartDefinition Head_r1 = Head2.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(113, 32).addBox(-0.5625F, -12.8125F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(114, 32).addBox(5.8125F, -12.8125F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(26.6389F, -12.3116F, -33.0181F, -1.5882F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head2.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(113, 32).addBox(-0.5625F, -12.8125F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(114, 32).addBox(5.8125F, -12.8125F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(26.6389F, -14.3116F, -33.0181F, -1.5882F, 0.0F, 0.0F));
		PartDefinition Head_r3 = Head2.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(111, 30).addBox(-0.5625F, -12.8125F, -0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(112, 30).addBox(5.8125F, -12.8125F, -0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.6389F, -18.3116F, -33.0181F, -1.5882F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
