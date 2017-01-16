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
	
	//Samurai + Ashigaru
	//Black
	public static ArmorMaterial samuraiB1Material = EnumHelper.addArmorMaterial("samuraib1", Reference.MODID + ":samuraib1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiB2Material = EnumHelper.addArmorMaterial("samuraib2", Reference.MODID + ":samuraib2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiB3Material = EnumHelper.addArmorMaterial("samuraib3", Reference.MODID + ":samuraib3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruB1Material = EnumHelper.addArmorMaterial("ashigarub1", Reference.MODID + ":ashigarub1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Blue
	public static ArmorMaterial samuraiBL1Material = EnumHelper.addArmorMaterial("samuraibl1", Reference.MODID + ":samuraibl1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiBL2Material = EnumHelper.addArmorMaterial("samuraibl2", Reference.MODID + ":samuraibl2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiBL3Material = EnumHelper.addArmorMaterial("samuraibl3", Reference.MODID + ":samuraibl3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruBL1Material = EnumHelper.addArmorMaterial("ashigarubl1", Reference.MODID + ":ashigarubl1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Green
	public static ArmorMaterial samuraiG1Material = EnumHelper.addArmorMaterial("samuraig1", Reference.MODID + ":samuraig1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiG2Material = EnumHelper.addArmorMaterial("samuraig2", Reference.MODID + ":samuraig2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiG3Material = EnumHelper.addArmorMaterial("samuraig3", Reference.MODID + ":samuraig3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruG1Material = EnumHelper.addArmorMaterial("ashigarug1", Reference.MODID + ":ashigarug1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Red
	public static ArmorMaterial samuraiR1Material = EnumHelper.addArmorMaterial("samurair1",	 Reference.MODID + ":samurair1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiR2Material = EnumHelper.addArmorMaterial("samurair2", Reference.MODID + ":samurair2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiR3Material = EnumHelper.addArmorMaterial("samurair3", Reference.MODID + ":samurair3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruR1Material = EnumHelper.addArmorMaterial("ashigarur1", Reference.MODID + ":ashigarur1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//White
	public static ArmorMaterial samuraiW1Material = EnumHelper.addArmorMaterial("samuraiw1",	 Reference.MODID + ":samuraiw1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiW2Material = EnumHelper.addArmorMaterial("samuraiw2", Reference.MODID + ":samuraiw2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiW3Material = EnumHelper.addArmorMaterial("samuraiw3", Reference.MODID + ":samuraiw3", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruW1Material = EnumHelper.addArmorMaterial("ashigaruw1", Reference.MODID + ":ashigaruw1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Cyan Yellow Orange Purple Yukata and Ashigaru
	public static ArmorMaterial ashigaruC1Material = EnumHelper.addArmorMaterial("ashigaruc1", Reference.MODID + ":ashigaruc1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruY1Material = EnumHelper.addArmorMaterial("ashigaruy1", Reference.MODID + ":ashigaruy1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruO1Material = EnumHelper.addArmorMaterial("ashigaruo1", Reference.MODID + ":ashigaruo1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruP1Material = EnumHelper.addArmorMaterial("ashigarup1", Reference.MODID + ":ashigarup1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial ashigaruNA1Material = EnumHelper.addArmorMaterial("ashigaruna1", Reference.MODID + ":ashigaruna1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static ArmorMaterial samuraiC1Material = EnumHelper.addArmorMaterial("samuraic1", Reference.MODID + ":samuraic1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiY1Material = EnumHelper.addArmorMaterial("samuraiy1", Reference.MODID + ":samuraiy1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiO1Material = EnumHelper.addArmorMaterial("samuraio1", Reference.MODID + ":samuraio1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial samuraiP1Material = EnumHelper.addArmorMaterial("samuraip1", Reference.MODID + ":samuraip1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	//Sigma
	//Red + Armours
	public static ArmorMaterial sigmaR1Material = EnumHelper.addArmorMaterial("sigmar1", Reference.MODID + ":sigmar1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial sigmaR2Material = EnumHelper.addArmorMaterial("sigmar2", Reference.MODID + ":sigmar2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Blue + Bronze Armour
	public static ArmorMaterial sigmaB1Material = EnumHelper.addArmorMaterial("sigmab1", Reference.MODID + ":sigmab1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial sigmaB2Material = EnumHelper.addArmorMaterial("sigmab2", Reference.MODID + ":sigmab2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	//Green
	public static ArmorMaterial sigmaG1Material = EnumHelper.addArmorMaterial("sigmag1", Reference.MODID + ":sigmag1", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static ArmorMaterial sigmaG2Material = EnumHelper.addArmorMaterial("sigmag2", Reference.MODID + ":sigmag2", 15, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

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


	//Sunjin Sets
	//Black Samurai
	public static ItemArmor SunjinHelmetSB1;
	public static ItemArmor SunjinChestplateSB1;
	public static ItemArmor SunjinLeggingsSB1;
	public static ItemArmor SunjinBootsSB1;

	public static ItemArmor SunjinHelmetSB2;
	public static ItemArmor SunjinChestplateSB2;

	public static ItemArmor SunjinChestplateSB3;

	public static ItemArmor SunjinHelmetAB1;
	public static ItemArmor SunjinChestplateAB1;

	//Blue Samurai
	public static ItemArmor SunjinHelmetSBL1;
	public static ItemArmor SunjinChestplateSBL1;
	public static ItemArmor SunjinLeggingsSBL1;
	public static ItemArmor SunjinBootsSBL1;

	public static ItemArmor SunjinHelmetSBL2;
	public static ItemArmor SunjinChestplateSBL2;

	public static ItemArmor SunjinChestplateSBL3;

	public static ItemArmor SunjinHelmetABL1;
	public static ItemArmor SunjinChestplateABL1;

	//Green Samurai
	public static ItemArmor SunjinHelmetSG1;
	public static ItemArmor SunjinChestplateSG1;
	public static ItemArmor SunjinLeggingsSG1;
	public static ItemArmor SunjinBootsSG1;

	public static ItemArmor SunjinHelmetSG2;
	public static ItemArmor SunjinChestplateSG2;

	public static ItemArmor SunjinChestplateSG3;

	public static ItemArmor SunjinHelmetAG1;
	public static ItemArmor SunjinChestplateAG1;

	//Red Samurai
	public static ItemArmor SunjinHelmetSR1;
	public static ItemArmor SunjinChestplateSR1;
	public static ItemArmor SunjinLeggingsSR1;
	public static ItemArmor SunjinBootsSR1;

	public static ItemArmor SunjinHelmetSR2;
	public static ItemArmor SunjinChestplateSR2;

	public static ItemArmor SunjinChestplateSR3;

	public static ItemArmor SunjinHelmetAR1;
	public static ItemArmor SunjinChestplateAR1;

	//White Samurai
	public static ItemArmor SunjinHelmetSW1;
	public static ItemArmor SunjinChestplateSW1;
	public static ItemArmor SunjinLeggingsSW1;
	public static ItemArmor SunjinBootsSW1;

	public static ItemArmor SunjinHelmetSW2;
	public static ItemArmor SunjinChestplateSW2;

	public static ItemArmor SunjinChestplateSW3;

	public static ItemArmor SunjinHelmetAW1;
	public static ItemArmor SunjinChestplateAW1;

	//Cyan Yellow Orange Purple Yukata and Ashigaru
	public static ItemArmor SunjinHelmetAC1;
	public static ItemArmor SunjinChestplateAC1;
	public static ItemArmor SunjinHelmetAY1;
	public static ItemArmor SunjinChestplateAY1;
	public static ItemArmor SunjinHelmetAO1;
	public static ItemArmor SunjinChestplateAO1;
	public static ItemArmor SunjinHelmetAP1;
	public static ItemArmor SunjinChestplateAP1;
	public static ItemArmor SunjinHelmetANA1;

	public static ItemArmor SunjinLeggingsSC1;
	public static ItemArmor SunjinLeggingsSY1;
	public static ItemArmor SunjinLeggingsSO1;
	public static ItemArmor SunjinLeggingsSP1;

	//Sigma
	//Red + Armour
	public static ItemArmor SigmaHelmetR1;
	public static ItemArmor SigmaChestplateR1;
	public static ItemArmor SigmaLeggingsR1;
	public static ItemArmor SigmaHelmetR2;
	public static ItemArmor SigmaChestplateR2;
	public static ItemArmor SigmaLeggingsR2;
	//Blue + Armour Bronze
	public static ItemArmor SigmaHelmetB1;
	public static ItemArmor SigmaChestplateB1;
	public static ItemArmor SigmaLeggingsB1;
	public static ItemArmor SigmaLeggingsB2;
	//Green
	public static ItemArmor SigmaLeggingsG1;
	public static ItemArmor SigmaLeggingsG2;



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

        //Sunjin
		//Black
		SunjinHelmetSB1 = new ItemModArmour(samuraiB1Material, 1, EntityEquipmentSlot.HEAD, "helmsb_1");
		SunjinChestplateSB1 = new ItemModArmour(samuraiB1Material, 1, EntityEquipmentSlot.CHEST, "chestsb_1");
		SunjinLeggingsSB1 = new ItemModArmour(samuraiB1Material, 2, EntityEquipmentSlot.LEGS, "yukatasb_1");
		SunjinBootsSB1 = new ItemModArmour(samuraiB1Material, 0, EntityEquipmentSlot.FEET, "legasb_1");

		SunjinHelmetSB2 = new ItemModArmour(samuraiB2Material, 1, EntityEquipmentSlot.HEAD, "helmsb_2");
		SunjinChestplateSB2 = new ItemModArmour(samuraiB2Material, 1, EntityEquipmentSlot.CHEST, "chestsb_2");
		SunjinChestplateSB3 = new ItemModArmour(samuraiB3Material, 1, EntityEquipmentSlot.CHEST, "chestsb_3");

		SunjinHelmetAB1 = new ItemModArmour(ashigaruB1Material, 1, EntityEquipmentSlot.HEAD, "helmab_1");
		SunjinChestplateAB1 = new ItemModArmour(ashigaruB1Material, 1, EntityEquipmentSlot.CHEST, "chestab_1");

		//Blue
		SunjinHelmetSBL1 = new ItemModArmour(samuraiBL1Material, 1, EntityEquipmentSlot.HEAD, "helmsbl_1");
		SunjinChestplateSBL1 = new ItemModArmour(samuraiBL1Material, 1, EntityEquipmentSlot.CHEST, "chestsbl_1");
		SunjinLeggingsSBL1 = new ItemModArmour(samuraiBL1Material, 2, EntityEquipmentSlot.LEGS, "yukatasbl_1");
		SunjinBootsSBL1 = new ItemModArmour(samuraiBL1Material, 0, EntityEquipmentSlot.FEET, "legasbl_1");

		SunjinHelmetSBL2 = new ItemModArmour(samuraiBL2Material, 1, EntityEquipmentSlot.HEAD, "helmsbl_2");
		SunjinChestplateSBL2 = new ItemModArmour(samuraiBL2Material, 1, EntityEquipmentSlot.CHEST, "chestsbl_2");

		SunjinChestplateSBL3 = new ItemModArmour(samuraiBL3Material, 1, EntityEquipmentSlot.CHEST, "chestsbl_3");

		SunjinHelmetABL1 = new ItemModArmour(ashigaruBL1Material, 1, EntityEquipmentSlot.HEAD, "helmabl_1");
		SunjinChestplateABL1 = new ItemModArmour(ashigaruBL1Material, 1, EntityEquipmentSlot.CHEST, "chestabl_1");

		//Green
		SunjinHelmetSG1 = new ItemModArmour(samuraiG1Material, 1, EntityEquipmentSlot.HEAD, "helmsg_1");
		SunjinChestplateSG1 = new ItemModArmour(samuraiG1Material, 1, EntityEquipmentSlot.CHEST, "chestsg_1");
		SunjinLeggingsSG1 = new ItemModArmour(samuraiG1Material, 2, EntityEquipmentSlot.LEGS, "yukatasg_1");
		SunjinBootsSG1 = new ItemModArmour(samuraiG1Material, 0, EntityEquipmentSlot.FEET, "legasg_1");

		SunjinHelmetSG2 = new ItemModArmour(samuraiG2Material, 1, EntityEquipmentSlot.HEAD, "helmsg_2");
		SunjinChestplateSG2 = new ItemModArmour(samuraiG2Material, 1, EntityEquipmentSlot.CHEST, "chestsg_2");

		SunjinChestplateSG3 = new ItemModArmour(samuraiG3Material, 1, EntityEquipmentSlot.CHEST, "chestsg_3");

		SunjinHelmetAG1 = new ItemModArmour(ashigaruG1Material, 1, EntityEquipmentSlot.HEAD, "helmag_1");
		SunjinChestplateAG1 = new ItemModArmour(ashigaruG1Material, 1, EntityEquipmentSlot.CHEST, "chestag_1");

		//Red
		SunjinHelmetSR1 = new ItemModArmour(samuraiR1Material, 1, EntityEquipmentSlot.HEAD, "helmsr_1");
		SunjinChestplateSR1 = new ItemModArmour(samuraiR1Material, 1, EntityEquipmentSlot.CHEST, "chestsr_1");
		SunjinLeggingsSR1 = new ItemModArmour(samuraiR1Material, 2, EntityEquipmentSlot.LEGS, "yukatasr_1");
		SunjinBootsSR1 = new ItemModArmour(samuraiR1Material, 0, EntityEquipmentSlot.FEET, "legasr_1");

		SunjinHelmetSR2 = new ItemModArmour(samuraiR2Material, 1, EntityEquipmentSlot.HEAD, "helmsr_2");
		SunjinChestplateSR2 = new ItemModArmour(samuraiR2Material, 1, EntityEquipmentSlot.CHEST, "chestsr_2");

		SunjinChestplateSR3 = new ItemModArmour(samuraiR3Material, 1, EntityEquipmentSlot.CHEST, "chestsr_3");

		SunjinHelmetAR1 = new ItemModArmour(ashigaruR1Material, 1, EntityEquipmentSlot.HEAD, "helmar_1");
		SunjinChestplateAR1 = new ItemModArmour(ashigaruR1Material, 1, EntityEquipmentSlot.CHEST, "chestar_1");

		//White
		SunjinHelmetSW1 = new ItemModArmour(samuraiW1Material, 1, EntityEquipmentSlot.HEAD, "helmsw_1");
		SunjinChestplateSW1 = new ItemModArmour(samuraiW1Material, 1, EntityEquipmentSlot.CHEST, "chestsw_1");
		SunjinLeggingsSW1 = new ItemModArmour(samuraiW1Material, 2, EntityEquipmentSlot.LEGS, "yukatasw_1");
		SunjinBootsSW1 = new ItemModArmour(samuraiW1Material, 0, EntityEquipmentSlot.FEET, "legasw_1");

		SunjinHelmetSW2 = new ItemModArmour(samuraiW2Material, 1, EntityEquipmentSlot.HEAD, "helmsw_2");
		SunjinChestplateSW2 = new ItemModArmour(samuraiW2Material, 1, EntityEquipmentSlot.CHEST, "chestsw_2");

		SunjinChestplateSW3 = new ItemModArmour(samuraiW3Material, 1, EntityEquipmentSlot.CHEST, "chestsw_3");

		SunjinHelmetAW1 = new ItemModArmour(ashigaruW1Material, 1, EntityEquipmentSlot.HEAD, "helmaw_1");
		SunjinChestplateAW1 = new ItemModArmour(ashigaruW1Material, 1, EntityEquipmentSlot.CHEST, "chestaw_1");

		//Other Ashigaru
		SunjinHelmetAC1 = new ItemModArmour(ashigaruC1Material, 1, EntityEquipmentSlot.HEAD, "helmac_1");
		SunjinChestplateAC1 = new ItemModArmour(ashigaruC1Material, 1, EntityEquipmentSlot.CHEST, "chestac_1");
		SunjinHelmetAY1 = new ItemModArmour(ashigaruY1Material, 1, EntityEquipmentSlot.HEAD, "helmay_1");
		SunjinChestplateAY1 = new ItemModArmour(ashigaruY1Material, 1, EntityEquipmentSlot.CHEST, "chestay_1");
		SunjinHelmetAO1 = new ItemModArmour(ashigaruO1Material, 1, EntityEquipmentSlot.HEAD, "helmao_1");
		SunjinChestplateAO1 = new ItemModArmour(ashigaruO1Material, 1, EntityEquipmentSlot.CHEST, "chestao_1");
		SunjinHelmetAP1 = new ItemModArmour(ashigaruP1Material, 1, EntityEquipmentSlot.HEAD, "helmap_1");
		SunjinChestplateAP1 = new ItemModArmour(ashigaruP1Material, 1, EntityEquipmentSlot.CHEST, "chestap_1");
		SunjinHelmetANA1 = new ItemModArmour(ashigaruNA1Material, 1, EntityEquipmentSlot.HEAD, "helmana_1");

		SunjinLeggingsSC1 = new ItemModArmour(samuraiC1Material, 2, EntityEquipmentSlot.LEGS, "yukatasc_1");
		SunjinLeggingsSY1 = new ItemModArmour(samuraiY1Material, 2, EntityEquipmentSlot.LEGS, "yukatasy_1");
		SunjinLeggingsSO1 = new ItemModArmour(samuraiO1Material, 2, EntityEquipmentSlot.LEGS, "yukataso_1");
		SunjinLeggingsSP1 = new ItemModArmour(samuraiP1Material, 2, EntityEquipmentSlot.LEGS, "yukatasp_1");

		//Sigma
		//Red + Armour
		SigmaHelmetR1 = new ItemModArmour(sigmaR1Material, 1, EntityEquipmentSlot.HEAD, "helmsig_1");
		SigmaChestplateR1 = new ItemModArmour(sigmaR1Material, 1, EntityEquipmentSlot.CHEST, "chestsig_1");
		SigmaLeggingsR1 = new ItemModArmour(sigmaR1Material, 2, EntityEquipmentSlot.LEGS, "tunicsigr_1");
		SigmaHelmetR2 = new ItemModArmour(sigmaR2Material, 1, EntityEquipmentSlot.HEAD, "helmsig_2");
		SigmaChestplateR2 = new ItemModArmour(sigmaR2Material, 1, EntityEquipmentSlot.CHEST, "chestsig_2");
		SigmaLeggingsR2 = new ItemModArmour(sigmaR2Material, 2, EntityEquipmentSlot.LEGS, "tunicsigr_2");
		//Blue+ Bronze
		SigmaHelmetB1 = new ItemModArmour(sigmaB1Material, 1, EntityEquipmentSlot.HEAD, "helmsig_3");
		SigmaChestplateB1 = new ItemModArmour(sigmaB1Material, 1, EntityEquipmentSlot.CHEST, "chestsig_3");
		SigmaLeggingsB1 = new ItemModArmour(sigmaB1Material, 2, EntityEquipmentSlot.LEGS, "tunicsigb_1");
		SigmaLeggingsB2 = new ItemModArmour(sigmaB2Material, 2, EntityEquipmentSlot.LEGS, "tunicsigb_2");
		//Green
		SigmaLeggingsG1 = new ItemModArmour(sigmaG1Material, 2, EntityEquipmentSlot.LEGS, "tunicsigg_1");
		SigmaLeggingsG2 = new ItemModArmour(sigmaG2Material, 2, EntityEquipmentSlot.LEGS, "tunicsigg_2");

		//3d Items
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


        //Sunjin
		//Black
		registerItem(SunjinHelmetSB1);
		registerItem(SunjinChestplateSB1);
		registerItem(SunjinLeggingsSB1);
		registerItem(SunjinBootsSB1);

		registerItem(SunjinHelmetSB2);
		registerItem(SunjinChestplateSB2);

		registerItem(SunjinChestplateSB3);

		registerItem(SunjinHelmetAB1);
		registerItem(SunjinChestplateAB1);

		//Blue
		registerItem(SunjinHelmetSBL1);
		registerItem(SunjinChestplateSBL1);
		registerItem(SunjinLeggingsSBL1);
		registerItem(SunjinBootsSBL1);

		registerItem(SunjinHelmetSBL2);
		registerItem(SunjinChestplateSBL2);

		registerItem(SunjinChestplateSBL3);

		registerItem(SunjinHelmetABL1);
		registerItem(SunjinChestplateABL1);

		//Green
		registerItem(SunjinHelmetSG1);
		registerItem(SunjinChestplateSG1);
		registerItem(SunjinLeggingsSG1);
		registerItem(SunjinBootsSG1);

		registerItem(SunjinHelmetSG2);
		registerItem(SunjinChestplateSG2);

		registerItem(SunjinChestplateSG3);

		registerItem(SunjinHelmetAG1);
		registerItem(SunjinChestplateAG1);

		//Red
		registerItem(SunjinHelmetSR1);
		registerItem(SunjinChestplateSR1);
		registerItem(SunjinLeggingsSR1);
		registerItem(SunjinBootsSR1);

		registerItem(SunjinHelmetSR2);
		registerItem(SunjinChestplateSR2);

		registerItem(SunjinChestplateSR3);

		registerItem(SunjinHelmetAR1);
		registerItem(SunjinChestplateAR1);

		//White
		registerItem(SunjinHelmetSW1);
		registerItem(SunjinChestplateSW1);
		registerItem(SunjinLeggingsSW1);
		registerItem(SunjinBootsSW1);

		registerItem(SunjinHelmetSW2);
		registerItem(SunjinChestplateSW2);

		registerItem(SunjinChestplateSW3);

		registerItem(SunjinHelmetAW1);
		registerItem(SunjinChestplateAW1);

		//Other Ashigaru
		registerItem(SunjinHelmetAC1);
		registerItem(SunjinChestplateAC1);
		registerItem(SunjinHelmetAY1);
		registerItem(SunjinChestplateAY1);
		registerItem(SunjinHelmetAO1);
		registerItem(SunjinChestplateAO1);
		registerItem(SunjinHelmetAP1);
		registerItem(SunjinChestplateAP1);
		registerItem(SunjinHelmetANA1);

		registerItem(SunjinLeggingsSC1);
		registerItem(SunjinLeggingsSY1);
		registerItem(SunjinLeggingsSO1);
		registerItem(SunjinLeggingsSP1);

		//Sigma
		//Red + Armours
		registerItem(SigmaHelmetR1);
		registerItem(SigmaChestplateR1);
		registerItem(SigmaLeggingsR1);
		registerItem(SigmaHelmetR2);
		registerItem(SigmaChestplateR2);
		registerItem(SigmaLeggingsR2);
		//Blue+ Bronze
		registerItem(SigmaHelmetB1);
		registerItem(SigmaChestplateB1);
		registerItem(SigmaLeggingsB1);
		registerItem(SigmaLeggingsB2);
		//Green
		registerItem(SigmaLeggingsG1);
		registerItem(SigmaLeggingsG2);
		//3d Items
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


		//Sunjin
		//Black
		registerRender(SunjinHelmetSB1);
		registerRender(SunjinChestplateSB1);
		registerRender(SunjinLeggingsSB1);
		registerRender(SunjinBootsSB1);

		registerRender(SunjinHelmetSB2);
		registerRender(SunjinChestplateSB2);

		registerRender(SunjinChestplateSB3);

		registerRender(SunjinHelmetAB1);
		registerRender(SunjinChestplateAB1);

		//Blue
		registerRender(SunjinHelmetSBL1);
		registerRender(SunjinChestplateSBL1);
		registerRender(SunjinLeggingsSBL1);
		registerRender(SunjinBootsSBL1);

		registerRender(SunjinHelmetSBL2);
		registerRender(SunjinChestplateSBL2);

		registerRender(SunjinChestplateSBL3);

		registerRender(SunjinHelmetABL1);
		registerRender(SunjinChestplateABL1);

		//Green
		registerRender(SunjinHelmetSG1);
		registerRender(SunjinChestplateSG1);
		registerRender(SunjinLeggingsSG1);
		registerRender(SunjinBootsSG1);

		registerRender(SunjinHelmetSG2);
		registerRender(SunjinChestplateSG2);

		registerRender(SunjinChestplateSG3);

		registerRender(SunjinHelmetAG1);
		registerRender(SunjinChestplateAG1);

		//Red
		registerRender(SunjinHelmetSR1);
		registerRender(SunjinChestplateSR1);
		registerRender(SunjinLeggingsSR1);
		registerRender(SunjinBootsSR1);

		registerRender(SunjinHelmetSR2);
		registerRender(SunjinChestplateSR2);

		registerRender(SunjinChestplateSR3);

		registerRender(SunjinHelmetAR1);
		registerRender(SunjinChestplateAR1);

		//White
		registerRender(SunjinHelmetSW1);
		registerRender(SunjinChestplateSW1);
		registerRender(SunjinLeggingsSW1);
		registerRender(SunjinBootsSW1);

		registerRender(SunjinHelmetSW2);
		registerRender(SunjinChestplateSW2);

		registerRender(SunjinChestplateSW3);

		registerRender(SunjinHelmetAW1);
		registerRender(SunjinChestplateAW1);

		//Other
		registerRender(SunjinHelmetAC1);
		registerRender(SunjinChestplateAC1);
		registerRender(SunjinHelmetAY1);
		registerRender(SunjinChestplateAY1);
		registerRender(SunjinHelmetAO1);
		registerRender(SunjinChestplateAO1);
		registerRender(SunjinHelmetAP1);
		registerRender(SunjinChestplateAP1);
		registerRender(SunjinHelmetANA1);

		registerRender(SunjinLeggingsSC1);
		registerRender(SunjinLeggingsSY1);
		registerRender(SunjinLeggingsSO1);
		registerRender(SunjinLeggingsSP1);

		//Sigma
		//Red + Armours
		registerRender(SigmaHelmetR1);
		registerRender(SigmaChestplateR1);
		registerRender(SigmaLeggingsR1);
		registerRender(SigmaHelmetR2);
		registerRender(SigmaChestplateR2);
		registerRender(SigmaLeggingsR2);
		//Blue+ Bronze
		registerRender(SigmaHelmetB1);
		registerRender(SigmaChestplateB1);
		registerRender(SigmaLeggingsB1);
		registerRender(SigmaLeggingsB2);
		//Green
		registerRender(SigmaLeggingsG1);
		registerRender(SigmaLeggingsG2);

		//3d Items
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
