package demjr.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Created by Elliott on 2017-01-11.
 */
public class ModSmelting {
    public static void register() {
        GameRegistry.addSmelting(ModItems.dough, new ItemStack(Items.BREAD), 6);
        GameRegistry.addSmelting(ModItems.cookiedough, new ItemStack(Items.COOKIE, 16), 62500);
    }

}
