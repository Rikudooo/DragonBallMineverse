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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMeteorCrashAnim<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dbm", "model_meteor_crash_anim"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelMeteorCrashAnim(ModelPart root) {
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
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(48, 9).mirror().addBox(1.0219F, 44.2313F, -7.3844F, 0.375F, 0.375F, 0.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 8)
						.addBox(-1.3969F, 44.2313F, -7.3844F, 0.375F, 0.375F, 0.375F, new CubeDeformation(0.0F)).texOffs(52, 7).mirror().addBox(2.775F, 45.375F, -7.4688F, 0.375F, 1.5F, 1.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 7)
						.addBox(-3.15F, 45.375F, -7.4688F, 0.375F, 1.5F, 1.125F, new CubeDeformation(0.0F)).texOffs(53, 8).mirror().addBox(0.75F, 46.875F, -7.4688F, 1.125F, 0.75F, 0.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 8)
						.addBox(-1.875F, 46.875F, -7.4688F, 1.125F, 0.75F, 0.375F, new CubeDeformation(0.0F)).texOffs(52, 7).addBox(-3.0F, 45.75F, -7.4688F, 6.0F, 1.125F, 0.375F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-3.0F, 44.25F, -7.375F, 6.0F, 3.75F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 11).mirror().addBox(-3.75F, 44.25F, -4.375F, 7.5F, 3.75F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-15.0F, -42.0F, 1.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(15.0F, -42.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-6.0F, -12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(6.0F, -12.0F, 0.0F));
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
