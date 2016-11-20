package grimhart.eurodite.culture.init;

import grimhart.eurodite.culture.Reference;
import grimhart.eurodite.culture.items.ItemTinIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static Item tinIngot;
	public static Item tinBag;
	
	public static void init() {
		tinIngot = new ItemTinIngot("tin_ingot");
		tinBag = new ItemTinIngot("bag_ingot");
	}
	public static void register() {
		registerItem(tinIngot);
		registerItem(tinBag);
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(tinIngot);
		registerRender(tinBag);
	}
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
