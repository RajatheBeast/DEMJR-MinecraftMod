package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;

/**
 * Created by Dawson on 2017-01-19.
 */
public class ItemTomato extends ItemFood {
public ItemTomato() {
    super(6, 0.3F, false);
    setUnlocalizedName(Reference.ModItems.TOMATO.getUnlocalizedName());
    setRegistryName(Reference.ModItems.TOMATO.getRegistryName());
    setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}
