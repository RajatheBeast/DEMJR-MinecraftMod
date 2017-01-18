package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Dawson on 2017-01-18.
 */
public class ItemDissapointiumPickaxe extends ItemPickaxe {

    public ItemDissapointiumPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMPICKAXE.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }

}
