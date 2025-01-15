// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspacepod<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spacepod"), "main");
	private final ModelPart Body;
	private final ModelPart spacepod;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelspacepod(ModelPart root) {
		this.Body = root.getChild("Body");
		this.spacepod = this.Body.getChild("spacepod");
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
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition spacepod = Body.addOrReplaceChild("spacepod", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-24.0F, -25.0F, -24.0F, 48.0F, 48.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
				.addBox(-20.0F, -33.0F, -20.0F, 40.0F, 64.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(134, 131)
				.addBox(-12.0F, -41.0F, -12.0F, 24.0F, 80.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition cube_r1 = spacepod.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-20.0F, -32.0F, -20.0F, 40.0F, 64.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(68, 72)
						.addBox(-12.0F, -40.0F, -12.0F, 24.0F, 80.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r2 = spacepod.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(160, 56)
						.addBox(-20.0F, -32.0F, -20.0F, 40.0F, 64.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(25, 20)
						.addBox(-12.0F, -40.0F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = spacepod.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(256, 269).addBox(-12.0F, -40.0F, -12.0F, 24.0F, 8.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -66.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-10.0F, -20.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(10.0F, -20.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
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