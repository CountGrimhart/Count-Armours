package grimhart.aota.proxy;

import grimhart.aota.client.rendering.FairyRenderFactory;
import grimhart.aota.entity.EntityFairy;
import grimhart.aota.init.ModTools;
import grimhart.aota.client.model.ModelKettleArmor;
import grimhart.aota.init.ModArmour;
import grimhart.aota.init.ModItems;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModArmour.registerRenders();

		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new FairyRenderFactory());
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
