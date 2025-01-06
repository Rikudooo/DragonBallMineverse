// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDragonBall<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragonball"), "main");
	private final ModelPart DragonBall;

	public ModelDragonBall(ModelPart root) {
		this.DragonBall = root.getChild("DragonBall");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition DragonBall = partdefinition.addOrReplaceChild("DragonBall",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-1.3F, 7.8F, -1.2F, 2.5F, 0.2F, 2.5F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-1.3F, 5.1F, -1.2F, 2.5F, 0.2F, 2.5F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-1.25F, 5.3F, 1.25F, 2.5F, 2.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-1.25F, 5.3F, -1.35F, 2.5F, 2.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(1.2F, 5.3F, -1.2F, 0.2F, 2.5F, 2.5F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-1.5F, 5.3F, -1.2F, 0.2F, 2.5F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

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