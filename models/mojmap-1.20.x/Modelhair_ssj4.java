// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhair_ssj4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hair_ssj4"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart ssj4hair;
	private final ModelPart bone39;
	private final ModelPart bone40;
	private final ModelPart bone41;
	private final ModelPart bone42;
	private final ModelPart bone43;
	private final ModelPart bone44;
	private final ModelPart bone45;
	private final ModelPart bone46;
	private final ModelPart bone47;
	private final ModelPart bone48;
	private final ModelPart bone49;
	private final ModelPart bone50;
	private final ModelPart bone51;
	private final ModelPart bone52;
	private final ModelPart bone53;
	private final ModelPart bone54;
	private final ModelPart bone55;
	private final ModelPart bone56;
	private final ModelPart bone57;
	private final ModelPart Head_r19;
	private final ModelPart bone58;
	private final ModelPart Head_r20;
	private final ModelPart Head_r3_r1;
	private final ModelPart bone59;
	private final ModelPart Head_r21;
	private final ModelPart bone60;
	private final ModelPart Head_r22;
	private final ModelPart bone61;
	private final ModelPart Head_r23;
	private final ModelPart bone62;
	private final ModelPart Head_r24;
	private final ModelPart bone63;
	private final ModelPart Head_r25;
	private final ModelPart bone64;
	private final ModelPart Head_r26;
	private final ModelPart bone65;
	private final ModelPart Head_r27;
	private final ModelPart bone66;
	private final ModelPart Head_r28;
	private final ModelPart bone67;
	private final ModelPart Head_r29;
	private final ModelPart bone68;
	private final ModelPart Head_r30;
	private final ModelPart bone69;
	private final ModelPart Head_r31;
	private final ModelPart bone70;
	private final ModelPart Head_r32;
	private final ModelPart bone71;
	private final ModelPart Head_r33;
	private final ModelPart bone72;
	private final ModelPart Head_r34;
	private final ModelPart bone73;
	private final ModelPart Head_r35;
	private final ModelPart bone74;
	private final ModelPart Head_r36;
	private final ModelPart bone37;
	private final ModelPart bone38;
	private final ModelPart ssj4hair2;
	private final ModelPart bone78;
	private final ModelPart bone77;
	private final ModelPart bone76;
	private final ModelPart bone75;
	private final ModelPart bone36;
	private final ModelPart bone35;
	private final ModelPart bone34;
	private final ModelPart bone33;
	private final ModelPart bone32;
	private final ModelPart bone31;
	private final ModelPart bone30;
	private final ModelPart bone29;
	private final ModelPart bone28;
	private final ModelPart bone27;
	private final ModelPart bone26;
	private final ModelPart bone25;
	private final ModelPart bone24;
	private final ModelPart bone23;
	private final ModelPart bone22;
	private final ModelPart Head_r37;
	private final ModelPart bone21;
	private final ModelPart Head_r18;
	private final ModelPart Head_r3_r2;
	private final ModelPart bone20;
	private final ModelPart Head_r17;
	private final ModelPart bone19;
	private final ModelPart Head_r16;
	private final ModelPart bone18;
	private final ModelPart Head_r15;
	private final ModelPart bone17;
	private final ModelPart Head_r14;
	private final ModelPart bone16;
	private final ModelPart Head_r13;
	private final ModelPart bone15;
	private final ModelPart Head_r12;
	private final ModelPart bone14;
	private final ModelPart Head_r11;
	private final ModelPart bone13;
	private final ModelPart Head_r10;
	private final ModelPart bone12;
	private final ModelPart Head_r9;
	private final ModelPart bone11;
	private final ModelPart Head_r8;
	private final ModelPart bone10;
	private final ModelPart Head_r7;
	private final ModelPart bone9;
	private final ModelPart Head_r6;
	private final ModelPart bone8;
	private final ModelPart Head_r5;
	private final ModelPart bone6;
	private final ModelPart Head_r4;
	private final ModelPart bone5;
	private final ModelPart Head_r3;
	private final ModelPart bone4;
	private final ModelPart Head_r2;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelhair_ssj4(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Hair = this.Head.getChild("Hair");
		this.ssj4hair = this.Hair.getChild("ssj4hair");
		this.bone39 = this.ssj4hair.getChild("bone39");
		this.bone40 = this.bone39.getChild("bone40");
		this.bone41 = this.ssj4hair.getChild("bone41");
		this.bone42 = this.bone41.getChild("bone42");
		this.bone43 = this.ssj4hair.getChild("bone43");
		this.bone44 = this.bone43.getChild("bone44");
		this.bone45 = this.ssj4hair.getChild("bone45");
		this.bone46 = this.bone45.getChild("bone46");
		this.bone47 = this.ssj4hair.getChild("bone47");
		this.bone48 = this.bone47.getChild("bone48");
		this.bone49 = this.ssj4hair.getChild("bone49");
		this.bone50 = this.bone49.getChild("bone50");
		this.bone51 = this.ssj4hair.getChild("bone51");
		this.bone52 = this.bone51.getChild("bone52");
		this.bone53 = this.ssj4hair.getChild("bone53");
		this.bone54 = this.bone53.getChild("bone54");
		this.bone55 = this.ssj4hair.getChild("bone55");
		this.bone56 = this.bone55.getChild("bone56");
		this.bone57 = this.ssj4hair.getChild("bone57");
		this.Head_r19 = this.bone57.getChild("Head_r19");
		this.bone58 = this.ssj4hair.getChild("bone58");
		this.Head_r20 = this.bone58.getChild("Head_r20");
		this.Head_r3_r1 = this.Head_r20.getChild("Head_r3_r1");
		this.bone59 = this.ssj4hair.getChild("bone59");
		this.Head_r21 = this.bone59.getChild("Head_r21");
		this.bone60 = this.ssj4hair.getChild("bone60");
		this.Head_r22 = this.bone60.getChild("Head_r22");
		this.bone61 = this.ssj4hair.getChild("bone61");
		this.Head_r23 = this.bone61.getChild("Head_r23");
		this.bone62 = this.ssj4hair.getChild("bone62");
		this.Head_r24 = this.bone62.getChild("Head_r24");
		this.bone63 = this.ssj4hair.getChild("bone63");
		this.Head_r25 = this.bone63.getChild("Head_r25");
		this.bone64 = this.ssj4hair.getChild("bone64");
		this.Head_r26 = this.bone64.getChild("Head_r26");
		this.bone65 = this.ssj4hair.getChild("bone65");
		this.Head_r27 = this.bone65.getChild("Head_r27");
		this.bone66 = this.ssj4hair.getChild("bone66");
		this.Head_r28 = this.bone66.getChild("Head_r28");
		this.bone67 = this.ssj4hair.getChild("bone67");
		this.Head_r29 = this.bone67.getChild("Head_r29");
		this.bone68 = this.ssj4hair.getChild("bone68");
		this.Head_r30 = this.bone68.getChild("Head_r30");
		this.bone69 = this.ssj4hair.getChild("bone69");
		this.Head_r31 = this.bone69.getChild("Head_r31");
		this.bone70 = this.ssj4hair.getChild("bone70");
		this.Head_r32 = this.bone70.getChild("Head_r32");
		this.bone71 = this.ssj4hair.getChild("bone71");
		this.Head_r33 = this.bone71.getChild("Head_r33");
		this.bone72 = this.bone71.getChild("bone72");
		this.Head_r34 = this.bone72.getChild("Head_r34");
		this.bone73 = this.ssj4hair.getChild("bone73");
		this.Head_r35 = this.bone73.getChild("Head_r35");
		this.bone74 = this.bone73.getChild("bone74");
		this.Head_r36 = this.bone74.getChild("Head_r36");
		this.bone37 = this.ssj4hair.getChild("bone37");
		this.bone38 = this.ssj4hair.getChild("bone38");
		this.ssj4hair2 = this.Hair.getChild("ssj4hair2");
		this.bone78 = this.ssj4hair2.getChild("bone78");
		this.bone77 = this.bone78.getChild("bone77");
		this.bone76 = this.ssj4hair2.getChild("bone76");
		this.bone75 = this.bone76.getChild("bone75");
		this.bone36 = this.ssj4hair2.getChild("bone36");
		this.bone35 = this.bone36.getChild("bone35");
		this.bone34 = this.ssj4hair2.getChild("bone34");
		this.bone33 = this.bone34.getChild("bone33");
		this.bone32 = this.ssj4hair2.getChild("bone32");
		this.bone31 = this.bone32.getChild("bone31");
		this.bone30 = this.ssj4hair2.getChild("bone30");
		this.bone29 = this.bone30.getChild("bone29");
		this.bone28 = this.ssj4hair2.getChild("bone28");
		this.bone27 = this.bone28.getChild("bone27");
		this.bone26 = this.ssj4hair2.getChild("bone26");
		this.bone25 = this.bone26.getChild("bone25");
		this.bone24 = this.ssj4hair2.getChild("bone24");
		this.bone23 = this.bone24.getChild("bone23");
		this.bone22 = this.ssj4hair2.getChild("bone22");
		this.Head_r37 = this.bone22.getChild("Head_r37");
		this.bone21 = this.ssj4hair2.getChild("bone21");
		this.Head_r18 = this.bone21.getChild("Head_r18");
		this.Head_r3_r2 = this.Head_r18.getChild("Head_r3_r2");
		this.bone20 = this.ssj4hair2.getChild("bone20");
		this.Head_r17 = this.bone20.getChild("Head_r17");
		this.bone19 = this.ssj4hair2.getChild("bone19");
		this.Head_r16 = this.bone19.getChild("Head_r16");
		this.bone18 = this.ssj4hair2.getChild("bone18");
		this.Head_r15 = this.bone18.getChild("Head_r15");
		this.bone17 = this.ssj4hair2.getChild("bone17");
		this.Head_r14 = this.bone17.getChild("Head_r14");
		this.bone16 = this.ssj4hair2.getChild("bone16");
		this.Head_r13 = this.bone16.getChild("Head_r13");
		this.bone15 = this.ssj4hair2.getChild("bone15");
		this.Head_r12 = this.bone15.getChild("Head_r12");
		this.bone14 = this.ssj4hair2.getChild("bone14");
		this.Head_r11 = this.bone14.getChild("Head_r11");
		this.bone13 = this.ssj4hair2.getChild("bone13");
		this.Head_r10 = this.bone13.getChild("Head_r10");
		this.bone12 = this.ssj4hair2.getChild("bone12");
		this.Head_r9 = this.bone12.getChild("Head_r9");
		this.bone11 = this.ssj4hair2.getChild("bone11");
		this.Head_r8 = this.bone11.getChild("Head_r8");
		this.bone10 = this.ssj4hair2.getChild("bone10");
		this.Head_r7 = this.bone10.getChild("Head_r7");
		this.bone9 = this.ssj4hair2.getChild("bone9");
		this.Head_r6 = this.bone9.getChild("Head_r6");
		this.bone8 = this.ssj4hair2.getChild("bone8");
		this.Head_r5 = this.bone8.getChild("Head_r5");
		this.bone6 = this.bone8.getChild("bone6");
		this.Head_r4 = this.bone6.getChild("Head_r4");
		this.bone5 = this.ssj4hair2.getChild("bone5");
		this.Head_r3 = this.bone5.getChild("Head_r3");
		this.bone4 = this.bone5.getChild("bone4");
		this.Head_r2 = this.bone4.getChild("Head_r2");
		this.bone3 = this.ssj4hair2.getChild("bone3");
		this.bone2 = this.ssj4hair2.getChild("bone2");
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
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ssj4hair = Hair.addOrReplaceChild("ssj4hair",
				CubeListBuilder.create().texOffs(54, 56)
						.addBox(3.0F, -8.4F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 56)
						.addBox(3.0F, -8.4F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 56)
						.addBox(-4.0F, -8.4F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 56)
						.addBox(-4.0F, -8.4F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.725F, -2.45F, -2.618F, 0.0F, 0.0F));

		PartDefinition bone39 = ssj4hair.addOrReplaceChild("bone39", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -9.0F, -4.0F));

		PartDefinition bone40 = bone39.addOrReplaceChild("bone40", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.5F, -2.6F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone41 = ssj4hair.addOrReplaceChild("bone41", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -5.0F, -0.5F, 3.1012F, -0.0774F, -2.6601F));

		PartDefinition bone42 = bone41.addOrReplaceChild("bone42", CubeListBuilder.create(),
				PartPose.offset(-0.4924F, -2.6F, -0.1743F));

		PartDefinition bone43 = ssj4hair.addOrReplaceChild("bone43", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -6.0F, 0.0F, 3.1117F, -0.082F, -2.7913F));

		PartDefinition bone44 = bone43.addOrReplaceChild("bone44", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4924F, -2.6F, -0.1743F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone45 = ssj4hair.addOrReplaceChild("bone45", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -3.25F, 0.0F, 3.1046F, -0.0791F, -2.7038F));

		PartDefinition bone46 = bone45.addOrReplaceChild("bone46", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4924F, -2.6F, -0.1743F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone47 = ssj4hair.addOrReplaceChild("bone47", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.1F, -8.4F, -4.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone48 = bone47.addOrReplaceChild("bone48", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone49 = ssj4hair.addOrReplaceChild("bone49", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1F, -8.4F, -3.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone50 = bone49.addOrReplaceChild("bone50", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone51 = ssj4hair.addOrReplaceChild("bone51", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.1F, -8.4F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone52 = bone51.addOrReplaceChild("bone52", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone53 = ssj4hair.addOrReplaceChild("bone53", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.1F, -7.05F, -1.475F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone54 = bone53.addOrReplaceChild("bone54", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone55 = ssj4hair.addOrReplaceChild("bone55", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.1F, -3.05F, 0.525F, 0.0F, 0.0F, -0.7418F));

		PartDefinition bone56 = bone55.addOrReplaceChild("bone56", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone57 = ssj4hair.addOrReplaceChild("bone57", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head_r19 = bone57.addOrReplaceChild("Head_r19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone58 = ssj4hair.addOrReplaceChild("bone58", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -8.0F, -3.0F, 0.546F, 0.1623F, -0.2599F));

		PartDefinition Head_r20 = bone58.addOrReplaceChild("Head_r20", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Head_r3_r1 = Head_r20.addOrReplaceChild("Head_r3_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, -0.4333F, 0.1776F, -0.4483F));

		PartDefinition bone59 = ssj4hair.addOrReplaceChild("bone59", CubeListBuilder.create(),
				PartPose.offset(-0.975F, 24.0F, 1.775F));

		PartDefinition Head_r21 = bone59.addOrReplaceChild("Head_r21", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone60 = ssj4hair.addOrReplaceChild("bone60", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 24.0F, 1.775F));

		PartDefinition Head_r22 = bone60.addOrReplaceChild("Head_r22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone61 = ssj4hair.addOrReplaceChild("bone61", CubeListBuilder.create(),
				PartPose.offset(-5.875F, 24.0F, 1.825F));

		PartDefinition Head_r23 = bone61.addOrReplaceChild("Head_r23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone62 = ssj4hair.addOrReplaceChild("bone62", CubeListBuilder.create(),
				PartPose.offset(-5.875F, 24.0F, 3.75F));

		PartDefinition Head_r24 = bone62.addOrReplaceChild("Head_r24", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone63 = ssj4hair.addOrReplaceChild("bone63", CubeListBuilder.create(),
				PartPose.offset(-2.825F, 24.0F, 3.2F));

		PartDefinition Head_r25 = bone63.addOrReplaceChild("Head_r25", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone64 = ssj4hair.addOrReplaceChild("bone64", CubeListBuilder.create(),
				PartPose.offset(-0.225F, 24.0F, 3.2F));

		PartDefinition Head_r26 = bone64.addOrReplaceChild("Head_r26", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone65 = ssj4hair.addOrReplaceChild("bone65", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.2F, -9.0F, 4.225F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r27 = bone65.addOrReplaceChild("Head_r27", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone66 = ssj4hair.addOrReplaceChild("bone66", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.75F, -9.0F, 5.35F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r28 = bone66.addOrReplaceChild("Head_r28", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone67 = ssj4hair.addOrReplaceChild("bone67", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.425F, -7.825F, 5.95F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r29 = bone67.addOrReplaceChild("Head_r29", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone68 = ssj4hair.addOrReplaceChild("bone68", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.625F, -7.825F, 5.95F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r30 = bone68.addOrReplaceChild("Head_r30", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone69 = ssj4hair.addOrReplaceChild("bone69", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.525F, -8.65F, 5.125F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r31 = bone69.addOrReplaceChild("Head_r31", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone70 = ssj4hair.addOrReplaceChild("bone70", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.525F, -11.95F, 5.125F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r32 = bone70.addOrReplaceChild("Head_r32", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone71 = ssj4hair.addOrReplaceChild("bone71", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -11.95F, 4.15F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r33 = bone71.addOrReplaceChild("Head_r33", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone72 = bone71.addOrReplaceChild("bone72", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.875F, 0.0F, -0.8F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r34 = bone72.addOrReplaceChild("Head_r34", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone73 = ssj4hair.addOrReplaceChild("bone73", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.275F, -11.95F, 1.875F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r35 = bone73.addOrReplaceChild("Head_r35", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone74 = bone73.addOrReplaceChild("bone74", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.3F, 0.0F, -0.775F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r36 = bone74.addOrReplaceChild("Head_r36", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone37 = ssj4hair.addOrReplaceChild("bone37",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(4.0F, -26.125F, 0.55F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(4.0F, -26.125F, -2.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.725F, 2.45F));

		PartDefinition bone38 = ssj4hair.addOrReplaceChild("bone38",
				CubeListBuilder.create().texOffs(54, 59)
						.addBox(4.0F, -26.125F, 0.55F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 59)
						.addBox(4.0F, -26.125F, -2.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 15.725F, 2.45F));

		PartDefinition ssj4hair2 = Hair.addOrReplaceChild("ssj4hair2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.725F, -2.45F, -2.618F, 0.0F, 0.0F));

		PartDefinition bone78 = ssj4hair2.addOrReplaceChild("bone78",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(1.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -9.0F, -4.0F));

		PartDefinition bone77 = bone78.addOrReplaceChild("bone77",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -2.6F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone76 = ssj4hair2.addOrReplaceChild("bone76", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -5.0F, -0.5F, 3.1012F, -0.0774F, -2.6601F));

		PartDefinition bone75 = bone76.addOrReplaceChild("bone75", CubeListBuilder.create(),
				PartPose.offset(-0.4924F, -2.6F, -0.1743F));

		PartDefinition bone36 = ssj4hair2.addOrReplaceChild("bone36",
				CubeListBuilder.create().texOffs(54, 58).addBox(-0.7424F, -3.075F, -0.2743F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -6.0F, 0.0F, 3.1117F, -0.082F, -2.7913F));

		PartDefinition bone35 = bone36.addOrReplaceChild("bone35",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4924F, -2.6F, -0.1743F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone34 = ssj4hair2.addOrReplaceChild("bone34", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -3.25F, 0.0F, 3.1046F, -0.0791F, -2.7038F));

		PartDefinition bone33 = bone34.addOrReplaceChild("bone33", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4924F, -2.6F, -0.1743F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone32 = ssj4hair2.addOrReplaceChild("bone32",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -8.4F, -4.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone31 = bone32.addOrReplaceChild("bone31",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone30 = ssj4hair2.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -8.4F, -3.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone29 = bone30.addOrReplaceChild("bone29",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone28 = ssj4hair2.addOrReplaceChild("bone28",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -8.4F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone27 = bone28.addOrReplaceChild("bone27",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition bone26 = ssj4hair2.addOrReplaceChild("bone26", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.1F, -7.05F, -1.475F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone25 = bone26.addOrReplaceChild("bone25",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone55_r1 = bone25.addOrReplaceChild("bone55_r1",
				CubeListBuilder.create().texOffs(54, 58).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.925F, 0.9F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone24 = ssj4hair2.addOrReplaceChild("bone24", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.1F, -3.05F, 0.525F, 0.0F, 0.0F, -0.7418F));

		PartDefinition bone23 = bone24.addOrReplaceChild("bone23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -2.6F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone22 = ssj4hair2.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head_r37 = bone22.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone21 = ssj4hair2.addOrReplaceChild("bone21", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -8.0F, -3.0F, 0.546F, 0.1623F, -0.2599F));

		PartDefinition Head_r18 = bone21
				.addOrReplaceChild("Head_r18",
						CubeListBuilder.create().texOffs(54, 58).addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Head_r3_r2 = Head_r18.addOrReplaceChild("Head_r3_r2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, -0.4333F, 0.1776F, -0.4483F));

		PartDefinition bone20 = ssj4hair2.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(-0.975F, 24.0F, 1.775F));

		PartDefinition Head_r17 = bone20.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone19 = ssj4hair2.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 24.0F, 1.775F));

		PartDefinition Head_r16 = bone19.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone18 = ssj4hair2.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offset(-5.875F, 24.0F, 1.825F));

		PartDefinition Head_r15 = bone18.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone17 = ssj4hair2.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(-5.875F, 24.0F, 3.75F));

		PartDefinition Head_r14 = bone17.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone16 = ssj4hair2.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offset(-2.825F, 24.0F, 3.2F));

		PartDefinition Head_r13 = bone16.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone15 = ssj4hair2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(-0.225F, 24.0F, 3.2F));

		PartDefinition Head_r12 = bone15.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -32.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone14 = ssj4hair2.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.2F, -9.0F, 4.225F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r11 = bone14.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone13 = ssj4hair2.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.75F, -9.0F, 5.35F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r10 = bone13.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone12 = ssj4hair2.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.425F, -7.825F, 5.95F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r9 = bone12
				.addOrReplaceChild("Head_r9",
						CubeListBuilder.create().texOffs(54, 58).addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone11 = ssj4hair2.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.625F, -7.825F, 5.95F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r8 = bone11
				.addOrReplaceChild("Head_r8",
						CubeListBuilder.create().texOffs(54, 58).addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone10 = ssj4hair2.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.525F, -8.65F, 5.125F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r7 = bone10.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone9 = ssj4hair2.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.525F, -11.95F, 5.125F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r6 = bone9.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone8 = ssj4hair2.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -11.95F, 4.15F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r5 = bone8.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone6 = bone8.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.875F, 0.0F, -0.8F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r4 = bone6.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone5 = ssj4hair2.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.275F, -11.95F, 1.875F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r3 = bone5.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone4 = bone5.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.3F, 0.0F, -0.775F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r2 = bone4.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(54, 58)
						.addBox(-0.6F, -6.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.1F, -4.1F, -3.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-0.6F, -4.1F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone3 = ssj4hair2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.725F, 2.45F));

		PartDefinition bone2 = ssj4hair2.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-10.0F, 15.725F, 2.45F));

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