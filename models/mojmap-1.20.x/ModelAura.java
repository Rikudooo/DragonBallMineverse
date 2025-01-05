// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAura<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "aura"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Bottom;
	private final ModelPart Floor;
	private final ModelPart BottomMid;
	private final ModelPart TopMid;
	private final ModelPart Top;
	private final ModelPart Tip;
	private final ModelPart Flat;

	public ModelAura(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Bottom = root.getChild("Bottom");
		this.Floor = root.getChild("Floor");
		this.BottomMid = root.getChild("BottomMid");
		this.TopMid = root.getChild("TopMid");
		this.Top = root.getChild("Top");
		this.Tip = root.getChild("Tip");
		this.Flat = root.getChild("Flat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition Bottom = partdefinition.addOrReplaceChild("Bottom", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone_r1 = Bottom
				.addOrReplaceChild("bone_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone_r2 = Bottom.addOrReplaceChild("bone_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition bone_r3 = Bottom.addOrReplaceChild("bone_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.618F, 0.0F, 3.1416F));

		PartDefinition bone_r4 = Bottom.addOrReplaceChild("bone_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.5236F));

		PartDefinition bone_r5 = Bottom.addOrReplaceChild("bone_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition bone_r6 = Bottom.addOrReplaceChild("bone_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.4435F, -0.7854F, 3.1416F));

		PartDefinition bone_r7 = Bottom.addOrReplaceChild("bone_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.4435F, 0.7854F, 3.1416F));

		PartDefinition bone_r8 = Bottom.addOrReplaceChild("bone_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.6981F, 0.7854F, 0.0F));

		PartDefinition Floor = partdefinition.addOrReplaceChild("Floor", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 34.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone = Floor.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r9 = bone
				.addOrReplaceChild("bone_r9",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone_r10 = bone.addOrReplaceChild("bone_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition bone_r11 = bone.addOrReplaceChild("bone_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.618F, 0.0F, 3.1416F));

		PartDefinition bone_r12 = bone.addOrReplaceChild("bone_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.5236F));

		PartDefinition bone_r13 = bone.addOrReplaceChild("bone_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition bone_r14 = bone.addOrReplaceChild("bone_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.4435F, -0.7854F, 3.1416F));

		PartDefinition bone_r15 = bone.addOrReplaceChild("bone_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.4435F, 0.7854F, 3.1416F));

		PartDefinition bone_r16 = bone.addOrReplaceChild("bone_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.6981F, 0.7854F, 0.0F));

		PartDefinition bone3 = Floor.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r25 = bone3
				.addOrReplaceChild("bone_r25",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone_r26 = bone3.addOrReplaceChild("bone_r26",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition bone_r27 = bone3.addOrReplaceChild("bone_r27",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.618F, 0.0F, 3.1416F));

		PartDefinition bone_r28 = bone3.addOrReplaceChild("bone_r28",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.5236F));

		PartDefinition bone_r29 = bone3.addOrReplaceChild("bone_r29",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition bone_r30 = bone3.addOrReplaceChild("bone_r30",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.4435F, -0.7854F, 3.1416F));

		PartDefinition bone_r31 = bone3.addOrReplaceChild("bone_r31",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.4435F, 0.7854F, 3.1416F));

		PartDefinition bone_r32 = bone3.addOrReplaceChild("bone_r32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.6981F, 0.7854F, 0.0F));

		PartDefinition bone2 = Floor.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone_r17 = bone2
				.addOrReplaceChild("bone_r17",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone_r18 = bone2.addOrReplaceChild("bone_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition bone_r19 = bone2.addOrReplaceChild("bone_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.618F, 0.0F, 3.1416F));

		PartDefinition bone_r20 = bone2.addOrReplaceChild("bone_r20",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.5236F));

		PartDefinition bone_r21 = bone2.addOrReplaceChild("bone_r21",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition bone_r22 = bone2.addOrReplaceChild("bone_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.4435F, -0.7854F, 3.1416F));

		PartDefinition bone_r23 = bone2.addOrReplaceChild("bone_r23",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.4435F, 0.7854F, 3.1416F));

		PartDefinition bone_r24 = bone2.addOrReplaceChild("bone_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.6981F, 0.7854F, 0.0F));

		PartDefinition BottomMid = partdefinition.addOrReplaceChild("BottomMid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone2_r1 = BottomMid
				.addOrReplaceChild("bone2_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone2_r2 = BottomMid.addOrReplaceChild("bone2_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.3491F));

		PartDefinition bone2_r3 = BottomMid.addOrReplaceChild("bone2_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.7925F, 0.0F, 3.1416F));

		PartDefinition bone2_r4 = BottomMid.addOrReplaceChild("bone2_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition bone2_r5 = BottomMid.addOrReplaceChild("bone2_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.5236F, -0.7854F, 0.0F));

		PartDefinition bone2_r6 = BottomMid.addOrReplaceChild("bone2_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.618F, -0.7854F, 3.1416F));

		PartDefinition bone2_r7 = BottomMid.addOrReplaceChild("bone2_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.618F, 0.7854F, 3.1416F));

		PartDefinition bone2_r8 = BottomMid.addOrReplaceChild("bone2_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.5236F, 0.7854F, 0.0F));

		PartDefinition TopMid = partdefinition.addOrReplaceChild("TopMid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition bone3_r1 = TopMid
				.addOrReplaceChild("bone3_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone3_r2 = TopMid.addOrReplaceChild("bone3_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.1745F));

		PartDefinition bone3_r3 = TopMid.addOrReplaceChild("bone3_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -2.9671F, 0.0F, 3.1416F));

		PartDefinition bone3_r4 = TopMid.addOrReplaceChild("bone3_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.1745F));

		PartDefinition bone3_r5 = TopMid.addOrReplaceChild("bone3_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.3491F, -0.7854F, 0.0F));

		PartDefinition bone3_r6 = TopMid.addOrReplaceChild("bone3_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.7925F, -0.7854F, 3.1416F));

		PartDefinition bone3_r7 = TopMid.addOrReplaceChild("bone3_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.7925F, 0.7854F, 3.1416F));

		PartDefinition bone3_r8 = TopMid.addOrReplaceChild("bone3_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.3491F, 0.7854F, 0.0F));

		PartDefinition Top = partdefinition.addOrReplaceChild("Top",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, -8.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, -1.0472F, -3.1416F));

		PartDefinition bone4_r1 = Top
				.addOrReplaceChild("bone4_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone4_r2 = Top.addOrReplaceChild("bone4_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition bone4_r3 = Top
				.addOrReplaceChild("bone4_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4_r4 = Top.addOrReplaceChild("bone4_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition bone4_r5 = Top.addOrReplaceChild("bone4_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.9671F, -0.7854F, 3.1416F));

		PartDefinition bone4_r6 = Top.addOrReplaceChild("bone4_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.9671F, 0.7854F, 3.1416F));

		PartDefinition bone4_r7 = Top.addOrReplaceChild("bone4_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.5971F, -0.7116F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.1745F, 0.7854F, 0.0F));

		PartDefinition Tip = partdefinition.addOrReplaceChild("Tip", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -7.0F, 0.0F, 3.1416F, -1.0472F, -3.1416F));

		PartDefinition bone5_r1 = Tip.addOrReplaceChild("bone5_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r8 = Tip.addOrReplaceChild("bone4_r8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone4_r2_r1 = bone4_r8
				.addOrReplaceChild("bone4_r2_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r9 = Tip.addOrReplaceChild("bone4_r9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition bone4_r3_r1 = bone4_r9
				.addOrReplaceChild("bone4_r3_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r10 = Tip.addOrReplaceChild("bone4_r10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4_r4_r1 = bone4_r10
				.addOrReplaceChild("bone4_r4_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r11 = Tip.addOrReplaceChild("bone4_r11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition bone5_r5_r1 = bone4_r11.addOrReplaceChild("bone5_r5_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5971F, -0.7116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r12 = Tip.addOrReplaceChild("bone4_r12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, -2.9671F, -0.7854F, 3.1416F));

		PartDefinition bone4_r6_r1 = bone4_r12.addOrReplaceChild("bone4_r6_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5971F, -0.7116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r13 = Tip.addOrReplaceChild("bone4_r13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 5.0F, -2.9671F, 0.7854F, 3.1416F));

		PartDefinition bone4_r7_r1 = bone4_r13.addOrReplaceChild("bone4_r7_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5971F, -0.7116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone4_r14 = Tip.addOrReplaceChild("bone4_r14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -5.0F, 0.1745F, 0.7854F, 0.0F));

		PartDefinition bone4_r8_r1 = bone4_r14.addOrReplaceChild("bone4_r8_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -30.0F, 0.0F, 24.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5971F, -0.7116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Flat = partdefinition.addOrReplaceChild("Flat", CubeListBuilder.create(),
				PartPose.offset(1.0F, -7.0F, 0.0F));

		PartDefinition Flat_r1 = Flat.addOrReplaceChild("Flat_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-20.0F, -12.5F, 0.0F, 24.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 31.0F, 8.0F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition Flat_r2 = Flat.addOrReplaceChild("Flat_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.5F, 0.0F, 24.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 31.0F, 8.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Flat_r3 = Flat.addOrReplaceChild("Flat_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -4.5F, 0.0F, 24.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 31.0F, 8.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Flat_r4 = Flat.addOrReplaceChild("Flat_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -4.5F, 0.0F, 24.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 31.0F, -8.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
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
		Bottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Floor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BottomMid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TopMid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tip.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Flat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Floor.yRot = ageInTicks;
		this.BottomMid.yRot = ageInTicks;
		this.TopMid.yRot = ageInTicks;
		this.Top.yRot = ageInTicks;
		this.Flat.yRot = ageInTicks;
		this.Tip.yRot = ageInTicks;
	}
}