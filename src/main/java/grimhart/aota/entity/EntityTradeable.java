package grimhart.aota.entity;

import grimhart.aota.AOTA;
import grimhart.aota.entity.ai.EntityAILookAtTradePlayer;
import grimhart.aota.entity.ai.EntityAITradePlayer;
import grimhart.aota.init.ModItems;
import grimhart.aota.trading.AOTATradeRegistry;
import grimhart.aota.trading.EnumTradeEntity;
import grimhart.aota.trading.ITradeList;
import net.minecraft.entity.*;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author The_Fireplace
 */
public abstract class EntityTradeable extends EntityCreature implements IMerchant, INpc {
    protected EntityPlayer buyingPlayer;
    @Nullable
    protected MerchantRecipeList buyingList;
    protected int timeUntilReset;
    protected boolean needsInitilization;
    protected int wealth;
    protected String lastBuyingPlayer;
    protected int careerLevel;

    public EntityTradeable(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAITradePlayer(this));
        this.tasks.addTask(1, new EntityAILookAtTradePlayer(this));
    }

    @Override
    protected void updateAITasks() {
        if (!this.isTrading() && this.timeUntilReset > 0) {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0) {
                if (this.needsInitilization) {
                    AOTA.logDebug("Initializing Tradeable entity " + hashCode());
                    for (MerchantRecipe merchantrecipe : this.buyingList) {
                        if (merchantrecipe.isRecipeDisabled()) {
                            merchantrecipe.increaseMaxTradeUses(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                        }
                    }

                    this.populateBuyingList();
                    this.needsInitilization = false;

                    if (this.lastBuyingPlayer != null) {
                        this.world.setEntityState(this, (byte) 14);
                    }
                }

                this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 0));
            }
        }

        super.updateAITasks();
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = itemstack.getItem() == Items.NAME_TAG;

        if (flag) {
            return itemstack.interactWithEntity(player, this, hand);
        } else if (this.isEntityAlive() && !this.isTrading()) {
            if (this.buyingList == null) {
                this.populateBuyingList();
            }

            if (!this.buyingList.isEmpty()) {
                FMLNetworkHandler.openGui(player, AOTA.instance, hashCode(), world, (int) posX, (int) posY, (int) posZ);
                if (!this.world.isRemote)
                    this.setCustomer(player);
                return true;
            } else {
                AOTA.logWarn("Tradeable entity " + hashCode() + " has an empty buyingList.");
                return super.processInteract(player, hand);
            }
        } else {
            return super.processInteract(player, hand);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("Riches", this.wealth);
        compound.setInteger("CareerLevel", this.careerLevel);

        if (this.buyingList != null) {
            compound.setTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.wealth = compound.getInteger("Riches");
        this.careerLevel = compound.getInteger("CareerLevel");

        if (compound.hasKey("Offers", 10)) {
            NBTTagCompound nbttagcompound = compound.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(nbttagcompound);
        }
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return this.isTrading() ? SoundEvents.ENTITY_VILLAGER_TRADING : SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound() {
        return SoundEvents.ENTITY_VILLAGER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VILLAGER_DEATH;
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        return LootTableList.ENTITIES_VILLAGER;
    }

    @Override
    public void setRevengeTarget(@Nullable EntityLivingBase livingBase) {
        super.setRevengeTarget(livingBase);

        if (livingBase != null) {
            if (livingBase instanceof EntityPlayer) {
                if (this.isEntityAlive()) {
                    this.world.setEntityState(this, (byte) 13);
                }
            }
        }
    }

    @Override
    public void setCustomer(@Nullable EntityPlayer player) {
        this.buyingPlayer = player;
    }

    @Override
    public EntityPlayer getCustomer() {
        return this.buyingPlayer;
    }

    public boolean isTrading() {
        return this.buyingPlayer != null;
    }

    @Override
    public void useRecipe(MerchantRecipe recipe) {
        recipe.incrementToolUses();
        this.livingSoundTime = -this.getTalkInterval();
        this.playSound(SoundEvents.ENTITY_VILLAGER_YES, this.getSoundVolume(), this.getSoundPitch());
        int i = 3 + this.rand.nextInt(4);

        if (recipe.getToolUses() == 1 || this.rand.nextInt(5) == 0) {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null) {
                this.lastBuyingPlayer = this.buyingPlayer.getName();
            } else {
                this.lastBuyingPlayer = null;
            }

            i += 5;
        }

        if (recipe.getItemToBuy().getItem() == ModItems.trading_token) {
            this.wealth += recipe.getItemToBuy().getCount();
        }

        if (recipe.getRewardsExp()) {
            this.world.spawnEntity(new EntityXPOrb(this.world, this.posX, this.posY + 0.5D, this.posZ, i));
        }
    }

    @Override
    public void verifySellingItem(ItemStack stack) {
        if (!this.world.isRemote && this.livingSoundTime > -this.getTalkInterval() + 20) {
            this.livingSoundTime = -this.getTalkInterval();
            this.playSound(stack.isEmpty() ? SoundEvents.ENTITY_VILLAGER_NO : SoundEvents.ENTITY_VILLAGER_YES, this.getSoundVolume(), this.getSoundPitch());
        }
    }

    @Nullable
    @Override
    public MerchantRecipeList getRecipes(EntityPlayer player) {
        if (this.buyingList == null) {
            this.populateBuyingList();
        }

        return this.buyingList;
    }

    protected void populateBuyingList() {
        AOTA.logTrace("Populating buying list of Tradeable entity " + hashCode());
        if (this.careerLevel != 0) {
            ++this.careerLevel;
        } else {
            this.careerLevel = 1;
        }

        if (this.buyingList == null) {
            this.buyingList = new MerchantRecipeList();
        }

        List<ITradeList> trades = AOTATradeRegistry.getTradesOfType(EnumTradeEntity.FAIRY);

        if (trades != null) {
            for (ITradeList itradelist : trades) {
                itradelist.addMerchantRecipe(this, this.buyingList, this.rand);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setRecipes(@Nullable MerchantRecipeList recipeList) {
        this.buyingList = recipeList;
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public BlockPos getPos() {
        return new BlockPos(this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleStatusUpdate(byte id) {
        if (id == 12) {
            this.spawnParticles(EnumParticleTypes.HEART);
        } else if (id == 13) {
            this.spawnParticles(EnumParticleTypes.VILLAGER_ANGRY);
        } else if (id == 14) {
            this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
        } else {
            super.handleStatusUpdate(id);
        }
    }

    @SideOnly(Side.CLIENT)
    private void spawnParticles(EnumParticleTypes particleType) {
        for (int i = 0; i < 5; ++i) {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.spawnParticle(particleType, this.posX + (double) (this.rand.nextFloat() * this.width * 2.0F) - (double) this.width, this.posY + 1.0D + (double) (this.rand.nextFloat() * this.height), this.posZ + (double) (this.rand.nextFloat() * this.width * 2.0F) - (double) this.width, d0, d1, d2);
        }
    }

    @Nullable
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingData) {
        livingData = super.onInitialSpawn(difficulty, livingData);
        AOTA.logTrace("Spawned new Tradeable entity: " + hashCode() + " of type " + this.getEntityString());
        this.populateBuyingList();
        return livingData;
    }

    @Override
    public boolean canBeLeashedTo(EntityPlayer player) {
        return false;
    }
}
