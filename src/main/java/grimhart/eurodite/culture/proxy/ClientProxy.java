package grimhart.eurodite.culture.proxy;

import grimhart.eurodite.culture.init.ModArmour;
import grimhart.eurodite.culture.init.ModItems;
import grimhart.eurodite.culture.init.ModTools;

public class ClientProxy extends CommonProxy {

	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModArmour.registerRenders();
	
	
	}
}
