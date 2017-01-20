package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Elliott on 2017-01-18.
 */
public class ItemDissapointiumCrystal extends Item {

    public ItemDissapointiumCrystal() {

        setRegistryName(Reference.ModItems.DISSAPOINTIUMCRYSTAL.getRegistryName());
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMCRYSTAL.getUnlocalizedName());
        setCreativeTab(DEMJR.CREATIVE_TAB);

    }

}
