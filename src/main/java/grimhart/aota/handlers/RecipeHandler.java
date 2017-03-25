package grimhart.aota.handlers;

import grimhart.aota.init.ModTools;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
import grimhart.aota.trading.AOTATradeRegistry;
import grimhart.aota.trading.EnumTradeEntity;
import grimhart.aota.trading.PriceInfo;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHandler {

	 public static void registerCraftingRecipes() {
		 addRecipe(new ItemStack(ModItems.token_bag, 1), "CCC", "CCC", "CCC", 'I', "ingotIron", 'S', "stickWood", 'C', ModItems.trading_token);
		 addRecipe(new ItemStack(ModTools.longSword, 1), " I ", " I ", "CS ", 'I', "ingotIron", 'S', "stickWood", 'C', ModItems.token_bag);
		 //To Token Trade
		 AOTATradeRegistry.addItemToTokenRecipe(EnumTradeEntity.FAIRY, Items.BREAD, new PriceInfo(-10, -15));
		 AOTATradeRegistry.addItemToTokenRecipe(EnumTradeEntity.FAIRY, Items.CAKE, new PriceInfo(-1, -2));
		 //To Item Trade
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModTools.longSword, new PriceInfo(10, 15));

		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetB, new PriceInfo(5, 10));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateB, new PriceInfo(5, 10));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmet, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplate, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggings, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeBoots, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsB, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetC, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateC, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsC, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetD, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateD, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsD, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetE, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateE, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsE, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetF, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateF, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsF, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetG1, new PriceInfo(30, 35));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateG1, new PriceInfo(30, 35));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetG2, new PriceInfo(30, 35));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateG2, new PriceInfo(30, 35));
		// AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsG2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetG3, new PriceInfo(30, 35));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateG3, new PriceInfo(30, 35));
		// AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsG3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetP1, new PriceInfo(30, 35));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateP1, new PriceInfo(30, 35));
		// AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsP1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetP2, new PriceInfo(30, 35));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateP2, new PriceInfo(30, 35));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsP2, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsP3, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsO1, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsO2, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsO3, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsY1, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsY2, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsY3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetCR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetCR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetCR3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeHelmetCR4, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateCR1, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsCR1, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsCR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateCR3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeChestplateCR2, new PriceInfo(10, 15));
		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsCR3, new PriceInfo(10, 15));

		 //AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.FAIRY, ModArmour.EuroditeLeggingsCR4, new PriceInfo(10, 15));
		 /*
		 //Sunjin Items
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSB2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSB2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSB3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinBootsSB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSBL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSBL2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetABL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSBL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSBL2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSBL3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateABL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSBL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinBootsSBL1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSG2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSG2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSG3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinBootsSG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSR3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinBootsSR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetSW2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSW2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateSW3, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinBootsSW1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAC1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAC1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSC1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAY1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAY1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSY1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetAP1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinChestplateAP1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinLeggingsSP1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.AKUMA, ModArmour.SunjinHelmetANA1, new PriceInfo(10, 15));
		 //SigmaItems
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaHelmetR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaChestplateR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsR1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaHelmetR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaChestplateR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsR2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaHelmetB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaChestplateB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsB1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsB2, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsG1, new PriceInfo(10, 15));
		 AOTATradeRegistry.addTokenToItemRecipe(EnumTradeEntity.VOLUCRIS, ModArmour.SigmaLeggingsG2, new PriceInfo(10, 15));
		 */



		 addShapelessRecipe(new ItemStack(Items.PAPER, 5), Items.WHEAT, Items.WHEAT, Items.WHEAT, Items.WHEAT, Items.WHEAT);
		 
		 //RED
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmet, 1), Items.IRON_HELMET, Items.POTATO, Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplate, 1), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggings, 1), Items.IRON_LEGGINGS,  "dyeRed");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeBoots, 1), Items.IRON_BOOTS,  Items.POTATO, Items.POTATO);

		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetB, 1), Items.IRON_HELMET,  Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateB, 1), Items.IRON_CHESTPLATE,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsB, 1), Items.IRON_LEGGINGS,  "dyeRed", "dyeRed");
	
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetC, 1), Items.IRON_HELMET,  Items.POTATO,  Items.POTATO,  Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateC, 1), Items.IRON_CHESTPLATE,  Items.POTATO,  Items.POTATO,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsC, 1), Items.IRON_LEGGINGS,  "dyeRed", "dyeRed", "dyeRed");

		 //Blue
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetD), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateD), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsD), Items.IRON_LEGGINGS,  "dyeBlue");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetE), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateE), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsE), Items.IRON_LEGGINGS,  "dyeBlue", "dyeBlue");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetF), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateF), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsF), Items.IRON_LEGGINGS,  "dyeBlue", "dyeBlue", "dyeBlue");
		 
		 
		 
		 //Green + Paladin
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG1), Items.IRON_HELMET, Items.WRITTEN_BOOK);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG1), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG1), Items.IRON_LEGGINGS, "dyeGreen");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG2), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG2), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG2), Items.IRON_LEGGINGS, "dyeGreen", "dyeGreen");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG3), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold", "ingotGold");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG3), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, Items.WRITTEN_BOOK, "ingotGold", "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG3), Items.IRON_LEGGINGS, "dyeGreen", "dyeGreen", "dyeGreen");


		 //Purple + Ash knight
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetP1), Items.IRON_HELMET, Items.BLAZE_POWDER);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateP1), Items.IRON_CHESTPLATE, Items.BLAZE_POWDER);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsP1), Items.IRON_LEGGINGS, "dyePurple");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetP2), Items.IRON_HELMET, Items.BLAZE_POWDER, "ingotGold");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateP2), Items.IRON_CHESTPLATE, Items.BLAZE_POWDER, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsP2), Items.IRON_LEGGINGS, "dyePurple", "dyePurple");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsP3), Items.IRON_LEGGINGS, "dyePurple", "dyePurple", "dyePurple");


		 //Orange
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsO1), Items.IRON_LEGGINGS, "dyeOrange");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsO2), Items.IRON_LEGGINGS, "dyeOrange", "dyeOrange");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsO3), Items.IRON_LEGGINGS, "dyeOrange", "dyeOrange", "dyeOrange");


		 //Yellow
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsY1), Items.IRON_LEGGINGS, "dyeYellow");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsY2), Items.IRON_LEGGINGS, "dyeYellow", "dyeYellow");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsY3), Items.IRON_LEGGINGS, "dyeYellow", "dyeYellow", "dyeYellow");


		 //Holly Knights
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR1), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold", "ingotIron");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR1), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, "ingotGold", "ingotIron");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR1), Items.IRON_LEGGINGS, "dyeWhite", "dyeRed");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR2), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotIron");
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR2), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR2), Items.IRON_LEGGINGS, "dyeBlack", "dyeWhite");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR3), Items.IRON_HELMET, Items.WRITTEN_BOOK, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE);
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR3), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR3), Items.IRON_LEGGINGS, "dyeWhite", "dyeBlack", "dyeWhite");
		 //
		 //addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR4), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR4), Items.IRON_LEGGINGS, "dyeRed", "dyeWhite", "dyeRed");


		 //Sunjin Recipes
		 //Black
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSB1), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSB2), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE, Items.SUGAR, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAB1),  Items.IRON_HELMET, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSB1), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSB2), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE, Items.SUGAR, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSB3), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE, Items.SUGAR, Items.SUGAR, Items.SUGAR, "dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAB1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSB1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeBlack");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinBootsSB1), Items.IRON_BOOTS,Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR, "dyeBlack");
		 //Blue
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSBL1), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSBL2), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetABL1),  Items.IRON_HELMET, Items.SUGAR,"dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSBL1), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSBL2), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSBL3), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR,Items.SUGAR, "dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateABL1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSBL1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinBootsSBL1), Items.IRON_BOOTS,Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR, "dyeBlue");
		 //Green
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSG1), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSG2), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAG1),  Items.IRON_HELMET, Items.SUGAR,"dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSG1), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSG2), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSG3), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR,Items.SUGAR, "dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAG1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSG1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinBootsSG1), Items.IRON_BOOTS,Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR, "dyeGreen");
		 //Red
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSR1), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSR2), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAR1),  Items.IRON_HELMET, Items.SUGAR,"dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSR1), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSR2), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSR3), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR,Items.SUGAR, "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAR1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSR1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinBootsSR1), Items.IRON_BOOTS,Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR, "dyeRed");
		 //White
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSW1), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetSW2), Items.IRON_HELMET, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAW1),  Items.IRON_HELMET, Items.SUGAR,"dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSW1), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,"dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSW2), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR, "dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateSW3), Items.IRON_CHESTPLATE, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR,Items.SUGAR,Items.SUGAR, "dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAW1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSW1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeWhite");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinBootsSW1), Items.IRON_BOOTS,Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE,Items.SUGAR, "dyeWhite");
		 //Cyan Yellow Orange Purple
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAC1),  Items.IRON_HELMET, Items.SUGAR,"dyeCyan");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAC1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeCyan");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSC1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeCyan");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAY1),  Items.IRON_HELMET, Items.SUGAR,"dyeYellow");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAY1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeYellow");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSY1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeYellow");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAO1),  Items.IRON_HELMET, Items.SUGAR,"dyeOrange");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAO1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyeOrange");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSO1), Items.IRON_LEGGINGS, Items.SUGAR, "dyeOrange");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetAP1),  Items.IRON_HELMET, Items.SUGAR,"dyePurple");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinChestplateAP1), Items.IRON_CHESTPLATE, Items.SUGAR,"dyePurple");
		 addShapelessRecipe(new ItemStack(ModArmour.SunjinLeggingsSP1), Items.IRON_LEGGINGS, Items.SUGAR, "dyePurple");

		 addShapelessRecipe(new ItemStack(ModArmour.SunjinHelmetANA1),  Items.STRING, Items.SUGAR);

		 //Sigma
		 //Red
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaHelmetR1, 1), Items.IRON_HELMET, Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaChestplateR1, 1), Items.IRON_CHESTPLATE,  Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsR1, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaHelmetR2, 1), Items.IRON_HELMET, Items.APPLE,Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaChestplateR2, 1), Items.IRON_CHESTPLATE,  Items.APPLE,  Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsR2, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeRed","dyeRed");
		 //Blue
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaHelmetB1, 1), Items.IRON_HELMET, Items.APPLE,Items.APPLE,Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaChestplateB1, 1), Items.IRON_CHESTPLATE,  Items.APPLE, Items.APPLE,Items.APPLE);
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsB1, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeBlue");
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsB2, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeBlue","dyeBlue");
		 //Green
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsG1, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeGreen");
		 addShapelessRecipe(new ItemStack(ModArmour.SigmaLeggingsG2, 1), Items.IRON_LEGGINGS,  Items.APPLE,  "dyeGreen","dyeGreen");


	}
	 
	public static void addRecipe(ItemStack output, Object... args){
		GameRegistry.addRecipe(new ShapedOreRecipe(output, args));
	}

	public static void addShapelessRecipe(ItemStack output, Object... args){
		GameRegistry.addRecipe(new ShapelessOreRecipe(output, args));
	}
}
