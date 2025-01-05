// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_goku_base<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_goku_base"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_goku_base(ModelPart root) {
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

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bangs = Hair.addOrReplaceChild("Bangs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.25F));

		PartDefinition hairsmall_R2 = Bangs.addOrReplaceChild("hairsmall_R2", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -8.0F, -3.0F));

		PartDefinition cube_r1 = hairsmall_R2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(56, 59).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition hairsmall_R1 = Bangs.addOrReplaceChild("hairsmall_R1", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -8.0F, -3.0F));

		PartDefinition cube_r2 = hairsmall_R1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(56, 59).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition hairsmall_L2 = Bangs.addOrReplaceChild("hairsmall_L2", CubeListBuilder.create(),
				PartPose.offset(3.0F, -8.0F, -3.0F));

		PartDefinition cube_r3 = hairsmall_L2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(56, 59).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition hairsmall_L1 = Bangs.addOrReplaceChild("hairsmall_L1", CubeListBuilder.create(),
				PartPose.offset(1.0F, -8.0F, -3.0F));

		PartDefinition cube_r4 = hairsmall_L1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 59).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition bone = Hair.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -0.325F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(52, 60).addBox(1.5314F, -31.738F, 2.2404F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(51, 59).addBox(1.0512F, -31.5111F, -5.1664F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));

		PartDefinition bone6 = Hair.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.3569F, -6.2803F, 2.5721F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r7 = bone6.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(52, 60).mirror()
						.addBox(-3.5314F, -31.738F, 2.2404F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3569F, 30.2803F, -2.9221F, -2.8449F, 1.501F, 3.1416F));

		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 59).mirror()
				.addBox(-4.0512F, -31.5111F, -5.1664F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3569F, 30.2803F, -2.9221F, -3.1067F, 1.501F, -3.1416F));

		PartDefinition bone2 = Hair.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.3F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 60).addBox(1.6904F, -29.5163F, 1.3958F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(51, 59).addBox(1.0512F, -29.1186F, -5.4164F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));

		PartDefinition bone5 = Hair.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.7632F, -3.8946F, 2.7127F, 0.0F, 0.0F, 0.2705F));

		PartDefinition cube_r11 = bone5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 60).mirror()
				.addBox(-3.6904F, -29.5163F, 1.3958F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5132F, 27.8946F, -3.0127F, -2.8449F, 1.501F, 3.1416F));

		PartDefinition cube_r12 = bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 59).mirror()
				.addBox(-4.0512F, -29.1186F, -5.4164F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5132F, 27.8946F, -3.0127F, -3.1067F, 1.501F, -3.1416F));

		PartDefinition bone3 = Hair.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.2F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(52, 60).addBox(1.6197F, -26.9151F, 1.8127F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -2.8449F, -1.501F, -3.1416F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(51, 59).addBox(0.9806F, -26.7702F, -4.6374F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1067F, -1.501F, 3.1416F));

		PartDefinition bone4 = Hair.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.3607F, -1.552F, 2.6718F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 60).mirror()
				.addBox(-3.6197F, -26.9151F, 1.8127F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5107F, 25.552F, -2.8718F, -2.8449F, 1.501F, 3.1416F));

		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 59).mirror()
				.addBox(-3.9806F, -26.7702F, -4.6374F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5107F, 25.552F, -2.8718F, -3.1067F, 1.501F, -3.1416F));

		PartDefinition bone9 = Hair.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(-3.1488F, -9.874F, 0.6656F));

		PartDefinition cube_r17 = bone9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 57)
				.addBox(1.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 57)
				.addBox(2.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1488F, 33.874F, 0.9344F, -3.1067F, 1.5359F, -1.693F));

		PartDefinition bone12 = bone9.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.4098F, 1.1231F, 0.0209F, 0.0F, 0.0F, 0.384F));

		PartDefinition cube_r18 = bone12.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(56, 61)
				.addBox(0.5828F, -22.9593F, -24.3735F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
				.addBox(0.5828F, -22.9593F, -26.1735F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
				.addBox(0.5828F, -22.9593F, -28.1735F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.739F, 32.7509F, 0.9134F, -2.4784F, 1.5359F, -1.693F));

		PartDefinition cube_r19 = bone12.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(50, 60).addBox(-2.173F, -27.3937F, -24.5269F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.739F, 32.7509F, 0.9134F, -0.22F, 1.4517F, 0.3926F));

		PartDefinition bone10 = Hair.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(-2.3488F, -9.874F, -1.3344F));

		PartDefinition cube_r20 = bone10.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 57)
				.addBox(-0.9034F, -4.5788F, -33.979F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 57)
				.addBox(0.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 57)
				.addBox(2.0966F, -4.5788F, -33.979F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1488F, 33.874F, 0.9344F, -3.1067F, 1.5359F, -1.693F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.2098F, 0.7231F, 0.0209F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r21 = bone11.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(50, 60).addBox(-2.173F, -27.3937F, -24.5269F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.939F, 33.1509F, 0.9134F, -0.22F, 1.4517F, 0.3926F));

		PartDefinition cube_r22 = bone11.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(54, 60)
						.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0472F, -0.9356F, 0.0236F, -2.4784F, 1.5359F, -1.693F));

		PartDefinition bone7 = Hair.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-0.7788F, -8.684F, 2.275F));

		PartDefinition cube_r23 = bone7.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(52, 58).addBox(-2.5306F, -3.6672F, -34.7427F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4788F, 32.684F, -2.675F, -3.1067F, 1.5359F, -1.693F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.073F, -0.6127F, 0.1131F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(50, 60).addBox(-5.4881F, -27.0602F, -24.5531F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4058F, 33.2967F, -2.7881F, -0.22F, 1.4517F, 0.3926F));

		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(52, 59).addBox(-2.5144F, -22.5211F, -28.8072F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4058F, 33.2967F, -2.7881F, -2.4784F, 1.5359F, -1.693F));

		PartDefinition bone13 = Hair.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.288F, -7.9401F, 0.3957F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r26 = bone13.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 58)
				.addBox(-2.5534F, -6.4788F, -32.979F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 58)
				.addBox(-1.9034F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 58)
				.addBox(0.0966F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 58)
				.addBox(2.0966F, -6.4788F, -32.979F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4816F, 30.9414F, -0.7631F, -3.1067F, 1.5359F, -1.693F));

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