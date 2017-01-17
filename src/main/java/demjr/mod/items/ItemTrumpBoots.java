package demjr.mod.items;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Elliott on 2017-01-16.
 */
public class ItemTrumpBoots extends ItemArmor {

    public ItemTrumpBoots(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPBOOTS.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPBOOTS.getRegistryName());
        setCreativeTab(DEMJR.CREATIVE_TAB);

    }

}
