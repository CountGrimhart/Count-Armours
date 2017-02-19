package grimhart.aota.trading;

import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModItems;
import net.minecraft.entity.IMerchant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class TokensForItems implements ITradeList
{
    public Item buyingItem;
    public PriceInfo price;

    public TokensForItems(Item itemIn, PriceInfo priceIn)
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

        recipeList.add(new MerchantRecipe(new ItemStack(this.buyingItem, i), ModItems.trading_token));
    }
}