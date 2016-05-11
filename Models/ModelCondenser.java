/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 27/10/2013 9:39:46 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelCondenser extends RotaryModelBase
{
	//fields
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape1;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape4d;
	LODModelPart Shape4e;
	LODModelPart Shape4f;
	LODModelPart Shape4g;
	LODModelPart Shape4h;
	LODModelPart Shape4i;
	LODModelPart Shape4j;
	LODModelPart Shape4k;
	LODModelPart Shape4l;
	LODModelPart Shape4m;
	LODModelPart Shape4n;
	LODModelPart Shape4o;
	LODModelPart Shape4p;
	LODModelPart Shape4q;
	LODModelPart Shape4r;
	LODModelPart Shape4s;
	LODModelPart Shape4t;
	LODModelPart Shape4u;
	LODModelPart Shape4w;
	LODModelPart Shape4x;
	LODModelPart Shape4y;
	LODModelPart Shape4z;
	LODModelPart Shape4aa;
	LODModelPart Shape4ab;
	LODModelPart Shape4ac;
	LODModelPart Shape4ad;
	LODModelPart Shape4ae;
	LODModelPart Shape4af;
	LODModelPart Shape4ag;
	LODModelPart Shape4ah;
	LODModelPart Shape4ai;
	LODModelPart Shape4aj;

	public ModelCondenser()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape2 = new LODModelPart(this, 0, 65);
		Shape2.addBox(0F, 0F, 0F, 2, 1, 14);
		Shape2.setRotationPoint(-6F, 22F, -7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 82);
		Shape2a.addBox(0F, 0F, 0F, 2, 1, 14);
		Shape2a.setRotationPoint(-3F, 22F, -7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 20, 0);
		Shape2b.addBox(0F, 0F, 0F, 2, 1, 14);
		Shape2b.setRotationPoint(4F, 22F, -7F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 99);
		Shape2c.addBox(0F, 0F, 0F, 2, 1, 14);
		Shape2c.setRotationPoint(1F, 22F, -7F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 60, 0);
		Shape3.addBox(0F, 0F, 0F, 16, 3, 16);
		Shape3.setRotationPoint(-8F, 8F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 22);
		Shape3a.addBox(0F, 0F, 0F, 16, 3, 16);
		Shape3a.setRotationPoint(-8F, 19F, -8F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape1 = new LODModelPart(this, 0, 44);
		Shape1.addBox(0F, 0F, 0F, 12, 8, 12);
		Shape1.setRotationPoint(-6F, 11F, -6F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape4.setRotationPoint(-4F, 11F, -7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 0);
		Shape4a.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape4a.setRotationPoint(0F, 16F, -7F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 0);
		Shape4b.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape4b.setRotationPoint(6F, 11F, 1F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 0, 0);
		Shape4c.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4c.setRotationPoint(4F, 13F, -7F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape4d = new LODModelPart(this, 0, 0);
		Shape4d.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4d.setRotationPoint(2F, 11F, -7F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 0F);
		Shape4e = new LODModelPart(this, 0, 0);
		Shape4e.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4e.setRotationPoint(-2F, 11F, -7F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 0F, 0F);
		Shape4f = new LODModelPart(this, 0, 0);
		Shape4f.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4f.setRotationPoint(-1F, 16F, -7F);
		Shape4f.setTextureSize(128, 128);
		Shape4f.mirror = true;
		this.setRotation(Shape4f, 0F, 0F, 0F);
		Shape4g = new LODModelPart(this, 0, 0);
		Shape4g.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape4g.setRotationPoint(2F, 14F, -7F);
		Shape4g.setTextureSize(128, 128);
		Shape4g.mirror = true;
		this.setRotation(Shape4g, 0F, 0F, 0F);
		Shape4h = new LODModelPart(this, 0, 0);
		Shape4h.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4h.setRotationPoint(0F, 11F, -7F);
		Shape4h.setTextureSize(128, 128);
		Shape4h.mirror = true;
		this.setRotation(Shape4h, 0F, 0F, 0F);
		Shape4i = new LODModelPart(this, 0, 0);
		Shape4i.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4i.setRotationPoint(1F, 14F, -7F);
		Shape4i.setTextureSize(128, 128);
		Shape4i.mirror = true;
		this.setRotation(Shape4i, 0F, 0F, 0F);
		Shape4j = new LODModelPart(this, 0, 0);
		Shape4j.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape4j.setRotationPoint(3F, 12F, -7F);
		Shape4j.setTextureSize(128, 128);
		Shape4j.mirror = true;
		this.setRotation(Shape4j, 0F, 0F, 0F);
		Shape4k = new LODModelPart(this, 0, 0);
		Shape4k.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape4k.setRotationPoint(6F, 15F, -5F);
		Shape4k.setTextureSize(128, 128);
		Shape4k.mirror = true;
		this.setRotation(Shape4k, 0F, 0F, 0F);
		Shape4l = new LODModelPart(this, 0, 0);
		Shape4l.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape4l.setRotationPoint(6F, 12F, -6F);
		Shape4l.setTextureSize(128, 128);
		Shape4l.mirror = true;
		this.setRotation(Shape4l, 0F, 0F, 0F);
		Shape4m = new LODModelPart(this, 0, 0);
		Shape4m.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4m.setRotationPoint(5F, 13F, 6F);
		Shape4m.setTextureSize(128, 128);
		Shape4m.mirror = true;
		this.setRotation(Shape4m, 0F, 0F, 0F);
		Shape4n = new LODModelPart(this, 0, 0);
		Shape4n.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4n.setRotationPoint(6F, 13F, -5F);
		Shape4n.setTextureSize(128, 128);
		Shape4n.mirror = true;
		this.setRotation(Shape4n, 0F, 0F, 0F);
		Shape4o = new LODModelPart(this, 0, 0);
		Shape4o.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape4o.setRotationPoint(6F, 16F, -3F);
		Shape4o.setTextureSize(128, 128);
		Shape4o.mirror = true;
		this.setRotation(Shape4o, 0F, 0F, 0F);
		Shape4p = new LODModelPart(this, 0, 0);
		Shape4p.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape4p.setRotationPoint(6F, 11F, -3F);
		Shape4p.setTextureSize(128, 128);
		Shape4p.mirror = true;
		this.setRotation(Shape4p, 0F, 0F, 0F);
		Shape4q = new LODModelPart(this, 0, 0);
		Shape4q.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape4q.setRotationPoint(4F, 11F, 6F);
		Shape4q.setTextureSize(128, 128);
		Shape4q.mirror = true;
		this.setRotation(Shape4q, 0F, 0F, 0F);
		Shape4r = new LODModelPart(this, 0, 0);
		Shape4r.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4r.setRotationPoint(6F, 13F, -1F);
		Shape4r.setTextureSize(128, 128);
		Shape4r.mirror = true;
		this.setRotation(Shape4r, 0F, 0F, 0F);
		Shape4s = new LODModelPart(this, 0, 0);
		Shape4s.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape4s.setRotationPoint(-7F, 15F, -2F);
		Shape4s.setTextureSize(128, 128);
		Shape4s.mirror = true;
		this.setRotation(Shape4s, 0F, 0F, 0F);
		Shape4t = new LODModelPart(this, 0, 0);
		Shape4t.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4t.setRotationPoint(6F, 13F, -2F);
		Shape4t.setTextureSize(128, 128);
		Shape4t.mirror = true;
		this.setRotation(Shape4t, 0F, 0F, 0F);
		Shape4u = new LODModelPart(this, 0, 0);
		Shape4u.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape4u.setRotationPoint(6F, 13F, 5F);
		Shape4u.setTextureSize(128, 128);
		Shape4u.mirror = true;
		this.setRotation(Shape4u, 0F, 0F, 0F);
		Shape4w = new LODModelPart(this, 0, 0);
		Shape4w.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4w.setRotationPoint(6F, 13F, 4F);
		Shape4w.setTextureSize(128, 128);
		Shape4w.mirror = true;
		this.setRotation(Shape4w, 0F, 0F, 0F);
		Shape4x = new LODModelPart(this, 0, 0);
		Shape4x.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape4x.setRotationPoint(2F, 11F, 6F);
		Shape4x.setTextureSize(128, 128);
		Shape4x.mirror = true;
		this.setRotation(Shape4x, 0F, 0F, 0F);
		Shape4y = new LODModelPart(this, 0, 0);
		Shape4y.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape4y.setRotationPoint(0F, 11F, 6F);
		Shape4y.setTextureSize(128, 128);
		Shape4y.mirror = true;
		this.setRotation(Shape4y, 0F, 0F, 0F);
		Shape4z = new LODModelPart(this, 0, 0);
		Shape4z.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4z.setRotationPoint(-4F, 11F, 6F);
		Shape4z.setTextureSize(128, 128);
		Shape4z.mirror = true;
		this.setRotation(Shape4z, 0F, 0F, 0F);
		Shape4aa = new LODModelPart(this, 0, 0);
		Shape4aa.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape4aa.setRotationPoint(-3F, 14F, 6F);
		Shape4aa.setTextureSize(128, 128);
		Shape4aa.mirror = true;
		this.setRotation(Shape4aa, 0F, 0F, 0F);
		Shape4ab = new LODModelPart(this, 0, 0);
		Shape4ab.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4ab.setRotationPoint(-2F, 11F, 6F);
		Shape4ab.setTextureSize(128, 128);
		Shape4ab.mirror = true;
		this.setRotation(Shape4ab, 0F, 0F, 0F);
		Shape4ac = new LODModelPart(this, 0, 0);
		Shape4ac.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape4ac.setRotationPoint(-5F, 12F, 6F);
		Shape4ac.setTextureSize(128, 128);
		Shape4ac.mirror = true;
		this.setRotation(Shape4ac, 0F, 0F, 0F);
		Shape4ad = new LODModelPart(this, 0, 0);
		Shape4ad.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4ad.setRotationPoint(-7F, 11F, -2F);
		Shape4ad.setTextureSize(128, 128);
		Shape4ad.mirror = true;
		this.setRotation(Shape4ad, 0F, 0F, 0F);
		Shape4ae = new LODModelPart(this, 0, 0);
		Shape4ae.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape4ae.setRotationPoint(-7F, 16F, -5F);
		Shape4ae.setTextureSize(128, 128);
		Shape4ae.mirror = true;
		this.setRotation(Shape4ae, 0F, 0F, 0F);
		Shape4af = new LODModelPart(this, 0, 0);
		Shape4af.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4af.setRotationPoint(-7F, 13F, 4F);
		Shape4af.setTextureSize(128, 128);
		Shape4af.mirror = true;
		this.setRotation(Shape4af, 0F, 0F, 0F);
		Shape4ag = new LODModelPart(this, 0, 0);
		Shape4ag.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4ag.setRotationPoint(-7F, 11F, 0F);
		Shape4ag.setTextureSize(128, 128);
		Shape4ag.mirror = true;
		this.setRotation(Shape4ag, 0F, 0F, 0F);
		Shape4ah = new LODModelPart(this, 0, 0);
		Shape4ah.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape4ah.setRotationPoint(-7F, 13F, 0F);
		Shape4ah.setTextureSize(128, 128);
		Shape4ah.mirror = true;
		this.setRotation(Shape4ah, 0F, 0F, 0F);
		Shape4ai = new LODModelPart(this, 0, 0);
		Shape4ai.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4ai.setRotationPoint(-7F, 15F, 1F);
		Shape4ai.setTextureSize(128, 128);
		Shape4ai.mirror = true;
		this.setRotation(Shape4ai, 0F, 0F, 0F);
		Shape4aj = new LODModelPart(this, 0, 0);
		Shape4aj.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape4aj.setRotationPoint(-7F, 11F, -4F);
		Shape4aj.setTextureSize(128, 128);
		Shape4aj.mirror = true;
		this.setRotation(Shape4aj, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape1.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
		Shape4d.render(te, f5);
		Shape4e.render(te, f5);
		Shape4f.render(te, f5);
		Shape4g.render(te, f5);
		Shape4h.render(te, f5);
		Shape4i.render(te, f5);
		Shape4j.render(te, f5);
		Shape4k.render(te, f5);
		Shape4l.render(te, f5);
		Shape4m.render(te, f5);
		Shape4n.render(te, f5);
		Shape4o.render(te, f5);
		Shape4p.render(te, f5);
		Shape4q.render(te, f5);
		Shape4r.render(te, f5);
		Shape4s.render(te, f5);
		Shape4t.render(te, f5);
		Shape4u.render(te, f5);
		Shape4w.render(te, f5);
		Shape4x.render(te, f5);
		Shape4y.render(te, f5);
		Shape4z.render(te, f5);
		Shape4aa.render(te, f5);
		Shape4ab.render(te, f5);
		Shape4ac.render(te, f5);
		Shape4ad.render(te, f5);
		Shape4ae.render(te, f5);
		Shape4af.render(te, f5);
		Shape4ag.render(te, f5);
		Shape4ah.render(te, f5);
		Shape4ai.render(te, f5);
		Shape4aj.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
