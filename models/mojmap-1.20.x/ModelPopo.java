// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPopo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "popo"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;
	private final ModelPart Head;

	public ModelPopo(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 51)
						.addBox(-1.9F, 0.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-1.9F, 3.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-1.9F, 6.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition Shoe2 = LeftLeg.addOrReplaceChild("Shoe2", CubeListBuilder.create().texOffs(50, 48).addBox(-1.5F,
				-1.4443F, 0.4541F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.575F, 10.4443F, -2.4541F));

		PartDefinition RightLeg_r1 = Shoe2.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(54, 45)
						.addBox(-1.5F, -1.0F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 45)
						.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.103F, -0.6134F, -0.3491F, 0.0F, 0.0F));

		PartDefinition RightLeg_r2 = Shoe2
				.addOrReplaceChild("RightLeg_r2",
						CubeListBuilder.create().texOffs(54, 42).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition bone5 = LeftLeg.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 51).mirror()
						.addBox(-0.2461F, -7.832F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 51).mirror()
						.addBox(-0.2461F, -4.832F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.3711F, 7.832F, 0.0F));

		PartDefinition LeftLeg_r1 = bone5.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(0, 51).mirror()
						.addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4617F));

		PartDefinition LeftLeg_r2 = bone5.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(0, 51).mirror()
						.addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.256F, -0.8289F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 51)
						.addBox(-3.125F, 6.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.125F, 3.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.125F, 0.0F, -5.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition Shoe = RightLeg.addOrReplaceChild("Shoe", CubeListBuilder.create().texOffs(50, 48).addBox(-1.5F,
				-1.4443F, 0.4541F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.625F, 10.4443F, -2.4541F));

		PartDefinition RightLeg_r3 = Shoe.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(54, 45)
						.addBox(-1.5F, -1.0F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 45)
						.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.103F, -0.6134F, -0.3491F, 0.0F, 0.0F));

		PartDefinition RightLeg_r4 = Shoe
				.addOrReplaceChild("RightLeg_r4",
						CubeListBuilder.create().texOffs(54, 42).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition bone4 = RightLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 51)
						.addBox(-1.7539F, -7.832F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-1.7539F, -4.832F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.3711F, 7.832F, 0.0F));

		PartDefinition RightLeg_r5 = bone4
				.addOrReplaceChild("RightLeg_r5",
						CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.4617F));

		PartDefinition RightLeg_r6 = bone4.addOrReplaceChild("RightLeg_r6",
				CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.256F, -0.8289F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48)
				.addBox(2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-6.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = Body.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 26)
				.addBox(-7.0F, -24.0F, -5.0F, 1.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 26).mirror()
				.addBox(6.0F, -24.0F, -5.0F, 1.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 0)
				.mirror().addBox(-6.0F, -24.0F, -5.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition turban = Head.addOrReplaceChild("turban", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = turban.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(50, 8)
						.addBox(-4.1F, -9.0F, -4.2F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 1)
						.addBox(1.1F, -9.0F, -4.2F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 1)
						.addBox(1.1F, -9.0F, 0.175F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 9)
						.addBox(-1.5F, -8.0F, -4.2F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-1.1F, -8.85F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-0.7F, -8.85F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-0.9F, -8.85F, 3.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-1.1F, -8.85F, 3.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.5F, -8.85F, -0.825F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.1F, -9.0F, 0.15F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-0.9F, -9.0F, 0.15F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(0.95F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.75F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-3.95F, -9.225F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-3.95F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(0.95F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.75F, -9.225F, -3.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.1F, -9.0F, -4.175F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-0.9F, -9.0F, -4.175F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.5F, -9.0F, -2.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-1.5F, -8.85F, -3.225F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 11)
						.addBox(-1.5F, -8.0F, -0.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 9)
						.addBox(-1.5F, -8.0F, 0.175F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 11)
						.addBox(-4.1F, -9.0F, -0.2F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 11)
						.addBox(1.1F, -9.0F, -0.35F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 8)
						.addBox(-4.1F, -9.0F, 0.175F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = turban.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(60, 0)
						.addBox(-1.0F, -7.0F, -4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 4)
						.addBox(-0.5F, -7.0F, -4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 0.1F, 0.35F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(25, 0).addBox(4.2352F,
				-3.5611F, -0.2218F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = Ears.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(21, 18).addBox(-0.425F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8249F, 0.274F, 0.2849F));

		PartDefinition head_r2 = Ears.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(21, 18).addBox(-0.25F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 0.5F, 0.8702F, 0.3897F, 0.4233F));

		PartDefinition Ears2 = Head.addOrReplaceChild("Ears2", CubeListBuilder.create().texOffs(25, 0).mirror()
				.addBox(-5.2352F, -3.5611F, -0.2218F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r3 = Ears2.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(21, 18).mirror()
						.addBox(-0.575F, -1.0F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8249F, -0.274F, -0.2849F));

		PartDefinition head_r4 = Ears2.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(21, 18).mirror()
						.addBox(-0.75F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.5F, 0.8702F, -0.3897F, -0.4233F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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