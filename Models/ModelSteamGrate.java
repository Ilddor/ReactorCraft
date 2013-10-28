// Date: 27/10/2013 10:14:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelSteamGrate extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape2a;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape7;
	ModelRenderer Shape7a;
	ModelRenderer Shape7b;
	ModelRenderer Shape7c;
	ModelRenderer Shape7d;
	ModelRenderer Shape7e;
	ModelRenderer Shape7f;
	ModelRenderer Shape7g;
	ModelRenderer Shape7h;
	ModelRenderer Shape6;
	ModelRenderer Shape6a;
	ModelRenderer Shape6b;

	public ModelSteamGrate()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 63, 72);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 33, 37);
		Shape2.addBox(0F, 0F, 0F, 16, 15, 1);
		Shape2.setRotationPoint(-8F, 8F, 7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 33, 55);
		Shape2a.addBox(0F, 0F, 0F, 16, 15, 1);
		Shape2a.setRotationPoint(-8F, 8F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 33, 89);
		Shape3.addBox(0F, 0F, 0F, 1, 15, 14);
		Shape3.setRotationPoint(-8F, 8F, -7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 89);
		Shape3a.addBox(0F, 0F, 0F, 1, 15, 14);
		Shape3a.setRotationPoint(7F, 8F, -7F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 64, 0);
		Shape4.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape4.setRotationPoint(-7F, 22F, -7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 65);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7.setRotationPoint(4F, 8.2F, -7F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new ModelRenderer(this, 0, 65);
		Shape7a.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7a.setRotationPoint(-3.5F, 8.2F, -7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new ModelRenderer(this, 0, 65);
		Shape7b.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7b.setRotationPoint(1F, 8.2F, -7F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new ModelRenderer(this, 0, 65);
		Shape7c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7c.setRotationPoint(-5F, 8.2F, -7F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape7d = new ModelRenderer(this, 0, 65);
		Shape7d.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7d.setRotationPoint(-6.5F, 8.2F, -7F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, 0F, 0F);
		Shape7e = new ModelRenderer(this, 0, 65);
		Shape7e.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7e.setRotationPoint(5.5F, 8.2F, -7F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0F, 0F);
		Shape7f = new ModelRenderer(this, 0, 65);
		Shape7f.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7f.setRotationPoint(2.5F, 8.2F, -7F);
		Shape7f.setTextureSize(128, 128);
		Shape7f.mirror = true;
		this.setRotation(Shape7f, 0F, 0F, 0F);
		Shape7g = new ModelRenderer(this, 0, 65);
		Shape7g.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7g.setRotationPoint(-2F, 8.2F, -7F);
		Shape7g.setTextureSize(128, 128);
		Shape7g.mirror = true;
		this.setRotation(Shape7g, 0F, 0F, 0F);
		Shape7h = new ModelRenderer(this, 0, 65);
		Shape7h.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7h.setRotationPoint(-0.5F, 8.2F, -7F);
		Shape7h.setTextureSize(128, 128);
		Shape7h.mirror = true;
		this.setRotation(Shape7h, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 80);
		Shape6.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6.setRotationPoint(-7F, 8.3F, -4F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new ModelRenderer(this, 0, 80);
		Shape6a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6a.setRotationPoint(-7F, 8.3F, -0.5F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new ModelRenderer(this, 0, 80);
		Shape6b.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6b.setRotationPoint(-7F, 8.3F, 3F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape2a.render(f5);
		Shape3.render(f5);
		Shape3a.render(f5);
		Shape4.render(f5);
		Shape7.render(f5);
		Shape7a.render(f5);
		Shape7b.render(f5);
		Shape7c.render(f5);
		Shape7d.render(f5);
		Shape7e.render(f5);
		Shape7f.render(f5);
		Shape7g.render(f5);
		Shape7h.render(f5);
		Shape6.render(f5);
		Shape6a.render(f5);
		Shape6b.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
