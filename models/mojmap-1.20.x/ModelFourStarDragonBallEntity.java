// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFourStarDragonBallEntity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fourstardragonballentity"), "main");
	private final ModelPart DragonBall;

	public ModelFourStarDragonBallEntity(ModelPart root) {
		this.DragonBall = root.getChild("DragonBall");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition DragonBall = partdefinition.addOrReplaceChild("DragonBall",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, 7.6F, -1.25F, 2.5F, 0.2F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, 4.9F, -1.25F, 2.5F, 0.2F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.45F, 5.1F, 1.2F, 2.5F, 2.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.45F, 5.1F, -1.4F, 2.5F, 2.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, 5.1F, -1.25F, 0.2F, 2.5F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.7F, 5.1F, -1.25F, 0.2F, 2.5F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition Stars = DragonBall.addOrReplaceChild("Stars",
				CubeListBuilder.create().texOffs(13, 15)
						.addBox(-0.25F, -0.2F, -1.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 15)
						.addBox(1.0F, -0.7F, -1.25F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 15)
						.addBox(0.25F, 0.05F, -0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 15)
						.addBox(1.25F, -0.2F, -0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7F, 6.3F, 0.75F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		DragonBall.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}