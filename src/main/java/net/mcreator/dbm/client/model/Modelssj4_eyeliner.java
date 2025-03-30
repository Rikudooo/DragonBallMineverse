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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelssj4_eyeliner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "modelssj_4_eyeliner"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart Eyeliner;
	public final ModelPart Eyeliner2;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelssj4_eyeliner(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Eyeliner = this.Head.getChild("Eyeliner");
		this.Eyeliner2 = this.Head.getChild("Eyeliner2");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Eyeliner = Head.addOrReplaceChild(
				"Eyeliner", CubeListBuilder.create().texOffs(55, 56).addBox(-1.05F, 2.95F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)).texOffs(55, 56).addBox(-1.05F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F))
						.texOffs(55, 56).addBox(1.0F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).texOffs(55, 56).addBox(-1.05F, 4.0F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -8.0F, 0.025F));
		PartDefinition Eyeliner2 = Head.addOrReplaceChild("Eyeliner2",
				CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-1.05F, 2.95F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false).texOffs(55, 56).mirror()
						.addBox(1.0F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false).texOffs(55, 56).mirror().addBox(-1.05F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(55, 56).mirror().addBox(-1.05F, 4.0F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -8.0F, 0.025F));
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
