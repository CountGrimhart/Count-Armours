package grimhart.aota.init;

import grimhart.aota.Reference;
import grimhart.aota.items.ItemGeneric;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static Item trading_token;
	public static Item tokenBag;
	
	public static void init() {
		trading_token = new ItemGeneric("trading_token");
		tokenBag = new ItemGeneric("bag_ingot");
	}
	public static void register() {
		registerItem(trading_token);
		registerItem(tokenBag);
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(trading_token);
		registerRender(tokenBag);
	}
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
