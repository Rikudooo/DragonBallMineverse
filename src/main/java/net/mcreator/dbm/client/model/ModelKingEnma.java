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

import com.google.common.collect.Table;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelKingEnma<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_king_enma"), "main");
	public final ModelPart Enma;
	public final ModelPart Chair;
	public final ModelPart Table;

	public ModelKingEnma(ModelPart root) {
		this.Enma = root.getChild("Enma");
		this.Chair = root.getChild("Chair");
		this.Table = root.getChild("Table");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Enma = partdefinition.addOrReplaceChild("Enma", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 9.0F));
		PartDefinition Head = Enma.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(42, 0).addBox(-4.5F, -0.25F, -4.25F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 4).addBox(3.5F, -4.25F, -4.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 4)
						.addBox(-4.5F, -4.25F, -4.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 0).addBox(-4.5F, -4.25F, 2.0F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-4.5F, -2.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(3.5F, -2.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-4.5F, 1.75F, -4.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(0.5F, 1.75F, -4.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.0F, -9.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.25F, -1.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, -3.0F, -1.0F, 0.3927F, -0.3927F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, -1.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -3.0F, -1.0F, 0.3927F, 0.3927F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-6.1564F, -5.7137F, 0.0F));
		PartDefinition Head_r3 = bone.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, 0.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1564F, -2.7863F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Head_r4 = bone.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 48).addBox(-7.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8478F, 0.7654F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(6.1564F, -5.7137F, 0.0F));
		PartDefinition Head_r5 = bone2.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(1.0F, 0.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.1564F, -2.7863F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Head_r6 = bone2.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(4.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8478F, 0.7654F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition RightArm = Enma.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-7.0F, -2.0608F, -2.6946F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -22.0F, 0.75F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Body = Enma.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition LeftArm = Enma.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -22.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RightLeg = Enma.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -12.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition LeftLeg = Enma.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 48).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -12.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Chair = partdefinition.addOrReplaceChild("Chair",
				CubeListBuilder.create().texOffs(56, 45).addBox(-1.0F, -9.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 34).addBox(-5.0F, -10.0F, 2.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Chair.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 34).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5F, 7.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Chair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(55, 3).addBox(-6.0F, -1.0F, 2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 3).addBox(-6.0F, -1.0F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 3)
						.addBox(-6.0F, -4.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 3).addBox(-6.0F, 2.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 45)
						.addBox(-4.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 7.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition cube_r3 = Chair.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 45).addBox(-4.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 7.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Table = partdefinition.addOrReplaceChild("Table",
				CubeListBuilder.create().texOffs(56, 24).addBox(-20.0F, -18.0F, 2.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 24).addBox(-20.0F, -18.0F, -10.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 13)
						.addBox(-18.0F, -18.0F, -9.5F, 36.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 17).addBox(18.5F, -18.0F, -8.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(98, 17)
						.addBox(-19.5F, -18.0F, -8.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 13).addBox(-18.0F, -18.0F, 2.5F, 36.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 24)
						.addBox(18.0F, -18.0F, -10.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 24).addBox(18.0F, -18.0F, 2.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 44)
						.addBox(9.0F, -20.0F, -12.0F, 13.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(120, 43).addBox(5.0F, -22.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 47)
						.addBox(16.0F, -23.0F, -11.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 23).addBox(-18.0F, -22.0F, -4.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(-17.75F, -24.0F, -4.25F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(108, 31).addBox(15.25F, -26.0F, -11.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 44)
						.addBox(-4.0F, -20.0F, -12.0F, 13.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(58, 44).addBox(-17.0F, -20.0F, -12.0F, 13.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(58, 44)
						.addBox(-22.0F, -20.0F, -12.0F, 5.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r4 = Table.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 3).addBox(-3.0F, -0.9F, -3.125F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, -22.0F, -5.5F, -1.7453F, 0.0F, 0.0F));
		PartDefinition bone16 = Table.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(90, 19).addBox(-3.75F, -21.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(112, 19).addBox(-1.25F, -21.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 0.5F, 3.0F));
		PartDefinition bone4 = Table.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(118, 48).addBox(16.25F, -26.25F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 48).addBox(16.75F, -26.5F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone5 = Table.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(118, 48).addBox(16.25F, -26.25F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 48).addBox(16.75F, -26.5F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 0.0F, 1.0F));
		PartDefinition bone6 = Table.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(118, 48).addBox(-0.75F, -0.375F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 48).addBox(-0.25F, -0.625F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, -25.875F, -6.875F, 0.0F, 3.0543F, 0.0F));
		PartDefinition bone8 = Table.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(118, 48).addBox(-0.75F, -0.375F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 48).addBox(-0.25F, -0.625F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.75F, -25.875F, -7.125F, 0.0F, 3.0543F, 0.0F));
		PartDefinition bone7 = Table.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(118, 48).addBox(-0.75F, -0.375F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 48).addBox(-0.25F, -0.625F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -25.875F, -8.875F, 0.0F, -2.4435F, 0.0F));
		PartDefinition bone10 = Table.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone9 = bone10.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54).addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11 = bone10.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54).addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.0F));
		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54)
				.addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(118, 51).addBox(8.0F, -21.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone12.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 49).addBox(-3.5F, -2.3F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, -20.5F, -1.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone13 = bone10.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54).addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 0.0F, 0.0F));
		PartDefinition bone14 = bone10.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54).addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 0.0F, 0.0F));
		PartDefinition bone15 = bone10.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(105, 54).addBox(6.0F, -20.25F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 54).addBox(6.0F, -20.25F, -7.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.0F, 0.0F, 0.0F));
		PartDefinition bone3 = Table.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.5F, -21.475F, -11.0F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(110, 44).addBox(-4.5F, -10.5F, -23.3F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4868F, 26.3958F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 41).addBox(-4.5F, -1.5F, 0.3F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Enma.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Table.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
