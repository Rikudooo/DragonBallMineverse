// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WhisHair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "whishair"), "main");
	private final ModelPart Hair;

	public WhisHair(ModelPart root) {
		this.Hair = root.getChild("Hair");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(2, 112).addBox(-3.5F, -57.25F, -3.0F, 1.75F, 5.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(2.0F, -54.0F, -1.75F, 1.75F, 5.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-3.5F, -57.25F, -2.0F, 6.75F, 5.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-2.775F, -63.45F, -2.75F, 5.75F, 7.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-2.2F, -66.45F, -1.225F, 5.175F, 7.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-1.425F, -66.25F, 0.775F, 4.175F, 7.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-3.25F, -52.675F, -4.15F, 6.75F, 2.25F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(2, 112).addBox(-3.25F, -56.4F, -3.75F, 6.75F, 5.25F, 5.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}