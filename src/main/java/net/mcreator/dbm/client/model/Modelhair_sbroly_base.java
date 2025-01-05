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
public class Modelhair_sbroly_base<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhair_sbroly_base"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhair_sbroly_base(ModelPart root) {
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
		PartDefinition Back = Hair.addOrReplaceChild("Back", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1167F, -29.9912F, 5.3554F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Back.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -1.3688F, -0.1657F, -0.6158F));
		PartDefinition cube_r2 = Back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -1.8283F, -0.2179F, -0.3137F));
		PartDefinition cube_r3 = Back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -2.342F, 0.0205F, -0.0629F));
		PartDefinition cube_r4 = Back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -1.3688F, -0.1657F, -0.6158F));
		PartDefinition cube_r5 = Back.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -1.8283F, -0.2179F, -0.3137F));
		PartDefinition cube_r6 = Back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -2.342F, 0.0205F, -0.0629F));
		PartDefinition cube_r7 = Back.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -1.3688F, 0.1657F, -0.1783F));
		PartDefinition cube_r8 = Back.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -1.8283F, 0.2179F, -0.4804F));
		PartDefinition cube_r9 = Back.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -2.342F, -0.0205F, -0.7312F));
		PartDefinition cube_r10 = Back.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -0.6558F, 0.0002F, 0.2501F));
		PartDefinition cube_r11 = Back.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -1.0796F, 0.2374F, 0.063F));
		PartDefinition cube_r12 = Back.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -1.6501F, 0.2241F, -0.2909F));
		PartDefinition cube_r13 = Back.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.0076F, 0.088F, 0.649F));
		PartDefinition cube_r14 = Back.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.4526F, 0.2441F, 0.3876F));
		PartDefinition cube_r15 = Back.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.9985F, 0.1089F, 0.0652F));
		PartDefinition cube_r16 = Back.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.0076F, -0.088F, -0.649F));
		PartDefinition cube_r17 = Back.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.4526F, -0.2441F, -0.3876F));
		PartDefinition cube_r18 = Back.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.9985F, -0.1089F, -0.0652F));
		PartDefinition cube_r19 = Back.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -0.5571F, 0.247F, -0.612F));
		PartDefinition cube_r20 = Back.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -0.9398F, -0.0106F, -0.4546F));
		PartDefinition cube_r21 = Back.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -1.4403F, -0.0579F, -0.1129F));
		PartDefinition cube_r22 = Back.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -0.5571F, 0.247F, -0.4811F));
		PartDefinition cube_r23 = Back.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -0.9398F, -0.0106F, -0.3237F));
		PartDefinition cube_r24 = Back.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -1.4403F, -0.0579F, 0.018F));
		PartDefinition cube_r25 = Back.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -1.1263F, -0.0725F, -0.3159F));
		PartDefinition cube_r26 = Back.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -0.733F, 0.1528F, -0.5162F));
		PartDefinition cube_r27 = Back.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -1.6369F, -0.0533F, 0.0289F));
		PartDefinition cube_r28 = Back.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.4628F, -0.1749F, -0.274F));
		PartDefinition cube_r29 = Back.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.0351F, -0.0238F, -0.5359F));
		PartDefinition cube_r30 = Back.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.9861F, -0.0402F, 0.0454F));
		PartDefinition cube_r31 = Back.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -1.2129F, 0.0207F, 0.5647F));
		PartDefinition cube_r32 = Back.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -0.8298F, -0.1854F, 0.7854F));
		PartDefinition cube_r33 = Back.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -1.701F, -0.0246F, 0.223F));
		PartDefinition cube_r34 = Back.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -1.7208F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -1.2461F, 0.0417F, 0.3019F));
		PartDefinition cube_r35 = Back.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, -2.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -0.8579F, -0.1575F, 0.5284F));
		PartDefinition cube_r36 = Back.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, -2.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -1.7393F, -0.0159F, -0.038F));
		PartDefinition cube_r37 = Back.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -0.2775F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, 3.9345F, 2.873F, -1.6913F, -0.014F, -0.3704F));
		PartDefinition cube_r38 = Back.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -1.6688F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, -2.0621F, -0.087F, -1.2003F, 0.0274F, -0.0281F));
		PartDefinition cube_r39 = Back.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -0.94F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, -2.0621F, -0.087F, -0.8158F, -0.1816F, 0.1896F));
		PartDefinition Back2 = Hair.addOrReplaceChild("Back2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1167F, -29.9912F, 3.3554F, 0.6041F, 0.7318F, 0.4321F));
		PartDefinition cube_r40 = Back2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -1.3688F, -0.1657F, -0.6158F));
		PartDefinition cube_r41 = Back2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -1.8283F, -0.2179F, -0.3137F));
		PartDefinition cube_r42 = Back2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, 2.0666F, -1.8249F, -2.342F, 0.0205F, -0.0629F));
		PartDefinition cube_r43 = Back2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -1.3688F, -0.1657F, -0.6158F));
		PartDefinition cube_r44 = Back2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -1.8283F, -0.2179F, -0.3137F));
		PartDefinition cube_r45 = Back2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, 3.0868F, -0.4072F, -2.342F, 0.0205F, -0.0629F));
		PartDefinition cube_r46 = Back2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -1.3688F, 0.1657F, -0.1783F));
		PartDefinition cube_r47 = Back2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -1.8283F, 0.2179F, -0.4804F));
		PartDefinition cube_r48 = Back2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, 3.0868F, -0.4072F, -2.342F, -0.0205F, -0.7312F));
		PartDefinition cube_r49 = Back2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -0.6558F, 0.0002F, 0.2501F));
		PartDefinition cube_r50 = Back2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -1.0796F, 0.2374F, 0.063F));
		PartDefinition cube_r51 = Back2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, -2.2132F, 1.4478F, -1.6501F, 0.2241F, -0.2909F));
		PartDefinition cube_r52 = Back2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.0076F, 0.088F, 0.649F));
		PartDefinition cube_r53 = Back2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.4526F, 0.2441F, 0.3876F));
		PartDefinition cube_r54 = Back2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, -1.6567F, -0.0362F, -1.9985F, 0.1089F, 0.0652F));
		PartDefinition cube_r55 = Back2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.0076F, -0.088F, -0.649F));
		PartDefinition cube_r56 = Back2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.4526F, -0.2441F, -0.3876F));
		PartDefinition cube_r57 = Back2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, -1.6567F, -0.0362F, -1.9985F, -0.1089F, -0.0652F));
		PartDefinition cube_r58 = Back2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -0.5571F, 0.247F, -0.612F));
		PartDefinition cube_r59 = Back2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -0.9398F, -0.0106F, -0.4546F));
		PartDefinition cube_r60 = Back2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, -1.8289F, -0.0362F, -1.4403F, -0.0579F, -0.1129F));
		PartDefinition cube_r61 = Back2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -0.5571F, 0.247F, -0.4811F));
		PartDefinition cube_r62 = Back2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -0.9398F, -0.0106F, -0.3237F));
		PartDefinition cube_r63 = Back2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, -1.8289F, 0.3481F, -1.4403F, -0.0579F, 0.018F));
		PartDefinition cube_r64 = Back2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -1.1263F, -0.0725F, -0.3159F));
		PartDefinition cube_r65 = Back2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -0.733F, 0.1528F, -0.5162F));
		PartDefinition cube_r66 = Back2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, -0.2919F, -0.8709F, -1.6369F, -0.0533F, 0.0289F));
		PartDefinition cube_r67 = Back2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.4628F, -0.1749F, -0.274F));
		PartDefinition cube_r68 = Back2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.0351F, -0.0238F, -0.5359F));
		PartDefinition cube_r69 = Back2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, -0.3966F, -1.7524F, -1.9861F, -0.0402F, 0.0454F));
		PartDefinition cube_r70 = Back2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -1.2129F, 0.0207F, 0.5647F));
		PartDefinition cube_r71 = Back2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -0.8298F, -0.1854F, 0.7854F));
		PartDefinition cube_r72 = Back2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, -0.3966F, -0.1359F, -1.701F, -0.0246F, 0.223F));
		PartDefinition cube_r73 = Back2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -1.7208F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -1.2461F, 0.0417F, 0.3019F));
		PartDefinition cube_r74 = Back2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, -2.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -0.8579F, -0.1575F, 0.5284F));
		PartDefinition cube_r75 = Back2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, -2.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, 0.5543F, -1.3119F, -1.7393F, -0.0159F, -0.038F));
		PartDefinition cube_r76 = Back2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -0.2775F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, 3.9345F, 2.873F, -1.6913F, -0.014F, -0.3704F));
		PartDefinition cube_r77 = Back2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -1.6688F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, -2.0621F, -0.087F, -1.2003F, 0.0274F, -0.0281F));
		PartDefinition cube_r78 = Back2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -0.94F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, -2.0621F, -0.087F, -0.8158F, -0.1816F, 0.1896F));
		PartDefinition Back3 = Hair.addOrReplaceChild("Back3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1167F, -29.9912F, 3.3554F, 0.6041F, -0.7318F, -0.4321F));
		PartDefinition cube_r79 = Back3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, 2.0666F, -1.8249F, -1.3688F, 0.1657F, 0.6158F));
		PartDefinition cube_r80 = Back3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, 2.0666F, -1.8249F, -1.8283F, 0.2179F, 0.3137F));
		PartDefinition cube_r81 = Back3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, 2.0666F, -1.8249F, -2.342F, -0.0205F, 0.0629F));
		PartDefinition cube_r82 = Back3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.7354F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, 3.0868F, -0.4072F, -1.3688F, 0.1657F, 0.6158F));
		PartDefinition cube_r83 = Back3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.3142F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, 3.0868F, -0.4072F, -1.8283F, 0.2179F, 0.3137F));
		PartDefinition cube_r84 = Back3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.571F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, 3.0868F, -0.4072F, -2.342F, -0.0205F, 0.0629F));
		PartDefinition cube_r85 = Back3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3846F, -2.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, 3.0868F, -0.4072F, -1.3688F, -0.1657F, 0.1783F));
		PartDefinition cube_r86 = Back3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4878F, -1.7425F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, 3.0868F, -0.4072F, -1.8283F, -0.2179F, 0.4804F));
		PartDefinition cube_r87 = Back3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.034F, -2.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, 3.0868F, -0.4072F, -2.342F, 0.0205F, 0.7312F));
		PartDefinition cube_r88 = Back3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, -2.2132F, 1.4478F, -0.6558F, -0.0002F, -0.2501F));
		PartDefinition cube_r89 = Back3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, -2.2132F, 1.4478F, -1.0796F, -0.2374F, -0.063F));
		PartDefinition cube_r90 = Back3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, -2.2132F, 1.4478F, -1.6501F, -0.2241F, 0.2909F));
		PartDefinition cube_r91 = Back3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, -1.6567F, -0.0362F, -1.0076F, -0.088F, -0.649F));
		PartDefinition cube_r92 = Back3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, -1.6567F, -0.0362F, -1.4526F, -0.2441F, -0.3876F));
		PartDefinition cube_r93 = Back3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, -1.6567F, -0.0362F, -1.9985F, -0.1089F, -0.0652F));
		PartDefinition cube_r94 = Back3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, -1.6567F, -0.0362F, -1.0076F, 0.088F, 0.649F));
		PartDefinition cube_r95 = Back3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, -1.6567F, -0.0362F, -1.4526F, 0.2441F, 0.3876F));
		PartDefinition cube_r96 = Back3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, -1.6567F, -0.0362F, -1.9985F, 0.1089F, 0.0652F));
		PartDefinition cube_r97 = Back3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, -1.8289F, -0.0362F, -0.5571F, -0.247F, 0.612F));
		PartDefinition cube_r98 = Back3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, -1.8289F, -0.0362F, -0.9398F, 0.0106F, 0.4546F));
		PartDefinition cube_r99 = Back3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, -1.8289F, -0.0362F, -1.4403F, 0.0579F, 0.1129F));
		PartDefinition cube_r100 = Back3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, -1.8289F, 0.3481F, -0.5571F, -0.247F, 0.4811F));
		PartDefinition cube_r101 = Back3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, -1.8289F, 0.3481F, -0.9398F, 0.0106F, 0.3237F));
		PartDefinition cube_r102 = Back3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, -1.8289F, 0.3481F, -1.4403F, 0.0579F, -0.018F));
		PartDefinition cube_r103 = Back3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, -0.2919F, -0.8709F, -1.1263F, 0.0725F, 0.3159F));
		PartDefinition cube_r104 = Back3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, -0.2919F, -0.8709F, -0.733F, -0.1528F, 0.5162F));
		PartDefinition cube_r105 = Back3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, -0.2919F, -0.8709F, -1.6369F, 0.0533F, -0.0289F));
		PartDefinition cube_r106 = Back3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4167F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, -0.3966F, -1.7524F, -1.4628F, 0.1749F, 0.274F));
		PartDefinition cube_r107 = Back3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.8378F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, -0.3966F, -1.7524F, -1.0351F, 0.0238F, 0.5359F));
		PartDefinition cube_r108 = Back3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.6696F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, -0.3966F, -1.7524F, -1.9861F, 0.0402F, -0.0454F));
		PartDefinition cube_r109 = Back3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.3853F, -1.7175F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, -0.3966F, -0.1359F, -1.2129F, -0.0207F, -0.5647F));
		PartDefinition cube_r110 = Back3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.2822F, -2.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, -0.3966F, -0.1359F, -0.8298F, 0.1854F, -0.7854F));
		PartDefinition cube_r111 = Back3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.1326F, -2.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, -0.3966F, -0.1359F, -1.701F, 0.0246F, -0.223F));
		PartDefinition cube_r112 = Back3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.5983F, -1.7208F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, 0.5543F, -1.3119F, -1.2461F, -0.0417F, -0.3019F));
		PartDefinition cube_r113 = Back3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4881F, -2.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, 0.5543F, -1.3119F, -0.8579F, 0.1575F, -0.5284F));
		PartDefinition cube_r114 = Back3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.0661F, -2.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, 0.5543F, -1.3119F, -1.7393F, 0.0159F, 0.038F));
		PartDefinition cube_r115 = Back3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-1.4045F, -0.2775F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0072F, 3.9345F, 2.873F, -1.6913F, 0.014F, 0.3704F));
		PartDefinition cube_r116 = Back3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.2385F, -1.6688F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, -2.0621F, -0.087F, -1.2003F, -0.0274F, 0.0281F));
		PartDefinition cube_r117 = Back3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.4373F, -0.94F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, -2.0621F, -0.087F, -0.8158F, 0.1816F, -0.1896F));
		PartDefinition bone = Hair.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Bangs = bone.addOrReplaceChild("Bangs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BangSection2 = Bangs.addOrReplaceChild("BangSection2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));
		PartDefinition Bang2 = BangSection2.addOrReplaceChild("Bang2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom = Bang2.addOrReplaceChild("Bottom", CubeListBuilder.create(), PartPose.offset(2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch5_r1 = Bottom.addOrReplaceChild("bunch5_r1", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));
		PartDefinition bunch4_r1 = Bottom.addOrReplaceChild("bunch4_r1", CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));
		PartDefinition Top = Bang2.addOrReplaceChild("Top", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r1 = Top.addOrReplaceChild("Top_r1", CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));
		PartDefinition Top_r2 = Top.addOrReplaceChild("Top_r2", CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));
		PartDefinition Bang1 = BangSection2.addOrReplaceChild("Bang1", CubeListBuilder.create(), PartPose.offset(-1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom2 = Bang1.addOrReplaceChild("Bottom2", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch5_r2 = Bottom2.addOrReplaceChild("bunch5_r2", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));
		PartDefinition bunch4_r2 = Bottom2.addOrReplaceChild("bunch4_r2", CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));
		PartDefinition bunch3_r1 = Bottom2.addOrReplaceChild("bunch3_r1", CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));
		PartDefinition Top2 = Bang1.addOrReplaceChild("Top2", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch5_r3 = Top2.addOrReplaceChild("bunch5_r3", CubeListBuilder.create().texOffs(54, 59).addBox(-0.2368F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4934F, 1.0321F, 5.9826F, -1.9506F, -0.7973F, 1.9545F));
		PartDefinition bunch4_r3 = Top2.addOrReplaceChild("bunch4_r3", CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));
		PartDefinition bunch3_r2 = Top2.addOrReplaceChild("bunch3_r2", CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));
		PartDefinition BangSection = Bangs.addOrReplaceChild("BangSection", CubeListBuilder.create(), PartPose.offset(2.002F, -31.031F, -3.003F));
		PartDefinition Bang = BangSection.addOrReplaceChild("Bang", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));
		PartDefinition Bottom3 = Bang.addOrReplaceChild("Bottom3", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition bunch4_r4 = Bottom3.addOrReplaceChild("bunch4_r4", CubeListBuilder.create().texOffs(55, 59).addBox(-1.1126F, -1.2629F, -0.3133F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, -30.955F, -5.7829F, -0.1567F, 0.6959F, -0.3871F));
		PartDefinition Top3 = Bang.addOrReplaceChild("Top3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition bunch4_r5 = Top3.addOrReplaceChild("bunch4_r5", CubeListBuilder.create().texOffs(57, 60).addBox(-1.0325F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, 0.7266F, 0.5984F, 0.4978F, 0.6959F, -0.3871F));
		PartDefinition Bang3 = BangSection.addOrReplaceChild("Bang3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));
		PartDefinition Bottom4 = Bang3.addOrReplaceChild("Bottom4", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5714F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top4 = Bang3.addOrReplaceChild("Top4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch5_r4 = Top4.addOrReplaceChild("bunch5_r4", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4913F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Bangs5 = bone.addOrReplaceChild("Bangs5", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition BangSection9 = Bangs5.addOrReplaceChild("BangSection9", CubeListBuilder.create(), PartPose.offsetAndRotation(2.002F, -31.031F, -4.004F, 0.8228F, -0.609F, -0.2567F));
		PartDefinition Bang16 = BangSection9.addOrReplaceChild("Bang16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom17 = Bang16.addOrReplaceChild("Bottom17", CubeListBuilder.create(), PartPose.offset(-2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch6_r1 = Bottom17.addOrReplaceChild("bunch6_r1", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.5726F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8068F, -30.1974F, 0.3136F, 2.5868F, 0.7856F, -2.0333F));
		PartDefinition bunch5_r5 = Bottom17.addOrReplaceChild("bunch5_r5", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(0.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6614F, -31.0456F, -1.1421F, -2.3422F, -0.4864F, 0.7071F));
		PartDefinition Top17 = Bang16.addOrReplaceChild("Top17", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r3 = Top17.addOrReplaceChild("Top_r3", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-0.6043F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1952F, 1.8346F, 6.1194F, -2.9808F, 0.7856F, -2.0333F));
		PartDefinition Top_r4 = Top17.addOrReplaceChild("Top_r4", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(0.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6594F, 0.8864F, 4.6637F, -1.6266F, -0.4864F, 0.7071F));
		PartDefinition Bang17 = BangSection9.addOrReplaceChild("Bang17", CubeListBuilder.create(), PartPose.offset(1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom18 = Bang17.addOrReplaceChild("Bottom18", CubeListBuilder.create(), PartPose.offset(0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r2 = Bottom18.addOrReplaceChild("bunch6_r2", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-1.0282F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0934F, 1.3321F, 6.4826F, -2.8058F, 0.7973F, -1.9545F));
		PartDefinition bunch5_r6 = Bottom18.addOrReplaceChild("bunch5_r6", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-2.0563F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4025F, 0.8696F, 4.1343F, -1.4268F, -0.4483F, 0.686F));
		PartDefinition bunch4_r6 = Bottom18.addOrReplaceChild("bunch4_r6", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1001F, 1.2323F, 0.4004F, -0.1745F, -0.2182F, 0.0F));
		PartDefinition Top18 = Bang17.addOrReplaceChild("Top18", CubeListBuilder.create(), PartPose.offset(0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r3 = Top18.addOrReplaceChild("bunch6_r3", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-1.3848F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.4934F, 1.0321F, 5.9826F, -1.9506F, 0.7973F, -1.9545F));
		PartDefinition bunch5_r7 = Top18.addOrReplaceChild("bunch5_r7", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-2.0168F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0025F, 1.1696F, 4.4343F, -0.5716F, -0.4483F, 0.686F));
		PartDefinition bunch4_r7 = Top18.addOrReplaceChild("bunch4_r7", CubeListBuilder.create().texOffs(55, 60).mirror().addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, -0.2182F, 0.0F));
		PartDefinition BangSection10 = Bangs5.addOrReplaceChild("BangSection10", CubeListBuilder.create(), PartPose.offset(-2.002F, -31.031F, -3.003F));
		PartDefinition Bang18 = BangSection10.addOrReplaceChild("Bang18", CubeListBuilder.create(), PartPose.offsetAndRotation(2.002F, 0.0F, -1.001F, 0.7089F, 0.745F, 0.1584F));
		PartDefinition Bottom19 = Bang18.addOrReplaceChild("Bottom19", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition Top19 = Bang18.addOrReplaceChild("Top19", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition bunch5_r8 = Top19.addOrReplaceChild("bunch5_r8", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-0.4089F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5963F, 0.7266F, 0.5984F, 0.4978F, -0.6959F, 0.3871F));
		PartDefinition Bang19 = BangSection10.addOrReplaceChild("Bang19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.6109F, 0.0F));
		PartDefinition Bottom20 = Bang19.addOrReplaceChild("Bottom20", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-1.0302F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top20 = Bang19.addOrReplaceChild("Top20", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch6_r4 = Top20.addOrReplaceChild("bunch6_r4", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.9502F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Bangs6 = bone.addOrReplaceChild("Bangs6", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 1.0F));
		PartDefinition BangSection11 = Bangs6.addOrReplaceChild("BangSection11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));
		PartDefinition Bang20 = BangSection11.addOrReplaceChild("Bang20", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom21 = Bang20.addOrReplaceChild("Bottom21", CubeListBuilder.create(), PartPose.offset(2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch7_r1 = Bottom21.addOrReplaceChild("bunch7_r1", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));
		PartDefinition bunch6_r5 = Bottom21.addOrReplaceChild("bunch6_r5", CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));
		PartDefinition Top21 = Bang20.addOrReplaceChild("Top21", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r5 = Top21.addOrReplaceChild("Top_r5", CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));
		PartDefinition Top_r6 = Top21.addOrReplaceChild("Top_r6", CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));
		PartDefinition Bang21 = BangSection11.addOrReplaceChild("Bang21", CubeListBuilder.create(), PartPose.offset(-1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom22 = Bang21.addOrReplaceChild("Bottom22", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch7_r2 = Bottom22.addOrReplaceChild("bunch7_r2", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));
		PartDefinition bunch6_r6 = Bottom22.addOrReplaceChild("bunch6_r6", CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));
		PartDefinition bunch5_r9 = Bottom22.addOrReplaceChild("bunch5_r9", CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));
		PartDefinition Top22 = Bang21.addOrReplaceChild("Top22", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch7_r3 = Top22.addOrReplaceChild("bunch7_r3", CubeListBuilder.create().texOffs(54, 59).addBox(-0.2368F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4934F, 1.0321F, 5.9826F, -1.9506F, -0.7973F, 1.9545F));
		PartDefinition bunch6_r7 = Top22.addOrReplaceChild("bunch6_r7", CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));
		PartDefinition bunch5_r10 = Top22.addOrReplaceChild("bunch5_r10", CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));
		PartDefinition BangSection12 = Bangs6.addOrReplaceChild("BangSection12", CubeListBuilder.create(), PartPose.offset(2.002F, -31.031F, -3.003F));
		PartDefinition Bang22 = BangSection12.addOrReplaceChild("Bang22", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));
		PartDefinition Bottom23 = Bang22.addOrReplaceChild("Bottom23", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition Top23 = Bang22.addOrReplaceChild("Top23", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition Bang23 = BangSection12.addOrReplaceChild("Bang23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));
		PartDefinition Bottom24 = Bang23.addOrReplaceChild("Bottom24", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5714F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top24 = Bang23.addOrReplaceChild("Top24", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch7_r4 = Top24.addOrReplaceChild("bunch7_r4", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4913F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Bangs4 = bone.addOrReplaceChild("Bangs4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BangSection7 = Bangs4.addOrReplaceChild("BangSection7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));
		PartDefinition Bang12 = BangSection7.addOrReplaceChild("Bang12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom13 = Bang12.addOrReplaceChild("Bottom13", CubeListBuilder.create(), PartPose.offset(2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch6_r8 = Bottom13.addOrReplaceChild("bunch6_r8", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));
		PartDefinition bunch5_r11 = Bottom13.addOrReplaceChild("bunch5_r11", CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));
		PartDefinition Top13 = Bang12.addOrReplaceChild("Top13", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r7 = Top13.addOrReplaceChild("Top_r7", CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));
		PartDefinition Top_r8 = Top13.addOrReplaceChild("Top_r8", CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));
		PartDefinition Bang13 = BangSection7.addOrReplaceChild("Bang13", CubeListBuilder.create(), PartPose.offset(-1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom14 = Bang13.addOrReplaceChild("Bottom14", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r9 = Bottom14.addOrReplaceChild("bunch6_r9", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));
		PartDefinition bunch5_r12 = Bottom14.addOrReplaceChild("bunch5_r12", CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));
		PartDefinition bunch4_r8 = Bottom14.addOrReplaceChild("bunch4_r8", CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));
		PartDefinition Top14 = Bang13.addOrReplaceChild("Top14", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r10 = Top14.addOrReplaceChild("bunch6_r10", CubeListBuilder.create().texOffs(54, 59).addBox(-0.2368F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4934F, 1.0321F, 5.9826F, -1.9506F, -0.7973F, 1.9545F));
		PartDefinition bunch5_r13 = Top14.addOrReplaceChild("bunch5_r13", CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));
		PartDefinition bunch4_r9 = Top14.addOrReplaceChild("bunch4_r9", CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));
		PartDefinition BangSection8 = Bangs4.addOrReplaceChild("BangSection8", CubeListBuilder.create(), PartPose.offset(2.002F, -31.031F, -3.003F));
		PartDefinition Bang14 = BangSection8.addOrReplaceChild("Bang14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));
		PartDefinition Bottom15 = Bang14.addOrReplaceChild("Bottom15", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition bunch5_r14 = Bottom15.addOrReplaceChild("bunch5_r14", CubeListBuilder.create().texOffs(55, 59).addBox(-1.1126F, -1.2629F, -0.3133F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, -30.955F, -5.7829F, -0.1567F, 0.6959F, -0.3871F));
		PartDefinition Top15 = Bang14.addOrReplaceChild("Top15", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition bunch5_r15 = Top15.addOrReplaceChild("bunch5_r15", CubeListBuilder.create().texOffs(57, 60).addBox(-1.0325F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, 0.7266F, 0.5984F, 0.4978F, 0.6959F, -0.3871F));
		PartDefinition Bang15 = BangSection8.addOrReplaceChild("Bang15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));
		PartDefinition Bottom16 = Bang15.addOrReplaceChild("Bottom16", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5714F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top16 = Bang15.addOrReplaceChild("Top16", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch6_r11 = Top16.addOrReplaceChild("bunch6_r11", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4913F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Bangs2 = bone.addOrReplaceChild("Bangs2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 2.0F));
		PartDefinition BangSection3 = Bangs2.addOrReplaceChild("BangSection3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));
		PartDefinition Bang4 = BangSection3.addOrReplaceChild("Bang4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom5 = Bang4.addOrReplaceChild("Bottom5", CubeListBuilder.create(), PartPose.offset(2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch6_r12 = Bottom5.addOrReplaceChild("bunch6_r12", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));
		PartDefinition bunch5_r16 = Bottom5.addOrReplaceChild("bunch5_r16", CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));
		PartDefinition bunch4_r10 = Bottom5.addOrReplaceChild("bunch4_r10", CubeListBuilder.create().texOffs(56, 60).addBox(1.2235F, -1.6532F, 0.708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -30.8336F, -5.7678F, -0.4171F, -0.3189F, 0.0649F));
		PartDefinition Top5 = Bang4.addOrReplaceChild("Top5", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r9 = Top5.addOrReplaceChild("Top_r9", CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));
		PartDefinition Top_r10 = Top5.addOrReplaceChild("Top_r10", CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));
		PartDefinition Top_r11 = Top5.addOrReplaceChild("Top_r11", CubeListBuilder.create().texOffs(52, 60).addBox(0.2327F, -0.38F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9214F, 1.348F, 0.302F, 0.5429F, -0.3189F, 0.0649F));
		PartDefinition Bang5 = BangSection3.addOrReplaceChild("Bang5", CubeListBuilder.create(), PartPose.offset(-1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom6 = Bang5.addOrReplaceChild("Bottom6", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r13 = Bottom6.addOrReplaceChild("bunch6_r13", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));
		PartDefinition bunch5_r17 = Bottom6.addOrReplaceChild("bunch5_r17", CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));
		PartDefinition bunch4_r11 = Bottom6.addOrReplaceChild("bunch4_r11", CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));
		PartDefinition Top6 = Bang5.addOrReplaceChild("Top6", CubeListBuilder.create(), PartPose.offset(-0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch6_r14 = Top6.addOrReplaceChild("bunch6_r14", CubeListBuilder.create().texOffs(54, 59).addBox(-0.2368F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4934F, 1.0321F, 5.9826F, -1.9506F, -0.7973F, 1.9545F));
		PartDefinition bunch5_r18 = Top6.addOrReplaceChild("bunch5_r18", CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));
		PartDefinition bunch4_r12 = Top6.addOrReplaceChild("bunch4_r12", CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));
		PartDefinition BangSection4 = Bangs2.addOrReplaceChild("BangSection4", CubeListBuilder.create(), PartPose.offset(2.002F, -31.031F, -3.003F));
		PartDefinition Bang6 = BangSection4.addOrReplaceChild("Bang6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));
		PartDefinition Bottom7 = Bang6.addOrReplaceChild("Bottom7", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition bunch5_r19 = Bottom7.addOrReplaceChild("bunch5_r19", CubeListBuilder.create().texOffs(55, 59).addBox(-1.1126F, -1.2629F, -0.3133F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, -30.955F, -5.7829F, -0.1567F, 0.6959F, -0.3871F));
		PartDefinition Top7 = Bang6.addOrReplaceChild("Top7", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition bunch5_r20 = Top7.addOrReplaceChild("bunch5_r20", CubeListBuilder.create().texOffs(57, 60).addBox(-1.0325F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, 0.7266F, 0.5984F, 0.4978F, 0.6959F, -0.3871F));
		PartDefinition Bang7 = BangSection4.addOrReplaceChild("Bang7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));
		PartDefinition Bottom8 = Bang7.addOrReplaceChild("Bottom8", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5714F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top8 = Bang7.addOrReplaceChild("Top8", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
		PartDefinition bunch6_r15 = Top8.addOrReplaceChild("bunch6_r15", CubeListBuilder.create().texOffs(56, 60).addBox(-0.4913F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Bangs3 = bone.addOrReplaceChild("Bangs3", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition BangSection5 = Bangs3.addOrReplaceChild("BangSection5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.002F, -31.031F, -4.004F, 0.8228F, -0.609F, -0.2567F));
		PartDefinition Bang8 = BangSection5.addOrReplaceChild("Bang8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2252F, 0.6507F));
		PartDefinition Bottom9 = Bang8.addOrReplaceChild("Bottom9", CubeListBuilder.create(), PartPose.offset(-2.002F, 30.8058F, 3.3533F));
		PartDefinition bunch7_r5 = Bottom9.addOrReplaceChild("bunch7_r5", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.5726F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8068F, -30.1974F, 0.3136F, 2.5868F, 0.7856F, -2.0333F));
		PartDefinition bunch6_r16 = Bottom9.addOrReplaceChild("bunch6_r16", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(0.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6614F, -31.0456F, -1.1421F, -2.3422F, -0.4864F, 0.7071F));
		PartDefinition bunch5_r21 = Bottom9.addOrReplaceChild("bunch5_r21", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-2.2235F, -1.6532F, 0.708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.002F, -30.8336F, -5.7678F, -0.4171F, 0.3189F, -0.0649F));
		PartDefinition Top9 = Bang8.addOrReplaceChild("Top9", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2262F, -2.4524F));
		PartDefinition Top_r12 = Top9.addOrReplaceChild("Top_r12", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-0.6043F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1952F, 1.8346F, 6.1194F, -2.9808F, 0.7856F, -2.0333F));
		PartDefinition Top_r13 = Top9.addOrReplaceChild("Top_r13", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(0.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6594F, 0.8864F, 4.6637F, -1.6266F, -0.4864F, 0.7071F));
		PartDefinition Top_r14 = Top9.addOrReplaceChild("Top_r14", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-1.2327F, -0.38F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9214F, 1.348F, 0.302F, 0.5429F, 0.3189F, -0.0649F));
		PartDefinition Bang9 = BangSection5.addOrReplaceChild("Bang9", CubeListBuilder.create(), PartPose.offset(1.7517F, -0.0883F, -0.3825F));
		PartDefinition Bottom10 = Bang9.addOrReplaceChild("Bottom10", CubeListBuilder.create(), PartPose.offset(0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch7_r6 = Bottom10.addOrReplaceChild("bunch7_r6", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-1.0282F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0934F, 1.3321F, 6.4826F, -2.8058F, 0.7973F, -1.9545F));
		PartDefinition bunch6_r17 = Bottom10.addOrReplaceChild("bunch6_r17", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-2.0563F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4025F, 0.8696F, 4.1343F, -1.4268F, -0.4483F, 0.686F));
		PartDefinition bunch5_r22 = Bottom10.addOrReplaceChild("bunch5_r22", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1001F, 1.2323F, 0.4004F, -0.1745F, -0.2182F, 0.0F));
		PartDefinition Top10 = Bang9.addOrReplaceChild("Top10", CubeListBuilder.create(), PartPose.offset(0.1001F, -1.2012F, -2.002F));
		PartDefinition bunch7_r7 = Top10.addOrReplaceChild("bunch7_r7", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-1.3848F, -1.422F, -3.0352F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.4934F, 1.0321F, 5.9826F, -1.9506F, 0.7973F, -1.9545F));
		PartDefinition bunch6_r18 = Top10.addOrReplaceChild("bunch6_r18", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-2.0168F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0025F, 1.1696F, 4.4343F, -0.5716F, -0.4483F, 0.686F));
		PartDefinition bunch5_r23 = Top10.addOrReplaceChild("bunch5_r23", CubeListBuilder.create().texOffs(55, 60).mirror().addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, -0.2182F, 0.0F));
		PartDefinition BangSection6 = Bangs3.addOrReplaceChild("BangSection6", CubeListBuilder.create(), PartPose.offset(-2.002F, -31.031F, -3.003F));
		PartDefinition Bang10 = BangSection6.addOrReplaceChild("Bang10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.002F, 0.0F, -1.001F, 0.7089F, 0.745F, 0.1584F));
		PartDefinition Bottom11 = Bang10.addOrReplaceChild("Bottom11", CubeListBuilder.create(), PartPose.offset(0.0F, 31.031F, 4.004F));
		PartDefinition Top11 = Bang10.addOrReplaceChild("Top11", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6506F, -2.3774F));
		PartDefinition Bang11 = BangSection6.addOrReplaceChild("Bang11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.6109F, 0.0F));
		PartDefinition Bottom12 = Bang11.addOrReplaceChild("Bottom12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Top12 = Bang11.addOrReplaceChild("Top12", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6757F, -2.4274F));
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
