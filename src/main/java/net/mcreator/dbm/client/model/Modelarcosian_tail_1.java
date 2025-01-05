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
public class Modelarcosian_tail_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelarcosian_tail_1"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelarcosian_tail_1(ModelPart root) {
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
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone13 = Tail.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -4.2F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone4 = bone13.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, -10.8F, -2.0F));
		PartDefinition bone = bone4.addOrReplaceChild(
				"bone", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone2 = bone4.addOrReplaceChild(
				"bone2", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone3 = bone4.addOrReplaceChild(
				"bone3", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone5 = bone13.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, -10.8F, 1.0F));
		PartDefinition bone6 = bone5.addOrReplaceChild(
				"bone6", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone7 = bone5.addOrReplaceChild(
				"bone7", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone8 = bone5.addOrReplaceChild(
				"bone8", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone9 = bone13.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, -10.8F, 4.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild(
				"bone10", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone11 = bone9.addOrReplaceChild(
				"bone11", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone12 = bone9.addOrReplaceChild(
				"bone12", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -25.6779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -26.1779F, -2.133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone27 = Tail.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offset(7.0F, -15.0F, 5.0F));
		PartDefinition bone29 = bone28.addOrReplaceChild(
				"bone29", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone30 = bone28.addOrReplaceChild(
				"bone30", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone31 = bone28.addOrReplaceChild(
				"bone31", CubeListBuilder.create().texOffs(47, 23).addBox(-7.75F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-7.75F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-8.25F, -23.2462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-8.25F, -23.7462F, 4.3582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone14 = Tail.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 9.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild(
				"bone16", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone17 = bone15.addOrReplaceChild(
				"bone17", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone18 = bone15.addOrReplaceChild(
				"bone18", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone19 = bone14.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 12.0F));
		PartDefinition bone20 = bone19.addOrReplaceChild(
				"bone20", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone21 = bone19.addOrReplaceChild(
				"bone21", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone22 = bone19.addOrReplaceChild(
				"bone22", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition bone23 = bone14.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 15.0F));
		PartDefinition bone24 = bone23.addOrReplaceChild(
				"bone24", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 0.0F));
		PartDefinition bone25 = bone23.addOrReplaceChild(
				"bone25", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 1.0F));
		PartDefinition bone26 = bone23.addOrReplaceChild(
				"bone26", CubeListBuilder.create().texOffs(47, 23).addBox(-0.75F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-0.75F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 23).addBox(-1.25F, 2.8791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 23).addBox(-1.25F, 2.3791F, 4.2716F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 27.0F, 2.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
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
