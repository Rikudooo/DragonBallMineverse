// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmajin_parts<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "majin_parts"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmajin_parts(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Antenna = Head.addOrReplaceChild("Antenna", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -0.9F, -5.5F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Antenna.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(41, 24).addBox(-0.5F, -0.75F, -0.125F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -9.6686F, 12.0891F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Antenna.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(42, 25).addBox(-0.5F, -2.75F, 0.875F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.1686F, 10.4891F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Antenna.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(43, 22).addBox(-0.5625F, -1.375F, 1.75F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0625F, -14.4052F, 8.1963F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Antenna.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(43, 22).addBox(-1.125F, -1.5F, 0.25F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1875F, -12.7413F, 4.1553F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Antenna.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(41, 23).addBox(-1.5F, -2.5625F, -1.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.625F, 2.125F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Dots = Body.addOrReplaceChild("Dots",
				CubeListBuilder.create().texOffs(16, 18)
						.addBox(-1.9F, 1.0F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(0.9F, 1.0F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(2.1F, 2.1F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(-3.1F, 2.1F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(2.9F, 3.5F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(-3.9F, 3.5F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Dots2 = RightArm.addOrReplaceChild("Dots2",
				CubeListBuilder.create().texOffs(16, 18)
						.addBox(-3.025F, 3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(-3.025F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(-3.025F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition Dots3 = LeftArm.addOrReplaceChild("Dots3",
				CubeListBuilder.create().texOffs(16, 18)
						.addBox(2.025F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(2.025F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(2.025F, 3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
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
	}
}