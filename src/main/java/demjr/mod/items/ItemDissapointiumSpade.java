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
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMSPADE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMSPADE.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}
