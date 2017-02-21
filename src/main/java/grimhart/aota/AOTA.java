package grimhart.aota;

import grimhart.aota.entity.EntityFairy;
import grimhart.aota.handlers.RecipeHandler;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
import grimhart.aota.init.ModTools;
import grimhart.aota.network.AOTAGuiHandler;
import grimhart.aota.network.CommonProxy;
import grimhart.aota.network.PacketDispatcher;
import grimhart.aota.trading.AOTATradeRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod(modid = Reference.MODID, name = Reference.NAME)
public class AOTA {
    @Mod.Instance(Reference.MODID)
    public static AOTA instance;

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs tabEurodite = new CreativeTabs(Reference.MODID + "_eurodite") {
        @Nonnull
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModArmour.EuroditeHelmet);
        }
    };

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        PacketDispatcher.registerPackets();
        ModItems.init();
        ModItems.register();
        ModTools.init();
        ModTools.register();
        ModArmour.init();
        ModArmour.register();
        AOTATradeRegistry.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new AOTAGuiHandler());

        int eid = -1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":fairy"), EntityFairy.class, "fairy", ++eid, instance, 32, 2, false, 12564905, 9413987);

        proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        RecipeHandler.registerCraftingRecipes();
    }

    public static void logInfo(Object log) {
        logger.info(log);
    }

    public static void logDebug(Object log) {
        logger.debug(log);
    }

    public static void logError(Object log) {
        logger.error(log);
    }

    public static void logTrace(Object log) {
        logger.trace(log);
    }

    public static void logWarn(Object log) {
        logger.warn(log);
    }
}