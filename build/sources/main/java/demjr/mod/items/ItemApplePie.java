package demjr.mod.items;

import demjr.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemApplePie extends ItemFood {

public ItemApplePie() {
	super(8, 0.3F, false);	
	setUnlocalizedName(Reference.ModItems.APPLEPIE.getUnlocalizedName());
	setRegistryName(Reference.ModItems.APPLEPIE.getRegistryName());
		
	}
}
