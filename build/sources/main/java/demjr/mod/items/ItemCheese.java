package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemFood;

/**
 * Created by Dawson on 2017-01-19.
 */
public class ItemCheese extends ItemFood {
public ItemCheese() {
    super(4, 0.3F, false);
    setUnlocalizedName(Reference.ModItems.CHEESE.getUnlocalizedName());
    setRegistryName(Reference.ModItems.CHEESE.getRegistryName());
    setCreativeTab(DEMJR.CREATIVE_TAB);
}
}
