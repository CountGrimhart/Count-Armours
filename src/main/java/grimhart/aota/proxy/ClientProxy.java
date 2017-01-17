package grimhart.aota.proxy;

import grimhart.aota.init.ModTools;
import grimhart.aota.client.model.ModelKettleArmor;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
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
