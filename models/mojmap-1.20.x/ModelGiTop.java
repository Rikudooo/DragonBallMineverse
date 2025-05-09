// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGiTop<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gitop"), "main");
	private final ModelPart Body;
	private final ModelPart ShoulderPadLeft;
	private final ModelPart ShoulderPadRight;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelGiTop(ModelPart root) {
		this.Body = root.getChild("Body");
		this.ShoulderPadLeft = this.Body.getChild("ShoulderPadLeft");
		this.ShoulderPadRight = this.Body.getChild("ShoulderPadRight");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 19).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(56, 1).mirror()
						.addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 12.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(56, -4).addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition ShoulderPadLeft = Body.addOrReplaceChild("ShoulderPadLeft", CubeListBuilder.create()
				.texOffs(0, 0).addBox(4.0F, -25.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition shoulderpad_r1 = ShoulderPadLeft.addOrReplaceChild("shoulderpad_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, 2.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition shoulderpad_r2 = ShoulderPadLeft.addOrReplaceChild("shoulderpad_r2",
				CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition ShoulderPadRight = Body.addOrReplaceChild("ShoulderPadRight", CubeListBuilder.create()
				.texOffs(0, 10).addBox(4.0F, -25.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0F, 24.0F, 0.0F));

		PartDefinition shoulderpad_r3 = ShoulderPadRight.addOrReplaceChild("shoulderpad_r3",
				CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, 2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition shoulderpad_r4 = ShoulderPadRight.addOrReplaceChild("shoulderpad_r4",
				CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -24.0F, -2.0F, -0.0218F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 0)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 0)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}