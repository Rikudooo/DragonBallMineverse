// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelssj4_eyeliner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ssj4_eyeliner"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Eyeliner;
	private final ModelPart Eyeliner2;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelssj4_eyeliner(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Eyeliner = this.Head.getChild("Eyeliner");
		this.Eyeliner2 = this.Head.getChild("Eyeliner2");
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Eyeliner = Head.addOrReplaceChild("Eyeliner",
				CubeListBuilder.create().texOffs(55, 56)
						.addBox(-1.05F, 2.95F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)).texOffs(55, 56)
						.addBox(-1.05F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).texOffs(55, 56)
						.addBox(1.0F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).texOffs(55, 56)
						.addBox(-1.05F, 4.0F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -8.0F, 0.025F));

		PartDefinition Eyeliner2 = Head.addOrReplaceChild("Eyeliner2", CubeListBuilder.create().texOffs(55, 56).mirror()
				.addBox(-1.05F, 2.95F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 56).mirror().addBox(1.0F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(55, 56).mirror()
				.addBox(-1.05F, 2.975F, -4.03F, 0.05F, 1.05F, 0.025F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 56).mirror().addBox(-1.05F, 4.0F, -4.03F, 2.1F, 0.05F, 0.025F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(2.0F, -8.0F, 0.025F));

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