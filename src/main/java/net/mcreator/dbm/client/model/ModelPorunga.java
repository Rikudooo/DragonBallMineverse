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
public class ModelPorunga<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_porunga"), "main");
	public final ModelPart Porunga;
	public final ModelPart bone;
	public final ModelPart RightArm;
	public final ModelPart LeftARm;
	public final ModelPart Head;
	public final ModelPart Teeth;

	public ModelPorunga(ModelPart root) {
		this.Porunga = root.getChild("Porunga");
		this.bone = this.Porunga.getChild("bone");
		this.RightArm = this.Porunga.getChild("RightArm");
		this.LeftARm = this.Porunga.getChild("LeftARm");
		this.Head = this.Porunga.getChild("Head");
		this.Teeth = this.Head.getChild("Teeth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Porunga = partdefinition.addOrReplaceChild("Porunga", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = Porunga.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 169).addBox(-5.7689F, -92.6733F, 3.4234F, 13.0F, 19.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(29, 21).addBox(-3.7689F, -95.6733F, 13.4234F, 9.0F, 19.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 0).addBox(5.6256F, -66.1435F, -13.8048F, 1.0F, 23.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1445F, -104.8302F, 19.1783F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-11.3744F, -60.1435F, -4.8048F, 35.0F, 59.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1445F, -103.0937F, 9.3302F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(-8.5F, -7.5F, -5.0F, 13.0F, 26.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.9618F, -104.158F, 1.8688F, 0.5167F, -0.1231F, 0.7777F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 17).addBox(-4.5F, -7.5F, -5.0F, 13.0F, 26.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.9618F, -104.158F, 1.8688F, 0.5167F, 0.1231F, -0.7777F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 71).addBox(-18.3744F, -55.1435F, -4.8048F, 49.0F, 57.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1445F, -103.0937F, -0.6698F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 19).addBox(-6.3744F, -20.1435F, -4.8048F, 16.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1445F, -91.5298F, 19.2282F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, 138).addBox(-9.3744F, -20.1435F, -4.8048F, 22.0F, 19.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1445F, -87.5298F, 10.2282F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 21).addBox(-4.3744F, -24.1435F, -4.8048F, 9.0F, 26.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7419F, -69.329F, 6.0536F, -1.9815F, -1.2185F, 0.9349F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 0).addBox(-4.3744F, -24.1435F, -4.8048F, 9.0F, 29.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7419F, -69.029F, 1.4536F, -1.9815F, -1.2185F, 0.9349F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(180, 479).addBox(-3.3744F, -24.1435F, -3.8048F, 8.0F, 25.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8163F, -61.9792F, 20.0547F, 1.8718F, -0.5777F, 3.1368F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(180, 479).addBox(-5.0F, -18.0F, -5.0F, 8.0F, 25.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.764F, -59.6471F, 27.0184F, 1.0232F, 0.98F, 2.4692F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(180, 479).addBox(-5.0F, -18.0F, -5.0F, 8.0F, 25.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6018F, -54.6661F, 19.6559F, -1.1506F, 0.78F, 0.1008F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(129, 484).addBox(-5.0F, -18.0F, -5.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3801F, -40.063F, 11.9162F, -0.5167F, -0.3369F, -0.3099F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(236, 486).addBox(-4.0F, -20.0F, -4.0F, 6.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4293F, -22.1509F, 3.5229F, -0.4333F, -0.0283F, 0.1763F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(260, 488).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7272F, -3.6335F, 2.0389F, -0.039F, -0.0544F, 0.091F));
		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(222, 0).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, -0.1278F, -0.0283F, 0.1763F));
		PartDefinition RightArm = Porunga.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.5189F, -160.5812F, -3.1478F, -0.7418F, 0.0F, 0.3491F));
		PartDefinition cube_r17 = RightArm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(486, 33).addBox(-6.0F, -9.819F, -6.1466F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(484, 11).addBox(2.0F, -10.819F, -7.1466F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(454, 0)
						.addBox(3.0F, -11.819F, -11.1466F, 14.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(53, 436).addBox(4.0F, -10.819F, -10.1466F, 12.0F, 63.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 1.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftARm = Porunga.addOrReplaceChild("LeftARm", CubeListBuilder.create(), PartPose.offsetAndRotation(23.4811F, -160.5812F, -3.1478F, -0.7418F, 0.0F, -0.1745F));
		PartDefinition cube_r18 = LeftARm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(471, 11).addBox(-2.0F, -10.819F, -7.1466F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(480, 33).addBox(-1.0F, -9.819F, -6.1466F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(454, 0)
						.addBox(-16.0F, -11.819F, -11.1466F, 14.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 436).addBox(-15.0F, -10.819F, -10.1466F, 12.0F, 63.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 1.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Head = Porunga.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.8902F, -167.0051F, -10.8435F));
		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(344, 501).addBox(-8.5F, -2.6946F, -7.4392F, 16.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5909F, -3.4626F, -6.1041F, 0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(440, 505).addBox(7.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(9.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(11.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(13.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(15.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(17.6F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(19.75F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(21.75F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.9091F, -2.5989F, -6.3188F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(440, 505).addBox(7.5F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(5.2F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(3.2F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(1.2F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(-0.8F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(-2.8F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505)
						.addBox(9.7F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(440, 505).addBox(11.7F, -2.6946F, -7.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8591F, 0.3104F, -4.8962F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(396, 501).addBox(-7.5F, -2.6946F, -7.4392F, 16.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4091F, -6.2126F, -7.6041F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(484, 58).addBox(-2.3744F, -13.1435F, -6.8048F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(484, 58).addBox(-10.3744F, -13.1435F, -6.8048F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9653F, -3.9215F, 0.2636F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(494, 464).addBox(-1.5F, -10.0977F, -1.6166F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9091F, -16.2154F, -5.1415F, -0.6169F, -0.4331F, 0.2111F));
		PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(494, 464).addBox(-1.5F, -10.0977F, -1.6166F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0909F, -16.2154F, -5.1415F, -0.6169F, 0.4331F, -0.2111F));
		PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(490, 463).addBox(-3.3744F, -19.1435F, -3.8048F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(489, 463).addBox(21.6256F, -19.1435F, -3.8048F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(493, 60).addBox(21.6256F, -20.1435F, -4.8048F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(493, 60).addBox(2.6256F, -20.1435F, -4.8048F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0347F, 7.4114F, 0.6738F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(476, 412).addBox(-1.3744F, -21.1435F, -6.8048F, 15.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0347F, 7.3114F, -0.1262F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(448, 486).addBox(-2.3744F, -20.1435F, -6.8048F, 17.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0347F, 6.9114F, 0.1738F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Teeth = Head.addOrReplaceChild("Teeth", CubeListBuilder.create(), PartPose.offset(-0.4091F, -2.3489F, -6.5688F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Porunga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
