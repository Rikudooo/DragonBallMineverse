// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_trunks_base<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_trunks_base"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_trunks_base(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
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

		PartDefinition Hair = Head.addOrReplaceChild("Hair",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(-4.5F, -33.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.5F, -33.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-4.5F, -33.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.5F, -33.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.0F, -33.0F, 1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.0F, -33.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.0F, -33.0F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(0.25F, -33.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-1.25F, -33.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(0.25F, -33.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-1.25F, -33.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(0.25F, -33.5F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-1.25F, -33.5F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(1.0F, -34.0F, 1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-4.0F, -34.0F, 1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(1.0F, -34.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-4.0F, -34.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(1.0F, -34.0F, -4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-4.0F, -34.0F, -4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(2.0F, -33.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(-3.0F, -33.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(0.0F, -33.0F, 4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-4.0F, -33.0F, 4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition bone = Hair.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(58, 58)
						.addBox(-2.0F, -10.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -23.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(58, 58).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -10.0F, -3.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone3 = Hair.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(58, 58)
						.addBox(-2.0F, -10.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(-2.0F, -10.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -23.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(58, 58).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -10.0F, -4.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone5 = Hair.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -33.0F, -4.0F, 1.2053F, -0.147F, -0.3655F));

		PartDefinition bone6 = Hair.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.825F, -33.175F, -4.0F, 1.2053F, 0.147F, 0.3655F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

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