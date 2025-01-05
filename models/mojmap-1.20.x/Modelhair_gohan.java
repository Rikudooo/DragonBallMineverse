// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_gohan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_gohan"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_gohan(ModelPart root) {
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

		PartDefinition cube_r1 = Hair.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(51, 56).addBox(-0.1875F, -2.25F, 0.4375F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5827F, -29.6304F, 3.4728F, -0.7237F, -0.1706F, -0.0415F));

		PartDefinition cube_r2 = Hair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(51, 56).addBox(-0.1875F, -2.25F, 0.4375F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5827F, -29.5054F, 4.6603F, -0.7237F, -0.1706F, -0.0415F));

		PartDefinition cube_r3 = Hair.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(51, 56).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5248F, -26.5379F, 2.1311F, -2.9004F, -0.2929F, -3.0888F));

		PartDefinition cube_r4 = Hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(51, 56).addBox(-0.3611F, -3.422F, -0.3835F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1948F, -27.6783F, 3.7934F, -0.5361F, -0.0673F, 0.2309F));

		PartDefinition cube_r5 = Hair.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(51, 56).addBox(-0.4892F, -4.9037F, -1.7996F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9623F, -26.5379F, 2.1311F, -2.9004F, -0.2929F, -2.6525F));

		PartDefinition hair2 = Hair.addOrReplaceChild("hair2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hair2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(50, 56).addBox(-2.0F, 0.0625F, -1.0F, 4.0F, 2.0625F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -33.8125F, 3.0625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hair2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -0.0625F, 0.0312F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-3.0313F, -2.875F, -0.6563F, 3.0F, 4.5F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7813F, -36.1503F, 1.4363F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hair2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-2.125F, 0.1875F, -1.0F, 4.0F, 1.9375F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-3.8125F, -1.125F, -1.0F, 4.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8125F, -33.625F, 1.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hair2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-6.2188F, 3.375F, -0.4688F, 3.0F, 2.0625F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-3.2813F, 0.8125F, -0.4688F, 3.0F, 2.0625F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7813F, -36.3378F, 3.4988F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hair2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(50, 56).addBox(-2.0F, -1.125F, -1.0F, 4.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9375F, -33.625F, 3.0625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hair2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9063F, -36.1503F, 3.4988F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hair2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -30.4375F, 2.25F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hair2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7188F, -32.9628F, 2.6863F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hair2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3438F, -33.3378F, 2.6863F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hair2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3125F, -30.8125F, 2.25F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hair2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5938F, -33.9628F, 3.3113F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hair2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5625F, -31.4375F, 2.875F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hair2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(0.2813F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5938F, -35.3378F, 1.6238F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hair2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(0.4375F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5625F, -32.8125F, 1.1875F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hair2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8438F, -35.3378F, -0.3762F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hair2.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8125F, -32.8125F, -0.8125F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hair2.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0938F, -33.9003F, -1.0637F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hair2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.125F, -31.375F, -1.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hair2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9375F, -31.625F, -2.4375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hair2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9688F, -34.1503F, -2.0012F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hair2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9375F, -31.625F, 1.25F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hair2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9688F, -34.1503F, 1.6863F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hair2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.2611F, -0.311F, -1.1193F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2598F, -32.6031F, 3.6354F, -0.336F, 0.1617F, -0.3891F));

		PartDefinition cube_r29 = hair2.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.6578F, -2.9309F, -0.9567F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2598F, -32.6031F, 3.6354F, -0.5098F, 0.1177F, -0.3057F));

		PartDefinition cube_r30 = hair2.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.2611F, -0.311F, -1.1193F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0527F, -32.6031F, 3.4479F, -0.336F, 0.1617F, 0.5708F));

		PartDefinition cube_r31 = hair2.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.6578F, -2.9309F, -0.9567F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0527F, -32.6031F, 3.4479F, -0.5098F, 0.1177F, 0.6542F));

		PartDefinition cube_r32 = hair2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.2611F, -0.311F, -1.1193F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0527F, -32.3531F, 2.1979F, -0.336F, 0.1617F, 0.5708F));

		PartDefinition cube_r33 = hair2.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.6578F, -2.9309F, -0.9567F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0527F, -32.3531F, 2.1979F, -0.5098F, 0.1177F, 0.6542F));

		PartDefinition cube_r34 = hair2.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.375F, -1.625F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7334F, -31.1169F, -0.5286F, -0.1745F, 0.0563F, 0.3267F));

		PartDefinition cube_r35 = hair2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(50, 56).addBox(-0.6094F, -2.6758F, -3.7639F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7969F, -32.0777F, 2.5416F, -0.3578F, 0.0F, 0.4014F));

		PartDefinition cube_r36 = hair2.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3133F, -0.3717F, -1.692F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.393F, -31.9256F, -1.7525F, -0.1745F, 0.0563F, 0.7281F));

		PartDefinition cube_r37 = hair2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.7527F, -2.8812F, -1.525F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.393F, -31.9256F, -1.7525F, -0.3578F, 0.0F, 0.8029F));

		PartDefinition cube_r38 = hair2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(50, 56).addBox(-2.4219F, -3.5848F, 1.7013F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1094F, -31.8277F, 0.4166F, -0.3578F, 0.0F, 0.0175F));

		PartDefinition cube_r39 = hair2.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(50, 56).addBox(-2.2344F, -0.0831F, 1.6933F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1094F, -31.8277F, 0.4166F, -0.1833F, 0.0F, 0.0175F));

		PartDefinition cube_r40 = hair2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3125F, -30.3125F, 2.875F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hair2.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2813F, -32.8378F, 3.3113F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hair2.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.125F, -31.875F, 0.375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r43 = hair2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0938F, -34.4003F, 0.8113F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hair2.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(49, 55).addBox(-1.3125F, -1.125F, -1.75F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.125F, -32.375F, -2.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hair2.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0938F, -34.9003F, -2.0637F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hair2.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.125F, -30.5625F, -0.4375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hair2.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0938F, -33.0878F, -0.0012F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r48 = hair2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-4.0938F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0938F, -33.9003F, -2.1262F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hair2.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(49, 55)
						.addBox(-1.3125F, -1.125F, -1.75F, 3.0F, 3.25F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-3.9375F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.125F, -31.375F, -2.5625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hair2.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(50, 56)
						.addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-3.9375F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5625F, -28.625F, 2.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r51 = hair2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(50, 56)
				.addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
				.addBox(-4.0938F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5313F, -31.1503F, 2.9363F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r52 = hair2.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7188F, -33.2128F, -2.0012F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r53 = hair2.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -30.6875F, -2.4375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r54 = hair2.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1875F, -27.9375F, 2.625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r55 = hair2.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.875F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1563F, -30.4628F, 3.0613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r56 = hair2.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4688F, -33.9003F, -0.8762F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r57 = hair2.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -31.375F, -1.3125F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r58 = hair2.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0625F, -32.75F, 3.125F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r59 = hair2.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0938F, -35.2753F, 3.5613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r60 = hair2.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8438F, -33.5253F, -0.8762F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r61 = hair2.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8125F, -31.0F, -1.3125F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r62 = hair2.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -2.3125F, -1.3125F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.375F, -34.8125F, 3.75F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r63 = hair2.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -1.0938F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4063F, -37.3378F, 4.1863F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r64 = hair2.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8438F, -35.4003F, -2.0012F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r65 = hair2.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(49, 55).addBox(-1.3125F, -0.925F, -1.75F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8125F, -32.875F, -2.4375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r66 = hair2.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.375F, -30.125F, 2.625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r67 = hair2.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4063F, -32.6503F, 3.0613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r68 = hair2.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8438F, -34.7128F, -2.0012F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r69 = hair2.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8125F, -32.1875F, -2.4375F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r70 = hair2.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(50, 56).addBox(-0.75F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.375F, -29.4375F, 2.625F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r71 = hair2.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4063F, -31.9628F, 3.0613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r72 = hair2.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.375F, -30.25F, 0.3125F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r73 = hair2.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4063F, -32.7753F, 0.7488F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r74 = hair2.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.375F, -30.75F, 1.6875F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r75 = hair2.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4063F, -33.2753F, 2.1238F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r76 = hair2.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3281F, -0.11F, -1.0767F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0469F, -31.7965F, 1.1979F, -0.3209F, -0.0759F, -0.3787F));

		PartDefinition cube_r77 = hair2.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.5156F, -3.1303F, -1.0313F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0469F, -31.7965F, 1.1979F, -0.4954F, -0.0759F, -0.3787F));

		PartDefinition cube_r78 = hair2.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(49, 55).addBox(-1.3281F, -0.11F, -2.0767F, 3.0F, 3.25F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0469F, -31.7965F, -2.0521F, -0.3209F, -0.0759F, -0.3787F));

		PartDefinition cube_r79 = hair2.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.5156F, -3.1303F, -1.0313F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0469F, -31.7965F, -2.0521F, -0.4954F, -0.0759F, -0.3787F));

		PartDefinition cube_r80 = hair2.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3281F, -0.11F, -1.0767F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3594F, -32.734F, -0.6146F, -0.3209F, -0.0759F, -0.3787F));

		PartDefinition cube_r81 = hair2.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.5156F, -3.1303F, -1.0313F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3594F, -32.734F, -0.6146F, -0.4954F, -0.0759F, -0.3787F));

		PartDefinition cube_r82 = hair2.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.3125F, -1.125F, -1.0F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3125F, -32.125F, -0.875F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r83 = hair2.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(50, 56).addBox(-1.4688F, -1.625F, -0.6563F, 3.0F, 3.25F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3438F, -34.6503F, -0.4387F, -0.3578F, 0.0F, 0.0F));

		PartDefinition bang = Hair.addOrReplaceChild("bang", CubeListBuilder.create(),
				PartPose.offset(-0.9375F, 0.5F, -8.4375F));

		PartDefinition cube_r84 = bang.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -0.3125F, -1.2187F, 1.0F, 1.25F, 2.4375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9907F, -29.0403F, 1.3258F, 0.8727F, 0.384F, 0.0F));

		PartDefinition cube_r85 = bang.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -0.4375F, -2.0313F, 1.0F, 1.25F, 2.4375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2218F, -30.25F, 3.2288F, 0.4538F, 0.384F, 0.0F));

		PartDefinition cube_r86 = bang.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(56, 60).addBox(-1.2188F, 0.3125F, -1.2188F, 1.4375F, 1.25F, 2.4375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2813F, -31.1875F, 4.2813F, 0.0F, 0.384F, 0.0F));

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