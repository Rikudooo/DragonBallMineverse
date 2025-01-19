// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfriezafullpower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "friezafullpower"), "main");
	private final ModelPart Head;
	private final ModelPart Ear;
	private final ModelPart Ear2;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelfriezafullpower(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Ear = this.Head.getChild("Ear");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.Tail1 = this.Tail.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Ear = Head.addOrReplaceChild("Ear",
				CubeListBuilder.create().texOffs(37, 39)
						.addBox(5.5F, -45.25F, -2.725F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 39)
						.addBox(5.5F, -45.25F, 1.25F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 41)
						.addBox(5.5F, -45.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 40)
						.addBox(5.5F, -41.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 92)
						.addBox(5.5F, -43.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 36.0F, 0.0F));

		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(39, 25)
						.addBox(5.5F, -45.25F, -2.725F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 25)
						.addBox(5.5F, -45.25F, 1.25F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 25)
						.addBox(5.5F, -45.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 25)
						.addBox(5.5F, -41.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 92)
						.addBox(5.5F, -43.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, 36.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(24, 24)
				.addBox(-6.0F, 0.0F, -3.0F, 12.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 3.75F));

		PartDefinition Tail1 = Tail.addOrReplaceChild("Tail1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.03F, -0.5475F, -1.125F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = Tail1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(65, 37).addBox(-1.425F, -2.0362F, -5.6511F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0731F, 0.5908F, 8.1849F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Tail1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(65, 37).addBox(-1.425F, -2.0362F, -5.6511F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0731F, 0.5908F, 5.1849F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0375F, 7.5F, 0.0F, 0.0F, 0.9163F));

		PartDefinition cube_r3 = Tail2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(66, 37).addBox(-1.875F, -2.1563F, -0.9245F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4695F, 2.3213F, 0.3724F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Tail2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(66, 37).addBox(-1.875F, -2.1563F, -0.9245F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4695F, 0.8213F, -2.2257F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.075F, 1.65F));

		PartDefinition cube_r5 = Tail3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(65, 37).addBox(-1.875F, 4.5938F, -12.2344F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3769F, 7.4723F, 14.2338F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Tail3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(65, 37).addBox(-1.875F, 4.5938F, -12.2344F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3769F, 5.0764F, 12.4284F, -0.925F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 4.5F, 4.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Tail4.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(65, 37).addBox(-1.875F, 11.6719F, -11.1094F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3769F, 7.8118F, 13.3899F, -1.4312F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(60, 24)
						.addBox(-4.5F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 24)
						.addBox(-4.5F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5F, -9.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 72)
				.addBox(-1.5F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.5F, -9.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.85F, 6.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(24, 72)
				.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.85F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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