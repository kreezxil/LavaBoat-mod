package LavaBoat.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/*
 * LavaBoat mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModelDoubleBoat extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;

    public ModelDoubleBoat() {
        textureWidth = 256;
        textureHeight = 64;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-20F, -4F, -9F, 48, 1, 18);
        Shape1.setRotationPoint(-10F, 0F, 0F);
        Shape1.setTextureSize(256, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 114, 0);
        Shape2.addBox(-20F, -3F, -8F, 48, 1, 16);
        Shape2.setRotationPoint(-10F, 0F, 0F);
        Shape2.setTextureSize(256, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 108, 19);
        Shape3.addBox(-20F, -2F, -7F, 48, 1, 14);
        Shape3.setRotationPoint(-10F, 0F, 0F);
        Shape3.setTextureSize(256, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 0, 27);
        Shape4.addBox(-20F, -1F, -6F, 48, 1, 12);
        Shape4.setRotationPoint(-10F, 0F, 0F);
        Shape4.setTextureSize(256, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 19);
        Shape5.addBox(-20F, -10F, -10F, 48, 6, 2);
        Shape5.setRotationPoint(-10F, 0F, 0F);
        Shape5.setTextureSize(256, 64);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 0, 19);
        Shape6.addBox(-20F, -10F, 8F, 48, 6, 2);
        Shape6.setRotationPoint(-10F, 0F, 0F);
        Shape6.setTextureSize(256, 64);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 0, 42);
        Shape7.addBox(-20F, -10F, -8F, 2, 6, 16);
        Shape7.setRotationPoint(-10F, 0F, 0F);
        Shape7.setTextureSize(256, 64);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 0, 42);
        Shape8.addBox(0F, 0F, 0F, 2, 6, 16);
        Shape8.setRotationPoint(16F, -10F, -8F);
        Shape8.setTextureSize(256, 64);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
