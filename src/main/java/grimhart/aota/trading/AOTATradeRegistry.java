package grimhart.aota.trading;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author The_Fireplace
 */
public final class AOTATradeRegistry {
    private static Map<EnumTradeEntity, ArrayList<ITradeList>> registry;
    public static void init(){
        registry = Maps.newHashMap();
        registry.put(EnumTradeEntity.FAIRY, new ArrayList<ITradeList>());
        registry.put(EnumTradeEntity.DWARF, new ArrayList<ITradeList>());
    }
    public static ArrayList<ITradeList> getTradesOfType(EnumTradeEntity type){
        return registry.get(type);
    }

    /**
     * Adds a recipe allowing you to trade tokens for items.
     * @param type
     *  The entity type to trade with.
     * @param resultItem
     *  The item that will be recieved from the trade.
     * @param pricing
     *  The pricing information.
     */
    public static void addTokenToItemRecipe(EnumTradeEntity type, Item resultItem, PriceInfo pricing){
        getTradesOfType(type).add(new TokensForItems(resultItem, pricing));
    }

    /**
     * Adds a recipe allowing you to trade tokens for enchanted items.
     * @param type
     *  The entity type to trade with.
     * @param resultItem
     *  The item that will be recieved from the trade.
     * @param pricing
     *  The pricing information.
     */
    public static void addTokenToEnchItemRecipe(EnumTradeEntity type, Item resultItem, PriceInfo pricing){
        getTradesOfType(type).add(new EnchantedItemsForTokens(resultItem, pricing));
    }

    /**
     * Adds a recipe allowing you to trade tokens+items for items. I think this should be used for armor upgrades.
     * @param type
     *  The entity type to trade with.
     * @param resultItem
     *  The item that will be recieved from the trade.
     * @param buyingPricing
     *  The price info defining the amount of the buying item required with 1 token to match the selling item.
     * @param sellingItem
     *  The item that will be sold in this trade
     * @param sellingPrice
     *  The amount the item will be sold for.
     */
    public static void addItemAndTokenToItemRecipe(EnumTradeEntity type, Item resultItem, PriceInfo buyingPricing, Item sellingItem, PriceInfo sellingPrice){
        getTradesOfType(type).add(new ItemAndTokenToItem(resultItem, buyingPricing, sellingItem, sellingPrice));
    }

    /**
     * Adds a recipe allowing you to trade tokens for items.
     * @param type
     *  The entity type to trade with.
     * @param resultItem
     *  The item that is being bought for tokens
     * @param pricing
     *  The price info for the amount of tokens to sell for, or if negative, the amount of the item to buy for a token.
     */
    public static void addItemToTokenRecipe(EnumTradeEntity type, Item resultItem, PriceInfo pricing){
        getTradesOfType(type).add(new ItemsForTokens(resultItem, pricing));
    }
}
