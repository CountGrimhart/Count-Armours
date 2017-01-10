package grimhart.eurodite.culture.handlers;

import grimhart.eurodite.culture.init.ModArmour;
import grimhart.eurodite.culture.init.ModItems;
import grimhart.eurodite.culture.init.ModTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHandler {

	 public static void registerCraftingRecipes() {
		 addRecipe(new ItemStack(ModItems.tinBag, 1), "CCC", "CCC", "CCC", 'I', "ingotIron", 'S', "stickWood", 'C', ModItems.tinIngot);
		 addRecipe(new ItemStack(ModTools.longSword, 1), " I ", " I ", "CS ", 'I', "ingotIron", 'S', "stickWood", 'C', ModItems.tinBag);
		 
		 //RED
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmet, 1), Items.IRON_HELMET, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplate, 1), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggings, 1), Items.IRON_LEGGINGS,  "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeBoots, 1), Items.IRON_BOOTS,  Items.POTATO, Items.POTATO);
		 
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetB, 1), Items.IRON_HELMET,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateB, 1), Items.IRON_CHESTPLATE,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsB, 1), Items.IRON_LEGGINGS,  "dyeRed", "dyeRed");
	
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetC, 1), Items.IRON_HELMET,  Items.POTATO,  Items.POTATO,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateC, 1), Items.IRON_CHESTPLATE,  Items.POTATO,  Items.POTATO,  Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsC, 1), Items.IRON_LEGGINGS,  "dyeRed", "dyeRed", "dyeRed");
		 
		 
		 
		 //Blue
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetD), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateD), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsD), Items.IRON_LEGGINGS,  "dyeBlue");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetE), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateE), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsE), Items.IRON_LEGGINGS,  "dyeBlue", "dyeBlue");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetF), Items.IRON_HELMET,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateF), Items.IRON_CHESTPLATE,  Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsF), Items.IRON_LEGGINGS,  "dyeBlue", "dyeBlue", "dyeBlue");
		 
		 
		 
		 //Green + Paladin
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG1), Items.IRON_HELMET, Items.GHAST_TEAR);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG1), Items.IRON_CHESTPLATE, Items.GHAST_TEAR);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG1), Items.IRON_LEGGINGS, "dyeGreen");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG2), Items.IRON_HELMET, Items.GHAST_TEAR, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG2), Items.IRON_CHESTPLATE, Items.GHAST_TEAR, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG2), Items.IRON_LEGGINGS, "dyeGreen", "dyeGreen");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG3), Items.IRON_HELMET, Items.GHAST_TEAR, "ingotGold", "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG3), Items.IRON_CHESTPLATE, Items.GHAST_TEAR, Items.GHAST_TEAR, "ingotGold", "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG3), Items.IRON_LEGGINGS, "dyeGreen", "dyeGreen", "dyeGreen");


		 //Purple + Ash knight
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetP1), Items.IRON_HELMET, Items.BLAZE_POWDER);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateP1), Items.IRON_CHESTPLATE, Items.BLAZE_POWDER);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsP1), Items.IRON_LEGGINGS, "dyePurple");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetP2), Items.IRON_HELMET, Items.BLAZE_POWDER, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateP2), Items.IRON_CHESTPLATE, Items.BLAZE_POWDER, "ingotGold");
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


		 //Holy Knights
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR1), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold", "ingotIron");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR1), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, "ingotGold", "ingotIron");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR1), Items.IRON_LEGGINGS, "dyeWhite", "dyeRed");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR2), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotIron");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR2), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR2), Items.IRON_LEGGINGS, "dyeBlack", "dyeWhite");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR3), Items.IRON_HELMET, Items.WRITTEN_BOOK, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateCR3), Items.IRON_CHESTPLATE, Items.WRITTEN_BOOK, Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR3), Items.IRON_LEGGINGS, "dyeWhite", "dyeBlack", "dyeWhite");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetCR4), Items.IRON_HELMET, Items.WRITTEN_BOOK, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsCR4), Items.IRON_LEGGINGS, "dyeRed", "dyeWhite", "dyeRed");
	}
	 
	public static void addRecipe(ItemStack output, Object... args){
		GameRegistry.addRecipe(new ShapedOreRecipe(output, args));
	}

	public static void addShapelessRecipe(ItemStack output, Object... args){
		GameRegistry.addRecipe(new ShapelessOreRecipe(output, args));
	}
	
	public static void registerSmeltingRecipes() {
		
	}
}
