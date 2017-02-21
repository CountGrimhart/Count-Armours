package grimhart.aota.entity.ai;

import grimhart.aota.entity.EntityTradeable;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAITradePlayer extends EntityAIBase {
    private final EntityTradeable tradeEntity;

    public EntityAITradePlayer(EntityTradeable tradeEntityIn) {
        this.tradeEntity = tradeEntityIn;
        this.setMutexBits(5);
    }

    @Override
    public boolean shouldExecute() {
        if (!this.tradeEntity.isEntityAlive()) {
            return false;
        } else if (this.tradeEntity.isInWater()) {
            return false;
        } else if (!this.tradeEntity.onGround) {
            return false;
        } else if (this.tradeEntity.velocityChanged) {
            return false;
        } else {
            EntityPlayer entityplayer = this.tradeEntity.getCustomer();
            return entityplayer == null ? false : (this.tradeEntity.getDistanceSqToEntity(entityplayer) > 16.0D ? false : entityplayer.openContainer != null);
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        this.tradeEntity.getNavigator().clearPathEntity();
    }

    /**
     * Resets the task
     */
    public void resetTask() {
        this.tradeEntity.setCustomer(null);
    }
}