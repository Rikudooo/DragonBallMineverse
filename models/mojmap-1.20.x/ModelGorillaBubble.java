// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGorillaBubble<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorillabubble"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Torso;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart Head;

	public ModelGorillaBubble(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Torso = root.getChild("Torso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 19.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 19.0F, 0.0F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(0, 50)
						.addBox(-8.0F, -9.4522F, -1.2654F, 16.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-8.0F, -4.1522F, -4.7654F, 16.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 3.8478F, 4.2346F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Torso_r1 = Torso.addOrReplaceChild("Torso_r1",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.35F, -0.875F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.8478F, 15.2346F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Torso.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 15).addBox(-8.0F, -8.3F, -7.725F, 16.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.8478F, -0.7654F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Torso.addOrReplaceChild("cube_r2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -19.1522F, -0.7654F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = Torso.addOrReplaceChild("cube_r3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.0F, -15.1522F, -0.7654F, 1.5708F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = Torso.addOrReplaceChild("cube_r4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.8478F, -0.7654F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Torso.addOrReplaceChild("cube_r5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-9.0F, -14.1522F, -0.7654F, 1.5708F, 3.1416F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(57, 14).addBox(-2.0F, -1.1585F, -2.2304F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 6.0F, -1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(57, 14).addBox(-2.0F, -1.5412F, -2.3066F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 7.0F, -1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(57, 0).addBox(
				-3.5F, -7.3F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -2.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 10.0F, -3.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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