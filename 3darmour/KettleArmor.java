// Date: 11/20/2016 1:58:34 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelKettleArmor extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer hatpart1;
    ModelRenderer hatpart2;
    ModelRenderer hatpart3;
    ModelRenderer hatpart4;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelKettleArmor()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
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
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    hatpart1.render(f5);
    hatpart2.render(f5);
    hatpart3.render(f5);
    hatpart4.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
