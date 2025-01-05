// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHalo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "halo"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelHalo(ModelPart root) {
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

		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(58, 61).addBox(5.0F,
				-14.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = bone.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9727F, 24.0F, -0.0273F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_r2 = bone.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3721F, 24.0F, 1.0467F, 0.0F, 1.1781F, 0.0F));

		PartDefinition head_r3 = bone.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4062F, 24.0F, 1.8091F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_r4 = bone.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2221F, 24.0F, 2.1439F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone3 = bone2
				.addOrReplaceChild("bone3",
						CubeListBuilder.create().texOffs(58, 61).addBox(5.0273F, -14.0F, -2.0273F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_r5 = bone3.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 24.0F, -0.0547F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_r6 = bone3.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3994F, 24.0F, 1.0193F, 0.0F, 1.1781F, 0.0F));

		PartDefinition head_r7 = bone3.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4335F, 24.0F, 1.7818F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_r8 = bone3.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2494F, 24.0F, 2.1165F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone4 = bone2
				.addOrReplaceChild("bone4",
						CubeListBuilder.create().texOffs(58, 61).addBox(5.0547F, -14.0F, -2.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head_r9 = bone4.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0273F, 24.0F, -0.0273F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_r10 = bone4.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4268F, 24.0F, 1.0467F, 0.0F, 1.1781F, 0.0F));

		PartDefinition head_r11 = bone4.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4609F, 24.0F, 1.8091F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_r12 = bone4.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2768F, 24.0F, 2.1439F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone5 = bone2
				.addOrReplaceChild("bone5",
						CubeListBuilder.create().texOffs(58, 61).addBox(5.0273F, -14.0F, -1.9727F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition head_r13 = bone5
				.addOrReplaceChild("head_r13",
						CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_r14 = bone5.addOrReplaceChild("head_r14",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3994F, 24.0F, 1.074F, 0.0F, 1.1781F, 0.0F));

		PartDefinition head_r15 = bone5.addOrReplaceChild("head_r15",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4335F, 24.0F, 1.8364F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_r16 = bone5.addOrReplaceChild("head_r16",
				CubeListBuilder.create().texOffs(58, 61).addBox(5.0F, -38.0F, -4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2494F, 24.0F, 2.1712F, 0.0F, 0.3927F, 0.0F));

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