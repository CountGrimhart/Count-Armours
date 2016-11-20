package grimhart.eurodite.culture.handlers;

import grimhart.eurodite.culture.init.ModArmour;
import grimhart.eurodite.culture.init.ModItems;
import grimhart.eurodite.culture.init.ModTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	 public static void registerCraftingRecipes() {
		 GameRegistry.addRecipe(new ItemStack(ModItems.tinBag, 1), "CCC", "CCC", "CCC", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'C', ModItems.tinIngot);
		 GameRegistry.addRecipe(new ItemStack(ModTools.longSword, 1), " I ", " I ", "CS ", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'C', ModItems.tinBag);
		 
		 //RED
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmet, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplate, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggings, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 1));
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeBoots, 1), Items.IRON_BOOTS, ModItems.tinBag, Items.POTATO, Items.POTATO);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetB, 1), Items.IRON_HELMET, ModItems.tinBag);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateB, 1), Items.IRON_CHESTPLATE, ModItems.tinBag);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsB, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 1), new ItemStack(Items.DYE, 1, 1));
	
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetC, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateC, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsC, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 1), new ItemStack(Items.DYE, 1, 1), new ItemStack(Items.DYE, 1, 1));
		 
		 
		 
		 //Blue
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetD, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateD, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsD, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 4));
		 //
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetE, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateE, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsE, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 4), new ItemStack(Items.DYE, 1, 4));
		 //
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetF, 1), Items.IRON_HELMET, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateF, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO, Items.POTATO);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsF, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 4), new ItemStack(Items.DYE, 1, 4), new ItemStack(Items.DYE, 1, 4));
		 
		 
		 
		 //Green + Paladin
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG1, 1), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG1, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG1, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 2));
		 //
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG2, 1), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR, Items.GOLD_INGOT);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG2, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR, Items.GOLD_INGOT);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG2, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 2), new ItemStack(Items.DYE, 1, 2));
		 //
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeHelmetG3, 1), Items.IRON_HELMET, ModItems.tinBag, Items.GHAST_TEAR, Items.GOLD_INGOT, Items.GOLD_INGOT);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeChestplateG3, 1), Items.IRON_CHESTPLATE, ModItems.tinBag, Items.GHAST_TEAR, Items.GHAST_TEAR, Items.GOLD_INGOT, Items.GOLD_INGOT);
		 GameRegistry.addShapelessRecipe(new ItemStack(ModArmour.EuroditeLeggingsG3, 1), Items.IRON_LEGGINGS, ModItems.tinBag, new ItemStack(Items.DYE, 1, 2), new ItemStack(Items.DYE, 1, 2), new ItemStack(Items.DYE, 1, 2));
		 
		 
		 
		 
		 
	}
	 
	 
	
	public static void registerSmeltingRecipes() {
		
	}
}
