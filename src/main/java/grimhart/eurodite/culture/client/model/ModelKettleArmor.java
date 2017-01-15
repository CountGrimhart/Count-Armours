package grimhart.eurodite.culture.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKettleArmor extends ModelBiped
{
    private ModelRenderer hatpart1;
    private ModelRenderer hatpart2;
    private ModelRenderer hatpart3;
    private ModelRenderer hatpart4;

    public ModelKettleArmor(float scale) {
        super(scale, 0, 64, 64);

        hatpart1 = new ModelRenderer(this, 0, 50);
        hatpart1.addBox(-6F, -5F, -6F, 12, 1, 2);
        hatpart1.setRotationPoint(0F, 0F, 0F);
        hatpart1.setTextureSize(64, 64);
        hatpart1.mirror = true;
        setRotation(hatpart1, 0F, 0F, 0F);
        hatpart2 = new ModelRenderer(this, 0, 36);
        hatpart2.addBox(-6F, -5F, 4F, 12, 1, 2);
        hatpart2.setRotationPoint(0F, 0F, 0F);
        hatpart2.setTextureSize(64, 64);
        hatpart2.mirror = true;
        setRotation(hatpart2, 0F, 0F, 0F);
        hatpart3 = new ModelRenderer(this, 21, 40);
        hatpart3.addBox(4F, -5F, -4F, 2, 1, 8);
        hatpart3.setRotationPoint(0F, 0F, 0F);
        hatpart3.setTextureSize(64, 64);
        hatpart3.mirror = true;
        setRotation(hatpart3, 0F, 0F, 0F);
        hatpart4 = new ModelRenderer(this, 0, 40);
        hatpart4.addBox(-6F, -5F, -4F, 2, 1, 8);
        hatpart4.setRotationPoint(0F, 0F, 0F);
        hatpart4.setTextureSize(64, 64);
        hatpart4.mirror = true;
        setRotation(hatpart4, 0F, 0F, 0F);

        bipedHead.addChild(hatpart1);
        bipedHead.addChild(hatpart2);
        bipedHead.addChild(hatpart3);
        bipedHead.addChild(hatpart4);
    }


    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        hatpart1.render(f5);
        hatpart2.render(f5);
        hatpart3.render(f5);
        hatpart4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}