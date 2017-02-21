package grimhart.aota.init;

import grimhart.aota.Reference;
import grimhart.aota.items.ItemModSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTools {

	public static final ToolMaterial EMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":E", 2, 300, 5.0F, 2.0F, 12);
	
	public static ItemSword longSword;
	
	public static void init(){
		longSword = new ItemModSword(EMaterial, "long_sword");
		
	}
	public static void register(){
		registerItem(longSword);
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders(){
		registerRender(longSword);
	}
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
