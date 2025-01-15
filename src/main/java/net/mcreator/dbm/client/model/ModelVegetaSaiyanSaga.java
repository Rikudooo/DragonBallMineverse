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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelVegetaSaiyanSaga<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_vegeta_saiyan_saga"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelVegetaSaiyanSaga(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition Hair = Head.addOrReplaceChild("Hair",
				CubeListBuilder.create().texOffs(0, 38).addBox(-0.8596F, -4.706F, -2.0361F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-1.9846F, -2.706F, -2.6611F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-1.9846F, -1.206F, 0.3389F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-0.9846F, -0.706F, -0.4111F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-0.4846F, 0.294F, 0.5889F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-1.2346F, 0.044F, 1.0889F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-1.2346F, -0.206F, 0.0889F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-2.8596F, -2.1435F, -1.5361F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-2.2346F, -1.456F, -0.6611F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-3.4846F, -0.8935F, -0.6611F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-2.9221F, -1.2685F, 0.0889F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-2.9221F, -0.7685F, 1.3389F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45)
						.addBox(-3.9221F, -0.2685F, -0.4111F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-3.9221F, 0.2315F, 0.3389F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1404F, -4.7993F, 1.1918F, -0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Hair.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8973F, 2.7585F, -1.4889F, -0.0815F, -0.0658F, -0.6431F));
		PartDefinition cube_r2 = Hair.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8973F, 2.7585F, -1.4889F, -0.225F, -0.0104F, -0.4753F));
		PartDefinition cube_r3 = Hair.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8973F, 2.7585F, -3.7389F, -0.0815F, -0.0658F, -0.6431F));
		PartDefinition cube_r4 = Hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 38).addBox(1.3233F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8973F, 2.7585F, -3.7389F, -0.225F, -0.0104F, -0.4753F));
		PartDefinition cube_r5 = Hair.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2098F, 1.321F, -2.1764F, -0.3477F, -0.2692F, -0.6331F));
		PartDefinition cube_r6 = Hair.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2098F, 1.321F, -2.1764F, -0.5174F, -0.1697F, -0.4837F));
		PartDefinition cube_r7 = Hair.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2098F, 1.8835F, -0.3639F, -0.3477F, -0.2692F, -0.5982F));
		PartDefinition cube_r8 = Hair.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2098F, 1.8835F, -0.3639F, -0.5174F, -0.1697F, -0.4837F));
		PartDefinition cube_r9 = Hair.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3973F, 0.696F, -1.9264F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r10 = Hair.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3973F, 0.696F, -1.9264F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r11 = Hair.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3973F, 1.5085F, -2.9889F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r12 = Hair.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3973F, 1.5085F, -2.9889F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r13 = Hair.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3348F, 0.196F, -2.9889F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r14 = Hair.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3348F, 0.196F, -2.9889F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r15 = Hair.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7277F, 1.696F, -2.4889F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r16 = Hair.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7277F, 1.696F, -2.4889F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r17 = Hair.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1027F, 1.571F, -3.2389F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r18 = Hair.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -3.4645F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1027F, 1.571F, -3.2389F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r19 = Hair.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4152F, 2.446F, -2.3639F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r20 = Hair.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4152F, 2.446F, -2.3639F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r21 = Hair.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2277F, 0.5085F, -2.4889F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r22 = Hair.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -4.3395F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 2.0085F, -3.4889F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r23 = Hair.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 2.0085F, -3.4889F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r24 = Hair.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7277F, 3.0085F, -2.3639F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r25 = Hair.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7277F, 3.0085F, -2.3639F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r26 = Hair.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5402F, 1.071F, -1.5514F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r27 = Hair.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5402F, 1.071F, -1.5514F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r28 = Hair.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2277F, 1.321F, -0.7389F, -2.7575F, -0.3238F, -2.9403F));
		PartDefinition cube_r29 = Hair.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2277F, 1.321F, -0.7389F, -2.6822F, -0.3687F, -2.7587F));
		PartDefinition cube_r30 = Hair.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0402F, -0.6165F, 0.0736F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r31 = Hair.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0402F, -0.6165F, 0.0736F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r32 = Hair.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6027F, -0.429F, -0.9264F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r33 = Hair.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6027F, -0.429F, -0.9264F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r34 = Hair.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1473F, 1.196F, 1.1361F, -2.8183F, -0.3135F, -2.9051F));
		PartDefinition cube_r35 = Hair.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1027F, 6.1335F, 0.3861F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r36 = Hair.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3099F, 6.0981F, -0.8793F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r37 = Hair.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8724F, 5.4731F, -1.1293F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r38 = Hair.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3348F, 6.1335F, 0.3861F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r39 = Hair.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 38).addBox(-0.1875F, -2.25F, 0.4375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4422F, 3.166F, 2.9153F, -0.7237F, -0.1706F, -0.0415F));
		PartDefinition cube_r40 = Hair.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 38).addBox(-0.3611F, -3.422F, -0.3835F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6648F, 4.9931F, 2.0484F, -0.5361F, -0.0673F, 0.2309F));
		PartDefinition cube_r41 = Hair.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(4, 45).addBox(-1.75F, -2.5F, -0.4375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2471F, 6.6029F, 3.6343F, -2.2956F, -0.0421F, -3.1249F));
		PartDefinition cube_r42 = Hair.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 38).addBox(-1.6198F, -5.5851F, -2.5908F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8973F, 6.2585F, 1.5736F, -3.0083F, 0.4704F, 2.4619F));
		PartDefinition cube_r43 = Hair.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1027F, 6.2585F, 1.5736F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r44 = Hair.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3099F, 6.2231F, 0.3082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r45 = Hair.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8724F, 5.5981F, 0.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r46 = Hair.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6652F, 6.2585F, 1.5736F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r47 = Hair.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 38).addBox(-0.1875F, -2.25F, 0.4375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4422F, 3.291F, 4.1028F, -0.7237F, -0.1706F, -0.0415F));
		PartDefinition cube_r48 = Hair.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 38).addBox(-0.3611F, -3.422F, -0.3835F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3352F, 5.1181F, 3.2359F, -0.5361F, -0.0673F, 0.2309F));
		PartDefinition cube_r49 = Hair.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1473F, 1.196F, 1.5736F, -2.9004F, -0.2929F, -3.0888F));
		PartDefinition cube_r50 = Hair.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2902F, 1.196F, 1.5736F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r51 = Hair.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2902F, 1.196F, 1.5736F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r52 = Hair.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9152F, 0.571F, 1.5736F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r53 = Hair.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9152F, 0.571F, 1.5736F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r54 = Hair.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7902F, 0.571F, -0.3639F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r55 = Hair.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -3.9037F, -1.7996F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7902F, 0.571F, -0.3639F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r56 = Hair.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 0.071F, 0.7611F, -2.8183F, -0.3135F, -2.4687F));
		PartDefinition cube_r57 = Hair.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -3.9037F, -1.7996F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 0.071F, 0.7611F, -2.9004F, -0.2929F, -2.6525F));
		PartDefinition cube_r58 = Hair.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 0.071F, 0.7611F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r59 = Hair.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 0.071F, 0.7611F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r60 = Hair.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 1.321F, -0.7389F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r61 = Hair.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -1.9847F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 1.321F, -0.7389F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r62 = Hair.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 1.7585F, -3.0514F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r63 = Hair.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 1.7585F, -3.0514F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r64 = Hair.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 0.571F, -1.8639F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r65 = Hair.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7277F, 0.571F, -1.8639F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r66 = Hair.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1027F, 0.0085F, -2.4889F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r67 = Hair.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1027F, 0.0085F, -2.4889F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r68 = Hair.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 1.071F, -2.4889F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r69 = Hair.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5402F, 1.071F, -2.4889F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r70 = Hair.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2277F, 0.196F, -3.2389F, -2.9004F, -0.2929F, -3.1062F));
		PartDefinition cube_r71 = Hair.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -3.3395F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2277F, 0.196F, -3.2389F, -2.8183F, -0.3135F, -2.9225F));
		PartDefinition cube_r72 = Hair.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4777F, 0.196F, -2.2389F, 2.9762F, -0.2566F, -2.9945F));
		PartDefinition cube_r73 = Hair.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4777F, 0.196F, -2.2389F, 3.0732F, -0.2073F, -2.8203F));
		PartDefinition cube_r74 = Hair.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2723F, 0.946F, -2.9889F, -0.1336F, 0.0407F, -0.1423F));
		PartDefinition cube_r75 = Hair.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2723F, 0.946F, -2.9889F, 0.0F, 0.0F, -0.3142F));
		PartDefinition cube_r76 = Hair.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1224F, 1.6606F, 1.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r77 = Hair.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1224F, 1.1606F, 0.3082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r78 = Hair.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1224F, 0.1606F, 0.8082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r79 = Hair.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6849F, 0.5356F, 0.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r80 = Hair.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4349F, -0.0269F, 0.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r81 = Hair.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0599F, -0.7144F, -0.8168F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r82 = Hair.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 38).addBox(-0.1875F, -2.25F, 0.4375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2547F, -1.7715F, 4.1028F, -0.7237F, -0.1706F, -0.0415F));
		PartDefinition cube_r83 = Hair.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(4, 45).addBox(-0.8434F, -1.1078F, -0.772F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4773F, 0.0556F, 3.2359F, -0.3818F, -0.1707F, 0.0867F));
		PartDefinition cube_r84 = Hair.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 38).addBox(-0.3611F, -3.422F, -0.3835F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4773F, 0.0556F, 3.2359F, -0.5361F, -0.0673F, 0.2309F));
		PartDefinition cube_r85 = Hair.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 38).addBox(-0.3611F, -3.422F, -0.3835F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4773F, 0.2431F, 3.2359F, -0.4061F, -0.1494F, -0.5986F));
		PartDefinition cube_r86 = Hair.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(4, 45).addBox(1.2816F, -1.1078F, -0.772F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4773F, 0.8681F, 2.7984F, -0.5573F, -0.2981F, -0.1671F));
		PartDefinition cube_r87 = Hair.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(4, 45).addBox(-0.8434F, -1.1078F, -0.772F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4773F, 0.2431F, 3.2359F, -0.2388F, -0.2323F, -0.7574F));
		PartDefinition cube_r88 = Hair.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(4, 45).addBox(-0.7123F, -2.5895F, -0.6722F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5223F, 1.3835F, 2.0111F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r89 = Hair.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4892F, -4.9037F, -0.4871F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5223F, 1.3835F, 2.0111F, -0.1336F, 0.0407F, -0.6136F));
		PartDefinition cube_r90 = Hair.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1849F, 0.2231F, 2.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r91 = Hair.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4349F, 1.2231F, 0.8082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r92 = Hair.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4349F, 1.4731F, 1.8082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r93 = Hair.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3151F, 1.7231F, 1.3082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r94 = Hair.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1849F, 0.7231F, 0.3082F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r95 = Hair.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1849F, 0.2231F, 1.0582F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r96 = Hair.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 38).addBox(-0.375F, -3.75F, -0.375F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1849F, -1.2769F, -1.9418F, -0.1336F, 0.0407F, 0.1718F));
		PartDefinition cube_r97 = Hair.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(-3, 42).addBox(-2.1875F, -2.75F, -0.7188F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0154F, -3.706F, -1.0673F, -0.1384F, 0.0182F, 0.0075F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-4.0F, 7.875F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 37).addBox(-7.25F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 37).addBox(-0.75F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
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
