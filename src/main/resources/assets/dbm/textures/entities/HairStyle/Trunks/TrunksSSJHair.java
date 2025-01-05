// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class TrunksSSJHair extends EntityModel<Entity> {
	private final ModelRenderer Hair;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer Main;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public TrunksSSJHair() {
		texWidth = 64;
		texHeight = 64;

		Hair = new ModelRenderer(this);
		Hair.setPos(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setPos(-3.0F, 1.0F, 0.0F);
		Hair.addChild(bone);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-1.5F, -10.0F, 3.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 2.8362F);
		cube_r1.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r1.texOffs(44, 0).addBox(-0.5F, 0.0F, -7.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-1.5F, -10.0F, 1.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 2.7053F);
		cube_r2.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.5F, -10.0F, -1.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 2.4871F);
		cube_r3.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, -10.0F, -3.5F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -0.5942F, 0.5484F, 2.228F);
		bone2.texOffs(44, 0).addBox(-0.2929F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(4.0F, -8.0F, 0.0F);
		Hair.addChild(bone3);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.5F, -1.0F, -3.0F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -2.9671F);
		cube_r4.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.5F, -1.0F, -1.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -2.618F);
		cube_r5.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.5F, -1.0F, 3.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -2.9234F);
		cube_r6.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.5F, -1.0F, 1.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -2.8362F);
		cube_r7.texOffs(44, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(-1.0F, -1.0F, -3.25F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, -0.6353F, -0.4981F, -2.1457F);
		bone4.texOffs(44, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.5F, -9.0F, -4.0F);
		Hair.addChild(bone5);
		setRotationAngle(bone5, 1.2053F, -0.147F, -0.3655F);
		bone5.texOffs(44, 0).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(-0.825F, -9.175F, -4.0F);
		Hair.addChild(bone6);
		setRotationAngle(bone6, 1.2053F, 0.147F, 0.3655F);
		bone6.texOffs(44, 0).addBox(-0.25F, -0.25F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Main = new ModelRenderer(this);
		Main.setPos(0.0F, 0.0F, 0.0F);
		Hair.addChild(Main);
		Main.texOffs(44, 0).addBox(-4.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(-4.5F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(-1.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(0.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(1.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(2.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Main.texOffs(44, 0).addBox(-3.0F, -12.25F, -4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-3.0F, -9.0F, 4.5F);
		Main.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.9671F, 0.0F, 0.0F);
		cube_r8.texOffs(44, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(3.25F, -9.0F, 4.5F);
		Main.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.9234F, 0.0F, 0.0F);
		cube_r9.texOffs(44, 0).addBox(-1.25F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Hair.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}