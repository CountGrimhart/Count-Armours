package grimhart.aota.handlers;

import grimhart.aota.entity.EntityFairy;
import net.minecraft.client.gui.GuiMerchant;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
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
                if(entity != null){
                    if(entity instanceof IMerchant){
                        return new ContainerMerchant(player.inventory, (IMerchant) entity, world);
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
                if(entity != null){
                    if(entity instanceof IMerchant){
                        return new GuiMerchant(player.inventory, (IMerchant) entity, world);
                    }
                }
                return null;
        }
    }
}