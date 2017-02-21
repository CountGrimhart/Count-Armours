package grimhart.aota.entity.ai;

import grimhart.aota.entity.EntityTradeable;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAILookAtTradePlayer extends EntityAIWatchClosest {
    private final EntityTradeable theMerchant;

    public EntityAILookAtTradePlayer(EntityTradeable theMerchantIn) {
        super(theMerchantIn, EntityPlayer.class, 8.0F);
        this.theMerchant = theMerchantIn;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        if (this.theMerchant.isTrading()) {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        } else {
            return false;
        }
    }
}