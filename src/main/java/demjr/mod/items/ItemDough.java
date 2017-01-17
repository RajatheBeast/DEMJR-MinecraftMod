package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;

import net.minecraft.item.Item;

public class ItemDough extends Item {

	public ItemDough() {
		
		setUnlocalizedName(Reference.ModItems.DOUGH.getUnlocalizedName());
		setRegistryName(Reference.ModItems.DOUGH.getRegistryName());
		setCreativeTab(DEMJR.CREATIVE_TAB);
		
	}
	
}
