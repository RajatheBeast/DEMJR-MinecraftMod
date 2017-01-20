package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemHoe;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpHoe extends ItemHoe{

    public ItemTrumpHoe(ToolMaterial material){
        super(material);
        setRegistryName(Reference.ModItems.TRUMPHOE.getRegistryName());
        setUnlocalizedName(Reference.ModItems.TRUMPHOE.getUnlocalizedName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }


}
