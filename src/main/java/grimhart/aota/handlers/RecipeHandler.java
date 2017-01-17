package grimhart.aota.handlers;

import grimhart.aota.init.ModTools;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
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
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmet, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplate, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggings, 1), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeRed");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeBoots, 1), Items.IRON_BOOTS, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetB, 1), Items.IRON_HELMET, ModItems.tinBag);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateB, 1), Items.IRON_CHESTPLATE, ModItems.tinBag);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsB, 1), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeRed", "dyeRed");
	
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetC, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateC, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsC, 1), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeRed", "dyeRed", "dyeRed");
		 
		 
		 
		 //Blue
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetD), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateD), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsD), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeBlue");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetE), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateE), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsE), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeBlue", "dyeBlue");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetF), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateF), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsF), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeBlue", "dyeBlue", "dyeBlue");
		 
		 
		 
		 //Green + Paladin
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG1), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR);
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG1), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeGreen");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG2), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG2), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR, "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG2), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeGreen", "dyeGreen");
		 //
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG3), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR, "ingotGold", "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG3), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR, Items.GHAST_TEAR, "ingotGold", "ingotGold");
		 addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG3), Items.IRON_LEGGINGS, ModItems.tinBag, "dyeGreen", "dyeGreen", "dyeGreen");
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
