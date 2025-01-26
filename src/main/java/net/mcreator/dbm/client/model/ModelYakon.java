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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelYakon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_yakon"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart LeftArm;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart Head;
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart Teeth;
	public final ModelPart bone7;
	public final ModelPart bone8;

	public ModelYakon(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.bone = this.RightArm.getChild("bone");
		this.bone2 = this.RightArm.getChild("bone2");
		this.LeftArm = root.getChild("LeftArm");
		this.bone3 = this.LeftArm.getChild("bone3");
		this.bone4 = this.LeftArm.getChild("bone4");
		this.Head = root.getChild("Head");
		this.bone5 = this.Head.getChild("bone5");
		this.bone6 = this.Head.getChild("bone6");
		this.Teeth = this.Head.getChild("Teeth");
		this.bone7 = this.Teeth.getChild("bone7");
		this.bone8 = this.Teeth.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(6, 5).addBox(-3.0F, 9.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 14.0F, 3.0F));
		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(58, 4).addBox(-0.225F, -0.25F, -0.3F, 0.45F, 0.5F, 0.8F, new CubeDeformation(0.0F)).texOffs(58, 4).addBox(-1.475F, -0.25F, -0.3F, 0.45F, 0.5F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, 9.9436F, -6.2327F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(10, 7).addBox(-0.375F, -0.4F, -0.5F, 0.75F, 0.8F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7).addBox(0.875F, -0.4F, -0.5F, 0.75F, 0.8F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.625F, 9.5609F, -5.3089F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 4).addBox(-0.25F, -0.25F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.8446F, -1.2675F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.4619F, -2.1913F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 3).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1585F, 1.721F, -1.5506F, 2.3166F, -0.274F, 0.2849F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 3).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1361F, 1.4911F, -2.0777F, 0.4365F, 0.2346F, 0.0785F));
		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 7.9176F, -1.8869F, 1.1781F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(6, 5).mirror().addBox(1.0F, 9.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 14.0F, 3.0F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 4).mirror().addBox(-0.225F, -0.25F, -0.3F, 0.45F, 0.5F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 4).mirror()
				.addBox(1.025F, -0.25F, -0.3F, 0.45F, 0.5F, 0.8F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.375F, 9.9436F, -6.2327F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 7).mirror().addBox(-0.375F, -0.4F, -0.5F, 0.75F, 0.8F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 7).mirror()
				.addBox(-1.625F, -0.4F, -0.5F, 0.75F, 0.8F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.625F, 9.5609F, -5.3089F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.25F, -0.25F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 9.8446F, -1.2675F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 7).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 9.4619F, -2.1913F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(4, 3).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1585F, 1.721F, -1.5506F, 2.3166F, 0.274F, -0.2849F));
		PartDefinition cube_r13 = LeftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 3).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1361F, 1.4911F, -2.0777F, 0.4365F, -0.2346F, -0.0785F));
		PartDefinition cube_r14 = LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(2, 1).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 7.9176F, -1.8869F, 1.1781F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, 2.25F, 1.75F, 4.0F, 3.25F, 3.75F, new CubeDeformation(0.0F)).texOffs(2, 3).addBox(-3.0F, 2.25F, 2.0F, 6.0F, 3.0F, 3.25F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 3).addBox(-4.0F, -8.0F, -0.75F, 8.0F, 5.25F, 3.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.15F, 2.75F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(52, 0).addBox(1.25F, -7.75F, -0.75F, 1.5F, 1.75F, 4.25F, new CubeDeformation(0.0F)).texOffs(52, 0).mirror().addBox(-3.25F, -7.75F, -0.75F, 1.5F, 1.75F, 4.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.25F, 1.4279F, 6.9075F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(8, 5).mirror().addBox(-3.0F, -8.0F, -0.75F, 2.0F, 2.25F, 1.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 5).addBox(1.5F, -8.0F, -0.75F, 2.0F, 2.25F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 1.9063F, 5.7526F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(4, 5).addBox(-3.5F, -8.0F, -0.5F, 7.0F, 3.25F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0004F, 4.7591F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 1).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 5.25F, 3.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1F, 2.75F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 0).addBox(-1.25F, -0.875F, -0.625F, 2.5F, 1.75F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1044F, 9.9631F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1, 0).addBox(-1.75F, -1.375F, -0.625F, 3.5F, 2.75F, 4.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.875F, 5.375F, -0.2618F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 5.65F, 2.25F));
		PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 5).addBox(0.0F, -9.0F, -0.75F, 4.0F, 4.25F, 4.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 7.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone = RightArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-4.0F, 10.9265F, 1.6264F));
		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(12, 8).addBox(1.9F, -9.0F, 0.05F, 1.1F, 4.25F, 2.65F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(3.0F, -9.0F, 0.25F, 1.0F, 4.25F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.025F, 3.0486F, -0.1342F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 3).addBox(2.65F, -6.0F, 0.55F, 0.6F, 1.25F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.975F, 10.2232F, 5.3305F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 10).addBox(2.4F, -6.0F, 0.3F, 1.1F, 4.25F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.975F, 6.2967F, 3.8541F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(12, 8).addBox(1.9F, -9.0F, 0.05F, 1.1F, 7.25F, 2.65F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(3.0F, -9.0F, 0.25F, 1.0F, 7.25F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.975F, 6.2967F, 4.8541F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 60).addBox(1.0F, -9.0F, 0.35F, 1.8F, 1.95F, 1.85F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.975F, 12.9948F, 7.6286F, 0.3927F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(4.0F, 5.65F, 2.25F));
		PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 5).mirror().addBox(-4.0F, -9.0F, -0.75F, 4.0F, 4.25F, 4.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 7.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.0F, 10.9265F, 1.6264F));
		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 8).mirror().addBox(-3.0F, -9.0F, 0.05F, 1.1F, 4.25F, 2.65F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 8).mirror()
				.addBox(-4.0F, -9.0F, 0.25F, 1.0F, 4.25F, 2.25F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone4 = LeftArm.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.025F, 3.0486F, -0.1342F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(56, 3).mirror().addBox(-3.25F, -6.0F, 0.55F, 0.6F, 1.25F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.975F, 10.2232F, 5.3305F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 10).mirror().addBox(-3.5F, -6.0F, 0.3F, 1.1F, 4.25F, 1.4F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.975F, 6.2967F, 3.8541F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 8).mirror().addBox(-3.0F, -9.0F, 0.05F, 1.1F, 7.25F, 2.65F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 8).mirror()
				.addBox(-4.0F, -9.0F, 0.25F, 1.0F, 7.25F, 2.25F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.975F, 6.2967F, 4.8541F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-2.8F, -9.0F, 0.35F, 1.8F, 1.95F, 1.85F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.975F, 12.9948F, 7.6286F, 0.3927F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0166F, -0.1545F));
		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 58).addBox(-1.5F, -0.375F, -0.875F, 3.0F, 0.75F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.1361F, -3.3831F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(34, 63).addBox(-0.5F, -0.375F, 0.0F, 1.0F, 0.75F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 3.3575F, -2.8093F, 0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 61).addBox(-1.5F, -0.4772F, -1.6444F, 3.0F, 0.75F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.479F, -2.0961F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-2.0F, -8.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 55).addBox(1.5F, -8.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 6.6334F, -0.0955F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 56).addBox(-2.0F, -8.0F, -0.25F, 4.0F, 3.25F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1334F, -0.0955F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone5 = Head.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4792F, -1.1103F, -2.692F, 0.0F, 0.0F, -0.2356F));
		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6416F, 0.2947F, -0.2387F, 0.3794F, -0.1041F, 0.2549F));
		PartDefinition cube_r40 = bone5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3208F, -0.3387F, 0.5813F, 0.3794F, -0.1041F, 0.2549F));
		PartDefinition cube_r41 = bone5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3208F, 0.044F, -0.3426F, 0.3794F, -0.1041F, 0.2549F));
		PartDefinition bone6 = Head.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4792F, -1.1103F, -2.692F, 0.0F, 0.0F, 0.2356F));
		PartDefinition cube_r42 = bone6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6416F, 0.2947F, -0.2387F, 0.3794F, 0.1041F, -0.2549F));
		PartDefinition cube_r43 = bone6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3208F, -0.3387F, 0.5813F, 0.3794F, 0.1041F, -0.2549F));
		PartDefinition cube_r44 = bone6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3208F, 0.044F, -0.3426F, 0.3794F, 0.1041F, -0.2549F));
		PartDefinition Teeth = Head.addOrReplaceChild("Teeth", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9361F, -3.3831F));
		PartDefinition bone7 = Teeth.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r45 = bone7.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, -0.6607F, 0.5964F, 1.5708F, -1.1781F, -1.5708F));
		PartDefinition cube_r46 = bone7.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, -0.6607F, 0.5964F, 1.5708F, 1.1781F, 1.5708F));
		PartDefinition cube_r47 = bone7.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, -0.4857F, 0.1964F, 1.5708F, -1.1781F, -1.5708F));
		PartDefinition cube_r48 = bone7.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, -0.4857F, 0.1964F, 1.5708F, 1.1781F, 1.5708F));
		PartDefinition cube_r49 = bone7.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, -0.2857F, -0.2036F, 1.5708F, -1.1781F, -1.5708F));
		PartDefinition cube_r50 = bone7.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, -0.2857F, -0.2036F, 1.5708F, 1.1781F, 1.5708F));
		PartDefinition cube_r51 = bone7.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.925F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(0.525F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.125F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-0.275F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-0.675F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-1.1F, -0.375F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -0.238F, 0.2658F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone8 = Teeth.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0195F, 0.025F, 1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r52 = bone8.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, 0.6607F, 0.5964F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition cube_r53 = bone8.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, 0.6607F, 0.5964F, -1.5708F, 1.1781F, -1.5708F));
		PartDefinition cube_r54 = bone8.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, 0.4857F, 0.1964F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition cube_r55 = bone8.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, 0.4857F, 0.1964F, -1.5708F, 1.1781F, -1.5708F));
		PartDefinition cube_r56 = bone8.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.35F, 0.2857F, -0.2036F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition cube_r57 = bone8.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 31).addBox(-0.15F, -0.175F, -0.075F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.35F, 0.2857F, -0.2036F, -1.5708F, 1.1781F, -1.5708F));
		PartDefinition cube_r58 = bone8.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.925F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(0.525F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.125F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-0.275F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-0.675F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-1.1F, 0.025F, -0.825F, 0.3F, 0.35F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.238F, 0.2658F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
