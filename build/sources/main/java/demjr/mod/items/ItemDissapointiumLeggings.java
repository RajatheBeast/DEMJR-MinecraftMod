package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Matthew on 2017-01-19.
 */
public class ItemDissapointiumLeggings extends ItemArmor {

    public ItemDissapointiumLeggings(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPHELMET.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);

    }

}
