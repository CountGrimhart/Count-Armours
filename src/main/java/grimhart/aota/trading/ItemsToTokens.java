package grimhart.aota.trading;

import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModItems;
import net.minecraft.entity.IMerchant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

import static java.lang.Math.abs;

public class ItemsToTokens implements ITradeList
{
    public Item buyingItem;
    public PriceInfo price;

    public ItemsToTokens(Item itemIn, PriceInfo priceIn)
    {
        this.buyingItem = itemIn;
        this.price = priceIn;
    }

    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random rand)
    {
        int i = 1;

        if (this.price != null)
        {
            i = this.price.getPrice(rand);
        }

        recipeList.add(new MerchantRecipe(new ItemStack(this.buyingItem, i < 0 ? abs(i) : 1), new ItemStack(ModItems.trading_token, i < 0 ? 1 : i)));
    }
}