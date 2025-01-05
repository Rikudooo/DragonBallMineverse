// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelarcosian_cooler_3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "arcosian_cooler_3"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelarcosian_cooler_3(ModelPart root) {
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

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(18, 28)
				.addBox(-4.0F, -22.0F, -2.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 28)
				.addBox(-4.0F, -22.0F, 1.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 24)
				.addBox(3.5F, -22.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 24).mirror()
				.addBox(-4.5F, -22.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition torso_r1 = bone.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(18, 28).mirror()
				.addBox(-2.5F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 28)
				.mirror().addBox(-2.5F, -1.5F, -4.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5F, -22.5F, 2.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition torso_r2 = bone.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(18, 28).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.1213F, -22.5F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition torso_r3 = bone.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(18, 28).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.1213F, -22.5F, -2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition torso_r4 = bone.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(18, 28).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1213F, -22.5F, 2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition torso_r5 = bone.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(18, 28).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1213F, -22.5F, -2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition torso_r6 = bone.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(17, 27).mirror()
				.addBox(-0.5F, -0.875F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 27).mirror().addBox(3.5F, -0.875F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(18, 28).mirror()
				.addBox(0.5F, -0.875F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5F, -22.5F, -2.0F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition torso_r7 = bone.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(17, 27)
						.addBox(-0.5F, -0.875F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 28)
						.addBox(-3.5F, -0.875F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 27)
						.addBox(-4.5F, -0.875F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -22.5F, -2.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition torso_r8 = bone.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(18, 28)
						.addBox(-1.5F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 28)
						.addBox(-1.5F, -1.5F, -4.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -22.5F, 2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}