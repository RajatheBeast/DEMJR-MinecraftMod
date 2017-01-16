package demjr.mod.items;

import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Elliott on 2017-01-13.
 */
public class ItemTrumpHelmet extends ItemArmor {

    public ItemTrumpHelmet(ArmorMaterial material){
        super(material, 1, EntityEquipmentSlot.HEAD);
        setUnlocalizedName(Reference.ModItems.TRUMPHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPHELMET.getRegistryName());

    }

}
