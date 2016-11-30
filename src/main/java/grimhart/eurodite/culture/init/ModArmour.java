package grimhart.eurodite.culture.init;

import grimhart.eurodite.culture.Reference;
import grimhart.eurodite.culture.items.ItemModArmour;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModArmour {
	//Red + Basic Armour
	public static ArmorMaterial euroditeMaterial = EnumHelper.addArmorMaterial("eurodite", Reference.MODID + ":eurodite", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeBMaterial = EnumHelper.addArmorMaterial("euroditeb", Reference.MODID + ":euroditeb", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeCMaterial = EnumHelper.addArmorMaterial("euroditec", Reference.MODID + ":euroditec", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Blue + Basic armor
	public static ArmorMaterial euroditeDMaterial = EnumHelper.addArmorMaterial("eurodited", Reference.MODID + ":eurodited", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeEMaterial = EnumHelper.addArmorMaterial("euroditee", Reference.MODID + ":euroditee", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeFMaterial = EnumHelper.addArmorMaterial("euroditef", Reference.MODID + ":euroditef", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Green + paladin Gold armour
	public static ArmorMaterial euroditeG1Material = EnumHelper.addArmorMaterial("euroditeg1", Reference.MODID + ":euroditeg1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeG2Material = EnumHelper.addArmorMaterial("euroditeg2", Reference.MODID + ":euroditeg2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeG3Material = EnumHelper.addArmorMaterial("euroditeg3", Reference.MODID + ":euroditeg3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Purple + Ash Knight Armour
    public static ArmorMaterial euroditeP1Material = EnumHelper.addArmorMaterial("euroditep1", Reference.MODID + ":euroditep1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeP2Material = EnumHelper.addArmorMaterial("euroditep2", Reference.MODID + ":euroditep2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeP3Material = EnumHelper.addArmorMaterial("euroditep3", Reference.MODID + ":euroditep3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    //Orange Tunics
    public static ArmorMaterial euroditeO1Material = EnumHelper.addArmorMaterial("euroditeo1", Reference.MODID + ":euroditeo1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeO2Material = EnumHelper.addArmorMaterial("euroditeo2", Reference.MODID + ":euroditeo2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeO3Material = EnumHelper.addArmorMaterial("euroditeo3", Reference.MODID + ":euroditeo3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    //Yellow Tunics
    public static ArmorMaterial euroditeY1Material = EnumHelper.addArmorMaterial("euroditey1", Reference.MODID + ":euroditey1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeY2Material = EnumHelper.addArmorMaterial("euroditey2", Reference.MODID + ":euroditey2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static ArmorMaterial euroditeY3Material = EnumHelper.addArmorMaterial("euroditey3", Reference.MODID + ":euroditey3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Crusader Sets
	public static ArmorMaterial euroditeCR1Material = EnumHelper.addArmorMaterial("euroditecr1", Reference.MODID + ":euroditecr1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeCR2Material = EnumHelper.addArmorMaterial("euroditecr2", Reference.MODID + ":euroditecr2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeCR3Material = EnumHelper.addArmorMaterial("euroditecr3", Reference.MODID + ":euroditecr3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial euroditeCR4Material = EnumHelper.addArmorMaterial("euroditecr4", Reference.MODID + ":euroditecr4", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Bucket Helmet
	public static ArmorMaterial euroditeBU1Material = EnumHelper.addArmorMaterial("euroditebu1", Reference.MODID + ":euroditebu1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	
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
    //Purple
    public static ItemArmor EuroditeHelmetP1;
    public static ItemArmor EuroditeChestplateP1;
    public static ItemArmor EuroditeLeggingsP1;

    public static ItemArmor EuroditeHelmetP2;
    public static ItemArmor EuroditeChestplateP2;
    public static ItemArmor EuroditeLeggingsP2;

    public static ItemArmor EuroditeLeggingsP3;
    //Orange Tunics
    public static ItemArmor EuroditeLeggingsO1;
    public static ItemArmor EuroditeLeggingsO2;
    public static ItemArmor EuroditeLeggingsO3;
    //Yellow Tunics
    public static ItemArmor EuroditeLeggingsY1;
    public static ItemArmor EuroditeLeggingsY2;
    public static ItemArmor EuroditeLeggingsY3;
	//Crusaders
	public static ItemArmor EuroditeHelmetCR1;
	public static ItemArmor EuroditeChestplateCR1;
	public static ItemArmor EuroditeLeggingsCR1;

	public static ItemArmor EuroditeHelmetCR2;
	public static ItemArmor EuroditeChestplateCR2;
	public static ItemArmor EuroditeLeggingsCR2;

	public static ItemArmor EuroditeHelmetCR3;
	public static ItemArmor EuroditeChestplateCR3;
	public static ItemArmor EuroditeLeggingsCR3;

	public static ItemArmor EuroditeHelmetCR4;
    public static ItemArmor EuroditeLeggingsCR4;
    //Bucket Helmet
	public static ItemArmor EuroditeHelmetBU1;

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

        //Purple
        EuroditeHelmetP1 = new ItemModArmour(euroditeP1Material, 1, EntityEquipmentSlot.HEAD, "helmet_p1");
        EuroditeChestplateP1 = new ItemModArmour(euroditeP1Material, 1, EntityEquipmentSlot.CHEST, "chest_p1");
        EuroditeLeggingsP1 = new ItemModArmour(euroditeP1Material, 2, EntityEquipmentSlot.LEGS, "tunic_p1");

        EuroditeHelmetP2 = new ItemModArmour(euroditeP2Material, 1, EntityEquipmentSlot.HEAD, "helmet_p2");
        EuroditeChestplateP2 = new ItemModArmour(euroditeP2Material, 1, EntityEquipmentSlot.CHEST, "chest_p2");
        EuroditeLeggingsP2 = new ItemModArmour(euroditeP2Material, 2, EntityEquipmentSlot.LEGS, "tunic_p2");

        EuroditeLeggingsP3 = new ItemModArmour(euroditeP3Material, 2, EntityEquipmentSlot.LEGS, "tunic_p3");

        //Orange Tunics
        EuroditeLeggingsO1 = new ItemModArmour(euroditeO1Material, 2, EntityEquipmentSlot.LEGS, "tunic_o1");
        EuroditeLeggingsO2 = new ItemModArmour(euroditeO2Material, 2, EntityEquipmentSlot.LEGS, "tunic_o2");
        EuroditeLeggingsO3 = new ItemModArmour(euroditeO3Material, 2, EntityEquipmentSlot.LEGS, "tunic_o3");
        //Yellow Tunics
        EuroditeLeggingsY1 = new ItemModArmour(euroditeY1Material, 2, EntityEquipmentSlot.LEGS, "tunic_y1");
        EuroditeLeggingsY2 = new ItemModArmour(euroditeY2Material, 2, EntityEquipmentSlot.LEGS, "tunic_y2");
        EuroditeLeggingsY3 = new ItemModArmour(euroditeY3Material, 2, EntityEquipmentSlot.LEGS, "tunic_y3");
		//Crusaders
        EuroditeHelmetCR1 = new ItemModArmour(euroditeCR1Material, 1, EntityEquipmentSlot.HEAD, "helmet_cr1");
        EuroditeChestplateCR1 = new ItemModArmour(euroditeCR1Material, 1, EntityEquipmentSlot.CHEST, "chest_cr1");
        EuroditeLeggingsCR1 = new ItemModArmour(euroditeCR1Material, 2, EntityEquipmentSlot.LEGS, "tunic_cr1");

        EuroditeHelmetCR2 = new ItemModArmour(euroditeCR2Material, 1, EntityEquipmentSlot.HEAD, "helmet_cr2");
            //Invisible Chest
        EuroditeChestplateCR2 = new ItemModArmour(euroditeCR2Material, 1, EntityEquipmentSlot.CHEST, "chest_cr2");
        EuroditeLeggingsCR2 = new ItemModArmour(euroditeCR2Material, 2, EntityEquipmentSlot.LEGS, "tunic_cr2");

        EuroditeHelmetCR3 = new ItemModArmour(euroditeCR3Material, 1, EntityEquipmentSlot.HEAD, "helmet_cr3");
        EuroditeChestplateCR3 = new ItemModArmour(euroditeCR3Material, 1, EntityEquipmentSlot.CHEST, "chest_cr3");
        EuroditeLeggingsCR3 = new ItemModArmour(euroditeCR3Material, 2, EntityEquipmentSlot.LEGS, "tunic_cr3");

        EuroditeHelmetCR4 = new ItemModArmour(euroditeCR4Material, 1, EntityEquipmentSlot.HEAD, "helmet_cr4");
        EuroditeLeggingsCR4 = new ItemModArmour(euroditeCR4Material, 2, EntityEquipmentSlot.LEGS, "tunic_cr4");

        EuroditeHelmetBU1 = new ItemModArmour(euroditeBU1Material, 1, EntityEquipmentSlot.HEAD, "helmet_bu1");
	}
	public static void register() {
		
		//RED
		registerItem(EuroditeHelmet);
		registerItem(EuroditeChestplate);
		registerItem(EuroditeLeggings);
		registerItem(EuroditeBoots);

		registerItem(EuroditeHelmetB);
		registerItem(EuroditeChestplateB);
		registerItem(EuroditeLeggingsB);

		registerItem(EuroditeHelmetC);
		registerItem(EuroditeChestplateC);
		registerItem(EuroditeLeggingsC);
		
		
		
		//BLUE
		registerItem(EuroditeHelmetD);
		registerItem(EuroditeChestplateD);
		registerItem(EuroditeLeggingsD);

		registerItem(EuroditeHelmetE);
		registerItem(EuroditeChestplateE);
		registerItem(EuroditeLeggingsE);

		registerItem(EuroditeHelmetF);
		registerItem(EuroditeChestplateF);
		registerItem(EuroditeLeggingsF);
		
		
		
		//Green
		registerItem(EuroditeHelmetG1);
		registerItem(EuroditeChestplateG1);
		registerItem(EuroditeLeggingsG1);

		registerItem(EuroditeHelmetG2);
		registerItem(EuroditeChestplateG2);
		registerItem(EuroditeLeggingsG2);

		registerItem(EuroditeHelmetG3);
		registerItem(EuroditeChestplateG3);
		registerItem(EuroditeLeggingsG3);

        //Purple
        registerItem(EuroditeHelmetP1);
        registerItem(EuroditeChestplateP1);
        registerItem(EuroditeLeggingsP1);

        registerItem(EuroditeHelmetP2);
        registerItem(EuroditeChestplateP2);
        registerItem(EuroditeLeggingsP2);

        registerItem(EuroditeLeggingsP3);


        //Orange
        registerItem(EuroditeLeggingsO1);
        registerItem(EuroditeLeggingsO2);
        registerItem(EuroditeLeggingsO3);


        //Yellow
        registerItem(EuroditeLeggingsY1);
        registerItem(EuroditeLeggingsY2);
        registerItem(EuroditeLeggingsY3);


		//Crusader
        registerItem(EuroditeHelmetCR1);
        registerItem(EuroditeChestplateCR1);
        registerItem(EuroditeLeggingsCR1);

        registerItem(EuroditeHelmetCR2);
        registerItem(EuroditeChestplateCR2);
        registerItem(EuroditeLeggingsCR2);

        registerItem(EuroditeHelmetCR3);
        registerItem(EuroditeChestplateCR3);
        registerItem(EuroditeLeggingsCR3);

        registerItem(EuroditeHelmetCR4);
        registerItem(EuroditeLeggingsCR4);

        //Bucket
		registerItem(EuroditeHelmetBU1);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		//RED
		registerRender(EuroditeHelmet);
		registerRender(EuroditeChestplate);
		registerRender(EuroditeLeggings);
		registerRender(EuroditeBoots);

		registerRender(EuroditeHelmetB);
		registerRender(EuroditeChestplateB);
		registerRender(EuroditeLeggingsB);

		registerRender(EuroditeHelmetC);
		registerRender(EuroditeChestplateC);
		registerRender(EuroditeLeggingsC);
		
		
		
		//BLUE
		registerRender(EuroditeHelmetD);
		registerRender(EuroditeChestplateD);
		registerRender(EuroditeLeggingsD);	

		registerRender(EuroditeHelmetE);
		registerRender(EuroditeChestplateE);
		registerRender(EuroditeLeggingsE);	

		registerRender(EuroditeHelmetF);
		registerRender(EuroditeChestplateF);
		registerRender(EuroditeLeggingsF);	


		//Green
		registerRender(EuroditeHelmetG1);
		registerRender(EuroditeChestplateG1);
		registerRender(EuroditeLeggingsG1);	

		registerRender(EuroditeHelmetG2);
		registerRender(EuroditeChestplateG2);
		registerRender(EuroditeLeggingsG2);	

		registerRender(EuroditeHelmetG3);
		registerRender(EuroditeChestplateG3);
		registerRender(EuroditeLeggingsG3);

        //Purple
        registerRender(EuroditeHelmetP1);
        registerRender(EuroditeChestplateP1);
        registerRender(EuroditeLeggingsP1);

        registerRender(EuroditeHelmetP2);
        registerRender(EuroditeChestplateP2);
        registerRender(EuroditeLeggingsP2);

        registerRender(EuroditeLeggingsP3);


        //Orange
        registerRender(EuroditeLeggingsO1);
        registerRender(EuroditeLeggingsO2);
        registerRender(EuroditeLeggingsO3);

        //Orange
        registerRender(EuroditeLeggingsY1);
        registerRender(EuroditeLeggingsY2);
        registerRender(EuroditeLeggingsY3);



		//Crusader
        registerRender(EuroditeHelmetCR1);
        registerRender(EuroditeChestplateCR1);
        registerRender(EuroditeLeggingsCR1);

        registerRender(EuroditeHelmetCR2);
        registerRender(EuroditeChestplateCR2);
        registerRender(EuroditeLeggingsCR2);

        registerRender(EuroditeHelmetCR3);
        registerRender(EuroditeChestplateCR3);
        registerRender(EuroditeLeggingsCR3);

        registerRender(EuroditeHelmetCR4);
        registerRender(EuroditeLeggingsCR4);

        registerRender(EuroditeHelmetBU1);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
