// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class TrunksHair extends EntityModel<Entity> {
	private final ModelRenderer Hair;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public TrunksHair() {
		texWidth = 64;
		texHeight = 64;

		Hair = new ModelRenderer(this);
		Hair.setPos(0.0F, 0.0F, 0.0F);
		Hair.texOffs(44, 0).addBox(-4.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(-4.5F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(-1.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(0.25F, -9.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(1.0F, -10.0F, -4.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(2.0F, -9.25F, -4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(-3.0F, -9.25F, -4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Hair.texOffs(44, 0).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-3.0F, 1.0F, 0.0F);
		Hair.addChild(bone);
		bone.texOffs(44, 0).addBox(-2.0F, -10.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone.texOffs(44, 0).addBox(-2.0F, -10.0F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone.texOffs(44, 0).addBox(-2.0F, -10.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone.texOffs(44, 0).addBox(-2.0F, -10.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-0.5F, -10.0F, -3.25F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
		bone2.texOffs(44, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(6.0F, 1.0F, 0.0F);
		Hair.addChild(bone3);
		bone3.texOffs(44, 0).addBox(-2.0F, -10.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone3.texOffs(44, 0).addBox(-2.0F, -10.0F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone3.texOffs(44, 0).addBox(-2.0F, -10.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone3.texOffs(44, 0).addBox(-2.0F, -10.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(-1.75F, -10.0F, -4.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.7854F, 0.0F);
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