package grimhart.eurodite.culture.proxy;

import grimhart.eurodite.culture.client.model.ModelKettleArmor;
import grimhart.eurodite.culture.init.ModArmour;
import grimhart.eurodite.culture.init.ModItems;
import grimhart.eurodite.culture.init.ModTools;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModArmour.registerRenders();
	}

	@Override
	public ModelBiped getArmorModel(int id) {
		switch(id){
			case 0:
			default:
				return new ModelKettleArmor(1.0F);
		}
	}
}
