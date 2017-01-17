package grimhart.aota;

import grimhart.aota.init.ModTools;
import grimhart.aota.handlers.RecipeHandler;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
import grimhart.aota.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import javax.annotation.Nonnull;

@Mod(modid = Reference.MODID, name = Reference.NAME)
public class AOTA {
	@Mod.Instance(Reference.MODID)
	public static AOTA instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final CreativeTabs tabEurodite = new CreativeTabs(Reference.MODID+"_eurodite") {
		@Nonnull
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModArmour.EuroditeHelmet);
		}
	};
	
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