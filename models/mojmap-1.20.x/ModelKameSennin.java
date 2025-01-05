// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKameSennin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kamesennin"), "main");
	private final ModelPart KameSennin;

	public ModelKameSennin(ModelPart root) {
		this.KameSennin = root.getChild("KameSennin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition KameSennin = partdefinition.addOrReplaceChild("KameSennin", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = KameSennin.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(29, 0)
						.addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-2.0F, -2.0F, -3.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-1.0F, 2.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -19.0F, -1.0F));

		PartDefinition Body = KameSennin.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -3.0F, -2.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 11)
						.addBox(0.0F, 4.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
						.addBox(-5.0F, 4.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-6.5F, -6.0F, 2.0F, 13.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition RightArm = KameSennin.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -17.0F, 2.0F));

		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 12).addBox(-7.0F, -2.0F, -7.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 5.0F, -2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Staff = RightArm.addOrReplaceChild("Staff", CubeListBuilder.create(),
				PartPose.offset(5.0F, 5.0F, -2.0F));

		PartDefinition cube_r2 = Staff.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-6.0F, 9.0F, -10.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.5F, 8.5F, -12.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-5.5F, 9.5F, -9.0F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, 9.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArm = KameSennin.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 12).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -19.0F, 0.0F));

		PartDefinition RightLeg = KameSennin.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 19)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 32)
						.addBox(-2.0F, 8.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -9.0F, 0.0F));

		PartDefinition LeftLeg = KameSennin.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(49, 19)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-2.0F, 8.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -9.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		KameSennin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}