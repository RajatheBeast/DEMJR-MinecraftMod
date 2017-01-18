package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

/**
 * Created by Dawson on 2017-01-18.
 */
public class ItemDissapointiumSpade extends ItemSpade {

    public ItemDissapointiumSpade(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.ModItems..getUnlocalizedName());
        setRegistryName(Reference.ModItems..getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}
