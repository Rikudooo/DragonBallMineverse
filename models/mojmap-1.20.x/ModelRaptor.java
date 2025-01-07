// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRaptor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raptor"), "main");
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart Body;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart LeftShoulder;
	private final ModelPart RightShoulder;
	private final ModelPart BodyBack;
	private final ModelPart TailBase;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart TipFeathers3;
	private final ModelPart TipFeathers6;
	private final ModelPart TipFeathers2;
	private final ModelPart TipFeathers5;
	private final ModelPart TipFeathers1;
	private final ModelPart TipFeathers4;
	private final ModelPart TailFeathers11;
	private final ModelPart TailFeathers12;
	private final ModelPart TailFeathers9;
	private final ModelPart TailFeathers10;
	private final ModelPart TailFeathers7;
	private final ModelPart TailFeathers8;
	private final ModelPart TailFeathers6;
	private final ModelPart TailFeathers5;
	private final ModelPart TailFeathers4;
	private final ModelPart TailFeathers3;
	private final ModelPart TailFeathers1;
	private final ModelPart TailFeathers2;
	private final ModelPart left_arm;
	private final ModelPart LeftArm1;
	private final ModelPart LeftArm2;
	private final ModelPart LeftArm3;
	private final ModelPart LeftHand1;
	private final ModelPart LeftFinger1;
	private final ModelPart LeftFinger4;
	private final ModelPart LeftFinger2;
	private final ModelPart LeftFinger5;
	private final ModelPart LeftFinger3;
	private final ModelPart LeftFinger6;
	private final ModelPart LeftHandItem;
	private final ModelPart ArmFeathers3;
	private final ModelPart ArmFeathers2;
	private final ModelPart ArmFeathers1;
	private final ModelPart LeftShoulder1;
	private final ModelPart right_arm;
	private final ModelPart RightArm1;
	private final ModelPart RightArm2;
	private final ModelPart RightArm3;
	private final ModelPart RightHand1;
	private final ModelPart RightFinger1;
	private final ModelPart RightFinger4;
	private final ModelPart RightFinger2;
	private final ModelPart RightFinger5;
	private final ModelPart RightFinger3;
	private final ModelPart RightFinger6;
	private final ModelPart ArmFeathers8;
	private final ModelPart RightHandItem;
	private final ModelPart ArmFeathers7;
	private final ModelPart RightShoulder1;
	private final ModelPart left_leg;
	private final ModelPart LeftLeg1;
	private final ModelPart LeftLeg2;
	private final ModelPart LeftLeg3;
	private final ModelPart LeftFootBase;
	private final ModelPart LeftFoot1;
	private final ModelPart Claw2;
	private final ModelPart LeftFoot2;
	private final ModelPart Claw3;
	private final ModelPart LeftFoot3;
	private final ModelPart LeftFoot4;
	private final ModelPart Claw1;
	private final ModelPart BackClaw1;
	private final ModelPart right_leg;
	private final ModelPart RightLeg1;
	private final ModelPart RightLeg2;
	private final ModelPart RightLeg3;
	private final ModelPart RightFootBase;
	private final ModelPart RightFoot1;
	private final ModelPart Claw5;
	private final ModelPart RightFoot2;
	private final ModelPart Claw6;
	private final ModelPart RightFoot3;
	private final ModelPart RightFoot4;
	private final ModelPart Claw4;
	private final ModelPart BackClaw2;

	public ModelRaptor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.Body = root.getChild("Body");
		this.Neck1 = this.Body.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.LeftShoulder = this.Body.getChild("LeftShoulder");
		this.RightShoulder = this.Body.getChild("RightShoulder");
		this.BodyBack = this.Body.getChild("BodyBack");
		this.TailBase = this.BodyBack.getChild("TailBase");
		this.Tail1 = this.TailBase.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.TipFeathers3 = this.Tail7.getChild("TipFeathers3");
		this.TipFeathers6 = this.Tail7.getChild("TipFeathers6");
		this.TipFeathers2 = this.Tail6.getChild("TipFeathers2");
		this.TipFeathers5 = this.Tail6.getChild("TipFeathers5");
		this.TipFeathers1 = this.Tail5.getChild("TipFeathers1");
		this.TipFeathers4 = this.Tail5.getChild("TipFeathers4");
		this.TailFeathers11 = this.Tail5.getChild("TailFeathers11");
		this.TailFeathers12 = this.Tail5.getChild("TailFeathers12");
		this.TailFeathers9 = this.Tail4.getChild("TailFeathers9");
		this.TailFeathers10 = this.Tail4.getChild("TailFeathers10");
		this.TailFeathers7 = this.Tail3.getChild("TailFeathers7");
		this.TailFeathers8 = this.Tail3.getChild("TailFeathers8");
		this.TailFeathers6 = this.Tail2.getChild("TailFeathers6");
		this.TailFeathers5 = this.Tail2.getChild("TailFeathers5");
		this.TailFeathers4 = this.Tail1.getChild("TailFeathers4");
		this.TailFeathers3 = this.Tail1.getChild("TailFeathers3");
		this.TailFeathers1 = this.TailBase.getChild("TailFeathers1");
		this.TailFeathers2 = this.TailBase.getChild("TailFeathers2");
		this.left_arm = root.getChild("left_arm");
		this.LeftArm1 = this.left_arm.getChild("LeftArm1");
		this.LeftArm2 = this.LeftArm1.getChild("LeftArm2");
		this.LeftArm3 = this.LeftArm2.getChild("LeftArm3");
		this.LeftHand1 = this.LeftArm3.getChild("LeftHand1");
		this.LeftFinger1 = this.LeftHand1.getChild("LeftFinger1");
		this.LeftFinger4 = this.LeftFinger1.getChild("LeftFinger4");
		this.LeftFinger2 = this.LeftHand1.getChild("LeftFinger2");
		this.LeftFinger5 = this.LeftFinger2.getChild("LeftFinger5");
		this.LeftFinger3 = this.LeftHand1.getChild("LeftFinger3");
		this.LeftFinger6 = this.LeftFinger3.getChild("LeftFinger6");
		this.LeftHandItem = this.LeftHand1.getChild("LeftHandItem");
		this.ArmFeathers3 = this.LeftArm3.getChild("ArmFeathers3");
		this.ArmFeathers2 = this.LeftArm2.getChild("ArmFeathers2");
		this.ArmFeathers1 = this.LeftArm1.getChild("ArmFeathers1");
		this.LeftShoulder1 = this.LeftArm1.getChild("LeftShoulder1");
		this.right_arm = root.getChild("right_arm");
		this.RightArm1 = this.right_arm.getChild("RightArm1");
		this.RightArm2 = this.RightArm1.getChild("RightArm2");
		this.RightArm3 = this.RightArm2.getChild("RightArm3");
		this.RightHand1 = this.RightArm3.getChild("RightHand1");
		this.RightFinger1 = this.RightHand1.getChild("RightFinger1");
		this.RightFinger4 = this.RightFinger1.getChild("RightFinger4");
		this.RightFinger2 = this.RightHand1.getChild("RightFinger2");
		this.RightFinger5 = this.RightFinger2.getChild("RightFinger5");
		this.RightFinger3 = this.RightHand1.getChild("RightFinger3");
		this.RightFinger6 = this.RightFinger3.getChild("RightFinger6");
		this.ArmFeathers8 = this.RightHand1.getChild("ArmFeathers8");
		this.RightHandItem = this.RightHand1.getChild("RightHandItem");
		this.ArmFeathers7 = this.RightArm3.getChild("ArmFeathers7");
		this.RightShoulder1 = this.RightArm1.getChild("RightShoulder1");
		this.left_leg = root.getChild("left_leg");
		this.LeftLeg1 = this.left_leg.getChild("LeftLeg1");
		this.LeftLeg2 = this.LeftLeg1.getChild("LeftLeg2");
		this.LeftLeg3 = this.LeftLeg2.getChild("LeftLeg3");
		this.LeftFootBase = this.LeftLeg3.getChild("LeftFootBase");
		this.LeftFoot1 = this.LeftFootBase.getChild("LeftFoot1");
		this.Claw2 = this.LeftFoot1.getChild("Claw2");
		this.LeftFoot2 = this.LeftFootBase.getChild("LeftFoot2");
		this.Claw3 = this.LeftFoot2.getChild("Claw3");
		this.LeftFoot3 = this.LeftFootBase.getChild("LeftFoot3");
		this.LeftFoot4 = this.LeftFootBase.getChild("LeftFoot4");
		this.Claw1 = this.LeftFoot4.getChild("Claw1");
		this.BackClaw1 = this.LeftLeg3.getChild("BackClaw1");
		this.right_leg = root.getChild("right_leg");
		this.RightLeg1 = this.right_leg.getChild("RightLeg1");
		this.RightLeg2 = this.RightLeg1.getChild("RightLeg2");
		this.RightLeg3 = this.RightLeg2.getChild("RightLeg3");
		this.RightFootBase = this.RightLeg3.getChild("RightFootBase");
		this.RightFoot1 = this.RightFootBase.getChild("RightFoot1");
		this.Claw5 = this.RightFoot1.getChild("Claw5");
		this.RightFoot2 = this.RightFootBase.getChild("RightFoot2");
		this.Claw6 = this.RightFoot2.getChild("Claw6");
		this.RightFoot3 = this.RightFootBase.getChild("RightFoot3");
		this.RightFoot4 = this.RightFootBase.getChild("RightFoot4");
		this.Claw4 = this.RightFoot4.getChild("Claw4");
		this.BackClaw2 = this.RightLeg3.getChild("BackClaw2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2826F, -16.8692F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 45)
						.addBox(-1.0F, -19.8F, -0.5F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-3.0F, -19.8F, -3.6F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 75)
						.addBox(-2.0F, -17.8F, -5.8F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 75)
						.addBox(-3.0F, -11.8F, -5.8F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.4F, -5.8F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3F, 0.72F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.7341F, -3.8181F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, -2).addBox(0.0F, -1.8F, -2.4F, 0.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.239F, 0.8706F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(76, 58).addBox(0.0F, -3.0F, -4.0F, 0.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.3125F, 1.6338F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -8.6F, 2.2F, 0.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.4341F, 3.5381F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, -2).addBox(0.0F, -3.0F, -3.2F, 0.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.7659F, -0.0619F, 1.2741F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(88, 107).addBox(-5.0F, 0.0F, -10.0F, 10.0F, 11.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck1 = Body.addOrReplaceChild("Neck1",
				CubeListBuilder.create().texOffs(6, 110).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 6.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 5.4105F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1
				.addOrReplaceChild("Neck2",
						CubeListBuilder.create().texOffs(30, 28).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2
				.addOrReplaceChild("Neck3",
						CubeListBuilder.create().texOffs(1, 22).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LeftShoulder = Body.addOrReplaceChild("LeftShoulder", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition RightShoulder = Body.addOrReplaceChild("RightShoulder", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition BodyBack = Body
				.addOrReplaceChild("BodyBack",
						CubeListBuilder.create().texOffs(0, 73).addBox(-6.0F, 0.0F, -5.0F, 12.0F, 12.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.4F, 5.0F, 6.1959F, 0.0F, 0.0F));

		PartDefinition TailBase = BodyBack.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(92, 0).addBox(
				-5.0F, 0.0F, 0.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition Tail1 = TailBase
				.addOrReplaceChild("Tail1",
						CubeListBuilder.create().texOffs(96, 22).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1
				.addOrReplaceChild("Tail2",
						CubeListBuilder.create().texOffs(96, 40).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2
				.addOrReplaceChild("Tail3",
						CubeListBuilder.create().texOffs(98, 58).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3
				.addOrReplaceChild("Tail4",
						CubeListBuilder.create().texOffs(102, 75).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4
				.addOrReplaceChild("Tail5",
						CubeListBuilder.create().texOffs(36, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5
				.addOrReplaceChild("Tail6",
						CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6
				.addOrReplaceChild("Tail7",
						CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition TipFeathers3 = Tail7.addOrReplaceChild("TipFeathers3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition TipFeathers6 = Tail7.addOrReplaceChild("TipFeathers6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 5.9341F));

		PartDefinition TipFeathers2 = Tail6.addOrReplaceChild("TipFeathers2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition TipFeathers5 = Tail6.addOrReplaceChild("TipFeathers5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.5F, 0.0F, 0.0F, 5.9341F));

		PartDefinition TipFeathers1 = Tail5.addOrReplaceChild("TipFeathers1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 1.3F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition TipFeathers4 = Tail5.addOrReplaceChild("TipFeathers4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 1.3F, 0.0F, 0.0F, 0.0F, 5.9341F));

		PartDefinition TailFeathers11 = Tail5.addOrReplaceChild("TailFeathers11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9F, 4.0F, 0.0F, 0.0F, 6.1959F, 0.0F));

		PartDefinition TailFeathers12 = Tail5.addOrReplaceChild("TailFeathers12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 4.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TailFeathers9 = Tail4.addOrReplaceChild("TailFeathers9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.6F, 5.0F, 0.0F, 0.0F, 6.1959F, 0.0F));

		PartDefinition TailFeathers10 = Tail4.addOrReplaceChild("TailFeathers10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.7F, 5.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TailFeathers7 = Tail3.addOrReplaceChild("TailFeathers7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.4F, 6.0F, 0.0F, 0.0F, 6.1959F, 0.0F));

		PartDefinition TailFeathers8 = Tail3.addOrReplaceChild("TailFeathers8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.4F, 6.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TailFeathers6 = Tail2.addOrReplaceChild("TailFeathers6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.1F, 7.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TailFeathers5 = Tail2.addOrReplaceChild("TailFeathers5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.1F, 7.0F, 0.0F, 0.0F, 6.1959F, 0.0F));

		PartDefinition TailFeathers4 = Tail1.addOrReplaceChild("TailFeathers4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.9F, 8.0F, 0.0F, 0.0F, 0.1222F, 0.0F));

		PartDefinition TailFeathers3 = Tail1.addOrReplaceChild("TailFeathers3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.9F, 8.0F, 0.0F, 0.0F, 6.161F, 0.0F));

		PartDefinition TailFeathers1 = TailBase.addOrReplaceChild("TailFeathers1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.4F, 9.0F, 0.0F, 0.0F, 6.1959F, 0.0F));

		PartDefinition TailFeathers2 = TailBase.addOrReplaceChild("TailFeathers2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.4F, 9.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(5.1F, 6.0F, -3.0F));

		PartDefinition LeftArm1 = left_arm
				.addOrReplaceChild("LeftArm1",
						CubeListBuilder.create().texOffs(4, 28).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -1.0F, 1.0F, 6.1087F, 0.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm1.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(29, 75).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.36F, -0.38F, 5.7596F, 0.0F, 0.0F));

		PartDefinition LeftArm3 = LeftArm2
				.addOrReplaceChild("LeftArm3",
						CubeListBuilder.create().texOffs(47, 60).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, 0.1F, 5.7596F, 0.0F, 0.0F));

		PartDefinition LeftHand1 = LeftArm3
				.addOrReplaceChild("LeftHand1",
						CubeListBuilder.create().texOffs(29, 75).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftFinger1 = LeftHand1.addOrReplaceChild("LeftFinger1",
				CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 0.1745F));

		PartDefinition LeftFinger4 = LeftFinger1
				.addOrReplaceChild("LeftFinger4",
						CubeListBuilder.create().texOffs(78, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftFinger2 = LeftHand1
				.addOrReplaceChild("LeftFinger2",
						CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 0.0F));

		PartDefinition LeftFinger5 = LeftFinger2
				.addOrReplaceChild("LeftFinger5",
						CubeListBuilder.create().texOffs(78, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftFinger3 = LeftHand1.addOrReplaceChild("LeftFinger3",
				CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 6.1087F));

		PartDefinition LeftFinger6 = LeftFinger3
				.addOrReplaceChild("LeftFinger6",
						CubeListBuilder.create().texOffs(78, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftHandItem = LeftHand1.addOrReplaceChild("LeftHandItem", CubeListBuilder.create()
				.texOffs(4, 28).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -6.0F, 1.0F));

		PartDefinition ArmFeathers3 = LeftArm3.addOrReplaceChild("ArmFeathers3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition ArmFeathers2 = LeftArm2.addOrReplaceChild("ArmFeathers2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition ArmFeathers1 = LeftArm1.addOrReplaceChild("ArmFeathers1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition LeftShoulder1 = LeftArm1.addOrReplaceChild("LeftShoulder1",
				CubeListBuilder.create().texOffs(4, 28).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.54F, -1.14F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.1F, 6.0F, -3.0F));

		PartDefinition RightArm1 = right_arm.addOrReplaceChild("RightArm1",
				CubeListBuilder.create().texOffs(6, 27).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 1.0F, 6.1087F, 0.0F, 0.0F));

		PartDefinition RightArm2 = RightArm1.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(29, 75).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.36F, -0.38F, 5.7596F, 0.0F, 0.0F));

		PartDefinition RightArm3 = RightArm2
				.addOrReplaceChild("RightArm3",
						CubeListBuilder.create().texOffs(52, 59).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, 0.1F, 5.7596F, 0.0F, 0.0F));

		PartDefinition RightHand1 = RightArm3
				.addOrReplaceChild("RightHand1",
						CubeListBuilder.create().texOffs(29, 75).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition RightFinger1 = RightHand1.addOrReplaceChild("RightFinger1",
				CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 0.1745F));

		PartDefinition RightFinger4 = RightFinger1
				.addOrReplaceChild("RightFinger4",
						CubeListBuilder.create().texOffs(80, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition RightFinger2 = RightHand1
				.addOrReplaceChild("RightFinger2",
						CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 0.0F));

		PartDefinition RightFinger5 = RightFinger2
				.addOrReplaceChild("RightFinger5",
						CubeListBuilder.create().texOffs(80, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition RightFinger3 = RightHand1.addOrReplaceChild("RightFinger3",
				CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3F, -1.7F, 5.7596F, 0.0F, 6.1087F));

		PartDefinition RightFinger6 = RightFinger3
				.addOrReplaceChild("RightFinger6",
						CubeListBuilder.create().texOffs(80, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ArmFeathers8 = RightHand1.addOrReplaceChild("ArmFeathers8", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition RightHandItem = RightHand1.addOrReplaceChild("RightHandItem", CubeListBuilder.create()
				.texOffs(6, 27).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, -6.0F, 1.0F));

		PartDefinition ArmFeathers7 = RightArm3.addOrReplaceChild("ArmFeathers7", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition RightShoulder1 = RightArm1.addOrReplaceChild("RightShoulder1",
				CubeListBuilder.create().texOffs(6, 27).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.52F, -1.14F, 0.0F, 0.0F, 0.0F, 5.4105F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(3.9F, 4.0F, 9.0F));

		PartDefinition LeftLeg1 = left_leg.addOrReplaceChild("LeftLeg1",
				CubeListBuilder.create().texOffs(3, 27).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 5.7596F, 6.1087F, 0.0F));

		PartDefinition LeftLeg2 = LeftLeg1
				.addOrReplaceChild("LeftLeg2",
						CubeListBuilder.create().texOffs(44, 56).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 10.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.1F, -1.9F, 1.2217F, 0.0F, 0.0F));

		PartDefinition LeftLeg3 = LeftLeg2
				.addOrReplaceChild("LeftLeg3",
						CubeListBuilder.create().texOffs(44, 56).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 11.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 3.0F, 5.0615F, 0.0F, 0.0F));

		PartDefinition LeftFootBase = LeftLeg3
				.addOrReplaceChild("LeftFootBase",
						CubeListBuilder.create().texOffs(3, 27).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition LeftFoot1 = LeftFootBase.addOrReplaceChild("LeftFoot1", CubeListBuilder.create().texOffs(48, 59)
				.addBox(-1.0F, 0.0F, -7.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.5F));

		PartDefinition Claw2 = LeftFoot1
				.addOrReplaceChild("Claw2",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -6.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition LeftFoot2 = LeftFootBase.addOrReplaceChild("LeftFoot2",
				CubeListBuilder.create().texOffs(48, 59).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.6F, -1.5F, 0.1745F, 0.3491F, 0.0F));

		PartDefinition Claw3 = LeftFoot2
				.addOrReplaceChild("Claw3",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -5.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition LeftFoot3 = LeftFootBase.addOrReplaceChild("LeftFoot3", CubeListBuilder.create().texOffs(44, 56)
				.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftFoot4 = LeftFootBase.addOrReplaceChild("LeftFoot4",
				CubeListBuilder.create().texOffs(44, 56).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.6F, -1.5F, 0.1745F, 5.9341F, 0.0F));

		PartDefinition Claw1 = LeftFoot4
				.addOrReplaceChild("Claw1",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -5.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition BackClaw1 = LeftLeg3
				.addOrReplaceChild("BackClaw1",
						CubeListBuilder.create().texOffs(79, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.0F, 2.0F, 5.5851F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-3.9F, 4.0F, 9.0F));

		PartDefinition RightLeg1 = right_leg.addOrReplaceChild("RightLeg1",
				CubeListBuilder.create().texOffs(1, 27).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 5.7596F, 0.1745F, 0.0F));

		PartDefinition RightLeg2 = RightLeg1
				.addOrReplaceChild("RightLeg2",
						CubeListBuilder.create().texOffs(45, 55).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 10.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.1F, -1.9F, 1.2217F, 0.0F, 0.0F));

		PartDefinition RightLeg3 = RightLeg2
				.addOrReplaceChild("RightLeg3",
						CubeListBuilder.create().texOffs(45, 55).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 11.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 3.0F, 5.0615F, 0.0F, 0.0F));

		PartDefinition RightFootBase = RightLeg3
				.addOrReplaceChild("RightFootBase",
						CubeListBuilder.create().texOffs(1, 27).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition RightFoot1 = RightFootBase.addOrReplaceChild("RightFoot1", CubeListBuilder.create()
				.texOffs(45, 55).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.5F));

		PartDefinition Claw5 = RightFoot1
				.addOrReplaceChild("Claw5",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -6.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition RightFoot2 = RightFootBase.addOrReplaceChild("RightFoot2",
				CubeListBuilder.create().texOffs(45, 55).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.6F, -1.5F, 0.1745F, 0.3491F, 0.0F));

		PartDefinition Claw6 = RightFoot2
				.addOrReplaceChild("Claw6",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -5.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition RightFoot3 = RightFootBase.addOrReplaceChild("RightFoot3", CubeListBuilder.create()
				.texOffs(45, 55).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightFoot4 = RightFootBase.addOrReplaceChild("RightFoot4",
				CubeListBuilder.create().texOffs(45, 55).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.6F, -1.5F, 0.1745F, 5.9341F, 0.0F));

		PartDefinition Claw4 = RightFoot4
				.addOrReplaceChild("Claw4",
						CubeListBuilder.create().texOffs(79, 37).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, -5.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition BackClaw2 = RightLeg3
				.addOrReplaceChild("BackClaw2",
						CubeListBuilder.create().texOffs(77, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.5F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.0F, 2.0F, 5.5851F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}