package demjr.mod.items;

import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpChestplate extends ItemArmor {

    public ItemTrumpChestplate(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPCHEST.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPCHEST.getRegistryName());

    }

}
