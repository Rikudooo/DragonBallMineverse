// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class HairVegeta extends EntityModel<Entity> {
	private final ModelRenderer VegetaHair;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r11_r1_r1;
	private final ModelRenderer cube_r11_r1_r2;

	public HairVegeta() {
		textureWidth = 128;
		textureHeight = 128;

		VegetaHair = new ModelRenderer(this);
		VegetaHair.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1309F);
		cube_r1.setTextureOffset(37, 0).addBox(4.0F, -2.475F, 1.275F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
		cube_r2.setTextureOffset(37, 0).addBox(-3.0F, -2.725F, 1.275F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(37, 0).addBox(-2.0F, -6.0F, -0.725F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(-1.0F, -7.0F, 0.025F, 4.0F, 7.0F, 5.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(-1.0F, -7.0F, -0.975F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(3.0F, -6.0F, -0.925F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(2.0F, -7.0F, -0.975F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(1.0F, -8.0F, -0.975F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(3.0F, 0.0F, -0.975F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(-3.0F, 0.0F, -0.975F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(0.0F, 0.0F, -0.975F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(37, 0).addBox(0.0F, -8.0F, -0.975F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(37, 0).addBox(-2.0F, -4.75F, 6.4F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(-2.0F, -4.75F, 5.225F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(-1.0F, -5.75F, 5.225F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(-1.0F, -5.75F, 5.225F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(0.0F, -6.75F, 5.225F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(0.0F, -6.75F, 5.225F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(1.0F, -0.25F, 7.25F);
		cube_r4.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -0.2182F, 0.0F, 0.0F);
		cube_r5_r1.setTextureOffset(37, 0).addBox(-3.0F, -4.5F, -0.85F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.3491F, 0.0F);
		cube_r5.setTextureOffset(37, 0).addBox(-2.625F, -5.4F, -1.375F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -7.75F, -3.25F);
		VegetaHair.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3491F, -0.3491F, 0.0F);
		cube_r6.setTextureOffset(37, 0).addBox(3.625F, -5.4F, -2.125F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(1.0F, 1.75F, 3.25F);
		cube_r6.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.0F, 0.0F, 0.3054F);
		cube_r10_r1.setTextureOffset(37, 0).addBox(3.125F, -7.15F, -0.625F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r10_r1.setTextureOffset(37, 0).addBox(2.875F, -7.15F, -2.125F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r10_r1.setTextureOffset(37, 0).addBox(2.625F, -7.15F, -3.625F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r10_r1.setTextureOffset(37, 0).addBox(1.875F, -7.15F, -5.125F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.9F, -5.75F, -3.0F);
		VegetaHair.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3491F, -0.3491F, -0.4363F);
		

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(4.0F, 1.75F, 3.25F);
		cube_r7.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0F, 0.0F, 0.349F);
		cube_r11_r1.setTextureOffset(37, 0).addBox(0.6638F, -6.248F, -0.625F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r11_r1_r1 = new ModelRenderer(this);
		cube_r11_r1_r1.setRotationPoint(4.0388F, 28.902F, -0.25F);
		cube_r11_r1.addChild(cube_r11_r1_r1);
		setRotationAngle(cube_r11_r1_r1, 0.0F, 0.2618F, 0.0F);
		cube_r11_r1_r1.setTextureOffset(37, 0).addBox(-3.575F, -35.15F, -6.125F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r11_r1_r1.setTextureOffset(37, 0).addBox(-3.775F, -35.15F, -4.125F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r11_r1_r2 = new ModelRenderer(this);
		cube_r11_r1_r2.setRotationPoint(4.0388F, 28.902F, -0.25F);
		cube_r11_r1.addChild(cube_r11_r1_r2);
		setRotationAngle(cube_r11_r1_r2, 0.0F, 0.2182F, 0.0F);
		cube_r11_r1_r2.setTextureOffset(37, 0).addBox(-3.625F, -35.15F, -2.375F, 2.0F, 6.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		VegetaHair.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}