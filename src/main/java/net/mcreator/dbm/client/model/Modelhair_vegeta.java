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
public class Modelhair_vegeta<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelhair_vegeta"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelhair_vegeta(ModelPart root) {
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
		PartDefinition hair = Head.addOrReplaceChild("hair",
				CubeListBuilder.create().texOffs(50, 54).addBox(-1.0F, -37.5017F, -1.5554F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-2.125F, -35.5017F, -2.1804F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-2.125F, -34.0017F, 0.8196F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-1.125F, -33.5017F, 0.0696F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-0.625F, -32.5017F, 1.0696F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-1.625F, -32.7517F, 1.5696F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-1.375F, -33.0017F, 0.5696F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-3.0F, -34.9392F, -1.0554F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-2.375F, -34.2517F, -0.1804F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-3.625F, -33.6892F, -0.1804F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-3.0625F, -34.0642F, 0.5696F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-3.0625F, -33.5642F, 1.8196F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-0.0625F, -33.5642F, 1.8196F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57).addBox(-3.0625F, -33.0642F, 0.0696F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-3.0625F, -32.5642F, 0.8196F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0377F, -30.0372F, -1.0082F, -0.0815F, -0.0658F, -0.6431F));
		PartDefinition cube_r2 = hair.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0377F, -30.0372F, -1.0082F, -0.225F, -0.0104F, -0.4753F));
		PartDefinition cube_r3 = hair.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-2.2877F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0377F, -30.0372F, -3.2582F, -0.0815F, 0.0658F, 0.6431F));
		PartDefinition cube_r4 = hair.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0377F, -30.0372F, -3.2582F, -0.0815F, -0.0658F, -0.6431F));
		PartDefinition cube_r5 = hair.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 57).addBox(1.3233F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0377F, -30.0372F, -3.2582F, -0.225F, -0.0104F, -0.4753F));
		PartDefinition cube_r6 = hair.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3502F, -31.4747F, -1.6957F, -0.3477F, -0.2692F, -0.6331F));
		PartDefinition cube_r7 = hair.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3502F, -31.4747F, -1.6957F, -0.5174F, -0.1697F, -0.4837F));
		PartDefinition cube_r8 = hair.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3502F, -30.9122F, 0.1168F, -0.3477F, -0.2692F, -0.5982F));
		PartDefinition cube_r9 = hair.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3502F, -30.9122F, 0.1168F, -0.5174F, -0.1697F, -0.4837F));
		PartDefinition cube_r10 = hair.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5377F, -32.0997F, -1.4457F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r11 = hair.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5377F, -32.0997F, -1.4457F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r12 = hair.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5377F, -31.2872F, -2.5082F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r13 = hair.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5377F, -31.2872F, -2.5082F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r14 = hair.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4752F, -32.5997F, -2.5082F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r15 = hair.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4752F, -32.5997F, -2.5082F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r16 = hair.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5873F, -31.0997F, -2.0082F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r17 = hair.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5873F, -31.0997F, -2.0082F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r18 = hair.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0377F, -31.2247F, -2.7582F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r19 = hair.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -3.5645F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0377F, -31.2247F, -2.7582F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r20 = hair.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2748F, -30.3497F, -1.8832F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r21 = hair.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2748F, -30.3497F, -1.8832F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r22 = hair.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0873F, -32.2872F, -2.0082F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r23 = hair.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -4.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -30.7872F, -3.0082F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r24 = hair.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -30.7872F, -3.0082F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r25 = hair.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5873F, -29.7872F, -1.8832F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r26 = hair.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-2.2877F, -2.3895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5873F, -29.7872F, -1.8832F, -2.6822F, 0.3687F, 2.7587F));
		PartDefinition cube_r27 = hair.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.3895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5873F, -29.7872F, -1.8832F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r28 = hair.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3998F, -31.7247F, -1.0707F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r29 = hair.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3998F, -31.7247F, -1.0707F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r30 = hair.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0873F, -31.4747F, -0.2582F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r31 = hair.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0873F, -31.4747F, -0.2582F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r32 = hair.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8998F, -33.4122F, 0.5543F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r33 = hair.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8998F, -33.4122F, 0.5543F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r34 = hair.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4623F, -33.2247F, -0.4457F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r35 = hair.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4623F, -33.2247F, -0.4457F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r36 = hair.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2877F, -31.5997F, 1.6168F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r37 = hair.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(54, 57).addBox(-2.638F, -4.7932F, -1.4503F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-2.3039F, -5.4461F, -1.7768F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(54, 57).addBox(-0.6961F, -5.1789F, -0.2232F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-0.362F, -5.8318F, -0.5497F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.895F, -27.8886F, 0.8097F, -0.1361F, -0.0313F, -0.3469F));
		PartDefinition cube_r38 = hair.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2877F, -31.5997F, 2.0543F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r39 = hair.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1498F, -31.5997F, 2.0543F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r40 = hair.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1498F, -31.5997F, 2.0543F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r41 = hair.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7748F, -32.2247F, 2.0543F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r42 = hair.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7748F, -32.2247F, 2.0543F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r43 = hair.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6498F, -32.2247F, 0.1168F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r44 = hair.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -3.9037F, -1.7996F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6498F, -32.2247F, 0.1168F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r45 = hair.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -32.7247F, 1.2418F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r46 = hair.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -3.9037F, -1.7996F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -32.7247F, 1.2418F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r47 = hair.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -32.7247F, 1.2418F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r48 = hair.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -32.7247F, 1.2418F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r49 = hair.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -31.4747F, -0.2582F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r50 = hair.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -31.4747F, -0.2582F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r51 = hair.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -31.0372F, -2.5707F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r52 = hair.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -32.2247F, -1.3832F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r53 = hair.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5873F, -32.2247F, -1.3832F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r54 = hair.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9623F, -32.7872F, -2.0082F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r55 = hair.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9623F, -32.7872F, -2.0082F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r56 = hair.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -31.7247F, -2.0082F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r57 = hair.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3998F, -31.7247F, -2.0082F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r58 = hair.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0873F, -32.5997F, -2.7582F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r59 = hair.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(54, 57).addBox(-0.7123F, -3.8645F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0873F, -32.5997F, -2.7582F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r60 = hair.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3373F, -32.5997F, -1.7582F, 2.9762F, -0.2566F, -2.9945F));
		PartDefinition cube_r61 = hair.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3373F, -32.5997F, -1.7582F, 3.0732F, -0.2073F, -2.8203F));
		PartDefinition cube_r62 = hair.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4127F, -31.8497F, -2.5082F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r63 = hair.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4127F, -31.8497F, -2.5082F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r64 = hair.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2628F, -31.1352F, 1.5389F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r65 = hair.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2628F, -31.6352F, 0.7889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r66 = hair.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2628F, -32.6352F, 1.2889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r67 = hair.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8253F, -32.2602F, 0.5389F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r68 = hair.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5753F, -32.8227F, 0.5389F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r69 = hair.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2003F, -33.5102F, -0.3361F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r70 = hair.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 55).mirror()
				.addBox(-1.5F, -0.5F, 2.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5937F, -32.3889F, 4.5589F, -0.7979F, -0.36F, 0.0471F));
		PartDefinition cube_r71 = hair.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(54, 55).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1191F, -27.7216F, 4.8015F, -0.7984F, 0.0068F, 0.0022F));
		PartDefinition cube_r72 = hair.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-0.9F, -2.6F, 0.6F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0109F, -31.9626F, 4.8556F, -0.8658F, 0.4718F, -0.0344F));
		PartDefinition cube_r73 = hair.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(54, 55).addBox(-2.1F, -2.6F, 0.6F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0109F, -31.9626F, 4.8556F, -0.8658F, -0.4718F, 0.0344F));
		PartDefinition cube_r74 = hair.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 55).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0109F, -31.9626F, 4.8556F, -0.7982F, -0.0213F, -0.0252F));
		PartDefinition cube_r75 = hair.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(54, 55).addBox(-1.5F, -3.275F, -0.575F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2686F, -29.0699F, 2.6539F, -1.3684F, 1.1426F, -0.7517F));
		PartDefinition cube_r76 = hair.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.5F, -3.275F, -0.575F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2686F, -29.0699F, 2.6539F, -1.3684F, -1.1426F, 0.7517F));
		PartDefinition cube_r77 = hair.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 55).addBox(-0.6F, -3.2F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.821F, -28.8232F, 0.6879F, -1.8533F, 1.1164F, -1.2281F));
		PartDefinition cube_r78 = hair.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-2.4F, -3.2F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.821F, -28.8232F, 0.6879F, -1.8533F, -1.1164F, 1.2281F));
		PartDefinition cube_r79 = hair.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-2.1F, -1.7F, 0.3F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5937F, -32.3889F, 4.5589F, -0.7241F, -0.5108F, -0.127F));
		PartDefinition cube_r80 = hair.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 55).addBox(-0.9F, -1.7F, 0.3F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5937F, -32.3889F, 4.5589F, -0.7241F, 0.5108F, 0.127F));
		PartDefinition cube_r81 = hair.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(54, 55).addBox(-1.5F, -0.5F, 2.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 55).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5937F, -32.3889F, 4.5589F, -0.7979F, 0.36F, -0.0471F));
		PartDefinition cube_r82 = hair.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 57).addBox(-0.8434F, -1.1078F, -0.772F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6177F, -32.5526F, 3.7166F, -0.2388F, -0.2323F, -0.7574F));
		PartDefinition cube_r83 = hair.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 57).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6627F, -31.4122F, 2.4918F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r84 = hair.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 57).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6627F, -31.4122F, 2.4918F, -0.1336F, 0.0407F, -0.6136F));
		PartDefinition cube_r85 = hair.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3253F, -32.5727F, 2.5389F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r86 = hair.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5753F, -31.5727F, 1.2889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r87 = hair.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5753F, -31.3227F, 2.2889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r88 = hair.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1747F, -31.0727F, 1.7889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r89 = hair.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3253F, -32.0727F, 0.7889F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r90 = hair.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3253F, -32.5727F, 1.5389F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r91 = hair.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(53, 57).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3253F, -34.0727F, -1.4611F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r92 = hair.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(52, 54).addBox(-5.0875F, -0.55F, 0.8812F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 54).addBox(-4.0875F, -0.55F, 0.8812F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 54)
						.addBox(-3.0875F, -0.55F, 0.8812F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 54).addBox(-2.0875F, -0.55F, 0.8812F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 56)
						.addBox(-2.1875F, -2.75F, 2.2813F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 56).addBox(-2.1875F, -2.75F, 3.2813F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 56)
						.addBox(-2.1875F, -2.75F, 4.2813F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 56).addBox(-2.1875F, -2.75F, 1.2813F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 56)
						.addBox(-2.1875F, -2.75F, 0.2813F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 56).addBox(-2.1875F, -2.75F, -0.7188F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -36.5017F, -0.5866F, -0.1384F, 0.0182F, 0.0075F));
		PartDefinition bone2 = hair.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.0212F, -29.5962F, -3.485F));
		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(53, 56).mirror().addBox(-0.0388F, -4.9262F, -0.9129F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0564F, 0.0F, 0.0F, 3.1416F, 0.0F, -2.312F));
		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(53, 56).addBox(-1.9612F, -4.9262F, -0.9129F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 2.312F));
		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0585F, -3.0036F, 0.9518F));
		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-1.625F, -1.9F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0087F, -0.424F, -0.9379F, -3.1024F, 0.0184F, -2.758F));
		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(56, 58).addBox(-0.375F, -1.9F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.066F, -0.424F, -0.9379F, -3.1024F, -0.0184F, 2.758F));
		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(53, 56).mirror().addBox(-4.0388F, -2.9262F, -0.7879F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0161F, 3.0036F, -0.9518F, 3.1416F, 0.032F, 3.1326F));
		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 56).addBox(2.0388F, -2.9262F, -0.7879F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0585F, 3.0036F, -0.9518F, 3.1416F, -0.032F, -3.1326F));
		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 56).addBox(-0.9612F, -5.9262F, -0.9129F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0585F, 3.0036F, -0.9518F, -3.1125F, -0.032F, -3.1326F));
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
