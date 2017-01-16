package demjr.mod.items;

import demjr.mod.Reference;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpPickaxe extends ItemPickaxe{

    public ItemTrumpPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPPICKAXE.getRegistryName());
    }

}
