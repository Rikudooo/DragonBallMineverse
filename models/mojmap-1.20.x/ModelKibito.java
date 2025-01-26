// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKibito<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kibito"), "main");
	private final ModelPart RightLeft;
	private final ModelPart LeftLeg;
	private final ModelPart Torso;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;

	public ModelKibito(ModelPart root) {
		this.RightLeft = root.getChild("RightLeft");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Torso = root.getChild("Torso");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeft = partdefinition.addOrReplaceChild("RightLeft",
				CubeListBuilder.create().texOffs(41, 42)
						.addBox(-1.5F, 1.0F, -3.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(-1.9F, 0.0F, -3.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(-1.5F, 0.0F, -3.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 8.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-2.5F, 1.0F, -3.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(-2.5F, 0.0F, -3.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(0.8F, 0.0F, -3.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 8.0F, 0.0F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.5F, 0.0F, -4.0F, 11.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-10.5F, -0.1F, -4.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 24)
						.addBox(5.5F, -0.1F, -4.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 17)
						.addBox(-5.5F, 10.0F, -4.15F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 35)
						.addBox(-5.5F, 10.0F, 1.15F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(-5.5F, 13.0F, 2.15F, 11.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-5.7F, 10.0F, -3.85F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(57, 44)
						.addBox(4.7F, 10.0F, -3.85F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-5.7F, 10.0F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.7F, 10.0F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 39)
						.addBox(-5.0F, 13.0F, -4.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
						.addBox(-5.0F, 13.0F, 2.0F, 10.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 115)
						.addBox(-5.0F, 13.0F, -4.0F, 10.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 109)
						.addBox(-5.0F, 13.0F, -4.0F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 55)
						.addBox(5.0F, 13.0F, -4.0F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 54)
				.addBox(0.0F, -2.5F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -2.5F, -1.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(56, 0)
				.addBox(-4.0F, -2.5F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, -2.5F, -1.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(12, 23)
						.addBox(-4.0F, -8.1657F, -4.3314F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(88, 53)
						.addBox(-5.0F, -0.7515F, -6.7456F, 10.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.05F, -4.8343F, -0.6686F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(88, 44).addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2929F, -2.1657F, -2.5029F, -0.6155F, -0.5236F, -0.6155F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(88, 44).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2929F, -2.1657F, -2.5029F, -0.6155F, -0.5236F, -0.6155F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(88, 44).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1657F, -5.3314F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(41, 2)
						.addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 2)
						.addBox(-0.5F, -0.75F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -3.9157F, -0.8314F, -0.8249F, 0.274F, -0.2849F));

		PartDefinition bone2 = Head.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(41, 2)
						.addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 2)
						.addBox(-0.5F, -0.75F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -3.9157F, -0.8314F, -0.8249F, -0.274F, 0.2849F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(42, 8)
						.addBox(-4.725F, -4.5F, 3.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 8)
						.addBox(-0.525F, -0.9F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 1.05F, 1.7F, 0.0F, -0.2618F, -0.6109F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.xRot = ageInTicks / 20.f;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}