package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;

public class ItemFlour extends Item {
	
	public ItemFlour() {
		
		setUnlocalizedName(Reference.ModItems.FLOUR.getUnlocalizedName());
		setRegistryName(Reference.ModItems.FLOUR.getRegistryName());
		setCreativeTab(DEMJR.CREATIVE_TAB);
		
	}

}
