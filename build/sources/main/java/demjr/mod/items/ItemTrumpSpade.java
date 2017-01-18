package demjr.mod.items;

import demjr.mod.Reference;
import demjr.mod.Reference.ModItems;
import net.minecraft.item.ItemSpade;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpSpade extends ItemSpade {

    public ItemTrumpSpade(ToolMaterial material){
        super(material);
        setRegistryName(Reference.ModItems.TRUMPSPADE.getRegistryName());
        setUnlocalizedName(Reference.ModItems.TRUMPSPADE.getUnlocalizedName());
    }

}
