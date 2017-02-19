package grimhart.aota.client.rendering;

import grimhart.aota.entity.EntityFairy;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * @author The_Fireplace
 */
public class FairyRenderFactory implements IRenderFactory<EntityFairy> {
    @Override
    public Render<? super EntityFairy> createRenderFor(RenderManager manager) {
        return new RenderFairy(manager);
    }
}
