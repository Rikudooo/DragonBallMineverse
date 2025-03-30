public class ModelWhis<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "whis"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;

	public ModelWhis(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 4.0F, 0.0F));

		PartDefinition cube_r1 = LeftLeg
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(106, 0).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 20.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 4.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(89, 0).addBox(-3.0F, -20.0F, -2.0F, 4.0F, 20.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 20.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 18)
						.addBox(-5.0F, -8.0F, -2.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -23.0F, -2.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 30)
						.addBox(-4.5F, -15.0F, -2.0F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition Robe = Body.addOrReplaceChild("Robe", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Robe.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(-2, 41).mirror()
						.addBox(-7.25F, -1.0F, -2.5F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.0718F));

		PartDefinition cube_r4 = Robe.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(-2, 41).addBox(6.25F, -1.0F, -2.5F, 1.0F, 25.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, 0.0F, -3.1416F, 0.0F, -3.0718F));

		PartDefinition cube_r5 = Robe.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(30, 30).addBox(-4.5F, -1.0F, 3.75F, 9.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition cube_r6 = Robe.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(52, 30).mirror()
						.addBox(-4.5F, -1.0F, -4.75F, 9.0F, 25.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, 3.0718F, 0.0F, -3.1416F));

		PartDefinition sidepart = Body.addOrReplaceChild("sidepart", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = sidepart.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(11, 41).mirror()
						.addBox(-3.0F, 0.0F, -0.125F, 6.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -23.0F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r8 = sidepart.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(11, 41).addBox(-3.0F, 0.0F, 0.125F, 6.0F, 28.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.0F, 2.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(56, 0)
				.addBox(0.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -17.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(73, 0).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -17.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Staff = RightArm.addOrReplaceChild("Staff", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Staff.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(78, 37)
						.addBox(-5.0F, -11.25F, -14.25F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
						.addBox(-2.75F, -5.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 45)
						.addBox(-3.5F, -9.75F, -15.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
						.addBox(-2.25F, -5.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
						.addBox(-2.25F, -5.0F, -14.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
						.addBox(-2.75F, -5.0F, -14.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
						.addBox(-2.5F, -5.0F, -14.75F, 1.0F, 46.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 0.0F));

		PartDefinition cube_r10 = Head
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(19, 56).addBox(-8.0F, -1.5F, -6.75F, 16.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair",
				CubeListBuilder.create().texOffs(2, 112)
						.addBox(-3.5F, -57.25F, -3.0F, 1.75F, 5.25F, 5.5F, new CubeDeformation(0.0F)).texOffs(2, 112)
						.addBox(2.0F, -54.0F, -1.75F, 1.75F, 5.25F, 5.5F, new CubeDeformation(0.0F)).texOffs(2, 112)
						.addBox(-3.5F, -57.25F, -2.0F, 6.75F, 5.25F, 5.5F, new CubeDeformation(0.0F)).texOffs(2, 112)
						.addBox(-2.775F, -63.45F, -2.75F, 5.75F, 7.25F, 5.5F, new CubeDeformation(0.0F)).texOffs(2, 112)
						.addBox(-2.2F, -66.45F, -1.225F, 5.175F, 7.25F, 5.5F, new CubeDeformation(0.0F)).texOffs(2, 112)
						.addBox(-1.425F, -66.25F, 0.775F, 4.175F, 7.25F, 5.5F, new CubeDeformation(0.0F))
						.texOffs(2, 112).addBox(-3.25F, -52.675F, -4.15F, 6.75F, 2.25F, 5.5F, new CubeDeformation(0.0F))
						.texOffs(2, 112).addBox(-3.25F, -56.4F, -3.75F, 6.75F, 5.25F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 43.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}