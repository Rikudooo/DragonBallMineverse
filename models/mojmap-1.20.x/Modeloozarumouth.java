// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloozarumouth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oozarumouth"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Mouth;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeloozarumouth(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Mouth = this.Head.getChild("Mouth");
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(48, 12).mirror()
				.addBox(-3.75F, -3.75F, -4.875F, 7.5F, 3.75F, 0.375F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 0).addBox(-3.0F, -3.75F, -7.875F, 6.0F, 3.75F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(51, 8).addBox(-3.0F, -2.25F, -7.9688F, 6.0F, 1.125F, 0.375F, new CubeDeformation(0.0F))
				.texOffs(53, 8).addBox(-1.875F, -1.125F, -7.9688F, 1.125F, 0.75F, 0.375F, new CubeDeformation(0.0F))
				.texOffs(53, 8).mirror()
				.addBox(0.75F, -1.125F, -7.9688F, 1.125F, 0.75F, 0.375F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 7).addBox(-3.15F, -2.625F, -7.9688F, 0.375F, 1.5F, 1.125F, new CubeDeformation(0.0F))
				.texOffs(52, 7).mirror()
				.addBox(2.775F, -2.625F, -7.9688F, 0.375F, 1.5F, 1.125F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 8).addBox(-1.3969F, -3.7687F, -7.8844F, 0.375F, 0.375F, 0.375F, new CubeDeformation(0.0F))
				.texOffs(47, 8).mirror()
				.addBox(1.0219F, -3.7687F, -7.8844F, 0.375F, 0.375F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.5F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 1.0F));

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