package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemChocolateChips extends ItemFood {
	
	public ItemChocolateChips() {
		super(1, 0.2F, false);
		setUnlocalizedName(Reference.ModItems.CHOCOLATECHIPS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CHOCOLATECHIPS.getRegistryName());
		setCreativeTab(DEMJR.CREATIVE_TAB);

	}

}
