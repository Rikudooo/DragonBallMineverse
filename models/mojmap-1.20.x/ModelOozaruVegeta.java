// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelOozaruVegeta<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oozaruvegeta"), "main");
	private final ModelPart Body;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Head;
	private final ModelPart hair;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelOozaruVegeta(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Tail1 = this.Body.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Head = root.getChild("Head");
		this.hair = this.Head.getChild("hair");
		this.bone2 = this.hair.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(48, 48)
				.addBox(-12.0F, 0.0F, -6.0F, 24.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -48.0F, 0.0F));

		PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create(),
				PartPose.offset(0.0213F, 31.7067F, 2.5054F));

		PartDefinition cube_r1 = Tail1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(152, 14).addBox(-2.9362F, -42.9859F, 7.4678F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0638F, 39.8799F, -7.5162F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.5784F, 7.4226F));

		PartDefinition cube_r2 = Tail2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -29.5451F, 32.9255F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 39.3015F, -14.9389F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.8651F, 6.1996F));

		PartDefinition cube_r3 = Tail3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -2.9459F, 47.9026F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 42.1665F, -21.1385F, 1.0996F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.2991F, 3.6403F));

		PartDefinition cube_r4 = Tail4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -28.815F, 49.1406F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 49.4657F, -24.7788F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.7277F, 5.8577F));

		PartDefinition cube_r5 = Tail5.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -59.4604F, 26.0006F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 54.1933F, -30.6364F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2409F, 7.5646F));

		PartDefinition cube_r6 = Tail6.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -68.9921F, 0.5025F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 53.9524F, -38.201F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.3166F, 6.2241F));

		PartDefinition cube_r7 = Tail7.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(150, 11).addBox(-2.9363F, -52.7897F, -45.4734F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0637F, 50.6358F, -44.4251F, -1.4486F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-12.0F, -24.0F, -12.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(29, 102)
				.mirror().addBox(10.0F, -10.0F, -13.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 96).mirror().addBox(-10.0F, -10.0F, -13.0F, 20.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(31, 101)
				.addBox(-12.0F, -10.0F, -13.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 108)
				.addBox(-8.0F, -10.0F, -21.0F, 16.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(43, 109)
				.addBox(-8.0F, -6.0F, -21.25F, 16.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 109)
				.addBox(-5.0F, -3.0F, -21.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 109).mirror()
				.addBox(2.0F, -3.0F, -21.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 107).addBox(-8.4F, -7.0F, -21.25F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 107).mirror().addBox(7.4F, -7.0F, -21.25F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 110)
				.addBox(-3.725F, -10.05F, -21.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
				.mirror().addBox(2.725F, -10.05F, -21.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -48.0F, 0.0F));

		PartDefinition hair = Head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(136, 0)
				.addBox(-3.0F, -112.5052F, -4.6661F, 12.0F, 21.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-6.375F, -106.5052F, -6.5411F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-6.375F, -102.0052F, 2.4589F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-3.375F, -100.5052F, 0.2089F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-1.875F, -97.5052F, 3.2089F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-4.875F, -98.2552F, 4.7089F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-4.125F, -99.0052F, 1.7089F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-9.0F, -104.8177F, -3.1661F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-7.125F, -102.7552F, -0.5411F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-10.875F, -101.0677F, -0.5411F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-9.1875F, -102.1927F, 1.7089F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-9.1875F, -100.6927F, 5.4589F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-0.1875F, -100.6927F, 5.4589F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-9.1875F, -99.1927F, 0.2089F, 6.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(139, 3)
				.addBox(-9.1875F, -97.6927F, 2.4589F, 6.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 73.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hair.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.113F, -90.1117F, -3.0247F, -0.0815F, -0.0658F, -0.6431F));

		PartDefinition cube_r9 = hair.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.113F, -90.1117F, -3.0247F, -0.225F, -0.0104F, -0.4753F));

		PartDefinition cube_r10 = hair.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(140, 3).mirror()
				.addBox(-6.863F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.113F, -90.1117F, -9.7747F, -0.0815F, 0.0658F, 0.6431F));

		PartDefinition cube_r11 = hair.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.113F, -90.1117F, -9.7747F, -0.0815F, -0.0658F, -0.6431F));

		PartDefinition cube_r12 = hair.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(140, 3)
				.addBox(3.9699F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.113F, -90.1117F, -9.7747F, -0.225F, -0.0104F, -0.4753F));

		PartDefinition cube_r13 = hair.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0505F, -94.4242F, -5.0872F, -0.3477F, -0.2692F, -0.6331F));

		PartDefinition cube_r14 = hair.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0505F, -94.4242F, -5.0872F, -0.5174F, -0.1697F, -0.4837F));

		PartDefinition cube_r15 = hair.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0505F, -92.7367F, 0.3503F, -0.3477F, -0.2692F, -0.5982F));

		PartDefinition cube_r16 = hair.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0505F, -92.7367F, 0.3503F, -0.5174F, -0.1697F, -0.4837F));

		PartDefinition cube_r17 = hair.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.613F, -96.2992F, -4.3372F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r18 = hair.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.613F, -96.2992F, -4.3372F, -0.1336F, 0.0407F, -0.1423F));

		PartDefinition cube_r19 = hair.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.613F, -93.8617F, -7.5247F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r20 = hair.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.613F, -93.8617F, -7.5247F, -0.1336F, 0.0407F, -0.1423F));

		PartDefinition cube_r21 = hair.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4255F, -97.7992F, -7.5247F, -0.1336F, 0.0407F, -0.1423F));

		PartDefinition cube_r22 = hair.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4255F, -97.7992F, -7.5247F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r23 = hair.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.762F, -93.2992F, -6.0247F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r24 = hair.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.762F, -93.2992F, -6.0247F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r25 = hair.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.113F, -93.6742F, -8.2747F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r26 = hair.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -10.6936F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.113F, -93.6742F, -8.2747F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r27 = hair.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8245F, -91.0492F, -5.6497F, -2.6822F, -0.3687F, -2.7587F));

		PartDefinition cube_r28 = hair.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8245F, -91.0492F, -5.6497F, -2.7575F, -0.3238F, -2.9403F));

		PartDefinition cube_r29 = hair.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.262F, -96.8617F, -6.0247F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r30 = hair.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -13.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -92.3617F, -9.0247F, -2.6822F, -0.3687F, -2.7587F));

		PartDefinition cube_r31 = hair.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -92.3617F, -9.0247F, -2.7575F, -0.3238F, -2.9403F));

		PartDefinition cube_r32 = hair.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.762F, -89.3617F, -5.6497F, -2.7575F, -0.3238F, -2.9403F));

		PartDefinition cube_r33 = hair.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(140, 3).mirror()
				.addBox(-6.863F, -7.1686F, -2.0165F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-13.762F, -89.3617F, -5.6497F, -2.6822F, 0.3687F, 2.7587F));

		PartDefinition cube_r34 = hair.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.1686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.762F, -89.3617F, -5.6497F, -2.6822F, -0.3687F, -2.7587F));

		PartDefinition cube_r35 = hair.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.1995F, -95.1742F, -3.2122F, -2.8183F, -0.3135F, -2.9051F));

		PartDefinition cube_r36 = hair.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.1995F, -95.1742F, -3.2122F, -2.9004F, -0.2929F, -3.0888F));

		PartDefinition cube_r37 = hair.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.262F, -94.4242F, -0.7747F, -2.7575F, -0.3238F, -2.9403F));

		PartDefinition cube_r38 = hair.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.262F, -94.4242F, -0.7747F, -2.6822F, -0.3687F, -2.7587F));

		PartDefinition cube_r39 = hair.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6995F, -100.2367F, 1.6628F, -2.8183F, -0.3135F, -2.9051F));

		PartDefinition cube_r40 = hair.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6995F, -100.2367F, 1.6628F, -2.9004F, -0.2929F, -3.0888F));

		PartDefinition cube_r41 = hair.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.387F, -99.6742F, -1.3372F, -2.8183F, -0.3135F, -2.9051F));

		PartDefinition cube_r42 = hair.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.387F, -99.6742F, -1.3372F, -2.9004F, -0.2929F, -3.0888F));

		PartDefinition cube_r43 = hair.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.863F, -94.7992F, 4.8503F, -2.8183F, -0.3135F, -2.9051F));

		PartDefinition cube_r44 = hair.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(140, 3)
				.addBox(-7.9141F, -14.3796F, -4.351F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-6.9118F, -16.3384F, -5.3304F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-2.0882F, -15.5366F, -0.6696F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-1.0859F, -17.4954F, -1.649F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.685F, -83.6659F, 2.4291F, -0.1361F, -0.0313F, -0.3469F));

		PartDefinition cube_r45 = hair.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.863F, -94.7992F, 6.1628F, -2.9004F, -0.2929F, -3.0888F));

		PartDefinition cube_r46 = hair.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4495F, -94.7992F, 6.1628F, -2.8183F, -0.3135F, -2.4687F));

		PartDefinition cube_r47 = hair.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4495F, -94.7992F, 6.1628F, -2.9004F, -0.2929F, -2.6525F));

		PartDefinition cube_r48 = hair.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.3245F, -96.6742F, 6.1628F, -2.8183F, -0.3135F, -2.4687F));

		PartDefinition cube_r49 = hair.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.3245F, -96.6742F, 6.1628F, -2.9004F, -0.2929F, -2.6525F));

		PartDefinition cube_r50 = hair.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9495F, -96.6742F, 0.3503F, -2.8183F, -0.3135F, -2.4687F));

		PartDefinition cube_r51 = hair.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -11.711F, -5.3989F, 9.0F, 12.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9495F, -96.6742F, 0.3503F, -2.9004F, -0.2929F, -2.6525F));

		PartDefinition cube_r52 = hair.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -98.1742F, 3.7253F, -2.8183F, -0.3135F, -2.4687F));

		PartDefinition cube_r53 = hair.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -11.711F, -5.3989F, 9.0F, 12.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -98.1742F, 3.7253F, -2.9004F, -0.2929F, -2.6525F));

		PartDefinition cube_r54 = hair.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -98.1742F, 3.7253F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r55 = hair.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -98.1742F, 3.7253F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r56 = hair.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(140, 3)
				.addBox(-1.4676F, -14.711F, -5.3989F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -94.4242F, -0.7747F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r57 = hair.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(140, 3)
				.addBox(-2.137F, -7.7686F, -5.954F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 3)
				.addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -94.4242F, -0.7747F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r58 = hair.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -93.1117F, -7.7122F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r59 = hair.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -96.6742F, -4.1497F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r60 = hair.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.762F, -96.6742F, -4.1497F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r61 = hair.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.887F, -98.3617F, -6.0247F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r62 = hair.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.887F, -98.3617F, -6.0247F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r63 = hair.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -95.1742F, -6.0247F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r64 = hair.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1995F, -95.1742F, -6.0247F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r65 = hair.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(140, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.262F, -97.7992F, -8.2747F, -2.9004F, -0.2929F, -3.1062F));

		PartDefinition cube_r66 = hair.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(140, 3).addBox(-2.137F, -11.5936F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.262F, -97.7992F, -8.2747F, -2.8183F, -0.3135F, -2.9225F));

		PartDefinition cube_r67 = hair.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.012F, -97.7992F, -5.2747F, 2.9762F, -0.2566F, -2.9945F));

		PartDefinition cube_r68 = hair.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(139, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.012F, -97.7992F, -5.2747F, 3.0732F, -0.2073F, -2.8203F));

		PartDefinition cube_r69 = hair.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.238F, -95.5492F, -7.5247F, -0.1336F, 0.0407F, -0.1423F));

		PartDefinition cube_r70 = hair.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(139, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.238F, -95.5492F, -7.5247F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r71 = hair.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7885F, -93.4056F, 4.6168F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r72 = hair.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7885F, -94.9056F, 2.3668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r73 = hair.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7885F, -97.9056F, 3.8668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r74 = hair.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.476F, -96.7806F, 1.6168F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r75 = hair.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.726F, -98.4681F, 1.6168F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r76 = hair.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.601F, -100.5306F, -1.0082F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r77 = hair.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(140, 1).mirror()
						.addBox(-4.5F, -10.5F, -3.0F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(140, 1).mirror()
						.addBox(-4.5F, -1.5F, 6.0F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.781F, -97.1668F, 13.6766F, -0.7979F, -0.36F, 0.0471F));

		PartDefinition cube_r78 = hair.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(140, 1).addBox(-4.5F, -10.5F, -3.0F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3574F, -83.1649F, 14.4044F, -0.7984F, 0.0068F, 0.0022F));

		PartDefinition cube_r79 = hair.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(140, 1).mirror()
						.addBox(-2.7F, -7.8F, 1.8F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0327F, -95.8877F, 14.5668F, -0.8658F, 0.4718F, -0.0344F));

		PartDefinition cube_r80 = hair.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(140, 1).addBox(-6.3F, -7.8F, 1.8F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0327F, -95.8877F, 14.5668F, -0.8658F, -0.4718F, 0.0344F));

		PartDefinition cube_r81 = hair.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(140, 1).addBox(-4.5F, -10.5F, -3.0F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0327F, -95.8877F, 14.5668F, -0.7982F, -0.0213F, -0.0252F));

		PartDefinition cube_r82 = hair.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(140, 1).addBox(-4.5F, -9.825F, -1.725F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.8058F, -87.2098F, 7.9618F, -1.3684F, 1.1426F, -0.7517F));

		PartDefinition cube_r83 = hair.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(140, 1).mirror()
						.addBox(-4.5F, -9.825F, -1.725F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.8058F, -87.2098F, 7.9618F, -1.3684F, -1.1426F, 0.7517F));

		PartDefinition cube_r84 = hair.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(140, 1).addBox(-1.8F, -9.6F, -3.0F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4631F, -86.4697F, 2.0637F, -1.8533F, 1.1164F, -1.2281F));

		PartDefinition cube_r85 = hair.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(140, 1).mirror()
						.addBox(-7.2F, -9.6F, -3.0F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.4631F, -86.4697F, 2.0637F, -1.8533F, -1.1164F, 1.2281F));

		PartDefinition cube_r86 = hair.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(140, 1).mirror()
						.addBox(-6.3F, -5.1F, 0.9F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.781F, -97.1668F, 13.6766F, -0.7241F, -0.5108F, -0.127F));

		PartDefinition cube_r87 = hair.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(140, 1).addBox(-2.7F, -5.1F, 0.9F, 9.0F, 21.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.781F, -97.1668F, 13.6766F, -0.7241F, 0.5108F, 0.127F));

		PartDefinition cube_r88 = hair.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(140, 1)
						.addBox(-4.5F, -1.5F, 6.0F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 1)
						.addBox(-4.5F, -10.5F, -3.0F, 9.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.781F, -97.1668F, 13.6766F, -0.7979F, 0.36F, -0.0471F));

		PartDefinition cube_r89 = hair.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(139, 3).addBox(-2.5302F, -3.3235F, -2.3159F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.853F, -97.6578F, 11.1498F, -0.2388F, -0.2323F, -0.7574F));

		PartDefinition cube_r90 = hair.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(139, 3).addBox(-2.137F, -7.7686F, -2.0165F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.988F, -94.2367F, 7.4753F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r91 = hair.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.4676F, -14.711F, -1.4614F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.988F, -94.2367F, 7.4753F, -0.1336F, 0.0407F, -0.6136F));

		PartDefinition cube_r92 = hair.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.976F, -97.7181F, 7.6168F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r93 = hair.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.726F, -94.7181F, 3.8668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r94 = hair.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.726F, -93.9681F, 6.8668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r95 = hair.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.524F, -93.2181F, 5.3668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r96 = hair.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.976F, -96.2181F, 2.3668F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r97 = hair.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.976F, -97.7181F, 4.6168F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r98 = hair.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(139, 3).addBox(-1.125F, -11.25F, -1.125F, 9.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.976F, -102.2181F, -4.3832F, -0.1336F, 0.0407F, 0.1718F));

		PartDefinition cube_r99 = hair.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(138, 0)
				.addBox(-15.2625F, -1.65F, 2.6437F, 3.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(138, 0)
				.addBox(-12.2625F, -1.65F, 2.6437F, 3.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(138, 0)
				.addBox(-9.2625F, -1.65F, 2.6437F, 3.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(138, 0)
				.addBox(-6.2625F, -1.65F, 2.6437F, 3.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, 6.8438F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, 9.8438F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, 12.8438F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, 3.8438F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, 0.8438F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 2)
				.addBox(-6.5625F, -8.25F, -2.1563F, 15.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.375F, -109.5052F, -1.7599F, -0.1384F, 0.0182F, 0.0075F));

		PartDefinition bone2 = hair.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-0.0636F, -88.7885F, -10.455F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(139, 2).mirror()
						.addBox(-0.1164F, -14.7787F, -2.7386F, 6.0F, 15.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.1692F, 0.0F, 0.0F, 3.1416F, 0.0F, -2.312F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(139, 2).addBox(-5.8836F, -14.7787F, -2.7386F, 6.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 2.312F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(6.1756F, -9.0107F, 2.8553F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(142, 4).mirror()
						.addBox(-4.875F, -5.7F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.0261F, -1.272F, -2.8137F, -3.1024F, 0.0184F, -2.758F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(142, 4).addBox(-1.125F, -5.7F, -3.0F, 6.0F, 12.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1979F, -1.272F, -2.8137F, -3.1024F, -0.0184F, 2.758F));

		PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(139, 2).mirror()
				.addBox(-12.1164F, -8.7787F, -2.3636F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.0484F, 9.0107F, -2.8053F, 3.1416F, 0.032F, 3.1326F));

		PartDefinition cube_r105 = bone.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(139, 2).addBox(6.1164F, -8.7787F, -2.3636F, 6.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1756F, 9.0107F, -2.6803F, 3.1416F, -0.032F, -3.1326F));

		PartDefinition cube_r106 = bone.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(139, 2).addBox(-2.8836F, -17.7787F, -2.7386F, 6.0F, 15.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1756F, 9.0107F, -2.8553F, -3.1125F, -0.032F, -3.1326F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(120, 48)
				.addBox(-9.0F, -6.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.0F, -42.0F, 1.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(96, 144)
				.addBox(-3.0F, -6.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.0F, -42.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 144)
				.addBox(-6.0F, 0.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-6.0F, 0.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 192);
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
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}