package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemAxe;

/**
 * Created by Dawson on 2017-01-18.
 */
public class ItemDissapointiumAxe extends ItemAxe {

    public ItemDissapointiumAxe(ToolMaterial material, float damage, float speed) {
        super (material, damage, speed);
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMAXE.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}
