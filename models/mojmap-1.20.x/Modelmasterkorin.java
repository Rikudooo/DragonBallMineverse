// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmasterkorin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "masterkorin"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;

	public Modelmasterkorin(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(36, 59)
						.addBox(-1.5F, -0.0313F, -2.4625F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 62)
						.addBox(-1.5F, 0.0188F, -3.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 62)
						.addBox(0.5F, 0.0188F, -3.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 61)
						.addBox(-0.5F, -0.0062F, -3.6125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 23.0313F, -1.5375F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(50, 59)
						.addBox(-1.5F, -0.0313F, -2.4625F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 62)
						.addBox(-1.5F, 0.0188F, -3.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 62)
						.addBox(0.5F, 0.0188F, -3.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 61)
						.addBox(-0.5F, -0.0062F, -3.6125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 23.0313F, -1.5375F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.5F, 0.0F, -2.5F, 9.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -0.5F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(4, 18).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4812F, 5.6137F, 2.1315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.02F, 5.635F, 3.25F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = Tail1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(2, 16).addBox(-0.95F, -1.3575F, -3.7674F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0487F, 0.3939F, 3.4566F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.025F, 3.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition cube_r3 = Tail2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.25F, -1.4375F, -0.6163F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 0.5665F, 0.5161F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.8F, 4.1F));

		PartDefinition cube_r4 = Tail3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.25F, 3.0625F, -8.1563F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 3.3843F, 8.2856F, -0.925F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Tail4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.25F, 7.7812F, -7.4063F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2512F, 5.9579F, 9.6766F, -1.4312F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, 15.5F, -0.5F, 1.0264F, -0.2635F, 0.1564F));

		PartDefinition cube_r6 = LeftArm
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(12, 57).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r7 = LeftArm
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(12, 57).addBox(-1.5F, -0.25F, -2.0F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 2.75F, 0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r8 = LeftArm
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(12, 57).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 52).addBox(-3.5F, -1.5F, -1.5F, 3.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.5F, -0.5F, -1.309F, -0.4363F, 0.0F));

		PartDefinition Staff = RightArm.addOrReplaceChild("Staff", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.8025F, 5.7651F, -2.3103F, 0.1312F, -0.1043F, -0.2319F));

		PartDefinition cube_r9 = Staff.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(40, 43)
						.addBox(-3.75F, -0.25F, -16.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-4.0F, -0.35F, -15.9F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-3.75F, -0.5F, -16.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 44)
						.addBox(4.25F, -0.25F, -15.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 44)
						.addBox(2.25F, -0.25F, -15.65F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-0.75F, -0.25F, -15.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 26)
						.addBox(0.25F, 0.75F, -15.5F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3025F, 0.3463F, 2.9337F, -0.7289F, 0.2651F, -0.2298F));

		PartDefinition cube_r10 = Staff.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(41, 44).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7837F, -8.0376F, -9.0025F, -1.1042F, 0.7674F, -0.9432F));

		PartDefinition cube_r11 = Staff.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(41, 44)
						.addBox(0.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 44)
						.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3858F, -8.3025F, -9.3182F, -1.1042F, 0.7674F, -0.9432F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(28, 0)
				.addBox(-3.5F, -6.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 5)
				.addBox(-1.5F, -2.25F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
				.addBox(1.5F, -3.15F, -4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 0).mirror()
				.addBox(-5.5F, -3.15F, -4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 5)
				.addBox(-1.0F, -1.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 9)
				.addBox(-0.5F, -2.75F, -4.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -0.5F));

		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6414F, -5.4343F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -3.7F, 2.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1464F, -3.5251F, -3.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.4213F, -5.861F, -2.9167F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(56, 11)
						.addBox(-4.0F, -4.25F, 0.75F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 11)
						.addBox(-4.0F, -4.0F, 0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 11)
						.addBox(-4.0F, -4.5F, 0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2299F, -0.4127F, -0.5833F, 0.0F, 0.0F, -1.1781F));

		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.4213F, -5.861F, -2.9167F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(56, 11).mirror()
						.addBox(0.0F, -4.25F, 0.75F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(56, 11).mirror().addBox(0.0F, -4.0F, 0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 11).mirror()
						.addBox(0.0F, -4.5F, 0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2299F, -0.4127F, -0.5833F, 0.0F, 0.0F, 1.1781F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}