// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_zbroly_ssj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_zbroly_ssj"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_zbroly_ssj(ModelPart root) {
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
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = Hair.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bangs = bone.addOrReplaceChild("Bangs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BangSection2 = Bangs.addOrReplaceChild("BangSection2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang2 = BangSection2.addOrReplaceChild("Bang2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom = Bang2.addOrReplaceChild("Bottom", CubeListBuilder.create(),
				PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch5_r1 = Bottom.addOrReplaceChild("bunch5_r1",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));

		PartDefinition bunch4_r1 = Bottom.addOrReplaceChild("bunch4_r1",
				CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));

		PartDefinition Top = Bang2.addOrReplaceChild("Top", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r1 = Top.addOrReplaceChild("Top_r1",
				CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));

		PartDefinition Top_r2 = Top.addOrReplaceChild("Top_r2",
				CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));

		PartDefinition Bang1 = BangSection2.addOrReplaceChild("Bang1", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom2 = Bang1.addOrReplaceChild("Bottom2", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch5_r2 = Bottom2.addOrReplaceChild("bunch5_r2",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));

		PartDefinition bunch5_r3 = Bottom2.addOrReplaceChild("bunch5_r3", CubeListBuilder.create().texOffs(51, 58)
				.addBox(0.2545F, -0.6074F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).texOffs(51, 58)
				.addBox(0.7545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));

		PartDefinition Top2 = Bang1.addOrReplaceChild("Top2", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition BangSection = Bangs.addOrReplaceChild("BangSection", CubeListBuilder.create(),
				PartPose.offset(2.002F, -31.031F, -3.003F));

		PartDefinition Bang = BangSection.addOrReplaceChild("Bang", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom3 = Bang.addOrReplaceChild("Bottom3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top3 = Bang.addOrReplaceChild("Top3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition Bang3 = BangSection.addOrReplaceChild("Bang3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom4 = Bang3.addOrReplaceChild("Bottom4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top4 = Bang3.addOrReplaceChild("Top4", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition Bangs5 = bone.addOrReplaceChild("Bangs5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition BangSection9 = Bangs5.addOrReplaceChild("BangSection9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.002F, -31.031F, -4.004F, 0.8228F, -0.609F, -0.2567F));

		PartDefinition Bang16 = BangSection9.addOrReplaceChild("Bang16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom17 = Bang16.addOrReplaceChild("Bottom17", CubeListBuilder.create(),
				PartPose.offset(-2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch6_r1 = Bottom17.addOrReplaceChild("bunch6_r1",
				CubeListBuilder.create().texOffs(56, 60).mirror()
						.addBox(-0.5726F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.8068F, -30.1974F, 0.3136F, 2.5868F, 0.7856F, -2.0333F));

		PartDefinition bunch5_r4 = Bottom17.addOrReplaceChild("bunch5_r4",
				CubeListBuilder.create().texOffs(56, 60).mirror()
						.addBox(0.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6614F, -31.0456F, -1.1421F, -2.3422F, -0.4864F, 0.7071F));

		PartDefinition Top17 = Bang16.addOrReplaceChild("Top17", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r3 = Top17.addOrReplaceChild("Top_r3",
				CubeListBuilder.create().texOffs(52, 60).mirror()
						.addBox(-0.6043F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1952F, 1.8346F, 6.1194F, -2.9808F, 0.7856F, -2.0333F));

		PartDefinition Top_r4 = Top17.addOrReplaceChild("Top_r4",
				CubeListBuilder.create().texOffs(52, 60).mirror()
						.addBox(0.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6594F, 0.8864F, 4.6637F, -1.6266F, -0.4864F, 0.7071F));

		PartDefinition Bang17 = BangSection9.addOrReplaceChild("Bang17", CubeListBuilder.create(),
				PartPose.offset(1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom18 = Bang17.addOrReplaceChild("Bottom18", CubeListBuilder.create(),
				PartPose.offset(0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch6_r2 = Bottom18.addOrReplaceChild("bunch6_r2",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.0282F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-5.0934F, 1.3321F, 6.4826F, -2.8058F, 0.7973F, -1.9545F));

		PartDefinition bunch5_r5 = Bottom18.addOrReplaceChild("bunch5_r5",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-2.0563F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.4025F, 0.8696F, 4.1343F, -1.4268F, -0.4483F, 0.686F));

		PartDefinition bunch4_r2 = Bottom18.addOrReplaceChild("bunch4_r2",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1001F, 1.2323F, 0.4004F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition Top18 = Bang17.addOrReplaceChild("Top18", CubeListBuilder.create(),
				PartPose.offset(0.1001F, -1.2012F, -2.002F));

		PartDefinition BangSection10 = Bangs5.addOrReplaceChild("BangSection10", CubeListBuilder.create(),
				PartPose.offset(-2.002F, -31.031F, -3.003F));

		PartDefinition Bang18 = BangSection10.addOrReplaceChild("Bang18", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.002F, 0.0F, -1.001F, 0.7089F, 0.745F, 0.1584F));

		PartDefinition Bottom19 = Bang18.addOrReplaceChild("Bottom19", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top19 = Bang18.addOrReplaceChild("Top19", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition bunch5_r6 = Top19.addOrReplaceChild("bunch5_r6",
				CubeListBuilder.create().texOffs(57, 60).mirror()
						.addBox(-0.4089F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.5963F, 0.7266F, 0.5984F, 0.4978F, -0.6959F, 0.3871F));

		PartDefinition Bang19 = BangSection10.addOrReplaceChild("Bang19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.6109F, 0.0F));

		PartDefinition Bottom20 = Bang19.addOrReplaceChild("Bottom20", CubeListBuilder.create().texOffs(55, 58).mirror()
				.addBox(-1.0302F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top20 = Bang19.addOrReplaceChild("Top20", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition bunch6_r3 = Top20.addOrReplaceChild("bunch6_r3",
				CubeListBuilder.create().texOffs(56, 60).mirror()
						.addBox(-0.9502F, -0.0085F, -1.4957F, 1.4414F, 1.44F, 2.1622F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Bangs6 = bone.addOrReplaceChild("Bangs6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 1.0F));

		PartDefinition BangSection11 = Bangs6.addOrReplaceChild("BangSection11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang20 = BangSection11.addOrReplaceChild("Bang20", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom21 = Bang20.addOrReplaceChild("Bottom21", CubeListBuilder.create(),
				PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch7_r1 = Bottom21.addOrReplaceChild("bunch7_r1",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));

		PartDefinition bunch6_r4 = Bottom21.addOrReplaceChild("bunch6_r4",
				CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));

		PartDefinition Top21 = Bang20.addOrReplaceChild("Top21", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r5 = Top21.addOrReplaceChild("Top_r5",
				CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));

		PartDefinition Top_r6 = Top21.addOrReplaceChild("Top_r6",
				CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));

		PartDefinition Bang21 = BangSection11.addOrReplaceChild("Bang21", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom22 = Bang21.addOrReplaceChild("Bottom22", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch7_r2 = Bottom22.addOrReplaceChild("bunch7_r2",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));

		PartDefinition bunch6_r5 = Bottom22.addOrReplaceChild("bunch6_r5",
				CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));

		PartDefinition bunch5_r7 = Bottom22.addOrReplaceChild("bunch5_r7",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition Top22 = Bang21.addOrReplaceChild("Top22", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition BangSection12 = Bangs6.addOrReplaceChild("BangSection12", CubeListBuilder.create(),
				PartPose.offset(2.002F, -31.031F, -3.003F));

		PartDefinition Bang22 = BangSection12.addOrReplaceChild("Bang22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom23 = Bang22.addOrReplaceChild("Bottom23", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top23 = Bang22.addOrReplaceChild("Top23", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition Bang23 = BangSection12.addOrReplaceChild("Bang23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom24 = Bang23.addOrReplaceChild("Bottom24", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top24 = Bang23.addOrReplaceChild("Top24", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition Bangs4 = bone.addOrReplaceChild("Bangs4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BangSection7 = Bangs4.addOrReplaceChild("BangSection7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang12 = BangSection7.addOrReplaceChild("Bang12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom13 = Bang12.addOrReplaceChild("Bottom13", CubeListBuilder.create(),
				PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch6_r6 = Bottom13.addOrReplaceChild("bunch6_r6",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));

		PartDefinition bunch5_r8 = Bottom13.addOrReplaceChild("bunch5_r8",
				CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));

		PartDefinition Top13 = Bang12.addOrReplaceChild("Top13", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r7 = Top13.addOrReplaceChild("Top_r7",
				CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));

		PartDefinition Top_r8 = Top13.addOrReplaceChild("Top_r8",
				CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));

		PartDefinition Bang13 = BangSection7.addOrReplaceChild("Bang13", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom14 = Bang13.addOrReplaceChild("Bottom14", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch6_r7 = Bottom14.addOrReplaceChild("bunch6_r7",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));

		PartDefinition bunch5_r9 = Bottom14.addOrReplaceChild("bunch5_r9",
				CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));

		PartDefinition Top14 = Bang13.addOrReplaceChild("Top14", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch5_r10 = Top14.addOrReplaceChild("bunch5_r10",
				CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));

		PartDefinition BangSection8 = Bangs4.addOrReplaceChild("BangSection8", CubeListBuilder.create(),
				PartPose.offset(2.002F, -31.031F, -3.003F));

		PartDefinition Bang14 = BangSection8.addOrReplaceChild("Bang14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom15 = Bang14.addOrReplaceChild("Bottom15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top15 = Bang14.addOrReplaceChild("Top15", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition Bang15 = BangSection8.addOrReplaceChild("Bang15", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom16 = Bang15.addOrReplaceChild("Bottom16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top16 = Bang15.addOrReplaceChild("Top16", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition Bangs2 = bone.addOrReplaceChild("Bangs2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 2.0F));

		PartDefinition BangSection3 = Bangs2.addOrReplaceChild("BangSection3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, -31.031F, -4.004F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang4 = BangSection3.addOrReplaceChild("Bang4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom5 = Bang4.addOrReplaceChild("Bottom5", CubeListBuilder.create(),
				PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch6_r8 = Bottom5.addOrReplaceChild("bunch6_r8",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.4274F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8068F, -30.1974F, 0.3136F, 2.5868F, -0.7856F, 2.0333F));

		PartDefinition bunch5_r11 = Bottom5.addOrReplaceChild("bunch5_r11",
				CubeListBuilder.create().texOffs(56, 60).addBox(-1.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6614F, -31.0456F, -1.1421F, -2.3422F, 0.4864F, -0.7071F));

		PartDefinition bunch4_r3 = Bottom5.addOrReplaceChild("bunch4_r3",
				CubeListBuilder.create().texOffs(56, 60).addBox(1.2235F, -1.6532F, 0.708F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -30.8336F, -5.7678F, -0.4171F, -0.3189F, 0.0649F));

		PartDefinition Top5 = Bang4.addOrReplaceChild("Top5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r9 = Top5.addOrReplaceChild("Top_r9",
				CubeListBuilder.create().texOffs(52, 60).addBox(-0.3957F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1952F, 1.8346F, 6.1194F, -2.9808F, -0.7856F, 2.0333F));

		PartDefinition Top_r10 = Top5.addOrReplaceChild("Top_r10",
				CubeListBuilder.create().texOffs(52, 60).addBox(-1.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6594F, 0.8864F, 4.6637F, -1.6266F, 0.4864F, -0.7071F));

		PartDefinition Top_r11 = Top5.addOrReplaceChild("Top_r11",
				CubeListBuilder.create().texOffs(52, 60).addBox(0.2327F, -0.38F, -0.165F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9214F, 1.348F, 0.302F, 0.5429F, -0.3189F, 0.0649F));

		PartDefinition Bang5 = BangSection3.addOrReplaceChild("Bang5", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom6 = Bang5.addOrReplaceChild("Bottom6", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch6_r9 = Bottom6.addOrReplaceChild("bunch6_r9",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.7736F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0934F, 1.3321F, 6.4826F, -2.8058F, -0.7973F, 1.9545F));

		PartDefinition bunch5_r12 = Bottom6.addOrReplaceChild("bunch5_r12",
				CubeListBuilder.create().texOffs(51, 58).addBox(0.2545F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4025F, 0.8696F, 4.1343F, -1.4268F, 0.4483F, -0.686F));

		PartDefinition bunch4_r4 = Bottom6.addOrReplaceChild("bunch4_r4",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition Top6 = Bang5.addOrReplaceChild("Top6", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch5_r13 = Top6.addOrReplaceChild("bunch5_r13",
				CubeListBuilder.create().texOffs(54, 59).addBox(0.3952F, -1.4682F, -2.9576F, 1.6216F, 1.62F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0025F, 1.1696F, 4.4343F, -0.5716F, 0.4483F, -0.686F));

		PartDefinition BangSection4 = Bangs2.addOrReplaceChild("BangSection4", CubeListBuilder.create(),
				PartPose.offset(2.002F, -31.031F, -3.003F));

		PartDefinition Bang6 = BangSection4.addOrReplaceChild("Bang6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom7 = Bang6.addOrReplaceChild("Bottom7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition bunch5_r14 = Bottom7.addOrReplaceChild("bunch5_r14",
				CubeListBuilder.create().texOffs(55, 59).addBox(-1.1126F, -1.2629F, -0.3133F, 1.6016F, 1.6F, 2.4024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, -30.955F, -5.7829F, -0.1567F, 0.6959F, -0.3871F));

		PartDefinition Top7 = Bang6.addOrReplaceChild("Top7", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition bunch5_r15 = Top7.addOrReplaceChild("bunch5_r15",
				CubeListBuilder.create().texOffs(57, 60).addBox(-1.0325F, -1.0713F, -1.358F, 1.4414F, 1.44F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5963F, 0.7266F, 0.5984F, 0.4978F, 0.6959F, -0.3871F));

		PartDefinition Bang7 = BangSection4.addOrReplaceChild("Bang7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom8 = Bang7.addOrReplaceChild("Bottom8", CubeListBuilder.create().texOffs(55, 58)
				.addBox(-0.5714F, -1.052F, -1.9696F, 1.6016F, 1.6F, 2.4024F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top8 = Bang7.addOrReplaceChild("Top8", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition Bangs3 = bone.addOrReplaceChild("Bangs3", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition BangSection5 = Bangs3.addOrReplaceChild("BangSection5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.002F, -31.031F, -4.004F, 0.8228F, -0.609F, -0.2567F));

		PartDefinition Bang8 = BangSection5.addOrReplaceChild("Bang8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom9 = Bang8.addOrReplaceChild("Bottom9", CubeListBuilder.create(),
				PartPose.offset(-2.002F, 30.8058F, 3.3533F));

		PartDefinition bunch7_r3 = Bottom9.addOrReplaceChild("bunch7_r3",
				CubeListBuilder.create().texOffs(56, 60).mirror()
						.addBox(-0.5726F, -0.4426F, -0.6215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.8068F, -30.1974F, 0.3136F, 2.5868F, 0.7856F, -2.0333F));

		PartDefinition bunch6_r10 = Bottom9.addOrReplaceChild("bunch6_r10",
				CubeListBuilder.create().texOffs(56, 60).mirror()
						.addBox(0.3413F, -0.8374F, -0.6959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6614F, -31.0456F, -1.1421F, -2.3422F, -0.4864F, 0.7071F));

		PartDefinition Top9 = Bang8.addOrReplaceChild("Top9", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r12 = Top9.addOrReplaceChild("Top_r12",
				CubeListBuilder.create().texOffs(52, 60).mirror()
						.addBox(-0.6043F, -0.6857F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1952F, 1.8346F, 6.1194F, -2.9808F, 0.7856F, -2.0333F));

		PartDefinition Top_r13 = Top9.addOrReplaceChild("Top_r13",
				CubeListBuilder.create().texOffs(52, 60).mirror()
						.addBox(0.3669F, -1.0064F, -1.7195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6594F, 0.8864F, 4.6637F, -1.6266F, -0.4864F, 0.7071F));

		PartDefinition Bang9 = BangSection5.addOrReplaceChild("Bang9", CubeListBuilder.create(),
				PartPose.offset(1.7517F, -0.0883F, -0.3825F));

		PartDefinition bunch7_r4 = Bang9.addOrReplaceChild("bunch7_r4",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.0282F, -1.5467F, -0.5592F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.9933F, 0.1309F, 4.4806F, -2.8058F, 0.7973F, -1.9545F));

		PartDefinition bunch7_r5 = Bang9.addOrReplaceChild("bunch7_r5", CubeListBuilder.create().texOffs(51, 58)
				.mirror().addBox(-2.0563F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(51, 58).mirror()
				.addBox(-2.5563F, -1.2574F, -0.7436F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5026F, -0.3316F, 2.1323F, -1.4268F, -0.4483F, 0.686F));

		PartDefinition Bottom25 = Bang9.addOrReplaceChild("Bottom25", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.8104F, -0.1916F, 0.5081F, 1.789F, 0.0F, 2.9671F));

		PartDefinition Top10 = Bang9.addOrReplaceChild("Top10", CubeListBuilder.create(),
				PartPose.offset(0.1001F, -1.2012F, -2.002F));

		PartDefinition BangSection6 = Bangs3.addOrReplaceChild("BangSection6", CubeListBuilder.create(),
				PartPose.offset(-2.002F, -31.031F, -3.003F));

		PartDefinition Bang10 = BangSection6.addOrReplaceChild("Bang10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.002F, 0.0F, -1.001F, 0.7089F, 0.745F, 0.1584F));

		PartDefinition Bottom11 = Bang10.addOrReplaceChild("Bottom11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top11 = Bang10.addOrReplaceChild("Top11", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition Bang11 = BangSection6.addOrReplaceChild("Bang11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.6109F, 0.0F));

		PartDefinition Bottom12 = Bang11.addOrReplaceChild("Bottom12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top12 = Bang11.addOrReplaceChild("Top12", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition bone2 = Hair.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Back = bone2.addOrReplaceChild("Back", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1167F, -31.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Back.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r2 = Back.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r3 = Back.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r4 = Back.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r5 = Back.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r6 = Back.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r7 = Back.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r8 = Back.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r9 = Back.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r10 = Back.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r11 = Back.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r12 = Back.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r13 = Back.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r14 = Back.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r15 = Back.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r16 = Back.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r17 = Back.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r18 = Back.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r19 = Back.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r20 = Back.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r21 = Back.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r22 = Back.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r23 = Back.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r24 = Back.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r25 = Back.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r26 = Back.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r27 = Back.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r28 = Back.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r29 = Back.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r30 = Back.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r31 = Back.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r32 = Back.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r33 = Back.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r34 = Back.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r35 = Back.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r36 = Back.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r37 = Back.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r38 = Back.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r39 = Back.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back2 = bone2.addOrReplaceChild("Back2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.1167F, -31.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));

		PartDefinition cube_r40 = Back2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r41 = Back2.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r42 = Back2.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r43 = Back2.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r44 = Back2.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r45 = Back2.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r46 = Back2.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r47 = Back2.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r48 = Back2.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r49 = Back2.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r50 = Back2.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r51 = Back2.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r52 = Back2.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r53 = Back2.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r54 = Back2.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r55 = Back2.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r56 = Back2.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r57 = Back2.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r58 = Back2.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r59 = Back2.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r60 = Back2.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r61 = Back2.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r62 = Back2.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r63 = Back2.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r64 = Back2.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r65 = Back2.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r66 = Back2.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r67 = Back2.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r68 = Back2.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r69 = Back2.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r70 = Back2.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r71 = Back2.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r72 = Back2.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r73 = Back2.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r74 = Back2.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r75 = Back2.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r76 = Back2.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r77 = Back2.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r78 = Back2.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back3 = bone2.addOrReplaceChild("Back3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1167F, -31.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));

		PartDefinition cube_r79 = Back3.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r80 = Back3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r81 = Back3.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r82 = Back3.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r83 = Back3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r84 = Back3.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r85 = Back3.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));

		PartDefinition cube_r86 = Back3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));

		PartDefinition cube_r87 = Back3.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));

		PartDefinition cube_r88 = Back3.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));

		PartDefinition cube_r89 = Back3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));

		PartDefinition cube_r90 = Back3.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));

		PartDefinition cube_r91 = Back3.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r92 = Back3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r93 = Back3.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r94 = Back3.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r95 = Back3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r96 = Back3.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r97 = Back3.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));

		PartDefinition cube_r98 = Back3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 53).mirror()
				.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));

		PartDefinition cube_r99 = Back3.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));

		PartDefinition cube_r100 = Back3.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));

		PartDefinition cube_r101 = Back3.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));

		PartDefinition cube_r102 = Back3.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));

		PartDefinition cube_r103 = Back3.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));

		PartDefinition cube_r104 = Back3.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));

		PartDefinition cube_r105 = Back3.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));

		PartDefinition cube_r106 = Back3.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));

		PartDefinition cube_r107 = Back3.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));

		PartDefinition cube_r108 = Back3.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));

		PartDefinition cube_r109 = Back3.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));

		PartDefinition cube_r110 = Back3.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));

		PartDefinition cube_r111 = Back3.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));

		PartDefinition cube_r112 = Back3.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));

		PartDefinition cube_r113 = Back3.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));

		PartDefinition cube_r114 = Back3.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));

		PartDefinition cube_r115 = Back3.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));

		PartDefinition cube_r116 = Back3.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));

		PartDefinition cube_r117 = Back3.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));

		PartDefinition bone3 = Hair.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition Back4 = bone3.addOrReplaceChild("Back4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Back4.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r119 = Back4.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r120 = Back4.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r121 = Back4.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r122 = Back4.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r123 = Back4.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r124 = Back4.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r125 = Back4.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r126 = Back4.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r127 = Back4.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r128 = Back4.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r129 = Back4.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r130 = Back4.addOrReplaceChild("cube_r130",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r131 = Back4.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r132 = Back4.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r133 = Back4.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r134 = Back4.addOrReplaceChild("cube_r134",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r135 = Back4.addOrReplaceChild("cube_r135",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r136 = Back4.addOrReplaceChild("cube_r136",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r137 = Back4.addOrReplaceChild("cube_r137",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r138 = Back4.addOrReplaceChild("cube_r138",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r139 = Back4.addOrReplaceChild("cube_r139",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r140 = Back4.addOrReplaceChild("cube_r140",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r141 = Back4.addOrReplaceChild("cube_r141",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r142 = Back4.addOrReplaceChild("cube_r142",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r143 = Back4.addOrReplaceChild("cube_r143",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r144 = Back4.addOrReplaceChild("cube_r144",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r145 = Back4.addOrReplaceChild("cube_r145",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r146 = Back4.addOrReplaceChild("cube_r146",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r147 = Back4.addOrReplaceChild("cube_r147",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r148 = Back4.addOrReplaceChild("cube_r148",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r149 = Back4.addOrReplaceChild("cube_r149",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r150 = Back4.addOrReplaceChild("cube_r150",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r151 = Back4.addOrReplaceChild("cube_r151",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r152 = Back4.addOrReplaceChild("cube_r152",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r153 = Back4.addOrReplaceChild("cube_r153",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r154 = Back4.addOrReplaceChild("cube_r154",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r155 = Back4.addOrReplaceChild("cube_r155",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r156 = Back4.addOrReplaceChild("cube_r156",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back5 = bone3.addOrReplaceChild("Back5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));

		PartDefinition cube_r157 = Back5.addOrReplaceChild("cube_r157",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r158 = Back5.addOrReplaceChild("cube_r158",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r159 = Back5.addOrReplaceChild("cube_r159",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r160 = Back5.addOrReplaceChild("cube_r160",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r161 = Back5.addOrReplaceChild("cube_r161",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r162 = Back5.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r163 = Back5.addOrReplaceChild("cube_r163",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r164 = Back5.addOrReplaceChild("cube_r164",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r165 = Back5.addOrReplaceChild("cube_r165",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r166 = Back5.addOrReplaceChild("cube_r166",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r167 = Back5.addOrReplaceChild("cube_r167",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r168 = Back5.addOrReplaceChild("cube_r168",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r169 = Back5.addOrReplaceChild("cube_r169",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r170 = Back5.addOrReplaceChild("cube_r170",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r171 = Back5.addOrReplaceChild("cube_r171",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r172 = Back5.addOrReplaceChild("cube_r172",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r173 = Back5.addOrReplaceChild("cube_r173",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r174 = Back5.addOrReplaceChild("cube_r174",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r175 = Back5.addOrReplaceChild("cube_r175",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r176 = Back5.addOrReplaceChild("cube_r176",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r177 = Back5.addOrReplaceChild("cube_r177",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r178 = Back5.addOrReplaceChild("cube_r178",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r179 = Back5.addOrReplaceChild("cube_r179",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r180 = Back5.addOrReplaceChild("cube_r180",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r181 = Back5.addOrReplaceChild("cube_r181",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r182 = Back5.addOrReplaceChild("cube_r182",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r183 = Back5.addOrReplaceChild("cube_r183",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r184 = Back5.addOrReplaceChild("cube_r184",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r185 = Back5.addOrReplaceChild("cube_r185",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r186 = Back5.addOrReplaceChild("cube_r186",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r187 = Back5.addOrReplaceChild("cube_r187",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r188 = Back5.addOrReplaceChild("cube_r188",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r189 = Back5.addOrReplaceChild("cube_r189",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r190 = Back5.addOrReplaceChild("cube_r190",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r191 = Back5.addOrReplaceChild("cube_r191",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r192 = Back5.addOrReplaceChild("cube_r192",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r193 = Back5.addOrReplaceChild("cube_r193",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r194 = Back5.addOrReplaceChild("cube_r194",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r195 = Back5.addOrReplaceChild("cube_r195",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back6 = bone3.addOrReplaceChild("Back6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));

		PartDefinition cube_r196 = Back6.addOrReplaceChild("cube_r196",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r197 = Back6.addOrReplaceChild("cube_r197",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r198 = Back6.addOrReplaceChild("cube_r198",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r199 = Back6.addOrReplaceChild("cube_r199",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r200 = Back6.addOrReplaceChild("cube_r200",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r201 = Back6.addOrReplaceChild("cube_r201",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r202 = Back6.addOrReplaceChild("cube_r202",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));

		PartDefinition cube_r203 = Back6.addOrReplaceChild("cube_r203",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));

		PartDefinition cube_r204 = Back6.addOrReplaceChild("cube_r204",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));

		PartDefinition cube_r205 = Back6.addOrReplaceChild("cube_r205",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));

		PartDefinition cube_r206 = Back6.addOrReplaceChild("cube_r206",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));

		PartDefinition cube_r207 = Back6.addOrReplaceChild("cube_r207",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));

		PartDefinition cube_r208 = Back6.addOrReplaceChild("cube_r208",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r209 = Back6.addOrReplaceChild("cube_r209",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r210 = Back6.addOrReplaceChild("cube_r210",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r211 = Back6.addOrReplaceChild("cube_r211",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r212 = Back6.addOrReplaceChild("cube_r212",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r213 = Back6.addOrReplaceChild("cube_r213",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r214 = Back6.addOrReplaceChild("cube_r214",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));

		PartDefinition cube_r215 = Back6.addOrReplaceChild("cube_r215",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));

		PartDefinition cube_r216 = Back6.addOrReplaceChild("cube_r216",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));

		PartDefinition cube_r217 = Back6.addOrReplaceChild("cube_r217",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));

		PartDefinition cube_r218 = Back6.addOrReplaceChild("cube_r218",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));

		PartDefinition cube_r219 = Back6.addOrReplaceChild("cube_r219",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));

		PartDefinition cube_r220 = Back6.addOrReplaceChild("cube_r220",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));

		PartDefinition cube_r221 = Back6.addOrReplaceChild("cube_r221",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));

		PartDefinition cube_r222 = Back6.addOrReplaceChild("cube_r222",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));

		PartDefinition cube_r223 = Back6.addOrReplaceChild("cube_r223",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));

		PartDefinition cube_r224 = Back6.addOrReplaceChild("cube_r224",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));

		PartDefinition cube_r225 = Back6.addOrReplaceChild("cube_r225",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));

		PartDefinition cube_r226 = Back6.addOrReplaceChild("cube_r226",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));

		PartDefinition cube_r227 = Back6.addOrReplaceChild("cube_r227",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));

		PartDefinition cube_r228 = Back6.addOrReplaceChild("cube_r228",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));

		PartDefinition cube_r229 = Back6.addOrReplaceChild("cube_r229",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));

		PartDefinition cube_r230 = Back6.addOrReplaceChild("cube_r230",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));

		PartDefinition cube_r231 = Back6.addOrReplaceChild("cube_r231",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));

		PartDefinition cube_r232 = Back6.addOrReplaceChild("cube_r232",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));

		PartDefinition cube_r233 = Back6.addOrReplaceChild("cube_r233",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));

		PartDefinition cube_r234 = Back6.addOrReplaceChild("cube_r234",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));

		PartDefinition bone4 = Hair.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.937F, 0.8007F, -0.5795F));

		PartDefinition Back7 = bone4.addOrReplaceChild("Back7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Back7.addOrReplaceChild("cube_r235",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r236 = Back7.addOrReplaceChild("cube_r236",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r237 = Back7.addOrReplaceChild("cube_r237",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r238 = Back7.addOrReplaceChild("cube_r238",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r239 = Back7.addOrReplaceChild("cube_r239",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r240 = Back7.addOrReplaceChild("cube_r240",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r241 = Back7.addOrReplaceChild("cube_r241",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r242 = Back7.addOrReplaceChild("cube_r242",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r243 = Back7.addOrReplaceChild("cube_r243",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r244 = Back7.addOrReplaceChild("cube_r244",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r245 = Back7.addOrReplaceChild("cube_r245",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r246 = Back7.addOrReplaceChild("cube_r246",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r247 = Back7.addOrReplaceChild("cube_r247",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r248 = Back7.addOrReplaceChild("cube_r248",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r249 = Back7.addOrReplaceChild("cube_r249",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r250 = Back7.addOrReplaceChild("cube_r250",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r251 = Back7.addOrReplaceChild("cube_r251",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r252 = Back7.addOrReplaceChild("cube_r252",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r253 = Back7.addOrReplaceChild("cube_r253",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r254 = Back7.addOrReplaceChild("cube_r254",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r255 = Back7.addOrReplaceChild("cube_r255",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r256 = Back7.addOrReplaceChild("cube_r256",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r257 = Back7.addOrReplaceChild("cube_r257",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r258 = Back7.addOrReplaceChild("cube_r258",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r259 = Back7.addOrReplaceChild("cube_r259",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r260 = Back7.addOrReplaceChild("cube_r260",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r261 = Back7.addOrReplaceChild("cube_r261",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r262 = Back7.addOrReplaceChild("cube_r262",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r263 = Back7.addOrReplaceChild("cube_r263",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r264 = Back7.addOrReplaceChild("cube_r264",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r265 = Back7.addOrReplaceChild("cube_r265",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r266 = Back7.addOrReplaceChild("cube_r266",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r267 = Back7.addOrReplaceChild("cube_r267",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r268 = Back7.addOrReplaceChild("cube_r268",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r269 = Back7.addOrReplaceChild("cube_r269",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r270 = Back7.addOrReplaceChild("cube_r270",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r271 = Back7.addOrReplaceChild("cube_r271",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r272 = Back7.addOrReplaceChild("cube_r272",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r273 = Back7.addOrReplaceChild("cube_r273",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back8 = bone4.addOrReplaceChild("Back8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));

		PartDefinition cube_r274 = Back8.addOrReplaceChild("cube_r274",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r275 = Back8.addOrReplaceChild("cube_r275",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r276 = Back8.addOrReplaceChild("cube_r276",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r277 = Back8.addOrReplaceChild("cube_r277",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r278 = Back8.addOrReplaceChild("cube_r278",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r279 = Back8.addOrReplaceChild("cube_r279",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r280 = Back8.addOrReplaceChild("cube_r280",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r281 = Back8.addOrReplaceChild("cube_r281",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r282 = Back8.addOrReplaceChild("cube_r282",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r283 = Back8.addOrReplaceChild("cube_r283",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r284 = Back8.addOrReplaceChild("cube_r284",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r285 = Back8.addOrReplaceChild("cube_r285",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r286 = Back8.addOrReplaceChild("cube_r286",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r287 = Back8.addOrReplaceChild("cube_r287",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r288 = Back8.addOrReplaceChild("cube_r288",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r289 = Back8.addOrReplaceChild("cube_r289",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r290 = Back8.addOrReplaceChild("cube_r290",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r291 = Back8.addOrReplaceChild("cube_r291",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r292 = Back8.addOrReplaceChild("cube_r292",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r293 = Back8.addOrReplaceChild("cube_r293",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r294 = Back8.addOrReplaceChild("cube_r294",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r295 = Back8.addOrReplaceChild("cube_r295",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r296 = Back8.addOrReplaceChild("cube_r296",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r297 = Back8.addOrReplaceChild("cube_r297",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r298 = Back8.addOrReplaceChild("cube_r298",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r299 = Back8.addOrReplaceChild("cube_r299",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r300 = Back8.addOrReplaceChild("cube_r300",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r301 = Back8.addOrReplaceChild("cube_r301",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r302 = Back8.addOrReplaceChild("cube_r302",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r303 = Back8.addOrReplaceChild("cube_r303",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r304 = Back8.addOrReplaceChild("cube_r304",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r305 = Back8.addOrReplaceChild("cube_r305",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r306 = Back8.addOrReplaceChild("cube_r306",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r307 = Back8.addOrReplaceChild("cube_r307",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r308 = Back8.addOrReplaceChild("cube_r308",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r309 = Back8.addOrReplaceChild("cube_r309",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r310 = Back8.addOrReplaceChild("cube_r310",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r311 = Back8.addOrReplaceChild("cube_r311",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r312 = Back8.addOrReplaceChild("cube_r312",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition Back9 = bone4.addOrReplaceChild("Back9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));

		PartDefinition cube_r313 = Back9.addOrReplaceChild("cube_r313",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r314 = Back9.addOrReplaceChild("cube_r314",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r315 = Back9.addOrReplaceChild("cube_r315",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r316 = Back9.addOrReplaceChild("cube_r316",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r317 = Back9.addOrReplaceChild("cube_r317",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r318 = Back9.addOrReplaceChild("cube_r318",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r319 = Back9.addOrReplaceChild("cube_r319",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));

		PartDefinition cube_r320 = Back9.addOrReplaceChild("cube_r320",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));

		PartDefinition cube_r321 = Back9.addOrReplaceChild("cube_r321",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));

		PartDefinition cube_r322 = Back9.addOrReplaceChild("cube_r322",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));

		PartDefinition cube_r323 = Back9.addOrReplaceChild("cube_r323",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));

		PartDefinition cube_r324 = Back9.addOrReplaceChild("cube_r324",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));

		PartDefinition cube_r325 = Back9.addOrReplaceChild("cube_r325",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r326 = Back9.addOrReplaceChild("cube_r326",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r327 = Back9.addOrReplaceChild("cube_r327",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r328 = Back9.addOrReplaceChild("cube_r328",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r329 = Back9.addOrReplaceChild("cube_r329",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r330 = Back9.addOrReplaceChild("cube_r330",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r331 = Back9.addOrReplaceChild("cube_r331",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));

		PartDefinition cube_r332 = Back9.addOrReplaceChild("cube_r332",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));

		PartDefinition cube_r333 = Back9.addOrReplaceChild("cube_r333",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));

		PartDefinition cube_r334 = Back9.addOrReplaceChild("cube_r334",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));

		PartDefinition cube_r335 = Back9.addOrReplaceChild("cube_r335",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));

		PartDefinition cube_r336 = Back9.addOrReplaceChild("cube_r336",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));

		PartDefinition cube_r337 = Back9.addOrReplaceChild("cube_r337",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));

		PartDefinition cube_r338 = Back9.addOrReplaceChild("cube_r338",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));

		PartDefinition cube_r339 = Back9.addOrReplaceChild("cube_r339",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));

		PartDefinition cube_r340 = Back9.addOrReplaceChild("cube_r340",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));

		PartDefinition cube_r341 = Back9.addOrReplaceChild("cube_r341",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));

		PartDefinition cube_r342 = Back9.addOrReplaceChild("cube_r342",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));

		PartDefinition cube_r343 = Back9.addOrReplaceChild("cube_r343",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));

		PartDefinition cube_r344 = Back9.addOrReplaceChild("cube_r344",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));

		PartDefinition cube_r345 = Back9.addOrReplaceChild("cube_r345",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));

		PartDefinition cube_r346 = Back9.addOrReplaceChild("cube_r346",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));

		PartDefinition cube_r347 = Back9.addOrReplaceChild("cube_r347",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));

		PartDefinition cube_r348 = Back9.addOrReplaceChild("cube_r348",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));

		PartDefinition cube_r349 = Back9.addOrReplaceChild("cube_r349",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));

		PartDefinition cube_r350 = Back9.addOrReplaceChild("cube_r350",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));

		PartDefinition cube_r351 = Back9.addOrReplaceChild("cube_r351",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));

		PartDefinition bone5 = Hair.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, -0.937F, -0.8007F, 0.5795F));

		PartDefinition Back10 = bone5.addOrReplaceChild("Back10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1167F, -3.0088F, 5.3554F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r352 = Back10.addOrReplaceChild("cube_r352",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r353 = Back10.addOrReplaceChild("cube_r353",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r354 = Back10.addOrReplaceChild("cube_r354",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r355 = Back10.addOrReplaceChild("cube_r355",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r356 = Back10.addOrReplaceChild("cube_r356",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r357 = Back10.addOrReplaceChild("cube_r357",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r358 = Back10.addOrReplaceChild("cube_r358",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));

		PartDefinition cube_r359 = Back10.addOrReplaceChild("cube_r359",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));

		PartDefinition cube_r360 = Back10.addOrReplaceChild("cube_r360",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));

		PartDefinition cube_r361 = Back10.addOrReplaceChild("cube_r361",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));

		PartDefinition cube_r362 = Back10.addOrReplaceChild("cube_r362",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));

		PartDefinition cube_r363 = Back10.addOrReplaceChild("cube_r363",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));

		PartDefinition cube_r364 = Back10.addOrReplaceChild("cube_r364",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r365 = Back10.addOrReplaceChild("cube_r365",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r366 = Back10.addOrReplaceChild("cube_r366",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r367 = Back10.addOrReplaceChild("cube_r367",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r368 = Back10.addOrReplaceChild("cube_r368",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r369 = Back10.addOrReplaceChild("cube_r369",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r370 = Back10.addOrReplaceChild("cube_r370",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));

		PartDefinition cube_r371 = Back10.addOrReplaceChild("cube_r371",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));

		PartDefinition cube_r372 = Back10.addOrReplaceChild("cube_r372",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));

		PartDefinition cube_r373 = Back10.addOrReplaceChild("cube_r373",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));

		PartDefinition cube_r374 = Back10.addOrReplaceChild("cube_r374",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));

		PartDefinition cube_r375 = Back10.addOrReplaceChild("cube_r375",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));

		PartDefinition cube_r376 = Back10.addOrReplaceChild("cube_r376",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));

		PartDefinition cube_r377 = Back10.addOrReplaceChild("cube_r377",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));

		PartDefinition cube_r378 = Back10.addOrReplaceChild("cube_r378",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));

		PartDefinition cube_r379 = Back10.addOrReplaceChild("cube_r379",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));

		PartDefinition cube_r380 = Back10.addOrReplaceChild("cube_r380",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));

		PartDefinition cube_r381 = Back10.addOrReplaceChild("cube_r381",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));

		PartDefinition cube_r382 = Back10.addOrReplaceChild("cube_r382",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));

		PartDefinition cube_r383 = Back10.addOrReplaceChild("cube_r383",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));

		PartDefinition cube_r384 = Back10.addOrReplaceChild("cube_r384",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));

		PartDefinition cube_r385 = Back10.addOrReplaceChild("cube_r385",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));

		PartDefinition cube_r386 = Back10.addOrReplaceChild("cube_r386",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));

		PartDefinition cube_r387 = Back10.addOrReplaceChild("cube_r387",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));

		PartDefinition cube_r388 = Back10.addOrReplaceChild("cube_r388",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));

		PartDefinition cube_r389 = Back10.addOrReplaceChild("cube_r389",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));

		PartDefinition cube_r390 = Back10.addOrReplaceChild("cube_r390",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));

		PartDefinition Back11 = bone5.addOrReplaceChild("Back11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1167F, -3.0088F, 3.3554F, -0.6041F, -0.7318F, 0.4321F));

		PartDefinition cube_r391 = Back11.addOrReplaceChild("cube_r391",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r392 = Back11.addOrReplaceChild("cube_r392",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r393 = Back11.addOrReplaceChild("cube_r393",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0056F, -2.0666F, -1.8249F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r394 = Back11.addOrReplaceChild("cube_r394",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.7354F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, -0.6158F));

		PartDefinition cube_r395 = Back11.addOrReplaceChild("cube_r395",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.3142F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, -0.3137F));

		PartDefinition cube_r396 = Back11.addOrReplaceChild("cube_r396",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.571F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5182F, -3.0868F, -0.4072F, 2.342F, -0.0205F, -0.0629F));

		PartDefinition cube_r397 = Back11.addOrReplaceChild("cube_r397",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3846F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, -0.1783F));

		PartDefinition cube_r398 = Back11.addOrReplaceChild("cube_r398",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4878F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, -0.4804F));

		PartDefinition cube_r399 = Back11.addOrReplaceChild("cube_r399",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2084F, -3.0868F, -0.4072F, 2.342F, 0.0205F, -0.7312F));

		PartDefinition cube_r400 = Back11.addOrReplaceChild("cube_r400",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 0.6558F, -0.0002F, 0.2501F));

		PartDefinition cube_r401 = Back11.addOrReplaceChild("cube_r401",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.0796F, -0.2374F, 0.063F));

		PartDefinition cube_r402 = Back11.addOrReplaceChild("cube_r402",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0897F, 2.2132F, 1.4478F, 1.6501F, -0.2241F, -0.2909F));

		PartDefinition cube_r403 = Back11.addOrReplaceChild("cube_r403",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r404 = Back11.addOrReplaceChild("cube_r404",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r405 = Back11.addOrReplaceChild("cube_r405",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3818F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r406 = Back11.addOrReplaceChild("cube_r406",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r407 = Back11.addOrReplaceChild("cube_r407",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r408 = Back11.addOrReplaceChild("cube_r408",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1483F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r409 = Back11.addOrReplaceChild("cube_r409",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.5571F, -0.247F, -0.612F));

		PartDefinition cube_r410 = Back11.addOrReplaceChild("cube_r410",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 0.9398F, 0.0106F, -0.4546F));

		PartDefinition cube_r411 = Back11.addOrReplaceChild("cube_r411",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7835F, 1.8289F, -0.0362F, 1.4403F, 0.0579F, -0.1129F));

		PartDefinition cube_r412 = Back11.addOrReplaceChild("cube_r412",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.5571F, -0.247F, -0.4811F));

		PartDefinition cube_r413 = Back11.addOrReplaceChild("cube_r413",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 0.9398F, 0.0106F, -0.3237F));

		PartDefinition cube_r414 = Back11.addOrReplaceChild("cube_r414",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1803F, 1.8289F, 0.3481F, 1.4403F, 0.0579F, 0.018F));

		PartDefinition cube_r415 = Back11.addOrReplaceChild("cube_r415",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.1263F, 0.0725F, -0.3159F));

		PartDefinition cube_r416 = Back11.addOrReplaceChild("cube_r416",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 0.733F, -0.1528F, -0.5162F));

		PartDefinition cube_r417 = Back11.addOrReplaceChild("cube_r417",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6573F, 0.2919F, -0.8709F, 1.6369F, 0.0533F, 0.0289F));

		PartDefinition cube_r418 = Back11.addOrReplaceChild("cube_r418",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4167F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.4628F, 0.1749F, -0.274F));

		PartDefinition cube_r419 = Back11.addOrReplaceChild("cube_r419",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.8378F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.0351F, 0.0238F, -0.5359F));

		PartDefinition cube_r420 = Back11.addOrReplaceChild("cube_r420",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.6696F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5388F, 0.3966F, -1.7524F, 1.9861F, 0.0402F, 0.0454F));

		PartDefinition cube_r421 = Back11.addOrReplaceChild("cube_r421",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.3853F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.2129F, -0.0207F, 0.5647F));

		PartDefinition cube_r422 = Back11.addOrReplaceChild("cube_r422",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.2822F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 0.8298F, 0.1854F, 0.7854F));

		PartDefinition cube_r423 = Back11.addOrReplaceChild("cube_r423",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.229F, 0.3966F, -0.1359F, 1.701F, 0.0246F, 0.223F));

		PartDefinition cube_r424 = Back11.addOrReplaceChild("cube_r424",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.5983F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.2461F, -0.0417F, 0.3019F));

		PartDefinition cube_r425 = Back11.addOrReplaceChild("cube_r425",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4881F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 0.8579F, 0.1575F, 0.5284F));

		PartDefinition cube_r426 = Back11.addOrReplaceChild("cube_r426",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.0661F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7681F, -0.5543F, -1.3119F, 1.7393F, 0.0159F, -0.038F));

		PartDefinition cube_r427 = Back11.addOrReplaceChild("cube_r427",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-1.4045F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.0072F, -3.9345F, 2.873F, 1.6913F, 0.014F, -0.3704F));

		PartDefinition cube_r428 = Back11.addOrReplaceChild("cube_r428",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(0.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 1.2003F, -0.0274F, -0.0281F));

		PartDefinition cube_r429 = Back11.addOrReplaceChild("cube_r429",
				CubeListBuilder.create().texOffs(51, 53).mirror()
						.addBox(-0.4373F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1167F, 2.0621F, -0.087F, 0.8158F, 0.1816F, 0.1896F));

		PartDefinition Back12 = bone5.addOrReplaceChild("Back12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.1167F, -3.0088F, 3.3554F, -0.6041F, 0.7318F, -0.4321F));

		PartDefinition cube_r430 = Back12.addOrReplaceChild("cube_r430",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r431 = Back12.addOrReplaceChild("cube_r431",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r432 = Back12.addOrReplaceChild("cube_r432",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0056F, -2.0666F, -1.8249F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r433 = Back12.addOrReplaceChild("cube_r433",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.2646F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.3688F, -0.1657F, 0.6158F));

		PartDefinition cube_r434 = Back12.addOrReplaceChild("cube_r434",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.6858F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 1.8283F, -0.2179F, 0.3137F));

		PartDefinition cube_r435 = Back12.addOrReplaceChild("cube_r435",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.429F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5182F, -3.0868F, -0.4072F, 2.342F, 0.0205F, 0.0629F));

		PartDefinition cube_r436 = Back12.addOrReplaceChild("cube_r436",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6154F, 0.0883F, -4.5069F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.3688F, 0.1657F, 0.1783F));

		PartDefinition cube_r437 = Back12.addOrReplaceChild("cube_r437",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5122F, -0.2575F, -1.8311F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 1.8283F, 0.2179F, 0.4804F));

		PartDefinition cube_r438 = Back12.addOrReplaceChild("cube_r438",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.034F, 0.6577F, 0.5642F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2084F, -3.0868F, -0.4072F, 2.342F, -0.0205F, 0.7312F));

		PartDefinition cube_r439 = Back12.addOrReplaceChild("cube_r439",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 0.6558F, 0.0002F, -0.2501F));

		PartDefinition cube_r440 = Back12.addOrReplaceChild("cube_r440",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.0796F, 0.2374F, -0.063F));

		PartDefinition cube_r441 = Back12.addOrReplaceChild("cube_r441",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0897F, 2.2132F, 1.4478F, 1.6501F, 0.2241F, 0.2909F));

		PartDefinition cube_r442 = Back12.addOrReplaceChild("cube_r442",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.0076F, 0.088F, -0.649F));

		PartDefinition cube_r443 = Back12.addOrReplaceChild("cube_r443",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.4526F, 0.2441F, -0.3876F));

		PartDefinition cube_r444 = Back12.addOrReplaceChild("cube_r444",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3818F, 1.6567F, -0.0362F, 1.9985F, 0.1089F, -0.0652F));

		PartDefinition cube_r445 = Back12.addOrReplaceChild("cube_r445",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.0076F, -0.088F, 0.649F));

		PartDefinition cube_r446 = Back12.addOrReplaceChild("cube_r446",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.4526F, -0.2441F, 0.3876F));

		PartDefinition cube_r447 = Back12.addOrReplaceChild("cube_r447",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1483F, 1.6567F, -0.0362F, 1.9985F, -0.1089F, 0.0652F));

		PartDefinition cube_r448 = Back12.addOrReplaceChild("cube_r448",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.5571F, 0.247F, 0.612F));

		PartDefinition cube_r449 = Back12.addOrReplaceChild("cube_r449",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 0.9398F, -0.0106F, 0.4546F));

		PartDefinition cube_r450 = Back12.addOrReplaceChild("cube_r450",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7835F, 1.8289F, -0.0362F, 1.4403F, -0.0579F, 0.1129F));

		PartDefinition cube_r451 = Back12.addOrReplaceChild("cube_r451",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.5571F, 0.247F, 0.4811F));

		PartDefinition cube_r452 = Back12.addOrReplaceChild("cube_r452",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 0.9398F, -0.0106F, 0.3237F));

		PartDefinition cube_r453 = Back12.addOrReplaceChild("cube_r453",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1803F, 1.8289F, 0.3481F, 1.4403F, -0.0579F, -0.018F));

		PartDefinition cube_r454 = Back12.addOrReplaceChild("cube_r454",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.1263F, -0.0725F, 0.3159F));

		PartDefinition cube_r455 = Back12.addOrReplaceChild("cube_r455",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 0.733F, 0.1528F, 0.5162F));

		PartDefinition cube_r456 = Back12.addOrReplaceChild("cube_r456",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6573F, 0.2919F, -0.8709F, 1.6369F, -0.0533F, -0.0289F));

		PartDefinition cube_r457 = Back12.addOrReplaceChild("cube_r457",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5833F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.4628F, -0.1749F, 0.274F));

		PartDefinition cube_r458 = Back12.addOrReplaceChild("cube_r458",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.1622F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.0351F, -0.0238F, 0.5359F));

		PartDefinition cube_r459 = Back12.addOrReplaceChild("cube_r459",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.3304F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5388F, 0.3966F, -1.7524F, 1.9861F, -0.0402F, -0.0454F));

		PartDefinition cube_r460 = Back12.addOrReplaceChild("cube_r460",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.6147F, -0.2825F, -1.8369F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.2129F, 0.0207F, -0.5647F));

		PartDefinition cube_r461 = Back12.addOrReplaceChild("cube_r461",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.7178F, 0.0676F, -4.491F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 0.8298F, -0.1854F, -0.7854F));

		PartDefinition cube_r462 = Back12.addOrReplaceChild("cube_r462",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.1326F, 0.6329F, 0.5357F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.229F, 0.3966F, -0.1359F, 1.701F, -0.0246F, -0.223F));

		PartDefinition cube_r463 = Back12.addOrReplaceChild("cube_r463",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.4017F, -0.2792F, -1.8292F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.2461F, 0.0417F, -0.3019F));

		PartDefinition cube_r464 = Back12.addOrReplaceChild("cube_r464",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5119F, 0.0676F, -4.5461F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 0.8579F, -0.1575F, -0.5284F));

		PartDefinition cube_r465 = Back12.addOrReplaceChild("cube_r465",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.9339F, 0.6394F, 0.6127F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7681F, -0.5543F, -1.3119F, 1.7393F, -0.0159F, 0.038F));

		PartDefinition cube_r466 = Back12.addOrReplaceChild("cube_r466",
				CubeListBuilder.create().texOffs(51, 53).addBox(-0.5955F, -1.7225F, -2.2194F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0072F, -3.9345F, 2.873F, 1.6913F, -0.014F, 0.3704F));

		PartDefinition cube_r467 = Back12.addOrReplaceChild("cube_r467",
				CubeListBuilder.create().texOffs(51, 53).addBox(-2.2385F, -0.3312F, 0.9341F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 1.2003F, 0.0274F, 0.0281F));

		PartDefinition cube_r468 = Back12.addOrReplaceChild("cube_r468",
				CubeListBuilder.create().texOffs(51, 53).addBox(-1.5627F, -1.06F, -1.8881F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1167F, 2.0621F, -0.087F, 0.8158F, -0.1816F, -0.1896F));

		PartDefinition SuperBang = Hair.addOrReplaceChild("SuperBang", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.9433F, -31.3109F, -2.8784F, 0.829F, -0.9599F, 3.098F));

		PartDefinition bunch6_r11 = SuperBang.addOrReplaceChild("bunch6_r11",
				CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9105F, -1.9773F, -3.5101F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition bunch6_r12 = SuperBang.addOrReplaceChild("bunch6_r12",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8104F, -0.7773F, -3.1097F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition SuperBang7 = Hair.addOrReplaceChild("SuperBang7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.9433F, -31.3109F, -2.8784F, 0.5029F, 0.735F, -0.2021F));

		PartDefinition bunch7_r6 = SuperBang7.addOrReplaceChild("bunch7_r6",
				CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9105F, -1.9773F, -3.5101F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition bunch7_r7 = SuperBang7.addOrReplaceChild("bunch7_r7",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8104F, -0.7773F, -3.1097F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition SuperBang8 = Hair.addOrReplaceChild("SuperBang8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9433F, -31.3109F, -2.8784F, 0.5029F, -0.735F, 0.2021F));

		PartDefinition bunch8_r1 = SuperBang8
				.addOrReplaceChild("bunch8_r1",
						CubeListBuilder.create().texOffs(55, 60).mirror()
								.addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(0.9105F, -1.9773F, -3.5101F, 0.1745F, -0.2182F, 0.0F));

		PartDefinition bunch8_r2 = SuperBang8.addOrReplaceChild("bunch8_r2",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.8104F, -0.7773F, -3.1097F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition SuperBang2 = Hair.addOrReplaceChild("SuperBang2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9433F, -31.3109F, -2.8784F, 0.829F, 0.9599F, -3.098F));

		PartDefinition bunch7_r8 = SuperBang2
				.addOrReplaceChild("bunch7_r8",
						CubeListBuilder.create().texOffs(55, 60).mirror()
								.addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(0.9105F, -1.9773F, -3.5101F, 0.1745F, -0.2182F, 0.0F));

		PartDefinition bunch7_r9 = SuperBang2.addOrReplaceChild("bunch7_r9",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.8104F, -0.7773F, -3.1097F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition SuperBang3 = Hair.addOrReplaceChild("SuperBang3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.9433F, -34.3109F, -1.8784F, 0.829F, 0.9599F, -3.098F));

		PartDefinition bunch8_r3 = SuperBang3
				.addOrReplaceChild("bunch8_r3",
						CubeListBuilder.create().texOffs(55, 60).mirror()
								.addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(0.9105F, -1.9773F, -3.5101F, 0.1745F, -0.2182F, 0.0F));

		PartDefinition bunch8_r4 = SuperBang3.addOrReplaceChild("bunch8_r4",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.8104F, -0.7773F, -3.1097F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition SuperBang4 = Hair.addOrReplaceChild("SuperBang4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.9433F, -34.3109F, -1.8784F, 0.829F, -0.9599F, 3.098F));

		PartDefinition bunch9_r1 = SuperBang4.addOrReplaceChild("bunch9_r1",
				CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9105F, -1.9773F, -3.5101F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition bunch9_r2 = SuperBang4.addOrReplaceChild("bunch9_r2",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8104F, -0.7773F, -3.1097F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition SuperBang5 = Hair.addOrReplaceChild("SuperBang5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.9433F, -34.3109F, 1.1216F, 0.829F, -0.9599F, 3.098F));

		PartDefinition bunch10_r1 = SuperBang5.addOrReplaceChild("bunch10_r1",
				CubeListBuilder.create().texOffs(55, 60).addBox(-0.0323F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9105F, -1.9773F, -3.5101F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition bunch10_r2 = SuperBang5.addOrReplaceChild("bunch10_r2",
				CubeListBuilder.create().texOffs(51, 58).addBox(-0.1334F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8104F, -0.7773F, -3.1097F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition SuperBang6 = Hair.addOrReplaceChild("SuperBang6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.9433F, -34.3109F, 1.1216F, 0.829F, 0.9599F, -3.098F));

		PartDefinition bunch11_r1 = SuperBang6
				.addOrReplaceChild("bunch11_r1",
						CubeListBuilder.create().texOffs(55, 60).mirror()
								.addBox(-1.5894F, -0.0173F, -1.7496F, 1.6216F, 1.62F, 2.0971F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(0.9105F, -1.9773F, -3.5101F, 0.1745F, -0.2182F, 0.0F));

		PartDefinition bunch11_r2 = SuperBang6.addOrReplaceChild("bunch11_r2",
				CubeListBuilder.create().texOffs(51, 58).mirror()
						.addBox(-1.6684F, -1.3112F, -0.4204F, 1.8018F, 1.8F, 3.8038F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.8104F, -0.7773F, -3.1097F, -0.1745F, -0.2182F, 0.0F));

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