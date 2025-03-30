// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbeerus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beerus"), "main");
	private final ModelPart Head;
	private final ModelPart ears;
	private final ModelPart Body;
	private final ModelPart tail;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelbeerus(ModelPart root) {
		this.Head = root.getChild("Head");
		this.ears = this.Head.getChild("ears");
		this.Body = root.getChild("Body");
		this.tail = this.Body.getChild("tail");
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

		PartDefinition ears = Head.addOrReplaceChild("ears", CubeListBuilder.create().texOffs(11, 4)
				.addBox(-5.9682F, -36.8128F, 0.75F, 3.75F, 4.75F, 1.25F, new CubeDeformation(0.0F)).texOffs(10, 2)
				.addBox(-5.7182F, -41.5628F, 1.0F, 3.25F, 4.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
				.addBox(-5.4682F, -45.0628F, 1.0F, 2.75F, 3.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
				.addBox(2.7182F, -45.0628F, 1.0F, 2.75F, 3.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
				.addBox(2.2182F, -36.8128F, 0.75F, 3.75F, 4.75F, 1.25F, new CubeDeformation(0.0F)).texOffs(11, 2)
				.addBox(2.4682F, -41.5628F, 1.0F, 3.25F, 4.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 7)
				.addBox(4.7182F, -41.3128F, 0.75F, 1.5F, 1.75F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ear10_r1 = ears.addOrReplaceChild("ear10_r1",
				CubeListBuilder.create().texOffs(10, 3).addBox(-0.25F, 2.0F, -0.625F, 3.75F, 5.0F, 1.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -35.25F, 1.375F, 0.0F, 0.0F, 0.3927F));

		PartDefinition ear7_r1 = ears.addOrReplaceChild("ear7_r1",
				CubeListBuilder.create().texOffs(10, 3).addBox(-1.25F, -1.0F, -0.625F, 2.5F, 3.0F, 1.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6288F, -28.8293F, 1.375F, 0.0F, 0.0F, 1.1781F));

		PartDefinition ear2_r1 = ears.addOrReplaceChild("ear2_r1",
				CubeListBuilder.create().texOffs(10, 1).addBox(-1.25F, -1.0F, -0.625F, 2.5F, 3.0F, 1.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6288F, -28.8293F, 1.375F, 0.0F, 0.0F, -1.1781F));

		PartDefinition ear1_r1 = ears.addOrReplaceChild("ear1_r1",
				CubeListBuilder.create().texOffs(9, 2).addBox(-3.5F, 2.0F, -0.625F, 3.75F, 5.0F, 1.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -35.25F, 1.375F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 50)
						.addBox(-3.0F, 12.0F, -3.25F, 6.0F, 4.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 35)
						.addBox(-3.0F, 16.75F, -3.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mark4_r1 = Body.addOrReplaceChild("mark4_r1",
				CubeListBuilder.create().texOffs(24, 58).addBox(-1.0F, -1.125F, -0.125F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4974F, 17.5884F, -3.125F, 0.0F, 0.0F, 0.7854F));

		PartDefinition mark3_r1 = Body.addOrReplaceChild("mark3_r1",
				CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.125F, -0.125F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4974F, 17.5884F, -3.125F, 0.0F, 0.0F, -0.7854F));

		PartDefinition mark1_r1 = Body.addOrReplaceChild("mark1_r1",
				CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -0.875F, -0.5F, 6.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.2228F, -2.4812F, -1.1781F, 0.0F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(8, 1).addBox(-1.25F,
				-14.75F, 2.0F, 2.5F, 2.5F, 4.75F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail9_r1 = tail.addOrReplaceChild("tail9_r1",
				CubeListBuilder.create().texOffs(9, 1)
						.addBox(-0.75F, -0.75F, 2.25F, 1.5F, 1.5F, 5.75F, new CubeDeformation(0.0F)).texOffs(10, 1)
						.addBox(-1.0F, -1.0F, -2.25F, 2.0F, 2.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6568F, -17.3744F, 15.8549F, 2.3166F, -1.0228F, -2.3957F));

		PartDefinition tail7_r1 = tail.addOrReplaceChild("tail7_r1",
				CubeListBuilder.create().texOffs(10, 1)
						.addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(10, 1)
						.addBox(-1.25F, -1.25F, -1.5F, 2.5F, 2.5F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9607F, -17.6748F, 16.5801F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition tail5_r1 = tail.addOrReplaceChild("tail5_r1",
				CubeListBuilder.create().texOffs(10, 2).addBox(-1.25F, -1.25F, -1.5F, 2.5F, 2.5F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5532F, -17.4915F, 16.1377F, 0.8249F, -1.0228F, -0.7459F));

		PartDefinition tail4_r1 = tail.addOrReplaceChild("tail4_r1",
				CubeListBuilder.create().texOffs(10, 1).addBox(-1.25F, -1.25F, -2.375F, 2.5F, 2.5F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.131F, -17.2064F, 15.4494F, 0.5299F, -0.7119F, -0.3655F));

		PartDefinition tail3_r1 = tail.addOrReplaceChild("tail3_r1",
				CubeListBuilder.create().texOffs(9, 1).addBox(-1.25F, -1.25F, -2.375F, 2.5F, 2.5F, 4.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8137F, -15.8792F, 12.2453F, 0.4215F, -0.3614F, -0.1572F));

		PartDefinition tail2_r1 = tail.addOrReplaceChild("tail2_r1",
				CubeListBuilder.create().texOffs(9, 2).addBox(-1.25F, -1.25F, -2.375F, 2.5F, 2.5F, 4.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.3137F, 8.4659F, 0.3927F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(41, 16)
						.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(1, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 42)
						.addBox(-2.25F, 9.5F, -2.25F, 4.5F, 2.5F, 4.5F, new CubeDeformation(0.0F)).texOffs(1, 56)
						.addBox(-2.75F, 9.25F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 1)
						.addBox(-2.0F, 10.25F, -3.5F, 4.0F, 1.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(43, 43)
						.addBox(-2.75F, 9.25F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(6, 57)
						.addBox(-2.8125F, 9.25F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.125F, 0.25F, 1.25F, 4.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, 8.8747F, -2.3737F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.25F, 0.25F, 1.25F, 4.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8747F, 2.3737F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.25F, 0.25F, 1.25F, 4.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3737F, 8.8747F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(34, 1)
						.addBox(-2.0F, 10.25F, -3.5F, 4.0F, 1.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-2.25F, 9.25F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 42)
						.addBox(-2.25F, 9.5F, -2.25F, 4.5F, 2.5F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.25F, 0.25F, 1.25F, 4.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8747F, 2.3737F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.25F, 0.25F, 1.25F, 4.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3737F, 8.8747F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.125F, -0.625F, -2.125F, 0.25F, 1.25F, 4.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, 8.8747F, -2.3737F, 1.5708F, -1.1781F, -1.5708F));

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