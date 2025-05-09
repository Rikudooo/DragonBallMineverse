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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfusionclothes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelfusionclothes"), "main");
	public final ModelPart Body;
	public final ModelPart Jacket;
	public final ModelPart Belt;
	public final ModelPart YellowThingy;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart Wristband2;
	public final ModelPart LeftArm;
	public final ModelPart Wristband;
	public final ModelPart RightLeg;
	public final ModelPart RightPant;
	public final ModelPart Belt2;
	public final ModelPart Shoes;
	public final ModelPart LeftLeg;
	public final ModelPart LeftPant;
	public final ModelPart Shoes2;

	public Modelfusionclothes(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Jacket = this.Body.getChild("Jacket");
		this.Belt = this.Body.getChild("Belt");
		this.YellowThingy = this.Body.getChild("YellowThingy");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.Wristband2 = this.RightArm.getChild("Wristband2");
		this.LeftArm = root.getChild("LeftArm");
		this.Wristband = this.LeftArm.getChild("Wristband");
		this.RightLeg = root.getChild("RightLeg");
		this.RightPant = this.RightLeg.getChild("RightPant");
		this.Belt2 = this.RightPant.getChild("Belt2");
		this.Shoes = this.RightPant.getChild("Shoes");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftPant = this.LeftLeg.getChild("LeftPant");
		this.Shoes2 = this.LeftPant.getChild("Shoes2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Jacket = Body.addOrReplaceChild("Jacket",
				CubeListBuilder.create().texOffs(46, 55).addBox(-4.0F, -24.0F, 2.0F, 8.0F, 7.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(46, 55).addBox(-4.0F, -23.0F, -2.1F, 3.0F, 6.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(46, 55)
						.addBox(1.0F, -23.0F, -2.1F, 3.0F, 6.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(47, 55).addBox(2.0F, -24.0F, -2.1F, 2.0F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(47, 55)
						.addBox(-4.0F, -24.0F, -2.1F, 2.0F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body_r1 = Jacket.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(47, 55).mirror().addBox(-1.0F, -3.675F, -0.05F, 2.0F, 4.225F, 0.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 55).addBox(5.2F, -3.675F,
				-0.05F, 2.0F, 4.225F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, -24.05F, -1.55F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Jacket.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-1.5F, -4.0F, -0.05F, 4.2F, 7.0F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.05F, -20.0F, -0.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Body_r3 = Jacket.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(45, 55).addBox(-2.7F, -4.0F, -0.05F, 4.2F, 7.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.05F, -20.0F, -0.6F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Belt = Body.addOrReplaceChild("Belt", CubeListBuilder.create().texOffs(0, 0).addBox(-4.1F, -14.0F, -2.1F, 8.2F, 0.7F, 4.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.1F, -12.6F, -2.1F, 8.2F, 0.6F, 4.2F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-4.1F, -13.3F, -2.1F, 8.2F, 0.7F, 4.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition YellowThingy = Body.addOrReplaceChild("YellowThingy",
				CubeListBuilder.create().texOffs(52, 2).addBox(-3.0F, -24.25F, -0.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).addBox(2.0F, -24.25F, -0.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 2)
						.addBox(3.5F, -24.25F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 2).mirror().addBox(-5.5F, -24.25F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 2)
						.addBox(3.5F, -22.25F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 2).mirror().addBox(-5.5F, -22.25F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 3)
						.addBox(3.5F, -24.25F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 3).mirror().addBox(-5.5F, -24.25F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 3)
						.addBox(3.5F, -22.25F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 3).mirror().addBox(-5.5F, -22.25F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 2)
						.addBox(-3.0F, -24.25F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).addBox(2.0F, -24.25F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
						.addBox(1.95F, -24.25F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).mirror().addBox(-2.95F, -24.25F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 1)
						.addBox(-2.0F, -23.0F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).addBox(1.0F, -23.0F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
						.addBox(0.95F, -23.0F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).mirror().addBox(-1.95F, -23.0F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 2)
						.addBox(-2.0F, -23.0F, -0.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2).addBox(1.0F, -23.0F, -0.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Wristband2 = RightArm.addOrReplaceChild("Wristband2",
				CubeListBuilder.create().texOffs(50, 55).addBox(-8.1F, -17.0F, -2.0F, 0.1F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 55).addBox(-4.0F, -17.0F, -2.0F, 0.1F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 22.0F, 0.0F));
		PartDefinition Wristband_r1 = Wristband2.addOrReplaceChild("Wristband_r1", CubeListBuilder.create().texOffs(50, 55).addBox(-0.05F, -1.5F, -2.2F, 0.1F, 3.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -15.5F, -2.05F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Wristband_r2 = Wristband2.addOrReplaceChild("Wristband_r2", CubeListBuilder.create().texOffs(50, 55).addBox(-0.05F, -1.5F, -2.2F, 0.1F, 3.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -15.5F, 2.05F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Wristband = LeftArm.addOrReplaceChild("Wristband",
				CubeListBuilder.create().texOffs(49, 55).addBox(-8.1F, -17.0F, -2.0F, 0.1F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 55).addBox(-4.0F, -17.0F, -2.0F, 0.1F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 22.0F, 0.0F));
		PartDefinition Wristband_r3 = Wristband.addOrReplaceChild("Wristband_r3", CubeListBuilder.create().texOffs(49, 55).addBox(-0.05F, -1.5F, -2.2F, 0.1F, 3.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -15.5F, -2.05F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Wristband_r4 = Wristband.addOrReplaceChild("Wristband_r4", CubeListBuilder.create().texOffs(49, 55).addBox(-0.05F, -1.5F, -2.2F, 0.1F, 3.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -15.5F, 2.05F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightPant = RightLeg.addOrReplaceChild("RightPant",
				CubeListBuilder.create().texOffs(6, 28).addBox(-0.2F, -12.0F, -2.1F, 4.2F, 3.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -3.6F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-0.15F, -4.0F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -3.2F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-0.15F, -2.8F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -2.4F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57)
						.addBox(-0.15F, -3.8F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57).addBox(-0.15F, -3.4F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57)
						.addBox(-0.15F, -3.0F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57).addBox(-0.15F, -2.6F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(46, 35)
						.addBox(-0.15F, -2.2F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 28).addBox(-0.4F, -9.0F, -2.3F, 4.6F, 2.5F, 4.6F, new CubeDeformation(0.0F)).texOffs(2, 29)
						.addBox(-0.6F, -6.5F, -2.5F, 5.0F, 2.5F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.1F, 12.0F, 0.0F));
		PartDefinition Belt2 = RightPant.addOrReplaceChild("Belt2",
				CubeListBuilder.create().texOffs(14, 59).addBox(-0.225F, -12.0F, -2.1F, 0.6F, 3.0F, 0.45F, new CubeDeformation(0.0F)).texOffs(12, 1).addBox(0.375F, -12.0F, -2.1F, 0.6F, 3.0F, 0.45F, new CubeDeformation(0.0F)).texOffs(14, 60)
						.addBox(0.375F, -9.0F, -2.15F, 0.7F, 2.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(11, 1).addBox(-0.425F, -9.0F, -2.15F, 0.8F, 2.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-0.3F, -12.0F, -1.65F, 0.3F, 3.0F, 0.45F, new CubeDeformation(0.0F)).texOffs(10, 60).addBox(-0.5F, -9.0F, -1.65F, 0.5F, 2.7F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.5F, -0.25F));
		PartDefinition Shoes = RightPant.addOrReplaceChild("Shoes", CubeListBuilder.create().texOffs(46, 27).addBox(-0.2F, -2.0F, -2.1F, 4.2F, 2.05F, 4.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftPant = LeftLeg.addOrReplaceChild("LeftPant",
				CubeListBuilder.create().texOffs(5, 29).addBox(-0.2F, -12.0F, -2.1F, 4.2F, 3.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -3.6F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-0.15F, -4.0F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -3.2F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-0.15F, -2.8F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-0.15F, -2.4F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57)
						.addBox(-0.15F, -3.8F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57).addBox(-0.15F, -3.4F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57)
						.addBox(-0.15F, -3.0F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(5, 57).addBox(-0.15F, -2.6F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(46, 35)
						.addBox(-0.15F, -2.2F, -2.05F, 4.1F, 0.2F, 4.1F, new CubeDeformation(0.0F)).texOffs(3, 29).addBox(-0.4F, -9.0F, -2.3F, 4.6F, 2.5F, 4.6F, new CubeDeformation(0.0F)).texOffs(1, 30)
						.addBox(-0.6F, -6.5F, -2.5F, 5.0F, 2.5F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition Shoes2 = LeftPant.addOrReplaceChild("Shoes2", CubeListBuilder.create().texOffs(46, 27).addBox(-0.2F, -12.0F, -2.1F, 4.2F, 2.05F, 4.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));
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
