package grimhart.eurodite.culture.items;

import grimhart.eurodite.culture.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe{

	protected ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
	super (material);
	this.setUnlocalizedName(unlocalizedName);
	this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
}
