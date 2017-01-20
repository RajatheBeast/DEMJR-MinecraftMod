package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemAxe;

/**
 * Created by Elliott on 2017-01-17.
 */
public class ItemTrumpAxe extends ItemAxe {

    public ItemTrumpAxe(ToolMaterial material, float damage, float speed){
        super(material, damage, speed);
        setRegistryName(Reference.ModItems.TRUMPAXE.getRegistryName());
        setUnlocalizedName(Reference.ModItems.TRUMPAXE.getUnlocalizedName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }

}
