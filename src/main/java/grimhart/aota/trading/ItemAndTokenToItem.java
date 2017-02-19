package grimhart.aota.trading;

import grimhart.aota.entity.EntityFairy;
import net.minecraft.entity.IMerchant;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class ItemAndTokenToItem implements ITradeList
{
    /**
     * The itemstack to buy with a token. The Item and damage value is used only, any tag data is not
     * retained.
     */
    public ItemStack buyingItemStack;
    /** The price info defining the amount of the buying item required with 1 token to match the selling item. */
    public PriceInfo buyingPriceInfo;
    /** The itemstack to sell. The item and damage value are used only, any tag data is not retained. */
    public ItemStack sellingItemstack;
    public PriceInfo sellingPriceInfo;

    public ItemAndTokenToItem(Item itemBuying, PriceInfo buyingPrice, Item itemSelling, PriceInfo sellingPrice)
    {
        this.buyingItemStack = new ItemStack(itemBuying);
        this.buyingPriceInfo = buyingPrice;
        this.sellingItemstack = new ItemStack(itemSelling);
        this.sellingPriceInfo = sellingPrice;
    }

    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random rand)
    {
        int i = this.buyingPriceInfo.getPrice(rand);
        int j = this.sellingPriceInfo.getPrice(rand);
        recipeList.add(new MerchantRecipe(new ItemStack(this.buyingItemStack.getItem(), i, this.buyingItemStack.getMetadata()), new ItemStack(Items.EMERALD), new ItemStack(this.sellingItemstack.getItem(), j, this.sellingItemstack.getMetadata())));
    }
}