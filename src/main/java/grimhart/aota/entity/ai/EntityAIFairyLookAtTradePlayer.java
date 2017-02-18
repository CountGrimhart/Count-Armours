package grimhart.aota.entity.ai;

import grimhart.aota.entity.EntityFairy;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIFairyLookAtTradePlayer extends EntityAIWatchClosest
{
    private final EntityFairy theMerchant;

    public EntityAIFairyLookAtTradePlayer(EntityFairy theMerchantIn)
    {
        super(theMerchantIn, EntityPlayer.class, 8.0F);
        this.theMerchant = theMerchantIn;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute()
    {
        if (this.theMerchant.isTrading())
        {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}