// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_zamasu_ssj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_zamasu_ssj"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_zamasu_ssj(ModelPart root) {
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

		PartDefinition hair = Head.addOrReplaceChild("hair", CubeListBuilder.create(),
				PartPose.offset(0.0626F, -9.8569F, 3.0376F));

		PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, -2.4879F, -0.2316F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0079F, -0.0368F));

		PartDefinition cube_r2 = hair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 56).addBox(-1.0F, -0.4798F, -0.9143F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3316F, 0.0079F, -0.0368F));

		PartDefinition cube_r3 = hair.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(55, 57).addBox(-0.55F, -3.7009F, 0.4088F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5126F, -1.4579F, -3.096F, 0.4887F, 0.0F, -0.1745F));

		PartDefinition cube_r4 = hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(54, 56).addBox(-1.05F, -1.8387F, -0.7274F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5126F, -1.4579F, -3.096F, 0.1396F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = hair.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 57).addBox(-0.443F, -2.0083F, 0.1282F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6828F, 3.8433F, -6.9174F, 2.9482F, 1.0754F, 0.1682F));

		PartDefinition cube_r6 = hair.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(52, 55).addBox(-1.4362F, 0.3829F, -0.6109F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1829F, 3.8165F, -7.9938F, 1.4237F, 0.4996F, -0.2551F));

		PartDefinition cube_r7 = hair.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(54, 57).addBox(-0.2296F, -2.4394F, 0.9881F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4132F, 0.4727F, -7.1655F, 1.9593F, 0.642F, 0.1565F));

		PartDefinition cube_r8 = hair.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(53, 56).addBox(-0.9408F, -1.7318F, -0.4599F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4132F, 0.4727F, -7.1655F, 1.1818F, 0.3309F, 0.0257F));

		PartDefinition cube_r9 = hair.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 55).addBox(-1.45F, 0.8148F, -0.9416F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5126F, -1.4579F, -3.096F, -0.1396F, 0.0F, -0.1745F));

		PartDefinition cube_r10 = hair.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(52, 55).addBox(-1.2964F, 0.3842F, -0.6239F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4132F, 0.4727F, -7.1655F, 0.6421F, 0.3107F, -0.0252F));

		PartDefinition bone = hair.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1829F, 2.6165F, -8.1438F, -0.3927F, -0.7854F, -2.7489F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(54, 57).addBox(-0.4964F, -3.4578F, 0.9881F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -0.25F, 2.714F, 0.502F, -0.1465F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(53, 56).addBox(-1.081F, -1.7265F, -0.4553F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -0.25F, 1.9731F, 0.4797F, -0.2002F));

		PartDefinition bone2 = hair.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-3.6828F, 3.8433F, -6.9174F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(53, 56).addBox(-1.0041F, -0.8257F, -0.1116F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1747F, 1.063F, 0.0623F));

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