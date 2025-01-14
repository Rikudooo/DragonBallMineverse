// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRaditz<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raditz"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelRaditz(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition HairMain = Hair.addOrReplaceChild("HairMain", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, -0.425F));

		PartDefinition cube_r1 = HairMain.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.232F, -2.244F, -1.232F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.154F, -7.04F, -0.88F, -0.2148F, 0.0385F, 0.1747F));

		PartDefinition cube_r2 = HairMain.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.594F, -4.818F, -1.518F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.154F, -7.04F, -0.88F, -0.4595F, -0.0332F, 0.0301F));

		PartDefinition cube_r3 = HairMain.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.32F, -0.704F, -0.33F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6663F, -12.5951F, 1.3234F, -0.7869F, -0.173F, -0.2628F));

		PartDefinition cube_r4 = HairMain.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.3626F, -0.173F, -1.3722F, 1.936F, 3.102F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6342F, -9.2792F, -1.7764F, -0.1119F, 0.0324F, -0.1104F));

		PartDefinition cube_r5 = HairMain.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0794F, -1.964F, -1.0492F, 1.672F, 3.102F, 1.672F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6342F, -9.9832F, -1.7764F, -0.2945F, 0.0628F, 0.1763F));

		PartDefinition cube_r6 = HairMain.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.6653F, -3.3298F, -1.3554F, 1.408F, 2.31F, 1.408F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6342F, -9.9832F, -1.7764F, -0.5399F, 0.1664F, 0.5441F));

		PartDefinition cube_r7 = HairMain.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.968F, -1.958F, -0.77F, 1.936F, 2.398F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.88F, -7.04F, -2.64F, -0.2967F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = HairMain.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.242F, -0.759F, -0.308F, 1.408F, 2.31F, 1.408F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8062F, -11.5622F, -0.3696F, -0.7112F, 0.2508F, 0.4474F));

		PartDefinition cube_r9 = HairMain.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.408F, -3.828F, -0.946F, 1.672F, 2.398F, 1.672F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.88F, -7.04F, -2.64F, -0.4815F, 0.0831F, 0.1015F));

		PartDefinition cube_r10 = HairMain.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.682F, -1.98F, -0.286F, 1.54F, 1.562F, 1.54F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.012F, -7.48F, -2.86F, -0.2496F, -0.3134F, 0.6481F));

		PartDefinition cube_r11 = HairMain.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.88F, -0.66F, -0.396F, 1.76F, 2.002F, 1.76F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.012F, -7.48F, -2.86F, -0.2084F, -0.2738F, 0.8816F));

		PartDefinition cube_r12 = HairMain.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.286F, -3.52F, -0.506F, 1.32F, 1.87F, 1.32F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.012F, -7.48F, -2.86F, -0.3851F, -0.3302F, 0.4974F));

		PartDefinition cube_r13 = HairMain.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.88F, -1.628F, -0.682F, 1.76F, 2.464F, 1.76F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.64F, -7.04F, -2.64F, -0.3448F, 0.1511F, 0.3969F));

		PartDefinition cube_r14 = HairMain.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.122F, -0.814F, -0.308F, 1.364F, 2.464F, 1.364F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8147F, -9.3936F, -1.5001F, -0.6411F, 0.0144F, 0.0365F));

		PartDefinition cube_r15 = HairMain.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.814F, -0.627F, -0.22F, 1.1F, 1.87F, 1.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4374F, -10.5862F, -0.1481F, -0.9428F, -0.1362F, -0.1674F));

		PartDefinition cube_r16 = HairMain.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.1814F, -3.4739F, -1.9398F, 1.584F, 3.19F, 1.584F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5656F, -8.2964F, 4.1314F, -1.4759F, -0.8127F, -0.9686F));

		PartDefinition cube_r17 = HairMain.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5398F, -1.7845F, -1.5666F, 1.804F, 3.52F, 1.804F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5656F, -8.2964F, 4.1314F, -1.115F, -0.4757F, -0.7237F));

		PartDefinition cube_r18 = HairMain.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.3711F, 0.3571F, -1.9842F, 2.2F, 3.52F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5656F, -8.2964F, 4.1314F, -0.7306F, -0.1701F, -0.5759F));

		PartDefinition cube_r19 = HairMain.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.496F, -1.056F, 0.176F, 1.584F, 3.19F, 1.584F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2815F, -11.8367F, 4.0773F, -1.2748F, -0.5494F, -0.8827F));

		PartDefinition cube_r20 = HairMain.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.012F, -4.378F, -1.65F, 1.804F, 3.52F, 1.804F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.76F, -8.8F, 0.0F, -0.8795F, -0.2628F, -0.5957F));

		PartDefinition cube_r21 = HairMain.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.672F, -1.76F, -1.1F, 2.2F, 3.52F, 2.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.76F, -8.8F, 0.0F, -0.4756F, 0.0F, -0.384F));

		PartDefinition cube_r22 = HairMain.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.7473F, -1.1697F, -1.2983F, 1.848F, 2.442F, 1.848F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6534F, -8.7579F, 0.809F, -0.8929F, 0.2711F, -0.6666F));

		PartDefinition cube_r23 = HairMain.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5508F, 0.2537F, -1.6371F, 2.156F, 2.552F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6534F, -8.7579F, 0.809F, -0.3374F, 0.47F, -0.4836F));

		PartDefinition cube_r24 = HairMain.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.2283F, -2.754F, -1.3045F, 1.584F, 2.442F, 1.584F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6534F, -8.7579F, 0.809F, -1.1046F, -0.0398F, -0.9092F));

		PartDefinition cube_r25 = HairMain.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.286F, -0.737F, -0.55F, 1.584F, 2.442F, 1.584F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5786F, -10.1719F, 2.8937F, -1.0846F, 0.3499F, 0.8887F));

		PartDefinition cube_r26 = HairMain.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.352F, -3.212F, -2.068F, 1.848F, 2.442F, 1.848F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.926F, -7.788F, 0.0F, -0.948F, 0.0348F, 0.6488F));

		PartDefinition cube_r27 = HairMain.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.044F, -1.672F, -1.54F, 2.156F, 2.552F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.64F, -7.92F, 0.0F, -0.4482F, -0.1774F, 0.4948F));

		PartDefinition cube_r28 = HairMain.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(42, 0).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2587F, -7.4696F, 5.5343F, 1.1612F, -1.0735F, -1.0575F));

		PartDefinition cube_r29 = HairMain.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2587F, -7.4696F, 5.5343F, 1.6181F, -1.3008F, -1.568F));

		PartDefinition cube_r30 = HairMain.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2587F, -7.4696F, 5.5343F, -2.9845F, -1.2535F, 3.0399F));

		PartDefinition cube_r31 = HairMain.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(42, 0).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9456F, -8.3724F, 5.5343F, 1.1224F, -0.7201F, -1.0562F));

		PartDefinition cube_r32 = HairMain.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9456F, -8.3724F, 5.5343F, 1.2649F, -0.9743F, -1.272F));

		PartDefinition cube_r33 = HairMain.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9456F, -8.3724F, 5.5343F, 2.0228F, -1.2897F, -2.0398F));

		PartDefinition cube_r34 = HairMain.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9456F, -8.3724F, 5.5343F, 2.0228F, 1.2897F, 2.0398F));

		PartDefinition cube_r35 = HairMain.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9456F, -8.3724F, 5.5343F, 1.2649F, 0.9743F, 1.272F));

		PartDefinition cube_r36 = HairMain.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9456F, -8.3724F, 5.5343F, 1.1224F, 0.7201F, 1.0562F));

		PartDefinition cube_r37 = HairMain.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.084F, -7.9923F, 5.5343F, 0.4406F, 1.4829F, 0.4479F));

		PartDefinition cube_r38 = HairMain.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.084F, -7.9923F, 5.5343F, 0.7208F, 1.054F, 0.7845F));

		PartDefinition cube_r39 = HairMain.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.084F, -7.9923F, 5.5343F, 0.7251F, 0.7636F, 0.7636F));

		PartDefinition cube_r40 = HairMain.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.084F, -7.9923F, 5.5343F, 0.4406F, -1.4829F, -0.4479F));

		PartDefinition cube_r41 = HairMain.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.1591F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.084F, -7.9923F, 5.5343F, 0.7208F, -1.054F, -0.7845F));

		PartDefinition cube_r42 = HairMain.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(42, 0).addBox(-4.2075F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.084F, -7.9923F, 5.5343F, 0.7251F, -0.7636F, -0.7636F));

		PartDefinition cube_r43 = HairMain.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4535F, -6.2878F, 4.4078F, -0.0115F, -0.9028F, -0.2367F));

		PartDefinition cube_r44 = HairMain.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4535F, -6.2878F, 4.4078F, -0.3826F, -1.0926F, 0.1765F));

		PartDefinition cube_r45 = HairMain.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4535F, -6.2878F, 4.4078F, -1.1959F, -1.0768F, 1.1356F));

		PartDefinition cube_r46 = HairMain.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0775F, -2.5698F, 4.4078F, 0.0337F, -1.159F, -0.1502F));

		PartDefinition cube_r47 = HairMain.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0775F, -2.5698F, 4.4078F, -0.7346F, -1.3208F, 0.6336F));

		PartDefinition cube_r48 = HairMain.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0775F, -2.5698F, 4.4078F, -1.7471F, -1.0836F, 1.7502F));

		PartDefinition cube_r49 = HairMain.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9215F, -2.5478F, 4.7158F, -0.8715F, -0.832F, 0.7739F));

		PartDefinition cube_r50 = HairMain.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9215F, -2.5478F, 4.7158F, -1.1985F, -0.7899F, 1.1931F));

		PartDefinition cube_r51 = HairMain.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9215F, -2.5478F, 4.7158F, -1.4467F, -0.5515F, 1.6622F));

		PartDefinition cube_r52 = HairMain.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0775F, -2.5698F, 4.4078F, 0.0337F, 1.159F, 0.1502F));

		PartDefinition cube_r53 = HairMain.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0775F, -2.5698F, 4.4078F, -0.7346F, 1.3208F, -0.6336F));

		PartDefinition cube_r54 = HairMain.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0775F, -2.5698F, 4.4078F, -1.7471F, 1.0836F, -1.7502F));

		PartDefinition cube_r55 = HairMain.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9215F, -2.5478F, 4.7158F, -1.4467F, 0.5515F, -1.6622F));

		PartDefinition cube_r56 = HairMain.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9215F, -2.5478F, 4.7158F, -1.1985F, 0.7899F, -1.1931F));

		PartDefinition cube_r57 = HairMain.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9215F, -2.5478F, 4.7158F, -0.8715F, 0.832F, -0.7739F));

		PartDefinition cube_r58 = HairMain.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7815F, -4.7918F, 4.4078F, 1.4157F, 1.1263F, 1.5158F));

		PartDefinition cube_r59 = HairMain.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7815F, -4.7918F, 4.4078F, 2.0684F, 1.2767F, 2.2324F));

		PartDefinition cube_r60 = HairMain.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.084F, -5.9252F, 4.7264F, -3.0064F, 1.1271F, -2.8291F));

		PartDefinition cube_r61 = HairMain.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6255F, -4.5278F, 4.7158F, -2.4279F, 0.9333F, -2.3272F));

		PartDefinition cube_r62 = HairMain.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6255F, -4.5278F, 4.7158F, -2.7109F, 1.3586F, -2.5784F));

		PartDefinition cube_r63 = HairMain.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6255F, -4.5278F, 4.7158F, 1.2219F, 1.4731F, 1.3263F));

		PartDefinition cube_r64 = HairMain.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6255F, -4.5278F, 4.7158F, -2.4279F, -0.9333F, 2.3272F));

		PartDefinition cube_r65 = HairMain.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6255F, -4.5278F, 4.7158F, -2.7109F, -1.3586F, 2.5784F));

		PartDefinition cube_r66 = HairMain.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6255F, -4.5278F, 4.7158F, 1.2219F, -1.4731F, -1.3263F));

		PartDefinition cube_r67 = HairMain.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6908F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.084F, -5.9252F, 4.7264F, -3.0064F, -1.1271F, 2.8291F));

		PartDefinition cube_r68 = HairMain.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7815F, -4.7918F, 4.4078F, 2.0684F, -1.2767F, -2.2324F));

		PartDefinition cube_r69 = HairMain.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7815F, -4.7918F, 4.4078F, 1.4157F, -1.1263F, -1.5158F));

		PartDefinition cube_r70 = HairMain.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7935F, -3.7798F, 4.4078F, -0.5799F, -1.2478F, 0.3187F));

		PartDefinition cube_r71 = HairMain.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7935F, -3.7798F, 4.4078F, -1.4419F, -1.2098F, 1.2049F));

		PartDefinition cube_r72 = HairMain.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7935F, -3.7798F, 4.4078F, -1.8621F, -0.859F, 1.739F));

		PartDefinition cube_r73 = HairMain.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7935F, -3.7798F, 4.4078F, -0.5799F, 1.2478F, -0.3187F));

		PartDefinition cube_r74 = HairMain.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7935F, -3.7798F, 4.4078F, -1.4419F, 1.2098F, -1.2049F));

		PartDefinition cube_r75 = HairMain.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7935F, -3.7798F, 4.4078F, -1.8621F, 0.859F, -1.739F));

		PartDefinition cube_r76 = HairMain.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.7558F, -1.8646F, -1.7472F, 3.065F, 2.0909F, 2.0909F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8898F, -7.5408F, 4.7264F, -1.1959F, 1.0768F, -1.1356F));

		PartDefinition cube_r77 = HairMain.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.906F, -1.5013F, -1.4473F, 3.065F, 2.3285F, 2.3285F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8898F, -7.5408F, 4.7264F, -0.3826F, 1.0926F, -0.1765F));

		PartDefinition cube_r78 = HairMain.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5485F, -1.71F, -1.8446F, 3.659F, 2.6136F, 2.6136F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8898F, -7.5408F, 4.7264F, -0.0115F, 0.9028F, 0.2367F));

		PartDefinition cube_r79 = HairMain.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.364F, -1.914F, -1.21F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.334F, -5.28F, -0.88F, 0.2235F, 0.5018F, 0.4415F));

		PartDefinition cube_r80 = HairMain.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.608F, -2.068F, -1.276F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.334F, -5.28F, -0.88F, 0.0971F, 0.7551F, 0.2639F));

		PartDefinition cube_r81 = HairMain.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.781F, -0.44F, -0.506F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7946F, -7.2157F, 2.3366F, -0.291F, 1.0307F, -0.2864F));

		PartDefinition cube_r82 = HairMain.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -4.4838F, 1.7678F, 0.5228F, 0.6545F, 0.5568F));

		PartDefinition cube_r83 = HairMain.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -4.4838F, 1.7678F, 0.4436F, 0.9399F, 0.4763F));

		PartDefinition cube_r84 = HairMain.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -4.4838F, 1.7678F, -0.0481F, 1.3096F, -0.1099F));

		PartDefinition cube_r85 = HairMain.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5545F, 0.3672F, 5.0348F, -1.311F, -0.6154F, 0.6486F));

		PartDefinition cube_r86 = HairMain.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5545F, 0.3672F, 5.0348F, -1.487F, -0.4731F, 0.9457F));

		PartDefinition cube_r87 = HairMain.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5545F, 0.3672F, 5.0348F, -1.5452F, -0.1709F, 1.277F));

		PartDefinition cube_r88 = HairMain.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5545F, 0.3672F, 5.0348F, -1.311F, 0.6154F, -0.6486F));

		PartDefinition cube_r89 = HairMain.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5545F, 0.3672F, 5.0348F, -1.487F, 0.4731F, -0.9457F));

		PartDefinition cube_r90 = HairMain.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5545F, 0.3672F, 5.0348F, -1.5452F, 0.1709F, -1.277F));

		PartDefinition cube_r91 = HairMain.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7295F, -0.6328F, 5.0348F, -0.782F, 0.8233F, -0.2935F));

		PartDefinition cube_r92 = HairMain.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7295F, -0.6328F, 5.0348F, -1.1143F, 0.8067F, -0.7184F));

		PartDefinition cube_r93 = HairMain.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7295F, -0.6328F, 5.0348F, -1.3942F, 0.5939F, -1.2193F));

		PartDefinition cube_r94 = HairMain.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7295F, -0.6328F, 5.0348F, -0.782F, -0.8233F, 0.2935F));

		PartDefinition cube_r95 = HairMain.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7295F, -0.6328F, 5.0348F, -1.1143F, -0.8067F, 0.7184F));

		PartDefinition cube_r96 = HairMain.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7295F, -0.6328F, 5.0348F, -1.3942F, -0.5939F, 1.2193F));

		PartDefinition cube_r97 = HairMain.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9795F, -0.4578F, 2.5598F, -0.8757F, -0.5572F, 0.5663F));

		PartDefinition cube_r98 = HairMain.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9795F, -0.4578F, 2.5598F, -1.0687F, -0.4622F, 1.0538F));

		PartDefinition cube_r99 = HairMain.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9795F, -0.4578F, 2.5598F, -0.68F, -0.5237F, 0.2291F));

		PartDefinition cube_r100 = HairMain.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9795F, -0.4578F, 2.5598F, -0.8757F, 0.5572F, -0.5663F));

		PartDefinition cube_r101 = HairMain.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9795F, -0.4578F, 2.5598F, -1.0687F, 0.4622F, -1.0538F));

		PartDefinition cube_r102 = HairMain.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9795F, -0.4578F, 2.5598F, -0.68F, 0.5237F, -0.2291F));

		PartDefinition cube_r103 = HairMain.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.7648F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -2.3058F, 2.5598F, -0.4191F, 0.81F, -0.2538F));

		PartDefinition cube_r104 = HairMain.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4776F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -2.3058F, 2.5598F, -0.8613F, 0.863F, -0.9046F));

		PartDefinition cube_r105 = HairMain.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.5079F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9255F, -2.3058F, 2.5598F, -0.1812F, 0.6461F, 0.0696F));

		PartDefinition cube_r106 = HairMain.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -2.3058F, 2.5598F, -0.4191F, -0.81F, 0.2538F));

		PartDefinition cube_r107 = HairMain.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -2.3058F, 2.5598F, -0.8613F, -0.863F, 0.9046F));

		PartDefinition cube_r108 = HairMain.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -2.3058F, 2.5598F, -0.1812F, -0.6461F, -0.0696F));

		PartDefinition cube_r109 = HairMain.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.8959F, -1.5833F, -1.708F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -4.4838F, 1.7678F, 0.5228F, -0.6545F, -0.5568F));

		PartDefinition cube_r110 = HairMain.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0732F, -1.3901F, -1.3401F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -4.4838F, 1.7678F, 0.4436F, -0.9399F, -0.4763F));

		PartDefinition cube_r111 = HairMain.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.6396F, -1.7265F, -1.6178F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9255F, -4.4838F, 1.7678F, -0.0481F, -1.3096F, 0.1099F));

		PartDefinition cube_r112 = HairMain.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.057F, -0.44F, -0.506F, 2.838F, 1.936F, 1.936F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7946F, -7.2157F, 2.3366F, -0.291F, -1.0307F, 0.2864F));

		PartDefinition cube_r113 = HairMain.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.77F, -2.068F, -1.276F, 2.838F, 2.156F, 2.156F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.334F, -5.28F, -0.88F, 0.0971F, -0.7551F, -0.2639F));

		PartDefinition cube_r114 = HairMain.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.024F, -1.914F, -1.21F, 3.388F, 2.42F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.334F, -5.28F, -0.88F, 0.2235F, -0.5018F, -0.4415F));

		PartDefinition cube_r115 = HairMain.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.7351F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0001F, -8.0117F, 3.6211F, -0.8954F, -0.0784F, 0.9897F));

		PartDefinition cube_r116 = HairMain.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.099F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0001F, -8.0117F, 3.6211F, -1.2102F, -0.327F, 0.7786F));

		PartDefinition cube_r117 = HairMain.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.8985F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0001F, -8.0117F, 3.6211F, -0.6526F, 0.0477F, 1.0905F));

		PartDefinition cube_r118 = HairMain.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.851F, -1.8752F, -1.3439F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4783F, -9.747F, 2.0371F, -0.8434F, -0.0195F, 0.4548F));

		PartDefinition cube_r119 = HairMain.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.2094F, -3.2218F, -1.6257F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4783F, -9.747F, 2.0371F, -1.1704F, -0.2583F, 0.2348F));

		PartDefinition cube_r120 = HairMain.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0127F, 0.6565F, -1.7757F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4783F, -9.747F, 2.0371F, -0.5947F, 0.101F, 0.5625F));

		PartDefinition cube_r121 = HairMain.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.617F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8802F, -7.8885F, 3.2691F, -1.4285F, 0.4802F, 0.5659F));

		PartDefinition cube_r122 = HairMain.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.2889F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8802F, -7.8885F, 3.2691F, -1.1227F, 0.1923F, 0.4103F));

		PartDefinition cube_r123 = HairMain.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.5655F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8802F, -7.8885F, 3.2691F, -0.8867F, 0.0464F, 0.3405F));

		PartDefinition cube_r124 = HairMain.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.099F, -3.1868F, -1.618F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3762F, -8.1745F, 3.2691F, -1.4285F, -0.4802F, -0.5659F));

		PartDefinition cube_r125 = HairMain.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.7351F, -1.8766F, -1.3489F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3762F, -8.1745F, 3.2691F, -1.1227F, -0.1923F, -0.4103F));

		PartDefinition cube_r126 = HairMain.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.8985F, 0.6358F, -1.7757F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3762F, -8.1745F, 3.2691F, -0.8867F, -0.0464F, -0.3405F));

		PartDefinition cube_r127 = HairMain.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.2094F, -3.2218F, -1.6257F, 1.716F, 2.332F, 1.716F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3937F, -9.747F, 2.1031F, -1.0819F, -0.2418F, -0.6903F));

		PartDefinition cube_r128 = HairMain.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.851F, -1.8752F, -1.3439F, 2.024F, 3.124F, 2.024F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3937F, -9.747F, 2.1031F, -0.7562F, -0.0229F, -0.4502F));

		PartDefinition cube_r129 = HairMain.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(42, 0).addBox(-1.0127F, 0.6565F, -1.7757F, 2.464F, 3.124F, 2.464F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3937F, -9.747F, 2.1031F, -0.508F, 0.0877F, -0.3326F));

		PartDefinition Back = HairMain.addOrReplaceChild("Back", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 13.5625F));

		PartDefinition cube_r130 = Back.addOrReplaceChild("cube_r130",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.7256F, -4.1667F, -8.5035F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2097F, 9.01F, -10.0132F, -1.3688F, -0.1657F, -0.6158F));

		PartDefinition cube_r131 = Back.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.9203F, -2.9141F, -3.4549F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2097F, 9.01F, -10.0132F, -1.8283F, -0.2179F, -0.3137F));

		PartDefinition cube_r132 = Back.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.0641F, -4.141F, 1.0645F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2097F, 9.01F, -10.0132F, -2.342F, 0.0205F, -0.0629F));

		PartDefinition cube_r133 = Back.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.7256F, -4.1667F, -8.5035F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0847F, 10.935F, -7.3382F, -1.3688F, -0.1657F, -0.6158F));

		PartDefinition cube_r134 = Back.addOrReplaceChild("cube_r134",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.9203F, -2.9141F, -3.4549F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0847F, 10.935F, -7.3382F, -1.8283F, -0.2179F, -0.3137F));

		PartDefinition cube_r135 = Back.addOrReplaceChild("cube_r135",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.0641F, -4.141F, 1.0645F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0847F, 10.935F, -7.3382F, -2.342F, 0.0205F, -0.0629F));

		PartDefinition cube_r136 = Back.addOrReplaceChild("cube_r136",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.2744F, -4.1667F, -8.5035F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0597F, 10.935F, -7.3382F, -1.3688F, 0.1657F, -0.1783F));

		PartDefinition cube_r137 = Back.addOrReplaceChild("cube_r137",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.4797F, -2.9141F, -3.4549F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0597F, 10.935F, -7.3382F, -1.8283F, 0.2179F, -0.4804F));

		PartDefinition cube_r138 = Back.addOrReplaceChild("cube_r138",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.9641F, -4.141F, 1.0645F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0597F, 10.935F, -7.3382F, -2.342F, -0.0205F, -0.7312F));

		PartDefinition cube_r139 = Back.addOrReplaceChild("cube_r139",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4675F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3896F, 0.935F, -3.8382F, -0.6558F, 0.0002F, 0.2501F));

		PartDefinition cube_r140 = Back.addOrReplaceChild("cube_r140",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.673F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3896F, 0.935F, -3.8382F, -1.0796F, 0.2374F, 0.063F));

		PartDefinition cube_r141 = Back.addOrReplaceChild("cube_r141",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.1502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3896F, 0.935F, -3.8382F, -1.6501F, 0.2241F, -0.2909F));

		PartDefinition cube_r142 = Back.addOrReplaceChild("cube_r142",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4675F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1604F, 1.985F, -6.6382F, -1.0076F, 0.088F, 0.649F));

		PartDefinition cube_r143 = Back.addOrReplaceChild("cube_r143",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.673F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1604F, 1.985F, -6.6382F, -1.4526F, 0.2441F, 0.3876F));

		PartDefinition cube_r144 = Back.addOrReplaceChild("cube_r144",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.1502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1604F, 1.985F, -6.6382F, -1.9985F, 0.1089F, 0.0652F));

		PartDefinition cube_r145 = Back.addOrReplaceChild("cube_r145",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5325F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1604F, 1.985F, -6.6382F, -1.0076F, -0.088F, -0.649F));

		PartDefinition cube_r146 = Back.addOrReplaceChild("cube_r146",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.727F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1604F, 1.985F, -6.6382F, -1.4526F, -0.2441F, -0.3876F));

		PartDefinition cube_r147 = Back.addOrReplaceChild("cube_r147",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.2502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1604F, 1.985F, -6.6382F, -1.9985F, -0.1089F, -0.0652F));

		PartDefinition cube_r148 = Back.addOrReplaceChild("cube_r148",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5325F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5854F, 1.66F, -6.6382F, -0.5571F, 0.247F, -0.612F));

		PartDefinition cube_r149 = Back.addOrReplaceChild("cube_r149",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.727F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5854F, 1.66F, -6.6382F, -0.9398F, -0.0106F, -0.4546F));

		PartDefinition cube_r150 = Back.addOrReplaceChild("cube_r150",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.2502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5854F, 1.66F, -6.6382F, -1.4403F, -0.0579F, -0.1129F));

		PartDefinition cube_r151 = Back.addOrReplaceChild("cube_r151",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5325F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5604F, 1.66F, -5.9132F, -0.5571F, 0.247F, -0.4811F));

		PartDefinition cube_r152 = Back.addOrReplaceChild("cube_r152",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.727F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5604F, 1.66F, -5.9132F, -0.9398F, -0.0106F, -0.3237F));

		PartDefinition cube_r153 = Back.addOrReplaceChild("cube_r153",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.2502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5604F, 1.66F, -5.9132F, -1.4403F, -0.0579F, 0.018F));

		PartDefinition cube_r154 = Back.addOrReplaceChild("cube_r154",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.727F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4604F, 4.56F, -8.2132F, -1.1263F, -0.0725F, -0.3159F));

		PartDefinition cube_r155 = Back.addOrReplaceChild("cube_r155",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5325F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4604F, 4.56F, -8.2132F, -0.733F, 0.1528F, -0.5162F));

		PartDefinition cube_r156 = Back.addOrReplaceChild("cube_r156",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.2502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4604F, 4.56F, -8.2132F, -1.6369F, -0.0533F, 0.0289F));

		PartDefinition cube_r157 = Back.addOrReplaceChild("cube_r157",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.727F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0104F, 4.3626F, -9.8764F, -1.4628F, -0.1749F, -0.274F));

		PartDefinition cube_r158 = Back.addOrReplaceChild("cube_r158",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5325F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0104F, 4.3626F, -9.8764F, -1.0351F, -0.0238F, -0.5359F));

		PartDefinition cube_r159 = Back.addOrReplaceChild("cube_r159",
				CubeListBuilder.create().texOffs(42, 0).addBox(0.2502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0104F, 4.3626F, -9.8764F, -1.9861F, -0.0402F, 0.0454F));

		PartDefinition cube_r160 = Back.addOrReplaceChild("cube_r160",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.673F, -2.867F, -3.4659F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9854F, 4.3626F, -6.8264F, -1.2129F, 0.0207F, 0.5647F));

		PartDefinition cube_r161 = Back.addOrReplaceChild("cube_r161",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.4675F, -4.1275F, -8.4735F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9854F, 4.3626F, -6.8264F, -0.8298F, -0.1854F, 0.7854F));

		PartDefinition cube_r162 = Back.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.1502F, -4.0942F, 1.0108F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9854F, 4.3626F, -6.8264F, -1.701F, -0.0246F, 0.223F));

		PartDefinition cube_r163 = Back.addOrReplaceChild("cube_r163",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.2711F, -2.8731F, -3.4514F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1157F, 6.1568F, -9.0451F, -1.2461F, 0.0417F, 0.3019F));

		PartDefinition cube_r164 = Back.addOrReplaceChild("cube_r164",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.079F, -4.1275F, -8.5776F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1157F, 6.1568F, -9.0451F, -0.8579F, -0.1575F, 0.5284F));

		PartDefinition cube_r165 = Back.addOrReplaceChild("cube_r165",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.7753F, -4.1064F, 1.156F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1157F, 6.1568F, -9.0451F, -1.7393F, -0.0159F, -0.038F));

		PartDefinition cube_r166 = Back.addOrReplaceChild("cube_r166",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.25F, 0.35F, -4.1875F, 2.9F, 2.9F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6801F, 12.5345F, -1.1492F, -1.6913F, -0.014F, -0.3704F));

		PartDefinition cube_r167 = Back.addOrReplaceChild("cube_r167",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.85F, -2.775F, 1.7625F, 3.4F, 3.4F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2201F, -6.7341F, -1.2003F, 0.0274F, -0.0281F));

		PartDefinition cube_r168 = Back.addOrReplaceChild("cube_r168",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.175F, -2.0F, -3.5625F, 4.0F, 4.0F, 7.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2201F, -6.7341F, -0.8158F, -0.1816F, 0.1896F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-7.125F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-0.8125F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}