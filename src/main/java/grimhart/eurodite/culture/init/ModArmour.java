package grimhart.eurodite.culture.init;

import grimhart.eurodite.culture.Reference;
import grimhart.eurodite.culture.items.ItemModArmour;
import grimhart.eurodite.culture.items.ItemTinIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmour {
	//Red +Armour
	public static ArmorMaterial euroditeMaterial = EnumHelper.addArmorMaterial("eurodite", Reference.MODID + ":eurodite", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeBMaterial = EnumHelper.addArmorMaterial("euroditeb", Reference.MODID + ":euroditeb", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeCMaterial = EnumHelper.addArmorMaterial("euroditec", Reference.MODID + ":euroditec", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Blue +armor
	public static ArmorMaterial euroditeDMaterial = EnumHelper.addArmorMaterial("eurodited", Reference.MODID + ":eurodited", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeEMaterial = EnumHelper.addArmorMaterial("euroditee", Reference.MODID + ":euroditee", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeFMaterial = EnumHelper.addArmorMaterial("euroditef", Reference.MODID + ":euroditef", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Green
	public static ArmorMaterial euroditeG1Material = EnumHelper.addArmorMaterial("euroditeg1", Reference.MODID + ":euroditeg1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeG2Material = EnumHelper.addArmorMaterial("euroditeg2", Reference.MODID + ":euroditeg2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeG3Material = EnumHelper.addArmorMaterial("euroditeg3", Reference.MODID + ":euroditeg3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	
	
	
	
	//RED
	public static ItemArmor EuroditeHelmet;
	public static ItemArmor EuroditeChestplate;
	public static ItemArmor EuroditeLeggings;
	public static ItemArmor EuroditeBoots;

	public static ItemArmor EuroditeHelmetB;
	public static ItemArmor EuroditeChestplateB;
	public static ItemArmor EuroditeLeggingsB;

	public static ItemArmor EuroditeHelmetC;
	public static ItemArmor EuroditeChestplateC;
	public static ItemArmor EuroditeLeggingsC;
	//
	
	//BLUE
	public static ItemArmor EuroditeHelmetD;
	public static ItemArmor EuroditeChestplateD;
	public static ItemArmor EuroditeLeggingsD;

	public static ItemArmor EuroditeHelmetE;
	public static ItemArmor EuroditeChestplateE;
	public static ItemArmor EuroditeLeggingsE;

	public static ItemArmor EuroditeHelmetF;
	public static ItemArmor EuroditeChestplateF;
	public static ItemArmor EuroditeLeggingsF;

	
	//Green
	public static ItemArmor EuroditeHelmetG1;
	public static ItemArmor EuroditeChestplateG1;
	public static ItemArmor EuroditeLeggingsG1;

	public static ItemArmor EuroditeHelmetG2;
	public static ItemArmor EuroditeChestplateG2;
	public static ItemArmor EuroditeLeggingsG2;

	public static ItemArmor EuroditeHelmetG3;
	public static ItemArmor EuroditeChestplateG3;
	public static ItemArmor EuroditeLeggingsG3;
	
	
	public static void init() {
		//RED
		EuroditeHelmet = new ItemModArmour(euroditeMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_a");
		EuroditeChestplate = new ItemModArmour(euroditeMaterial, 1, EntityEquipmentSlot.CHEST, "chest_a");
		EuroditeLeggings = new ItemModArmour(euroditeMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_a");
		EuroditeBoots = new ItemModArmour(euroditeMaterial, 0, EntityEquipmentSlot.FEET, "charm_a");

		EuroditeHelmetB = new ItemModArmour(euroditeBMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_b");
		EuroditeChestplateB = new ItemModArmour(euroditeBMaterial, 1, EntityEquipmentSlot.CHEST, "chest_b");
		EuroditeLeggingsB = new ItemModArmour(euroditeBMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_b");

		EuroditeHelmetC = new ItemModArmour(euroditeCMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_c");
		EuroditeChestplateC = new ItemModArmour(euroditeCMaterial, 1, EntityEquipmentSlot.CHEST, "chest_c");
		EuroditeLeggingsC = new ItemModArmour(euroditeCMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_c");
		
		
		
		
		//BLUE
		EuroditeHelmetD = new ItemModArmour(euroditeDMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_d");
		EuroditeChestplateD = new ItemModArmour(euroditeDMaterial, 1, EntityEquipmentSlot.CHEST, "chest_d");
		EuroditeLeggingsD = new ItemModArmour(euroditeDMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_d");

		EuroditeHelmetE = new ItemModArmour(euroditeEMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_e");
		EuroditeChestplateE = new ItemModArmour(euroditeEMaterial, 1, EntityEquipmentSlot.CHEST, "chest_e");
		EuroditeLeggingsE = new ItemModArmour(euroditeEMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_e");

		EuroditeHelmetF = new ItemModArmour(euroditeFMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_f");
		EuroditeChestplateF = new ItemModArmour(euroditeFMaterial, 1, EntityEquipmentSlot.CHEST, "chest_f");
		EuroditeLeggingsF = new ItemModArmour(euroditeFMaterial, 2, EntityEquipmentSlot.LEGS, "tunic_f");	
	
		
		
		//Green
		EuroditeHelmetG1 = new ItemModArmour(euroditeG1Material, 1, EntityEquipmentSlot.HEAD, "helmet_g1");
		EuroditeChestplateG1 = new ItemModArmour(euroditeG1Material, 1, EntityEquipmentSlot.CHEST, "chest_g1");
		EuroditeLeggingsG1 = new ItemModArmour(euroditeG1Material, 2, EntityEquipmentSlot.LEGS, "tunic_g1");
		
		EuroditeHelmetG2 = new ItemModArmour(euroditeG2Material, 1, EntityEquipmentSlot.HEAD, "helmet_g2");
		EuroditeChestplateG2 = new ItemModArmour(euroditeG2Material, 1, EntityEquipmentSlot.CHEST, "chest_g2");
		EuroditeLeggingsG2 = new ItemModArmour(euroditeG2Material, 2, EntityEquipmentSlot.LEGS, "tunic_g2");

		EuroditeHelmetG3 = new ItemModArmour(euroditeG3Material, 1, EntityEquipmentSlot.HEAD, "helmet_g3");
		EuroditeChestplateG3 = new ItemModArmour(euroditeG3Material, 1, EntityEquipmentSlot.CHEST, "chest_g3");
		EuroditeLeggingsG3 = new ItemModArmour(euroditeG3Material, 2, EntityEquipmentSlot.LEGS, "tunic_g3");
		
		
	}
	public static void register() {
		
		//RED
		registerItem(EuroditeHelmet);
		registerItem(EuroditeChestplate);
		registerItem(EuroditeLeggings);
		registerItem(EuroditeBoots);
		//Space
		registerItem(EuroditeHelmetB);
		registerItem(EuroditeChestplateB);
		registerItem(EuroditeLeggingsB);
		//Space
		registerItem(EuroditeHelmetC);
		registerItem(EuroditeChestplateC);
		registerItem(EuroditeLeggingsC);
		
		
		
		//BLUE
		registerItem(EuroditeHelmetD);
		registerItem(EuroditeChestplateD);
		registerItem(EuroditeLeggingsD);
		//Space
		registerItem(EuroditeHelmetE);
		registerItem(EuroditeChestplateE);
		registerItem(EuroditeLeggingsE);
		//Space
		registerItem(EuroditeHelmetF);
		registerItem(EuroditeChestplateF);
		registerItem(EuroditeLeggingsF);
		
		
		
		//Green
		registerItem(EuroditeHelmetG1);
		registerItem(EuroditeChestplateG1);
		registerItem(EuroditeLeggingsG1);
		//Space
		registerItem(EuroditeHelmetG2);
		registerItem(EuroditeChestplateG2);
		registerItem(EuroditeLeggingsG2);
		//Space
		registerItem(EuroditeHelmetG3);
		registerItem(EuroditeChestplateG3);
		registerItem(EuroditeLeggingsG3);
		
	}
	
	public static void registerRenders() {
		//RED
		registerRender(EuroditeHelmet);
		registerRender(EuroditeChestplate);
		registerRender(EuroditeLeggings);
		registerRender(EuroditeBoots);
		//Space
		registerRender(EuroditeHelmetB);
		registerRender(EuroditeChestplateB);
		registerRender(EuroditeLeggingsB);
		//Space
		registerRender(EuroditeHelmetC);
		registerRender(EuroditeChestplateC);
		registerRender(EuroditeLeggingsC);
		
		
		
		//BLUE
		registerRender(EuroditeHelmetD);
		registerRender(EuroditeChestplateD);
		registerRender(EuroditeLeggingsD);	
		//Space
		registerRender(EuroditeHelmetE);
		registerRender(EuroditeChestplateE);
		registerRender(EuroditeLeggingsE);	
		//Space
		registerRender(EuroditeHelmetF);
		registerRender(EuroditeChestplateF);
		registerRender(EuroditeLeggingsF);	
		//Space
		
		
		
		//Green
		registerRender(EuroditeHelmetG1);
		registerRender(EuroditeChestplateG1);
		registerRender(EuroditeLeggingsG1);	
		//Space
		registerRender(EuroditeHelmetG2);
		registerRender(EuroditeChestplateG2);
		registerRender(EuroditeLeggingsG2);	
		//Space
		registerRender(EuroditeHelmetG3);
		registerRender(EuroditeChestplateG3);
		registerRender(EuroditeLeggingsG3);	
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
