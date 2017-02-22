package grimhart.aota.network.packets.serverbound;

import grimhart.aota.AOTA;
import grimhart.aota.container.ContainerTrading;
import grimhart.aota.network.packets.AbstractServerMessageHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * @author The_Fireplace
 */
public class TradeSelectionMessage implements IMessage {

    int selectedTradeRecipe;

    public TradeSelectionMessage() {
    }//We must leave an empty constructor for packets or the game will crash.

    public TradeSelectionMessage(int selectedMerchantRecipe) {
        selectedTradeRecipe = selectedMerchantRecipe;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        selectedTradeRecipe = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(selectedTradeRecipe);
    }

    public static class Handler extends AbstractServerMessageHandler<TradeSelectionMessage> {
        @Override
        public IMessage handleServerMessage(EntityPlayer player, TradeSelectionMessage message, MessageContext ctx) {
            Container container = player.openContainer;

            if (container instanceof ContainerTrading) {
                AOTA.logDebug("Recieved trade recipe update packet: Recipe "+message.selectedTradeRecipe);
                ((ContainerTrading) container).setCurrentRecipeIndex(message.selectedTradeRecipe);
            }else{
                AOTA.logError("Trade recipe packet update recieved, but container is not open");
            }
            return null;
        }
    }
}
