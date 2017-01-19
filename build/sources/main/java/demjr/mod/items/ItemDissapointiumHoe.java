package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import scala.swing.SingleRefCollection;

/**
 * Created by Dawson on 2017-01-18.
 */
public class ItemDissapointiumHoe extends ItemHoe {

    public ItemDissapointiumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMHOE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMHOE.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}
