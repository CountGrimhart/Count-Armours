package grimhart.aota.network;

import grimhart.aota.client.gui.GuiTrading;
import grimhart.aota.container.ContainerTrading;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * @author The_Fireplace
 */
public class AOTAGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            default:
                Entity entity = world.getEntityByID(ID);
                if (entity != null) {
                    if (entity instanceof IMerchant) {
                        return new ContainerTrading(player.inventory, (IMerchant) entity, world);
                    }
                }
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            default:
                Entity entity = world.getEntityByID(ID);
                if (entity != null) {
                    if (entity instanceof IMerchant) {
                        return new GuiTrading(player.inventory, (IMerchant) entity, world);
                    }
                }
                return null;
        }
    }
}