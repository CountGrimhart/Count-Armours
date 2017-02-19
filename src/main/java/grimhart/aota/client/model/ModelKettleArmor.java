package grimhart.aota.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
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
        hatpart1.setTextureSize(64, 64);
        hatpart2 = new ModelRenderer(this, 0, 36);
        hatpart2.addBox(-6F, -5F, 4F, 12, 1, 2);
        hatpart2.setTextureSize(64, 64);
        hatpart3 = new ModelRenderer(this, 21, 40);
        hatpart3.addBox(4F, -5F, -4F, 2, 1, 8);
        hatpart3.setTextureSize(64, 64);
        hatpart4 = new ModelRenderer(this, 0, 40);
        hatpart4.addBox(-6F, -5F, -4F, 2, 1, 8);
        hatpart4.setTextureSize(64, 64);

        bipedHead.addChild(hatpart1);
        bipedHead.addChild(hatpart2);
        bipedHead.addChild(hatpart3);
        bipedHead.addChild(hatpart4);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}