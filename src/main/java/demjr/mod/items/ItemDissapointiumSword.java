package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.item.ItemSword;

/**
 * Created by Dawson on 2017-01-18.
 */
public class ItemDissapointiumSword extends ItemSword {

    public ItemDissapointiumSword(ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMSWORD.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMSWORD.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);
    }
}