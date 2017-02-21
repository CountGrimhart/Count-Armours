package grimhart.aota.trading;

import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModItems;
import net.minecraft.entity.IMerchant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

/**
 * @author The_Fireplace
 */
public class TokensToItems implements ITradeList
{
    /** The item that is being bought for tokens */
    public ItemStack itemToBuy;
    /**
     * The price info for the amount of tokens to sell for, or if negative, the amount of the item to buy for a token.
     */
    public PriceInfo priceInfo;

    public TokensToItems(Item par1Item, PriceInfo priceInfo)
    {
        this.itemToBuy = new ItemStack(par1Item);
        this.priceInfo = priceInfo;
    }

    public TokensToItems(ItemStack stack, PriceInfo priceInfo)
    {
        this.itemToBuy = stack;
        this.priceInfo = priceInfo;
    }

    @Override
    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random rand)
    {
        int i = 1;

        if (this.priceInfo != null)
        {
            i = this.priceInfo.getPrice(rand);
        }

        ItemStack itemstack;
        ItemStack itemstack1;

        if (i < 0)
        {
            itemstack = new ItemStack(ModItems.trading_token);
            itemstack1 = new ItemStack(this.itemToBuy.getItem(), -i, this.itemToBuy.getMetadata());
        }
        else
        {
            itemstack = new ItemStack(ModItems.trading_token, i);
            itemstack1 = new ItemStack(this.itemToBuy.getItem(), 1, this.itemToBuy.getMetadata());
        }

        recipeList.add(new MerchantRecipe(itemstack, itemstack1));
    }
}
