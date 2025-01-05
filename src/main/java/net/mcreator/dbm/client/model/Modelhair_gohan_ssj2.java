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
public class Modelhair_gohan_ssj2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhair_gohan_ssj_2"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhair_gohan_ssj2(ModelPart root) {
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
		PartDefinition hair2 = Head.addOrReplaceChild("hair2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition mainhair2 = hair2.addOrReplaceChild("mainhair2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0937F, -32.7203F, 1.5961F, 1.0996F, 0.0F, 0.0F));
		PartDefinition cube_r1 = mainhair2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 121).addBox(-1.232F, -2.244F, -1.232F, 2.464F, 3.124F, 2.464F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2477F, -1.2572F, -4.0261F, -0.2148F, 0.0385F, 0.1747F));
		PartDefinition cube_r2 = mainhair2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(115, 121).addBox(-0.594F, -4.818F, -0.893F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2477F, -1.2572F, -4.0261F, -0.4595F, -0.0332F, 0.0301F));
		PartDefinition cube_r3 = mainhair2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(115, 121).addBox(-1.32F, -0.704F, 1.42F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.76F, -6.8123F, -1.8227F, -0.7869F, -0.173F, -0.2628F));
		PartDefinition cube_r4 = mainhair2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(115, 121).addBox(-0.968F, -1.958F, -0.4575F, 1.936F, 2.398F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7863F, -1.2572F, -5.7861F, -0.2967F, 0.0F, -0.1745F));
		PartDefinition cube_r5 = mainhair2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(115, 121).addBox(-0.88F, -0.66F, -0.396F, 1.76F, 2.002F, 1.76F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1057F, -1.6972F, -6.0061F, -0.2084F, -0.2738F, 0.8816F));
		PartDefinition cube_r6 = mainhair2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(115, 121).addBox(-0.4403F, 0.4169F, -1.3369F, 1.76F, 2.464F, 1.76F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1727F, -4.6075F, -2.6147F, -0.4762F, 0.2037F, 0.5307F));
		PartDefinition cube_r7 = mainhair2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(115, 121).addBox(-0.409F, -1.264F, -0.9043F, 1.364F, 2.464F, 1.364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1727F, -4.6075F, -2.6147F, -0.7807F, 0.0193F, 0.1913F));
		PartDefinition cube_r8 = mainhair2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 121).addBox(0.0009F, -2.518F, -1.0682F, 1.1F, 1.87F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1727F, -4.6075F, -2.6147F, -1.0822F, -0.1581F, 0.0102F));
		PartDefinition cube_r9 = mainhair2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(115, 121).addBox(0.1814F, -3.4739F, -1.9398F, 1.584F, 3.19F, 1.584F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4719F, -2.5137F, 0.9853F, -1.4759F, -0.8127F, -0.9686F));
		PartDefinition cube_r10 = mainhair2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(115, 121).addBox(-0.5398F, -1.7845F, -1.5666F, 1.804F, 3.52F, 1.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4719F, -2.5137F, 0.9853F, -1.115F, -0.4757F, -0.7237F));
		PartDefinition cube_r11 = mainhair2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(115, 121).addBox(-0.3711F, 0.3571F, -1.9842F, 2.2F, 3.52F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4719F, -2.5137F, 0.9853F, -0.7306F, -0.1701F, -0.5759F));
		PartDefinition cube_r12 = mainhair2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(115, 121).addBox(-1.496F, -1.056F, 0.176F, 1.584F, 3.19F, 1.584F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1878F, -6.0539F, 0.9312F, -1.2748F, -0.5494F, -0.8827F));
		PartDefinition cube_r13 = mainhair2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(115, 121).addBox(-1.012F, -4.378F, -1.65F, 1.804F, 3.52F, 1.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6663F, -3.0172F, -3.1461F, -0.8795F, -0.2628F, -0.5957F));
		PartDefinition cube_r14 = mainhair2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(115, 121).addBox(-1.672F, -1.76F, -1.1F, 2.2F, 3.52F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6663F, -3.0172F, -3.1461F, -0.4756F, 0.0F, -0.384F));
		PartDefinition cube_r15 = mainhair2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(115, 121).addBox(-0.7473F, -1.1697F, -1.2983F, 1.848F, 2.442F, 1.848F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5597F, -2.9751F, -2.3371F, -0.8929F, 0.2711F, -0.6666F));
		PartDefinition cube_r16 = mainhair2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(115, 121).addBox(-0.5508F, 0.2537F, -1.6371F, 2.156F, 2.552F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5597F, -2.9751F, -2.3371F, -0.3374F, 0.47F, -0.4836F));
		PartDefinition cube_r17 = mainhair2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(115, 121).addBox(-0.2283F, -2.754F, -1.3045F, 1.584F, 2.442F, 1.584F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5597F, -2.9751F, -2.3371F, -1.1046F, -0.0398F, -0.9092F));
		PartDefinition cube_r18 = mainhair2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(115, 121).addBox(-0.286F, -0.737F, -0.55F, 1.584F, 2.442F, 1.584F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6723F, -4.3892F, -0.2524F, -1.0846F, 0.3499F, 0.8887F));
		PartDefinition cube_r19 = mainhair2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(115, 121).addBox(-0.352F, -3.212F, -2.068F, 1.848F, 2.442F, 1.848F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0197F, -2.0052F, -3.1461F, -0.948F, 0.0348F, 0.6488F));
		PartDefinition cube_r20 = mainhair2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(115, 121).addBox(-0.044F, -1.672F, -1.54F, 2.156F, 2.552F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7337F, -2.1372F, -3.1461F, -0.4482F, -0.1774F, 0.4948F));
		PartDefinition cube_r21 = mainhair2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(115, 121).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3523F, -1.6868F, 2.3882F, 1.1612F, -1.0735F, -1.0575F));
		PartDefinition cube_r22 = mainhair2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(115, 121).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3523F, -1.6868F, 2.3882F, 1.6181F, -1.3008F, -1.568F));
		PartDefinition cube_r23 = mainhair2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(115, 121).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3523F, -1.6868F, 2.3882F, -2.9845F, -1.2535F, 3.0399F));
		PartDefinition cube_r24 = mainhair2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(115, 121).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0393F, -2.5897F, 2.3882F, 1.1224F, -0.7201F, -1.0562F));
		PartDefinition cube_r25 = mainhair2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(115, 121).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0393F, -2.5897F, 2.3882F, 1.2649F, -0.9743F, -1.272F));
		PartDefinition cube_r26 = mainhair2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(115, 121).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0393F, -2.5897F, 2.3882F, 2.0228F, -1.2897F, -2.0398F));
		PartDefinition cube_r27 = mainhair2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(115, 121).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8519F, -2.5897F, 2.3882F, 2.0228F, 1.2897F, 2.0398F));
		PartDefinition cube_r28 = mainhair2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(115, 121).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8519F, -2.5897F, 2.3882F, 1.2649F, 0.9743F, 1.272F));
		PartDefinition cube_r29 = mainhair2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(115, 121).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8519F, -2.5897F, 2.3882F, 1.1224F, 0.7201F, 1.0562F));
		PartDefinition cube_r30 = mainhair2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(115, 121).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9903F, -2.2095F, 2.3882F, 0.4406F, 1.4829F, 0.4479F));
		PartDefinition cube_r31 = mainhair2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(115, 121).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9903F, -2.2095F, 2.3882F, 0.7208F, 1.054F, 0.7845F));
		PartDefinition cube_r32 = mainhair2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(115, 121).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9903F, -2.2095F, 2.3882F, 0.7251F, 0.7636F, 0.7636F));
		PartDefinition cube_r33 = mainhair2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(115, 121).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1777F, -2.2095F, 2.3882F, 0.4406F, -1.4829F, -0.4479F));
		PartDefinition cube_r34 = mainhair2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(115, 121).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1777F, -2.2095F, 2.3882F, 0.7208F, -1.054F, -0.7845F));
		PartDefinition cube_r35 = mainhair2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(115, 121).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1777F, -2.2095F, 2.3882F, 0.7251F, -0.7636F, -0.7636F));
		PartDefinition cube_r36 = mainhair2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5472F, -0.5051F, 1.2617F, -0.0115F, -0.9028F, -0.2367F));
		PartDefinition cube_r37 = mainhair2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5472F, -0.5051F, 1.2617F, -0.3826F, -1.0926F, 0.1765F));
		PartDefinition cube_r38 = mainhair2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5472F, -0.5051F, 1.2617F, -1.1959F, -1.0768F, 1.1356F));
		PartDefinition cube_r39 = mainhair2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1712F, 3.2129F, 1.2617F, 0.0337F, -1.159F, -0.1502F));
		PartDefinition cube_r40 = mainhair2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1712F, 3.2129F, 1.2617F, -0.7346F, -1.3208F, 0.6336F));
		PartDefinition cube_r41 = mainhair2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1712F, 3.2129F, 1.2617F, -1.7471F, -1.0836F, 1.7502F));
		PartDefinition cube_r42 = mainhair2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0152F, 3.2349F, 1.5697F, -0.8715F, -0.832F, 0.7739F));
		PartDefinition cube_r43 = mainhair2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0152F, 3.2349F, 1.5697F, -1.1985F, -0.7899F, 1.1931F));
		PartDefinition cube_r44 = mainhair2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0152F, 3.2349F, 1.5697F, -1.4467F, -0.5515F, 1.6622F));
		PartDefinition cube_r45 = mainhair2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9838F, 3.2129F, 1.2617F, 0.0337F, 1.159F, 0.1502F));
		PartDefinition cube_r46 = mainhair2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9838F, 3.2129F, 1.2617F, -0.7346F, 1.3208F, -0.6336F));
		PartDefinition cube_r47 = mainhair2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9838F, 3.2129F, 1.2617F, -1.7471F, 1.0836F, -1.7502F));
		PartDefinition cube_r48 = mainhair2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8278F, 3.2349F, 1.5697F, -1.4467F, 0.5515F, -1.6622F));
		PartDefinition cube_r49 = mainhair2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8278F, 3.2349F, 1.5697F, -1.1985F, 0.7899F, -1.1931F));
		PartDefinition cube_r50 = mainhair2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8278F, 3.2349F, 1.5697F, -0.8715F, 0.832F, -0.7739F));
		PartDefinition cube_r51 = mainhair2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6878F, 0.9909F, 1.2617F, 1.4157F, 1.1263F, 1.5158F));
		PartDefinition cube_r52 = mainhair2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6878F, 0.9909F, 1.2617F, 2.0684F, 1.2767F, 2.2324F));
		PartDefinition cube_r53 = mainhair2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(115, 121).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9903F, -0.1424F, 1.5804F, -3.0064F, 1.1271F, -2.8291F));
		PartDefinition cube_r54 = mainhair2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5318F, 1.2549F, 1.5697F, -2.4279F, 0.9333F, -2.3272F));
		PartDefinition cube_r55 = mainhair2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5318F, 1.2549F, 1.5697F, -2.7109F, 1.3586F, -2.5784F));
		PartDefinition cube_r56 = mainhair2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5318F, 1.2549F, 1.5697F, 1.2219F, 1.4731F, 1.3263F));
		PartDefinition cube_r57 = mainhair2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7192F, 1.2549F, 1.5697F, -2.4279F, -0.9333F, 2.3272F));
		PartDefinition cube_r58 = mainhair2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7192F, 1.2549F, 1.5697F, -2.7109F, -1.3586F, 2.5784F));
		PartDefinition cube_r59 = mainhair2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7192F, 1.2549F, 1.5697F, 1.2219F, -1.4731F, -1.3263F));
		PartDefinition cube_r60 = mainhair2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(115, 121).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1777F, -0.1424F, 1.5804F, -3.0064F, -1.1271F, 2.8291F));
		PartDefinition cube_r61 = mainhair2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8752F, 0.9909F, 1.2617F, 2.0684F, -1.2767F, -2.2324F));
		PartDefinition cube_r62 = mainhair2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8752F, 0.9909F, 1.2617F, 1.4157F, -1.1263F, -1.5158F));
		PartDefinition cube_r63 = mainhair2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8872F, 2.0029F, 1.2617F, -0.5799F, -1.2478F, 0.3187F));
		PartDefinition cube_r64 = mainhair2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8872F, 2.0029F, 1.2617F, -1.4419F, -1.2098F, 1.2049F));
		PartDefinition cube_r65 = mainhair2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8872F, 2.0029F, 1.2617F, -1.8621F, -0.859F, 1.739F));
		PartDefinition cube_r66 = mainhair2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6998F, 2.0029F, 1.2617F, -0.5799F, 1.2478F, -0.3187F));
		PartDefinition cube_r67 = mainhair2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6998F, 2.0029F, 1.2617F, -1.4419F, 1.2098F, -1.2049F));
		PartDefinition cube_r68 = mainhair2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6998F, 2.0029F, 1.2617F, -1.8621F, 0.859F, -1.739F));
		PartDefinition cube_r69 = mainhair2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(115, 121).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.7961F, -1.7581F, 1.5804F, -1.1959F, 1.0768F, -1.1356F));
		PartDefinition cube_r70 = mainhair2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(115, 121).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.7961F, -1.7581F, 1.5804F, -0.3826F, 1.0926F, -0.1765F));
		PartDefinition cube_r71 = mainhair2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(115, 121).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.7961F, -1.7581F, 1.5804F, -0.0115F, 0.9028F, 0.2367F));
		PartDefinition cube_r72 = mainhair2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(115, 121).addBox(-1.364F, -1.914F, -1.21F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2403F, 0.5028F, -4.0261F, 0.2235F, 0.5018F, 0.4415F));
		PartDefinition cube_r73 = mainhair2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(115, 121).addBox(-3.608F, -2.068F, -1.276F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2403F, 0.5028F, -4.0261F, 0.0971F, 0.7551F, 0.2639F));
		PartDefinition cube_r74 = mainhair2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(115, 121).addBox(-0.781F, -0.44F, -0.506F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7009F, -1.4329F, -0.8094F, -0.291F, 1.0307F, -0.2864F));
		PartDefinition cube_r75 = mainhair2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 1.2989F, -1.3783F, 0.5228F, 0.6545F, 0.5568F));
		PartDefinition cube_r76 = mainhair2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 1.2989F, -1.3783F, 0.4436F, 0.9399F, 0.4763F));
		PartDefinition cube_r77 = mainhair2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 1.2989F, -1.3783F, -0.0481F, 1.3096F, -0.1099F));
		PartDefinition cube_r78 = mainhair2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6482F, 6.1499F, 1.8887F, -1.311F, -0.6154F, 0.6486F));
		PartDefinition cube_r79 = mainhair2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6482F, 6.1499F, 1.8887F, -1.487F, -0.4731F, 0.9457F));
		PartDefinition cube_r80 = mainhair2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6482F, 6.1499F, 1.8887F, -1.5452F, -0.1709F, 1.277F));
		PartDefinition cube_r81 = mainhair2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4608F, 6.1499F, 1.8887F, -1.311F, 0.6154F, -0.6486F));
		PartDefinition cube_r82 = mainhair2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4608F, 6.1499F, 1.8887F, -1.487F, 0.4731F, -0.9457F));
		PartDefinition cube_r83 = mainhair2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4608F, 6.1499F, 1.8887F, -1.5452F, 0.1709F, -1.277F));
		PartDefinition cube_r84 = mainhair2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6358F, 5.1499F, 1.8887F, -0.782F, 0.8233F, -0.2935F));
		PartDefinition cube_r85 = mainhair2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6358F, 5.1499F, 1.8887F, -1.1143F, 0.8067F, -0.7184F));
		PartDefinition cube_r86 = mainhair2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6358F, 5.1499F, 1.8887F, -1.3942F, 0.5939F, -1.2193F));
		PartDefinition cube_r87 = mainhair2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8232F, 5.1499F, 1.8887F, -0.782F, -0.8233F, 0.2935F));
		PartDefinition cube_r88 = mainhair2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8232F, 5.1499F, 1.8887F, -1.1143F, -0.8067F, 0.7184F));
		PartDefinition cube_r89 = mainhair2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8232F, 5.1499F, 1.8887F, -1.3942F, -0.5939F, 1.2193F));
		PartDefinition cube_r90 = mainhair2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4482F, 4.8874F, -0.5863F, -1.1529F, -0.8359F, 0.7466F));
		PartDefinition cube_r91 = mainhair2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4482F, 4.8874F, -0.5863F, -1.4391F, -0.6069F, 1.2446F));
		PartDefinition cube_r92 = mainhair2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4482F, 4.8874F, -0.5863F, -0.7994F, -0.8608F, 0.3065F));
		PartDefinition cube_r93 = mainhair2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0108F, 4.6374F, -1.2113F, -1.102F, 0.7968F, -0.7095F));
		PartDefinition cube_r94 = mainhair2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0108F, 4.6374F, -1.2113F, -1.3795F, 0.5893F, -1.211F));
		PartDefinition cube_r95 = mainhair2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0108F, 4.6374F, -1.2113F, -0.7765F, 0.8108F, -0.2895F));
		PartDefinition cube_r96 = mainhair2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(115, 121).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 3.4769F, -0.5863F, -0.4191F, 0.81F, -0.2538F));
		PartDefinition cube_r97 = mainhair2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(115, 121).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 3.4769F, -0.5863F, -0.8613F, 0.863F, -0.9046F));
		PartDefinition cube_r98 = mainhair2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(115, 121).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8318F, 3.4769F, -0.5863F, -0.1812F, 0.6461F, 0.0696F));
		PartDefinition cube_r99 = mainhair2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 3.4769F, -0.5863F, -0.4191F, -0.81F, 0.2538F));
		PartDefinition cube_r100 = mainhair2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 3.4769F, -0.5863F, -0.8613F, -0.863F, 0.9046F));
		PartDefinition cube_r101 = mainhair2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 3.4769F, -0.5863F, -0.1812F, -0.6461F, -0.0696F));
		PartDefinition cube_r102 = mainhair2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(115, 121).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 1.2989F, -1.3783F, 0.5228F, -0.6545F, -0.5568F));
		PartDefinition cube_r103 = mainhair2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 1.2989F, -1.3783F, 0.4436F, -0.9399F, -0.4763F));
		PartDefinition cube_r104 = mainhair2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(115, 121).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0192F, 1.2989F, -1.3783F, -0.0481F, -1.3096F, 0.1099F));
		PartDefinition cube_r105 = mainhair2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(115, 121).addBox(-2.057F, -0.44F, -0.506F, 2.838F, 1.936F, 1.936F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8883F, -1.4329F, -0.8094F, -0.291F, -1.0307F, 0.2864F));
		PartDefinition cube_r106 = mainhair2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(115, 121).addBox(0.77F, -2.068F, -1.276F, 2.838F, 2.156F, 2.156F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4277F, 0.5028F, -4.0261F, 0.0971F, -0.7551F, -0.2639F));
		PartDefinition cube_r107 = mainhair2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(115, 121).addBox(-2.024F, -1.914F, -1.21F, 3.388F, 2.42F, 2.42F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4277F, 0.5028F, -4.0261F, 0.2235F, -0.5018F, -0.4415F));
		PartDefinition cube_r108 = mainhair2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(115, 121).addBox(-0.7351F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0937F, -2.2289F, 0.475F, -0.8954F, -0.0784F, 0.9897F));
		PartDefinition cube_r109 = mainhair2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(115, 121).addBox(-0.099F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0937F, -2.2289F, 0.475F, -1.2102F, -0.327F, 0.7786F));
		PartDefinition cube_r110 = mainhair2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(115, 121).addBox(-0.8985F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0937F, -2.2289F, 0.475F, -0.6526F, 0.0477F, 1.0905F));
		PartDefinition cube_r111 = mainhair2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(115, 121).addBox(-0.851F, -1.8752F, -1.3439F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.572F, -3.9642F, -1.109F, -0.8434F, -0.0195F, 0.4548F));
		PartDefinition cube_r112 = mainhair2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(115, 121).addBox(-0.2094F, -3.2218F, -1.6257F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.572F, -3.9642F, -1.109F, -1.1704F, -0.2583F, 0.2348F));
		PartDefinition cube_r113 = mainhair2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(115, 121).addBox(-1.0127F, 0.6565F, -1.7757F, 2.464F, 3.124F, 2.464F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.572F, -3.9642F, -1.109F, -0.5947F, 0.101F, 0.5625F));
		PartDefinition cube_r114 = mainhair2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(115, 121).addBox(-1.617F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9739F, -2.1057F, 0.123F, -1.4285F, 0.4802F, 0.5659F));
		PartDefinition cube_r115 = mainhair2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(115, 121).addBox(-1.2889F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9739F, -2.1057F, 0.123F, -1.1227F, 0.1923F, 0.4103F));
		PartDefinition cube_r116 = mainhair2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(115, 121).addBox(-1.5655F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9739F, -2.1057F, 0.123F, -0.8867F, 0.0464F, 0.3405F));
		PartDefinition cube_r117 = mainhair2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(115, 121).addBox(-0.099F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2825F, -2.3917F, 0.123F, -1.4285F, -0.4802F, -0.5659F));
		PartDefinition cube_r118 = mainhair2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(115, 121).addBox(-0.7351F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2825F, -2.3917F, 0.123F, -1.1227F, -0.1923F, -0.4103F));
		PartDefinition cube_r119 = mainhair2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(115, 121).addBox(-0.8985F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2825F, -2.3917F, 0.123F, -0.8867F, -0.0464F, -0.3405F));
		PartDefinition cube_r120 = mainhair2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(115, 121).addBox(-0.2094F, -3.2218F, -1.6257F, 1.716F, 2.332F, 1.716F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -3.9642F, -1.043F, -1.0819F, -0.2418F, -0.6903F));
		PartDefinition cube_r121 = mainhair2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(115, 121).addBox(-0.851F, -1.8752F, -1.3439F, 2.024F, 3.124F, 2.024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -3.9642F, -1.043F, -0.7562F, -0.0229F, -0.4502F));
		PartDefinition bang4 = hair2.addOrReplaceChild("bang4", CubeListBuilder.create(), PartPose.offset(-3.2188F, -28.7661F, -4.6839F));
		PartDefinition bang3 = bang4.addOrReplaceChild("bang3", CubeListBuilder.create(), PartPose.offset(2.2813F, 29.2661F, -3.7536F));
		PartDefinition cube_r122 = bang3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(119, 124).addBox(-0.5F, -1.625F, -2.6563F, 1.0F, 1.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9907F, -29.0403F, 2.7633F, 0.8727F, 0.384F, 0.0F));
		PartDefinition cube_r123 = bang3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(117, 122).addBox(-0.5F, -1.0F, -4.1562F, 1.0F, 1.25F, 3.6875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2218F, -30.25F, 4.6663F, 0.4538F, 0.384F, 0.0F));
		PartDefinition cube_r124 = bang3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(117, 122).addBox(-1.2188F, 0.3125F, -2.4688F, 1.4375F, 1.25F, 3.6875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2813F, -31.1875F, 5.7188F, 0.0F, 0.384F, 0.0F));
		PartDefinition bone = hair2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.125F, -31.375F, -2.5625F));
		PartDefinition cube_r125 = bone.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(114, 119).addBox(-1.3281F, -0.11F, -2.0767F, 3.0F, 3.25F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1719F, -0.4215F, 0.5104F, -0.3209F, -0.0759F, -0.3787F));
		PartDefinition cube_r126 = bone.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(114, 119).addBox(-1.3125F, -0.925F, -1.75F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9375F, -1.5F, 0.125F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r127 = bone.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(114, 119).addBox(-1.3125F, -1.125F, -1.75F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0625F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r128 = bone.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(114, 119).addBox(-1.3125F, -1.125F, -1.75F, 3.0F, 3.25F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1833F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
