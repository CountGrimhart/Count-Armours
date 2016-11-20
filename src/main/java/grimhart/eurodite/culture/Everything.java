package grimhart.eurodite.culture;

import grimhart.eurodite.culture.handlers.RecipeHandler;
import grimhart.eurodite.culture.init.ModArmour;
import grimhart.eurodite.culture.init.ModItems;
import grimhart.eurodite.culture.init.ModTools;
import grimhart.eurodite.culture.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Everything {
	@Mod.Instance(Reference.MODID)
	public static Everything instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		ModTools.init();
		ModTools.register();
		ModArmour.init();
		ModArmour.register();
		
		proxy.registerRenders();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		RecipeHandler.registerCraftingRecipes();
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
	}
}