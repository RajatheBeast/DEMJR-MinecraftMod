package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;

public class ItemSalt extends Item {
	
	public ItemSalt() {
		
		setUnlocalizedName(Reference.ModItems.SALT.getUnlocalizedName());
		setRegistryName(Reference.ModItems.SALT.getRegistryName());
		setCreativeTab(DEMJR.CREATIVE_TAB);
		
	}

}
