package demjr.mod.items;

import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpHelmet extends ItemArmor {

    public ItemTrumpHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPHELMET.getRegistryName());

    }

}
