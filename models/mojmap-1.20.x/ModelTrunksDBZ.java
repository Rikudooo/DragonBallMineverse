// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTrunksDBZ<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trunksdbz"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelTrunksDBZ(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-1.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-1.5F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(2.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(1.75F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(3.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(4.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(5.0F, -9.25F, -4.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(0.0F, -9.25F, -4.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-1.0F, -9.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition bone = Hair.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-2.0F, -10.0F, -4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -10.0F, -3.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone3 = Hair.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-2.0F, -10.0F, -4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-2.0F, -10.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 1.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -10.0F, -4.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone5 = Hair.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(44, 0).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -9.0F, -4.0F, 1.2053F, -0.147F, -0.3655F));

		PartDefinition bone6 = Hair.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(44, 0).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.175F, -9.175F, -4.0F, 1.2053F, 0.147F, 0.3655F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone7 = Body.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(58, 49)
						.addBox(-1.0F, -7.0F, 0.0F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-2.0F, -8.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 43)
						.addBox(-0.5F, -12.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.5F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.25F, -13.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.75F, -13.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.75F, -13.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 62)
						.addBox(-0.25F, -13.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, 2.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}