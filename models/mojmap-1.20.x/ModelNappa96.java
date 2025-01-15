// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNappa96<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nappa96"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelNappa96(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-6.75F, -12.75F, -6.25F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(24, 24)
						.addBox(-6.0F, 0.0F, -3.0F, 12.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 47)
						.addBox(-5.875F, 16.125F, -3.125F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(60, 24)
						.addBox(-4.5F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-4.375F, -2.875F, -3.125F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-7.5F, -9.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(48, 72)
						.addBox(-1.5F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.375F, -2.875F, -3.125F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(7.5F, -9.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.875F, 0.125F, -3.125F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.85F, 6.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 72)
						.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.875F, 0.125F, -3.125F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.85F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}