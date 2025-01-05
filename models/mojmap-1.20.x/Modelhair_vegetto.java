// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_vegetto<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_vegetto"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_vegetto(ModelPart root) {
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
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Main3 = Hair.addOrReplaceChild("Main3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.028F, 0.0F));

		PartDefinition Left2 = Main3.addOrReplaceChild("Left2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.004F, 0.0F));

		PartDefinition bunch90 = Left2.addOrReplaceChild("bunch90", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.003F, -5.7557F, -4.004F, 0.3124F, 0.2079F, 0.0666F));

		PartDefinition bunch_r1 = bunch90.addOrReplaceChild("bunch_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.0297F, -2.4679F, -1.1965F, 1.8018F, 2.375F,
						1.8018F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.7127F, -0.0546F, 0.5036F));

		PartDefinition bunch_r2 = bunch90.addOrReplaceChild("bunch_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.6802F, -0.7769F, -1.2595F, 1.8018F, 1.7F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.4905F, -0.0713F, 0.1031F));

		PartDefinition bunch_r3 = bunch90.addOrReplaceChild("bunch_r3",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.5983F, -0.3999F, -1.5815F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4931F, -2.7075F, 1.5815F, 0.0F, 0.0F, -0.0654F));

		PartDefinition bunch89 = Left2.addOrReplaceChild("bunch89",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.8018F, -0.87F, -0.9009F, 1.8018F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -6.006F, -3.003F, 0.0656F, 0.1238F, 0.4783F));

		PartDefinition bunch8_r1 = bunch89.addOrReplaceChild("bunch8_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.2973F, -1.81F, -0.8108F, 2.2973F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8018F, 1.03F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition bunch88 = Left2.addOrReplaceChild("bunch88",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, -2.002F, -0.214F, 0.1766F, 0.7609F));

		PartDefinition bunch9_r1 = bunch88.addOrReplaceChild("bunch9_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.973F, -1.81F, -0.8108F, 2.973F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bunch87 = Left2.addOrReplaceChild("bunch87",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 0.0F, -0.2538F, 0.093F, 0.7869F));

		PartDefinition bunch10_r1 = bunch87.addOrReplaceChild("bunch10_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.4224F, -1.81F, -0.8108F, 2.4224F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bunch86 = Left2.addOrReplaceChild("bunch86", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.003F, -7.007F, -2.002F, 0.0476F, -0.0069F, -0.2166F));

		PartDefinition bunch11_r1 = bunch86.addOrReplaceChild("bunch11_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.5005F, -1.3F, -0.8008F, 1.6016F, 2.6F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2748F, -3.4337F, 0.4218F, -0.3798F, 0.1024F, 0.5563F));

		PartDefinition bunch11_r2 = bunch86.addOrReplaceChild("bunch11_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -0.3408F, -1.2119F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9259F, -2.3282F, 0.2109F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bunch85 = Left2.addOrReplaceChild("bunch85",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -8.008F, -1.001F, -0.0932F, 0.0143F, 0.0844F));

		PartDefinition bunch15_r1 = bunch85.addOrReplaceChild("bunch15_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.825F, 0.2002F, 1.6016F, 2.825F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch84 = Left2.addOrReplaceChild("bunch84",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 0.0F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition bunch17_r1 = bunch84.addOrReplaceChild("bunch17_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -6.4F, -0.4254F, 1.6016F, 2.4F, 2.2272F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.023F, -2.7403F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bunch17_r2 = bunch84.addOrReplaceChild("bunch17_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.625F, -0.5756F, 1.6016F, 1.625F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch83 = Left2.addOrReplaceChild("bunch83",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 2.002F, 0.1682F, 0.1136F, 0.7004F));

		PartDefinition bunch18_r1 = bunch83.addOrReplaceChild("bunch18_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.6476F, -1.81F, -0.8108F, 2.6476F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bunch82 = Left2.addOrReplaceChild("bunch82",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 1.001F, 0.1409F, 0.399F, 0.5638F));

		PartDefinition bunch19_r1 = bunch82.addOrReplaceChild("bunch19_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-3.1481F, -1.81F, -0.8108F, 3.1481F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition bunch81 = Left2.addOrReplaceChild("bunch81",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.871F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -5.005F, 0.0F, 0.1706F, 0.1996F, 0.7153F));

		PartDefinition bunch20_r1 = bunch81.addOrReplaceChild("bunch20_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-3.2983F, -1.81F, -0.8108F, 3.2983F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition bunch80 = Left2.addOrReplaceChild("bunch80",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -2.002F, 2.8028F, 0.6531F, -0.1074F, -0.291F));

		PartDefinition bunch31_r1 = bunch80.addOrReplaceChild("bunch31_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bunch79 = Left2.addOrReplaceChild("bunch79",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -0.872F, 0.2002F, 1.8018F, 1.8F, 2.7027F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -4.004F, 2.8028F, 0.5059F, -0.3082F, -0.1665F));

		PartDefinition bunch32_r1 = bunch79.addOrReplaceChild("bunch32_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch78 = Left2.addOrReplaceChild("bunch78",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 0.0F, -0.2931F, -0.0895F, -0.3829F));

		PartDefinition bunch38_r1 = bunch78.addOrReplaceChild("bunch38_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.225F, 0.2002F, 1.6016F, 2.225F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch77 = Left2.addOrReplaceChild("bunch77",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 3.003F, 0.3765F, 0.5351F, 0.6915F));

		PartDefinition bunch39_r1 = bunch77.addOrReplaceChild("bunch39_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.2973F, -1.81F, -0.8108F, 2.2973F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bunch76 = Left2.addOrReplaceChild("bunch76",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.8028F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 3.003F, 0.668F, 0.4042F, 0.945F));

		PartDefinition bunch40_r1 = bunch76.addOrReplaceChild("bunch40_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-2.4474F, -1.81F, -0.8108F, 2.4474F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bunch75 = Left2.addOrReplaceChild("bunch75",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 2.002F, -0.3696F, 0.2475F, -0.2181F));

		PartDefinition bunch41_r1 = bunch75.addOrReplaceChild("bunch41_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.3895F, -0.7455F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch41_r2 = bunch75.addOrReplaceChild("bunch41_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch74 = Left2.addOrReplaceChild("bunch74",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.974F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -2.002F, 3.003F, -0.7352F, 0.0454F, 0.0199F));

		PartDefinition bunch46_r1 = bunch74.addOrReplaceChild("bunch46_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.0527F, 0.2306F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.974F, -1.001F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bunch73 = Left2.addOrReplaceChild("bunch73",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.97F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -6.006F, 3.003F, -0.7259F, -0.1394F, -0.1081F));

		PartDefinition bunch48_r1 = bunch73.addOrReplaceChild("bunch48_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.025F, 0.2002F, 1.6016F, 2.025F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Right2 = Main3.addOrReplaceChild("Right2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.004F, 0.0F));

		PartDefinition bunch72 = Right2.addOrReplaceChild("bunch72",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -1.97F, -1.001F, 2.002F, 2.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -6.006F, -3.003F, 0.5221F, -0.0227F, 0.1289F));

		PartDefinition bunch2_r1 = bunch72.addOrReplaceChild("bunch2_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -3.55F, 0.1001F, 1.8018F, 3.55F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, -1.001F, -0.48F, 0.0F, 0.0F));

		PartDefinition bunch71 = Right2.addOrReplaceChild("bunch71",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -1.97F, 0.0F, 2.002F, 2.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -6.006F, -4.004F, 0.5208F, -0.0516F, 0.1199F));

		PartDefinition bunch6_r1 = bunch71.addOrReplaceChild("bunch6_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -2.45F, 0.1001F, 1.8018F, 2.45F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5699F, 0.6699F, -0.7418F, 0.0F, 0.0F));

		PartDefinition bunch6_r2 = bunch71.addOrReplaceChild("bunch6_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -1.7F, 0.1001F, 1.8018F, 1.7F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch70 = Right2.addOrReplaceChild("bunch70",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.569F, 0.0F, 1.6016F, 1.6F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, -4.004F, 0.217F, -0.2357F, 0.1709F));

		PartDefinition bunch7_r1 = bunch70.addOrReplaceChild("bunch7_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.7207F, -2.44F, 0.1001F, 1.4414F, 2.44F, 1.4414F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.569F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bunch69 = Right2.addOrReplaceChild("bunch69",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.225F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, -3.003F, -0.0428F, 0.0189F, 0.0852F));

		PartDefinition bunch12_r1 = bunch69.addOrReplaceChild("bunch12_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.875F, 0.2002F, 1.6016F, 2.875F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch68 = Right2.addOrReplaceChild("bunch68",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, -3.003F, -0.2181F, -0.0073F, 0.0467F));

		PartDefinition bunch13_r1 = bunch68.addOrReplaceChild("bunch13_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -3.175F, 0.2002F, 1.6016F, 3.175F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch67 = Right2.addOrReplaceChild("bunch67",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -1.968F, -1.001F, 2.002F, 2.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -8.008F, -2.002F, -0.1899F, -0.2141F, 0.0853F));

		PartDefinition bunch14_r1 = bunch67.addOrReplaceChild("bunch14_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.8F, 0.2002F, 1.6016F, 2.8F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch66 = Right2.addOrReplaceChild("bunch66",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.008F, -1.001F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bunch16_r1 = bunch66.addOrReplaceChild("bunch16_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.85F, 0.2002F, 1.6016F, 2.85F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2088F, -0.0701F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bunch16_r2 = bunch66.addOrReplaceChild("bunch16_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch65 = Right2.addOrReplaceChild("bunch65",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, -1.001F, -0.1233F, -0.1211F, 0.0658F));

		PartDefinition bunch21_r1 = bunch65.addOrReplaceChild("bunch21_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.575F, 0.2002F, 1.6016F, 2.575F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2098F, -0.0701F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bunch21_r2 = bunch65.addOrReplaceChild("bunch21_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch64 = Right2.addOrReplaceChild("bunch64",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, -2.002F, -0.214F, -0.1766F, -0.7609F));

		PartDefinition bunch22_r1 = bunch64.addOrReplaceChild("bunch22_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 3.4735F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bunch63 = Right2.addOrReplaceChild("bunch63",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 0.0F, -0.2132F, 0.0015F, -0.7626F));

		PartDefinition bunch23_r1 = bunch63.addOrReplaceChild("bunch23_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.8979F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition bunch62 = Right2.addOrReplaceChild("bunch62",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.871F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -5.005F, 0.0F, 0.1706F, -0.1996F, -0.7153F));

		PartDefinition bunch24_r1 = bunch62.addOrReplaceChild("bunch24_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 3.2232F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch61 = Right2.addOrReplaceChild("bunch61",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 2.002F, 0.169F, -0.117F, -0.7008F));

		PartDefinition bunch25_r1 = bunch61.addOrReplaceChild("bunch25_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.3974F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bunch60 = Right2.addOrReplaceChild("bunch60",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 1.001F, 0.1437F, -0.4422F, -0.5705F));

		PartDefinition bunch26_r1 = bunch60.addOrReplaceChild("bunch26_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.3974F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch59 = Right2.addOrReplaceChild("bunch59",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.87F, -0.9009F, 1.8018F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -6.006F, -3.003F, 0.0572F, -0.2136F, -0.4396F));

		PartDefinition bunch27_r1 = bunch59.addOrReplaceChild("bunch27_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.5225F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8018F, 1.03F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch58 = Right2.addOrReplaceChild("bunch58",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -2.002F, 2.8028F, 0.726F, 0.1383F, 0.3711F));

		PartDefinition bunch28_r1 = bunch58.addOrReplaceChild("bunch28_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch57 = Right2.addOrReplaceChild("bunch57",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -0.872F, 0.2002F, 1.8018F, 1.8F, 2.7027F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -4.004F, 2.8028F, 0.4507F, 0.2316F, 0.1231F));

		PartDefinition bunch29_r1 = bunch57.addOrReplaceChild("bunch29_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bunch56 = Right2.addOrReplaceChild("bunch56",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.9009F, -0.874F, 0.2002F, 1.8018F, 1.8F, 2.7027F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -2.002F, 2.8028F, 0.6074F, 0.0603F, -0.1163F));

		PartDefinition bunch30_r1 = bunch56.addOrReplaceChild("bunch30_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8108F, 0.19F, 0.0F, 1.6216F, 1.62F, 1.4314F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch55 = Right2.addOrReplaceChild("bunch55",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, 1.001F, -0.3054F, -0.0073F, 0.0467F));

		PartDefinition bunch33_r1 = bunch55.addOrReplaceChild("bunch33_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.7007F, -5.4F, 0.3003F, 1.4014F, 1.4F, 1.4014F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6064F, -1.9442F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch33_r2 = bunch55.addOrReplaceChild("bunch33_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch54 = Right2.addOrReplaceChild("bunch54",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.968F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 1.001F, -0.4344F, -0.0299F, -0.0379F));

		PartDefinition bunch34_r1 = bunch54.addOrReplaceChild("bunch34_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch53 = Right2.addOrReplaceChild("bunch53",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 0.0F, -0.2521F, 0.0696F, 0.2499F));

		PartDefinition bunch35_r1 = bunch53.addOrReplaceChild("bunch35_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -4.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6754F, -1.9529F, -0.48F, 0.0F, 0.0F));

		PartDefinition bunch35_r2 = bunch53.addOrReplaceChild("bunch35_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch52 = Right2.addOrReplaceChild("bunch52",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, 2.002F, -0.3828F, -0.09F, -0.1555F));

		PartDefinition bunch36_r1 = bunch52.addOrReplaceChild("bunch36_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -6.65F, 0.2002F, 1.6016F, 2.65F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.694F, -2.2777F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch36_r2 = bunch52.addOrReplaceChild("bunch36_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch51 = Right2.addOrReplaceChild("bunch51",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -7.007F, 2.002F, -0.478F, 0.0406F, 0.034F));

		PartDefinition bunch37_r1 = bunch51.addOrReplaceChild("bunch37_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.5F, 0.2002F, 1.6016F, 2.5F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2172F, -0.0655F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bunch37_r2 = bunch51.addOrReplaceChild("bunch37_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.4F, 0.2002F, 1.6016F, 2.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch50 = Right2.addOrReplaceChild("bunch50",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.874F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 3.003F, 0.2691F, -0.4828F, -0.829F));

		PartDefinition bunch42_r1 = bunch50.addOrReplaceChild("bunch42_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.0721F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bunch49 = Right2.addOrReplaceChild("bunch49",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -0.872F, -0.9009F, 2.8028F, 1.8F, 1.8018F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 3.003F, 0.6938F, -0.472F, -1.0056F));

		PartDefinition bunch43_r1 = bunch49.addOrReplaceChild("bunch43_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(0.0F, -1.81F, -0.8108F, 2.2472F, 1.62F, 1.6216F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bunch5 = Right2.addOrReplaceChild("bunch5",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.969F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 2.002F, -0.3696F, -0.2475F, 0.2181F));

		PartDefinition bunch44_r1 = bunch5.addOrReplaceChild("bunch44_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -4.075F, 0.2002F, 1.6016F, 2.075F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5418F, -1.5116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch44_r2 = bunch5.addOrReplaceChild("bunch44_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch4 = Right2.addOrReplaceChild("bunch4",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.971F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.005F, 3.003F, -0.7367F, -0.0066F, -0.0545F));

		PartDefinition bunch45_r1 = bunch4.addOrReplaceChild("bunch45_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.7507F, -5.2F, 0.2503F, 1.5015F, 2.2F, 1.5015F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5472F, -1.7734F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch45_r2 = bunch4.addOrReplaceChild("bunch45_r2",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -1.4F, 0.2002F, 1.6016F, 1.4F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.971F, -1.001F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bunch3 = Right2.addOrReplaceChild("bunch3",
				CubeListBuilder.create().texOffs(117, 122).addBox(-1.001F, -2.97F, -1.001F, 2.002F, 3.0F, 2.002F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -6.006F, 3.003F, -0.7331F, 0.0813F, 0.0427F));

		PartDefinition bunch47_r1 = bunch3.addOrReplaceChild("bunch47_r1",
				CubeListBuilder.create().texOffs(117, 122).addBox(-0.8008F, -2.375F, 0.2002F, 1.6016F, 2.375F, 1.6016F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bangs2 = Hair.addOrReplaceChild("Bangs2", CubeListBuilder.create(),
				PartPose.offset(2.002F, -7.031F, -3.003F));

		PartDefinition BangSection4 = Bangs2.addOrReplaceChild("BangSection4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.004F, 0.0F, -1.001F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang7 = BangSection4.addOrReplaceChild("Bang7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom8 = Bang7
				.addOrReplaceChild(
						"Bottom8", CubeListBuilder.create().texOffs(117, 123).addBox(-2.9029F, -31.9F, -6.1561F,
								1.8018F, 1.8F, 3.1031F, new CubeDeformation(0.0F)),
						PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition Top8 = Bang7.addOrReplaceChild("Top8", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r1 = Top8.addOrReplaceChild("Top_r1",
				CubeListBuilder.create().texOffs(116, 122).addBox(-0.8108F, 0.04F, -3.2252F, 1.6216F, 1.62F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.032F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bang6 = BangSection4.addOrReplaceChild("Bang6", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom7 = Bang6.addOrReplaceChild("Bottom7", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition Top7 = Bang6.addOrReplaceChild("Top7", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition BangSection3 = Bangs2.addOrReplaceChild("BangSection3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bang5 = BangSection3.addOrReplaceChild("Bang5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom6 = Bang5
				.addOrReplaceChild(
						"Bottom6", CubeListBuilder.create().texOffs(117, 123).addBox(0.7417F, -32.4716F, -7.7046F,
								1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top6 = Bang5.addOrReplaceChild("Top6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition bunch4_r1 = Top6.addOrReplaceChild("bunch4_r1",
				CubeListBuilder.create().texOffs(116, 122).addBox(0.8218F, -1.0431F, -3.6211F, 1.4414F, 1.44F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3184F, -0.025F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Bang4 = BangSection3.addOrReplaceChild("Bang4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom5 = Bang4.addOrReplaceChild("Bottom5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top5 = Bang4.addOrReplaceChild("Top5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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