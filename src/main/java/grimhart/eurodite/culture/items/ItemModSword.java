package grimhart.eurodite.culture.items;

import grimhart.eurodite.culture.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;

public class ItemModSword extends ItemSword{

	public ItemModSword(ToolMaterial material, String unlocalizedName) {
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		}
}