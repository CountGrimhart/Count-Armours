package grimhart.aota.client.network;

import grimhart.aota.client.model.ModelKettleArmor;
import grimhart.aota.client.rendering.FairyRenderFactory;
import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
import grimhart.aota.init.ModTools;
import grimhart.aota.network.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModTools.registerRenders();
        ModArmour.registerRenders();

        RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new FairyRenderFactory());
    }

    @Override
    public ModelBiped getArmorModel(int id) {
        switch (id) {
            case 0:
            default:
                return new ModelKettleArmor(1.0F);
        }
    }

    @Override
    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return (ctx.side.isClient() ? Minecraft.getMinecraft().player : super.getPlayerEntity(ctx));
    }
}
