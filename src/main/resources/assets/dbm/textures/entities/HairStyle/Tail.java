// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class Tail extends EntityModel<Entity> {
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;

	public Tail() {
		textureWidth = 128;
		textureHeight = 128;

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 10.5F, 2.5F);
		Tail.setTextureOffset(116, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, -0.1F, 7.2F);
		Tail.addChild(Tail2);
		setRotationAngle(Tail2, 1.0036F, 0.0F, 0.0F);
		Tail2.setTextureOffset(116, 49).addBox(-0.5F, -0.4702F, -0.3225F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 0.1298F, 4.3275F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, -0.6109F, 0.0F, 0.0F);
		Tail3.setTextureOffset(116, 49).addBox(-0.5F, -0.6428F, -0.1162F, 1.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}