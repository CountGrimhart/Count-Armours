package grimhart.aota.trading;

import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.IMerchant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class TokensToEnchantedItems implements ITradeList
{
    /** The enchanted item stack to sell */
    public ItemStack enchantedItemStack;
    /** The price info determining the number of tokens to trade in for the enchanted item */
    public PriceInfo priceInfo;

    public TokensToEnchantedItems(Item sellingItem, PriceInfo priceInfo)
    {
        this.enchantedItemStack = new ItemStack(sellingItem);
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

        ItemStack itemstack = new ItemStack(ModItems.trading_token, i);
        ItemStack itemstack1 = EnchantmentHelper.addRandomEnchantment(rand, new ItemStack(this.enchantedItemStack.getItem(), 1, this.enchantedItemStack.getMetadata()), 5 + rand.nextInt(15), true);
        recipeList.add(new MerchantRecipe(itemstack, itemstack1));
    }
}