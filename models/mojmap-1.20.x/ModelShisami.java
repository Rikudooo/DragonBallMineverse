// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShisami<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shisami"), "main");
	private final ModelPart Head;
	private final ModelPart Ears3;
	private final ModelPart Ears;
	private final ModelPart Ears2;
	private final ModelPart Horns;
	private final ModelPart Horns2;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelShisami(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Ears3 = this.Head.getChild("Ears3");
		this.Ears = this.Ears3.getChild("Ears");
		this.Ears2 = this.Ears3.getChild("Ears2");
		this.Horns = this.Head.getChild("Horns");
		this.Horns2 = this.Head.getChild("Horns2");
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

		PartDefinition Ears3 = Head.addOrReplaceChild("Ears3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ears = Ears3.addOrReplaceChild("Ears", CubeListBuilder.create(),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head_r1 = Ears.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(18, 8).addBox(-0.425F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8249F, 0.274F, 0.2849F));

		PartDefinition head_r2 = Ears.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(18, 8).addBox(-0.25F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8702F, 0.3897F, 0.4233F));

		PartDefinition Ears2 = Ears3.addOrReplaceChild("Ears2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head_r3 = Ears2.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(18, 8).mirror()
						.addBox(-0.575F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8249F, -0.274F, -0.2849F));

		PartDefinition head_r4 = Ears2.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(18, 8).mirror()
						.addBox(-0.75F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8702F, -0.3897F, -0.4233F));

		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(),
				PartPose.offset(0.75F, 0.5F, 0.0F));

		PartDefinition Head_r5 = Horns.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(31, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8777F, -7.4025F, -3.303F, -0.2742F, 0.0381F, 0.6669F));

		PartDefinition Head_r6 = Horns.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(31, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -7.0F, -1.0F, 0.0F, -0.7854F, 0.3927F));

		PartDefinition Horns2 = Head.addOrReplaceChild("Horns2", CubeListBuilder.create(),
				PartPose.offset(-0.75F, 0.5F, 0.0F));

		PartDefinition Head_r7 = Horns2.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(31, 0).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.8777F, -7.4025F, -3.303F, -0.2742F, -0.0381F, -0.6669F));

		PartDefinition Head_r8 = Horns2.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(31, 0).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -7.0F, -1.0F, 0.0F, 0.7854F, -0.3927F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 11)
						.addBox(-5.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
						.addBox(3.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
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