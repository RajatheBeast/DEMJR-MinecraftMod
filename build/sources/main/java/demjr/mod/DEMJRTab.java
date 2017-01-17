package demjr.mod;

import demjr.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Elliott on 2017-01-17.
 */
public class DEMJRTab extends CreativeTabs {

    public DEMJRTab(){
        super("tabDEMJR");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.trumpgem;
    }

}
