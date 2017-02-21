package grimhart.aota.entity;

import grimhart.aota.AOTA;
import grimhart.aota.entity.ai.EntityAIFairyLookAtTradePlayer;
import grimhart.aota.entity.ai.EntityAIFairyTradePlayer;
import grimhart.aota.init.ModItems;
import grimhart.aota.trading.AOTATradeRegistry;
import grimhart.aota.trading.EnumTradeEntity;
import grimhart.aota.trading.ITradeList;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.storage.MapDecoration;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * @author The_Fireplace
 */
@ParametersAreNonnullByDefault
public class EntityFairy extends EntityCreature implements IMerchant, INpc {
    /** This villager's current customer. */
    private EntityPlayer buyingPlayer;
    /** Initialises the MerchantRecipeList.java */
    @Nullable
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    /** addDefaultEquipmentAndRecipies is called if this is true */
    private boolean needsInitilization;
    private int wealth;
    /** Last player to trade with this villager, used for aggressivity. */
    private String lastBuyingPlayer;
    /** This is the EntityFairy's career level value */
    private int careerLevel;
    public EntityFairy(World worldIn) {
        super(worldIn);
        this.setSize(0.4F, 0.8F);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIFairyTradePlayer(this));
        this.tasks.addTask(1, new EntityAIFairyLookAtTradePlayer(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(6, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
    }

    @Override
    protected void updateAITasks()
    {
        if (!this.isTrading() && this.timeUntilReset > 0)
        {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0)
            {
                if (this.needsInitilization)
                {
                    AOTA.logDebug("Initializing Fairy "+hashCode());
                    for (MerchantRecipe merchantrecipe : this.buyingList)
                    {
                        if (merchantrecipe.isRecipeDisabled())
                        {
                            merchantrecipe.increaseMaxTradeUses(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                        }
                    }

                    this.populateBuyingList();
                    this.needsInitilization = false;

                    if (this.lastBuyingPlayer != null)
                    {
                        this.world.setEntityState(this, (byte)14);
                    }
                }

                this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 0));
            }
        }

        super.updateAITasks();
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = itemstack.getItem() == Items.NAME_TAG;

        if (flag)
        {
            itemstack.interactWithEntity(player, this, hand);
            return true;
        }
        else if (this.isEntityAlive() && !this.isTrading())
        {
            if (this.buyingList == null)
            {
                this.populateBuyingList();
            }

            if (!this.world.isRemote && !this.buyingList.isEmpty())
            {
                this.setCustomer(player);
                player.openGui(AOTA.instance, hashCode(), world, (int)posX, (int)posY, (int)posZ);
            }
            else if (this.buyingList.isEmpty())
            {
                return super.processInteract(player, hand);
            }

            return true;
        }
        else
        {
            return super.processInteract(player, hand);
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Riches", this.wealth);
        compound.setInteger("CareerLevel", this.careerLevel);

        if (this.buyingList != null)
        {
            compound.setTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.wealth = compound.getInteger("Riches");
        this.careerLevel = compound.getInteger("CareerLevel");

        if (compound.hasKey("Offers", 10))
        {
            NBTTagCompound nbttagcompound = compound.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(nbttagcompound);
        }
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    @Override
    protected boolean canDespawn()
    {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return this.isTrading() ? SoundEvents.ENTITY_VILLAGER_TRADING : SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound()
    {
        return SoundEvents.ENTITY_VILLAGER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_VILLAGER_DEATH;
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_VILLAGER;
    }

    @Override
    public void setRevengeTarget(@Nullable EntityLivingBase livingBase)
    {
        super.setRevengeTarget(livingBase);

        if (livingBase != null)
        {
            if (livingBase instanceof EntityPlayer)
            {
                if (this.isEntityAlive())
                {
                    this.world.setEntityState(this, (byte)13);
                }
            }
        }
    }

    @Override
    public void setCustomer(@Nullable EntityPlayer player)
    {
        this.buyingPlayer = player;
    }

    @Override
    public EntityPlayer getCustomer()
    {
        return this.buyingPlayer;
    }

    public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

    @Override
    public void useRecipe(MerchantRecipe recipe)
    {
        recipe.incrementToolUses();
        this.livingSoundTime = -this.getTalkInterval();
        this.playSound(SoundEvents.ENTITY_VILLAGER_YES, this.getSoundVolume(), this.getSoundPitch());
        int i = 3 + this.rand.nextInt(4);

        if (recipe.getToolUses() == 1 || this.rand.nextInt(5) == 0)
        {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null)
            {
                this.lastBuyingPlayer = this.buyingPlayer.getName();
            }
            else
            {
                this.lastBuyingPlayer = null;
            }

            i += 5;
        }

        if (recipe.getItemToBuy().getItem() == Items.EMERALD)
        {
            this.wealth += recipe.getItemToBuy().getCount();
        }

        if (recipe.getRewardsExp())
        {
            this.world.spawnEntity(new EntityXPOrb(this.world, this.posX, this.posY + 0.5D, this.posZ, i));
        }
    }

    /**
     * Notifies the merchant of a possible merchantrecipe being fulfilled or not. Usually, this is just a sound byte
     * being played depending if the suggested itemstack is not null.
     */
    @Override
    public void verifySellingItem(ItemStack stack)
    {
        if (!this.world.isRemote && this.livingSoundTime > -this.getTalkInterval() + 20)
        {
            this.livingSoundTime = -this.getTalkInterval();
            this.playSound(stack.isEmpty() ? SoundEvents.ENTITY_VILLAGER_NO : SoundEvents.ENTITY_VILLAGER_YES, this.getSoundVolume(), this.getSoundPitch());
        }
    }

    @Nullable
    @Override
    public MerchantRecipeList getRecipes(EntityPlayer player)
    {
        if (this.buyingList == null)
        {
            this.populateBuyingList();
        }

        return this.buyingList;
    }

    private void populateBuyingList()
    {
        AOTA.logDebug("Populating buying list of Fairy "+hashCode());
        if (this.careerLevel != 0)
        {
            ++this.careerLevel;
        }
        else
        {
            this.careerLevel = 1;
        }

        if (this.buyingList == null)
        {
            this.buyingList = new MerchantRecipeList();
        }

        List<ITradeList> trades = AOTATradeRegistry.getTradesOfType(EnumTradeEntity.FAIRY);

        if (trades != null)
        {
            for (ITradeList itradelist : trades)
            {
                itradelist.addMerchantRecipe(this, this.buyingList, this.rand);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setRecipes(@Nullable MerchantRecipeList recipeList)
    {
    }

    @Override
    public World getWorld()
    {
        return this.world;
    }

    @Override
    public BlockPos getPos()
    {
        return new BlockPos(this);
    }

    /**
     * Get the formatted ChatComponent that will be used for the sender's username in chat
     */
    @Override
    public ITextComponent getDisplayName()
    {
        Team team = this.getTeam();
        String s = this.getCustomNameTag();

        if (s != null && !s.isEmpty())
        {
            TextComponentString textcomponentstring = new TextComponentString(ScorePlayerTeam.formatPlayerName(team, s));
            textcomponentstring.getStyle().setHoverEvent(this.getHoverEvent());
            textcomponentstring.getStyle().setInsertion(this.getCachedUniqueIdString());
            return textcomponentstring;
        }
        else
        {
            if (this.buyingList == null)
            {
                this.populateBuyingList();
            }
            return new TextComponentTranslation("entity.fairy.name");
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleStatusUpdate(byte id)
    {
        if (id == 12)
        {
            this.spawnParticles(EnumParticleTypes.HEART);
        }
        else if (id == 13)
        {
            this.spawnParticles(EnumParticleTypes.VILLAGER_ANGRY);
        }
        else if (id == 14)
        {
            this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }

    @SideOnly(Side.CLIENT)
    private void spawnParticles(EnumParticleTypes particleType)
    {
        for (int i = 0; i < 5; ++i)
        {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 1.0D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2, new int[0]);
        }
    }

    /**
     * Called only once on an entity when first time spawned, via egg, mob spawner, natural spawning etc, but not called
     * when entity is reloaded from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        return this.finalizeMobSpawn(difficulty, livingdata, true);
    }

    public IEntityLivingData finalizeMobSpawn(DifficultyInstance p_190672_1_, @Nullable IEntityLivingData p_190672_2_, boolean p_190672_3_)
    {
        p_190672_2_ = super.onInitialSpawn(p_190672_1_, p_190672_2_);

        this.populateBuyingList();
        return p_190672_2_;
    }

    @Override
    public boolean canBeLeashedTo(EntityPlayer player)
    {
        return false;
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    @Override
    public void onStruckByLightning(EntityLightningBolt lightningBolt)
    {
        if (!this.world.isRemote && !this.isDead)
        {
            EntityVex entityVex = new EntityVex(this.world);
            entityVex.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            entityVex.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos(entityVex)), null);
            entityVex.setNoAI(this.isAIDisabled());

            if (this.hasCustomName())
            {
                entityVex.setCustomNameTag(this.getCustomNameTag());
                entityVex.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityVex);
            this.setDead();
        }
    }
}
