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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelShenron119<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_shenron_119"), "main");
	public final ModelPart Head;
	public final ModelPart cube_r8;
	public final ModelPart cube_r6;
	public final ModelPart cube_r5;
	public final ModelPart cube_r4;
	public final ModelPart cube_r7;
	public final ModelPart Shenron;
	public final ModelPart TopPart;
	public final ModelPart cube_r1;
	public final ModelPart cube_r2;
	public final ModelPart cube_r3;
	public final ModelPart cube_r9;
	public final ModelPart cube_r10;
	public final ModelPart cube_r11;
	public final ModelPart cube_r12;
	public final ModelPart cube_r13;
	public final ModelPart cube_r14;
	public final ModelPart cube_r15;
	public final ModelPart cube_r16;
	public final ModelPart cube_r17;
	public final ModelPart cube_r18;
	public final ModelPart cube_r19;
	public final ModelPart cube_r20;
	public final ModelPart cube_r21;
	public final ModelPart cube_r22;
	public final ModelPart cube_r24;
	public final ModelPart cube_r23;
	public final ModelPart cube_r25;
	public final ModelPart cube_r26;
	public final ModelPart cube_r27;
	public final ModelPart cube_r28;
	public final ModelPart cube_r29;
	public final ModelPart cube_r30;
	public final ModelPart cube_r31;
	public final ModelPart cube_r32;
	public final ModelPart cube_r33;
	public final ModelPart cube_r34;

	public ModelShenron119(ModelPart root) {
		this.Head = root.getChild("Head");
		this.cube_r8 = this.Head.getChild("cube_r8");
		this.cube_r6 = this.Head.getChild("cube_r6");
		this.cube_r5 = this.Head.getChild("cube_r5");
		this.cube_r4 = this.Head.getChild("cube_r4");
		this.cube_r7 = this.Head.getChild("cube_r7");
		this.Shenron = root.getChild("Shenron");
		this.TopPart = this.Shenron.getChild("TopPart");
		this.cube_r1 = this.TopPart.getChild("cube_r1");
		this.cube_r2 = this.TopPart.getChild("cube_r2");
		this.cube_r3 = this.TopPart.getChild("cube_r3");
		this.cube_r9 = this.TopPart.getChild("cube_r9");
		this.cube_r10 = this.TopPart.getChild("cube_r10");
		this.cube_r11 = this.TopPart.getChild("cube_r11");
		this.cube_r12 = this.TopPart.getChild("cube_r12");
		this.cube_r13 = this.TopPart.getChild("cube_r13");
		this.cube_r14 = this.TopPart.getChild("cube_r14");
		this.cube_r15 = this.TopPart.getChild("cube_r15");
		this.cube_r16 = this.TopPart.getChild("cube_r16");
		this.cube_r17 = this.TopPart.getChild("cube_r17");
		this.cube_r18 = this.TopPart.getChild("cube_r18");
		this.cube_r19 = this.TopPart.getChild("cube_r19");
		this.cube_r20 = this.TopPart.getChild("cube_r20");
		this.cube_r21 = this.TopPart.getChild("cube_r21");
		this.cube_r22 = this.TopPart.getChild("cube_r22");
		this.cube_r24 = this.TopPart.getChild("cube_r24");
		this.cube_r23 = this.TopPart.getChild("cube_r23");
		this.cube_r25 = this.Shenron.getChild("cube_r25");
		this.cube_r26 = this.Shenron.getChild("cube_r26");
		this.cube_r27 = this.Shenron.getChild("cube_r27");
		this.cube_r28 = this.Shenron.getChild("cube_r28");
		this.cube_r29 = this.Shenron.getChild("cube_r29");
		this.cube_r30 = this.Shenron.getChild("cube_r30");
		this.cube_r31 = this.Shenron.getChild("cube_r31");
		this.cube_r32 = this.Shenron.getChild("cube_r32");
		this.cube_r33 = this.Shenron.getChild("cube_r33");
		this.cube_r34 = this.Shenron.getChild("cube_r34");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 25).addBox(-3.9643F, -7.05F, -7.9643F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 36).addBox(-3.9643F, -0.05F, -6.9643F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.9643F, -3.05F, -15.9643F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 17).addBox(-7.9643F, -3.05F, -14.9643F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 15)
						.addBox(-15.9643F, -5.7F, -14.9643F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 14).addBox(3.0357F, -3.05F, -14.9643F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(10.7857F, -0.55F, -14.9643F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.1431F, -175.2988F, -20.1856F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 24).addBox(-3.3212F, -1.3488F, -8.7249F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3569F, 1.2988F, -6.8144F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 58).addBox(3.7288F, -9.9738F, -0.3999F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-0.2712F, -9.9738F, -0.3999F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(3.7288F, -5.9738F, -0.3999F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-0.2712F, -5.9738F, -0.3999F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(3.2288F, -1.9738F, -1.1499F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 11).addBox(-0.7712F, -1.9738F, -1.1499F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6431F, -7.7012F, -3.8144F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 58).addBox(2.7288F, -2.5838F, -2.8086F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-1.2712F, -2.5838F, -2.8086F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6431F, -12.7012F, 0.1856F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 58).addBox(2.7288F, -2.8338F, 0.6664F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-1.2712F, -2.8338F, 0.6664F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6431F, -12.7012F, 0.1856F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(14, 14).addBox(12.1788F, -9.2488F, -1.1499F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 14).addBox(-4.8212F, -0.3488F, -1.1499F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6431F, -2.7012F, -13.8144F, 0.0F, 0.0F, 0.6109F));
		PartDefinition Shenron = partdefinition.addOrReplaceChild("Shenron", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition TopPart = Shenron.addOrReplaceChild("TopPart", CubeListBuilder.create(), PartPose.offset(-59.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = TopPart.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 12).addBox(-20.4674F, -5.9469F, 1.5633F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 12).addBox(-27.4674F, -6.6969F, 1.5633F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(81.0F, -191.0F, -2.0F, 0.3927F, -0.3491F, -0.5236F));
		PartDefinition cube_r2 = TopPart.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 11).addBox(17.0826F, -5.5719F, 2.7883F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 11).addBox(9.5826F, -5.5719F, 3.7883F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(81.0F, -191.0F, -2.0F, 0.3927F, 0.5236F, -0.5236F));
		PartDefinition cube_r3 = TopPart
				.addOrReplaceChild(
						"cube_r3", CubeListBuilder.create().texOffs(13, 12).addBox(2.5826F, -6.9969F, -1.6867F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
								.addBox(-13.4174F, -6.9969F, -1.6867F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 0).addBox(-5.4174F, -11.9969F, -3.6867F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(81.0F, -191.0F, -2.0F, 0.3927F, 0.0F, -0.5236F));
		PartDefinition cube_r9 = TopPart.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 0).addBox(-3.5892F, -9.2911F, -4.03F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.0F, -200.0F, -14.0F, -1.7017F, 0.0F, 2.618F));
		PartDefinition cube_r10 = TopPart.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 0).addBox(-3.7405F, -14.1459F, -3.8938F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.0F, -177.0F, -7.0F, -0.3491F, 0.0F, -0.2618F));
		PartDefinition cube_r11 = TopPart.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 0).addBox(-0.7736F, -14.7959F, -5.2209F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(76.0F, -166.0F, -12.0F, -0.3491F, -0.6545F, 0.48F));
		PartDefinition cube_r12 = TopPart.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 0).addBox(-28.7342F, -8.3543F, -12.0397F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(69.0F, -171.0F, 13.0F, -1.3963F, -2.0071F, 1.6581F));
		PartDefinition cube_r13 = TopPart.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 0).addBox(-10.5842F, -25.8793F, -9.3397F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(69.0F, -171.0F, 13.0F, -1.3963F, 2.7053F, 1.6581F));
		PartDefinition cube_r14 = TopPart.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(25, 0).addBox(-6.5342F, -13.4793F, -1.1647F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(69.0F, -171.0F, 13.0F, -1.3963F, 2.2253F, 1.0036F));
		PartDefinition cube_r15 = TopPart.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 0).addBox(-5.5486F, -41.6209F, -53.2709F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -145.0F, -8.0F, -0.4363F, 2.4871F, 1.4399F));
		PartDefinition cube_r16 = TopPart.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 0).addBox(-5.5486F, -43.2209F, -17.9709F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -145.0F, -8.0F, 0.5236F, 2.4871F, 1.4399F));
		PartDefinition cube_r17 = TopPart.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 0).addBox(-5.5486F, -44.9709F, -36.9709F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -145.0F, -8.0F, 0.0F, 2.4871F, 1.4399F));
		PartDefinition cube_r18 = TopPart.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 0).addBox(-5.5486F, -31.2209F, -8.9709F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -145.0F, -8.0F, 0.829F, 2.4871F, 1.4399F));
		PartDefinition cube_r19 = TopPart.addOrReplaceChild("cube_r19", CubeListBuilder.create(), PartPose.offsetAndRotation(32.0F, -149.0F, -5.0F, 1.3526F, 2.4871F, 1.0472F));
		PartDefinition cube_r19_r1 = cube_r19.addOrReplaceChild("cube_r19_r1", CubeListBuilder.create().texOffs(30, 47).addBox(-2.994F, -1.5501F, -1.0059F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, -6.0F, -16.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition cube_r20 = TopPart.addOrReplaceChild("cube_r20", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -149.0F, 1.0F, 1.3526F, 2.5307F, 1.7017F));
		PartDefinition cube_r20_r1 = cube_r20.addOrReplaceChild("cube_r20_r1", CubeListBuilder.create().texOffs(30, 47).addBox(-24.7622F, -155.5612F, -10.5308F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 149.0F, -1.0F, 0.0F, 0.829F, 0.0F));
		PartDefinition cube_r21 = TopPart.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 0).addBox(-5.5486F, -16.2209F, -0.7709F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -145.0F, -8.0F, 1.3526F, 2.4871F, 1.4399F));
		PartDefinition cube_r21_r1 = cube_r21.addOrReplaceChild("cube_r21_r1", CubeListBuilder.create().texOffs(30, 47).addBox(4.4514F, -155.2209F, -7.7709F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 145.0F, 8.0F, 0.0F, 1.3963F, 0.0F));
		PartDefinition cube_r21_r2 = cube_r21.addOrReplaceChild("cube_r21_r2", CubeListBuilder.create().texOffs(30, 47).addBox(0.4514F, -1.2209F, 5.2291F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, 8.0F, 0.0F, 1.9635F, 0.0F));
		PartDefinition cube_r22 = TopPart.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(2.2859F, -26.7345F, -0.5422F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -126.0F, -23.0F, 2.0071F, 2.4871F, 1.4399F));
		PartDefinition cube_r24 = TopPart.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-3.1524F, -14.3941F, -2.9241F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(36.0F, -119.0F, -9.0F, 2.138F, 0.7418F, 1.4399F));
		PartDefinition cube_r25_r1 = cube_r24.addOrReplaceChild("cube_r25_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.5F, -4.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0413F, 2.8757F, 3.4331F, 0.8786F, 0.2667F, -0.4125F));
		PartDefinition cube_r23 = TopPart.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-8.7141F, -12.7095F, -0.5422F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -126.0F, -23.0F, 2.0071F, 1.5708F, 1.4399F));
		PartDefinition cube_r25 = Shenron.addOrReplaceChild("cube_r25", CubeListBuilder.create(), PartPose.offsetAndRotation(39.0F, -106.0F, 5.0F, 1.4835F, 0.7854F, 1.4399F));
		PartDefinition cube_r29_r1 = cube_r25.addOrReplaceChild("cube_r29_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6435F, -37.7995F, 32.122F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, -3.0F, 2.1817F, 0.0F, 0.0F));
		PartDefinition cube_r28_r1 = cube_r25.addOrReplaceChild("cube_r28_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6435F, -37.7995F, 17.122F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, -3.0F, 1.7017F, 0.0F, 0.0F));
		PartDefinition cube_r27_r1 = cube_r25.addOrReplaceChild("cube_r27_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6435F, -26.7995F, 11.122F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, -3.0F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r34_r1 = cube_r25.addOrReplaceChild("cube_r34_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 13.5914F, -28.1396F, -1.0737F, -0.4574F, 0.2581F));
		PartDefinition cube_r33_r1 = cube_r25.addOrReplaceChild("cube_r33_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -14.5F, -1.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 9.5392F, -21.4042F, -2.5744F, 0.0F, 0.0F));
		PartDefinition cube_r32_r1 = cube_r25.addOrReplaceChild("cube_r32_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -12.0F, -0.25F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 19.2366F, -11.9657F, -1.789F, 0.0F, 0.0F));
		PartDefinition cube_r31_r1 = cube_r25.addOrReplaceChild("cube_r31_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, 3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 16.8418F, 4.9537F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r30_r1 = cube_r25.addOrReplaceChild("cube_r30_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.25F, -9.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 19.6684F, 23.4759F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r29_r2 = cube_r25.addOrReplaceChild("cube_r29_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, 4.6827F, 22.8216F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r28_r2 = cube_r25.addOrReplaceChild("cube_r28_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, -9.4447F, 19.7024F, 0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r27_r2 = cube_r25.addOrReplaceChild("cube_r27_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -6.5F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, -21.3455F, 8.8083F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r26_r1 = cube_r25.addOrReplaceChild("cube_r26_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, 0.25F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3565F, -21.6356F, -7.5158F, 1.3526F, 0.0F, 0.0F));
		PartDefinition cube_r26 = Shenron.addOrReplaceChild("cube_r26", CubeListBuilder.create(), PartPose.offsetAndRotation(29.0F, -98.0F, 14.0F, 0.8727F, 0.7854F, 1.4399F));
		PartDefinition cube_r27 = Shenron.addOrReplaceChild("cube_r27", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, -95.0F, 14.0F, 0.2182F, 0.4363F, 1.4399F));
		PartDefinition cube_r28 = Shenron.addOrReplaceChild("cube_r28", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -90.0F, 14.0F, 0.2182F, 0.0F, 0.9599F));
		PartDefinition cube_r29 = Shenron.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -14.3075F, -3.3213F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -76.0F, 19.0F, 0.3491F, 0.0F, 0.3927F));
		PartDefinition cube_r30 = Shenron.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -41.8777F, 3.9435F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -14.8777F, -3.0565F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -44.0F, -10.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r31 = Shenron.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -14.6152F, -2.8187F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -57.0F, -2.0F, -1.0472F, -0.0436F, -0.3927F));
		PartDefinition cube_r32 = Shenron.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -10.327F, -5.2751F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -10.327F, -5.2751F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -34.0F, -4.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r33 = Shenron.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(29, 3).addBox(-1.5F, -16.0F, 1.25F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -12.0F, -4.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r34 = Shenron.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 5).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.3054F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shenron.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
