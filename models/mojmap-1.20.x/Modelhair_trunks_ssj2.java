// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_trunks_ssj2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_trunks_ssj2"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_trunks_ssj2(ModelPart root) {
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
				PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition Hair_r1 = Hair.addOrReplaceChild("Hair_r1",
				CubeListBuilder.create().texOffs(58, 56).mirror()
						.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.6861F, -34.963F, -3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Hair_r2 = Hair.addOrReplaceChild("Hair_r2",
				CubeListBuilder.create().texOffs(58, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6861F, -34.963F, -3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone13 = Hair.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -23.0F, 0.0F));

		PartDefinition cube_r1 = bone13.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(58, 54).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, 3.0F, 0.0F, 0.0F, 2.8362F));

		PartDefinition cube_r2 = bone13.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(58, 54).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, 1.0F, 0.0F, 0.0F, 2.7053F));

		PartDefinition cube_r3 = bone13.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(58, 54).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.0F, -1.0F, 0.0F, 0.0F, 2.4871F));

		PartDefinition bone12 = bone13.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(58, 54).addBox(-0.2929F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -3.5F, -0.5942F, 0.5484F, 2.228F));

		PartDefinition bone11 = Hair.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(4.0F, -32.0F, 0.0F));

		PartDefinition cube_r4 = bone11.addOrReplaceChild("cube_r4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, -1.0F, -3.0F, 0.0F, 0.0F, -2.9671F));

		PartDefinition cube_r5 = bone11.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 52).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r6 = bone11.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 52).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, 3.0F, 0.0F, 0.0F, -2.9234F));

		PartDefinition cube_r7 = bone11.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(58, 52).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, 1.0F, 0.0F, 0.0F, -2.8362F));

		PartDefinition bone10 = bone11.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(58, 52).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -3.25F, -0.6353F, -0.4981F, -2.1457F));

		PartDefinition bone9 = Hair.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, -33.0F, -4.0F, 1.2053F, -0.147F, -0.3655F));

		PartDefinition bone5_r1 = bone9.addOrReplaceChild("bone5_r1",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 0.25F, 0.0F, -1.9363F, 0.147F, 0.7582F));

		PartDefinition bone8 = Hair.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.825F, -33.175F, -4.0F, 1.2053F, 0.147F, 0.3655F));

		PartDefinition bone6_r1 = bone8.addOrReplaceChild("bone6_r1",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 0.25F, 0.0F, -1.8557F, -0.274F, -0.7459F));

		PartDefinition Hair2 = Hair.addOrReplaceChild("Hair2",
				CubeListBuilder.create().texOffs(60, 60)
						.addBox(2.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(-3.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r8 = Hair2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(58, 54).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, 4.5F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Hair2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(58, 54).addBox(-1.25F, -5.0F, -0.625F, 2.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -9.0F, 4.5F, 2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r11_r1 = cube_r9.addOrReplaceChild("cube_r11_r1",
				CubeListBuilder.create().texOffs(58, 54).mirror()
						.addBox(-10.0F, -38.0F, 1.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.25F, 33.0F, -4.5F, -0.0873F, 0.0F, 0.2182F));

		PartDefinition cube_r10_r1 = cube_r9.addOrReplaceChild("cube_r10_r1",
				CubeListBuilder.create().texOffs(58, 54).addBox(8.0F, -38.0F, 1.0F, 2.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 33.0F, -4.5F, -0.0873F, 0.0F, -0.2182F));

		PartDefinition Hair3 = Hair.addOrReplaceChild("Hair3",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(-4.5F, -33.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.5F, -33.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
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
						.addBox(-4.0F, -34.0F, -4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Hair3.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -23.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -10.0F, -3.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone3 = Hair3.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(6.0F, -23.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.75F, -10.0F, -4.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone5 = Hair3.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, -33.0F, -4.0F, 1.2053F, -0.147F, -0.3655F));

		PartDefinition bone6 = Hair3.addOrReplaceChild("bone6", CubeListBuilder.create(),
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