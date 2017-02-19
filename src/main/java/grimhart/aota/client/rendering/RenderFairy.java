package grimhart.aota.client.rendering;

import grimhart.aota.entity.EntityFairy;
import net.minecraft.client.model.ModelVex;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFairy extends RenderBiped<EntityFairy>
{
    private static final ResourceLocation FAIRY_TEX = new ResourceLocation("aota","textures/entity/illager/vex.png");
    private int modelVersion;

    public RenderFairy(RenderManager p_i47190_1_)
    {
        super(p_i47190_1_, new ModelVex(), 0.3F);
        this.modelVersion = ((ModelVex)this.mainModel).getModelVersion();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(EntityFairy entity)
    {
        return FAIRY_TEX;
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    @Override
    public void doRender(EntityFairy entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        int i = ((ModelVex)this.mainModel).getModelVersion();

        if (i != this.modelVersion)
        {
            this.mainModel = new ModelVex();
            this.modelVersion = i;
        }

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    @Override
    protected void preRenderCallback(EntityFairy entitylivingbaseIn, float partialTickTime)
    {
        GlStateManager.scale(0.4F, 0.4F, 0.4F);
    }
}