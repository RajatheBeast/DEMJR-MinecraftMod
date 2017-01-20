package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;

public class ItemCementPowder extends Item {
	
	public ItemCementPowder() {
		
		setUnlocalizedName(Reference.ModItems.CEMENTPOWDER.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CEMENTPOWDER.getRegistryName());
		setCreativeTab(DEMJR.CREATIVE_TAB);
		
	}
	
}
