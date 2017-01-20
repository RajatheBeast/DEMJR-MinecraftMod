package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Matthew on 2017-01-19.
 */
public class ItemDissapointiumHelmet extends ItemArmor {

    public ItemDissapointiumHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.DISSAPOINTIUMHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DISSAPOINTIUMHELMET.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);

    }

}
