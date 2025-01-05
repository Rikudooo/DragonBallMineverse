// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_t_ssj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_t_ssj"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_t_ssj(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone7 = Hair.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition cube_r17_r1 = bone7.addOrReplaceChild("cube_r17_r1",
				CubeListBuilder.create().texOffs(55, 59)
						.addBox(-3.6148F, -1.55F, -1.7699F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
						.addBox(-3.6148F, -1.775F, 0.3051F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -30.0F, 0.0F, 0.0F, 0.0F, 0.4625F));

		PartDefinition cube_r14_r1 = bone7.addOrReplaceChild("cube_r14_r1",
				CubeListBuilder.create().texOffs(55, 59).addBox(-3.8648F, -2.85F, -2.4949F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -30.0F, 0.0F, 0.0F, 0.0F, 0.3229F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(4.4812F, -31.0637F, -2.0F));

		PartDefinition cube_r21_r1 = bone9.addOrReplaceChild("cube_r21_r1",
				CubeListBuilder.create().texOffs(55, 57)
						.addBox(-1.35F, -0.95F, 4.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 57)
						.addBox(-1.35F, -0.95F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 57)
						.addBox(-1.225F, -0.75F, 0.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 57)
						.addBox(-1.2F, -0.825F, 2.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3752F));

		PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(-4.4812F, -31.0637F, -2.0F));

		PartDefinition cube_r22_r1 = bone10.addOrReplaceChild("cube_r22_r1", CubeListBuilder.create().texOffs(55, 57)
				.mirror().addBox(-0.65F, -0.95F, 4.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 57).mirror().addBox(-0.65F, -0.95F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(55, 57).mirror()
				.addBox(-0.775F, -0.75F, 0.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 57).mirror().addBox(-0.8F, -0.825F, 2.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3752F));

		PartDefinition bone8 = Hair.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.5F, -29.825F, 0.0F, 0.0F, 0.0F, -1.0079F));

		PartDefinition cube_r19_r1 = bone8.addOrReplaceChild("cube_r19_r1",
				CubeListBuilder.create().texOffs(55, 59)
						.addBox(-3.6148F, -1.925F, -3.1449F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(55, 59).addBox(-3.6148F, -1.55F, -1.7699F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(55, 59).addBox(-3.6148F, -1.775F, 0.3051F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(55, 59).addBox(-3.4648F, -1.55F, 2.0551F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4625F));

		PartDefinition cube_r15_r1 = bone8.addOrReplaceChild(
				"cube_r15_r1", CubeListBuilder.create().texOffs(55, 59).addBox(-3.4648F, -1.7F, -2.4949F, 2.0F, 3.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7199F));

		PartDefinition cube_r1 = Hair.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 60)
						.addBox(0.775F, -0.59F, -1.3038F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -0.94F, -0.5538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.75F, -1.94F, 3.6962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.75F, -2.94F, 3.9462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -2.84F, 4.1962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -2.94F, 4.6962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(2.75F, -2.94F, 2.5962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 62)
						.addBox(0.75F, -3.94F, 5.1962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-3.25F, -4.59F, 1.4462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-2.25F, -4.59F, 2.4462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-1.25F, -4.59F, 1.4462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-0.25F, -4.59F, 1.4462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-3.25F, -3.84F, 1.4462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-3.25F, -3.84F, -0.5538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-2.25F, -3.84F, 1.4462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-2.25F, -3.84F, -0.5538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -3.84F, 2.4462F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -3.84F, -1.5538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(0.75F, -3.84F, 1.4462F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(0.75F, -3.84F, -1.5538F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(2.75F, -3.84F, 0.4462F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(3.75F, -3.84F, 0.4462F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(2.75F, -4.84F, -0.5538F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(1.75F, -4.84F, 0.4462F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(3.75F, -4.84F, -0.5538F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(2.75F, -2.84F, 0.4462F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(2.75F, -2.84F, -2.5538F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-3.25F, -2.84F, 1.4462F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(0.75F, -2.94F, -0.5538F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(2.75F, -1.94F, -0.5538F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(0.75F, -1.94F, -0.5538F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 62)
						.addBox(-1.25F, -1.94F, 2.4462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -1.94F, -0.5538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.75F, -0.94F, 2.8462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-1.25F, -0.94F, 1.4462F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.75F, -0.94F, 1.4462F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.75F, -0.94F, -0.5538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(2.75F, -0.94F, -0.5538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(-3.25F, -1.94F, -0.5538F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 60)
						.addBox(-3.25F, -0.44F, -1.1538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-1.2F, -0.69F, -1.3038F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -30.5F, 4.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r6_r1 = cube_r1.addOrReplaceChild("cube_r6_r1",
				CubeListBuilder.create().texOffs(55, 58)
						.addBox(-2.525F, -39.19F, 3.5962F, 2.3F, 3.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
						.addBox(-2.525F, -37.965F, 4.8962F, 2.3F, 3.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 56)
						.addBox(-2.775F, -35.615F, 2.8962F, 2.3F, 3.1F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 31.5F, -4.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r3_r1 = cube_r1.addOrReplaceChild("cube_r3_r1",
				CubeListBuilder.create().texOffs(49, 55).addBox(-1.15F, -1.55F, -2.5F, 2.3F, 3.1F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4474F, -2.565F, 0.1333F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r3_r2 = cube_r1.addOrReplaceChild("cube_r3_r2",
				CubeListBuilder.create().texOffs(48, 54)
						.addBox(-3.15F, -37.34F, 1.4462F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 54)
						.addBox(-4.15F, -37.34F, 1.4462F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 31.5F, -4.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r6_r2 = cube_r1.addOrReplaceChild("cube_r6_r2",
				CubeListBuilder.create().texOffs(50, 58)
						.addBox(3.0F, -0.75F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(1.0F, -0.65F, -1.75F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(-3.0F, -0.75F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(-1.0F, -0.65F, -1.775F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.225F, 1.385F, -2.6788F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(58, 62).addBox(-0.25F, -1.4043F, -0.2417F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -36.5F, 4.0F, 1.1345F, 0.3054F, 0.5236F));

		PartDefinition cube_r3 = Hair.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(58, 62).addBox(2.5F, -5.015F, 3.4962F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -30.5F, 4.0F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 62).addBox(2.75F, -2.415F, 3.0462F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -30.5F, 4.0F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Hair.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 60).addBox(-1.25F, -2.19F, 3.1962F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -30.5F, 4.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Hair.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 60).addBox(3.575F, -0.625F, -0.275F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, -0.0873F, -0.0436F));

		PartDefinition cube_r7 = Hair.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(54, 60)
						.addBox(1.375F, -3.675F, 1.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(1.625F, -3.225F, 0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r8 = Hair.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(54, 60)
						.addBox(-0.325F, -0.1F, 1.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(1.475F, -0.5F, 1.625F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-2.55F, 0.75F, 2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-0.725F, 0.625F, 2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-2.325F, 0.2F, 1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, -0.0873F, 0.3054F));

		PartDefinition cube_r9 = Hair.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(56, 60)
						.addBox(4.15F, 0.6F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
						.addBox(4.15F, 1.6F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(2.15F, 1.75F, 2.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(2.15F, 2.75F, 3.95F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.475F, 2.75F, 2.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(3.9F, 4.825F, 0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(3.9F, 1.2F, 0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.825F, 3.1F, 1.075F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-2.8F, 4.975F, -0.625F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(4.1F, 4.975F, -0.625F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-2.775F, 3.025F, -0.025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-3.075F, 3.025F, -0.725F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.925F, 3.025F, -0.025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(4.125F, 3.025F, -0.725F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-2.8F, 1.025F, -0.825F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(4.1F, 1.025F, -0.825F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.475F, 0.75F, -0.05F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(2.15F, 3.75F, 3.95F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(2.15F, 0.75F, 0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-2.55F, 0.75F, 0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 61)
						.addBox(-0.425F, -0.275F, 0.025F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r13_r1 = cube_r9.addOrReplaceChild("cube_r13_r1",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(-5.3F, -28.975F, -4.225F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(-5.3F, -30.975F, -4.425F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 32.0F, 4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r12_r1 = cube_r9.addOrReplaceChild("cube_r12_r1",
				CubeListBuilder.create().texOffs(54, 59).addBox(-5.4F, -26.975F, -4.625F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 32.0F, 4.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r13_r2 = cube_r9.addOrReplaceChild("cube_r13_r2",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(3.125F, -31.675F, -4.35F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.175F, -26.125F, -3.975F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 32.0F, 4.0F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r12_r2 = cube_r9.addOrReplaceChild("cube_r12_r2",
				CubeListBuilder.create().texOffs(52, 58)
						.addBox(2.9F, -30.925F, -2.325F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(3.175F, -26.175F, -1.325F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(2.9F, -27.225F, -0.775F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(2.9F, -29.25F, -0.775F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 32.0F, 4.0F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r11 = Hair.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(56, 61)
						.addBox(-0.75F, 2.575F, 4.725F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-0.75F, 4.4F, 3.725F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 59)
						.addBox(-0.75F, 3.4F, 3.725F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(-2.75F, 2.4F, 4.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 61)
						.addBox(-3.025F, 2.175F, 4.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, -0.0873F, 0.3491F));

		PartDefinition cube_r12 = Hair.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(50, 58)
						.addBox(-2.225F, 2.925F, 2.875F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 61)
						.addBox(-2.225F, 1.925F, 2.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 61)
						.addBox(-1.225F, 1.625F, 2.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 60)
						.addBox(0.025F, 1.625F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, -0.0873F, 0.1309F));

		PartDefinition cube_r13 = Hair.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(54, 60).addBox(-1.225F, 1.875F, 2.875F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, 0.3491F, 0.1309F));

		PartDefinition cube_r14 = Hair.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(56, 60)
						.addBox(-2.8F, -0.45F, -0.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-2.9F, 0.475F, -1.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-2.175F, -0.325F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -31.0F, -4.0F, 1.3526F, 0.0873F, 0.0436F));

		PartDefinition bone3 = Hair.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(1.0F, -30.5F, 3.925F));

		PartDefinition bone = bone3.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.5F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(60, 62)
						.addBox(-0.425F, -0.19F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(-1.375F, -0.59F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(-1.125F, -0.59F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(60, 62)
						.addBox(-0.05F, -0.79F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(-0.425F, -0.19F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(-1.125F, -0.19F, 1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone4 = Hair.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(-0.75F, -30.5F, 4.0F));

		PartDefinition cube_r19 = bone4.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(60, 62)
						.addBox(3.65F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(2.75F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone5 = Hair.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(-6.65F, -29.675F, 3.675F));

		PartDefinition cube_r20 = bone5.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(58, 61)
						.addBox(3.65F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(2.75F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(2.0F, -1.065F, 0.4462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone6 = Hair.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-6.65F, -31.0F, 3.175F));

		PartDefinition cube_r21 = bone6.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(60, 62)
						.addBox(3.65F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(2.75F, -1.065F, 2.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bangs = Hair.addOrReplaceChild("bangs", CubeListBuilder.create(),
				PartPose.offset(0.0F, -24.25F, 0.0F));

		PartDefinition hairsmall_R2 = bangs.addOrReplaceChild("hairsmall_R2", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -8.0F, -3.0F));

		PartDefinition cube_r10 = hairsmall_R2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(56, 59).addBox(-0.75F, 0.2F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3843F, 0.0829F, 0.202F));

		PartDefinition hairtiny_r2 = hairsmall_R2.addOrReplaceChild("hairtiny_r2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hairsmall_R1 = bangs.addOrReplaceChild("hairsmall_R1", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -8.0F, -3.0F));

		PartDefinition hairtiny_r1 = hairsmall_R1.addOrReplaceChild("hairtiny_r1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hairtiny_r1.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(56, 59).addBox(-0.75F, -1.75F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3655F, 0.147F, 2.7761F));

		PartDefinition hairsmall_L2 = bangs.addOrReplaceChild("hairsmall_L2", CubeListBuilder.create(),
				PartPose.offset(3.0F, -8.0F, -3.0F));

		PartDefinition hairtiny_l2 = hairsmall_L2.addOrReplaceChild("hairtiny_l2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hairtiny_l2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(56, 59).mirror()
						.addBox(-1.25F, 0.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition hairsmall_L1 = bangs.addOrReplaceChild("hairsmall_L1", CubeListBuilder.create(),
				PartPose.offset(0.75F, -8.0F, -3.0F));

		PartDefinition cube_r22 = hairsmall_L1.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(56, 59).mirror()
						.addBox(-1.75F, -1.8F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3843F, -0.0829F, -2.9396F));

		PartDefinition hairtiny_l1 = hairsmall_L1.addOrReplaceChild("hairtiny_l1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

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