package net.mcreator.dbm.client.model;

import org.checkerframework.common.subtyping.qual.Bottom;

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
public class Modelhair_sbroly_ssj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhair_sbroly_ssj"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhair_sbroly_ssj(ModelPart root) {
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
		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone2 = Hair.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Back = bone2.addOrReplaceChild("Back", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1167F, -31.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Back.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r2 = Back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r3 = Back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r4 = Back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r5 = Back.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r6 = Back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r7 = Back.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r8 = Back.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r9 = Back.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r10 = Back.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r11 = Back.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r12 = Back.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r13 = Back.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r14 = Back.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r15 = Back.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r16 = Back.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r17 = Back.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r18 = Back.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r19 = Back.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r20 = Back.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r21 = Back.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r22 = Back.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r23 = Back.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r24 = Back.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r25 = Back.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r26 = Back.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r27 = Back.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r28 = Back.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r29 = Back.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r30 = Back.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r31 = Back.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r32 = Back.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r33 = Back.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r34 = Back.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r35 = Back.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r36 = Back.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r37 = Back.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r38 = Back.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r39 = Back.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back2 = bone2.addOrReplaceChild("Back2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1167F, -31.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));
		PartDefinition cube_r40 = Back2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r41 = Back2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r42 = Back2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r43 = Back2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r44 = Back2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r45 = Back2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r46 = Back2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r47 = Back2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r48 = Back2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r49 = Back2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r50 = Back2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r51 = Back2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r52 = Back2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r53 = Back2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r54 = Back2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r55 = Back2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r56 = Back2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r57 = Back2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r58 = Back2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r59 = Back2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r60 = Back2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r61 = Back2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r62 = Back2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r63 = Back2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r64 = Back2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r65 = Back2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r66 = Back2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r67 = Back2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r68 = Back2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r69 = Back2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r70 = Back2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r71 = Back2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r72 = Back2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r73 = Back2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r74 = Back2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r75 = Back2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r76 = Back2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r77 = Back2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r78 = Back2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back3 = bone2.addOrReplaceChild("Back3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1167F, -31.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));
		PartDefinition cube_r79 = Back3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r80 = Back3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r81 = Back3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r82 = Back3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r83 = Back3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r84 = Back3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r85 = Back3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));
		PartDefinition cube_r86 = Back3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));
		PartDefinition cube_r87 = Back3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));
		PartDefinition cube_r88 = Back3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));
		PartDefinition cube_r89 = Back3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));
		PartDefinition cube_r90 = Back3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));
		PartDefinition cube_r91 = Back3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r92 = Back3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r93 = Back3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r94 = Back3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r95 = Back3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r96 = Back3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r97 = Back3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));
		PartDefinition cube_r98 = Back3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));
		PartDefinition cube_r99 = Back3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));
		PartDefinition cube_r100 = Back3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));
		PartDefinition cube_r101 = Back3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));
		PartDefinition cube_r102 = Back3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));
		PartDefinition cube_r103 = Back3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));
		PartDefinition cube_r104 = Back3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));
		PartDefinition cube_r105 = Back3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));
		PartDefinition cube_r106 = Back3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));
		PartDefinition cube_r107 = Back3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));
		PartDefinition cube_r108 = Back3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));
		PartDefinition cube_r109 = Back3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));
		PartDefinition cube_r110 = Back3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));
		PartDefinition cube_r111 = Back3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));
		PartDefinition cube_r112 = Back3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));
		PartDefinition cube_r113 = Back3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));
		PartDefinition cube_r114 = Back3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));
		PartDefinition cube_r115 = Back3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));
		PartDefinition cube_r116 = Back3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));
		PartDefinition cube_r117 = Back3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));
		PartDefinition bone3 = Hair.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition Back4 = bone3.addOrReplaceChild("Back4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r118 = Back4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r119 = Back4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r120 = Back4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r121 = Back4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r122 = Back4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r123 = Back4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r124 = Back4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r125 = Back4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r126 = Back4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r127 = Back4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r128 = Back4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r129 = Back4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r130 = Back4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r131 = Back4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r132 = Back4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r133 = Back4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r134 = Back4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r135 = Back4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r136 = Back4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r137 = Back4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r138 = Back4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r139 = Back4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r140 = Back4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r141 = Back4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r142 = Back4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r143 = Back4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r144 = Back4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r145 = Back4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r146 = Back4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r147 = Back4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r148 = Back4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r149 = Back4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r150 = Back4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r151 = Back4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r152 = Back4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r153 = Back4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r154 = Back4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r155 = Back4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r156 = Back4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back5 = bone3.addOrReplaceChild("Back5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));
		PartDefinition cube_r157 = Back5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r158 = Back5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r159 = Back5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r160 = Back5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r161 = Back5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r162 = Back5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r163 = Back5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r164 = Back5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r165 = Back5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r166 = Back5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r167 = Back5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r168 = Back5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r169 = Back5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r170 = Back5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r171 = Back5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r172 = Back5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r173 = Back5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r174 = Back5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r175 = Back5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r176 = Back5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r177 = Back5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r178 = Back5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r179 = Back5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r180 = Back5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r181 = Back5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r182 = Back5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r183 = Back5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r184 = Back5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r185 = Back5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r186 = Back5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r187 = Back5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r188 = Back5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r189 = Back5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r190 = Back5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r191 = Back5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r192 = Back5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r193 = Back5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r194 = Back5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r195 = Back5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back6 = bone3.addOrReplaceChild("Back6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));
		PartDefinition cube_r196 = Back6.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r197 = Back6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r198 = Back6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r199 = Back6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r200 = Back6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r201 = Back6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r202 = Back6.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));
		PartDefinition cube_r203 = Back6.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));
		PartDefinition cube_r204 = Back6.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));
		PartDefinition cube_r205 = Back6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));
		PartDefinition cube_r206 = Back6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));
		PartDefinition cube_r207 = Back6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));
		PartDefinition cube_r208 = Back6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r209 = Back6.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r210 = Back6.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r211 = Back6.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r212 = Back6.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r213 = Back6.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r214 = Back6.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));
		PartDefinition cube_r215 = Back6.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));
		PartDefinition cube_r216 = Back6.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));
		PartDefinition cube_r217 = Back6.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));
		PartDefinition cube_r218 = Back6.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));
		PartDefinition cube_r219 = Back6.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));
		PartDefinition cube_r220 = Back6.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));
		PartDefinition cube_r221 = Back6.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));
		PartDefinition cube_r222 = Back6.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));
		PartDefinition cube_r223 = Back6.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));
		PartDefinition cube_r224 = Back6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));
		PartDefinition cube_r225 = Back6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));
		PartDefinition cube_r226 = Back6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));
		PartDefinition cube_r227 = Back6.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));
		PartDefinition cube_r228 = Back6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));
		PartDefinition cube_r229 = Back6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));
		PartDefinition cube_r230 = Back6.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));
		PartDefinition cube_r231 = Back6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));
		PartDefinition cube_r232 = Back6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));
		PartDefinition cube_r233 = Back6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));
		PartDefinition cube_r234 = Back6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));
		PartDefinition bone4 = Hair.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.937F, 0.8007F, -0.5795F));
		PartDefinition Back7 = bone4.addOrReplaceChild("Back7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r235 = Back7.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r236 = Back7.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r237 = Back7.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r238 = Back7.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r239 = Back7.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r240 = Back7.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r241 = Back7.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r242 = Back7.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r243 = Back7.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r244 = Back7.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r245 = Back7.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r246 = Back7.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r247 = Back7.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r248 = Back7.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r249 = Back7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r250 = Back7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r251 = Back7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r252 = Back7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r253 = Back7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r254 = Back7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r255 = Back7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r256 = Back7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r257 = Back7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r258 = Back7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r259 = Back7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r260 = Back7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r261 = Back7.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r262 = Back7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r263 = Back7.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r264 = Back7.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r265 = Back7.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r266 = Back7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r267 = Back7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r268 = Back7.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r269 = Back7.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r270 = Back7.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r271 = Back7.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r272 = Back7.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r273 = Back7.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back8 = bone4.addOrReplaceChild("Back8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));
		PartDefinition cube_r274 = Back8.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r275 = Back8.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r276 = Back8.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r277 = Back8.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r278 = Back8.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r279 = Back8.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r280 = Back8.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r281 = Back8.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r282 = Back8.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r283 = Back8.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r284 = Back8.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r285 = Back8.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r286 = Back8.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r287 = Back8.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r288 = Back8.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r289 = Back8.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r290 = Back8.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r291 = Back8.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r292 = Back8.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r293 = Back8.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r294 = Back8.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r295 = Back8.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r296 = Back8.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r297 = Back8.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r298 = Back8.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r299 = Back8.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r300 = Back8.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r301 = Back8.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r302 = Back8.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r303 = Back8.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r304 = Back8.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r305 = Back8.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r306 = Back8.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r307 = Back8.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r308 = Back8.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r309 = Back8.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r310 = Back8.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r311 = Back8.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r312 = Back8.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Back9 = bone4.addOrReplaceChild("Back9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));
		PartDefinition cube_r313 = Back9.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r314 = Back9.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r315 = Back9.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r316 = Back9.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r317 = Back9.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r318 = Back9.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r319 = Back9.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));
		PartDefinition cube_r320 = Back9.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));
		PartDefinition cube_r321 = Back9.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));
		PartDefinition cube_r322 = Back9.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));
		PartDefinition cube_r323 = Back9.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));
		PartDefinition cube_r324 = Back9.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));
		PartDefinition cube_r325 = Back9.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r326 = Back9.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r327 = Back9.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r328 = Back9.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r329 = Back9.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r330 = Back9.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r331 = Back9.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));
		PartDefinition cube_r332 = Back9.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));
		PartDefinition cube_r333 = Back9.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));
		PartDefinition cube_r334 = Back9.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));
		PartDefinition cube_r335 = Back9.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));
		PartDefinition cube_r336 = Back9.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));
		PartDefinition cube_r337 = Back9.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));
		PartDefinition cube_r338 = Back9.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));
		PartDefinition cube_r339 = Back9.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));
		PartDefinition cube_r340 = Back9.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));
		PartDefinition cube_r341 = Back9.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));
		PartDefinition cube_r342 = Back9.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));
		PartDefinition cube_r343 = Back9.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));
		PartDefinition cube_r344 = Back9.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));
		PartDefinition cube_r345 = Back9.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));
		PartDefinition cube_r346 = Back9.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));
		PartDefinition cube_r347 = Back9.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));
		PartDefinition cube_r348 = Back9.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));
		PartDefinition cube_r349 = Back9.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));
		PartDefinition cube_r350 = Back9.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));
		PartDefinition cube_r351 = Back9.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));
		PartDefinition bone5 = Hair.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.937F, -0.8007F, 0.5795F));
		PartDefinition Back10 = bone5.addOrReplaceChild("Back10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r352 = Back10.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r353 = Back10.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r354 = Back10.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r355 = Back10.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r356 = Back10.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r357 = Back10.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r358 = Back10.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));
		PartDefinition cube_r359 = Back10.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));
		PartDefinition cube_r360 = Back10.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));
		PartDefinition cube_r361 = Back10.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));
		PartDefinition cube_r362 = Back10.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));
		PartDefinition cube_r363 = Back10.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));
		PartDefinition cube_r364 = Back10.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r365 = Back10.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r366 = Back10.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r367 = Back10.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r368 = Back10.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r369 = Back10.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r370 = Back10.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));
		PartDefinition cube_r371 = Back10.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));
		PartDefinition cube_r372 = Back10.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));
		PartDefinition cube_r373 = Back10.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));
		PartDefinition cube_r374 = Back10.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));
		PartDefinition cube_r375 = Back10.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));
		PartDefinition cube_r376 = Back10.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));
		PartDefinition cube_r377 = Back10.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));
		PartDefinition cube_r378 = Back10.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));
		PartDefinition cube_r379 = Back10.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));
		PartDefinition cube_r380 = Back10.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));
		PartDefinition cube_r381 = Back10.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));
		PartDefinition cube_r382 = Back10.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));
		PartDefinition cube_r383 = Back10.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));
		PartDefinition cube_r384 = Back10.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));
		PartDefinition cube_r385 = Back10.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));
		PartDefinition cube_r386 = Back10.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));
		PartDefinition cube_r387 = Back10.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));
		PartDefinition cube_r388 = Back10.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));
		PartDefinition cube_r389 = Back10.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));
		PartDefinition cube_r390 = Back10.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));
		PartDefinition Back11 = bone5.addOrReplaceChild("Back11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));
		PartDefinition cube_r391 = Back11.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r392 = Back11.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r393 = Back11.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r394 = Back11.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));
		PartDefinition cube_r395 = Back11.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));
		PartDefinition cube_r396 = Back11.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));
		PartDefinition cube_r397 = Back11.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));
		PartDefinition cube_r398 = Back11.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));
		PartDefinition cube_r399 = Back11.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));
		PartDefinition cube_r400 = Back11.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));
		PartDefinition cube_r401 = Back11.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));
		PartDefinition cube_r402 = Back11.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));
		PartDefinition cube_r403 = Back11.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r404 = Back11.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r405 = Back11.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r406 = Back11.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r407 = Back11.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r408 = Back11.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r409 = Back11.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));
		PartDefinition cube_r410 = Back11.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));
		PartDefinition cube_r411 = Back11.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));
		PartDefinition cube_r412 = Back11.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));
		PartDefinition cube_r413 = Back11.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));
		PartDefinition cube_r414 = Back11.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));
		PartDefinition cube_r415 = Back11.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));
		PartDefinition cube_r416 = Back11.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));
		PartDefinition cube_r417 = Back11.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));
		PartDefinition cube_r418 = Back11.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));
		PartDefinition cube_r419 = Back11.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));
		PartDefinition cube_r420 = Back11.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));
		PartDefinition cube_r421 = Back11.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));
		PartDefinition cube_r422 = Back11.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));
		PartDefinition cube_r423 = Back11.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));
		PartDefinition cube_r424 = Back11.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));
		PartDefinition cube_r425 = Back11.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));
		PartDefinition cube_r426 = Back11.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));
		PartDefinition cube_r427 = Back11.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));
		PartDefinition cube_r428 = Back11.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));
		PartDefinition cube_r429 = Back11.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));
		PartDefinition Back12 = bone5.addOrReplaceChild("Back12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));
		PartDefinition cube_r430 = Back12.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r431 = Back12.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r432 = Back12.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r433 = Back12.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));
		PartDefinition cube_r434 = Back12.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));
		PartDefinition cube_r435 = Back12.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));
		PartDefinition cube_r436 = Back12.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));
		PartDefinition cube_r437 = Back12.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));
		PartDefinition cube_r438 = Back12.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));
		PartDefinition cube_r439 = Back12.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));
		PartDefinition cube_r440 = Back12.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));
		PartDefinition cube_r441 = Back12.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));
		PartDefinition cube_r442 = Back12.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));
		PartDefinition cube_r443 = Back12.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));
		PartDefinition cube_r444 = Back12.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));
		PartDefinition cube_r445 = Back12.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));
		PartDefinition cube_r446 = Back12.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));
		PartDefinition cube_r447 = Back12.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));
		PartDefinition cube_r448 = Back12.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));
		PartDefinition cube_r449 = Back12.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));
		PartDefinition cube_r450 = Back12.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));
		PartDefinition cube_r451 = Back12.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));
		PartDefinition cube_r452 = Back12.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));
		PartDefinition cube_r453 = Back12.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));
		PartDefinition cube_r454 = Back12.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));
		PartDefinition cube_r455 = Back12.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));
		PartDefinition cube_r456 = Back12.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));
		PartDefinition cube_r457 = Back12.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));
		PartDefinition cube_r458 = Back12.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));
		PartDefinition cube_r459 = Back12.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));
		PartDefinition cube_r460 = Back12.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));
		PartDefinition cube_r461 = Back12.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));
		PartDefinition cube_r462 = Back12.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));
		PartDefinition cube_r463 = Back12.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));
		PartDefinition cube_r464 = Back12.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));
		PartDefinition cube_r465 = Back12.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));
		PartDefinition cube_r466 = Back12.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));
		PartDefinition cube_r467 = Back12.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));
		PartDefinition cube_r468 = Back12.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));
		PartDefinition Main2 = Hair.addOrReplaceChild("Main2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.0F, -0.9F, 0.1396F, 0.0F, 0.0F));
		PartDefinition Left = Main2.addOrReplaceChild("Left", CubeListBuilder.create(), PartPose.offset(0.0F, 7.976F, 0.0F));
		PartDefinition bunch = Left.addOrReplaceChild("bunch", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.003F, -5.7557F, -4.004F, 0.3124F, 0.2079F, 0.0666F));
		PartDefinition bunch_r1 = bunch.addOrReplaceChild("bunch_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-1.0297F, -2.4679F, -1.1965F, 1.8018F, 2.375F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.7127F, -0.0546F, 0.5036F));
		PartDefinition bunch_r2 = bunch.addOrReplaceChild("bunch_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.6802F, -0.7769F, -1.2595F, 1.8018F, 1.7F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.4905F, -0.0713F, 0.1031F));
		PartDefinition bunch_r3 = bunch.addOrReplaceChild("bunch_r3", CubeListBuilder.create().texOffs(45, 2).addBox(-0.5983F, -0.3999F, -1.5815F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4931F, -2.7075F, 1.5815F, 0.0F, 0.0F, -0.0654F));
		PartDefinition bunch8 = Left.addOrReplaceChild("bunch8", CubeListBuilder.create().texOffs(45, 2).addBox(-1.8018F, -0.87F, -0.9009F, 1.8018F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -6.006F, -3.003F, 0.0656F, 0.1238F, 0.4783F));
		PartDefinition bunch8_r1 = bunch8.addOrReplaceChild("bunch8_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.2973F, -1.81F, -0.8108F, 2.2973F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8018F, 1.03F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition bunch9 = Left.addOrReplaceChild("bunch9", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, -2.002F, -0.214F, 0.1766F, 0.7609F));
		PartDefinition bunch9_r1 = bunch9.addOrReplaceChild("bunch9_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.973F, -1.81F, -0.8108F, 2.973F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bunch10 = Left.addOrReplaceChild("bunch10", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 0.0F, -0.2538F, 0.093F, 0.7869F));
		PartDefinition bunch10_r1 = bunch10.addOrReplaceChild("bunch10_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.4224F, -1.81F, -0.8108F, 2.4224F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bunch11 = Left.addOrReplaceChild("bunch11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.003F, -7.007F, -2.002F, 0.0476F, -0.0069F, -0.2166F));
		PartDefinition bunch11_r1 = bunch11.addOrReplaceChild("bunch11_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.5005F, -1.3F, -0.8008F, 1.6016F, 2.6F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2748F, -3.4337F, 0.4218F, -0.3798F, 0.1024F, 0.5563F));
		PartDefinition bunch11_r2 = bunch11.addOrReplaceChild("bunch11_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -0.3408F, -1.2119F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9259F, -2.3282F, 0.2109F, 0.0F, 0.0F, 0.3054F));
		PartDefinition bunch15 = Left.addOrReplaceChild("bunch15", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -8.008F, -1.001F, -0.0932F, 0.0143F, 0.0844F));
		PartDefinition bunch15_r1 = bunch15.addOrReplaceChild("bunch15_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.825F, 0.2002F, 1.6016F, 2.825F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch17 = Left.addOrReplaceChild("bunch17", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 0.0F, -0.1298F, -0.017F, -0.1298F));
		PartDefinition bunch17_r1 = bunch17.addOrReplaceChild("bunch17_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -6.4F, -0.4254F, 1.6016F, 2.4F, 2.2272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.023F, -2.7403F, -0.6109F, 0.0F, 0.0F));
		PartDefinition bunch17_r2 = bunch17.addOrReplaceChild("bunch17_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.625F, -0.5756F, 1.6016F, 1.625F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch18 = Left.addOrReplaceChild("bunch18", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 2.002F, 0.1682F, 0.1136F, 0.7004F));
		PartDefinition bunch18_r1 = bunch18.addOrReplaceChild("bunch18_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.6476F, -1.81F, -0.8108F, 2.6476F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bunch19 = Left.addOrReplaceChild("bunch19", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 1.001F, 0.1409F, 0.399F, 0.5638F));
		PartDefinition bunch19_r1 = bunch19.addOrReplaceChild("bunch19_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-3.1481F, -1.81F, -0.8108F, 3.1481F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition bunch20 = Left.addOrReplaceChild("bunch20", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.871F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -5.005F, 0.0F, 0.1706F, 0.1996F, 0.7153F));
		PartDefinition bunch20_r1 = bunch20.addOrReplaceChild("bunch20_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-3.2983F, -1.81F, -0.8108F, 3.2983F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition bunch31 = Left.addOrReplaceChild("bunch31", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -2.002F, 2.8028F, 0.6531F, -0.1074F, -0.291F));
		PartDefinition bunch31_r1 = bunch31.addOrReplaceChild("bunch31_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.5672F, 0.0F, 0.0F));
		PartDefinition bunch32 = Left.addOrReplaceChild("bunch32", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.872F, 0.2002F, 1.8018F, 1.8F, 2.7027F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -4.004F, 2.8028F, 0.5059F, -0.3082F, -0.1665F));
		PartDefinition bunch32_r1 = bunch32.addOrReplaceChild("bunch32_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch38 = Left.addOrReplaceChild("bunch38", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 0.0F, -0.2931F, -0.0895F, -0.3829F));
		PartDefinition bunch38_r1 = bunch38.addOrReplaceChild("bunch38_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.225F, 0.2002F, 1.6016F, 2.225F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch39 = Left.addOrReplaceChild("bunch39", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 3.003F, 0.3765F, 0.5351F, 0.6915F));
		PartDefinition bunch39_r1 = bunch39.addOrReplaceChild("bunch39_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.2973F, -1.81F, -0.8108F, 2.2973F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bunch40 = Left.addOrReplaceChild("bunch40", CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 3.003F, 0.668F, 0.4042F, 0.945F));
		PartDefinition bunch40_r1 = bunch40.addOrReplaceChild("bunch40_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.4474F, -1.81F, -0.8108F, 2.4474F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition bunch41 = Left.addOrReplaceChild("bunch41", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 2.002F, -0.3696F, 0.2475F, -0.2181F));
		PartDefinition bunch41_r1 = bunch41.addOrReplaceChild("bunch41_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.3895F, -0.7455F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch41_r2 = bunch41.addOrReplaceChild("bunch41_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch46 = Left.addOrReplaceChild("bunch46", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.974F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -2.002F, 3.003F, -0.7352F, 0.0454F, 0.0199F));
		PartDefinition bunch46_r1 = bunch46.addOrReplaceChild("bunch46_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.0527F, 0.2306F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.974F, -1.001F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bunch48 = Left.addOrReplaceChild("bunch48", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.97F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -6.006F, 3.003F, -0.7259F, -0.1394F, -0.1081F));
		PartDefinition bunch48_r1 = bunch48.addOrReplaceChild("bunch48_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.025F, 0.2002F, 1.6016F, 2.025F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Right = Main2.addOrReplaceChild("Right", CubeListBuilder.create(), PartPose.offset(0.0F, 7.976F, 0.0F));
		PartDefinition bunch2 = Right.addOrReplaceChild("bunch2", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.97F, -1.001F, 2.002F, 2.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -6.006F, -3.003F, 0.5221F, -0.0227F, 0.1289F));
		PartDefinition bunch2_r1 = bunch2.addOrReplaceChild("bunch2_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -3.55F, 0.1001F, 1.8018F, 3.55F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, -1.001F, -0.48F, 0.0F, 0.0F));
		PartDefinition bunch6 = Right.addOrReplaceChild("bunch6", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.97F, 0.0F, 2.002F, 2.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -6.006F, -4.004F, 0.5208F, -0.0516F, 0.1199F));
		PartDefinition bunch6_r1 = bunch6.addOrReplaceChild("bunch6_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -2.45F, 0.1001F, 1.8018F, 2.45F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5699F, 0.6699F, -0.7418F, 0.0F, 0.0F));
		PartDefinition bunch6_r2 = bunch6.addOrReplaceChild("bunch6_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -1.7F, 0.1001F, 1.8018F, 1.7F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch7 = Right.addOrReplaceChild("bunch7", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.469F, 0.0F, 1.6016F, 1.6F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, -4.004F, 0.217F, -0.2357F, 0.1709F));
		PartDefinition bunch7_r1 = bunch7.addOrReplaceChild("bunch7_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.7207F, -2.44F, 0.1001F, 1.4414F, 2.44F, 1.4414F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.569F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bunch12 = Right.addOrReplaceChild("bunch12", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.225F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, -3.003F, -0.0428F, 0.0189F, 0.0852F));
		PartDefinition bunch12_r1 = bunch12.addOrReplaceChild("bunch12_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.875F, 0.2002F, 1.6016F, 2.875F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bunch13 = Right.addOrReplaceChild("bunch13", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, -3.003F, -0.2181F, -0.0073F, 0.0467F));
		PartDefinition bunch13_r1 = bunch13.addOrReplaceChild("bunch13_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -3.175F, 0.2002F, 1.6016F, 3.175F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch14 = Right.addOrReplaceChild("bunch14", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.968F, -1.001F, 2.002F, 2.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -8.008F, -2.002F, -0.1899F, -0.2141F, 0.0853F));
		PartDefinition bunch14_r1 = bunch14.addOrReplaceChild("bunch14_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.8F, 0.2002F, 1.6016F, 2.8F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.968F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch16 = Right.addOrReplaceChild("bunch16", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.008F, -1.001F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bunch16_r1 = bunch16.addOrReplaceChild("bunch16_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.85F, 0.2002F, 1.6016F, 2.85F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2088F, -0.0701F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bunch16_r2 = bunch16.addOrReplaceChild("bunch16_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch21 = Right.addOrReplaceChild("bunch21", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, -1.001F, -0.1233F, -0.1211F, 0.0658F));
		PartDefinition bunch21_r1 = bunch21.addOrReplaceChild("bunch21_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.575F, 0.2002F, 1.6016F, 2.575F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2098F, -0.0701F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bunch21_r2 = bunch21.addOrReplaceChild("bunch21_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch22 = Right.addOrReplaceChild("bunch22", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, -2.002F, -0.214F, -0.1766F, -0.7609F));
		PartDefinition bunch22_r1 = bunch22.addOrReplaceChild("bunch22_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 3.4735F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bunch23 = Right.addOrReplaceChild("bunch23", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 0.0F, -0.2132F, 0.0015F, -0.7626F));
		PartDefinition bunch23_r1 = bunch23.addOrReplaceChild("bunch23_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.8979F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition bunch24 = Right.addOrReplaceChild("bunch24", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.871F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -5.005F, 0.0F, 0.1706F, -0.1996F, -0.7153F));
		PartDefinition bunch24_r1 = bunch24.addOrReplaceChild("bunch24_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 3.2232F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition bunch25 = Right.addOrReplaceChild("bunch25", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 2.002F, 0.169F, -0.117F, -0.7008F));
		PartDefinition bunch25_r1 = bunch25.addOrReplaceChild("bunch25_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.3974F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bunch26 = Right.addOrReplaceChild("bunch26", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 1.001F, 0.1437F, -0.4422F, -0.5705F));
		PartDefinition bunch26_r1 = bunch26.addOrReplaceChild("bunch26_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.3974F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition bunch27 = Right.addOrReplaceChild("bunch27", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.87F, -1.0009F, 1.8018F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -6.006F, -3.003F, 0.0572F, -0.2136F, -0.4396F));
		PartDefinition bunch27_r1 = bunch27.addOrReplaceChild("bunch27_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.5225F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8018F, 1.03F, -0.1F, 0.0F, 0.0F, -0.6545F));
		PartDefinition bunch28 = Right.addOrReplaceChild("bunch28", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -2.002F, 2.8028F, 0.726F, 0.1383F, 0.3711F));
		PartDefinition bunch28_r1 = bunch28.addOrReplaceChild("bunch28_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bunch29 = Right.addOrReplaceChild("bunch29", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.872F, 0.2002F, 1.8018F, 1.8F, 2.7027F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -4.004F, 2.8028F, 0.4507F, 0.2316F, 0.1231F));
		PartDefinition bunch29_r1 = bunch29.addOrReplaceChild("bunch29_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.0436F, 0.0F, 0.0F));
		PartDefinition bunch30 = Right.addOrReplaceChild("bunch30", CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -2.002F, 2.8028F, 0.6074F, 0.0603F, -0.1163F));
		PartDefinition bunch30_r1 = bunch30.addOrReplaceChild("bunch30_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bunch33 = Right.addOrReplaceChild("bunch33", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, 1.001F, -0.3054F, -0.0073F, 0.0467F));
		PartDefinition bunch33_r1 = bunch33.addOrReplaceChild("bunch33_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.7007F, -5.4F, 0.3003F, 1.4014F, 1.4F, 1.4014F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6064F, -1.9442F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bunch33_r2 = bunch33.addOrReplaceChild("bunch33_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch34 = Right.addOrReplaceChild("bunch34", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 1.001F, -0.4344F, -0.0299F, -0.0379F));
		PartDefinition bunch34_r1 = bunch34.addOrReplaceChild("bunch34_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bunch35 = Right.addOrReplaceChild("bunch35", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 0.0F, -0.2521F, 0.0696F, 0.2499F));
		PartDefinition bunch35_r1 = bunch35.addOrReplaceChild("bunch35_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -4.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6754F, -1.9529F, -0.48F, 0.0F, 0.0F));
		PartDefinition bunch35_r2 = bunch35.addOrReplaceChild("bunch35_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bunch36 = Right.addOrReplaceChild("bunch36", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, 2.002F, -0.3828F, -0.09F, -0.1555F));
		PartDefinition bunch36_r1 = bunch36.addOrReplaceChild("bunch36_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -6.65F, 0.2002F, 1.6016F, 2.65F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.694F, -2.2777F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch36_r2 = bunch36.addOrReplaceChild("bunch36_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch37 = Right.addOrReplaceChild("bunch37", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -7.007F, 2.002F, -0.478F, 0.0406F, 0.034F));
		PartDefinition bunch37_r1 = bunch37.addOrReplaceChild("bunch37_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.5F, 0.2002F, 1.6016F, 2.5F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2172F, -0.0655F, -0.5672F, 0.0F, 0.0F));
		PartDefinition bunch37_r2 = bunch37.addOrReplaceChild("bunch37_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch42 = Right.addOrReplaceChild("bunch42", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 3.003F, 0.2691F, -0.4828F, -0.829F));
		PartDefinition bunch42_r1 = bunch42.addOrReplaceChild("bunch42_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0721F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bunch43 = Right.addOrReplaceChild("bunch43", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 3.003F, 0.6938F, -0.472F, -1.0056F));
		PartDefinition bunch43_r1 = bunch43.addOrReplaceChild("bunch43_r1", CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.2472F, 1.62F, 1.6216F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition bunch44 = Right.addOrReplaceChild("bunch44", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 2.002F, -0.3696F, -0.2475F, 0.2181F));
		PartDefinition bunch44_r1 = bunch44.addOrReplaceChild("bunch44_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -4.075F, 0.2002F, 1.6016F, 2.075F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5418F, -1.5116F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bunch44_r2 = bunch44.addOrReplaceChild("bunch44_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bunch45 = Right.addOrReplaceChild("bunch45", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.971F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.005F, 3.003F, -0.7367F, -0.0066F, -0.0545F));
		PartDefinition bunch45_r1 = bunch45.addOrReplaceChild("bunch45_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.7507F, -5.2F, 0.2503F, 1.5015F, 2.2F, 1.5015F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5472F, -1.7734F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bunch45_r2 = bunch45.addOrReplaceChild("bunch45_r2", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.971F, -1.001F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bunch47 = Right.addOrReplaceChild("bunch47", CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.97F, -1.001F, 2.002F, 3.0F, 2.002F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -6.006F, 3.003F, -0.7331F, 0.0813F, 0.0427F));
		PartDefinition bunch47_r1 = bunch47.addOrReplaceChild("bunch47_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.375F, 0.2002F, 1.6016F, 2.375F, 1.6016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.0436F, 0.0F, 0.0F));
		PartDefinition Bangs = Hair.addOrReplaceChild("Bangs", CubeListBuilder.create(), PartPose.offset(2.002F, -31.031F, -3.003F));
		PartDefinition BangSection2 = Bangs.addOrReplaceChild("BangSection2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.004F, 0.0F, -1.001F, 0.8228F, 0.609F, 0.2567F));
		PartDefinition Bang2 = BangSection2.addOrReplaceChild("Bang2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom = Bang2.addOrReplaceChild("Bottom", CubeListBuilder.create(), PartPose.offset(2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch3_r1 = Bottom.addOrReplaceChild("bunch3_r1", CubeListBuilder.create().texOffs(45, 3).addBox(-0.2514F, -1.9917F, 0.3937F, 1.8018F, 1.8F, 3.1031F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -30.8336F, -5.7935F, -0.2352F, -0.3688F, 0.2063F));
		PartDefinition Top = Bang2.addOrReplaceChild("Top", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r1 = Top.addOrReplaceChild("Top_r1", CubeListBuilder.create().texOffs(45, 3).addBox(-0.1613F, -1.6711F, -1.4833F, 1.6216F, 1.62F, 2.6727F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.1984F, 0.0123F, 0.1139F, -0.3688F, 0.2063F));
		PartDefinition Bang1 = BangSection2.addOrReplaceChild("Bang1", CubeListBuilder.create(), PartPose.offset(-1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom2 = Bang1.addOrReplaceChild("Bottom2", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch3_r2 = Bottom2.addOrReplaceChild("bunch3_r2", CubeListBuilder.create().texOffs(45, 3).addBox(-0.9009F, -1.1368F, -0.4433F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));
		PartDefinition Top2 = Bang1.addOrReplaceChild("Top2", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch3_r3 = Top2.addOrReplaceChild("bunch3_r3", CubeListBuilder.create().texOffs(45, 3).addBox(-0.7997F, 0.1388F, -1.8308F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));
		PartDefinition BangSection = Bangs.addOrReplaceChild("BangSection", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Bang = BangSection.addOrReplaceChild("Bang", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));
		PartDefinition Bottom3 = Bang.addOrReplaceChild("Bottom3", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition bunch4_r1 = Bottom3.addOrReplaceChild("bunch4_r1", CubeListBuilder.create().texOffs(45, 3).addBox(-0.8008F, -1.0257F, -0.4761F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3947F, -31.638F, -5.6692F, -0.0556F, 0.2389F, -0.1742F));
		PartDefinition Top3 = Bang.addOrReplaceChild("Top3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition bunch4_r2 = Top3.addOrReplaceChild("bunch4_r2", CubeListBuilder.create().texOffs(45, 3).addBox(-0.7207F, -0.9823F, -1.7937F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3947F, 0.0437F, 0.7122F, 0.5989F, 0.2389F, -0.1742F));
		PartDefinition Bang3 = BangSection.addOrReplaceChild("Bang3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));
		PartDefinition Bottom4 = Bang3.addOrReplaceChild("Bottom4", CubeListBuilder.create().texOffs(45, 3).addBox(-0.5551F, -1.4883F, -2.356F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top4 = Bang3.addOrReplaceChild("Top4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch5_r1 = Top4.addOrReplaceChild("bunch5_r1", CubeListBuilder.create().texOffs(45, 3).addBox(-0.475F, -0.5796F, -1.6122F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
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
