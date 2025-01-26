// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDabura<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dabura"), "main");
	private final ModelPart legL;
	private final ModelPart legR;
	private final ModelPart body;
	private final ModelPart armL;
	private final ModelPart armR;
	private final ModelPart head;

	public ModelDabura(ModelPart root) {
		this.legL = root.getChild("legL");
		this.legR = root.getChild("legR");
		this.body = root.getChild("body");
		this.armL = root.getChild("armL");
		this.armR = root.getChild("armR");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legL = partdefinition.addOrReplaceChild("legL",
				CubeListBuilder.create().texOffs(18, 52)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 62)
						.addBox(-2.0F, 12.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, 12.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-1.5F, 6.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
						.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 10.0F, 0.0F));

		PartDefinition legR = partdefinition.addOrReplaceChild("legR",
				CubeListBuilder.create().texOffs(18, 52)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 62)
						.addBox(-2.0F, 12.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, 12.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-1.5F, 6.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
						.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 10.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(44, 9)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 38)
						.addBox(-3.5F, 9.0F, -1.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 25)
						.addBox(-5.0F, 2.0F, -3.0F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, 2.0F, -3.0F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(54, 0)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 38)
						.addBox(5.0F, 0.0F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 38)
						.addBox(-6.0F, 0.0F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-5.0F, -1.0F, 3.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-6.0F, 7.0F, 4.0F, 12.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-2.0F, 9.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition armL = partdefinition.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(0, 51)
						.addBox(-2.0F, -2.0F, -1.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 52)
						.addBox(-1.0F, 4.0F, -1.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 43)
						.addBox(-1.0F, 4.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)),
				PartPose.offset(8.0F, 0.0F, -0.5F));

		PartDefinition armR = partdefinition.addOrReplaceChild("armR",
				CubeListBuilder.create().texOffs(50, 15)
						.addBox(-3.0F, -2.0F, -1.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 25)
						.addBox(-2.0F, 4.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(34, 52)
						.addBox(-2.0F, 4.0F, -1.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 0.0F, -0.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -10.0F, -5.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 53)
						.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -10.0F, -1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.0F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(33, 38)
						.addBox(-5.0F, -4.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-7.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(5.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 57)
						.addBox(0.0F, -4.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}