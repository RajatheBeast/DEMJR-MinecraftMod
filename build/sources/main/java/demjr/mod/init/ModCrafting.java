package demjr.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.salt), "SSS", "SSS", "SSS", 'S', ModItems.salt);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), Items.WHEAT);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough), ModItems.flour, Items.WATER_BUCKET, ModItems.salt);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cookiedough), ModItems.dough, ModItems.chocolatechips);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chocolatechips), new ItemStack(Items.DYE, 1, 3), Items.SUGAR);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.applepie), ModItems.dough, Items.EGG, Items.APPLE);
	}
	
}
