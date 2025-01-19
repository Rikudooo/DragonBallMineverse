// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAndroid20<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "android20"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart LeftArm;

	public ModelAndroid20(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(57, 2)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 2)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 9)
						.addBox(-4.0F, -15.0F, -4.25F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 18)
						.addBox(-4.0F, -15.0F, 3.25F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 20)
						.addBox(-4.0F, -15.0F, -3.75F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(95, 18).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.25F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(95, 18).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, 0.0F, -3.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(69, 18)
						.addBox(4.0F, -2.0F, 3.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 18)
						.addBox(-6.0F, -2.0F, 3.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 18)
						.addBox(-4.0F, -3.0F, 3.0F, 8.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(18, 47)
						.addBox(-3.0F, -1.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-4.0F, -2.0F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(22, 15)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(39, 10)
						.addBox(-1.0F, 13.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 6.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 29)
						.addBox(-2.0F, 13.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 6.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 47)
						.addBox(0.0F, -1.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(0.0F, -2.0F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}