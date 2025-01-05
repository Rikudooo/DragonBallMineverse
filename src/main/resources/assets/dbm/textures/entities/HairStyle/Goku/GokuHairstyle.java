// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class GokuHairstyle extends EntityModel<Entity> {
	private final ModelRenderer GokuHair;
	private final ModelRenderer Hair_r1;
	private final ModelRenderer Hair_r2;
	private final ModelRenderer Hair_r3;
	private final ModelRenderer Hair_r4;
	private final ModelRenderer Hair_r5;
	private final ModelRenderer Hair_r6;
	private final ModelRenderer Hair_r7;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;

	public GokuHairstyle() {
		textureWidth = 128;
		textureHeight = 128;

		GokuHair = new ModelRenderer(this);
		GokuHair.setRotationPoint(0.0F, 0.0F, 0.0F);
		GokuHair.setTextureOffset(96, 119).addBox(-4.0F, -8.4F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		GokuHair.setTextureOffset(96, 119).addBox(3.4F, -8.1F, -3.9F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		GokuHair.setTextureOffset(96, 119).addBox(-4.1F, -8.1F, -3.9F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		GokuHair.setTextureOffset(96, 119).addBox(-4.1F, -4.1F, 0.1F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		GokuHair.setTextureOffset(96, 119).addBox(3.2F, -4.1F, 0.1F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		GokuHair.setTextureOffset(96, 119).addBox(-4.0F, -8.4F, 3.35F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setRotationPoint(2.0F, -8.0F, -4.0F);
		GokuHair.addChild(Hair_r1);
		setRotationAngle(Hair_r1, -0.3898F, -0.0388F, -0.2309F);
		Hair_r1.setTextureOffset(120, 119).addBox(0.3148F, 0.4498F, -0.0082F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hair_r1.setTextureOffset(120, 119).addBox(-0.9352F, -0.0502F, -0.3082F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Hair_r2 = new ModelRenderer(this);
		Hair_r2.setRotationPoint(-1.0F, -8.0F, -4.0F);
		GokuHair.addChild(Hair_r2);
		setRotationAngle(Hair_r2, -0.3603F, 0.1569F, 0.2564F);
		Hair_r2.setTextureOffset(120, 119).addBox(2.9311F, -0.9221F, -0.152F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair_r2.setTextureOffset(120, 119).addBox(1.4311F, -0.4221F, -0.152F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair_r2.setTextureOffset(120, 119).addBox(0.1811F, -0.1721F, -0.152F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair_r2.setTextureOffset(120, 119).addBox(0.6811F, -0.1721F, -0.152F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Hair_r3 = new ModelRenderer(this);
		Hair_r3.setRotationPoint(-2.1F, -0.65F, 3.525F);
		GokuHair.addChild(Hair_r3);
		setRotationAngle(Hair_r3, -2.3126F, 0.0F, -1.8762F);
		Hair_r3.setTextureOffset(120, 119).addBox(-1.7793F, -5.2492F, 3.071F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Hair_r4 = new ModelRenderer(this);
		Hair_r4.setRotationPoint(-2.1F, -0.65F, 3.525F);
		GokuHair.addChild(Hair_r4);
		setRotationAngle(Hair_r4, -2.0024F, -0.1509F, -1.3729F);
		Hair_r4.setTextureOffset(120, 119).addBox(-0.0793F, -4.3492F, 1.671F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Hair_r5 = new ModelRenderer(this);
		Hair_r5.setRotationPoint(-2.1F, -0.65F, 3.525F);
		GokuHair.addChild(Hair_r5);
		setRotationAngle(Hair_r5, -1.2828F, -0.103F, -1.5421F);
		Hair_r5.setTextureOffset(120, 119).addBox(-0.0793F, -2.0492F, 0.471F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Hair_r6 = new ModelRenderer(this);
		Hair_r6.setRotationPoint(-2.1F, -0.65F, 3.525F);
		GokuHair.addChild(Hair_r6);
		setRotationAngle(Hair_r6, -1.2654F, 0.0F, -1.8762F);
		Hair_r6.setTextureOffset(120, 119).addBox(-0.0793F, -2.0492F, -1.929F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Hair_r7 = new ModelRenderer(this);
		Hair_r7.setRotationPoint(-2.0F, -8.0F, -4.0F);
		GokuHair.addChild(Hair_r7);
		setRotationAngle(Hair_r7, -0.3603F, 0.1569F, 0.2564F);
		Hair_r7.setTextureOffset(120, 119).addBox(-0.75F, -0.075F, -0.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, -8.0F, -4.0F);
		GokuHair.addChild(bone);
		bone.setTextureOffset(120, 119).addBox(0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(120, 119).addBox(1.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.5F, -2.6F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2182F);
		bone2.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.0F, -5.0F, -0.5F);
		GokuHair.addChild(bone7);
		setRotationAngle(bone7, 3.066F, -0.0436F, -2.0927F);
		bone7.setTextureOffset(120, 119).addBox(-1.2424F, -4.075F, -1.2743F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone7.setTextureOffset(120, 119).addBox(-0.7424F, -4.075F, -1.2743F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.4924F, -2.6F, -0.1743F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.2182F);
		bone8.setTextureOffset(120, 119).addBox(-0.75F, -4.075F, -1.1F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone8.setTextureOffset(120, 119).addBox(-0.25F, -4.075F, -1.1F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(3.0F, -6.0F, 0.0F);
		GokuHair.addChild(bone9);
		setRotationAngle(bone9, 3.0772F, -0.0589F, -2.3107F);
		bone9.setTextureOffset(120, 119).addBox(-1.2424F, -3.075F, -0.2743F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(120, 119).addBox(-0.7424F, -3.075F, -0.2743F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.4924F, -2.6F, -0.1743F);
		bone9.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.2182F);
		bone10.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(3.0F, -3.25F, 0.0F);
		GokuHair.addChild(bone11);
		setRotationAngle(bone11, 3.0641F, -0.0403F, -2.0492F);
		bone11.setTextureOffset(120, 119).addBox(-1.2424F, -3.075F, -0.2743F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(120, 119).addBox(-0.7424F, -3.075F, -0.2743F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.4924F, -2.6F, -0.1743F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.2182F);
		bone12.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.1F, -8.4F, -4.0F);
		GokuHair.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.9163F);
		bone3.setTextureOffset(120, 119).addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, -2.6F, 0.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.2182F);
		bone4.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.1F, -7.05F, -1.475F);
		GokuHair.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.9163F);
		bone5.setTextureOffset(120, 119).addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.5F, -2.6F, 0.0F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.2182F);
		bone6.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bone6.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.1F, -3.05F, 0.525F);
		GokuHair.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -1.1345F);
		bone13.setTextureOffset(120, 119).addBox(-1.25F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone13.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-0.5F, -2.6F, 0.0F);
		bone13.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.2182F);
		bone14.setTextureOffset(120, 119).addBox(-0.75F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bone14.setTextureOffset(120, 119).addBox(-0.25F, -3.075F, -0.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		GokuHair.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}